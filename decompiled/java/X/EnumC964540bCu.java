package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC964540bCu {
    public static final C964600bD0 Companion;
    public static final /* synthetic */ EnumC964540bCu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC964540bCu QUICK_PAIR_CARD;
    public static final EnumC964540bCu SEARCHING_OVERLAY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC964540bCu> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0bD0] */
    static {
        EnumC964540bCu enumC964540bCu = new EnumC964540bCu("QUICK_PAIR_CARD", 0, "quick_pair_card");
        QUICK_PAIR_CARD = enumC964540bCu;
        EnumC964540bCu enumC964540bCu2 = new EnumC964540bCu("SEARCHING_OVERLAY", 1, "searching_overlay");
        SEARCHING_OVERLAY = enumC964540bCu2;
        EnumC964540bCu[] enumC964540bCuArr = {enumC964540bCu, enumC964540bCu2};
        LLILLJJLI = enumC964540bCuArr;
        LLILLL = new C2254308sP(enumC964540bCuArr);
        Companion = new Object() { // from class: X.0bD0
        };
    }

    public static EnumC964540bCu[] values() {
        return (EnumC964540bCu[]) LLILLJJLI.clone();
    }

    public final String getWireValue() {
        return this.LL;
    }

    public static EnumC964540bCu valueOf(String str) {
        return (EnumC964540bCu) C08FF.LIZ(EnumC964540bCu.class, str);
    }

    public EnumC964540bCu(String str, int i, String str2) {
        this.LL = str2;
    }
}
