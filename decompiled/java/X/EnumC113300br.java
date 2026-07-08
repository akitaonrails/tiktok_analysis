package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00br, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC113300br {
    public static final EnumC113300br INVALID;
    public static final /* synthetic */ EnumC113300br[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC113300br MULTI_CHOICE;
    public static final EnumC113300br RATING_CHOICE;
    public static final EnumC113300br SINGLE_CHOICE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC113300br> getEntries() {
        return LLILLL;
    }

    static {
        EnumC113300br enumC113300br = new EnumC113300br("INVALID", 0, -1);
        INVALID = enumC113300br;
        EnumC113300br enumC113300br2 = new EnumC113300br("SINGLE_CHOICE", 1, 1);
        SINGLE_CHOICE = enumC113300br2;
        EnumC113300br enumC113300br3 = new EnumC113300br("MULTI_CHOICE", 2, 2);
        MULTI_CHOICE = enumC113300br3;
        EnumC113300br enumC113300br4 = new EnumC113300br("RATING_CHOICE", 3, 4);
        RATING_CHOICE = enumC113300br4;
        EnumC113300br[] enumC113300brArr = {enumC113300br, enumC113300br2, enumC113300br3, enumC113300br4};
        LLILLJJLI = enumC113300brArr;
        LLILLL = new C2254308sP(enumC113300brArr);
    }

    public static EnumC113300br[] values() {
        return (EnumC113300br[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC113300br valueOf(String str) {
        return (EnumC113300br) C08FF.LIZ(EnumC113300br.class, str);
    }

    public EnumC113300br(String str, int i, int i2) {
        this.LL = i2;
    }
}
