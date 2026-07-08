package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC673040Qac {
    public static final EnumC673040Qac COMMENTS_HIGHLIGHT_WORD;
    public static final EnumC673040Qac COMMENTS_TOP_BAR;
    public static final EnumC673040Qac FEED_BOTTOM_BAR;
    public static final /* synthetic */ EnumC673040Qac[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC673040Qac> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC673040Qac enumC673040Qac = new EnumC673040Qac("FEED_BOTTOM_BAR", 0);
        FEED_BOTTOM_BAR = enumC673040Qac;
        EnumC673040Qac enumC673040Qac2 = new EnumC673040Qac("COMMENTS_TOP_BAR", 1);
        COMMENTS_TOP_BAR = enumC673040Qac2;
        EnumC673040Qac enumC673040Qac3 = new EnumC673040Qac("COMMENTS_HIGHLIGHT_WORD", 2);
        COMMENTS_HIGHLIGHT_WORD = enumC673040Qac3;
        EnumC673040Qac[] enumC673040QacArr = {enumC673040Qac, enumC673040Qac2, enumC673040Qac3};
        LL = enumC673040QacArr;
        LLILLJJLI = new C2254308sP(enumC673040QacArr);
    }

    public static EnumC673040Qac[] values() {
        return (EnumC673040Qac[]) LL.clone();
    }

    public static EnumC673040Qac valueOf(String str) {
        return (EnumC673040Qac) C08FF.LIZ(EnumC673040Qac.class, str);
    }

    public EnumC673040Qac(String str, int i) {
    }
}
