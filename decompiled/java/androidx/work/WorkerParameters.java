package androidx.work;

import X.C0VHC;
import X.C0VHD;
import X.C0VHV;
import X.C0VHW;
import X.C795380VIa;
import X.InterfaceC787600Uv0;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes14.dex */
public final class WorkerParameters {
    public final UUID LIZ;
    public final C795380VIa LIZIZ;
    public final Executor LIZJ;
    public final InterfaceC787600Uv0 LIZLLL;
    public final C0VHW LJ;
    public final C0VHD LJFF;

    public WorkerParameters(UUID uuid, C795380VIa c795380VIa, Collection collection, Executor executor, InterfaceC787600Uv0 interfaceC787600Uv0, C0VHV c0vhv, C0VHC c0vhc) {
        this.LIZ = uuid;
        this.LIZIZ = c795380VIa;
        new HashSet(collection);
        this.LIZJ = executor;
        this.LIZLLL = interfaceC787600Uv0;
        this.LJ = c0vhv;
        this.LJFF = c0vhc;
    }
}
