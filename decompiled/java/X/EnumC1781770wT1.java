package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wT1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1781770wT1 {
    public static final EnumC1781770wT1 ALL;
    public static final EnumC1781770wT1 ANY;
    public static final /* synthetic */ EnumC1781770wT1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1781770wT1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1781770wT1 enumC1781770wT1 = new EnumC1781770wT1("ALL", 0);
        ALL = enumC1781770wT1;
        EnumC1781770wT1 enumC1781770wT12 = new EnumC1781770wT1("ANY", 1);
        ANY = enumC1781770wT12;
        EnumC1781770wT1[] enumC1781770wT1Arr = {enumC1781770wT1, enumC1781770wT12};
        LL = enumC1781770wT1Arr;
        LLILLJJLI = new C2254308sP(enumC1781770wT1Arr);
    }

    public static EnumC1781770wT1[] values() {
        return (EnumC1781770wT1[]) LL.clone();
    }

    public static EnumC1781770wT1 valueOf(String str) {
        return (EnumC1781770wT1) C08FF.LIZ(EnumC1781770wT1.class, str);
    }

    public EnumC1781770wT1(String str, int i) {
    }
}
