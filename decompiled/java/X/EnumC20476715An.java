package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15An, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20476715An {
    public static final EnumC20476715An CANT_AUTO_CREATE;
    public static final EnumC20476715An LAYOUT_CONTAINER;
    public static final /* synthetic */ EnumC20476715An[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20476715An NORMAL;

    public static InterfaceC2044707zh<EnumC20476715An> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20476715An enumC20476715An = new EnumC20476715An("CANT_AUTO_CREATE", 0);
        CANT_AUTO_CREATE = enumC20476715An;
        EnumC20476715An enumC20476715An2 = new EnumC20476715An("NORMAL", 1);
        NORMAL = enumC20476715An2;
        EnumC20476715An enumC20476715An3 = new EnumC20476715An("LAYOUT_CONTAINER", 2);
        LAYOUT_CONTAINER = enumC20476715An3;
        EnumC20476715An[] enumC20476715AnArr = {enumC20476715An, enumC20476715An2, enumC20476715An3};
        LL = enumC20476715AnArr;
        LLILLJJLI = new C2254308sP(enumC20476715AnArr);
    }

    public static EnumC20476715An[] values() {
        return (EnumC20476715An[]) LL.clone();
    }

    public static EnumC20476715An valueOf(String str) {
        return (EnumC20476715An) C08FF.LIZ(EnumC20476715An.class, str);
    }

    public EnumC20476715An(String str, int i) {
    }
}
