package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fVA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1129620fVA {
    public static final EnumC1129620fVA LL;
    public static final EnumC1129620fVA LLILLJJLI;
    public static final EnumC1129620fVA LLILLL;
    public static final EnumC1129620fVA LLILZ;
    public static final EnumC1129620fVA LLILZIL;
    public static final /* synthetic */ EnumC1129620fVA[] LLILZLL;

    static {
        EnumC1129620fVA enumC1129620fVA = new EnumC1129620fVA("RANDOM_GIFT", 0);
        LL = enumC1129620fVA;
        EnumC1129620fVA enumC1129620fVA2 = new EnumC1129620fVA("FIREWORKS_GIFT", 1);
        LLILLJJLI = enumC1129620fVA2;
        EnumC1129620fVA enumC1129620fVA3 = new EnumC1129620fVA("GIFT_HUB", 2);
        LLILLL = enumC1129620fVA3;
        EnumC1129620fVA enumC1129620fVA4 = new EnumC1129620fVA("LIVE_GOAL", 3);
        LLILZ = enumC1129620fVA4;
        EnumC1129620fVA enumC1129620fVA5 = new EnumC1129620fVA("OTHERS", 4);
        LLILZIL = enumC1129620fVA5;
        EnumC1129620fVA[] enumC1129620fVAArr = {enumC1129620fVA, enumC1129620fVA2, enumC1129620fVA3, enumC1129620fVA4, enumC1129620fVA5};
        LLILZLL = enumC1129620fVAArr;
        new C2254308sP(enumC1129620fVAArr);
    }

    public static EnumC1129620fVA[] values() {
        return (EnumC1129620fVA[]) LLILZLL.clone();
    }

    public static EnumC1129620fVA valueOf(String str) {
        return (EnumC1129620fVA) C08FF.LIZ(EnumC1129620fVA.class, str);
    }

    public EnumC1129620fVA(String str, int i) {
    }
}
