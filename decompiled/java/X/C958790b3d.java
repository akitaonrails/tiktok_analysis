package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.RevenueAlogSetting;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0b3d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958790b3d {
    public static final /* synthetic */ C958790b3d LIZ = new C958790b3d();

    public static InterfaceC954910axN LIZIZ(String str) {
        if (!RevenueAlogSetting.INSTANCE.isEnabled()) {
            return C958780b3c.LIZIZ;
        }
        return new C958800b3e(str, null, 6);
    }

    public static InterfaceC954910axN LIZ(String str, String... strArr) {
        if (!RevenueAlogSetting.INSTANCE.isEnabled()) {
            return C958780b3c.LIZIZ;
        }
        C958800b3e c958800b3e = new C958800b3e(null, str, 5);
        C19719612Di.LJJII(c958800b3e.LJFF, strArr);
        return c958800b3e;
    }

    public static void LIZJ(Throwable th, Function1 function1) {
        if (!RevenueAlogSetting.INSTANCE.isEnabled()) {
            return;
        }
        LIZIZ("network_request_fail").LIZJ(th, function1);
    }

    public static void LIZLLL(BaseResponse baseResponse, Function1 function1) {
        if (!RevenueAlogSetting.INSTANCE.isEnabled()) {
            return;
        }
        LIZIZ("network_request_success").LJI(baseResponse, function1);
    }
}
