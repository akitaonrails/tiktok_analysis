package X;

/* JADX INFO: renamed from: X.0fki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139260fki extends C1139250fkh {
    public static final int $stable = 8;
    public final int LLILLJJLI;
    public final C1142890fqZ LLILLL;

    @Override // X.C1139250fkh, java.lang.Throwable
    public String getMessage() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLL);
        sbLIZ.append('\n');
        sbLIZ.append(super.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getErrorCode() {
        return this.LLILLJJLI;
    }

    public C1139260fki(String str, Throwable th, C1139230fkf c1139230fkf, int i, C1142890fqZ c1142890fqZ) {
        super(str, th, c1139230fkf);
        this.LLILLJJLI = i;
        this.LLILLL = c1142890fqZ;
    }
}
