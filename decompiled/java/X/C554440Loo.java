package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Loo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554440Loo {
    public static final C554440Loo LIZ = new C554440Loo();

    public static void LJFF(String str, String str2) {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("business", str);
        c543670LTx.LIZ.put("task_type", str2);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZIZ("aigc_prompt_task_request", c543670LTx.LJ());
    }

    public static void LIZ(long j, String str, boolean z) {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(z ? 1 : 0));
        c543670LTx.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - j));
        if (!z) {
            c543670LTx.LIZLLL("error_msg", str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ai_alive_mix_editing_result, ");
        sbLIZ.append(c543670LTx.LJ());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZIZ("ai_alive_mix_editing_result", c543670LTx.LJ());
    }

    public static void LIZJ(String str, String str2, Function1 function1) {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("business", str);
        c543670LTx.LIZ.put("task_type", str2);
        if (function1 != null) {
            function1.invoke(c543670LTx);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("creation_async_task_start, ");
        sbLIZ.append(c543670LTx.LJ());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZIZ("creation_async_task_start", c543670LTx.LJ());
    }

    public static void LIZIZ(String str, String str2, boolean z, long j, Integer num, String str3, Function1 function1) {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("business", str);
        c543670LTx.LIZ.put("task_type", str2);
        c543670LTx.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(z ? 1 : 0));
        c543670LTx.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - j));
        if (!z) {
            c543670LTx.LIZ.put("error_code", num);
            c543670LTx.LIZLLL("error_msg", str3);
        }
        if (function1 != null) {
            function1.invoke(c543670LTx);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("creation_async_task_result, ");
        sbLIZ.append(c543670LTx.LJ());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZIZ("creation_async_task_result", c543670LTx.LJ());
    }

    public static void LIZLLL(int i, int i2, long j, String str, int i3, String str2, String str3) {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("business", str);
        c543670LTx.LIZ.put("task_type", str2);
        c543670LTx.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i));
        c543670LTx.LIZ.put("duration", Long.valueOf(j));
        c543670LTx.LIZ.put("retry_times", Integer.valueOf(i2));
        c543670LTx.LIZ.put("error_code", Integer.valueOf(i3));
        c543670LTx.LIZ.put("error_msg", str3);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZIZ("aigc_prompt_task_finish", c543670LTx.LJ());
    }
}
