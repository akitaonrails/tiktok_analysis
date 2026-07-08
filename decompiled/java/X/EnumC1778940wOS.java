package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778940wOS {
    public static final EnumC1778940wOS CURRENT_PERIOD;
    public static final EnumC1778940wOS HISTORY;
    public static final /* synthetic */ EnumC1778940wOS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1778940wOS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778940wOS enumC1778940wOS = new EnumC1778940wOS("CURRENT_PERIOD", 0);
        CURRENT_PERIOD = enumC1778940wOS;
        EnumC1778940wOS enumC1778940wOS2 = new EnumC1778940wOS("HISTORY", 1);
        HISTORY = enumC1778940wOS2;
        EnumC1778940wOS[] enumC1778940wOSArr = {enumC1778940wOS, enumC1778940wOS2};
        LL = enumC1778940wOSArr;
        LLILLJJLI = new C2254308sP(enumC1778940wOSArr);
    }

    public static EnumC1778940wOS[] values() {
        return (EnumC1778940wOS[]) LL.clone();
    }

    public static EnumC1778940wOS valueOf(String str) {
        return (EnumC1778940wOS) C08FF.LIZ(EnumC1778940wOS.class, str);
    }

    public EnumC1778940wOS(String str, int i) {
    }
}
