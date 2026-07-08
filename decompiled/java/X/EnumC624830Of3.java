package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Of3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC624830Of3 {
    public static final /* synthetic */ EnumC624830Of3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC624830Of3 NETWORK_NO_TOAST;
    public static final EnumC624830Of3 NETWORK_WIFI_TOAST;
    public static final EnumC624830Of3 STORAGE_FULL_TOAST;
    public final String LL;

    public EnumC624830Of3() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC624830Of3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC624830Of3 enumC624830Of3 = new EnumC624830Of3("STORAGE_FULL_TOAST", 0);
        STORAGE_FULL_TOAST = enumC624830Of3;
        EnumC624830Of3 enumC624830Of32 = new EnumC624830Of3("NETWORK_NO_TOAST", 1);
        NETWORK_NO_TOAST = enumC624830Of32;
        EnumC624830Of3 enumC624830Of33 = new EnumC624830Of3("NETWORK_WIFI_TOAST", 2);
        NETWORK_WIFI_TOAST = enumC624830Of33;
        EnumC624830Of3[] enumC624830Of3Arr = {enumC624830Of3, enumC624830Of32, enumC624830Of33};
        LLILLJJLI = enumC624830Of3Arr;
        LLILLL = new C2254308sP(enumC624830Of3Arr);
    }

    public static EnumC624830Of3[] values() {
        return (EnumC624830Of3[]) LLILLJJLI.clone();
    }

    public final String getMobName() {
        return this.LL;
    }

    public static EnumC624830Of3 valueOf(String str) {
        return (EnumC624830Of3) C08FF.LIZ(EnumC624830Of3.class, str);
    }

    public EnumC624830Of3(String str, int i) {
        this.LL = "";
    }
}
