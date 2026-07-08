package X;

/* JADX INFO: renamed from: X.11Yj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19519511Yj {
    public final EnumC19520711Yv LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final EnumC361800EGk LIZLLL;
    public final EnumC1782890wUp LJ;

    public C19519511Yj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19519511Yj)) {
            return false;
        }
        C19519511Yj c19519511Yj = (C19519511Yj) obj;
        return this.LIZ == c19519511Yj.LIZ && this.LIZIZ == c19519511Yj.LIZIZ && this.LIZJ == c19519511Yj.LIZJ && this.LIZLLL == c19519511Yj.LIZLLL && this.LJ == c19519511Yj.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        EnumC361800EGk enumC361800EGk = this.LIZLLL;
        return ((iHashCode + (enumC361800EGk == null ? 0 : enumC361800EGk.hashCode())) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProVoiceClonePanelSceneState(panelMode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isPlayingAudio=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showSettingPupMenu=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", vopAuditionMode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C19519511Yj(int i) {
        this(EnumC19520711Yv.HIDE, false, false, null, EnumC1782890wUp.INITIAL);
    }

    public C19519511Yj(EnumC19520711Yv enumC19520711Yv, boolean z, boolean z2, EnumC361800EGk enumC361800EGk, EnumC1782890wUp enumC1782890wUp) {
        this.LIZ = enumC19520711Yv;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = enumC361800EGk;
        this.LJ = enumC1782890wUp;
    }

    public static C19519511Yj LIZ(C19519511Yj c19519511Yj, EnumC19520711Yv enumC19520711Yv, boolean z, EnumC361800EGk enumC361800EGk, EnumC1782890wUp enumC1782890wUp, int i) {
        boolean z2;
        EnumC1782890wUp enumC1782890wUp2 = enumC1782890wUp;
        EnumC361800EGk enumC361800EGk2 = enumC361800EGk;
        boolean z3 = z;
        EnumC19520711Yv enumC19520711Yv2 = enumC19520711Yv;
        if ((i & 1) != 0) {
            enumC19520711Yv2 = c19519511Yj.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c19519511Yj.LIZIZ;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = c19519511Yj.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC361800EGk2 = c19519511Yj.LIZLLL;
        }
        if ((i & 16) != 0) {
            enumC1782890wUp2 = c19519511Yj.LJ;
        }
        c19519511Yj.getClass();
        return new C19519511Yj(enumC19520711Yv2, z2, z3, enumC361800EGk2, enumC1782890wUp2);
    }
}
