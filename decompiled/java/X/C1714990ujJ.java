package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ujJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714990ujJ {
    public static AbstractC989680brS LIZ(BaseResponse baseResponse) {
        if (baseResponse == null) {
            return new C989670brR(new C1707030uWT());
        }
        try {
            if (Intrinsics.LJFF(baseResponse.resultCode, "success")) {
                return new C989660brQ(baseResponse.data);
            }
            return new C991330bu7(baseResponse.resultCode, baseResponse.errorCode, baseResponse.errorMessage);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new C989670brR(th);
        }
    }
}
