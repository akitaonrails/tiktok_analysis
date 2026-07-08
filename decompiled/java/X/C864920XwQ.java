package X;

import com.bytedance.im.core.proto.Response;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0XwQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C864920XwQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C0YJ9 c0yj9, C0YIN c0yin, C0YEM c0yem) {
        try {
            Response response = c0yin.LLIZ;
            if (response != null) {
                c0yj9.LIZ(response.log_id, "log_id");
                c0yj9.LIZ(c0yin.LLIZ.status_code, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c0yem.LJIIZILJ().LJFF().getEventTracker().LJ(e);
        }
    }
}
