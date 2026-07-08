package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Ak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20476415Ak {
    public static final EnumC20476415Ak AVATAR;
    public static final EnumC20476415Ak BOARD;
    public static final EnumC20476415Ak IMAGE;
    public static final EnumC20476415Ak LABEL;
    public static final /* synthetic */ EnumC20476415Ak[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20476415Ak LOTTIE;
    public static final EnumC20476415Ak TEXT;
    public static final EnumC20476415Ak TOP3AVATAR;

    public static InterfaceC2044707zh<EnumC20476415Ak> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20476415Ak enumC20476415Ak = new EnumC20476415Ak("AVATAR", 0);
        AVATAR = enumC20476415Ak;
        EnumC20476415Ak enumC20476415Ak2 = new EnumC20476415Ak("LABEL", 1);
        LABEL = enumC20476415Ak2;
        EnumC20476415Ak enumC20476415Ak3 = new EnumC20476415Ak("LOTTIE", 2);
        LOTTIE = enumC20476415Ak3;
        EnumC20476415Ak enumC20476415Ak4 = new EnumC20476415Ak("BOARD", 3);
        BOARD = enumC20476415Ak4;
        EnumC20476415Ak enumC20476415Ak5 = new EnumC20476415Ak("TEXT", 4);
        TEXT = enumC20476415Ak5;
        EnumC20476415Ak enumC20476415Ak6 = new EnumC20476415Ak("IMAGE", 5);
        IMAGE = enumC20476415Ak6;
        EnumC20476415Ak enumC20476415Ak7 = new EnumC20476415Ak("TOP3AVATAR", 6);
        TOP3AVATAR = enumC20476415Ak7;
        EnumC20476415Ak[] enumC20476415AkArr = {enumC20476415Ak, enumC20476415Ak2, enumC20476415Ak3, enumC20476415Ak4, enumC20476415Ak5, enumC20476415Ak6, enumC20476415Ak7};
        LL = enumC20476415AkArr;
        LLILLJJLI = new C2254308sP(enumC20476415AkArr);
    }

    public static EnumC20476415Ak[] values() {
        return (EnumC20476415Ak[]) LL.clone();
    }

    public static EnumC20476415Ak valueOf(String str) {
        return (EnumC20476415Ak) C08FF.LIZ(EnumC20476415Ak.class, str);
    }

    public EnumC20476415Ak(String str, int i) {
    }
}
