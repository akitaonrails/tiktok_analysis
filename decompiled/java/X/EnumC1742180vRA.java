package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vRA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1742180vRA {
    public static final EnumC1742180vRA AFTER_ADD_ITEM;
    public static final EnumC1742180vRA CART_ENTRY;
    public static final /* synthetic */ EnumC1742180vRA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1742180vRA UNDEFINED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1742180vRA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1742180vRA enumC1742180vRA = new EnumC1742180vRA("UNDEFINED", 0, 0);
        UNDEFINED = enumC1742180vRA;
        EnumC1742180vRA enumC1742180vRA2 = new EnumC1742180vRA("AFTER_ADD_ITEM", 1, 1);
        AFTER_ADD_ITEM = enumC1742180vRA2;
        EnumC1742180vRA enumC1742180vRA3 = new EnumC1742180vRA("CART_ENTRY", 2, 2);
        CART_ENTRY = enumC1742180vRA3;
        EnumC1742180vRA[] enumC1742180vRAArr = {enumC1742180vRA, enumC1742180vRA2, enumC1742180vRA3};
        LLILLJJLI = enumC1742180vRAArr;
        LLILLL = new C2254308sP(enumC1742180vRAArr);
    }

    public static EnumC1742180vRA[] values() {
        return (EnumC1742180vRA[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1742180vRA valueOf(String str) {
        return (EnumC1742180vRA) C08FF.LIZ(EnumC1742180vRA.class, str);
    }

    public EnumC1742180vRA(String str, int i, int i2) {
        this.LL = i2;
    }
}
