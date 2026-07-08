package X;

/* JADX INFO: renamed from: X.0VN7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VN7 implements Comparable<C0VN7> {
    public final int LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    @Override // java.lang.Comparable
    public final int compareTo(C0VN7 c0vn7) {
        C0VN7 c0vn72 = c0vn7;
        int i = this.LL - c0vn72.LL;
        if (i == 0) {
            return this.LLILLJJLI - c0vn72.LLILLJJLI;
        }
        return i;
    }

    public C0VN7(int i, int i2, String str, String str2) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = str;
        this.LLILZ = str2;
    }
}
