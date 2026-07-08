package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vT1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1743330vT1 {
    public static final /* synthetic */ EnumC1743330vT1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1743330vT1 STYLE_CYCLE;
    public static final EnumC1743330vT1 STYLE_DEFAULT;

    public static InterfaceC2044707zh<EnumC1743330vT1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1743330vT1 enumC1743330vT1 = new EnumC1743330vT1("STYLE_DEFAULT", 0);
        STYLE_DEFAULT = enumC1743330vT1;
        EnumC1743330vT1 enumC1743330vT12 = new EnumC1743330vT1("STYLE_CYCLE", 1);
        STYLE_CYCLE = enumC1743330vT12;
        EnumC1743330vT1[] enumC1743330vT1Arr = {enumC1743330vT1, enumC1743330vT12};
        LL = enumC1743330vT1Arr;
        LLILLJJLI = new C2254308sP(enumC1743330vT1Arr);
    }

    public static EnumC1743330vT1[] values() {
        return (EnumC1743330vT1[]) LL.clone();
    }

    public static EnumC1743330vT1 valueOf(String str) {
        return (EnumC1743330vT1) C08FF.LIZ(EnumC1743330vT1.class, str);
    }

    public EnumC1743330vT1(String str, int i) {
    }
}
