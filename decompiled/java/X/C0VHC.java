package X;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: renamed from: X.0VHC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VHC implements C0VHD {
    public final InterfaceC787600Uv0 LIZ;
    public final C0VHB LIZIZ;
    public final InterfaceC794970VGl LIZJ;

    static {
        C0VI8.LIZIZ("WMFgUpdater");
    }

    public C0VHC(WorkDatabase workDatabase, C0VHB c0vhb, InterfaceC787600Uv0 interfaceC787600Uv0) {
        this.LIZIZ = c0vhb;
        this.LIZ = interfaceC787600Uv0;
        this.LIZJ = workDatabase.LJIIIIZZ();
    }
}
