package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07u6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2010007u6 {
    public static final /* synthetic */ EnumC2010007u6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2010007u6 SCENE_BIG_CARDS;
    public static final EnumC2010007u6 SCENE_CARD;
    public static final EnumC2010007u6 SCENE_FOR_YOU_PAGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2010007u6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2010007u6 enumC2010007u6 = new EnumC2010007u6("SCENE_CARD", 0, 0);
        SCENE_CARD = enumC2010007u6;
        EnumC2010007u6 enumC2010007u62 = new EnumC2010007u6("SCENE_FOR_YOU_PAGE", 1, 1);
        SCENE_FOR_YOU_PAGE = enumC2010007u62;
        EnumC2010007u6 enumC2010007u63 = new EnumC2010007u6("SCENE_BIG_CARDS", 2, 2);
        SCENE_BIG_CARDS = enumC2010007u63;
        EnumC2010007u6[] enumC2010007u6Arr = {enumC2010007u6, enumC2010007u62, enumC2010007u63};
        LLILLJJLI = enumC2010007u6Arr;
        LLILLL = new C2254308sP(enumC2010007u6Arr);
    }

    public static EnumC2010007u6[] values() {
        return (EnumC2010007u6[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2010007u6 valueOf(String str) {
        return (EnumC2010007u6) C08FF.LIZ(EnumC2010007u6.class, str);
    }

    public EnumC2010007u6(String str, int i, int i2) {
        this.LL = i2;
    }
}
