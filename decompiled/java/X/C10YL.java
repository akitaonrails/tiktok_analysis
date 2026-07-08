package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10YL, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10YL {
    public static final /* synthetic */ C10YL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C10YL OpenPlatform;
    public static final C10YL Others;
    public static final C10YL Paid;
    public static final C10YL Post;
    public static final C10YL Seo;
    public static final C10YL Share;
    public static final C10YL Web;

    public static InterfaceC2044707zh<C10YL> getEntries() {
        return LLILLJJLI;
    }

    static {
        C10YL c10yl = new C10YL("Share", 0);
        Share = c10yl;
        C10YL c10yl2 = new C10YL("Paid", 1);
        Paid = c10yl2;
        C10YL c10yl3 = new C10YL("OpenPlatform", 2);
        OpenPlatform = c10yl3;
        C10YL c10yl4 = new C10YL("Post", 3);
        Post = c10yl4;
        C10YL c10yl5 = new C10YL("Seo", 4);
        Seo = c10yl5;
        C10YL c10yl6 = new C10YL("Web", 5);
        Web = c10yl6;
        C10YL c10yl7 = new C10YL("Others", 6);
        Others = c10yl7;
        C10YL[] c10ylArr = {c10yl, c10yl2, c10yl3, c10yl4, c10yl5, c10yl6, c10yl7};
        LL = c10ylArr;
        LLILLJJLI = new C2254308sP(c10ylArr);
    }

    public static C10YL[] values() {
        return (C10YL[]) LL.clone();
    }

    public static C10YL valueOf(String str) {
        return (C10YL) C08FF.LIZ(C10YL.class, str);
    }

    public C10YL(String str, int i) {
    }
}
