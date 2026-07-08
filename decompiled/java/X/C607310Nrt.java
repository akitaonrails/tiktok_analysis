package X;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Nrt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607310Nrt extends C607290Nrr {
    public static volatile boolean LJ;
    public final C054G LIZ = C2296808zG.LIZ(new C2232408os(C786410Ut5.h4()).plus(new C639070P4v(CoroutineExceptionHandler.LJJLIL, this, 2)));
    public final C19319410i8 LIZIZ = new C19319410i8("OfflineModeTask");
    public boolean LIZJ;
    public volatile C625960Ogs LIZLLL;

    public final void LIZLLL() {
        this.LIZJ = true;
        C23250099c.LIZLLL(this.LIZ, null, null, new C625940Ogq(this, null), 3);
    }

    @Override // X.C607290Nrr
    public final void LIZ(C607220Nrk c607220Nrk) {
        if (!this.LIZJ && c607220Nrk.LIZIZ == 4) {
            LIZLLL();
        }
    }

    @Override // X.C607290Nrr
    public final void LIZIZ(C607280Nrq c607280Nrq) {
        LIZLLL();
    }

    @Override // X.C607290Nrr
    public final void LIZJ(C607220Nrk c607220Nrk) {
        if (!this.LIZJ && c607220Nrk.LIZIZ == 4) {
            LIZLLL();
        }
    }
}
