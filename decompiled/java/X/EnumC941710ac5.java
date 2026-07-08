package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ac5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC941710ac5 {
    public static final EnumC941710ac5 DOWNGRADE_TO_TOAST;
    public static final EnumC941710ac5 EXIST_MUTEX_TASK;
    public static final EnumC941710ac5 FORCE_DESTROY;
    public static final EnumC941710ac5 HAS_NEW_MUTEX;
    public static final /* synthetic */ EnumC941710ac5[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC941710ac5 SCENE_MUTEX;
    public static final EnumC941710ac5 SUCCESS;
    public static final EnumC941710ac5 TIME_OUT;
    public static final EnumC941710ac5 USER_CANCEL;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC941710ac5> getEntries() {
        return LLILZ;
    }

    static {
        EnumC941710ac5 enumC941710ac5 = new EnumC941710ac5("SUCCESS", 0, 0, "success");
        SUCCESS = enumC941710ac5;
        EnumC941710ac5 enumC941710ac52 = new EnumC941710ac5("TIME_OUT", 1, 1, "time_out");
        TIME_OUT = enumC941710ac52;
        EnumC941710ac5 enumC941710ac53 = new EnumC941710ac5("HAS_NEW_MUTEX", 2, 2, "has_new_mutex");
        HAS_NEW_MUTEX = enumC941710ac53;
        EnumC941710ac5 enumC941710ac54 = new EnumC941710ac5("FORCE_DESTROY", 3, 3, "force_destroy");
        FORCE_DESTROY = enumC941710ac54;
        EnumC941710ac5 enumC941710ac55 = new EnumC941710ac5("EXIST_MUTEX_TASK", 4, 4, "exist_mutex_task");
        EXIST_MUTEX_TASK = enumC941710ac55;
        EnumC941710ac5 enumC941710ac56 = new EnumC941710ac5("SCENE_MUTEX", 5, 5, "scene_mutex");
        SCENE_MUTEX = enumC941710ac56;
        EnumC941710ac5 enumC941710ac57 = new EnumC941710ac5("USER_CANCEL", 6, 6, "user_cancel");
        USER_CANCEL = enumC941710ac57;
        EnumC941710ac5 enumC941710ac58 = new EnumC941710ac5("DOWNGRADE_TO_TOAST", 7, 7, "downgrade_to_toast");
        DOWNGRADE_TO_TOAST = enumC941710ac58;
        EnumC941710ac5[] enumC941710ac5Arr = {enumC941710ac5, enumC941710ac52, enumC941710ac53, enumC941710ac54, enumC941710ac55, enumC941710ac56, enumC941710ac57, enumC941710ac58};
        LLILLL = enumC941710ac5Arr;
        LLILZ = new C2254308sP(enumC941710ac5Arr);
    }

    public static EnumC941710ac5[] values() {
        return (EnumC941710ac5[]) LLILLL.clone();
    }

    public final int getReasonCode() {
        return this.LL;
    }

    public final String getReasonName() {
        return this.LLILLJJLI;
    }

    public static EnumC941710ac5 valueOf(String str) {
        return (EnumC941710ac5) C08FF.LIZ(EnumC941710ac5.class, str);
    }

    public EnumC941710ac5(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
