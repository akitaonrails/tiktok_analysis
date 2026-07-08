package X;

/* JADX INFO: renamed from: X.141R, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C141R extends C1BJO {
    public static final C141S Companion = new Object() { // from class: X.141S
    };
    public static final long serialVersionUID = 1;
    public final int LL;
    public final String LLILLJJLI;

    @Override // X.C1BJO, java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{FacebookDialogException: ");
        sbLIZ.append("errorCode: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", message: ");
        sbLIZ.append(getMessage());
        sbLIZ.append(", url: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getFailingUrl() {
        return this.LLILLJJLI;
    }

    public C141R(String str, int i, String str2) {
        super(str);
        this.LL = i;
        this.LLILLJJLI = str2;
    }
}
