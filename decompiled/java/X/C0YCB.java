package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YCB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YCB {
    public static final C0YCB COLUMN_CHAIN_TYPE;
    public static final C0YCB COLUMN_CONVERSATION_ID;
    public static final C0YCB COLUMN_CREATED_AT;
    public static final C0YCB COLUMN_CURSOR;
    public static final C0YCB COLUMN_DURATION;
    public static final C0YCB COLUMN_ERROR_CODE;
    public static final C0YCB COLUMN_ERROR_MSG;
    public static final C0YCB COLUMN_ID;
    public static final C0YCB COLUMN_INBOX_TYPE;
    public static final C0YCB COLUMN_LOG_ID;
    public static final C0YCB COLUMN_MESSAGE_ID;
    public static final C0YCB COLUMN_MESSAGE_SOURCE;
    public static final C0YCB COLUMN_MESSAGE_TYPE;
    public static final C0YCB COLUMN_PROCESS_RESULT;
    public static final C0YCB COLUMN_SERVER_MESSAGE_ID;
    public static final C0YCB COLUMN_SUB_ERROR_CODE;
    public static final C0YCB COLUMN_SUB_MESSAGE_TYPE;
    public static final C0YCB COLUMN_UPDATED_AT;
    public static final /* synthetic */ C0YCB[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C0YCB> getEntries() {
        return LLILZ;
    }

    static {
        C0YCB c0ycb = new C0YCB("COLUMN_ID", 0, FollowStatusChangeMethod.PARAM_UID, "INTEGER PRIMARY KEY AUTOINCREMENT");
        COLUMN_ID = c0ycb;
        C0YCB c0ycb2 = new C0YCB("COLUMN_CURSOR", 1, "cursor", "TEXT NOT NULL UNIQUE");
        COLUMN_CURSOR = c0ycb2;
        C0YCB c0ycb3 = new C0YCB("COLUMN_SERVER_MESSAGE_ID", 2, "server_message_id", "TEXT NOT NULL");
        COLUMN_SERVER_MESSAGE_ID = c0ycb3;
        C0YCB c0ycb4 = new C0YCB("COLUMN_CREATED_AT", 3, "created_at", "DATETIME DEFAULT CURRENT_TIMESTAMP");
        COLUMN_CREATED_AT = c0ycb4;
        C0YCB c0ycb5 = new C0YCB("COLUMN_UPDATED_AT", 4, "updated_at", "DATETIME DEFAULT CURRENT_TIMESTAMP");
        COLUMN_UPDATED_AT = c0ycb5;
        C0YCB c0ycb6 = new C0YCB("COLUMN_PROCESS_RESULT", 5, "process_result", "INTEGER NOT NULL");
        COLUMN_PROCESS_RESULT = c0ycb6;
        C0YCB c0ycb7 = new C0YCB("COLUMN_INBOX_TYPE", 6, "inbox_type", "INTEGER NOT NULL");
        COLUMN_INBOX_TYPE = c0ycb7;
        C0YCB c0ycb8 = new C0YCB("COLUMN_CHAIN_TYPE", 7, "chain_type", "INTEGER NOT NULL");
        COLUMN_CHAIN_TYPE = c0ycb8;
        C0YCB c0ycb9 = new C0YCB("COLUMN_SUB_ERROR_CODE", 8, "sub_error_code", "TEXT NOT NULL DEFAULT ''");
        COLUMN_SUB_ERROR_CODE = c0ycb9;
        C0YCB c0ycb10 = new C0YCB("COLUMN_CONVERSATION_ID", 9, "conversation_id", "TEXT NOT NULL DEFAULT ''");
        COLUMN_CONVERSATION_ID = c0ycb10;
        C0YCB c0ycb11 = new C0YCB("COLUMN_MESSAGE_ID", 10, "message_id", "TEXT NOT NULL DEFAULT ''");
        COLUMN_MESSAGE_ID = c0ycb11;
        C0YCB c0ycb12 = new C0YCB("COLUMN_MESSAGE_TYPE", 11, "message_type", "TEXT NOT NULL DEFAULT ''");
        COLUMN_MESSAGE_TYPE = c0ycb12;
        C0YCB c0ycb13 = new C0YCB("COLUMN_SUB_MESSAGE_TYPE", 12, "sub_message_type", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_SUB_MESSAGE_TYPE = c0ycb13;
        C0YCB c0ycb14 = new C0YCB("COLUMN_DURATION", 13, "duration", "INTEGER NOT NULL DEFAULT 0");
        COLUMN_DURATION = c0ycb14;
        C0YCB c0ycb15 = new C0YCB("COLUMN_LOG_ID", 14, "log_id", "TEXT NOT NULL DEFAULT ''");
        COLUMN_LOG_ID = c0ycb15;
        C0YCB c0ycb16 = new C0YCB("COLUMN_ERROR_MSG", 15, "error_msg", "TEXT NOT NULL DEFAULT ''");
        COLUMN_ERROR_MSG = c0ycb16;
        C0YCB c0ycb17 = new C0YCB("COLUMN_MESSAGE_SOURCE", 16, "message_source", "INTEGER NOT NULL DEFAULT -1");
        COLUMN_MESSAGE_SOURCE = c0ycb17;
        C0YCB c0ycb18 = new C0YCB("COLUMN_ERROR_CODE", 17, "error_code", "TEXT NOT NULL DEFAULT ''");
        COLUMN_ERROR_CODE = c0ycb18;
        C0YCB[] c0ycbArr = {c0ycb, c0ycb2, c0ycb3, c0ycb4, c0ycb5, c0ycb6, c0ycb7, c0ycb8, c0ycb9, c0ycb10, c0ycb11, c0ycb12, c0ycb13, c0ycb14, c0ycb15, c0ycb16, c0ycb17, c0ycb18};
        LLILLL = c0ycbArr;
        LLILZ = new C2254308sP(c0ycbArr);
    }

    public static C0YCB[] values() {
        return (C0YCB[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static C0YCB valueOf(String str) {
        return (C0YCB) C08FF.LIZ(C0YCB.class, str);
    }

    public C0YCB(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
