package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ih1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC473170Ih1 {
    public static final EnumC473170Ih1 BUBBLE_MESSAGE;
    public static final /* synthetic */ EnumC473170Ih1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC473170Ih1 NO_MESSAGE;
    public static final EnumC473170Ih1 PANEL_MESSAGE;

    public static InterfaceC2044707zh<EnumC473170Ih1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC473170Ih1 enumC473170Ih1 = new EnumC473170Ih1("PANEL_MESSAGE", 0);
        PANEL_MESSAGE = enumC473170Ih1;
        EnumC473170Ih1 enumC473170Ih12 = new EnumC473170Ih1("BUBBLE_MESSAGE", 1);
        BUBBLE_MESSAGE = enumC473170Ih12;
        EnumC473170Ih1 enumC473170Ih13 = new EnumC473170Ih1("NO_MESSAGE", 2);
        NO_MESSAGE = enumC473170Ih13;
        EnumC473170Ih1[] enumC473170Ih1Arr = {enumC473170Ih1, enumC473170Ih12, enumC473170Ih13};
        LL = enumC473170Ih1Arr;
        LLILLJJLI = new C2254308sP(enumC473170Ih1Arr);
    }

    public static EnumC473170Ih1[] values() {
        return (EnumC473170Ih1[]) LL.clone();
    }

    public static EnumC473170Ih1 valueOf(String str) {
        return (EnumC473170Ih1) C08FF.LIZ(EnumC473170Ih1.class, str);
    }

    public EnumC473170Ih1(String str, int i) {
    }
}
