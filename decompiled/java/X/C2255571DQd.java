package X;

/* JADX INFO: renamed from: X.1DQd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255571DQd {
    public static final C2255571DQd LIZJ = new C2255571DQd(EnumC2257241DWo.none, null);
    public static final C2255571DQd LIZLLL = new C2255571DQd(EnumC2257241DWo.xMidYMid, EnumC2249811D3z.meet);
    public final EnumC2257241DWo LIZ;
    public final EnumC2249811D3z LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2255571DQd.class != obj.getClass()) {
            return false;
        }
        C2255571DQd c2255571DQd = (C2255571DQd) obj;
        if (this.LIZ == c2255571DQd.LIZ && this.LIZIZ == c2255571DQd.LIZIZ) {
            return true;
        }
        return false;
    }

    public C2255571DQd(EnumC2257241DWo enumC2257241DWo, EnumC2249811D3z enumC2249811D3z) {
        this.LIZ = enumC2257241DWo;
        this.LIZIZ = enumC2249811D3z;
    }
}
