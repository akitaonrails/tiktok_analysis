package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fXU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1131060fXU {
    public static final EnumC1131060fXU BACKPACK_SEND_SCENE_FREE_GIFT;
    public static final EnumC1131060fXU BACKPACK_SEND_SCENE_PAY_GIFT;
    public static final /* synthetic */ EnumC1131060fXU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1131060fXU NONE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1131060fXU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1131060fXU enumC1131060fXU = new EnumC1131060fXU("NONE", 0, -1);
        NONE = enumC1131060fXU;
        EnumC1131060fXU enumC1131060fXU2 = new EnumC1131060fXU("BACKPACK_SEND_SCENE_PAY_GIFT", 1, 0);
        BACKPACK_SEND_SCENE_PAY_GIFT = enumC1131060fXU2;
        EnumC1131060fXU enumC1131060fXU3 = new EnumC1131060fXU("BACKPACK_SEND_SCENE_FREE_GIFT", 2, 1);
        BACKPACK_SEND_SCENE_FREE_GIFT = enumC1131060fXU3;
        EnumC1131060fXU[] enumC1131060fXUArr = {enumC1131060fXU, enumC1131060fXU2, enumC1131060fXU3};
        LLILLJJLI = enumC1131060fXUArr;
        LLILLL = new C2254308sP(enumC1131060fXUArr);
    }

    public static EnumC1131060fXU[] values() {
        return (EnumC1131060fXU[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static EnumC1131060fXU valueOf(String str) {
        return (EnumC1131060fXU) C08FF.LIZ(EnumC1131060fXU.class, str);
    }

    public EnumC1131060fXU(String str, int i, int i2) {
        this.LL = i2;
    }
}
