package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC799870VZh {
    public static final EnumC799870VZh APP_BACKGROUND;
    public static final EnumC799870VZh BACKGROUND;
    public static final EnumC799870VZh BOOT_FINISH;
    public static final EnumC799870VZh FIRST_WINDOW_FOCUS;
    public static final EnumC799870VZh IDLE;
    public static final /* synthetic */ EnumC799870VZh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC799870VZh MAIN;
    public static final EnumC799870VZh SPARSE;

    public static InterfaceC2044707zh<EnumC799870VZh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC799870VZh enumC799870VZh = new EnumC799870VZh("MAIN", 0);
        MAIN = enumC799870VZh;
        EnumC799870VZh enumC799870VZh2 = new EnumC799870VZh("BACKGROUND", 1);
        BACKGROUND = enumC799870VZh2;
        EnumC799870VZh enumC799870VZh3 = new EnumC799870VZh("FIRST_WINDOW_FOCUS", 2);
        FIRST_WINDOW_FOCUS = enumC799870VZh3;
        EnumC799870VZh enumC799870VZh4 = new EnumC799870VZh("SPARSE", 3);
        SPARSE = enumC799870VZh4;
        EnumC799870VZh enumC799870VZh5 = new EnumC799870VZh("BOOT_FINISH", 4);
        BOOT_FINISH = enumC799870VZh5;
        EnumC799870VZh enumC799870VZh6 = new EnumC799870VZh("APP_BACKGROUND", 5);
        APP_BACKGROUND = enumC799870VZh6;
        EnumC799870VZh enumC799870VZh7 = new EnumC799870VZh("IDLE", 6);
        IDLE = enumC799870VZh7;
        EnumC799870VZh[] enumC799870VZhArr = {enumC799870VZh, enumC799870VZh2, enumC799870VZh3, enumC799870VZh4, enumC799870VZh5, enumC799870VZh6, enumC799870VZh7};
        LL = enumC799870VZhArr;
        LLILLJJLI = new C2254308sP(enumC799870VZhArr);
    }

    public static EnumC799870VZh[] values() {
        return (EnumC799870VZh[]) LL.clone();
    }

    public static EnumC799870VZh valueOf(String str) {
        return (EnumC799870VZh) C08FF.LIZ(EnumC799870VZh.class, str);
    }

    public EnumC799870VZh(String str, int i) {
    }
}
