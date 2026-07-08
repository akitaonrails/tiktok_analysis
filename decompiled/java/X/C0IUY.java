package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0IUY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IUY implements InterfaceC466760ISc {
    public boolean LIZ;

    @Override // X.InterfaceC466760ISc
    public final void LIZ(Throwable th) {
        C0IUW.LIZLLL = null;
        C0IUW.LJ = -1L;
        InterfaceC467290IUd interfaceC467290IUd = C0IUW.LIZ;
        if (interfaceC467290IUd != null) {
            interfaceC467290IUd.LIZ(th);
        }
        C0IUW.LIZ(true);
    }

    @Override // X.InterfaceC466760ISc
    public final void LIZIZ(C0ITP c0itp) {
        if (this.LIZ && c0itp != null) {
            C784440Upu.LIZ().LIZIZ(new C467300IUe(c0itp));
            C0IUW.LIZ(true);
            return;
        }
        if (C0IUW.LIZ != null) {
            C0IUW.LIZLLL = null;
            C0IUW.LJ = -1L;
            InterfaceC467290IUd interfaceC467290IUd = C0IUW.LIZ;
            if (interfaceC467290IUd != null) {
                interfaceC467290IUd.LIZIZ(c0itp, C0IUW.LJFF);
            }
        } else {
            C0IUW.LJ = SystemClock.uptimeMillis();
            C0IUW.LIZLLL = c0itp;
        }
        C0IUW.LIZ(true);
    }
}
