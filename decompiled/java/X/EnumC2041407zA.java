package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07zA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2041407zA {

    @InterfaceC1294060jmO
    public static final EnumC2041407zA AS_OPTION_FLAG_FIRST_FRAME_NOT_INVERTED;
    public static final EnumC2041407zA AS_OPTION_FLAG_FPS_RANGE;
    public static final EnumC2041407zA AS_OPTION_FLAG_MTK_3DNR;
    public static final EnumC2041407zA AS_OPTION_FLAG_PICTURE_SIZE;
    public static final /* synthetic */ EnumC2041407zA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final byte LL;

    public static InterfaceC2044707zh<EnumC2041407zA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2041407zA enumC2041407zA = new EnumC2041407zA((byte) 1, 0, "AS_OPTION_FLAG_PICTURE_SIZE");
        AS_OPTION_FLAG_PICTURE_SIZE = enumC2041407zA;
        EnumC2041407zA enumC2041407zA2 = new EnumC2041407zA((byte) 2, 1, "AS_OPTION_FLAG_FPS_RANGE");
        AS_OPTION_FLAG_FPS_RANGE = enumC2041407zA2;
        EnumC2041407zA enumC2041407zA3 = new EnumC2041407zA((byte) 4, 2, "AS_OPTION_FLAG_MTK_3DNR");
        AS_OPTION_FLAG_MTK_3DNR = enumC2041407zA3;
        EnumC2041407zA enumC2041407zA4 = new EnumC2041407zA((byte) 8, 3, "AS_OPTION_FLAG_FIRST_FRAME_NOT_INVERTED");
        AS_OPTION_FLAG_FIRST_FRAME_NOT_INVERTED = enumC2041407zA4;
        EnumC2041407zA[] enumC2041407zAArr = {enumC2041407zA, enumC2041407zA2, enumC2041407zA3, enumC2041407zA4};
        LLILLJJLI = enumC2041407zAArr;
        LLILLL = new C2254308sP(enumC2041407zAArr);
    }

    public static EnumC2041407zA[] values() {
        return (EnumC2041407zA[]) LLILLJJLI.clone();
    }

    public final byte getOption() {
        return this.LL;
    }

    public static EnumC2041407zA valueOf(String str) {
        return (EnumC2041407zA) C08FF.LIZ(EnumC2041407zA.class, str);
    }

    public EnumC2041407zA(byte b, int i, String str) {
        this.LL = b;
    }
}
