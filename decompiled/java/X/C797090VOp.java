package X;

import android.database.SQLException;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0VOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C797090VOp {
    public static final List<AbstractC796510VMj> LIZ = C1697810uHb.LJIIJJI(new AbstractC796510VMj() { // from class: X.0VOk
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN EXT_IMAGE_SHORTCUT_KEY TEXT NOT NULL DEFAULT ''");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                Npth.reportBizException("tako", e, "migration_30_to_31 fail", C2097608Jq.LJ());
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VOl
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE CONFIG ADD COLUMN SHOWED_LANGUAGE_STYLE_GUIDE_POPUP INTEGER NOT NULL DEFAULT 0");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                Npth.reportBizException("tako", e, "migration_31_to_32 fail", C2097608Jq.LJ());
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VOm
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN MODE_SOURCE TEXT NOT NULL DEFAULT ''");
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN IMAGE_TEMPLATE_ID TEXT NOT NULL DEFAULT ''");
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN IMAGE_STYLE_NAME TEXT NOT NULL DEFAULT ''");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                Npth.reportBizException("tako", e, "migration_32_to_33 fail", C2097608Jq.LJ());
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VOn
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN RETRIED INTEGER NOT NULL DEFAULT 0");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                Npth.reportBizException("tako", e, "migration_33_to_34 fail", C2097608Jq.LJ());
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VOo
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN EXT_ACTIVE_TEMPLATE_TYPE INTEGER");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                Npth.reportBizException("tako", e, "migration_34_to_35 fail", C2097608Jq.LJ());
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VOq
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN EXT_HASHTAGS TEXT NOT NULL DEFAULT ''");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                Npth.reportBizException("tako", e, "migration_35_to_36 fail", C2097608Jq.LJ());
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VOr
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN IMAGE_TAB_ID TEXT NOT NULL DEFAULT ''");
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN IMAGE_TEMPLATE_TAB TEXT NOT NULL DEFAULT ''");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                Npth.reportBizException("tako", e, "migration_36_to_37 fail", C2097608Jq.LJ());
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VOs
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN AIGC_STANDARD_RATIO INTEGER");
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN INPUT_SKILL_MODE TEXT");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                Npth.reportBizException("tako", e, "migration_37_to_38 fail", C2097608Jq.LJ());
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VOt
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN EDIT_INFO TEXT NOT NULL DEFAULT ''");
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN REFERENCE_INFO TEXT NOT NULL DEFAULT ''");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                Npth.reportBizException("tako", e, "migration_38_to_39 fail", C2097608Jq.LJ());
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VOu
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS CONFIG_NEW (\n    TIK_BOT_CONVERSATION_ID TEXT NOT NULL PRIMARY KEY,\n    MESSAGE_CURSOR INTEGER NOT NULL,\n    SHOWED_DISCLAIMER_POPUP INTEGER NOT NULL,\n    ACCEPTED_DISCLAIMER_POPUP INTEGER NOT NULL,\n    DISCLAIMER_POPUP_TYPE INTEGER NOT NULL,\n    SHOWED_MEMORY_GUIDE_POPUP INTEGER NOT NULL,\n    SWITCH_STATUS TEXT NOT NULL,\n    USER_SEND INTEGER NOT NULL,\n    BOT_ID INTEGER NOT NULL,\n    BOT_SOURCE INTEGER NOT NULL,\n    SHOWED_LANGUAGE_STYLE_GUIDE_POPUP INTEGER NOT NULL\n)");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS CONVERSATION_NEW (\n    CONVERSATION_ID TEXT NOT NULL,\n    SUB_CONVERSATION_ID TEXT NOT NULL DEFAULT '',\n    STATUS INTEGER NOT NULL DEFAULT 0,\n    HISTORY_CURSOR INTEGER NOT NULL DEFAULT -1,\n    READ_CURSOR INTEGER NOT NULL DEFAULT -1,\n    TITLE TEXT DEFAULT NULL,\n    UNREAD_COUNT INTEGER NOT NULL,\n    LATEST_MESSAGE_TIME INTEGER NOT NULL,\n    RELATED_VIDEO TEXT DEFAULT NULL,\n    PRIMARY KEY (CONVERSATION_ID, SUB_CONVERSATION_ID)\n)");
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN SUB_CONVERSATION_ID TEXT NOT NULL DEFAULT ''");
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN IS_PUSH_MSG INTEGER NOT NULL DEFAULT 0");
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN SUB_SERVER_SEQ INTEGER NOT NULL DEFAULT -1");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO CONFIG_NEW (\n    TIK_BOT_CONVERSATION_ID, MESSAGE_CURSOR, SHOWED_DISCLAIMER_POPUP,\n    ACCEPTED_DISCLAIMER_POPUP, DISCLAIMER_POPUP_TYPE, SHOWED_MEMORY_GUIDE_POPUP,\n    SWITCH_STATUS, USER_SEND, BOT_ID, BOT_SOURCE, SHOWED_LANGUAGE_STYLE_GUIDE_POPUP\n)\nSELECT \n    TIK_BOT_CONVERSATION_ID, MESSAGE_CURSOR, SHOWED_DISCLAIMER_POPUP,\n    ACCEPTED_DISCLAIMER_POPUP, DISCLAIMER_POPUP_TYPE, SHOWED_MEMORY_GUIDE_POPUP,\n    SWITCH_STATUS, USER_SEND, BOT_ID, BOT_SOURCE, SHOWED_LANGUAGE_STYLE_GUIDE_POPUP\nFROM CONFIG");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO CONVERSATION_NEW (\n    CONVERSATION_ID, SUB_CONVERSATION_ID, STATUS, HISTORY_CURSOR,\n    READ_CURSOR, TITLE, UNREAD_COUNT, LATEST_MESSAGE_TIME, RELATED_VIDEO\n)\nSELECT \n    CONVERSATION_ID, '', 0, HISTORY_CURSOR,\n    READ_CURSOR, NULL, 0, 0, NULL\nFROM CONVERSATION");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                Npth.reportBizException("tako", e, "migration_39_to_40 fail", C2097608Jq.LJ());
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VOv
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN HIDE_PUSH_MESSAGE_BUTTON INTEGER NOT NULL DEFAULT 0");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                Npth.reportBizException("tako", e, "migration_40_to_41 fail", C2097608Jq.LJ());
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VOw
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN IS_UNCHANGED_TAKO_TEMPLATE INTEGER NOT NULL DEFAULT 0");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                Npth.reportBizException("tako", e, "migration_41_to_42 fail", C2097608Jq.LJ());
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VOx
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN MULTI_BODY TEXT NOT NULL DEFAULT ''");
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN IS_MULTI_ANSWER INTEGER NOT NULL DEFAULT 0");
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN SELECTED_ANSWER_INDEX INTEGER NOT NULL DEFAULT 0");
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN IS_DEGRADED INTEGER NOT NULL DEFAULT 0");
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN IS_REGEN_DEPRECATED INTEGER NOT NULL DEFAULT 0");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                Npth.reportBizException("tako", e, "migration_42_to_43 fail", C2097608Jq.LJ());
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VOy
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                c0vlf.LJIILJJIL("ALTER TABLE MESSAGE ADD COLUMN IMAGE_TEMPLATE_INFO TEXT NOT NULL DEFAULT ''");
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
                Npth.reportBizException("tako", e, "migration_43_to_44 fail", C2097608Jq.LJ());
            }
        }
    });
}
