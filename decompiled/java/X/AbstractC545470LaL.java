package X;

/* JADX INFO: renamed from: X.0LaL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC545470LaL {
    public String toString() {
        if (this instanceof C545500LaO) {
            return "Injected";
        }
        if (this instanceof C545490LaN) {
            return "Disabled";
        }
        if (!(this instanceof C545480LaM)) {
            throw new C1954807lC();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(");
        sbLIZ.append(((C545480LaM) this).LIZ.name());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
