package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC119100cn {
    public static final EnumC119100cn BLUETOOTH;
    public static final EnumC119100cn EARPIECE;
    public static final /* synthetic */ EnumC119100cn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC119100cn SPEAKER;
    public static final EnumC119100cn USB_HEADSET;

    public static InterfaceC2044707zh<EnumC119100cn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC119100cn enumC119100cn = new EnumC119100cn("EARPIECE", 0);
        EARPIECE = enumC119100cn;
        EnumC119100cn enumC119100cn2 = new EnumC119100cn("SPEAKER", 1);
        SPEAKER = enumC119100cn2;
        EnumC119100cn enumC119100cn3 = new EnumC119100cn("BLUETOOTH", 2);
        BLUETOOTH = enumC119100cn3;
        EnumC119100cn enumC119100cn4 = new EnumC119100cn("USB_HEADSET", 3);
        USB_HEADSET = enumC119100cn4;
        EnumC119100cn[] enumC119100cnArr = {enumC119100cn, enumC119100cn2, enumC119100cn3, enumC119100cn4};
        LL = enumC119100cnArr;
        LLILLJJLI = new C2254308sP(enumC119100cnArr);
    }

    public static EnumC119100cn[] values() {
        return (EnumC119100cn[]) LL.clone();
    }

    public static EnumC119100cn valueOf(String str) {
        return (EnumC119100cn) C08FF.LIZ(EnumC119100cn.class, str);
    }

    public EnumC119100cn(String str, int i) {
    }
}
