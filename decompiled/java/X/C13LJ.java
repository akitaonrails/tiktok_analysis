package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.13LJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13LJ extends C20004613Oy {
    public static final ConcurrentHashMap<String, C13LH> LJIIIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C13LH> LJIIJ = new ConcurrentHashMap<>();

    @Override // X.C20004613Oy, X.InterfaceC20004513Ox
    public final void clear() {
        super.clear();
        LJIIIZ.clear();
        LJIIJ.clear();
    }

    @Override // X.C20004613Oy, X.InterfaceC20004513Ox
    public final String LJIIJJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(C13SB.LIZ);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C13LJ(C13RD c13rd, String str, int i, long j) {
        super(str, i, j, null, false, null, c13rd.LJIIIIZZ, 116);
    }
}
