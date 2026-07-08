package X;

import com.bytedance.android.btm.api.model.PageFinder;

/* JADX INFO: renamed from: X.0QES, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QES {
    public static final C0QES LIZ = new C0QES();
    public static String LIZIZ;
    public static String LIZJ;
    public static Long LIZLLL;

    public static void LIZIZ() {
        LIZJ = null;
    }

    public static void LIZJ() {
        LIZLLL = null;
    }

    public static void LIZLLL() {
        LIZIZ = null;
    }

    public static Long LIZ(C0QES c0qes, Long l, boolean z, int i) {
        boolean z2;
        Long lLJIILIIL = null;
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        c0qes.getClass();
        if (l == null) {
            l = null;
        }
        if (!C08A4.LIZIZ(l)) {
            if (z2) {
                String paramByName = C315220CXg.LIZ().getParamByName("end_to_end_search_session_id");
                if (paramByName != null) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(paramByName);
                }
                l = lLJIILIIL;
            }
            if (!C08A4.LIZIZ(l)) {
                if (C08A4.LIZIZ(LIZLLL)) {
                    return LIZLLL;
                }
                if (!z) {
                    return l;
                }
                return Long.valueOf(C326380Cqq.LIZ());
            }
            return l;
        }
        return l;
    }

    public static void LJ(C0QES c0qes, Long l, PageFinder pageFinder, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            pageFinder = null;
        }
        c0qes.getClass();
        if (l != null) {
            C315220CXg.LIZ().LJLJI(pageFinder, "end_to_end_search_session_id", String.valueOf(l.longValue()), z);
        }
    }
}
