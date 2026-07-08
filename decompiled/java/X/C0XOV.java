package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XOV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XOV {
    public static final C0XOV APPLE;
    public static final C0XOV GMAIL;
    public static final /* synthetic */ C0XOV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0XOV MAILRU;
    public static final C0XOV MICROSOFT;
    public static final C0XOV MISC;
    public static final C0XOV NOT_APPLICABLE;
    public static final C0XOV YAHOO;
    public static final C0XOV YANDEX;

    public static InterfaceC2044707zh<C0XOV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0XOV c0xov = new C0XOV("NOT_APPLICABLE", 0);
        NOT_APPLICABLE = c0xov;
        C0XOV c0xov2 = new C0XOV("APPLE", 1);
        APPLE = c0xov2;
        C0XOV c0xov3 = new C0XOV("GMAIL", 2);
        GMAIL = c0xov3;
        C0XOV c0xov4 = new C0XOV("MAILRU", 3);
        MAILRU = c0xov4;
        C0XOV c0xov5 = new C0XOV("MICROSOFT", 4);
        MICROSOFT = c0xov5;
        C0XOV c0xov6 = new C0XOV("MISC", 5);
        MISC = c0xov6;
        C0XOV c0xov7 = new C0XOV("YAHOO", 6);
        YAHOO = c0xov7;
        C0XOV c0xov8 = new C0XOV("YANDEX", 7);
        YANDEX = c0xov8;
        C0XOV[] c0xovArr = {c0xov, c0xov2, c0xov3, c0xov4, c0xov5, c0xov6, c0xov7, c0xov8};
        LL = c0xovArr;
        LLILLJJLI = new C2254308sP(c0xovArr);
    }

    public static C0XOV[] values() {
        return (C0XOV[]) LL.clone();
    }

    public static C0XOV valueOf(String str) {
        return (C0XOV) C08FF.LIZ(C0XOV.class, str);
    }

    public C0XOV(String str, int i) {
    }
}
