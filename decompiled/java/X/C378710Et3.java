package X;

/* JADX INFO: renamed from: X.0Et3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378710Et3 {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C378710Et3() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromptItem(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C378710Et3(int i) {
        this(-1, "", "");
    }

    public C378710Et3(Integer num, String str, String str2) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
