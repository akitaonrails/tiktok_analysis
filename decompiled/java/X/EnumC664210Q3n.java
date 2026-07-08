package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC664210Q3n {
    public static final EnumC664210Q3n CLICK_MORE;
    public static final EnumC664210Q3n FROM_CLICK_MORE;
    public static final /* synthetic */ EnumC664210Q3n[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC664210Q3n SEARCH_CLICK_MORE;
    public static final EnumC664210Q3n SEARCH_SWIPE_MORE;

    public static InterfaceC2044707zh<EnumC664210Q3n> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC664210Q3n enumC664210Q3n = new EnumC664210Q3n("SEARCH_CLICK_MORE", 0);
        SEARCH_CLICK_MORE = enumC664210Q3n;
        EnumC664210Q3n enumC664210Q3n2 = new EnumC664210Q3n("SEARCH_SWIPE_MORE", 1);
        SEARCH_SWIPE_MORE = enumC664210Q3n2;
        EnumC664210Q3n enumC664210Q3n3 = new EnumC664210Q3n("FROM_CLICK_MORE", 2);
        FROM_CLICK_MORE = enumC664210Q3n3;
        EnumC664210Q3n enumC664210Q3n4 = new EnumC664210Q3n("CLICK_MORE", 3);
        CLICK_MORE = enumC664210Q3n4;
        EnumC664210Q3n[] enumC664210Q3nArr = {enumC664210Q3n, enumC664210Q3n2, enumC664210Q3n3, enumC664210Q3n4};
        LL = enumC664210Q3nArr;
        LLILLJJLI = new C2254308sP(enumC664210Q3nArr);
    }

    public static EnumC664210Q3n[] values() {
        return (EnumC664210Q3n[]) LL.clone();
    }

    public static EnumC664210Q3n valueOf(String str) {
        return (EnumC664210Q3n) C08FF.LIZ(EnumC664210Q3n.class, str);
    }

    public EnumC664210Q3n(String str, int i) {
    }
}
