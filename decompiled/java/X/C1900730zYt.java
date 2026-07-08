package X;

import java.util.List;

/* JADX INFO: renamed from: X.0zYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900730zYt {
    public static final List<EnumC1900710zYr> LIZ;
    public static final List<EnumC1900710zYr> LIZIZ;
    public static final List<EnumC1900710zYr> LIZJ;

    static {
        EnumC1900710zYr enumC1900710zYr = EnumC1900710zYr.FIRST_REQUEST;
        EnumC1900710zYr enumC1900710zYr2 = EnumC1900710zYr.REFRESH_ALL;
        EnumC1900710zYr enumC1900710zYr3 = EnumC1900710zYr.REFRESH;
        EnumC1900710zYr enumC1900710zYr4 = EnumC1900710zYr.CHANGE_TAB;
        EnumC1900710zYr enumC1900710zYr5 = EnumC1900710zYr.UPDATE_PRELOAD;
        LIZ = C1697810uHb.LJIIJJI(enumC1900710zYr, enumC1900710zYr2, enumC1900710zYr3, enumC1900710zYr4, enumC1900710zYr5, EnumC1900710zYr.PRELOAD);
        LIZIZ = C1697810uHb.LJIIJJI(enumC1900710zYr3, enumC1900710zYr2, enumC1900710zYr);
        LIZJ = C1697810uHb.LJIIJJI(enumC1900710zYr2, enumC1900710zYr, enumC1900710zYr4, enumC1900710zYr5, EnumC1900710zYr.CHANGE_SORT_TYPE);
    }
}
