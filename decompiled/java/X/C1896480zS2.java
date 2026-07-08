package X;

import Y.ACallableS431S0100000_28;
import Y.ARunnableS128S0100000_28;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.model.ActivityTask;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zS2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1896480zS2 implements InterfaceC1895740zQq, InterfaceC1895240zQ2 {
    public long LLILLJJLI;
    public long LLILLL;
    public ActivityTask LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public Keva LL = Keva.getRepo("referral_default_keva");
    public List<ActivityTask> LLILZ = new ArrayList();
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public String LLJI = "";
    public String LLJIJIL = "";
    public String LLJILJIL = "";
    public String LLJILJILJ = "";
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C1896520zS6());

    @Override // X.InterfaceC1895740zQq
    public void LJ() {
        this.LLILZIL = null;
        this.LLILLJJLI = 0L;
        this.LLILLL = 0L;
        this.LLILZLL = 0;
        this.LL.storeLong(C1894310zOX.LIZ(this.LLIZLLLIL), this.LLILLJJLI);
        this.LL.storeLong(C1894310zOX.LIZ(this.LLJ), this.LLILLL);
        this.LL.storeInt(C1894310zOX.LIZ(this.LLJIJIL), this.LLILZLL);
        C1849850yEp c1849850yEp = C1849860yEq.LIZ;
        c1849850yEp.LIZ(String.valueOf(this.LLILLJJLI), C1894310zOX.LIZ(this.LLJI));
        c1849850yEp.LIZ(String.valueOf(this.LLILZLL), C1894310zOX.LIZ(this.LLJIJIL));
        LJIILIIL();
        this.LL.storeLong(C1894310zOX.LIZ(this.LLJILJIL), C1899200zWQ.LIZ(C1899200zWQ.LIZ));
        C786410Ut5.LJLIIL(((long) new Random().nextInt(5)) * 1000, new BPEAHandler(Looper.getMainLooper()), new ARunnableS128S0100000_28(this, 0));
    }

    public boolean LJIIJ() {
        return true;
    }

    public ActivityTask LJIIL() {
        throw null;
    }

    public void LJIILIIL() {
    }

    public void LJIILL() {
    }

    public void LJIILLIIL() {
    }

    public void LJIJ(List<ActivityTask> list) {
        throw null;
    }

    public boolean LJIJJ() {
        return !(this instanceof C1896490zS3);
    }

    public boolean LJIL() {
        return !(this instanceof C1896490zS3);
    }

    public void LJJ() {
    }

    public boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC1895740zQq
    public final void LIZ() {
        this.LL.storeLong(C1894310zOX.LIZ(this.LLIZLLLIL), this.LLILLJJLI);
        this.LL.storeLong(C1894310zOX.LIZ(this.LLJ), this.LLILLL);
        C1849850yEp c1849850yEp = C1849860yEq.LIZ;
        c1849850yEp.LIZ(String.valueOf(this.LLILLJJLI), C1894310zOX.LIZ(this.LLJI));
        this.LL.storeInt(C1894310zOX.LIZ(this.LLJIJIL), this.LLILZLL);
        c1849850yEp.LIZ(String.valueOf(this.LLILZLL), C1894310zOX.LIZ(this.LLJIJIL));
    }

    @Override // X.InterfaceC1895240zQ2
    public final void LIZJ() {
        if (this.LLILZ.isEmpty() || LJIJI()) {
            return;
        }
        LJ();
    }

    public void LJIIJJI() {
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("task_type", this.LLILZ.isEmpty() ^ true ? String.valueOf(((ActivityTask) ListProtector.get(this.LLILZ, 0)).taskType) : CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("current_time", String.valueOf(this.LLILLJJLI));
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            linkedHashMap.put("region", abstractC1896090zRP != null ? abstractC1896090zRP.LJIJJ() : null);
            interfaceC1897260zTILIZIZ.LIZ("finish_activity_task", linkedHashMap);
        }
    }

    public final boolean LJIJI() {
        return C1899200zWQ.LIZ(C1899200zWQ.LIZ) == this.LL.getLong(C1894310zOX.LIZ(this.LLJILJIL), 0L);
    }

    @Override // X.InterfaceC1895240zQ2
    public void clear() {
        this.LLILZ.clear();
    }

    @Override // X.InterfaceC1895740zQq
    public final void LIZIZ() {
        ActivityTask activityTask;
        C1896510zS5 c1896510zS5;
        if (LJIIJ() || !this.LLIZ || this.LLILZIL == null) {
            return;
        }
        if ((!LJIJJ() || (c1896510zS5 = (C1896510zS5) C1619720sFe.LIZ.LIZ(11)) == null || c1896510zS5.LJI(LJIL())) && LJJI() && (activityTask = this.LLILZIL) != null) {
            int i = activityTask.time;
            long j = this.LLILLJJLI;
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
                linkedHashMap.put("ad_duration", CardStruct.IStatusCode.DEFAULT);
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
            } else {
                this.LLILLJJLI = j + 1;
                this.LLILLL++;
            }
            if (LJIIJ()) {
                LJIIJJI();
                ActivityTask activityTaskLJIIL = LJIIL();
                if (activityTaskLJIIL == null || activityTaskLJIIL.isAuto) {
                    return;
                }
                this.LLIZ = false;
                this.LL.storeBoolean(C1894310zOX.LIZ(this.LLJILJILJ), false);
            }
        }
    }

    @Override // X.InterfaceC1895740zQq
    public final void LJII() {
        LJIILL();
    }

    public void LJIILJJIL(ActivityTask activityTask) {
        LIZ();
    }

    public final void LJIJJLI(List<ActivityTask> list) {
        List<ActivityTask> list2;
        try {
            LJIJ(list);
            if ((C1894310zOX.LIZIZ() || !LJIL()) && (list2 = this.LLILZ) != null && !list2.isEmpty()) {
                this.LLILLJJLI = this.LL.getLong(C1894310zOX.LIZ(this.LLIZLLLIL), 0L);
                this.LLILLL = this.LL.getLong(C1894310zOX.LIZ(this.LLJ), 0L);
                this.LLILZLL = this.LL.getInt(C1894310zOX.LIZ(this.LLJIJIL), 0);
                this.LLIZ = this.LL.getBoolean(C1894310zOX.LIZ(this.LLJILJILJ), false);
                LJIILLIIL();
                if (!this.LLILZ.isEmpty()) {
                    if (!LJIIJ() && !LJIJI()) {
                        this.LLILLJJLI = 0L;
                        this.LLILLL = 0L;
                        this.LLILZLL = 0;
                        this.LLIZ = false;
                        this.LL.storeBoolean(C1894310zOX.LIZ(this.LLJILJILJ), false);
                        this.LL.storeLong(C1894310zOX.LIZ(this.LLJILJIL), C1899200zWQ.LIZ(C1899200zWQ.LIZ));
                        this.LL.storeInt(C1894310zOX.LIZ(this.LLJIJIL), 0);
                        this.LL.storeLong(C1894310zOX.LIZ(this.LLIZLLLIL), 0L);
                        this.LL.storeLong(C1894310zOX.LIZ(this.LLJ), 0L);
                        C1849860yEq.LIZ.LIZ(String.valueOf(this.LLILLJJLI), C1894310zOX.LIZ(this.LLJI));
                        LJJ();
                    }
                    if (LJIJJ()) {
                        C1895720zQo.LIZ(this);
                    }
                    ActivityTask activityTaskLJIIL = LJIIL();
                    if (activityTaskLJIIL != null) {
                        this.LLILZIL = activityTaskLJIIL;
                    }
                    if ((!this.LLILZ.isEmpty()) && ((ActivityTask) ListProtector.get(this.LLILZ, 0)).isAuto) {
                        LJIIIZ(0, 0, "", false);
                    }
                    C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                    List<ActivityTask> list3 = this.LLILZ;
                    c1894320zOY.getClass();
                    C01U6.LIZJ(new AwS572S0100000_28(list3, (List<? extends EnumC1904380zem>) 821));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIIIZ(int i, int i2, String str, boolean z) {
        String strValueOf;
        ActivityTask activityTask;
        Boolean bool;
        int i3 = 3;
        if (this.LLILZ.isEmpty()) {
            if (z) {
                C1893680zNW.LIZ.getClass();
                C1893680zNW.LIZLLL(0, i, i2, 3, str);
                return;
            }
            return;
        }
        if (z && !((ActivityTask) ListProtector.get(this.LLILZ, 0)).isAuto) {
            C1893680zNW c1893680zNW = C1893680zNW.LIZ;
            if (this.LLIZ) {
                i3 = 2;
            }
            c1893680zNW.getClass();
            C1893680zNW.LIZLLL(1, i, i2, i3, str);
        }
        if (((ActivityTask) ListProtector.get(this.LLILZ, 0)).isAuto) {
            C1893680zNW.LIZ.getClass();
            C1893680zNW.LIZLLL(1, i, i2, 1, str);
        }
        if ((!this.LLILZ.isEmpty()) && (bool = (activityTask = (ActivityTask) ListProtector.get(this.LLILZ, 0)).uploadSwitch) != null && bool.booleanValue()) {
            C15O7.LIZJ(new ACallableS431S0100000_28(activityTask, 2));
        }
        String strLJIJJ = null;
        if (this.LLIZ) {
            if (!LJIJI()) {
                LJ();
            }
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (true ^ this.LLILZ.isEmpty()) {
                    strValueOf = String.valueOf(((ActivityTask) ListProtector.get(this.LLILZ, 0)).taskType);
                } else {
                    strValueOf = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("task_type", strValueOf);
                linkedHashMap.put("current_time", String.valueOf(this.LLILLJJLI));
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP != null) {
                    strLJIJJ = abstractC1896090zRP.LJIJJ();
                }
                linkedHashMap.put("region", strLJIJJ);
                interfaceC1897260zTILIZIZ.LIZ("start_activity_task", linkedHashMap);
                return;
            }
            return;
        }
        if (!LJIIJ()) {
            if (!LJIJI()) {
                LJ();
            }
            this.LLIZ = true;
            this.LL.storeBoolean(C1894310zOX.LIZ(this.LLJILJILJ), true);
            this.LL.storeLong(C1894310zOX.LIZ(this.LLJILJIL), C1899200zWQ.LIZ(C1899200zWQ.LIZ));
            ActivityTask activityTaskLJIIL = LJIIL();
            if (activityTaskLJIIL != null) {
                this.LLILZIL = activityTaskLJIIL;
            }
            C1619720sFe c1619720sFe2 = C1619720sFe.LIZ;
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ2 = c1619720sFe2.LIZIZ();
            if (interfaceC1897260zTILIZIZ2 != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("task_type", String.valueOf(((ActivityTask) ListProtector.get(this.LLILZ, 0)).taskType));
                linkedHashMap2.put("current_time", String.valueOf(this.LLILLJJLI));
                AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe2.LIZ(0);
                if (abstractC1896090zRP2 != null) {
                    strLJIJJ = abstractC1896090zRP2.LJIJJ();
                }
                linkedHashMap2.put("region", strLJIJJ);
                interfaceC1897260zTILIZIZ2.LIZ("start_activity_task", linkedHashMap2);
            }
        }
    }

    public final void LJIIZILJ(String str, String str2, String str3, String str4, String str5, String str6) {
        this.LLIZLLLIL = str2;
        this.LLJI = str3;
        this.LLJIJIL = str4;
        this.LLJILJIL = str5;
        this.LLJILJILJ = "has_active_manually";
        this.LLJ = str6;
        this.LL = Keva.getRepo(str);
    }
}
