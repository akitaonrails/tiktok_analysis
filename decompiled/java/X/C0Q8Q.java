package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q8Q, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q8Q {
    public static final C0Q8Q LIZ = new C0Q8Q();
    public static final boolean LIZIZ;
    public static long LIZJ;

    static {
        LIZIZ = ((Boolean) C272420Am0.LIZ.getValue()).booleanValue() || Intrinsics.LJFF(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchPerfDebugSwitch(), Boolean.TRUE);
    }

    public static void LIZ(String str, JSONObject jSONObject) {
        C19EG c19egLJ;
        Object objLIZIZ;
        Fragment fragment;
        View view;
        C389500FOy c389500FOy;
        if (LIZIZ && (c19egLJ = C651290Pgd.LJ()) != null && (objLIZIZ = C651580Ph6.LIZIZ(c19egLJ)) != null && (fragment = (Fragment) objLIZIZ) != null && (view = fragment.getView()) != null && (c389500FOy = (C389500FOy) view.findViewById(R.id.uda)) != null) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("page:");
            sbLIZ.append(str);
            sbLIZ.append(" \n");
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            Long lValueOf = Long.valueOf(jSONObject.optLong("root_cache_type"));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("rootCacheType：");
            sbLIZ2.append(lValueOf);
            sbLIZ2.append(" \n");
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            int iHashCode = str.hashCode();
            if (iHashCode != -1074341483) {
                if (iHashCode != -934426595) {
                    if (iHashCode == 114245 && str.equals("sug")) {
                        Long lValueOf2 = Long.valueOf(jSONObject.optLong("cost"));
                        Long lValueOf3 = Long.valueOf(jSONObject.optLong("timing_rtt"));
                        Long lValueOf4 = Long.valueOf(jSONObject.optLong("timing_total"));
                        Long lValueOf5 = Long.valueOf(jSONObject.optLong("server_stream_time"));
                        Long lValueOf6 = Long.valueOf(jSONObject.optLong("client_cost"));
                        Long lValueOf7 = Long.valueOf(jSONObject.optLong("view_draw_cost"));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("cost：");
                        sbLIZ3.append(lValueOf2);
                        sbLIZ3.append(" \n");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("timing_rtt：");
                        sbLIZ4.append(lValueOf3);
                        sbLIZ4.append(" \n");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("timing_total：");
                        sbLIZ5.append(lValueOf4);
                        sbLIZ5.append(" \n");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ5));
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("server_stream_time：");
                        sbLIZ6.append(lValueOf5);
                        sbLIZ6.append(" \n");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ6));
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("client_cost：");
                        sbLIZ7.append(lValueOf6);
                        sbLIZ7.append(" \n");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ7));
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("view_draw_cost：");
                        sbLIZ8.append(lValueOf7);
                        sbLIZ8.append(" \n");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ8));
                    }
                } else if (str.equals("result")) {
                    Long lValueOf8 = Long.valueOf(jSONObject.optLong("cost"));
                    Long lValueOf9 = Long.valueOf(jSONObject.optLong("timing_rtt"));
                    Long lValueOf10 = Long.valueOf(jSONObject.optLong("server_stream_time"));
                    Long lValueOf11 = Long.valueOf(jSONObject.optLong("client_cost_v3"));
                    Long lValueOf12 = Long.valueOf(jSONObject.optLong("view_draw_cost"));
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("cost：");
                    sbLIZ9.append(lValueOf8);
                    sbLIZ9.append(" \n");
                    sb.append(C2188811AlT.LIZIZ(sbLIZ9));
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append("timing_rtt：");
                    sbLIZ10.append(lValueOf9);
                    sbLIZ10.append(" \n");
                    sb.append(C2188811AlT.LIZIZ(sbLIZ10));
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("server_stream_time：");
                    sbLIZ11.append(lValueOf10);
                    sbLIZ11.append(" \n");
                    sb.append(C2188811AlT.LIZIZ(sbLIZ11));
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append("client_cost：");
                    sbLIZ12.append(lValueOf11);
                    sbLIZ12.append(" \n");
                    sb.append(C2188811AlT.LIZIZ(sbLIZ12));
                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                    sbLIZ13.append("view_draw_cost：");
                    sbLIZ13.append(lValueOf12);
                    sbLIZ13.append(" \n");
                    sb.append(C2188811AlT.LIZIZ(sbLIZ13));
                }
            } else if (str.equals("middle")) {
                long jOptLong = jSONObject.optLong("history_cost");
                if (jOptLong == 0) {
                    jOptLong = LIZJ;
                } else {
                    LIZJ = jOptLong;
                }
                Long lValueOf13 = Long.valueOf(jSONObject.optLong("recommend_cost"));
                Long lValueOf14 = Long.valueOf(jSONObject.optLong("activity_pause_cost"));
                Long lValueOf15 = Long.valueOf(jSONObject.optLong("activity_launch_cost"));
                Long lValueOf16 = Long.valueOf(jSONObject.optLong("trigger_fragment_cost"));
                Long lValueOf17 = Long.valueOf(jSONObject.optLong("launch_fragment_cost"));
                Long lValueOf18 = Long.valueOf(jSONObject.optLong("trigger_result_fragment_cost"));
                Long lValueOf19 = Long.valueOf(jSONObject.optLong("update_history_cost"));
                Long lValueOf20 = Long.valueOf(jSONObject.optLong("update_recommend_cost"));
                Long lValueOf21 = Long.valueOf(jSONObject.optLong("recommend_draw_cost"));
                Long lValueOf22 = Long.valueOf(jSONObject.optLong("server_api_cost"));
                StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                sbLIZ14.append("history_cost：");
                sbLIZ14.append(jOptLong);
                sbLIZ14.append(" \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ14));
                StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                sbLIZ15.append("recommend_cost：");
                sbLIZ15.append(lValueOf13);
                sbLIZ15.append(" \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ15));
                StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                sbLIZ16.append("activity_pause_cost：");
                sbLIZ16.append(lValueOf14);
                sbLIZ16.append(" \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ16));
                StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                sbLIZ17.append("activity_launch_cost：");
                sbLIZ17.append(lValueOf15);
                sbLIZ17.append(" \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ17));
                StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                sbLIZ18.append("trigger_fragment_cost：");
                sbLIZ18.append(lValueOf16);
                sbLIZ18.append(" \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ18));
                StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                sbLIZ19.append("launch_fragment_cost：");
                sbLIZ19.append(lValueOf17);
                sbLIZ19.append(" \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ19));
                StringBuilder sbLIZ20 = C2188811AlT.LIZ();
                sbLIZ20.append("trigger_result_fragment_cost：");
                sbLIZ20.append(lValueOf18);
                sbLIZ20.append(" \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ20));
                StringBuilder sbLIZ21 = C2188811AlT.LIZ();
                sbLIZ21.append("update_history_cost：");
                sbLIZ21.append(lValueOf19);
                sbLIZ21.append(" \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ21));
                StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                sbLIZ22.append("update_recommend_cost：");
                sbLIZ22.append(lValueOf20);
                sbLIZ22.append(" \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ22));
                StringBuilder sbLIZ23 = C2188811AlT.LIZ();
                sbLIZ23.append("recommend_draw_cost：");
                sbLIZ23.append(lValueOf21);
                sbLIZ23.append(" \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ23));
                StringBuilder sbLIZ24 = C2188811AlT.LIZ();
                sbLIZ24.append("server_api_cost：");
                sbLIZ24.append(lValueOf22);
                sbLIZ24.append(" \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ24));
            }
            C0CNO.LIZLLL(0L, new AwS406S0200000_5(c389500FOy, sb, 132));
        }
    }
}
