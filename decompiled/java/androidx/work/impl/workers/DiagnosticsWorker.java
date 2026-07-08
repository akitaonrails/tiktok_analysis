package androidx.work.impl.workers;

import X.AbstractC795160VHe;
import X.C0VH0;
import X.C0VI1;
import X.C0VI8;
import X.C0VI9;
import X.C0VIG;
import X.C0VIH;
import X.C0VII;
import X.C0VIK;
import X.C0VN0;
import X.C0VN5;
import X.C786410Ut5;
import X.C795180VHg;
import X.C795260VHo;
import X.C795290VHr;
import X.C795380VIa;
import X.C795450VIh;
import X.InterfaceC794970VGl;
import X.InterfaceC795100VGy;
import X.InterfaceC795140VHc;
import X.InterfaceC795350VHx;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class DiagnosticsWorker extends Worker {
    static {
        C0VI8.LIZIZ("DiagnosticsWrkr");
    }

    @Override // androidx.work.Worker
    public final AbstractC795160VHe LJII() throws Throwable {
        WorkDatabase workDatabase = C0VI1.LJII(this.LL).LIZJ;
        InterfaceC794970VGl interfaceC794970VGlLJIIIIZZ = workDatabase.LJIIIIZZ();
        InterfaceC795350VHx interfaceC795350VHxLJFF = workDatabase.LJFF();
        InterfaceC795140VHc interfaceC795140VHcLJIIIZ = workDatabase.LJIIIZ();
        InterfaceC795100VGy interfaceC795100VGyLIZJ = workDatabase.LIZJ();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        C0VIH c0vih = (C0VIH) interfaceC794970VGlLJIIIIZZ;
        c0vih.getClass();
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        c0vn5LIZLLL.LJIJ(1, jCurrentTimeMillis);
        c0vih.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(c0vih.LIZ, c0vn5LIZLLL, false);
        try {
            try {
                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "required_network_type");
                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "requires_charging");
                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "requires_device_idle");
                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "requires_battery_not_low");
                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "requires_storage_not_low");
                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "trigger_content_update_delay");
                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "trigger_max_content_delay");
                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "content_uri_triggers");
                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "state");
                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "worker_class_name");
                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "input_merger_class_name");
                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "input");
                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "output");
                int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "initial_delay");
                int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "interval_duration");
                int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "flex_duration");
                int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "run_attempt_count");
                int iLIZIZ19 = C795450VIh.LIZIZ(cursorLIZIZ, "backoff_policy");
                int iLIZIZ20 = C795450VIh.LIZIZ(cursorLIZIZ, "backoff_delay_duration");
                int iLIZIZ21 = C795450VIh.LIZIZ(cursorLIZIZ, "period_start_time");
                int iLIZIZ22 = C795450VIh.LIZIZ(cursorLIZIZ, "minimum_retention_duration");
                int iLIZIZ23 = C795450VIh.LIZIZ(cursorLIZIZ, "schedule_requested_at");
                int iLIZIZ24 = C795450VIh.LIZIZ(cursorLIZIZ, "run_in_foreground");
                int iLIZIZ25 = C795450VIh.LIZIZ(cursorLIZIZ, "out_of_quota_policy");
                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                while (cursorLIZIZ.moveToNext()) {
                    String string = cursorLIZIZ.getString(iLIZIZ9);
                    String string2 = cursorLIZIZ.getString(iLIZIZ11);
                    C0VIK c0vik = new C0VIK();
                    c0vik.LIZ = C0VII.LIZJ(cursorLIZIZ.getInt(iLIZIZ));
                    c0vik.LIZIZ = cursorLIZIZ.getInt(iLIZIZ2) != 0;
                    c0vik.LIZJ = cursorLIZIZ.getInt(iLIZIZ3) != 0;
                    c0vik.LIZLLL = cursorLIZIZ.getInt(iLIZIZ4) != 0;
                    c0vik.LJ = cursorLIZIZ.getInt(iLIZIZ5) != 0;
                    c0vik.LJFF = cursorLIZIZ.getLong(iLIZIZ6);
                    c0vik.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                    c0vik.LJII = C0VII.LIZ(cursorLIZIZ.getBlob(iLIZIZ8));
                    C0VIG c0vig = new C0VIG(string, string2);
                    c0vig.LIZIZ = C0VII.LJ(cursorLIZIZ.getInt(iLIZIZ10));
                    c0vig.LIZLLL = cursorLIZIZ.getString(iLIZIZ12);
                    c0vig.LJ = C795380VIa.LIZ(cursorLIZIZ.getBlob(iLIZIZ13));
                    c0vig.LJFF = C795380VIa.LIZ(cursorLIZIZ.getBlob(iLIZIZ14));
                    c0vig.LJI = cursorLIZIZ.getLong(iLIZIZ15);
                    c0vig.LJII = cursorLIZIZ.getLong(iLIZIZ16);
                    c0vig.LJIIIIZZ = cursorLIZIZ.getLong(iLIZIZ17);
                    c0vig.LJIIJ = cursorLIZIZ.getInt(iLIZIZ18);
                    c0vig.LJIIJJI = C0VII.LIZIZ(cursorLIZIZ.getInt(iLIZIZ19));
                    c0vig.LJIIL = cursorLIZIZ.getLong(iLIZIZ20);
                    c0vig.LJIILIIL = cursorLIZIZ.getLong(iLIZIZ21);
                    c0vig.LJIILJJIL = cursorLIZIZ.getLong(iLIZIZ22);
                    c0vig.LJIILL = cursorLIZIZ.getLong(iLIZIZ23);
                    c0vig.LJIILLIIL = cursorLIZIZ.getInt(iLIZIZ24) != 0;
                    c0vig.LJIIZILJ = C0VII.LIZLLL(cursorLIZIZ.getInt(iLIZIZ25));
                    c0vig.LJIIIZ = c0vik;
                    arrayList.add(c0vig);
                }
                cursorLIZIZ.close();
                c0vn5LIZLLL.release();
                List<C0VIG> listLIZLLL = c0vih.LIZLLL();
                List listLIZIZ = c0vih.LIZIZ();
                if (!arrayList.isEmpty()) {
                    C0VI8.LIZ().getClass();
                    C0VI8 c0vi8LIZ = C0VI8.LIZ();
                    LJIIIIZZ(interfaceC795350VHxLJFF, interfaceC795140VHcLJIIIZ, interfaceC795100VGyLIZJ, arrayList);
                    c0vi8LIZ.getClass();
                }
                if (!((ArrayList) listLIZLLL).isEmpty()) {
                    C0VI8.LIZ().getClass();
                    C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
                    LJIIIIZZ(interfaceC795350VHxLJFF, interfaceC795140VHcLJIIIZ, interfaceC795100VGyLIZJ, listLIZLLL);
                    c0vi8LIZ2.getClass();
                }
                if (!((ArrayList) listLIZIZ).isEmpty()) {
                    C0VI8.LIZ().getClass();
                    C0VI8 c0vi8LIZ3 = C0VI8.LIZ();
                    LJIIIIZZ(interfaceC795350VHxLJFF, interfaceC795140VHcLJIIIZ, interfaceC795100VGyLIZJ, listLIZIZ);
                    c0vi8LIZ3.getClass();
                }
                return new C795180VHg();
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                cursorLIZIZ.close();
                c0vn5LIZLLL.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static void LJIIIIZZ(InterfaceC795350VHx interfaceC795350VHx, InterfaceC795140VHc interfaceC795140VHc, InterfaceC795100VGy interfaceC795100VGy, List list) {
        Integer numValueOf;
        C786410Ut5.j4("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{"Job Id"});
        for (C0VIG c0vig : (ArrayList) list) {
            C0VH0 c0vh0LIZ = ((C0VI9) interfaceC795100VGy).LIZ(c0vig.LIZ);
            if (c0vh0LIZ != null) {
                numValueOf = Integer.valueOf(c0vh0LIZ.LIZIZ);
            } else {
                numValueOf = null;
            }
            String str = c0vig.LIZ;
            C795290VHr c795290VHr = (C795290VHr) interfaceC795350VHx;
            c795290VHr.getClass();
            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                c0vn5LIZLLL.LLD(1);
            } else {
                c0vn5LIZLLL.LJIILIIL(1, str);
            }
            c795290VHr.LIZ.assertNotSuspendingTransaction();
            Cursor cursorLIZIZ = C0VN0.LIZIZ(c795290VHr.LIZ, c0vn5LIZLLL, false);
            try {
                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                while (cursorLIZIZ.moveToNext()) {
                    arrayList.add(cursorLIZIZ.getString(0));
                }
                cursorLIZIZ.close();
                c0vn5LIZLLL.release();
                C786410Ut5.j4("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{c0vig.LIZ, c0vig.LIZJ, numValueOf, c0vig.LIZIZ.name(), TextUtils.join(",", arrayList), TextUtils.join(",", ((C795260VHo) interfaceC795140VHc).LIZ(c0vig.LIZ))});
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                cursorLIZIZ.close();
                c0vn5LIZLLL.release();
                throw th;
            }
        }
    }
}
