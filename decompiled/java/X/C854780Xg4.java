package X;

import android.os.SystemClock;
import androidx.work.ListenableWorker;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cubes.worker.UpdateCubesVideoInfoWork;
import com.ss.android.ugc.aweme.service.FriendsUnreadGidsService;
import com.ss.android.ugc.aweme.service.RecentGidsService;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Xg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854780Xg4 implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<Unit> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
            case 3:
                subscribe$3(this, c09aj);
                break;
            case 4:
                subscribe$4(this, c09aj);
                break;
        }
    }

    public C854780Xg4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C854780Xg4 c854780Xg4, C09AJ c09aj) {
        C1C7U.LIZ("FriendsUnreadGidsService@ce29.clear$dis$1");
        ((InterfaceC797850VRn) ((FriendsUnreadGidsService) c854780Xg4.l0).LIZ.getValue()).clear();
        c09aj.onNext(Unit.LIZ);
        c09aj.onComplete();
        C1C7U.LIZIZ("FriendsUnreadGidsService@ce29.clear$dis$1");
    }

    public static final void subscribe$1(C854780Xg4 c854780Xg4, C09AJ c09aj) {
        C1C7U.LIZ("RecentGidsService@4f41.getStoryViewedGidsAsync$1");
        c09aj.onNext(((RecentGidsService) c854780Xg4.l0).LJIIJ().LJFF(System.currentTimeMillis() - ((long) 86400000), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()));
        c09aj.onComplete();
        C1C7U.LIZIZ("RecentGidsService@4f41.getStoryViewedGidsAsync$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void subscribe$2(X.C854780Xg4 r24, X.C09AJ r25) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C854780Xg4.subscribe$2(X.0Xg4, X.09AJ):void");
    }

    public static final void subscribe$3(C854780Xg4 c854780Xg4, C09AJ c09aj) {
        C826860Wc8 c826860Wc8 = (C826860Wc8) c854780Xg4.l0;
        c826860Wc8.getClass();
        C1C7U.LIZ("UpdateHelper@13d.initUpdateParams$1L");
        c09aj.onNext(C813020Vuu.LJIIL().LIZLLL(c826860Wc8.LIZ, C826870Wc9.class, "update_params"));
        C1C7U.LIZIZ("UpdateHelper@13d.initUpdateParams$1L");
    }

    public static final void subscribe$4(C854780Xg4 c854780Xg4, C09AJ c09aj) {
        String str;
        C1C7U.LIZ("GoogleCubesTasksPublisher@a944.setupScheduledUpdateTasks$1");
        ((C797430VPx) c854780Xg4.l0).getClass();
        C0VPV.LIZ(EnumC1483805rQ.UPDATE_BY_SCHEDULER);
        EnumC797240VPe[] enumC797240VPeArrLIZ = C0VPW.LIZ();
        int length = enumC797240VPeArrLIZ.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            EnumC797240VPe enumC797240VPe = enumC797240VPeArrLIZ[i2];
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createScheduledTask(");
            sbLIZ.append(enumC797240VPe.name());
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
            SimpleDateFormat simpleDateFormat = C0VPY.LIZ;
            Calendar calendar = Calendar.getInstance();
            calendar.set(13, i);
            calendar.set(12, i);
            calendar.set(11, i);
            calendar.set(14, i);
            long timeInMillis = calendar.getTimeInMillis() + TimeUnit.HOURS.toMillis(enumC797240VPe.getStartHour());
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis > timeInMillis) {
                timeInMillis += TimeUnit.DAYS.toMillis(1L);
            }
            long jNextLong = (timeInMillis + C19994513Lb.LIZIZ(SystemClock.elapsedRealtime()).nextLong(TimeUnit.MINUTES.toMillis(enumC797240VPe.getDuration()))) - jCurrentTimeMillis;
            C0VIM c0vim = new C0VIM((Class<? extends ListenableWorker>) UpdateCubesVideoInfoWork.class, 1L, TimeUnit.DAYS);
            c0vim.LIZLLL(jNextLong, TimeUnit.MILLISECONDS);
            EnumC1483805rQ enumC1483805rQ = EnumC1483805rQ.UPDATE_BY_SCHEDULER;
            ((HashSet) c0vim.LIZLLL).add(enumC1483805rQ.getTag());
            C0VIS c0visLIZ = c0vim.LIZ();
            C0VI7 c0vi7 = (C0VI7) C0VPV.LIZ.getValue();
            if (c0vi7 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(enumC1483805rQ.getTag());
                sbLIZ2.append('_');
                sbLIZ2.append(enumC797240VPe.getIndex());
                c0vi7.LIZJ(C2188811AlT.LIZIZ(sbLIZ2), C0VIA.REPLACE, c0visLIZ);
            }
            long j = jNextLong + jCurrentTimeMillis;
            C0VQD.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("first_launch_timestamp", String.valueOf(j));
            c2344009Gk.LJ(Boolean.valueOf(C0VPX.LIZ), "cubes_enabled");
            c2344009Gk.LIZJ(C0VPW.LIZ, "update_frequency");
            C20684815ws.LJIILLIIL("google_cubes_wm_set", c2344009Gk.LIZ);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("createScheduledTask(");
            sbLIZ3.append(enumC797240VPe.name());
            sbLIZ3.append(") - id: ");
            sbLIZ3.append(c0visLIZ.LIZ);
            sbLIZ3.append('-');
            sbLIZ3.append(c0visLIZ.LIZ.toString());
            sbLIZ3.append("; name: ");
            sbLIZ3.append(enumC1483805rQ.getTag());
            sbLIZ3.append('_');
            sbLIZ3.append(enumC797240VPe.getIndex());
            sbLIZ3.append("; tag: ");
            sbLIZ3.append(enumC1483805rQ.getTag());
            C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("createScheduledTask(");
            sbLIZ4.append(enumC797240VPe.name());
            sbLIZ4.append("): 1stTime: ");
            try {
                str = C0VPY.LIZ.format(new Date(j));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("getyMdHmsStringFromMillSec() - error = ");
                sbLIZ5.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ5);
                str = "";
            }
            sbLIZ4.append(str);
            sbLIZ4.append("; interval: 1 day; tags?: ");
            sbLIZ4.append(c0visLIZ.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ4);
            i2++;
            i = 0;
        }
        c09aj.onNext(EnumC1483805rQ.UPDATE_BY_SCHEDULER.getTag());
        C1C7U.LIZIZ("GoogleCubesTasksPublisher@a944.setupScheduledUpdateTasks$1");
    }
}
