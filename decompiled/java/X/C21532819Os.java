package X;

/* JADX INFO: renamed from: X.19Os, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21532819Os implements Comparable<C21532819Os> {
    public int LL;
    public int LLILLJJLI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Order{order=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C21532819Os c21532819Os) {
        C21532819Os c21532819Os2 = c21532819Os;
        int i = this.LLILLJJLI;
        int i2 = c21532819Os2.LLILLJJLI;
        if (i != i2) {
            return i - i2;
        }
        return this.LL - c21532819Os2.LL;
    }
}
