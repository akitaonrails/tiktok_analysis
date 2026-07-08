package X;

/* JADX INFO: renamed from: X.0Is3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480010Is3<T> implements C09JN {
    public static final C480010Is3<T> LL = new C480010Is3<>();

    @Override // X.C09JN
    public final void accept(Object obj) {
        C1C7U.LIZ("BackgroundTimeCounter@143e.start$1");
        if (((C606810Nr5) obj).LIZIZ) {
            C480000Is2.LIZIZ = System.currentTimeMillis();
        } else if (C480000Is2.LIZIZ > 0) {
            C480000Is2.LIZ += System.currentTimeMillis() - C480000Is2.LIZIZ;
            C480000Is2.LIZIZ = 0L;
        }
        C1C7U.LIZIZ("BackgroundTimeCounter@143e.start$1");
    }
}
