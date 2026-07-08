package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g0E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1148880g0E {
    public static final EnumC1148880g0E EMPTY_ITEM;
    public static final EnumC1148880g0E FAVORITE_DISABLED_ITEM;
    public static final EnumC1148880g0E FAVORITE_ITEM;
    public static final /* synthetic */ EnumC1148880g0E[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1148880g0E OTHER_ITEM;
    public static final EnumC1148880g0E PLACEHOLDER;

    public static InterfaceC2044707zh<EnumC1148880g0E> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1148880g0E enumC1148880g0E = new EnumC1148880g0E("EMPTY_ITEM", 0);
        EMPTY_ITEM = enumC1148880g0E;
        EnumC1148880g0E enumC1148880g0E2 = new EnumC1148880g0E("FAVORITE_ITEM", 1);
        FAVORITE_ITEM = enumC1148880g0E2;
        EnumC1148880g0E enumC1148880g0E3 = new EnumC1148880g0E("FAVORITE_DISABLED_ITEM", 2);
        FAVORITE_DISABLED_ITEM = enumC1148880g0E3;
        EnumC1148880g0E enumC1148880g0E4 = new EnumC1148880g0E("OTHER_ITEM", 3);
        OTHER_ITEM = enumC1148880g0E4;
        EnumC1148880g0E enumC1148880g0E5 = new EnumC1148880g0E("PLACEHOLDER", 4);
        PLACEHOLDER = enumC1148880g0E5;
        EnumC1148880g0E[] enumC1148880g0EArr = {enumC1148880g0E, enumC1148880g0E2, enumC1148880g0E3, enumC1148880g0E4, enumC1148880g0E5};
        LL = enumC1148880g0EArr;
        LLILLJJLI = new C2254308sP(enumC1148880g0EArr);
    }

    public static EnumC1148880g0E[] values() {
        return (EnumC1148880g0E[]) LL.clone();
    }

    public static EnumC1148880g0E valueOf(String str) {
        return (EnumC1148880g0E) C08FF.LIZ(EnumC1148880g0E.class, str);
    }

    public EnumC1148880g0E(String str, int i) {
    }
}
