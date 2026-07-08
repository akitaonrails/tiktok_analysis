package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1579420rCe {
    public static final EnumC1579420rCe ALL_SERIES_DEFAULT;
    public static final EnumC1579420rCe ALL_SERIES_DETAIL;
    public static final C1579730rD9 Companion;
    public static final EnumC1579420rCe HISTORY_DEFAULT;
    public static final EnumC1579420rCe HISTORY_DETAIL;
    public static final EnumC1579420rCe HISTORY_LIST;
    public static final /* synthetic */ EnumC1579420rCe[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1579420rCe TRENDING_DEFAULT;
    public static final EnumC1579420rCe TRENDING_DETAIL;
    public static final EnumC1579420rCe TRENDING_LIST;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1579420rCe> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0rD9] */
    static {
        EnumC1579420rCe enumC1579420rCe = new EnumC1579420rCe("ALL_SERIES_DEFAULT", 0, 1, "all_series_default");
        ALL_SERIES_DEFAULT = enumC1579420rCe;
        EnumC1579420rCe enumC1579420rCe2 = new EnumC1579420rCe("ALL_SERIES_DETAIL", 1, 2, "all_series_detail");
        ALL_SERIES_DETAIL = enumC1579420rCe2;
        EnumC1579420rCe enumC1579420rCe3 = new EnumC1579420rCe("TRENDING_DEFAULT", 2, 3, "trending_default");
        TRENDING_DEFAULT = enumC1579420rCe3;
        EnumC1579420rCe enumC1579420rCe4 = new EnumC1579420rCe("TRENDING_DETAIL", 3, 4, "trending_detail");
        TRENDING_DETAIL = enumC1579420rCe4;
        EnumC1579420rCe enumC1579420rCe5 = new EnumC1579420rCe("HISTORY_DEFAULT", 4, 5, "history_default");
        HISTORY_DEFAULT = enumC1579420rCe5;
        EnumC1579420rCe enumC1579420rCe6 = new EnumC1579420rCe("HISTORY_DETAIL", 5, 6, "history_detail");
        HISTORY_DETAIL = enumC1579420rCe6;
        EnumC1579420rCe enumC1579420rCe7 = new EnumC1579420rCe("TRENDING_LIST", 6, 7, "trending_list");
        TRENDING_LIST = enumC1579420rCe7;
        EnumC1579420rCe enumC1579420rCe8 = new EnumC1579420rCe("HISTORY_LIST", 7, 8, "history_list");
        HISTORY_LIST = enumC1579420rCe8;
        EnumC1579420rCe[] enumC1579420rCeArr = {enumC1579420rCe, enumC1579420rCe2, enumC1579420rCe3, enumC1579420rCe4, enumC1579420rCe5, enumC1579420rCe6, enumC1579420rCe7, enumC1579420rCe8};
        LLILLL = enumC1579420rCeArr;
        LLILZ = new C2254308sP(enumC1579420rCeArr);
        Companion = new Object() { // from class: X.0rD9
        };
    }

    public static EnumC1579420rCe[] values() {
        return (EnumC1579420rCe[]) LLILLL.clone();
    }

    public final String getEventCardName() {
        return this.LLILLJJLI;
    }

    public final int getServerCardStyle() {
        return this.LL;
    }

    public static EnumC1579420rCe valueOf(String str) {
        return (EnumC1579420rCe) C08FF.LIZ(EnumC1579420rCe.class, str);
    }

    public EnumC1579420rCe(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
