package X;

/* JADX INFO: renamed from: X.0HpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452860HpM {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public C452860HpM() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C452860HpM)) {
            return false;
        }
        C452860HpM c452860HpM = (C452860HpM) obj;
        return this.LIZ == c452860HpM.LIZ && this.LIZIZ == c452860HpM.LIZIZ && this.LIZJ == c452860HpM.LIZJ && this.LIZLLL == c452860HpM.LIZLLL && this.LJ == c452860HpM.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisibilityInputState(isKeyboardShowing=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isPanelShowing=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isInputEmpty=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isMentionPanelShowing=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isVoiceRecording=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C452860HpM(int i) {
        this(false, false, true, false, false);
    }

    public C452860HpM(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = z5;
    }
}
