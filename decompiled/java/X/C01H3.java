package X;

/* JADX INFO: renamed from: X.01H3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01H3 {
    public final boolean LIZ;
    public final C01H9 LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaskOrderEventData(isShow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", liveShowUserListData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01H3(boolean z, C01H9 c01h9) {
        this.LIZ = z;
        this.LIZIZ = c01h9;
    }
}
