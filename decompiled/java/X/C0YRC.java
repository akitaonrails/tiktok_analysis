package X;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YRC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YRC extends C0YUD {
    public final EnumC871430YGn LIZIZ;
    public final C0YHX LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(447));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1461));

    public final InterfaceC870630YDl LJIIJ() {
        return (InterfaceC870630YDl) this.LJ.getValue();
    }

    @Override // X.C0YUD
    public final void LIZJ() {
        LJIIJ().clear();
    }

    @Override // X.C0YUD
    public final List<String> LIZLLL() {
        return LJIIJ().LJJJLL();
    }

    @Override // X.C0YUD
    public final Pair<List<C0Y8T>, Boolean> LJ() {
        return LJIIJ().LLLILZLLLI();
    }

    @Override // X.C0YUD
    public final boolean LJFF() {
        return LJIIJ().isLoading();
    }

    @Override // X.C0YUD
    public final void LIZ(List<String> list) {
        C23250099c.LIZLLL((InterfaceC497601wk) this.LIZLLL.getValue(), null, null, new C0YRE(this, list, null), 3);
    }

    @Override // X.C0YUD
    public final void LIZIZ(List<String> list) {
        C23250099c.LIZLLL((InterfaceC497601wk) this.LIZLLL.getValue(), null, null, new C0YRD(this, list, null), 3);
    }

    @Override // X.C0YUD
    public final void LJII(Set set) {
        C23250099c.LIZLLL((InterfaceC497601wk) this.LIZLLL.getValue(), null, null, new C0YRB(this, "message_request_spam", null, set, null), 3);
    }

    @Override // X.C0YUD
    public final void LJIIIIZZ(C878600YdO c878600YdO) {
        LJIIJ().LLJLILLLLZIIL(c878600YdO);
    }

    @Override // X.C0YUD
    public final void LJIIIZ(C0Y9E c0y9e) {
        LJIIJ().LLJJJJ(c0y9e);
    }

    public C0YRC(EnumC871430YGn enumC871430YGn, C0YHX c0yhx) {
        this.LIZIZ = enumC871430YGn;
        this.LIZJ = c0yhx;
    }

    @Override // X.C0YUD
    public final void LJI(int i, C869380Y8q c869380Y8q) {
        LJIIJ().LJLJLJ(i, c869380Y8q);
    }
}
