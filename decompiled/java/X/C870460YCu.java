package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0YCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870460YCu {
    public volatile boolean LIZ = true;
    public final Map<Integer, Boolean> LIZIZ = new ConcurrentHashMap();
    public final C0YEM LIZJ;

    public C870460YCu(C0YEM c0yem) {
        this.LIZJ = c0yem;
    }

    public static String LIZ(Throwable th) {
        String message;
        if (th == null || (message = th.getMessage()) == null) {
            return "";
        }
        return message;
    }

    public static String LIZIZ(Throwable th) {
        String stackTraceString;
        if (th == null || (stackTraceString = Log.getStackTraceString(th)) == null || (stackTraceString.length() > 2000 && (stackTraceString = stackTraceString.substring(0, 2000)) == null)) {
            return "";
        }
        return stackTraceString;
    }

    public final void LJIILIIL(int i, Throwable th) {
        String message;
        try {
            if (th.getMessage() != null) {
                message = th.getMessage();
            } else {
                message = "";
            }
            String stackTraceString = Log.getStackTraceString(th);
            if (stackTraceString.length() > 2000) {
                stackTraceString = stackTraceString.substring(0, 2000);
            }
            C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
            c0yj9.LIZJ("im_save_msg_error");
            c0yj9.LIZ(Integer.valueOf(i), "msg_source");
            c0yj9.LIZ(message, "error_msg");
            c0yj9.LIZ(stackTraceString, "error_stack");
            c0yj9.LIZLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIIIZ(EnumC871430YGn enumC871430YGn, long j, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("im_sdk_load_stranger_conv");
        c0yj9.LIZ(Long.valueOf(jCurrentTimeMillis), "duration");
        c0yj9.LIZ(Integer.valueOf(enumC871430YGn.ordinal()), "type");
        c0yj9.LIZ(Integer.valueOf(i), "list_size");
        c0yj9.LJ(0.1f);
    }

    public final void LJIIJ(long j, boolean z, boolean z2) {
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("im_sdk_login_logout_duration");
        c0yj9.LIZ(Boolean.valueOf(z), "is_login");
        c0yj9.LIZ(Long.valueOf(SystemClock.uptimeMillis() - j), "duration");
        c0yj9.LIZ(Boolean.valueOf(z2), "is_success");
        c0yj9.LIZLLL();
    }

    public final void LJIIJJI(boolean z, Throwable th, Context context) {
        String str;
        String name;
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("im_sdk_login_logout_err");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(str, "is_login");
        c0yj9.LIZ("", "raw_ctx");
        if (context != null) {
            name = context.getClass().getName();
        } else {
            name = "null";
        }
        c0yj9.LIZ(name, "app_ctx");
        c0yj9.LIZ(LIZ(th), "error_msg");
        c0yj9.LIZ(LIZIZ(th), "error_stack");
        c0yj9.LJ(1.0f);
    }

    public final void LJ(Throwable th, boolean z, int i, String str) {
        if (z) {
            if (this.LIZJ.LJIIZILJ().LJFF().getEventTracker().LIZJ(0.002f)) {
                C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
                c0yj9.LIZJ("im_sdk_db_op");
                if (str == null) {
                    str = "unknown";
                }
                c0yj9.LIZ(str, "tag");
                c0yj9.LIZ("1", "is_success");
                c0yj9.LIZ(Boolean.valueOf(this.LIZJ.LJIIZILJ().LIZIZ().LIZ().LJIIJ()), "is_encrypted");
                c0yj9.LJFF();
                return;
            }
            return;
        }
        C0YJ9 c0yj92 = new C0YJ9(this.LIZJ);
        c0yj92.LIZJ("im_sdk_db_op");
        if (str == null) {
            str = "unknown";
        }
        c0yj92.LIZ(str, "tag");
        c0yj92.LIZ(CardStruct.IStatusCode.DEFAULT, "is_success");
        c0yj92.LIZ(Boolean.valueOf(this.LIZJ.LJIIZILJ().LIZIZ().LIZ().LJIIJ()), "is_encrypted");
        c0yj92.LIZ(String.valueOf(i), "fail_reason");
        if (th != null) {
            c0yj92.LIZ(LIZ(th), "error_msg");
            c0yj92.LIZ(LIZIZ(th), "error_stack");
        }
        c0yj92.LJFF();
    }

    public final void LJIILJJIL(long j, String str, boolean z, boolean z2) {
        if (this.LIZJ.LJIIZILJ().LJFF().getEventTracker().LIZJ(0.001f)) {
            C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
            c0yj9.LIZJ("imsdk_scoped_io_duration");
            if (str == null) {
                str = "";
            }
            c0yj9.LIZ(str, "op");
            c0yj9.LIZ(Boolean.valueOf(z), "dispatch_to_io");
            c0yj9.LIZ(Long.valueOf(j), "duration_us");
            c0yj9.LIZ(Boolean.valueOf(z2), "is_success");
            c0yj9.LJFF();
        }
    }

    public final void LJFF(long j, int i, int i2, boolean z, boolean z2) {
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("im_sdk_upgrade_downgrade");
        c0yj9.LIZ(Integer.valueOf(i), "old_version");
        c0yj9.LIZ(Integer.valueOf(i2), "new_version");
        c0yj9.LIZ(Long.valueOf(SystemClock.uptimeMillis() - j), "cost_time");
        c0yj9.LIZ(Boolean.valueOf(z), "is_upgrade");
        c0yj9.LIZ(Boolean.valueOf(z2), "is_success");
        c0yj9.LIZ(Boolean.valueOf(C787080UuA.LIZ()), "is_main_thread");
        c0yj9.LIZLLL();
    }

    public final void LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("im_sdk_load_message_request_conv_info");
        c0yj9.LIZ(Integer.valueOf(i), "total_message_request_conv_count");
        c0yj9.LIZ(Integer.valueOf(i2), "inconvertible_message_request_conv_count");
        c0yj9.LIZ(Integer.valueOf(i3), "unread_message_request_conv_count");
        c0yj9.LIZ(Integer.valueOf(i4), "stranger_conv_count");
        c0yj9.LIZ(Integer.valueOf(i5), "risky_conv_count");
        c0yj9.LJ(0.1f);
    }

    public final void LJIIL(long j, String str, long j2, int i, int i2, int i3, String str2) {
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("im_sdk_init_msg_list");
        c0yj9.LIZ(str, "conversation_id");
        c0yj9.LIZ(Long.valueOf(j), "duration");
        c0yj9.LIZ(Integer.valueOf(i), "list_size");
        c0yj9.LIZ(CardStruct.IStatusCode.DEFAULT, "is_from_location");
        c0yj9.LIZ(Integer.valueOf(i2), "result_code");
        c0yj9.LIZ(Integer.valueOf(i3), "error_code");
        c0yj9.LIZ(str2, "error_msg");
        c0yj9.LIZ(Long.valueOf(j2), "last_msg_id");
        c0yj9.LJ(1.0f);
    }

    public final void LJI(String str, boolean z, boolean z2, int i, long j, boolean z3, boolean z4, C0YMW c0ymw) {
        Object obj;
        Object obj2;
        Object obj3;
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("im_sdk_delete_conversation");
        c0yj9.LIZ(str, "conversation_id");
        String str2 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(obj, "is_stranger");
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(obj2, "is_retry");
        c0yj9.LIZ(Integer.valueOf(i), "retry_cnt");
        c0yj9.LIZ(Long.valueOf(j), "del_time");
        if (z4) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(obj3, "mark_delete");
        if (!z3) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(str2, "is_success");
        c0yj9.LIZ(Integer.valueOf(this.LIZJ.LJ().LIZ().LIZIZ() ? 1 : 0), "is_net_available");
        if (!z3 && c0ymw != null) {
            c0yj9.LIZ(Integer.valueOf(c0ymw.getCode()), "error_code");
            c0yj9.LIZ(c0ymw.getLogId(), "log_id");
        }
        c0yj9.LJ(1.0f);
    }

    public final void LIZLLL(boolean z, int i, boolean z2, boolean z3, long j, long j2, long j3, int i2, String str) {
        Object obj;
        Object obj2;
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("im_sdk_conv_async_local");
        String str2 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(obj, "is_partition");
        c0yj9.LIZ(Integer.valueOf(i), "conv_count");
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(obj2, "is_first_init");
        c0yj9.LIZ(Long.valueOf(j), "total_cost");
        if (!z3) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(str2, "is_success");
        c0yj9.LIZ(Long.valueOf(j2), "db_cost");
        c0yj9.LIZ(Integer.valueOf(i2), "error_code");
        c0yj9.LIZ(str, "error_msg");
        if (z) {
            c0yj9.LIZ(Long.valueOf(j3), "partition_cost");
        }
        c0yj9.LJ(1.0f);
    }

    public final void LIZJ(int i, int i2, String str, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i3, String str2) {
        Object obj;
        Object obj2;
        Object obj3;
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("im_pull_push_msg");
        c0yj9.LIZ(Integer.valueOf(i), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0yj9.LIZ(Integer.valueOf(i2), "error_code");
        c0yj9.LIZ(str, "log_id");
        c0yj9.LIZ(l, "duration");
        c0yj9.LIZ(l2, "msg_id");
        String str3 = "1";
        if (bool.booleanValue()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(obj, "is_local");
        if (bool2.booleanValue()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(obj2, "is_fetched");
        if (bool3.booleanValue()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(obj3, "is_saved");
        if (!bool4.booleanValue()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(str3, "is_existing");
        c0yj9.LIZ(Integer.valueOf(i3), "batch_count");
        c0yj9.LIZ(Integer.valueOf(this.LIZJ.LJ().LIZ().isWsConnected() ? 1 : 0), "is_ws_connected");
        c0yj9.LIZ(str2, Scene.SCENE_SERVICE);
        c0yj9.LIZ(Integer.valueOf(this.LIZJ.LJ().LJ().isAppBackground() ? 1 : 0), "is_background");
        c0yj9.LIZLLL();
    }

    public final void LJII(boolean z, int i, long j, int i2, int i3, int i4, C0YMW c0ymw, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        Object obj;
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("im_sdk_init_handler");
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(obj, "is_success");
        c0yj9.LIZ(Integer.valueOf(i), "inbox_type");
        c0yj9.LIZ(Long.valueOf(j), "total_cost");
        c0yj9.LIZ(Integer.valueOf(i2), "page_size");
        c0yj9.LIZ(Integer.valueOf(i3), "conv_count");
        c0yj9.LIZ(Integer.valueOf(i4), "total_msg_count");
        c0yj9.LIZ(Long.valueOf(j2), "response_time_cost");
        c0yj9.LIZ(Long.valueOf(j3), "build_request_time_cost");
        c0yj9.LIZ(Long.valueOf(j4), "save_msg_list_time_cost");
        c0yj9.LIZ(Long.valueOf(j5), "save_conversation_list_time_cost");
        c0yj9.LIZ(Long.valueOf(j6), "save_msg_callback_time_cost");
        c0yj9.LIZ(Long.valueOf(j7), "after_im_init_time_cost");
        c0yj9.LIZ(Long.valueOf(SystemClock.uptimeMillis() - this.LIZJ.LJIILIIL().LJI), "after_sdk_init");
        if (!this.LIZJ.LJ().LJ().isAppBackground()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(str, "is_background");
        c0yj9.LIZ(Long.valueOf(j8), "sp_and_check_wait_time_cost");
        if (!z && c0ymw != null) {
            c0yj9.LIZ(LIZ(c0ymw.getThrowable()), "error_msg");
            c0yj9.LIZ(Integer.valueOf(c0ymw.getCode()), "error_code");
            c0yj9.LIZ(c0ymw.getLogId(), "log_id");
        }
        Map<String, String> mapLJIIIIZZ = this.LIZJ.LJ().getEvent().LJIIIIZZ("im_sdk_init_handler");
        if (mapLJIIIIZZ != null && !mapLJIIIIZZ.isEmpty()) {
            c0yj9.LIZIZ(mapLJIIIIZZ);
        }
        c0yj9.LJ(1.0f);
    }
}
