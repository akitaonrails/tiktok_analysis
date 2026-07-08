package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14wo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20429614wo {
    public static final /* synthetic */ EnumC20429614wo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20429614wo NUM;
    public static final EnumC20429614wo TEXT;
    public static final EnumC20429614wo TIME;

    public static InterfaceC2044707zh<EnumC20429614wo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20429614wo enumC20429614wo = new EnumC20429614wo("TEXT", 0);
        TEXT = enumC20429614wo;
        EnumC20429614wo enumC20429614wo2 = new EnumC20429614wo("TIME", 1);
        TIME = enumC20429614wo2;
        EnumC20429614wo enumC20429614wo3 = new EnumC20429614wo("NUM", 2);
        NUM = enumC20429614wo3;
        EnumC20429614wo[] enumC20429614woArr = {enumC20429614wo, enumC20429614wo2, enumC20429614wo3};
        LL = enumC20429614woArr;
        LLILLJJLI = new C2254308sP(enumC20429614woArr);
    }

    public static EnumC20429614wo[] values() {
        return (EnumC20429614wo[]) LL.clone();
    }

    public static EnumC20429614wo valueOf(String str) {
        return (EnumC20429614wo) C08FF.LIZ(EnumC20429614wo.class, str);
    }

    public EnumC20429614wo(String str, int i) {
    }
}
