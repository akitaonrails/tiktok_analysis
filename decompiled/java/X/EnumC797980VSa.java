package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC797980VSa {
    public static final EnumC797980VSa CHECK_EXIST;
    public static final EnumC797980VSa GET_INPUT_STREAM;
    public static final EnumC797980VSa GET_PATH;
    public static final EnumC797980VSa GET_VERSION;
    public static final /* synthetic */ EnumC797980VSa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC797980VSa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC797980VSa enumC797980VSa = new EnumC797980VSa("GET_PATH", 0, 1);
        GET_PATH = enumC797980VSa;
        EnumC797980VSa enumC797980VSa2 = new EnumC797980VSa("GET_VERSION", 1, 2);
        GET_VERSION = enumC797980VSa2;
        EnumC797980VSa enumC797980VSa3 = new EnumC797980VSa("CHECK_EXIST", 2, 3);
        CHECK_EXIST = enumC797980VSa3;
        EnumC797980VSa enumC797980VSa4 = new EnumC797980VSa("GET_INPUT_STREAM", 3, 6);
        GET_INPUT_STREAM = enumC797980VSa4;
        EnumC797980VSa[] enumC797980VSaArr = {enumC797980VSa, enumC797980VSa2, enumC797980VSa3, enumC797980VSa4};
        LLILLJJLI = enumC797980VSaArr;
        LLILLL = new C2254308sP(enumC797980VSaArr);
    }

    public static EnumC797980VSa[] values() {
        return (EnumC797980VSa[]) LLILLJJLI.clone();
    }

    public final int getNumber() {
        return this.LL;
    }

    public static EnumC797980VSa valueOf(String str) {
        return (EnumC797980VSa) C08FF.LIZ(EnumC797980VSa.class, str);
    }

    public EnumC797980VSa(String str, int i, int i2) {
        this.LL = i2;
    }
}
