package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ug3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC778330Ug3 {
    public static final EnumC778330Ug3 HIGH_TEMPERATURE_TIP;
    public static final /* synthetic */ EnumC778330Ug3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC778330Ug3 LOW_BATTERY_TIP;
    public static final EnumC778330Ug3 LOW_DEVICE_TIP;
    public static final EnumC778330Ug3 SAVE_MODE_TIP;

    public static InterfaceC2044707zh<EnumC778330Ug3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC778330Ug3 enumC778330Ug3 = new EnumC778330Ug3("LOW_DEVICE_TIP", 0);
        LOW_DEVICE_TIP = enumC778330Ug3;
        EnumC778330Ug3 enumC778330Ug32 = new EnumC778330Ug3("HIGH_TEMPERATURE_TIP", 1);
        HIGH_TEMPERATURE_TIP = enumC778330Ug32;
        EnumC778330Ug3 enumC778330Ug33 = new EnumC778330Ug3("LOW_BATTERY_TIP", 2);
        LOW_BATTERY_TIP = enumC778330Ug33;
        EnumC778330Ug3 enumC778330Ug34 = new EnumC778330Ug3("SAVE_MODE_TIP", 3);
        SAVE_MODE_TIP = enumC778330Ug34;
        EnumC778330Ug3[] enumC778330Ug3Arr = {enumC778330Ug3, enumC778330Ug32, enumC778330Ug33, enumC778330Ug34};
        LL = enumC778330Ug3Arr;
        LLILLJJLI = new C2254308sP(enumC778330Ug3Arr);
    }

    public static EnumC778330Ug3[] values() {
        return (EnumC778330Ug3[]) LL.clone();
    }

    public static EnumC778330Ug3 valueOf(String str) {
        return (EnumC778330Ug3) C08FF.LIZ(EnumC778330Ug3.class, str);
    }

    public EnumC778330Ug3(String str, int i) {
    }
}
