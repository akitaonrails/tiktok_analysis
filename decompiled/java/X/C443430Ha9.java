package X;

/* JADX INFO: renamed from: X.0Ha9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443430Ha9 {
    public final C443490HaF LIZ;
    public final String LIZIZ;
    public final C443450HaB LIZJ;

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerticalUIInfo(uiInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", highLightText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", highLightTextColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C443430Ha9(C443490HaF c443490HaF, String str, C443450HaB c443450HaB) {
        this.LIZ = c443490HaF;
        this.LIZIZ = str;
        this.LIZJ = c443450HaB;
    }
}
