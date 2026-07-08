package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15wz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20685515wz implements InterfaceC20685715x1 {
    public final void LIZ(final String str, final String str2, final long j, final JSONObject jSONObject) {
        C844470XAv.LIZ.getClass();
        final Context contextLIZ = C844470XAv.LIZ();
        if (TextUtils.equals(str2, "click")) {
            C20684815ws.LJIIJ(0L, str, str2, String.valueOf(j), jSONObject);
            return;
        }
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null && !topActivity.isFinishing()) {
            if (str2 != null) {
                String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "splash_ad_tracking_delay_to_first_frame", "not_showing_reason,stop_showing_monitor,hour_skip,hour_show,boarding,covered,launch_covered,splash_init_monitor_all,client_false,ad_selected,ad_no_selected,error_save_sp,parse_finished,topview_boarding,valid_time,has_period_first_chance,pick_model,pick_model,pick_finish,splash_show_failed,showlimit,time_check_error,topview_data_got_succeed,topview_data_got_failed,splash_no_download,update_local_data,download_image_failed,download_image_succeed,download_video_failed,download_video_succeed", true);
                if (strLJJ == null) {
                    strLJJ = "";
                }
                if (strLJJ.length() != 0) {
                    List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJJ, new String[]{","}, 0, 6);
                    if (!listLJJLIIIJILLIZJL.isEmpty()) {
                        C07PQ.LIZ.clear();
                        for (String str3 : listLJJLIIIJILLIZJL) {
                            if (str3.length() > 0) {
                                C07PQ.LIZ.add(a0.LJLIIIL(str3).toString());
                            }
                        }
                    }
                }
                ArrayList<String> arrayList = C07PQ.LIZ;
                if (!arrayList.isEmpty() && arrayList.contains(str2)) {
                    if (!(topActivity instanceof C19EG)) {
                        topActivity = null;
                    }
                    boolean zBooleanValue = ((Boolean) C2277641EDa.LJ.getValue()).booleanValue();
                    Function0 function0 = new Function0(contextLIZ, str, str2, j, jSONObject) { // from class: X.15x0
                        public final /* synthetic */ String LL;
                        public final /* synthetic */ String LLILLJJLI;
                        public final /* synthetic */ long LLILLL;
                        public final /* synthetic */ long LLILZ = 0;
                        public final /* synthetic */ JSONObject LLILZIL;

                        {
                            this.LL = str;
                            this.LLILLJJLI = str2;
                            this.LLILLL = j;
                            this.LLILZIL = jSONObject;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            C2212241BiA.LJI(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
                            return null;
                        }
                    };
                    if (topActivity != null && zBooleanValue) {
                        C0S78.LJI(zBooleanValue, function0);
                        return;
                    } else {
                        function0.invoke();
                        return;
                    }
                }
            }
            C2212241BiA.LJI(str, str2, j, 0L, jSONObject);
            return;
        }
        C2212241BiA.LJI(str, str2, j, 0L, jSONObject);
    }
}
