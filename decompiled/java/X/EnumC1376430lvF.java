package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1376430lvF {
    public static final EnumC1376430lvF INTENT_SHARE;
    public static final /* synthetic */ EnumC1376430lvF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1376430lvF SDK_SHARE;
    public static final EnumC1376430lvF SYSTEM_SHARE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1376430lvF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1376430lvF enumC1376430lvF = new EnumC1376430lvF("SYSTEM_SHARE", 0, 0);
        SYSTEM_SHARE = enumC1376430lvF;
        EnumC1376430lvF enumC1376430lvF2 = new EnumC1376430lvF("SDK_SHARE", 1, 1);
        SDK_SHARE = enumC1376430lvF2;
        EnumC1376430lvF enumC1376430lvF3 = new EnumC1376430lvF("INTENT_SHARE", 2, 2);
        INTENT_SHARE = enumC1376430lvF3;
        EnumC1376430lvF[] enumC1376430lvFArr = {enumC1376430lvF, enumC1376430lvF2, enumC1376430lvF3};
        LLILLJJLI = enumC1376430lvFArr;
        LLILLL = new C2254308sP(enumC1376430lvFArr);
    }

    public static EnumC1376430lvF[] values() {
        return (EnumC1376430lvF[]) LLILLJJLI.clone();
    }

    public final int getNum() {
        return this.LL;
    }

    public static EnumC1376430lvF valueOf(String str) {
        return (EnumC1376430lvF) C08FF.LIZ(EnumC1376430lvF.class, str);
    }

    public EnumC1376430lvF(String str, int i, int i2) {
        this.LL = i2;
    }
}
