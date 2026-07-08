package X;

import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0c4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997890c4h implements InterfaceC998100c52<InterfaceC997360c3q> {
    public final InterfaceC997360c3q LL;
    public final TuxIconView LLILLJJLI;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public C997890c4h(C997900c4i c997900c4i) {
        this.LL = c997900c4i;
        this.LLILLJJLI = (TuxIconView) c997900c4i.LIZ.findViewById(R.id.a7z);
    }

    @Override // X.InterfaceC998100c52
    public final void LLLIIL(int i) {
        C997370c3r.LIZ(this, i);
    }

    @Override // X.InterfaceC998100c52
    public final void XV1(int i) {
        C997370c3r.LIZIZ(this, i);
    }

    @Override // X.InterfaceC998100c52
    public final void m61(float f) {
        C786410Ut5.Fb(this.LLILLJJLI, f);
    }

    @Override // X.InterfaceC998100c52
    public final void setBackgroundColor(int i) {
        ((InterfaceC997360c3q) Mh()).LJIJI().setBackgroundColor(i);
    }

    @Override // X.InterfaceC998100c52
    public final void setVisibility(int i) {
        C997370c3r.LIZJ(this, 0);
    }
}
