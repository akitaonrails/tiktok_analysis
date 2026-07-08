package X;

import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VIH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VIH implements InterfaceC794970VGl {
    public final AbstractC796540VMm LIZ;
    public final C854570Xfj LIZIZ;
    public final C854550Xfh LIZJ;
    public final C854550Xfh LIZLLL;
    public final C854550Xfh LJ;
    public final C854550Xfh LJFF;
    public final C854550Xfh LJI;
    public final C854550Xfh LJII;
    public final C854550Xfh LJIIIIZZ;

    public final List LIZIZ() throws Throwable {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        c0vn5LIZLLL.LJIJ(1, 200);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
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
            try {
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
                return arrayList;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        cursorLIZIZ.close();
                        c0vn5LIZLLL.release();
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final List<C0VIG> LIZLLL() throws Throwable {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
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
            try {
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
                return arrayList;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        cursorLIZIZ.close();
                        c0vn5LIZLLL.release();
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final List<C0VIG> LJ() {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
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
            try {
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
                return arrayList;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        cursorLIZIZ.close();
                        c0vn5LIZLLL.release();
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean LJIIJ() {
        boolean z = false;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                if (cursorLIZIZ.getInt(0) != 0) {
                    z = true;
                }
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    public C0VIH(AbstractC796540VMm abstractC796540VMm) {
        this.LIZ = abstractC796540VMm;
        this.LIZIZ = new C854570Xfj(abstractC796540VMm, 17);
        this.LIZJ = new C854550Xfh(abstractC796540VMm, 48);
        this.LIZLLL = new C854550Xfh(abstractC796540VMm, 49);
        this.LJ = new C854550Xfh(abstractC796540VMm, 50);
        this.LJFF = new C854550Xfh(abstractC796540VMm, 51);
        this.LJI = new C854550Xfh(abstractC796540VMm, 52);
        this.LJII = new C854550Xfh(abstractC796540VMm, 53);
        this.LJIIIIZZ = new C854550Xfh(abstractC796540VMm, 54);
        new C854550Xfh(abstractC796540VMm, 55);
    }

    public final void LIZ(String str) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZJ.acquire();
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        this.LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            this.LIZJ.release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            this.LIZJ.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final List<C0VIG> LIZJ(int i) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        c0vn5LIZLLL.LJIJ(1, i);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
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
            try {
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
                    if (cursorLIZIZ.getInt(iLIZIZ2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c0vik.LIZIZ = z;
                    if (cursorLIZIZ.getInt(iLIZIZ3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c0vik.LIZJ = z2;
                    if (cursorLIZIZ.getInt(iLIZIZ4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c0vik.LIZLLL = z3;
                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c0vik.LJ = z4;
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
                    if (cursorLIZIZ.getInt(iLIZIZ24) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c0vig.LJIILLIIL = z5;
                    c0vig.LJIIZILJ = C0VII.LIZLLL(cursorLIZIZ.getInt(iLIZIZ25));
                    c0vig.LJIIIZ = c0vik;
                    arrayList.add(c0vig);
                }
                cursorLIZIZ.close();
                c0vn5LIZLLL.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        cursorLIZIZ.close();
                        c0vn5LIZLLL.release();
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final C0VIP LJFF(String str) {
        C0VIP c0vipLJ;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                c0vipLJ = C0VII.LJ(cursorLIZIZ.getInt(0));
            } else {
                c0vipLJ = null;
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return c0vipLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    public final List<String> LJI(String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                arrayList.add(cursorLIZIZ.getString(0));
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    public final List<String> LJII(String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                arrayList.add(cursorLIZIZ.getString(0));
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    public final C0VIG LJIIIIZZ(String str) {
        C0VIG c0vig;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
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
            try {
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
                if (cursorLIZIZ.moveToFirst()) {
                    String string = cursorLIZIZ.getString(iLIZIZ9);
                    String string2 = cursorLIZIZ.getString(iLIZIZ11);
                    C0VIK c0vik = new C0VIK();
                    c0vik.LIZ = C0VII.LIZJ(cursorLIZIZ.getInt(iLIZIZ));
                    if (cursorLIZIZ.getInt(iLIZIZ2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c0vik.LIZIZ = z;
                    if (cursorLIZIZ.getInt(iLIZIZ3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c0vik.LIZJ = z2;
                    if (cursorLIZIZ.getInt(iLIZIZ4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c0vik.LIZLLL = z3;
                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c0vik.LJ = z4;
                    c0vik.LJFF = cursorLIZIZ.getLong(iLIZIZ6);
                    c0vik.LJI = cursorLIZIZ.getLong(iLIZIZ7);
                    c0vik.LJII = C0VII.LIZ(cursorLIZIZ.getBlob(iLIZIZ8));
                    c0vig = new C0VIG(string, string2);
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
                    if (cursorLIZIZ.getInt(iLIZIZ24) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c0vig.LJIILLIIL = z5;
                    c0vig.LJIIZILJ = C0VII.LIZLLL(cursorLIZIZ.getInt(iLIZIZ25));
                    c0vig.LJIIIZ = c0vik;
                } else {
                    c0vig = null;
                }
                cursorLIZIZ.close();
                c0vn5LIZLLL.release();
                return c0vig;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        cursorLIZIZ.close();
                        c0vn5LIZLLL.release();
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final List<C795360VHy> LJIIIZ(String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "state");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                C795360VHy c795360VHy = new C795360VHy();
                c795360VHy.LIZ = cursorLIZIZ.getString(iLIZIZ);
                c795360VHy.LIZIZ = C0VII.LJ(cursorLIZIZ.getInt(iLIZIZ2));
                arrayList.add(c795360VHy);
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    public final int LJIIJJI(String str) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJFF.acquire();
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        this.LIZ.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            this.LJFF.release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            this.LJFF.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final int LJIILIIL(String str) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJI.acquire();
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        this.LIZ.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            this.LJI.release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            this.LJI.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final int LJIIL(long j, String str) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJII.acquire();
        interfaceC796340VLsAcquire.LJIJ(1, j);
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str);
        }
        this.LIZ.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            this.LJII.release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            this.LJII.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final void LJIILJJIL(String str, C795380VIa c795380VIa) throws IOException {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZLLL.acquire();
        byte[] bArrLIZLLL = C795380VIa.LIZLLL(c795380VIa);
        if (bArrLIZLLL == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJJIIJZLJL(1, bArrLIZLLL);
        }
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str);
        }
        this.LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            this.LIZLLL.release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            this.LIZLLL.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final void LJIILL(long j, String str) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJ.acquire();
        interfaceC796340VLsAcquire.LJIJ(1, j);
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str);
        }
        this.LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            this.LJ.release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            this.LJ.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final int LJIILLIIL(C0VIP c0vip, String... strArr) {
        this.LIZ.assertNotSuspendingTransaction();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=? WHERE id IN (");
        C0VIY.LIZ(sb, strArr.length);
        sb.append(")");
        InterfaceC796340VLs interfaceC796340VLsCompileStatement = this.LIZ.compileStatement(sb.toString());
        interfaceC796340VLsCompileStatement.LJIJ(1, C0VII.LJFF(c0vip));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                interfaceC796340VLsCompileStatement.LLD(i);
            } else {
                interfaceC796340VLsCompileStatement.LJIILIIL(i, str);
            }
            i++;
        }
        this.LIZ.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsCompileStatement.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }
}
