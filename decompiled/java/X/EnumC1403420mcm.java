package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1403420mcm {
    public static final /* synthetic */ EnumC1403420mcm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1403420mcm apple;
    public static final EnumC1403420mcm facebook;
    public static final EnumC1403420mcm google;
    public static final EnumC1403420mcm instagram;
    public static final EnumC1403420mcm kakaotalk;
    public static final EnumC1403420mcm line;
    public static final EnumC1403420mcm twitter;
    public static final EnumC1403420mcm vk;

    public static InterfaceC2044707zh<EnumC1403420mcm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1403420mcm enumC1403420mcm = new EnumC1403420mcm("apple", 0);
        apple = enumC1403420mcm;
        EnumC1403420mcm enumC1403420mcm2 = new EnumC1403420mcm("facebook", 1);
        facebook = enumC1403420mcm2;
        EnumC1403420mcm enumC1403420mcm3 = new EnumC1403420mcm("google", 2);
        google = enumC1403420mcm3;
        EnumC1403420mcm enumC1403420mcm4 = new EnumC1403420mcm("instagram", 3);
        instagram = enumC1403420mcm4;
        EnumC1403420mcm enumC1403420mcm5 = new EnumC1403420mcm("kakaotalk", 4);
        kakaotalk = enumC1403420mcm5;
        EnumC1403420mcm enumC1403420mcm6 = new EnumC1403420mcm("line", 5);
        line = enumC1403420mcm6;
        EnumC1403420mcm enumC1403420mcm7 = new EnumC1403420mcm("twitter", 6);
        twitter = enumC1403420mcm7;
        EnumC1403420mcm enumC1403420mcm8 = new EnumC1403420mcm("vk", 7);
        vk = enumC1403420mcm8;
        EnumC1403420mcm[] enumC1403420mcmArr = {enumC1403420mcm, enumC1403420mcm2, enumC1403420mcm3, enumC1403420mcm4, enumC1403420mcm5, enumC1403420mcm6, enumC1403420mcm7, enumC1403420mcm8};
        LL = enumC1403420mcmArr;
        LLILLJJLI = new C2254308sP(enumC1403420mcmArr);
    }

    public static EnumC1403420mcm[] values() {
        return (EnumC1403420mcm[]) LL.clone();
    }

    public static EnumC1403420mcm valueOf(String str) {
        return (EnumC1403420mcm) C08FF.LIZ(EnumC1403420mcm.class, str);
    }

    public EnumC1403420mcm(String str, int i) {
    }
}
