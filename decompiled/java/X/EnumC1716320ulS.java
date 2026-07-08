package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ulS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1716320ulS {
    public static final EnumC1716320ulS AUTHENTIC;
    public static final EnumC1716320ulS DO_VERIFY;
    public static final /* synthetic */ EnumC1716320ulS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1716320ulS PARAM;
    public static final EnumC1716320ulS PUBLIC_KEY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1716320ulS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1716320ulS enumC1716320ulS = new EnumC1716320ulS("PARAM", 0, 1);
        PARAM = enumC1716320ulS;
        EnumC1716320ulS enumC1716320ulS2 = new EnumC1716320ulS("AUTHENTIC", 1, 2);
        AUTHENTIC = enumC1716320ulS2;
        EnumC1716320ulS enumC1716320ulS3 = new EnumC1716320ulS("PUBLIC_KEY", 2, 3);
        PUBLIC_KEY = enumC1716320ulS3;
        EnumC1716320ulS enumC1716320ulS4 = new EnumC1716320ulS("DO_VERIFY", 3, 4);
        DO_VERIFY = enumC1716320ulS4;
        EnumC1716320ulS[] enumC1716320ulSArr = {enumC1716320ulS, enumC1716320ulS2, enumC1716320ulS3, enumC1716320ulS4};
        LLILLJJLI = enumC1716320ulSArr;
        LLILLL = new C2254308sP(enumC1716320ulSArr);
    }

    public static EnumC1716320ulS[] values() {
        return (EnumC1716320ulS[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1716320ulS valueOf(String str) {
        return (EnumC1716320ulS) C08FF.LIZ(EnumC1716320ulS.class, str);
    }

    public EnumC1716320ulS(String str, int i, int i2) {
        this.LL = i2;
    }
}
