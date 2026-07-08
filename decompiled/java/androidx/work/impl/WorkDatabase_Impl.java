package androidx.work.impl;

import X.C0VI4;
import X.C0VI9;
import X.C0VIF;
import X.C0VIH;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C795190VHh;
import X.C795260VHo;
import X.C795290VHr;
import X.C796520VMk;
import X.C796620VMu;
import X.InterfaceC794970VGl;
import X.InterfaceC795100VGy;
import X.InterfaceC795120VHa;
import X.InterfaceC795130VHb;
import X.InterfaceC795140VHc;
import X.InterfaceC795340VHw;
import X.InterfaceC795350VHx;
import X.InterfaceC796190VLd;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile C0VIH LLILLL;
    public volatile C795190VHh LLILZ;
    public volatile C795260VHo LLILZIL;
    public volatile C0VI9 LLILZLL;
    public volatile C795290VHr LLIZ;
    public volatile C0VIF LLIZLLLIL;
    public volatile C0VI4 LLJ;

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC795120VHa LIZ() {
        C795190VHh c795190VHh;
        if (this.LLILZ != null) {
            return this.LLILZ;
        }
        synchronized (this) {
            try {
                if (this.LLILZ == null) {
                    this.LLILZ = new C795190VHh(this);
                }
                c795190VHh = this.LLILZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c795190VHh;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC795340VHw LIZIZ() {
        C0VI4 c0vi4;
        if (this.LLJ != null) {
            return this.LLJ;
        }
        synchronized (this) {
            try {
                if (this.LLJ == null) {
                    this.LLJ = new C0VI4(this);
                }
                c0vi4 = this.LLJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vi4;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC795100VGy LIZJ() {
        C0VI9 c0vi9;
        if (this.LLILZLL != null) {
            return this.LLILZLL;
        }
        synchronized (this) {
            try {
                if (this.LLILZLL == null) {
                    this.LLILZLL = new C0VI9(this);
                }
                c0vi9 = this.LLILZLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vi9;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC795350VHx LJFF() {
        C795290VHr c795290VHr;
        if (this.LLIZ != null) {
            return this.LLIZ;
        }
        synchronized (this) {
            try {
                if (this.LLIZ == null) {
                    this.LLIZ = new C795290VHr(this);
                }
                c795290VHr = this.LLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c795290VHr;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC795130VHb LJI() {
        C0VIF c0vif;
        if (this.LLIZLLLIL != null) {
            return this.LLIZLLLIL;
        }
        synchronized (this) {
            try {
                if (this.LLIZLLLIL == null) {
                    this.LLIZLLLIL = new C0VIF(this);
                }
                c0vif = this.LLIZLLLIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vif;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC794970VGl LJIIIIZZ() {
        C0VIH c0vih;
        if (this.LLILLL != null) {
            return this.LLILLL;
        }
        synchronized (this) {
            try {
                if (this.LLILLL == null) {
                    this.LLILLL = new C0VIH(this);
                }
                c0vih = this.LLILLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vih;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC795140VHc LJIIIZ() {
        C795260VHo c795260VHo;
        if (this.LLILZIL != null) {
            return this.LLILZIL;
        }
        synchronized (this) {
            try {
                if (this.LLILZIL == null) {
                    this.LLILZIL = new C795260VHo(this);
                }
                c795260VHo = this.LLILZIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c795260VHo;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("PRAGMA defer_foreign_keys = TRUE");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `Dependency`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `WorkSpec`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `WorkTag`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `SystemIdInfo`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `WorkName`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `WorkProgress`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `Preference`");
            super.setTransactionSuccessful();
            super.endTransaction();
            c0vlfLJLJJI.query("PRAGMA wal_checkpoint(FULL)").close();
            if (c0vlfLJLJJI.LJJIJIIJI()) {
                return;
            }
            c0vlfLJLJJI.LJIILJJIL("VACUUM");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.endTransaction();
            c0vlfLJLJJI.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!c0vlfLJLJJI.LJJIJIIJI()) {
                c0vlfLJLJJI.LJIILJJIL("VACUUM");
            }
            throw th;
        }
    }

    @Override // X.AbstractC796540VMm
    public final C796620VMu createInvalidationTracker() {
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0VK7
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(12);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c0vlf.LJIILJJIL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                c0vlf.LJIILJJIL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                c0vlf.LJIILJJIL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                c0vlf.LJIILJJIL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c0vlf.LJIILJJIL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c0vlf.LJIILJJIL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `Dependency`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `WorkSpec`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `WorkTag`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `SystemIdInfo`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `WorkName`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `WorkProgress`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `Preference`");
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.get(this.LIZ.mCallbacks, i).getClass();
                    }
                }
            }

            @Override // X.C0VN3
            public final void onCreate(C0VLF c0vlf) {
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.get(this.LIZ.mCallbacks, i).getClass();
                    }
                }
            }

            @Override // X.C0VN3
            public final void onOpen(C0VLF c0vlf) {
                this.LIZ.mDatabase = c0vlf;
                c0vlf.LJIILJJIL("PRAGMA foreign_keys = ON");
                this.LIZ.internalInitInvalidationTracker(c0vlf);
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((C0VK6) ListProtector.get(this.LIZ.mCallbacks, i)).LIZ(c0vlf);
                    }
                }
            }

            @Override // X.C0VN3
            public final void onPreMigrate(C0VLF c0vlf) {
                C0VN0.LIZ(c0vlf);
            }

            @Override // X.C0VN3
            public final C0VN4 onValidateSchema(C0VLF c0vlf) {
                HashMap map = new HashMap(2);
                map.put("work_spec_id", new C795990VKj(1, 1, "work_spec_id", "TEXT", null, true));
                map.put("prerequisite_id", new C795990VKj(2, 1, "prerequisite_id", "TEXT", null, true));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new C1180804je("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FollowStatusChangeMethod.PARAM_UID)));
                hashSet.add(new C1180804je("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(FollowStatusChangeMethod.PARAM_UID)));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new C796450VMd(Arrays.asList("work_spec_id"), "index_Dependency_work_spec_id", null, false));
                hashSet2.add(new C796450VMd(Arrays.asList("prerequisite_id"), "index_Dependency_prerequisite_id", null, false));
                C0VN6 c0vn6 = new C0VN6("Dependency", map, hashSet, hashSet2);
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "Dependency");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                HashMap map2 = new HashMap(25);
                map2.put(FollowStatusChangeMethod.PARAM_UID, new C795990VKj(1, 1, FollowStatusChangeMethod.PARAM_UID, "TEXT", null, true));
                map2.put("state", new C795990VKj(0, 1, "state", "INTEGER", null, true));
                map2.put("worker_class_name", new C795990VKj(0, 1, "worker_class_name", "TEXT", null, true));
                map2.put("input_merger_class_name", new C795990VKj(0, 1, "input_merger_class_name", "TEXT", null, false));
                map2.put("input", new C795990VKj(0, 1, "input", "BLOB", null, true));
                map2.put("output", new C795990VKj(0, 1, "output", "BLOB", null, true));
                map2.put("initial_delay", new C795990VKj(0, 1, "initial_delay", "INTEGER", null, true));
                map2.put("interval_duration", new C795990VKj(0, 1, "interval_duration", "INTEGER", null, true));
                map2.put("flex_duration", new C795990VKj(0, 1, "flex_duration", "INTEGER", null, true));
                map2.put("run_attempt_count", new C795990VKj(0, 1, "run_attempt_count", "INTEGER", null, true));
                map2.put("backoff_policy", new C795990VKj(0, 1, "backoff_policy", "INTEGER", null, true));
                map2.put("backoff_delay_duration", new C795990VKj(0, 1, "backoff_delay_duration", "INTEGER", null, true));
                map2.put("period_start_time", new C795990VKj(0, 1, "period_start_time", "INTEGER", null, true));
                map2.put("minimum_retention_duration", new C795990VKj(0, 1, "minimum_retention_duration", "INTEGER", null, true));
                map2.put("schedule_requested_at", new C795990VKj(0, 1, "schedule_requested_at", "INTEGER", null, true));
                map2.put("run_in_foreground", new C795990VKj(0, 1, "run_in_foreground", "INTEGER", null, true));
                map2.put("out_of_quota_policy", new C795990VKj(0, 1, "out_of_quota_policy", "INTEGER", null, true));
                map2.put("required_network_type", new C795990VKj(0, 1, "required_network_type", "INTEGER", null, false));
                map2.put("requires_charging", new C795990VKj(0, 1, "requires_charging", "INTEGER", null, true));
                map2.put("requires_device_idle", new C795990VKj(0, 1, "requires_device_idle", "INTEGER", null, true));
                map2.put("requires_battery_not_low", new C795990VKj(0, 1, "requires_battery_not_low", "INTEGER", null, true));
                map2.put("requires_storage_not_low", new C795990VKj(0, 1, "requires_storage_not_low", "INTEGER", null, true));
                map2.put("trigger_content_update_delay", new C795990VKj(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
                map2.put("trigger_max_content_delay", new C795990VKj(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
                map2.put("content_uri_triggers", new C795990VKj(0, 1, "content_uri_triggers", "BLOB", null, false));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(2);
                hashSet4.add(new C796450VMd(Arrays.asList("schedule_requested_at"), "index_WorkSpec_schedule_requested_at", null, false));
                hashSet4.add(new C796450VMd(Arrays.asList("period_start_time"), "index_WorkSpec_period_start_time", null, false));
                C0VN6 c0vn62 = new C0VN6("WorkSpec", map2, hashSet3, hashSet4);
                C0VN6 c0vn6LIZ2 = C0VN6.LIZ(c0vlf, "WorkSpec");
                if (!c0vn62.equals(c0vn6LIZ2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
                    sbLIZ2.append(c0vn62);
                    sbLIZ2.append("\n Found:\n");
                    sbLIZ2.append(c0vn6LIZ2);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ2));
                }
                HashMap map3 = new HashMap(2);
                map3.put("tag", new C795990VKj(1, 1, "tag", "TEXT", null, true));
                map3.put("work_spec_id", new C795990VKj(2, 1, "work_spec_id", "TEXT", null, true));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new C1180804je("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FollowStatusChangeMethod.PARAM_UID)));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new C796450VMd(Arrays.asList("work_spec_id"), "index_WorkTag_work_spec_id", null, false));
                C0VN6 c0vn63 = new C0VN6("WorkTag", map3, hashSet5, hashSet6);
                C0VN6 c0vn6LIZ3 = C0VN6.LIZ(c0vlf, "WorkTag");
                if (!c0vn63.equals(c0vn6LIZ3)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
                    sbLIZ3.append(c0vn63);
                    sbLIZ3.append("\n Found:\n");
                    sbLIZ3.append(c0vn6LIZ3);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ3));
                }
                HashMap map4 = new HashMap(2);
                map4.put("work_spec_id", new C795990VKj(1, 1, "work_spec_id", "TEXT", null, true));
                map4.put("system_id", new C795990VKj(0, 1, "system_id", "INTEGER", null, true));
                HashSet hashSet7 = new HashSet(1);
                hashSet7.add(new C1180804je("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FollowStatusChangeMethod.PARAM_UID)));
                C0VN6 c0vn64 = new C0VN6("SystemIdInfo", map4, hashSet7, new HashSet(0));
                C0VN6 c0vn6LIZ4 = C0VN6.LIZ(c0vlf, "SystemIdInfo");
                if (!c0vn64.equals(c0vn6LIZ4)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
                    sbLIZ4.append(c0vn64);
                    sbLIZ4.append("\n Found:\n");
                    sbLIZ4.append(c0vn6LIZ4);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ4));
                }
                HashMap map5 = new HashMap(2);
                map5.put("name", new C795990VKj(1, 1, "name", "TEXT", null, true));
                map5.put("work_spec_id", new C795990VKj(2, 1, "work_spec_id", "TEXT", null, true));
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new C1180804je("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FollowStatusChangeMethod.PARAM_UID)));
                HashSet hashSet9 = new HashSet(1);
                hashSet9.add(new C796450VMd(Arrays.asList("work_spec_id"), "index_WorkName_work_spec_id", null, false));
                C0VN6 c0vn65 = new C0VN6("WorkName", map5, hashSet8, hashSet9);
                C0VN6 c0vn6LIZ5 = C0VN6.LIZ(c0vlf, "WorkName");
                if (!c0vn65.equals(c0vn6LIZ5)) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
                    sbLIZ5.append(c0vn65);
                    sbLIZ5.append("\n Found:\n");
                    sbLIZ5.append(c0vn6LIZ5);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ5));
                }
                HashMap map6 = new HashMap(2);
                map6.put("work_spec_id", new C795990VKj(1, 1, "work_spec_id", "TEXT", null, true));
                map6.put("progress", new C795990VKj(0, 1, "progress", "BLOB", null, true));
                HashSet hashSet10 = new HashSet(1);
                hashSet10.add(new C1180804je("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FollowStatusChangeMethod.PARAM_UID)));
                C0VN6 c0vn66 = new C0VN6("WorkProgress", map6, hashSet10, new HashSet(0));
                C0VN6 c0vn6LIZ6 = C0VN6.LIZ(c0vlf, "WorkProgress");
                if (!c0vn66.equals(c0vn6LIZ6)) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
                    sbLIZ6.append(c0vn66);
                    sbLIZ6.append("\n Found:\n");
                    sbLIZ6.append(c0vn6LIZ6);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ6));
                }
                HashMap map7 = new HashMap(2);
                map7.put("key", new C795990VKj(1, 1, "key", "TEXT", null, true));
                map7.put("long_value", new C795990VKj(0, 1, "long_value", "INTEGER", null, false));
                C0VN6 c0vn67 = new C0VN6("Preference", map7, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ7 = C0VN6.LIZ(c0vlf, "Preference");
                if (!c0vn67.equals(c0vn6LIZ7)) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
                    sbLIZ7.append(c0vn67);
                    sbLIZ7.append("\n Found:\n");
                    sbLIZ7.append(c0vn6LIZ7);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ7));
                }
                return new C0VN4(true, null);
            }
        }, "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        C0VKN c0vkn = new C0VKN(c796520VMk.LIZIZ);
        c0vkn.LIZIZ = c796520VMk.LIZJ;
        c0vkn.LIZJ = c0vn2;
        return c796520VMk.LIZ.LIZ(c0vkn.LIZ());
    }
}
