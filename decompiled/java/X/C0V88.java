package X;

/* JADX INFO: renamed from: X.0V88, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V88 implements Comparable {
    public final String LL;
    public final String LLILLJJLI;
    public final long LLILLL;
    public long LLILZIL = System.currentTimeMillis();
    public int LLILZ = 1;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.LLILLL;
        long j2 = ((C0V88) obj).LLILLL;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return 1;
        }
        return -1;
    }

    public C0V88(String str, long j, String str2) {
        this.LL = str;
        this.LLILLL = j;
        this.LLILLJJLI = str2;
    }
}
