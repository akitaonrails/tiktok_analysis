package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g99, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154410g99 {
    public static final EnumC1154410g99 FULL_PAGE_TTI;
    public static final /* synthetic */ EnumC1154410g99[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154410g99 MEANINGFUL_RENDER;

    public static InterfaceC2044707zh<EnumC1154410g99> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154410g99 enumC1154410g99 = new EnumC1154410g99("MEANINGFUL_RENDER", 0);
        MEANINGFUL_RENDER = enumC1154410g99;
        EnumC1154410g99 enumC1154410g992 = new EnumC1154410g99("FULL_PAGE_TTI", 1);
        FULL_PAGE_TTI = enumC1154410g992;
        EnumC1154410g99[] enumC1154410g99Arr = {enumC1154410g99, enumC1154410g992};
        LL = enumC1154410g99Arr;
        LLILLJJLI = new C2254308sP(enumC1154410g99Arr);
    }

    public static EnumC1154410g99[] values() {
        return (EnumC1154410g99[]) LL.clone();
    }

    public static EnumC1154410g99 valueOf(String str) {
        return (EnumC1154410g99) C08FF.LIZ(EnumC1154410g99.class, str);
    }

    public EnumC1154410g99(String str, int i) {
    }
}
