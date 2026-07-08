package X;

/* JADX INFO: renamed from: X.0I8J, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I8J {
    public final String LIZ;
    public final C0I8P LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifyQuotedAndReplyPreview(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", media=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", titleWithName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I8J(String str, C0I8P c0i8p, String str2) {
        this.LIZ = str;
        this.LIZIZ = c0i8p;
        this.LIZJ = str2;
    }
}
