package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.117I, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C117I implements C117D {
    public final C19EG LIZ;
    public final C117J LIZIZ;
    public final C01GW LIZJ;

    @Override // X.C117D
    public final void LIZIZ() {
    }

    @Override // X.C117D
    public final void LIZLLL() {
    }

    @Override // X.C117D
    public final void LJ() {
    }

    @Override // X.C117D
    public final void LJFF() {
    }

    @Override // X.C117D
    public final void onCreate() {
    }

    @Override // X.C117D
    public final void onDestroy() {
    }

    @Override // X.C117D
    public final void onPause() {
    }

    @Override // X.C117D
    public final void onResume() {
    }

    @Override // X.C117D
    public final void LIZ() {
        C117J c117j = this.LIZIZ;
        if (c117j != null) {
            c117j.IB(false);
        }
    }

    @Override // X.C117D
    public final void LIZJ() {
        C117J c117j = this.LIZIZ;
        if (c117j != null) {
            c117j.IB(true);
        }
    }

    public C117I(C19EG c19eg, C117J c117j) {
        this.LIZ = c19eg;
        this.LIZIZ = c117j;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(478));
        this.LIZJ = c01gwLIZIZ;
        C19EG c19eg2 = this.LIZ;
        if (c19eg2 != null) {
            ((C117C) c01gwLIZIZ.getValue()).LIZJ(new WeakReference<>(c19eg2));
            ((ArrayList) ((C117C) c01gwLIZIZ.getValue()).LIZ).add(this);
        }
    }
}
