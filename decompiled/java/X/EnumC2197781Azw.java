package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Azw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2197781Azw {
    public static final EnumC2197781Azw EXCEPTION;
    public static final EnumC2197781Azw IAP;
    public static final /* synthetic */ EnumC2197781Azw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2197781Azw NETWORK;
    public static final EnumC2197781Azw NONE;
    public static final EnumC2197781Azw SERVER;

    public static InterfaceC2044707zh<EnumC2197781Azw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2197781Azw enumC2197781Azw = new EnumC2197781Azw("SERVER", 0);
        SERVER = enumC2197781Azw;
        EnumC2197781Azw enumC2197781Azw2 = new EnumC2197781Azw("NETWORK", 1);
        NETWORK = enumC2197781Azw2;
        EnumC2197781Azw enumC2197781Azw3 = new EnumC2197781Azw("IAP", 2);
        IAP = enumC2197781Azw3;
        EnumC2197781Azw enumC2197781Azw4 = new EnumC2197781Azw("EXCEPTION", 3);
        EXCEPTION = enumC2197781Azw4;
        EnumC2197781Azw enumC2197781Azw5 = new EnumC2197781Azw("NONE", 4);
        NONE = enumC2197781Azw5;
        EnumC2197781Azw[] enumC2197781AzwArr = {enumC2197781Azw, enumC2197781Azw2, enumC2197781Azw3, enumC2197781Azw4, enumC2197781Azw5};
        LL = enumC2197781AzwArr;
        LLILLJJLI = new C2254308sP(enumC2197781AzwArr);
    }

    public static EnumC2197781Azw[] values() {
        return (EnumC2197781Azw[]) LL.clone();
    }

    public static EnumC2197781Azw valueOf(String str) {
        return (EnumC2197781Azw) C08FF.LIZ(EnumC2197781Azw.class, str);
    }

    public EnumC2197781Azw(String str, int i) {
    }
}
