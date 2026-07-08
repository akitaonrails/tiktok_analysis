package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1134590fdB {
    public static final EnumC1134590fdB BALANCE_PAGE;
    public static final EnumC1134590fdB ENTER_ROOM;
    public static final EnumC1134590fdB GIFT_EXPIRED;
    public static final EnumC1134590fdB IM_REFRESH;
    public static final EnumC1134590fdB JSB;
    public static final /* synthetic */ EnumC1134590fdB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1134590fdB NEW_DAY_NO_CACHE;
    public static final EnumC1134590fdB NEXT_DAY_TASK_INFO;
    public static final EnumC1134590fdB OTHERS;
    public static final EnumC1134590fdB RECHARGE_SUCCESS;
    public static final EnumC1134590fdB TASK_EXPIRED;
    public static final EnumC1134590fdB TASK_START;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1134590fdB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1134590fdB enumC1134590fdB = new EnumC1134590fdB("ENTER_ROOM", 0, "enter_room");
        ENTER_ROOM = enumC1134590fdB;
        EnumC1134590fdB enumC1134590fdB2 = new EnumC1134590fdB("GIFT_EXPIRED", 1, "limited_gift_expired");
        GIFT_EXPIRED = enumC1134590fdB2;
        EnumC1134590fdB enumC1134590fdB3 = new EnumC1134590fdB("IM_REFRESH", 2, "im_refresh");
        IM_REFRESH = enumC1134590fdB3;
        EnumC1134590fdB enumC1134590fdB4 = new EnumC1134590fdB("NEXT_DAY_TASK_INFO", 3, "next_day_task_info");
        NEXT_DAY_TASK_INFO = enumC1134590fdB4;
        EnumC1134590fdB enumC1134590fdB5 = new EnumC1134590fdB("NEW_DAY_NO_CACHE", 4, "new_day_no_cache");
        NEW_DAY_NO_CACHE = enumC1134590fdB5;
        EnumC1134590fdB enumC1134590fdB6 = new EnumC1134590fdB("BALANCE_PAGE", 5, "balance_page");
        BALANCE_PAGE = enumC1134590fdB6;
        EnumC1134590fdB enumC1134590fdB7 = new EnumC1134590fdB("JSB", 6, "jsb");
        JSB = enumC1134590fdB7;
        EnumC1134590fdB enumC1134590fdB8 = new EnumC1134590fdB("TASK_START", 7, "task_start");
        TASK_START = enumC1134590fdB8;
        EnumC1134590fdB enumC1134590fdB9 = new EnumC1134590fdB("RECHARGE_SUCCESS", 8, "recharge_success");
        RECHARGE_SUCCESS = enumC1134590fdB9;
        EnumC1134590fdB enumC1134590fdB10 = new EnumC1134590fdB("TASK_EXPIRED", 9, "task_expired");
        TASK_EXPIRED = enumC1134590fdB10;
        EnumC1134590fdB enumC1134590fdB11 = new EnumC1134590fdB("OTHERS", 10, "others");
        OTHERS = enumC1134590fdB11;
        EnumC1134590fdB[] enumC1134590fdBArr = {enumC1134590fdB, enumC1134590fdB2, enumC1134590fdB3, enumC1134590fdB4, enumC1134590fdB5, enumC1134590fdB6, enumC1134590fdB7, enumC1134590fdB8, enumC1134590fdB9, enumC1134590fdB10, enumC1134590fdB11};
        LLILLJJLI = enumC1134590fdBArr;
        LLILLL = new C2254308sP(enumC1134590fdBArr);
    }

    public static EnumC1134590fdB[] values() {
        return (EnumC1134590fdB[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC1134590fdB valueOf(String str) {
        return (EnumC1134590fdB) C08FF.LIZ(EnumC1134590fdB.class, str);
    }

    public EnumC1134590fdB(String str, int i, String str2) {
        this.LL = str2;
    }
}
