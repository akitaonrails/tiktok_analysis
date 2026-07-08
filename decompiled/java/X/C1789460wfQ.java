package X;

import java.util.List;

/* JADX INFO: renamed from: X.0wfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1789460wfQ {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final List<String> LJ;
    public final EnumC1780720wRK LJFF;

    public C1789460wfQ() {
        this(0L, null, null, null, 63);
    }

    public C1789460wfQ(long j, String str, List list, EnumC1780720wRK enumC1780720wRK, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? null : "", 0L, (i & 16) != 0 ? C13BV.INSTANCE : list, (i & 32) != 0 ? EnumC1780720wRK.SUBSCRIPTION : enumC1780720wRK);
    }

    public C1789460wfQ(long j, String str, String str2, long j2, List<String> list, EnumC1780720wRK enumC1780720wRK) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = j2;
        this.LJ = list;
        this.LJFF = enumC1780720wRK;
    }
}
