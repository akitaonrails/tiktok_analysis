package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qfl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC676230Qfl {
    public static final C676300Qfs Companion;
    public static final /* synthetic */ EnumC676230Qfl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC676230Qfl UNKNOWN;
    public static final EnumC676230Qfl USER_INTERACTION_TYPE_CLICK_CORRECT_WORD;
    public static final EnumC676230Qfl USER_INTERACTION_TYPE_CLICK_FILTER;
    public static final EnumC676230Qfl USER_INTERACTION_TYPE_CLICK_GUIDE_SEARCH;
    public static final EnumC676230Qfl USER_INTERACTION_TYPE_CLICK_PAGE_RETRY;
    public static final EnumC676230Qfl USER_INTERACTION_TYPE_CLICK_SORTER;
    public static final EnumC676230Qfl USER_INTERACTION_TYPE_FIRST_REQUEST;
    public static final EnumC676230Qfl USER_INTERACTION_TYPE_INSERT_CARD;
    public static final EnumC676230Qfl USER_INTERACTION_TYPE_LOAD_MORE;
    public final int LL;

    public static final EnumC676230Qfl fromValue(int i) {
        Companion.getClass();
        return C676300Qfs.LIZ(i);
    }

    public static InterfaceC2044707zh<EnumC676230Qfl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC676230Qfl enumC676230Qfl = new EnumC676230Qfl("USER_INTERACTION_TYPE_FIRST_REQUEST", 0, 1);
        USER_INTERACTION_TYPE_FIRST_REQUEST = enumC676230Qfl;
        EnumC676230Qfl enumC676230Qfl2 = new EnumC676230Qfl("USER_INTERACTION_TYPE_LOAD_MORE", 1, 2);
        USER_INTERACTION_TYPE_LOAD_MORE = enumC676230Qfl2;
        EnumC676230Qfl enumC676230Qfl3 = new EnumC676230Qfl("USER_INTERACTION_TYPE_CLICK_FILTER", 2, 3);
        USER_INTERACTION_TYPE_CLICK_FILTER = enumC676230Qfl3;
        EnumC676230Qfl enumC676230Qfl4 = new EnumC676230Qfl("USER_INTERACTION_TYPE_CLICK_SORTER", 3, 4);
        USER_INTERACTION_TYPE_CLICK_SORTER = enumC676230Qfl4;
        EnumC676230Qfl enumC676230Qfl5 = new EnumC676230Qfl("USER_INTERACTION_TYPE_CLICK_GUIDE_SEARCH", 4, 5);
        USER_INTERACTION_TYPE_CLICK_GUIDE_SEARCH = enumC676230Qfl5;
        EnumC676230Qfl enumC676230Qfl6 = new EnumC676230Qfl("USER_INTERACTION_TYPE_CLICK_CORRECT_WORD", 5, 6);
        USER_INTERACTION_TYPE_CLICK_CORRECT_WORD = enumC676230Qfl6;
        EnumC676230Qfl enumC676230Qfl7 = new EnumC676230Qfl("USER_INTERACTION_TYPE_CLICK_PAGE_RETRY", 6, 7);
        USER_INTERACTION_TYPE_CLICK_PAGE_RETRY = enumC676230Qfl7;
        EnumC676230Qfl enumC676230Qfl8 = new EnumC676230Qfl("USER_INTERACTION_TYPE_INSERT_CARD", 7, 8);
        USER_INTERACTION_TYPE_INSERT_CARD = enumC676230Qfl8;
        EnumC676230Qfl enumC676230Qfl9 = new EnumC676230Qfl("UNKNOWN", 8, -1);
        UNKNOWN = enumC676230Qfl9;
        EnumC676230Qfl[] enumC676230QflArr = {enumC676230Qfl, enumC676230Qfl2, enumC676230Qfl3, enumC676230Qfl4, enumC676230Qfl5, enumC676230Qfl6, enumC676230Qfl7, enumC676230Qfl8, enumC676230Qfl9};
        LLILLJJLI = enumC676230QflArr;
        LLILLL = new C2254308sP(enumC676230QflArr);
        Companion = new C676300Qfs();
    }

    public static EnumC676230Qfl[] values() {
        return (EnumC676230Qfl[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC676230Qfl valueOf(String str) {
        return (EnumC676230Qfl) C08FF.LIZ(EnumC676230Qfl.class, str);
    }

    public EnumC676230Qfl(String str, int i, int i2) {
        this.LL = i2;
    }
}
