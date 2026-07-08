package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1762130vxL {
    public static final EnumC1762130vxL DISCLAIMER_LABEL;
    public static final EnumC1762130vxL LEGACY_AI_TRY_ON;
    public static final EnumC1762130vxL LEGACY_CREATOR_VIDEO_ANCHOR;
    public static final EnumC1762130vxL LEGACY_FIND_SIMILAR;
    public static final /* synthetic */ EnumC1762130vxL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1762130vxL LYNX;
    public static final EnumC1762130vxL PROMOTION_STICKER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1762130vxL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1762130vxL enumC1762130vxL = new EnumC1762130vxL("LEGACY_AI_TRY_ON", 0, 1);
        LEGACY_AI_TRY_ON = enumC1762130vxL;
        EnumC1762130vxL enumC1762130vxL2 = new EnumC1762130vxL("LEGACY_FIND_SIMILAR", 1, 2);
        LEGACY_FIND_SIMILAR = enumC1762130vxL2;
        EnumC1762130vxL enumC1762130vxL3 = new EnumC1762130vxL("LEGACY_CREATOR_VIDEO_ANCHOR", 2, 3);
        LEGACY_CREATOR_VIDEO_ANCHOR = enumC1762130vxL3;
        EnumC1762130vxL enumC1762130vxL4 = new EnumC1762130vxL("DISCLAIMER_LABEL", 3, 4);
        DISCLAIMER_LABEL = enumC1762130vxL4;
        EnumC1762130vxL enumC1762130vxL5 = new EnumC1762130vxL("PROMOTION_STICKER", 4, 5);
        PROMOTION_STICKER = enumC1762130vxL5;
        EnumC1762130vxL enumC1762130vxL6 = new EnumC1762130vxL("LYNX", 5, 6);
        LYNX = enumC1762130vxL6;
        EnumC1762130vxL[] enumC1762130vxLArr = {enumC1762130vxL, enumC1762130vxL2, enumC1762130vxL3, enumC1762130vxL4, enumC1762130vxL5, enumC1762130vxL6};
        LLILLJJLI = enumC1762130vxLArr;
        LLILLL = new C2254308sP(enumC1762130vxLArr);
    }

    public static EnumC1762130vxL[] values() {
        return (EnumC1762130vxL[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1762130vxL valueOf(String str) {
        return (EnumC1762130vxL) C08FF.LIZ(EnumC1762130vxL.class, str);
    }

    public EnumC1762130vxL(String str, int i, int i2) {
        this.LL = i2;
    }
}
