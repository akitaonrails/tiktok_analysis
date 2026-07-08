package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1800020wwS {
    public static final EnumC1800020wwS BANNER_AUTO_COLLAPSE;
    public static final EnumC1800020wwS BANNER_STICKY;
    public static final C1800050wwV Companion;
    public static final EnumC1800020wwS FLOATING_BALL;
    public static final EnumC1800020wwS INVISIBLE;
    public static final /* synthetic */ EnumC1800020wwS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1800020wwS> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0wwV] */
    static {
        EnumC1800020wwS enumC1800020wwS = new EnumC1800020wwS("INVISIBLE", 0, 0);
        INVISIBLE = enumC1800020wwS;
        EnumC1800020wwS enumC1800020wwS2 = new EnumC1800020wwS("BANNER_AUTO_COLLAPSE", 1, 1);
        BANNER_AUTO_COLLAPSE = enumC1800020wwS2;
        EnumC1800020wwS enumC1800020wwS3 = new EnumC1800020wwS("BANNER_STICKY", 2, 2);
        BANNER_STICKY = enumC1800020wwS3;
        EnumC1800020wwS enumC1800020wwS4 = new EnumC1800020wwS("FLOATING_BALL", 3, 3);
        FLOATING_BALL = enumC1800020wwS4;
        EnumC1800020wwS[] enumC1800020wwSArr = {enumC1800020wwS, enumC1800020wwS2, enumC1800020wwS3, enumC1800020wwS4};
        LLILLJJLI = enumC1800020wwSArr;
        LLILLL = new C2254308sP(enumC1800020wwSArr);
        Companion = new Object() { // from class: X.0wwV
        };
    }

    public static EnumC1800020wwS[] values() {
        return (EnumC1800020wwS[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1800020wwS valueOf(String str) {
        return (EnumC1800020wwS) C08FF.LIZ(EnumC1800020wwS.class, str);
    }

    public EnumC1800020wwS(String str, int i, int i2) {
        this.LL = i2;
    }
}
