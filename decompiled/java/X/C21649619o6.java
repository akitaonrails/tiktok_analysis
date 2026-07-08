package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: X.19o6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21649619o6 extends C21649119o1 implements InterfaceC21650319oD {
    public C21649419o4 LLIZLLLIL;
    public float LLJ;
    public final LinkedHashSet<InterfaceC21650419oE> LLJI;

    @Override // X.C21649119o1
    public final C21649019o0 LIZ() {
        C21649419o4 c21649419o4 = new C21649419o4(new C21649319o3(), getContext());
        this.LLIZLLLIL = c21649419o4;
        return c21649419o4;
    }

    @Override // X.C21649119o1
    public final C21648919nz LIZJ() {
        final C21649419o4 c21649419o4 = this.LLIZLLLIL;
        if (c21649419o4 == null) {
            c21649419o4 = null;
        }
        return new C21648919nz(c21649419o4) { // from class: X.19oA
            public final C21649419o4 LLILLL;

            {
                super(c21649419o4);
                this.LLILLL = c21649419o4;
            }

            @Override // X.C21648919nz, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.LLILLL.LLJLL == 3) {
                    return false;
                }
                super.onFling(motionEvent, motionEvent2, f, f2);
                return false;
            }
        };
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.InterfaceC21650319oD
    public final void LIZIZ(InterfaceC21650419oE interfaceC21650419oE) {
        this.LLJI.add(interfaceC21650419oE);
    }

    @Override // X.InterfaceC21650319oD
    public final void LJ(InterfaceC21650419oE interfaceC21650419oE) {
        this.LLJI.remove(interfaceC21650419oE);
    }

    public final void LJI(InterfaceC1765420w2e... interfaceC1765420w2eArr) {
        C21649419o4 c21649419o4;
        ArrayList arrayList = new ArrayList();
        int length = interfaceC1765420w2eArr.length;
        int i = 0;
        while (true) {
            c21649419o4 = null;
            if (i >= length) {
                break;
            }
            InterfaceC1765420w2e interfaceC1765420w2e = interfaceC1765420w2eArr[i];
            C21649419o4 c21649419o42 = this.LLIZLLLIL;
            if (c21649419o42 != null) {
                c21649419o4 = c21649419o42;
            }
            if (!((List) c21649419o4.LLLF.getValue()).contains(interfaceC1765420w2e)) {
                arrayList.add(interfaceC1765420w2e);
            }
            i++;
        }
        C21649419o4 c21649419o43 = this.LLIZLLLIL;
        if (c21649419o43 != null) {
            c21649419o4 = c21649419o43;
        }
        ((List) c21649419o4.LLLF.getValue()).addAll(arrayList);
    }

    @Override // X.C21649119o1, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // X.InterfaceC21650319oD
    public void setDragTransitionEnabled(boolean z) {
        C21649419o4 c21649419o4 = this.LLIZLLLIL;
        if (c21649419o4 == null) {
            c21649419o4 = null;
        }
        c21649419o4.LLJLILLLLZIIL = z;
    }

    @Override // X.InterfaceC21650319oD
    public void setMaxDragTransitionFactor(float f) {
        C21649419o4 c21649419o4 = this.LLIZLLLIL;
        if (c21649419o4 == null) {
            c21649419o4 = null;
        }
        c21649419o4.LLJZIJLIL = f;
    }

    public C21649619o6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21649619o6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJI = new LinkedHashSet<>();
        InterfaceC21650419oE interfaceC21650419oE = new InterfaceC21650419oE() { // from class: X.19o8
            @Override // X.InterfaceC21650419oE
            public final void gA(int i2) {
                Iterator<InterfaceC21650419oE> it2 = this.LL.LLJI.iterator();
                while (it2.hasNext()) {
                    it2.next().gA(i2);
                }
            }

            @Override // X.InterfaceC21650419oE
            public final void xP(int i2) {
                Iterator<InterfaceC21650419oE> it2 = this.LL.LLJI.iterator();
                while (it2.hasNext()) {
                    it2.next().xP(i2);
                }
            }

            @Override // X.InterfaceC21650419oE
            public final void kG(float f, int i2) {
                Iterator<InterfaceC21650419oE> it2 = this.LL.LLJI.iterator();
                while (it2.hasNext()) {
                    it2.next().kG(f, i2);
                }
                if (i2 == 3) {
                    this.LL.LLJ = f;
                    return;
                }
                if (i2 != 2 || this.LL.LLJ <= 0.0f) {
                    return;
                }
                C21649619o6 c21649619o6 = this.LL;
                float f2 = (1 / c21649619o6.LLJ) * f;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21649619o6);
                c21649619o6.setAlpha(f2);
            }
        };
        C21649419o4 c21649419o4 = this.LLIZLLLIL;
        (c21649419o4 == null ? null : c21649419o4).LIZIZ(interfaceC21650419oE);
    }
}
