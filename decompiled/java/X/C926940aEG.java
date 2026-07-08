package X;

/* JADX INFO: renamed from: X.0aEG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926940aEG {
    public EnumC926990aEL LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public C926940aEG() {
        this((EnumC926990aEL) null, 0, 7);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenMultiGuestModeratorsManageDialogInfo(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", applyPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", applyingGuide=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C926940aEG(EnumC926990aEL enumC926990aEL, int i, int i2) {
        this((i2 & 1) != 0 ? null : enumC926990aEL, (i2 & 2) != 0 ? -1 : i, false);
    }

    public C926940aEG(EnumC926990aEL enumC926990aEL, int i, boolean z) {
        this.LIZ = enumC926990aEL;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
