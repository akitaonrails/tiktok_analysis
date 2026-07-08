package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MGA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MGA {
    public static final C0MGA AISELF_TAB;
    public static final C0MGA ALBUM_AIME_IMAGE_TAB;
    public static final C0MGA EDITOR_TAB;
    public static final /* synthetic */ C0MGA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0MGA OTHER;

    public static InterfaceC2044707zh<C0MGA> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0MGA c0mga = new C0MGA("EDITOR_TAB", 0);
        EDITOR_TAB = c0mga;
        C0MGA c0mga2 = new C0MGA("AISELF_TAB", 1);
        AISELF_TAB = c0mga2;
        C0MGA c0mga3 = new C0MGA("ALBUM_AIME_IMAGE_TAB", 2);
        ALBUM_AIME_IMAGE_TAB = c0mga3;
        C0MGA c0mga4 = new C0MGA("OTHER", 3);
        OTHER = c0mga4;
        C0MGA[] c0mgaArr = {c0mga, c0mga2, c0mga3, c0mga4};
        LL = c0mgaArr;
        LLILLJJLI = new C2254308sP(c0mgaArr);
    }

    public static C0MGA[] values() {
        return (C0MGA[]) LL.clone();
    }

    public static C0MGA valueOf(String str) {
        return (C0MGA) C08FF.LIZ(C0MGA.class, str);
    }

    public C0MGA(String str, int i) {
    }
}
