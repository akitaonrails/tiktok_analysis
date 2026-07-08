package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154100g8e {
    public static final /* synthetic */ EnumC1154100g8e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154100g8e RANKING_PAGE_BOTTOM_BAR;
    public static final EnumC1154100g8e RANKING_PAGE_LIST;
    public static final EnumC1154100g8e RANKING_PAGE_TOP3_PODIUM;

    public static InterfaceC2044707zh<EnumC1154100g8e> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154100g8e enumC1154100g8e = new EnumC1154100g8e("RANKING_PAGE_LIST", 0);
        RANKING_PAGE_LIST = enumC1154100g8e;
        EnumC1154100g8e enumC1154100g8e2 = new EnumC1154100g8e("RANKING_PAGE_TOP3_PODIUM", 1);
        RANKING_PAGE_TOP3_PODIUM = enumC1154100g8e2;
        EnumC1154100g8e enumC1154100g8e3 = new EnumC1154100g8e("RANKING_PAGE_BOTTOM_BAR", 2);
        RANKING_PAGE_BOTTOM_BAR = enumC1154100g8e3;
        EnumC1154100g8e[] enumC1154100g8eArr = {enumC1154100g8e, enumC1154100g8e2, enumC1154100g8e3};
        LL = enumC1154100g8eArr;
        LLILLJJLI = new C2254308sP(enumC1154100g8eArr);
    }

    public static EnumC1154100g8e[] values() {
        return (EnumC1154100g8e[]) LL.clone();
    }

    public static EnumC1154100g8e valueOf(String str) {
        return (EnumC1154100g8e) C08FF.LIZ(EnumC1154100g8e.class, str);
    }

    public EnumC1154100g8e(String str, int i) {
    }
}
