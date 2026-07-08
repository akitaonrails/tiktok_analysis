package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.model.ActivityTask;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS142S1100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zS1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896470zS1 extends C1896480zS2 {
    public static final C01GW<C1896470zS1> LLJJJJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1896550zS9());
    public int LLJJ;
    public List<String> LLJJI = new ArrayList();
    public String LLJJIII = "";
    public final HashMap<String, Integer> LLJJIJI = new HashMap<>();
    public final Map<String, Integer> LLJJIJIIJIL = new LinkedHashMap();
    public final Map<String, String> LLJJIJIL = new LinkedHashMap();
    public boolean LLJJJ;
    public JSONObject LLJJJIL;

    @Override // X.C1896480zS2
    public final void LJIILIIL() {
        this.LLJJ = 0;
        this.LLJJIII = "";
        ((ArrayList) this.LLJJI).clear();
        this.LL.storeString(C1894310zOX.LIZ("completed_task_id_list"), "");
        this.LL.storeInt(C1894310zOX.LIZ("background_task_finished_stage"), -1);
        this.LL.storeBoolean(C1894310zOX.LIZ("do_like_or_comment_tribute_action"), false);
        this.LL.storeBoolean(C1894310zOX.LIZ("has_report_like_and_comment_tribute"), false);
    }

    @Override // X.C1896480zS2
    public final void LJJ() {
        this.LLJJ = 0;
        this.LLJJIII = "";
        ((ArrayList) this.LLJJI).clear();
        this.LL.storeString(C1894310zOX.LIZ("completed_task_id_list"), "");
        this.LL.storeInt(C1894310zOX.LIZ("background_task_finished_stage"), -1);
        C1849860yEq.LIZ.LIZ(String.valueOf(this.LLILLJJLI), C1894310zOX.LIZ("background_task_total_time"));
        this.LL.storeBoolean(C1894310zOX.LIZ("do_like_or_comment_tribute_action"), false);
        this.LL.storeBoolean(C1894310zOX.LIZ("has_report_like_and_comment_tribute"), false);
    }

    @Override // X.C1896480zS2
    public final boolean LJIIJ() {
        return ((ArrayList) this.LLJJI).size() == this.LLILZ.size() && LJIJI();
    }

    @Override // X.C1896480zS2
    public final ActivityTask LJIIL() {
        List<ActivityTask> list = this.LLILZ;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (ActivityTask activityTask : this.LLILZ) {
            if (activityTask.time <= this.LLILLJJLI) {
                if (!this.LLJJI.contains(activityTask.taskKey)) {
                }
            }
            return activityTask;
        }
        return null;
    }

    @Override // X.C1896480zS2
    public final void LJIILLIIL() {
        this.LLJJ = this.LL.getInt(C1894310zOX.LIZ("background_task_finished_stage"), -1) + 1;
        String string = this.LL.getString(C1894310zOX.LIZ("completed_task_id_list"), "");
        this.LLJJIII = string;
        if (string.length() > 0) {
            this.LLJJI = new ArrayList(a0.LJJLIIIJILLIZJL(this.LLJJIII, new String[]{","}, 0, 6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    @Override // X.C1896480zS2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJI() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1896470zS1.LJJI():boolean");
    }

    @Override // X.InterfaceC1895240zQ2
    public final void LJFF(List list) {
        String str;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        C2178808gE.LIZ();
        LJIIZILJ("pendant_global_timer_reducer", "background_task_time", "background_task_total_time", "", "background_task_date", "");
        LJIJJLI(list);
        if (((Number) C0A4E.LIZ.getValue()).intValue() == 1 && !this.LLJJJ) {
            this.LLJJJ = true;
            C1896510zS5 c1896510zS5 = (C1896510zS5) C1619720sFe.LIZ.LIZ(11);
            if (c1896510zS5 != null) {
                ActivityTask activityTask = this.LLILZIL;
                if (activityTask == null || (str = activityTask.taskKey) == null) {
                    str = "";
                }
                c1896510zS5.LIZIZ(str, "", new AwS607S0100000_28(this, 3));
            }
        }
    }

    @Override // X.C1896480zS2
    public final void LJIILJJIL(ActivityTask activityTask) {
        int i = activityTask.time;
        String str = activityTask.taskKey;
        if (!TextUtils.isEmpty(str)) {
            AwS142S1100000_28 awS142S1100000_28 = new AwS142S1100000_28(this, str, 1);
            AwS142S1100000_28 awS142S1100000_282 = new AwS142S1100000_28(this, str, 0);
            if (!Intrinsics.LJFF(str, "like_comment_tribute")) {
                C1896450zRz.LIZ((C1896450zRz) this.LLJILLL.getValue(), str, i, this.LLILLJJLI, awS142S1100000_28, awS142S1100000_282);
                return;
            }
            if (this.LL.getBoolean(C1894310zOX.LIZ("do_like_or_comment_tribute_action"), false)) {
                C1896450zRz.LIZ((C1896450zRz) this.LLJILLL.getValue(), str, i, this.LLILLJJLI, awS142S1100000_28, awS142S1100000_282);
                this.LL.storeBoolean(C1894310zOX.LIZ("has_report_like_and_comment_tribute"), true);
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                if (interfaceC1897260zTILIZIZ == null) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("task_name", "complete");
                linkedHashMap.put("task_id", str);
                interfaceC1897260zTILIZIZ.LIZ("interact_task_complete", linkedHashMap);
                return;
            }
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ2 = C1619720sFe.LIZ.LIZIZ();
            if (interfaceC1897260zTILIZIZ2 == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("task_name", "watch_video");
            linkedHashMap2.put("task_id", str);
            interfaceC1897260zTILIZIZ2.LIZ("interact_task_complete", linkedHashMap2);
        }
    }

    @Override // X.C1896480zS2
    public final void LJIJ(List<ActivityTask> list) {
        this.LLILZ = C1896850zSd.LIZIZ(2, list);
    }

    public final void LJJIFFI(String str) {
        String strLIZIZ;
        String strValueOf;
        this.LL.storeInt(C1894310zOX.LIZ("background_task_finished_stage"), this.LLJJ);
        this.LLJJ++;
        if (this.LLJJIII.length() == 0) {
            strLIZIZ = str;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJJIII);
            sbLIZ.append(',');
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LLJJIII = strLIZIZ;
        ((ArrayList) this.LLJJI).add(str);
        this.LL.storeString(C1894310zOX.LIZ("completed_task_id_list"), this.LLJJIII);
        if (((ArrayList) this.LLJJI).size() < this.LLILZ.size()) {
            ActivityTask activityTaskLJIIL = LJIIL();
            if (activityTaskLJIIL != null) {
                this.LLILZIL = activityTaskLJIIL;
                return;
            }
            return;
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (true ^ this.LLILZ.isEmpty()) {
            strValueOf = String.valueOf(((ActivityTask) ListProtector.get(this.LLILZ, 0)).taskType);
        } else {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("task_type", strValueOf);
        interfaceC1897260zTILIZIZ.LIZ("finish_activity_task", linkedHashMap);
    }
}
