package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0Shy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C728560Shy extends C1260870iur<C1252490ihL, InterfaceC728550Shx> {
    @Override // X.C1260870iur
    public final void LJIILIIL() {
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC728550Shx) k).LJ();
        }
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public void onSuccess() {
        T t;
        K k = this.LLILLJJLI;
        if (k == 0 || (t = this.LL) == 0) {
            return;
        }
        ((InterfaceC728550Shx) k).G90((Pair) t.getData());
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public void onFailed(Exception exc) {
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC728550Shx) k).qJ1(exc);
        }
    }
}
