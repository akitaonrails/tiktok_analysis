package X;

/* JADX INFO: renamed from: X.0Vks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C806800Vks extends RuntimeException {
    public C806800Vks(String str) {
        this("Big Bitmap Check Custom Exception", str);
    }

    public C806800Vks(String str, String str2) {
        super(str, new Throwable(str2));
    }
}
