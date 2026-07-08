package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wV9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1783090wV9 {
    public static final EnumC1783090wV9 FULL_PAGE;
    public static final /* synthetic */ EnumC1783090wV9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1783090wV9 PANEL;

    public static InterfaceC2044707zh<EnumC1783090wV9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1783090wV9 enumC1783090wV9 = new EnumC1783090wV9("PANEL", 0);
        PANEL = enumC1783090wV9;
        EnumC1783090wV9 enumC1783090wV92 = new EnumC1783090wV9("FULL_PAGE", 1);
        FULL_PAGE = enumC1783090wV92;
        EnumC1783090wV9[] enumC1783090wV9Arr = {enumC1783090wV9, enumC1783090wV92};
        LL = enumC1783090wV9Arr;
        LLILLJJLI = new C2254308sP(enumC1783090wV9Arr);
    }

    public static EnumC1783090wV9[] values() {
        return (EnumC1783090wV9[]) LL.clone();
    }

    public static EnumC1783090wV9 valueOf(String str) {
        return (EnumC1783090wV9) C08FF.LIZ(EnumC1783090wV9.class, str);
    }

    public EnumC1783090wV9(String str, int i) {
    }
}
