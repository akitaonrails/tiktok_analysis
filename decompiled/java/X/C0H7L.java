package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0H7L, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0H7L extends C12MO {
    public C1320770kTT LLJLLL;

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJLLL.LJFF();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJLLL.LJI();
        C20597815iq.LIZ(this);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.LLJLLL.LJFF();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.LLJLLL.LJI();
    }

    @Override // X.C12MO, X.C12MM, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setImageRequest(C1325710kbR c1325710kbR) {
        final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(c1325710kbR, null);
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJIILJJIL = this.LLJLLL.LLILZIL;
        c1320810kTXLIZJ.LIZLLL = c1325710kbR;
        c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0Hdx
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJ(String str, Object obj, Animatable animatable) throws Throwable {
                C1323050kX9 c1323050kX9;
                Bitmap underlyingBitmap;
                try {
                    c1323050kX9 = (C1323050kX9) interfaceC1320200kSYLJI.getResult();
                    if (c1323050kX9 != null) {
                        try {
                            AbstractC1327750kej abstractC1327750kej = (AbstractC1327750kej) c1323050kX9.get();
                            if ((abstractC1327750kej instanceof C1325120kaU) && (underlyingBitmap = ((C1325120kaU) abstractC1327750kej).getUnderlyingBitmap()) != null) {
                                this.LIZJ.setImageBitmap(underlyingBitmap);
                            }
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    interfaceC1320200kSYLJI.close();
                                    C1323050kX9.LJII(c1323050kX9);
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    interfaceC1320200kSYLJI.close();
                    C1323050kX9.LJII(c1323050kX9);
                } catch (Throwable th3) {
                    th = th3;
                    c1323050kX9 = null;
                }
            }
        };
        this.LLJLLL.LJIIIIZZ(c1320810kTXLIZJ.LIZ());
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.LLJLLL.LIZLLL() && super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public C0H7L(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.LLJLLL == null) {
            this.LLJLLL = new C1320770kTT(new C1331090kk7(getResources()).LIZ());
        }
    }
}
