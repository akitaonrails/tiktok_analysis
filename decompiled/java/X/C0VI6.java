package X;

/* JADX INFO: renamed from: X.0VI6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VI6 {
    public static final C795890VJz LIZ = new AbstractC796510VMj() { // from class: X.0VJz
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c0vlf.LJIILJJIL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            c0vlf.LJIILJJIL("DROP TABLE IF EXISTS alarmInfo");
            c0vlf.LJIILJJIL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    };
    public static final C0VK0 LIZIZ = new AbstractC796510VMj() { // from class: X.0VK0
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    };
    public static final C0VK1 LIZJ = new AbstractC796510VMj() { // from class: X.0VK1
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            c0vlf.LJIILJJIL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    };
    public static final C0VK2 LIZLLL = new AbstractC796510VMj() { // from class: X.0VK2
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    };
    public static final C0VK3 LJ = new AbstractC796510VMj() { // from class: X.0VK3
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    };
    public static final C0VK4 LJFF = new AbstractC796510VMj() { // from class: X.0VK4
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    };
    public static final C0VK5 LJI = new AbstractC796510VMj() { // from class: X.0VK5
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            c0vlf.LJIILJJIL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    };
}
