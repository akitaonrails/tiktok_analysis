package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M5B, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M5B {
    public static final C0M5B CREATION_EDIT_PAGE;
    public static final C0M5B DETAIL_PAGE;
    public static final /* synthetic */ C0M5B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0M5B MIDDLE_PAGE;
    public static final C0M5B PROFILE_PAGE;
    public static final C0M5B STORY_IMMERSIVE_PAGE;

    public static InterfaceC2044707zh<C0M5B> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0M5B c0m5b = new C0M5B("MIDDLE_PAGE", 0);
        MIDDLE_PAGE = c0m5b;
        C0M5B c0m5b2 = new C0M5B("CREATION_EDIT_PAGE", 1);
        CREATION_EDIT_PAGE = c0m5b2;
        C0M5B c0m5b3 = new C0M5B("DETAIL_PAGE", 2);
        DETAIL_PAGE = c0m5b3;
        C0M5B c0m5b4 = new C0M5B("STORY_IMMERSIVE_PAGE", 3);
        STORY_IMMERSIVE_PAGE = c0m5b4;
        C0M5B c0m5b5 = new C0M5B("PROFILE_PAGE", 4);
        PROFILE_PAGE = c0m5b5;
        C0M5B[] c0m5bArr = {c0m5b, c0m5b2, c0m5b3, c0m5b4, c0m5b5};
        LL = c0m5bArr;
        LLILLJJLI = new C2254308sP(c0m5bArr);
    }

    public static C0M5B[] values() {
        return (C0M5B[]) LL.clone();
    }

    public static C0M5B valueOf(String str) {
        return (C0M5B) C08FF.LIZ(C0M5B.class, str);
    }

    public C0M5B(String str, int i) {
    }
}
