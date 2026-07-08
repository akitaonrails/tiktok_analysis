package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.model.ActivityTask;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0zS3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896490zS3 extends C1896480zS2 implements InterfaceC1899330zWd, InterfaceC1895690zQl {
    public static final C01GW<C1896490zS3> LLJJIII = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1896530zS7());
    public final C1899050zWB LLJJ = new C1899050zWB();
    public boolean LLJJI;

    @Override // X.C1896480zS2, X.InterfaceC1895740zQq
    public final void LJ() {
        this.LLILZLL = 0;
        this.LLILLJJLI = 0L;
        this.LL.storeLong(C1894310zOX.LIZ(this.LLIZLLLIL), this.LLILLJJLI);
        this.LL.storeLong(C1894310zOX.LIZ(this.LLJ), this.LLILLL);
        this.LL.storeInt(C1894310zOX.LIZ(this.LLJIJIL), this.LLILZLL);
        C1849850yEp c1849850yEp = C1849860yEq.LIZ;
        c1849850yEp.LIZ(String.valueOf(this.LLILLJJLI), C1894310zOX.LIZ(this.LLJI));
        c1849850yEp.LIZ(String.valueOf(this.LLILZLL), C1894310zOX.LIZ(this.LLJIJIL));
        LJIILIIL();
        this.LL.storeBoolean(C1894310zOX.LIZ("all_task_finish"), false);
        this.LL.storeLong(C1894310zOX.LIZ(this.LLJILJIL), C1899200zWQ.LIZ(C1899200zWQ.LIZ));
    }

    @Override // X.C1896480zS2
    public final void LJIILIIL() {
        this.LLJJI = false;
        this.LL.storeBoolean(C1894310zOX.LIZ("all_task_finish"), false);
        C1894320zOY.LIZ.getClass();
        C01U6.LIZJ(new C1849800yEk());
    }

    @Override // X.C1896480zS2
    public final void LJJ() {
        this.LLJJI = false;
        this.LL.storeBoolean(C1894310zOX.LIZ("all_task_finish"), false);
        C1894320zOY.LIZ.getClass();
        C01U6.LIZJ(new C1849800yEk());
    }

    @Override // X.InterfaceC1899330zWd
    public final void LIZLLL() {
        this.LL.storeLong(C1894310zOX.LIZ(this.LLIZLLLIL), this.LLILLJJLI);
        this.LL.storeLong(C1894310zOX.LIZ(this.LLJ), this.LLILLL);
        C1849850yEp c1849850yEp = C1849860yEq.LIZ;
        c1849850yEp.LIZ(String.valueOf(this.LLILLJJLI), C1894310zOX.LIZ(this.LLJI));
        this.LL.storeInt(C1894310zOX.LIZ(this.LLJIJIL), this.LLILZLL);
        c1849850yEp.LIZ(String.valueOf(this.LLILZLL), C1894310zOX.LIZ(this.LLJIJIL));
    }

    @Override // X.InterfaceC1899330zWd
    public final void LJIIIIZZ() {
        ActivityTask activityTask;
        if (this.LLILZ.isEmpty() || LJIIJ() || !LJJI() || (activityTask = this.LLILZIL) == null) {
            return;
        }
        int i = activityTask.time;
        long j = this.LLILLJJLI + 1;
        this.LLILLJJLI = j;
        this.LLILLL++;
        if (j >= i) {
            ActivityTask activityTaskLIZ = activityTask.LIZ();
            ActivityTask activityTask2 = this.LLILZIL;
            activityTaskLIZ.LJ = activityTask2 != null ? activityTask2.LJ : null;
            this.LLILZIL = null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("task_type", String.valueOf(Integer.valueOf(activityTaskLIZ.taskType)));
            linkedHashMap.put("task_key", activityTaskLIZ.taskKey);
            linkedHashMap.put("activity_name", activityTaskLIZ.taskKey);
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            linkedHashMap.put("region", abstractC1896090zRP != null ? abstractC1896090zRP.LJIJJ() : null);
            linkedHashMap.put("lottery_cnt", String.valueOf(activityTaskLIZ.awardCount));
            linkedHashMap.put("current_time", String.valueOf(this.LLILLJJLI));
            Map<String, String> map = activityTaskLIZ.LJ;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                interfaceC1897260zTILIZIZ.LIZ("timed_task_time_up", linkedHashMap);
            }
            LJIILJJIL(activityTaskLIZ);
        }
    }

    @Override // X.C1896480zS2
    public final boolean LJIIJ() {
        return this.LLJJI && LJIJI();
    }

    @Override // X.C1896480zS2
    public final ActivityTask LJIIL() {
        List<ActivityTask> list = this.LLILZ;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (ActivityTask) ListProtector.get(this.LLILZ, 0);
    }

    @Override // X.C1896480zS2
    public final void LJIILLIIL() {
        this.LLJJI = this.LL.getBoolean(C1894310zOX.LIZ("all_task_finish"), false);
    }

    @Override // X.C1896480zS2
    public final boolean LJJI() {
        C1896510zS5 c1896510zS5 = (C1896510zS5) C1619720sFe.LIZ.LIZ(11);
        return c1896510zS5 != null && c1896510zS5.LJ();
    }

    @Override // X.C1896480zS2, X.InterfaceC1895240zQ2
    public final void clear() {
        super.clear();
        this.LLJJ.LIZIZ();
        this.LLJJI = false;
    }

    @Override // X.InterfaceC1895690zQl
    public final void LJI() {
        LJ();
    }

    @Override // X.InterfaceC1895240zQ2
    public final void LJFF(List list) {
        LJIIZILJ("clc_watch_video_task", "ad_task_current_task_time", "ad_task_total_time", "", "ad_background_task_date", "ad_task_total_time");
        LJIJJLI(list);
        if (!this.LLILZ.isEmpty()) {
            ArrayList arrayList = (ArrayList) C1895600zQc.LIZIZ;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.LLILZIL = LJIIL();
            LJIIIZ(0, 0, "", false);
            this.LLJJ.LIZ(this);
            this.LLJJ.LIZJ();
        }
    }

    @Override // X.C1896480zS2
    public final void LJIILJJIL(ActivityTask activityTask) {
        C1898560zVO.LJIILIIL(C1898560zVO.LL, 6, activityTask.taskKey);
        this.LLJJI = true;
        LIZ();
    }

    @Override // X.C1896480zS2
    public final void LJIJ(List<ActivityTask> list) {
        this.LLILZ = C1896850zSd.LIZIZ(22, list);
    }
}
