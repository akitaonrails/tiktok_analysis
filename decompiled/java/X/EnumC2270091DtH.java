package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1DtH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2270091DtH {
    public static final EnumC2270091DtH DEFAULT_ALL_FEED;
    public static final EnumC2270091DtH EXPLORE;
    public static final EnumC2270091DtH FOLLOWING;
    public static final EnumC2270091DtH FRIENDS;
    public static final EnumC2270091DtH FYP;
    public static final /* synthetic */ EnumC2270091DtH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2270091DtH NEARBY;

    public static InterfaceC2044707zh<EnumC2270091DtH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2270091DtH enumC2270091DtH = new EnumC2270091DtH("DEFAULT_ALL_FEED", 0);
        DEFAULT_ALL_FEED = enumC2270091DtH;
        EnumC2270091DtH enumC2270091DtH2 = new EnumC2270091DtH("FYP", 1);
        FYP = enumC2270091DtH2;
        EnumC2270091DtH enumC2270091DtH3 = new EnumC2270091DtH("FOLLOWING", 2);
        FOLLOWING = enumC2270091DtH3;
        EnumC2270091DtH enumC2270091DtH4 = new EnumC2270091DtH("FRIENDS", 3);
        FRIENDS = enumC2270091DtH4;
        EnumC2270091DtH enumC2270091DtH5 = new EnumC2270091DtH("NEARBY", 4);
        NEARBY = enumC2270091DtH5;
        EnumC2270091DtH enumC2270091DtH6 = new EnumC2270091DtH("EXPLORE", 5);
        EXPLORE = enumC2270091DtH6;
        EnumC2270091DtH[] enumC2270091DtHArr = {enumC2270091DtH, enumC2270091DtH2, enumC2270091DtH3, enumC2270091DtH4, enumC2270091DtH5, enumC2270091DtH6};
        LL = enumC2270091DtHArr;
        LLILLJJLI = new C2254308sP(enumC2270091DtHArr);
    }

    public static EnumC2270091DtH[] values() {
        return (EnumC2270091DtH[]) LL.clone();
    }

    public static EnumC2270091DtH valueOf(String str) {
        return (EnumC2270091DtH) C08FF.LIZ(EnumC2270091DtH.class, str);
    }

    public EnumC2270091DtH(String str, int i) {
    }
}
