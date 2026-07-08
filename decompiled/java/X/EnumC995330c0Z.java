package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995330c0Z {
    public static final EnumC995330c0Z BOTTOM_BAR_ITEM;
    public static final /* synthetic */ EnumC995330c0Z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC995330c0Z NORMAL_LIST_ITEM;
    public static final EnumC995330c0Z SPECIAL_TOP3_LIST_ITEM;
    public final int LL;

    public static InterfaceC2044707zh<EnumC995330c0Z> getEntries() {
        return LLILLL;
    }

    static {
        EnumC995330c0Z enumC995330c0Z = new EnumC995330c0Z("SPECIAL_TOP3_LIST_ITEM", 0, 1);
        SPECIAL_TOP3_LIST_ITEM = enumC995330c0Z;
        EnumC995330c0Z enumC995330c0Z2 = new EnumC995330c0Z("NORMAL_LIST_ITEM", 1, 2);
        NORMAL_LIST_ITEM = enumC995330c0Z2;
        EnumC995330c0Z enumC995330c0Z3 = new EnumC995330c0Z("BOTTOM_BAR_ITEM", 2, 3);
        BOTTOM_BAR_ITEM = enumC995330c0Z3;
        EnumC995330c0Z[] enumC995330c0ZArr = {enumC995330c0Z, enumC995330c0Z2, enumC995330c0Z3};
        LLILLJJLI = enumC995330c0ZArr;
        LLILLL = new C2254308sP(enumC995330c0ZArr);
    }

    public static EnumC995330c0Z[] values() {
        return (EnumC995330c0Z[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC995330c0Z valueOf(String str) {
        return (EnumC995330c0Z) C08FF.LIZ(EnumC995330c0Z.class, str);
    }

    public EnumC995330c0Z(String str, int i, int i2) {
        this.LL = i2;
    }
}
