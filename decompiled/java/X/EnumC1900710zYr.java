package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1900710zYr {
    public static final EnumC1900710zYr CHANGE_FILTER_TYPE;
    public static final EnumC1900710zYr CHANGE_SORT_TYPE;
    public static final EnumC1900710zYr CHANGE_TAB;
    public static final EnumC1900710zYr DELETED_NOTICE;
    public static final EnumC1900710zYr FIRST_REQUEST;
    public static final /* synthetic */ EnumC1900710zYr[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1900710zYr LOAD_MORE;
    public static final EnumC1900710zYr PRELOAD;
    public static final EnumC1900710zYr REFRESH;
    public static final EnumC1900710zYr REFRESH_ALL;
    public static final EnumC1900710zYr UPDATE_PRELOAD;
    public final boolean LL;
    public final boolean LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1900710zYr> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1900710zYr enumC1900710zYr = new EnumC1900710zYr("FIRST_REQUEST", 0, true, true);
        FIRST_REQUEST = enumC1900710zYr;
        EnumC1900710zYr enumC1900710zYr2 = new EnumC1900710zYr("REFRESH", 1, true, false);
        REFRESH = enumC1900710zYr2;
        EnumC1900710zYr enumC1900710zYr3 = new EnumC1900710zYr("REFRESH_ALL", 2, true, true);
        REFRESH_ALL = enumC1900710zYr3;
        EnumC1900710zYr enumC1900710zYr4 = new EnumC1900710zYr("LOAD_MORE", 3, false, false);
        LOAD_MORE = enumC1900710zYr4;
        EnumC1900710zYr enumC1900710zYr5 = new EnumC1900710zYr("CHANGE_TAB", 4, false, false);
        CHANGE_TAB = enumC1900710zYr5;
        EnumC1900710zYr enumC1900710zYr6 = new EnumC1900710zYr("UPDATE_PRELOAD", 5, false, false);
        UPDATE_PRELOAD = enumC1900710zYr6;
        EnumC1900710zYr enumC1900710zYr7 = new EnumC1900710zYr("CHANGE_SORT_TYPE", 6, false, false);
        CHANGE_SORT_TYPE = enumC1900710zYr7;
        EnumC1900710zYr enumC1900710zYr8 = new EnumC1900710zYr("CHANGE_FILTER_TYPE", 7, false, false);
        CHANGE_FILTER_TYPE = enumC1900710zYr8;
        EnumC1900710zYr enumC1900710zYr9 = new EnumC1900710zYr("DELETED_NOTICE", 8, false, false);
        DELETED_NOTICE = enumC1900710zYr9;
        EnumC1900710zYr enumC1900710zYr10 = new EnumC1900710zYr("PRELOAD", 9, false, false);
        PRELOAD = enumC1900710zYr10;
        EnumC1900710zYr[] enumC1900710zYrArr = {enumC1900710zYr, enumC1900710zYr2, enumC1900710zYr3, enumC1900710zYr4, enumC1900710zYr5, enumC1900710zYr6, enumC1900710zYr7, enumC1900710zYr8, enumC1900710zYr9, enumC1900710zYr10};
        LLILLL = enumC1900710zYrArr;
        LLILZ = new C2254308sP(enumC1900710zYrArr);
    }

    public static EnumC1900710zYr[] values() {
        return (EnumC1900710zYr[]) LLILLL.clone();
    }

    public final boolean getNeedMarkRead() {
        return this.LL;
    }

    public final boolean getNeedMarkReadAll() {
        return this.LLILLJJLI;
    }

    public static EnumC1900710zYr valueOf(String str) {
        return (EnumC1900710zYr) C08FF.LIZ(EnumC1900710zYr.class, str);
    }

    public EnumC1900710zYr(String str, int i, boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
    }
}
