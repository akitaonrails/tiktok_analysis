package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hm3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC450810Hm3 {
    public static final EnumC450810Hm3 LARGE;
    public static final /* synthetic */ EnumC450810Hm3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC450810Hm3 MEDIUM;
    public static final EnumC450810Hm3 SMALL;

    public static InterfaceC2044707zh<EnumC450810Hm3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC450810Hm3 enumC450810Hm3 = new EnumC450810Hm3("SMALL", 0);
        SMALL = enumC450810Hm3;
        EnumC450810Hm3 enumC450810Hm32 = new EnumC450810Hm3("MEDIUM", 1);
        MEDIUM = enumC450810Hm32;
        EnumC450810Hm3 enumC450810Hm33 = new EnumC450810Hm3("LARGE", 2);
        LARGE = enumC450810Hm33;
        EnumC450810Hm3[] enumC450810Hm3Arr = {enumC450810Hm3, enumC450810Hm32, enumC450810Hm33};
        LL = enumC450810Hm3Arr;
        LLILLJJLI = new C2254308sP(enumC450810Hm3Arr);
    }

    public static EnumC450810Hm3[] values() {
        return (EnumC450810Hm3[]) LL.clone();
    }

    public static EnumC450810Hm3 valueOf(String str) {
        return (EnumC450810Hm3) C08FF.LIZ(EnumC450810Hm3.class, str);
    }

    public EnumC450810Hm3(String str, int i) {
    }
}
