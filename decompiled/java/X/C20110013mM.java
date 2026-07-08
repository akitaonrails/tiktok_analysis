package X;

import Y.ARunnableS99S0200000_30;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AwS431S0200000_30;

/* JADX INFO: renamed from: X.13mM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20110013mM implements InterfaceC20110513mR {
    public boolean LIZ;
    public boolean LIZJ;
    public final Executor LJ;
    public final InterfaceC1888707aX LJFF;
    public final InterfaceC20108913mB LJI;
    public final ConcurrentHashMap<String, C20110113mN> LIZIZ = new ConcurrentHashMap<>();
    public String LIZLLL = "";

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c4 A[EDGE_INSN: B:87:0x00c4->B:39:0x00c4 BREAK  A[LOOP:1: B:14:0x004a->B:88:?], SYNTHETIC] */
    @Override // X.InterfaceC20110513mR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.util.Collection<X.C20109313mF>, java.util.SortedMap<java.lang.String, java.lang.String>> LIZ(X.C20110413mQ r17) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20110013mM.LIZ(X.13mQ):kotlin.Pair");
    }

    public final void LIZIZ(AwS431S0200000_30 awS431S0200000_30) {
        if (this.LIZ) {
            awS431S0200000_30.invoke();
        } else {
            this.LJ.execute(new ARunnableS99S0200000_30(this, awS431S0200000_30, 30));
        }
    }

    public C20110013mM(Executor executor, InterfaceC1888707aX interfaceC1888707aX, InterfaceC20108913mB interfaceC20108913mB) {
        this.LJ = executor;
        this.LJFF = interfaceC1888707aX;
        this.LJI = interfaceC20108913mB;
    }
}
