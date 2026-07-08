package X;

import Y.ARunnableS72S0200000_3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: renamed from: X.09pv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2493709pv {
    public static final C2493709pv LIZ = new C2493709pv();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final Map<Integer, Integer> LIZJ = C2097608Jq.LJIIIIZZ(new Pair(Integer.valueOf(R.layout.c5q), 3), new Pair(Integer.valueOf(R.layout.c5j), 1), new Pair(Integer.valueOf(R.layout.c5l), 1), new Pair(Integer.valueOf(R.layout.c5k), 4));
    public static final Map<Integer, Integer> LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(Integer.valueOf(R.layout.c59), 1), new Pair(Integer.valueOf(R.layout.c5_), 6), new Pair(Integer.valueOf(R.layout.c5g), 1));
    public static final Map<Integer, Integer> LJ = C2097608Jq.LJIIIIZZ(new Pair(Integer.valueOf(R.layout.c5a), 6), new Pair(Integer.valueOf(R.layout.c5o), 1));

    public static void LIZIZ() {
        Activity activityLIZ;
        if (!LIZIZ.compareAndSet(false, true) || (activityLIZ = C2421209eE.LIZ()) == null) {
            return;
        }
        C2493709pv c2493709pv = LIZ;
        Map<Integer, Integer> map = LIZLLL;
        c2493709pv.getClass();
        LIZJ(activityLIZ, map);
        LIZJ(activityLIZ, LIZJ);
        if (C04W8.LIZ()) {
            LIZJ(activityLIZ, LJ);
        }
    }

    public static void LIZJ(Context context, Map map) {
        Object c098200Yq;
        C844470XAv.LIZ.getClass();
        if (C2188561Al4.LJIIJ(C844470XAv.LIZ()) && ((Number) C2493809pw.LIZ.getValue()).intValue() == 1) {
            return;
        }
        try {
            c098200Yq = C21172617tM.LJFF.LIZIZ();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = C823050WQl.LIZLLL();
        }
        ((Executor) c098200Yq).execute(new ARunnableS72S0200000_3(map, context, 41));
    }

    public static View LIZ(Context context, int i, ViewGroup viewGroup) {
        C19EG c19egLIZIZ;
        View viewTd;
        final String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (context != null) {
            c19egLIZIZ = C2493909px.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        if (c19egLIZIZ != null) {
            if (viewGroup != null) {
                viewTd = C20673215v0.LIZLLL(i, c19egLIZIZ, viewGroup, false);
            } else {
                viewTd = C20673215v0.LIZJ(i, c19egLIZIZ);
            }
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(context), i, viewGroup, false);
        }
        final long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (i == R.layout.c5q) {
            str = "explore_topic_fragment";
        } else if (i == R.layout.c5j) {
            str = "explore_recommend_topic_fragment";
        } else if (i == R.layout.c5l) {
            str = "explore_recommend_topic_item";
        } else if (i == R.layout.c59) {
            str = "explore_fragment";
        } else if (i == R.layout.c5_) {
            str = "explore_item";
        } else if (i == R.layout.c5g) {
            str = "explore_list_footer_loading";
        } else if (i == R.layout.c5a) {
            str = "explore_item_dm_group";
        } else if (i == R.layout.c5o) {
            str = "explore_text_2_image_bar";
        } else {
            str = "";
        }
        if (str.length() > 0) {
            C2153908cD c2153908cD = C2153908cD.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("inflate ");
            sbLIZ.append(i);
            sbLIZ.append(", cost = ");
            sbLIZ.append(jCurrentTimeMillis2);
            sbLIZ.append(" ms");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2153908cD.getClass();
            C2153908cD.LIZJ(3, strLIZIZ, "explore_layout_inflater");
            C20684815ws.LJFF().execute(new Runnable() { // from class: X.00kG
                public final void LIZ() {
                    C20684815ws.LJIILLIIL("explore_inflate_duration", C2097608Jq.LJIIIIZZ(new Pair("tag", str), new Pair("duration", String.valueOf(jCurrentTimeMillis2))));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ExploreLayoutPerfInflater@4356.reportInflateCost$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ExploreLayoutPerfInflater@4356.reportInflateCost$1");
                }
            });
        }
        return viewTd;
    }
}
