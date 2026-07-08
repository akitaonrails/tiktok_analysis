package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778900wOO {
    public static final /* synthetic */ EnumC1778900wOO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778900wOO LONG_PRESS;
    public static final EnumC1778900wOO PASSIVE;

    public static InterfaceC2044707zh<EnumC1778900wOO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778900wOO enumC1778900wOO = new EnumC1778900wOO("LONG_PRESS", 0);
        LONG_PRESS = enumC1778900wOO;
        EnumC1778900wOO enumC1778900wOO2 = new EnumC1778900wOO("PASSIVE", 1);
        PASSIVE = enumC1778900wOO2;
        EnumC1778900wOO[] enumC1778900wOOArr = {enumC1778900wOO, enumC1778900wOO2};
        LL = enumC1778900wOOArr;
        LLILLJJLI = new C2254308sP(enumC1778900wOOArr);
    }

    public static EnumC1778900wOO[] values() {
        return (EnumC1778900wOO[]) LL.clone();
    }

    public static EnumC1778900wOO valueOf(String str) {
        return (EnumC1778900wOO) C08FF.LIZ(EnumC1778900wOO.class, str);
    }

    public EnumC1778900wOO(String str, int i) {
    }
}
