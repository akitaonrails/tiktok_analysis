package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0ka0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1324820ka0 extends SmartImageView {
    public final boolean LLIZLLLIL;
    public final CopyOnWriteArrayList<InterfaceC1324830ka1> LLJ;

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        boolean zLJI = MethodIDManager.LJI(71635);
        super.onAttachedToWindow();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public C1324820ka0(Context context) {
        boolean z;
        super(context);
        if (C293930Bfb.LIZIZ && C20562515d9.LIZLLL) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
        this.LLJ = new CopyOnWriteArrayList<>();
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setAdaptionViewChangeListener(InterfaceC1324830ka1 interfaceC1324830ka1) {
        if (!this.LLIZLLLIL || interfaceC1324830ka1 == null) {
            return;
        }
        this.LLJ.add(interfaceC1324830ka1);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (((View) getParent()).getId() == R.id.video_adapted_wrapper_container) {
            C786410Ut5.Jc((View) getParent(), f);
        } else {
            super.setTranslationX(f);
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        if (((View) getParent()).getId() == R.id.video_adapted_wrapper_container) {
            C786410Ut5.ed((View) getParent(), f);
        } else {
            super.setTranslationY(f);
        }
    }

    public C1324820ka0(Context context, AttributeSet attributeSet) {
        boolean z;
        super(context, attributeSet);
        if (C293930Bfb.LIZIZ && C20562515d9.LIZLLL) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
        this.LLJ = new CopyOnWriteArrayList<>();
    }

    @Override // X.C1322090kVb, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (!this.LLIZLLLIL) {
            return;
        }
        Iterator<InterfaceC1324830ka1> it2 = this.LLJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(view);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.LLIZLLLIL) {
            return;
        }
        Iterator<InterfaceC1324830ka1> it2 = this.LLJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.LLIZLLLIL) {
            return;
        }
        Iterator<InterfaceC1324830ka1> it2 = this.LLJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }
}
