package X;

/* JADX INFO: renamed from: X.0HPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC440540HPg {
    public int LIZ() {
        if (!C1948707kD.LIZ().isDebug()) {
            return 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An id type is expected for: ");
        sbLIZ.append(this);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
