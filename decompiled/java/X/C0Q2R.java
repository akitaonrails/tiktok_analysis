package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q2R, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q2R {
    public static final String LIZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C664000Q2s c664000Q2s;
        String strIsFromComment;
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LJIIIIZZ = C646000PVm.LJIIIIZZ(interfaceC665370Q7z);
        if (c650960Pg6LJIIIIZZ == null || (c664000Q2s = c650960Pg6LJIIIIZZ.searchCommonModel) == null || (strIsFromComment = c664000Q2s.isFromComment()) == null) {
            return "";
        }
        return strIsFromComment;
    }

    public static final String LIZIZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C650940Pg4 c650940Pg4;
        String strIsFromPhoto;
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LJIIIIZZ = C646000PVm.LJIIIIZZ(interfaceC665370Q7z);
        if (c650960Pg6LJIIIIZZ == null || (c650940Pg4 = c650960Pg6LJIIIIZZ.searchEventModel) == null || (strIsFromPhoto = c650940Pg4.isFromPhoto()) == null) {
            return "";
        }
        return strIsFromPhoto;
    }

    public static final boolean LIZJ(Fragment fragment, C19EG c19eg) {
        String enterSearchFrom;
        C0QER c0qer = C640270P9l.LIZ(fragment, c19eg).LL;
        if (c0qer != null) {
            enterSearchFrom = c0qer.getEnterSearchFrom();
        } else {
            enterSearchFrom = null;
        }
        if (!Intrinsics.LJFF(enterSearchFrom, "discovery") && !LIZLLL(fragment, c19eg)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Fragment fragment, C19EG c19eg) {
        String enterSearchFrom;
        String enterSearchFrom2;
        String enterSearchFrom3;
        String enterSearchFrom4;
        C0QER c0qer = C640270P9l.LIZ(fragment, c19eg).LL;
        String enterSearchFrom5 = null;
        if (c0qer != null) {
            enterSearchFrom = c0qer.getEnterSearchFrom();
        } else {
            enterSearchFrom = null;
        }
        if (!Intrinsics.LJFF(enterSearchFrom, "homepage_hot")) {
            C0QER c0qer2 = C640270P9l.LIZ(fragment, c19eg).LL;
            if (c0qer2 != null) {
                enterSearchFrom2 = c0qer2.getEnterSearchFrom();
            } else {
                enterSearchFrom2 = null;
            }
            if (!Intrinsics.LJFF(enterSearchFrom2, "homepage_follow")) {
                C0QER c0qer3 = C640270P9l.LIZ(fragment, c19eg).LL;
                if (c0qer3 != null) {
                    enterSearchFrom3 = c0qer3.getEnterSearchFrom();
                } else {
                    enterSearchFrom3 = null;
                }
                if (!Intrinsics.LJFF(enterSearchFrom3, "homepage_friends")) {
                    C0QER c0qer4 = C640270P9l.LIZ(fragment, c19eg).LL;
                    if (c0qer4 != null) {
                        enterSearchFrom4 = c0qer4.getEnterSearchFrom();
                    } else {
                        enterSearchFrom4 = null;
                    }
                    if (!Intrinsics.LJFF(enterSearchFrom4, "homepage_popular")) {
                        C0QER c0qer5 = C640270P9l.LIZ(fragment, c19eg).LL;
                        if (c0qer5 != null) {
                            enterSearchFrom5 = c0qer5.getEnterSearchFrom();
                        }
                        if (!Intrinsics.LJFF(enterSearchFrom5, "homepage_nearby")) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static final boolean LJ(Fragment fragment, C19EG c19eg) {
        String enterSearchFrom;
        C0QER c0qer = C640270P9l.LIZ(fragment, c19eg).LL;
        if (c0qer != null) {
            enterSearchFrom = c0qer.getEnterSearchFrom();
        } else {
            enterSearchFrom = null;
        }
        return Intrinsics.LJFF(enterSearchFrom, "visual_search");
    }
}
