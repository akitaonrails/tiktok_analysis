package X;

/* JADX INFO: renamed from: X.10cA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC1841100y0i
public final class C19282410cA {
    public static final C19282710cD Companion = new C19282710cD();
    public long LIZ;
    public String LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;

    public C19282410cA() {
        this(0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final EnumC19282510cB LIZ() {
        C19282810cE c19282810cE = EnumC19282510cB.Companion;
        String str = this.LIZJ;
        c19282810cE.getClass();
        if (str != null) {
            switch (str.hashCode()) {
                case -1986416409:
                    if (str.equals("NORMAL")) {
                        return EnumC19282510cB.NORMAL;
                    }
                    break;
                case -1922727970:
                    if (str.equals("LOW_ACTIVE_30_2")) {
                        return EnumC19282510cB.LOW_ACTIVE_30_2;
                    }
                    break;
                case -1922727963:
                    if (str.equals("LOW_ACTIVE_30_9")) {
                        return EnumC19282510cB.LOW_ACTIVE_30_9;
                    }
                    break;
                case -176102187:
                    if (str.equals("RECORD_LESS_30")) {
                        return EnumC19282510cB.RECORD_LESS_30;
                    }
                    break;
                case 696297850:
                    if (str.equals("RETURN_USER")) {
                        return EnumC19282510cB.RETURN_USER;
                    }
                    break;
            }
        }
        return EnumC19282510cB.NORMAL;
    }

    public C19282410cA(int i) {
        this.LIZ = 0L;
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = 0;
    }

    public /* synthetic */ C19282410cA(int i, long j, String str, String str2, int i2, int i3, int i4, int i5) {
        if (0 == 0) {
            this.LIZ = (i & 1) == 0 ? 0L : j;
            if ((i & 2) == 0) {
                this.LIZIZ = "";
            } else {
                this.LIZIZ = str;
            }
            if ((i & 4) == 0) {
                this.LIZJ = "";
            } else {
                this.LIZJ = str2;
            }
            if ((i & 8) == 0) {
                this.LIZLLL = 0;
            } else {
                this.LIZLLL = i2;
            }
            if ((i & 16) == 0) {
                this.LJ = 0;
            } else {
                this.LJ = i3;
            }
            if ((i & 32) == 0) {
                this.LJFF = 0;
            } else {
                this.LJFF = i4;
            }
            if ((i & 64) == 0) {
                this.LJI = 0;
                return;
            } else {
                this.LJI = i5;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, C13IK.LIZ.getDescriptor());
        throw null;
    }
}
