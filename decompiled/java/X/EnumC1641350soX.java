package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0soX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641350soX {
    public static final EnumC1641350soX COLLECT;
    public static final EnumC1641350soX EMOJI;
    public static final /* synthetic */ EnumC1641350soX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1641350soX OTHERS;
    public static final EnumC1641350soX RECENT;
    public static final EnumC1641350soX RECOMMEND;
    public static final EnumC1641350soX STICKERSET;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1641350soX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1641350soX enumC1641350soX = new EnumC1641350soX("RECENT", 0, "recent");
        RECENT = enumC1641350soX;
        EnumC1641350soX enumC1641350soX2 = new EnumC1641350soX("RECOMMEND", 1, "recommend");
        RECOMMEND = enumC1641350soX2;
        EnumC1641350soX enumC1641350soX3 = new EnumC1641350soX("EMOJI", 2, "emoji");
        EMOJI = enumC1641350soX3;
        EnumC1641350soX enumC1641350soX4 = new EnumC1641350soX("COLLECT", 3, "collect");
        COLLECT = enumC1641350soX4;
        EnumC1641350soX enumC1641350soX5 = new EnumC1641350soX("STICKERSET", 4, "stickerSet");
        STICKERSET = enumC1641350soX5;
        EnumC1641350soX enumC1641350soX6 = new EnumC1641350soX("OTHERS", 5, "others");
        OTHERS = enumC1641350soX6;
        EnumC1641350soX[] enumC1641350soXArr = {enumC1641350soX, enumC1641350soX2, enumC1641350soX3, enumC1641350soX4, enumC1641350soX5, enumC1641350soX6};
        LLILLJJLI = enumC1641350soXArr;
        LLILLL = new C2254308sP(enumC1641350soXArr);
    }

    public static EnumC1641350soX[] values() {
        return (EnumC1641350soX[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC1641350soX valueOf(String str) {
        return (EnumC1641350soX) C08FF.LIZ(EnumC1641350soX.class, str);
    }

    public EnumC1641350soX(String str, int i, String str2) {
        this.LL = str2;
    }
}
