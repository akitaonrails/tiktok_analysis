package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1902760zcA {
    public static final EnumC1902760zcA BACK_TO_FRONT;
    public static final EnumC1902760zcA ENTER_CREATED;
    public static final EnumC1902760zcA INBOX_BACKGROUND_REFRESH;
    public static final /* synthetic */ EnumC1902760zcA[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1902760zcA NOTICE_COUNT_KEEP_ALIVE;
    public static final EnumC1902760zcA OTHERS_REFRESH;
    public static final EnumC1902760zcA PRELOAD;
    public static final EnumC1902760zcA PULL_DOWN_REFRESH;
    public static final EnumC1902760zcA SWITCH_TAB_REFRESH;
    public final String LL;
    public final boolean LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1902760zcA> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1902760zcA enumC1902760zcA = new EnumC1902760zcA("PULL_DOWN_REFRESH", 0, "pull_down_refresh", true);
        PULL_DOWN_REFRESH = enumC1902760zcA;
        EnumC1902760zcA enumC1902760zcA2 = new EnumC1902760zcA("SWITCH_TAB_REFRESH", 1, "switch_tab_refresh", true);
        SWITCH_TAB_REFRESH = enumC1902760zcA2;
        int i = 2;
        EnumC1902760zcA enumC1902760zcA3 = new EnumC1902760zcA("PRELOAD", i, "preload", i);
        PRELOAD = enumC1902760zcA3;
        int i2 = 3;
        EnumC1902760zcA enumC1902760zcA4 = new EnumC1902760zcA("NOTICE_COUNT_KEEP_ALIVE", i2, "notice_count_keep_alive", i);
        NOTICE_COUNT_KEEP_ALIVE = enumC1902760zcA4;
        EnumC1902760zcA enumC1902760zcA5 = new EnumC1902760zcA("BACK_TO_FRONT", 4, "back_to_front", i);
        BACK_TO_FRONT = enumC1902760zcA5;
        EnumC1902760zcA enumC1902760zcA6 = new EnumC1902760zcA("INBOX_BACKGROUND_REFRESH", 5, "inbox_background_refresh", i);
        INBOX_BACKGROUND_REFRESH = enumC1902760zcA6;
        EnumC1902760zcA enumC1902760zcA7 = new EnumC1902760zcA("ENTER_CREATED", 6, "enter_created", true);
        ENTER_CREATED = enumC1902760zcA7;
        EnumC1902760zcA enumC1902760zcA8 = new EnumC1902760zcA("OTHERS_REFRESH", 7, (String) null, i2);
        OTHERS_REFRESH = enumC1902760zcA8;
        EnumC1902760zcA[] enumC1902760zcAArr = {enumC1902760zcA, enumC1902760zcA2, enumC1902760zcA3, enumC1902760zcA4, enumC1902760zcA5, enumC1902760zcA6, enumC1902760zcA7, enumC1902760zcA8};
        LLILLL = enumC1902760zcAArr;
        LLILZ = new C2254308sP(enumC1902760zcAArr);
    }

    public static EnumC1902760zcA[] values() {
        return (EnumC1902760zcA[]) LLILLL.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public final boolean isActiveRefresh() {
        return this.LLILLJJLI;
    }

    public static EnumC1902760zcA valueOf(String str) {
        return (EnumC1902760zcA) C08FF.LIZ(EnumC1902760zcA.class, str);
    }

    public /* synthetic */ EnumC1902760zcA(String str, int i, String str2, int i2) {
        this(str, i, (i2 & 1) != 0 ? "" : str2, false);
    }

    public EnumC1902760zcA(String str, int i, String str2, boolean z) {
        this.LL = str2;
        this.LLILLJJLI = z;
    }
}
