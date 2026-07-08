package X;

/* JADX INFO: renamed from: X.0a2Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C919690a2Z {
    public final Long LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestPermissionErrInfo(errCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errPrompt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", multiLiveType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C919690a2Z(int i, Long l, String str) {
        this.LIZ = l;
        this.LIZIZ = str;
        this.LIZJ = i;
    }
}
