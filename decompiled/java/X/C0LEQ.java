package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LEQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LEQ {
    public static final C0LEQ ALBUM_AUTH;
    public static final C0LEQ COMPRESS_SAVE;
    public static final C0LEQ FETCH_ASSET;
    public static final /* synthetic */ C0LEQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0LEQ RECORD_AUTH;

    public static InterfaceC2044707zh<C0LEQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0LEQ c0leq = new C0LEQ("RECORD_AUTH", 0);
        RECORD_AUTH = c0leq;
        C0LEQ c0leq2 = new C0LEQ("ALBUM_AUTH", 1);
        ALBUM_AUTH = c0leq2;
        C0LEQ c0leq3 = new C0LEQ("COMPRESS_SAVE", 2);
        COMPRESS_SAVE = c0leq3;
        C0LEQ c0leq4 = new C0LEQ("FETCH_ASSET", 3);
        FETCH_ASSET = c0leq4;
        C0LEQ[] c0leqArr = {c0leq, c0leq2, c0leq3, c0leq4};
        LL = c0leqArr;
        LLILLJJLI = new C2254308sP(c0leqArr);
    }

    public static C0LEQ[] values() {
        return (C0LEQ[]) LL.clone();
    }

    public static C0LEQ valueOf(String str) {
        return (C0LEQ) C08FF.LIZ(C0LEQ.class, str);
    }

    public C0LEQ(String str, int i) {
    }
}
