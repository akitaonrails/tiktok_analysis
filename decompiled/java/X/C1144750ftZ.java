package X;

/* JADX INFO: renamed from: X.0ftZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144750ftZ {
    public final C1144660ftQ LIZ;
    public final C1144670ftR LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifiedCardInfoWithParams(unifiedCardInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", messageParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isAnchorPresenter=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1144750ftZ(C1144660ftQ c1144660ftQ, C1144670ftR c1144670ftR, boolean z) {
        this.LIZ = c1144660ftQ;
        this.LIZIZ = c1144670ftR;
        this.LIZJ = z;
    }
}
