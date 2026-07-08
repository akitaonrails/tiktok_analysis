package X;

import android.graphics.Canvas;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0Ec6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368200Ec6 implements InterfaceC369200Edi, InterfaceC368600Eck {
    public final AbstractC368090Ebv LL;
    public final C368260EcC LLILLJJLI;

    @Override // X.InterfaceC368600Eck
    public final void LIZ() {
        this.LLILLJJLI.getClass();
    }

    @Override // X.InterfaceC368600Eck
    public final void LIZLLL() {
        this.LLILLJJLI.getClass();
        this.LL.postInvalidateOnAnimation();
    }

    @Override // X.InterfaceC369200Edi
    public final boolean LJ() {
        InterfaceC369170Edf frameDelegate = this.LL.getFrameDelegate();
        return frameDelegate != null && frameDelegate.LIZJ() && this.LL.LJII();
    }

    @Override // X.InterfaceC369200Edi
    public final int getItemHeight() {
        return this.LL.getMeasuredHeight();
    }

    @Override // X.InterfaceC369200Edi
    public final int getItemWidth() {
        return this.LL.getMeasuredWidth();
    }

    @Override // X.InterfaceC369200Edi
    public final void refresh() {
        this.LL.invalidate();
    }

    @Override // X.InterfaceC368600Eck
    public final void LIZIZ(NLETrackSlot nLETrackSlot) {
        C368260EcC c368260EcC = this.LLILLJJLI;
        c368260EcC.LJIIIIZZ = nLETrackSlot;
        c368260EcC.LIZ(nLETrackSlot);
        if (c368260EcC.LIZ.LJ()) {
            c368260EcC.LIZ.refresh();
        }
    }

    @Override // X.InterfaceC368600Eck
    public final void LIZJ(Canvas canvas) {
        this.LLILLJJLI.LIZJ(canvas);
    }

    public C368200Ec6(AbstractC368090Ebv abstractC368090Ebv, C19EG c19eg) {
        this.LL = abstractC368090Ebv;
        this.LLILLJJLI = new C368260EcC(this, c19eg, true);
        abstractC368090Ebv.setViewDrawerDelegate(this);
    }
}
