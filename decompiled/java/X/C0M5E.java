package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M5E, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M5E {
    public static final C0M5E CREATION_EDIT_PAGE;
    public static final C0M5E DETAIL_PAGE;
    public static final /* synthetic */ C0M5E[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0M5E MIDDLE_PAGE;
    public static final C0M5E PROFILE_PAGE;
    public static final C0M5E STORY_IMMERSIVE_PAGE;

    public static InterfaceC2044707zh<C0M5E> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0M5E c0m5e = new C0M5E("MIDDLE_PAGE", 0);
        MIDDLE_PAGE = c0m5e;
        C0M5E c0m5e2 = new C0M5E("CREATION_EDIT_PAGE", 1);
        CREATION_EDIT_PAGE = c0m5e2;
        C0M5E c0m5e3 = new C0M5E("DETAIL_PAGE", 2);
        DETAIL_PAGE = c0m5e3;
        C0M5E c0m5e4 = new C0M5E("STORY_IMMERSIVE_PAGE", 3);
        STORY_IMMERSIVE_PAGE = c0m5e4;
        C0M5E c0m5e5 = new C0M5E("PROFILE_PAGE", 4);
        PROFILE_PAGE = c0m5e5;
        C0M5E[] c0m5eArr = {c0m5e, c0m5e2, c0m5e3, c0m5e4, c0m5e5};
        LL = c0m5eArr;
        LLILLJJLI = new C2254308sP(c0m5eArr);
    }

    public static C0M5E[] values() {
        return (C0M5E[]) LL.clone();
    }

    public static C0M5E valueOf(String str) {
        return (C0M5E) C08FF.LIZ(C0M5E.class, str);
    }

    public C0M5E(String str, int i) {
    }
}
