package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HHW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HHW {
    public static final C0HHW DISPLAY_BACKGROUND;
    public static final C0HHW DOWNLOAD_CARD;
    public static final C0HHW DOWNLOAD_MASK;
    public static final C0HHW DOWNLOAD_STATIC_BACKGROUND;
    public static final C0HHW DYNAMIC_AVATAR;
    public static final /* synthetic */ C0HHW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HHW STATIC_AVATAR;

    public static InterfaceC2044707zh<C0HHW> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HHW c0hhw = new C0HHW("DISPLAY_BACKGROUND", 0);
        DISPLAY_BACKGROUND = c0hhw;
        C0HHW c0hhw2 = new C0HHW("DOWNLOAD_CARD", 1);
        DOWNLOAD_CARD = c0hhw2;
        C0HHW c0hhw3 = new C0HHW("DOWNLOAD_MASK", 2);
        DOWNLOAD_MASK = c0hhw3;
        C0HHW c0hhw4 = new C0HHW("DYNAMIC_AVATAR", 3);
        DYNAMIC_AVATAR = c0hhw4;
        C0HHW c0hhw5 = new C0HHW("DOWNLOAD_STATIC_BACKGROUND", 4);
        DOWNLOAD_STATIC_BACKGROUND = c0hhw5;
        C0HHW c0hhw6 = new C0HHW("STATIC_AVATAR", 5);
        STATIC_AVATAR = c0hhw6;
        C0HHW[] c0hhwArr = {c0hhw, c0hhw2, c0hhw3, c0hhw4, c0hhw5, c0hhw6};
        LL = c0hhwArr;
        LLILLJJLI = new C2254308sP(c0hhwArr);
    }

    public static C0HHW[] values() {
        return (C0HHW[]) LL.clone();
    }

    public static C0HHW valueOf(String str) {
        return (C0HHW) C08FF.LIZ(C0HHW.class, str);
    }

    public C0HHW(String str, int i) {
    }
}
