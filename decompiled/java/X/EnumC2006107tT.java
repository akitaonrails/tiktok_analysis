package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2006107tT {
    public static final EnumC2006107tT FEED_ITEMS_CUT;
    public static final /* synthetic */ EnumC2006107tT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2006107tT SHARE_VIDEO_BACK_SHOP_TAB;
    public static final EnumC2006107tT UNKNOWN_SCENE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2006107tT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2006107tT enumC2006107tT = new EnumC2006107tT("UNKNOWN_SCENE", 0, 0);
        UNKNOWN_SCENE = enumC2006107tT;
        EnumC2006107tT enumC2006107tT2 = new EnumC2006107tT("FEED_ITEMS_CUT", 1, 101);
        FEED_ITEMS_CUT = enumC2006107tT2;
        EnumC2006107tT enumC2006107tT3 = new EnumC2006107tT("SHARE_VIDEO_BACK_SHOP_TAB", 2, 201);
        SHARE_VIDEO_BACK_SHOP_TAB = enumC2006107tT3;
        EnumC2006107tT[] enumC2006107tTArr = {enumC2006107tT, enumC2006107tT2, enumC2006107tT3};
        LLILLJJLI = enumC2006107tTArr;
        LLILLL = new C2254308sP(enumC2006107tTArr);
    }

    public static EnumC2006107tT[] values() {
        return (EnumC2006107tT[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2006107tT valueOf(String str) {
        return (EnumC2006107tT) C08FF.LIZ(EnumC2006107tT.class, str);
    }

    public EnumC2006107tT(String str, int i, int i2) {
        this.LL = i2;
    }
}
