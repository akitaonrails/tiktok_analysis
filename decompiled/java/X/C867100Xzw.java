package X;

/* JADX INFO: renamed from: X.0Xzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867100Xzw {
    public final String LIZ;
    public final C0YMW LIZIZ;
    public final C867350Y0v LIZJ;

    public C867100Xzw() {
        this(null, null, null, 7);
    }

    public C867100Xzw(String str, C0YMW c0ymw, C867350Y0v c867350Y0v, int i) {
        str = (i & 1) != 0 ? null : str;
        c0ymw = (i & 2) != 0 ? null : c0ymw;
        c867350Y0v = (i & 4) != 0 ? new C867350Y0v("imsdk_group_chat_leave") : c867350Y0v;
        this.LIZ = str;
        this.LIZIZ = c0ymw;
        this.LIZJ = c867350Y0v;
    }
}
