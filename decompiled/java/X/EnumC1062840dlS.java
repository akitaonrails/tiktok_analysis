package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1062840dlS {
    public static final EnumC1062840dlS LL;
    public static final EnumC1062840dlS LLILLJJLI;
    public static final EnumC1062840dlS LLILLL;
    public static final EnumC1062840dlS LLILZ;
    public static final /* synthetic */ EnumC1062840dlS[] LLILZIL;

    static {
        EnumC1062840dlS enumC1062840dlS = new EnumC1062840dlS("NOT_READY", 0);
        LL = enumC1062840dlS;
        EnumC1062840dlS enumC1062840dlS2 = new EnumC1062840dlS("WAIT_FOR_JSB_READY", 1);
        LLILLJJLI = enumC1062840dlS2;
        EnumC1062840dlS enumC1062840dlS3 = new EnumC1062840dlS("READY", 2);
        LLILLL = enumC1062840dlS3;
        EnumC1062840dlS enumC1062840dlS4 = new EnumC1062840dlS("USING", 3);
        LLILZ = enumC1062840dlS4;
        EnumC1062840dlS[] enumC1062840dlSArr = {enumC1062840dlS, enumC1062840dlS2, enumC1062840dlS3, enumC1062840dlS4};
        LLILZIL = enumC1062840dlSArr;
        new C2254308sP(enumC1062840dlSArr);
    }

    public static EnumC1062840dlS[] values() {
        return (EnumC1062840dlS[]) LLILZIL.clone();
    }

    public static EnumC1062840dlS valueOf(String str) {
        return (EnumC1062840dlS) C08FF.LIZ(EnumC1062840dlS.class, str);
    }

    public EnumC1062840dlS(String str, int i) {
    }
}
