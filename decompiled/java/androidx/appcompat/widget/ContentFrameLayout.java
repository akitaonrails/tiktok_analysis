package androidx.appcompat.widget;

import X.C19V6;
import X.C19WF;
import X.C19WR;
import X.C19WZ;
import X.InterfaceC21551819Wa;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegateImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue LL;
    public TypedValue LLILLJJLI;
    public TypedValue LLILLL;
    public TypedValue LLILZ;
    public TypedValue LLILZIL;
    public TypedValue LLILZLL;
    public final Rect LLIZ;
    public InterfaceC21551819Wa LLIZLLLIL;

    public TypedValue getFixedHeightMajor() {
        if (this.LLILZIL == null) {
            this.LLILZIL = new TypedValue();
        }
        return this.LLILZIL;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.LLILZLL == null) {
            this.LLILZLL = new TypedValue();
        }
        return this.LLILZLL;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.LLILLL == null) {
            this.LLILLL = new TypedValue();
        }
        return this.LLILLL;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.LLILZ == null) {
            this.LLILZ = new TypedValue();
        }
        return this.LLILZ;
    }

    public TypedValue getMinWidthMajor() {
        if (this.LL == null) {
            this.LL = new TypedValue();
        }
        return this.LL;
    }

    public TypedValue getMinWidthMinor() {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new TypedValue();
        }
        return this.LLILLJJLI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC21551819Wa interfaceC21551819Wa = this.LLIZLLLIL;
        if (interfaceC21551819Wa != null) {
            interfaceC21551819Wa.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC21551819Wa interfaceC21551819Wa = this.LLIZLLLIL;
        if (interfaceC21551819Wa != null) {
            AppCompatDelegateImpl appCompatDelegateImpl = ((C19WZ) interfaceC21551819Wa).LIZ;
            C19WR c19wr = appCompatDelegateImpl.LLJJIJI;
            if (c19wr != null) {
                c19wr.LJIIIIZZ();
            }
            if (appCompatDelegateImpl.LLJJJJ != null) {
                appCompatDelegateImpl.LLJILJIL.getDecorView().removeCallbacks(appCompatDelegateImpl.LLJJJJJIL);
                if (appCompatDelegateImpl.LLJJJJ.isShowing()) {
                    try {
                        appCompatDelegateImpl.LLJJJJ.dismiss();
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                appCompatDelegateImpl.LLJJJJ = null;
            }
            C19WF c19wf = appCompatDelegateImpl.LLJJJJLIIL;
            if (c19wf != null) {
                c19wf.LIZIZ();
            }
            C19V6 c19v6 = appCompatDelegateImpl.LJJJJL(0).LJII;
            if (c19v6 != null) {
                c19v6.LIZJ(true);
            }
        }
    }

    public void setAttachListener(InterfaceC21551819Wa interfaceC21551819Wa) {
        this.LLIZLLLIL = interfaceC21551819Wa;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZ = new Rect();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }
}
