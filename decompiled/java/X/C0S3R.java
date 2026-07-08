package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S3R, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S3R {
    public static final C0S3R END_TOUCH;
    public static final /* synthetic */ C0S3R[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0S3R START_TOUCH;

    public static InterfaceC2044707zh<C0S3R> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0S3R c0s3r = new C0S3R("START_TOUCH", 0);
        START_TOUCH = c0s3r;
        C0S3R c0s3r2 = new C0S3R("END_TOUCH", 1);
        END_TOUCH = c0s3r2;
        C0S3R[] c0s3rArr = {c0s3r, c0s3r2};
        LL = c0s3rArr;
        LLILLJJLI = new C2254308sP(c0s3rArr);
    }

    public static C0S3R[] values() {
        return (C0S3R[]) LL.clone();
    }

    public static C0S3R valueOf(String str) {
        return (C0S3R) C08FF.LIZ(C0S3R.class, str);
    }

    public C0S3R(String str, int i) {
    }
}
