package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1071120dyo {
    public static final /* synthetic */ EnumC1071120dyo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1071120dyo OTHERS;
    public static final EnumC1071120dyo SETTINGS_REMOVE;
    public static final EnumC1071120dyo SETTINGS_SYNC;

    public static InterfaceC2044707zh<EnumC1071120dyo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1071120dyo enumC1071120dyo = new EnumC1071120dyo("SETTINGS_SYNC", 0);
        SETTINGS_SYNC = enumC1071120dyo;
        EnumC1071120dyo enumC1071120dyo2 = new EnumC1071120dyo("SETTINGS_REMOVE", 1);
        SETTINGS_REMOVE = enumC1071120dyo2;
        EnumC1071120dyo enumC1071120dyo3 = new EnumC1071120dyo("OTHERS", 2);
        OTHERS = enumC1071120dyo3;
        EnumC1071120dyo[] enumC1071120dyoArr = {enumC1071120dyo, enumC1071120dyo2, enumC1071120dyo3};
        LL = enumC1071120dyoArr;
        LLILLJJLI = new C2254308sP(enumC1071120dyoArr);
    }

    public static EnumC1071120dyo[] values() {
        return (EnumC1071120dyo[]) LL.clone();
    }

    public static EnumC1071120dyo valueOf(String str) {
        return (EnumC1071120dyo) C08FF.LIZ(EnumC1071120dyo.class, str);
    }

    public EnumC1071120dyo(String str, int i) {
    }
}
