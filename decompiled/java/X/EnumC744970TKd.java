package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC744970TKd {
    public static final EnumC744970TKd LL;
    public static final EnumC744970TKd LLILLJJLI;
    public static final EnumC744970TKd LLILLL;
    public static final EnumC744970TKd LLILZ;
    public static final EnumC744970TKd LLILZIL;
    public static final EnumC744970TKd LLILZLL;
    public static final /* synthetic */ EnumC744970TKd[] LLIZ;

    static {
        EnumC744970TKd enumC744970TKd = new EnumC744970TKd("ON_BIND", 0);
        LL = enumC744970TKd;
        EnumC744970TKd enumC744970TKd2 = new EnumC744970TKd("ON_SELECT", 1);
        LLILLJJLI = enumC744970TKd2;
        EnumC744970TKd enumC744970TKd3 = new EnumC744970TKd("UN_SELECT", 2);
        LLILLL = enumC744970TKd3;
        EnumC744970TKd enumC744970TKd4 = new EnumC744970TKd("ON_PAUSE", 3);
        LLILZ = enumC744970TKd4;
        EnumC744970TKd enumC744970TKd5 = new EnumC744970TKd("EXIT_DELAY", 4);
        LLILZIL = enumC744970TKd5;
        EnumC744970TKd enumC744970TKd6 = new EnumC744970TKd("AI_SUMMARY_HIDE", 5);
        LLILZLL = enumC744970TKd6;
        EnumC744970TKd[] enumC744970TKdArr = {enumC744970TKd, enumC744970TKd2, enumC744970TKd3, enumC744970TKd4, enumC744970TKd5, enumC744970TKd6};
        LLIZ = enumC744970TKdArr;
        new C2254308sP(enumC744970TKdArr);
    }

    public static EnumC744970TKd[] values() {
        return (EnumC744970TKd[]) LLIZ.clone();
    }

    public static EnumC744970TKd valueOf(String str) {
        return (EnumC744970TKd) C08FF.LIZ(EnumC744970TKd.class, str);
    }

    public EnumC744970TKd(String str, int i) {
    }
}
