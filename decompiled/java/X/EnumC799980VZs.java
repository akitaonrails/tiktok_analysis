package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VZs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC799980VZs {
    public static final EnumC799980VZs INFLATE;
    public static final /* synthetic */ EnumC799980VZs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC799980VZs REQUEST_BOOT_FINISH;
    public static final EnumC799980VZs REQUEST_IDLE;
    public static final EnumC799980VZs REQUEST_NORMAL;
    public static final EnumC799980VZs REQUEST_P0;
    public static final EnumC799980VZs TASK_APP_BACKGROUND;
    public static final EnumC799980VZs TASK_BACKGROUND;
    public static final EnumC799980VZs TASK_BOOT_FINISH;
    public static final EnumC799980VZs TASK_FIRST_WINDOW_FOCUS;
    public static final EnumC799980VZs TASK_IDLE;
    public static final EnumC799980VZs TASK_MAIN;
    public static final EnumC799980VZs TASK_SPARSE;

    public static InterfaceC2044707zh<EnumC799980VZs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC799980VZs enumC799980VZs = new EnumC799980VZs("TASK_MAIN", 0);
        TASK_MAIN = enumC799980VZs;
        EnumC799980VZs enumC799980VZs2 = new EnumC799980VZs("TASK_BACKGROUND", 1);
        TASK_BACKGROUND = enumC799980VZs2;
        EnumC799980VZs enumC799980VZs3 = new EnumC799980VZs("TASK_FIRST_WINDOW_FOCUS", 2);
        TASK_FIRST_WINDOW_FOCUS = enumC799980VZs3;
        EnumC799980VZs enumC799980VZs4 = new EnumC799980VZs("TASK_SPARSE", 3);
        TASK_SPARSE = enumC799980VZs4;
        EnumC799980VZs enumC799980VZs5 = new EnumC799980VZs("TASK_BOOT_FINISH", 4);
        TASK_BOOT_FINISH = enumC799980VZs5;
        EnumC799980VZs enumC799980VZs6 = new EnumC799980VZs("TASK_APP_BACKGROUND", 5);
        TASK_APP_BACKGROUND = enumC799980VZs6;
        EnumC799980VZs enumC799980VZs7 = new EnumC799980VZs("TASK_IDLE", 6);
        TASK_IDLE = enumC799980VZs7;
        EnumC799980VZs enumC799980VZs8 = new EnumC799980VZs("REQUEST_P0", 7);
        REQUEST_P0 = enumC799980VZs8;
        EnumC799980VZs enumC799980VZs9 = new EnumC799980VZs("REQUEST_NORMAL", 8);
        REQUEST_NORMAL = enumC799980VZs9;
        EnumC799980VZs enumC799980VZs10 = new EnumC799980VZs("REQUEST_BOOT_FINISH", 9);
        REQUEST_BOOT_FINISH = enumC799980VZs10;
        EnumC799980VZs enumC799980VZs11 = new EnumC799980VZs("REQUEST_IDLE", 10);
        REQUEST_IDLE = enumC799980VZs11;
        EnumC799980VZs enumC799980VZs12 = new EnumC799980VZs("INFLATE", 11);
        INFLATE = enumC799980VZs12;
        EnumC799980VZs[] enumC799980VZsArr = {enumC799980VZs, enumC799980VZs2, enumC799980VZs3, enumC799980VZs4, enumC799980VZs5, enumC799980VZs6, enumC799980VZs7, enumC799980VZs8, enumC799980VZs9, enumC799980VZs10, enumC799980VZs11, enumC799980VZs12};
        LL = enumC799980VZsArr;
        LLILLJJLI = new C2254308sP(enumC799980VZsArr);
    }

    public static EnumC799980VZs[] values() {
        return (EnumC799980VZs[]) LL.clone();
    }

    public static EnumC799980VZs valueOf(String str) {
        return (EnumC799980VZs) C08FF.LIZ(EnumC799980VZs.class, str);
    }

    public EnumC799980VZs(String str, int i) {
    }
}
