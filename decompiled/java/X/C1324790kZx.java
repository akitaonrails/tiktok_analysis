package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;

/* JADX INFO: renamed from: X.0kZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1324790kZx extends C1322110kVd {
    public boolean LL;

    public C1324790kZx(Context context) {
        super(context);
        this.LL = true;
    }

    public final void LIZJ(boolean z) {
        Animatable animatableLIZ;
        try {
            InterfaceC1320850kTb controller = getController();
            if (controller == null || (animatableLIZ = controller.LIZ()) == null) {
                return;
            }
            if (z && this.LL) {
                animatableLIZ.start();
            } else {
                animatableLIZ.stop();
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z = false;
        if (i == 0 && getVisibility() == 0) {
            z = true;
        }
        LIZJ(z);
    }

    @Override // X.C1322090kVb
    public void setController(InterfaceC1320850kTb interfaceC1320850kTb) {
        super.setController(interfaceC1320850kTb);
    }

    public void setEnableAnimation(boolean z) {
        this.LL = z;
    }

    public C1324790kZx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = true;
    }

    @Override // X.C1322090kVb, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        LIZJ(z);
    }

    public final void LIZ(Uri uri, boolean z, C1320700kTM c1320700kTM, Object obj) {
        C1325710kbR[] c1325710kbRArr;
        if (uri != null) {
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.LIZIZ(1);
            imageDecodeOptionsBuilder.LJ = false;
            C1329360khK c1329360khK = new C1329360khK(imageDecodeOptionsBuilder);
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
            c1325700kbQLIZLLL.LJFF = c1329360khK;
            C1324750kZt.LJIILL(c1325700kbQLIZLLL);
            c1325710kbRArr = new C1325710kbR[]{c1325700kbQLIZLLL.LIZ()};
        } else {
            c1325710kbRArr = null;
        }
        C1324780kZw.LIZ(this, c1325710kbRArr, c1320700kTM, z, obj);
    }
}
