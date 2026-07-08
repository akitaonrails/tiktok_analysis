package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992910bwf {
    public static final EnumC992910bwf ALWAYS_TOP;
    public static final /* synthetic */ EnumC992910bwf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992910bwf SCROLLABLE_CONTAINER;
    public static final EnumC992910bwf SHOW_ONLY_EXPANDED;

    public static InterfaceC2044707zh<EnumC992910bwf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992910bwf enumC992910bwf = new EnumC992910bwf("ALWAYS_TOP", 0);
        ALWAYS_TOP = enumC992910bwf;
        EnumC992910bwf enumC992910bwf2 = new EnumC992910bwf("SCROLLABLE_CONTAINER", 1);
        SCROLLABLE_CONTAINER = enumC992910bwf2;
        EnumC992910bwf enumC992910bwf3 = new EnumC992910bwf("SHOW_ONLY_EXPANDED", 2);
        SHOW_ONLY_EXPANDED = enumC992910bwf3;
        EnumC992910bwf[] enumC992910bwfArr = {enumC992910bwf, enumC992910bwf2, enumC992910bwf3};
        LL = enumC992910bwfArr;
        LLILLJJLI = new C2254308sP(enumC992910bwfArr);
    }

    public static EnumC992910bwf[] values() {
        return (EnumC992910bwf[]) LL.clone();
    }

    public static EnumC992910bwf valueOf(String str) {
        return (EnumC992910bwf) C08FF.LIZ(EnumC992910bwf.class, str);
    }

    public EnumC992910bwf(String str, int i) {
    }
}
