package X;

import java.util.List;

/* JADX INFO: renamed from: X.0CcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317290CcB {
    public static C316640Cb8 LIZ(List list) {
        return new C316640Cb8(list);
    }

    public static C316640Cb8 LIZIZ(C317290CcB c317290CcB) {
        C13BV c13bv = C13BV.INSTANCE;
        c317290CcB.getClass();
        return new C316640Cb8(c13bv);
    }

    public static C316650Cb9 LIZJ(Exception exc) {
        return new C316650Cb9(exc);
    }

    public static C323380Cm0 LIZLLL(Object obj, Object obj2, List list) {
        return new C323380Cm0(obj, obj2, list);
    }

    public static C323380Cm0 LJ(C317290CcB c317290CcB, Object obj, Object obj2, List list, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        if ((i & 4) != 0) {
            list = C13BV.INSTANCE;
        }
        c317290CcB.getClass();
        return new C323380Cm0(obj, obj2, list);
    }
}
