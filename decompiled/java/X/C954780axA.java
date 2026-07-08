package X;

/* JADX INFO: renamed from: X.0axA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954780axA {
    public final C914780Zue LIZ;
    public final EnumC969200bKQ LIZIZ;
    public final EnumC969200bKQ LIZJ;
    public final EnumC2231781CWq LIZLLL;
    public final C969700bLE LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkStateChangeContext(linkState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", newState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", oldState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", triggerEvent=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", triggerUserLinkStateContext=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C954780axA(C914780Zue c914780Zue, EnumC969200bKQ enumC969200bKQ, EnumC969200bKQ enumC969200bKQ2, EnumC2231781CWq enumC2231781CWq, C969700bLE c969700bLE) {
        this.LIZ = c914780Zue;
        this.LIZIZ = enumC969200bKQ;
        this.LIZJ = enumC969200bKQ2;
        this.LIZLLL = enumC2231781CWq;
        this.LJ = c969700bLE;
    }
}
