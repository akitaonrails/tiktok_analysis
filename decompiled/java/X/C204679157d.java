package X;

import Y.ARunnableS131S0100000_31;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.157d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204679157d {
    public static final C204679157d LIZ = new C204679157d();
    public static final List<C204681157f> LIZIZ = new ArrayList();
    public static final int LIZJ = 10000;
    public static final long LIZLLL = 3000;
    public static final Map<Long, Long> LJ = new LinkedHashMap();

    public static void LIZJ(C204681157f c204681157f) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(c204681157f.LJIIJ);
        int i = 0;
        Object objValueOf = 0;
        c474500IjALIZ.LJJII(objValueOf, "gesture_type");
        c474500IjALIZ.LJJII(Boolean.valueOf(c204681157f.LJ), "is_rtl");
        if (c204681157f.LJIIJJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        int i2 = c204681157f.LJFF;
        if (i2 == 1 || i2 == 2) {
            i = i2;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "ohr");
        c474500IjALIZ.LJJII(Long.valueOf(c204681157f.LJI), "watch_duration");
        c474500IjALIZ.LJJII(Integer.valueOf(c204681157f.LJII), "interaction_count");
        c474500IjALIZ.LJJII(Boolean.valueOf(c204681157f.LJIIIIZZ), "follow");
        c474500IjALIZ.LJJIFFI(Float.valueOf(c204681157f.LJIIL), "x_position");
        c474500IjALIZ.LJJIFFI(Float.valueOf(c204681157f.LJIILIIL), "y_position");
        c474500IjALIZ.LJJII(Integer.valueOf(c204681157f.LJIILJJIL), "velocity");
        if (c204681157f.LJIIIZ != 0) {
            objValueOf = Float.valueOf(Math.abs(c204681157f.LJIILL - c204681157f.LJIILIIL) / c204681157f.LJIIIZ);
        }
        c474500IjALIZ.LJJII(objValueOf, "distance");
        c474500IjALIZ.LJJIFFI(Float.valueOf(c204681157f.LJIILLIIL), "angle");
        c474500IjALIZ.LJJII(c204681157f.LIZJ, "gesture_id");
        c474500IjALIZ.LJJIIZI(c204681157f.LJIIZILJ);
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(C204681157f c204681157f, boolean z) {
        if (z) {
            C786410Ut5.LJLIIL(500L, C0IK5.LIZ(), new ARunnableS131S0100000_31(c204681157f, 36));
        } else {
            LIZJ(c204681157f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r17, int r18, float r19, float r20, float r21, float r22) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204679157d.LIZ(boolean, int, float, float, float, float):void");
    }
}
