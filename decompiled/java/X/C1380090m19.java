package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.model.CommonResponse;
import com.ss.android.ugc.aweme.setting.model.RestrictInfo;
import com.ss.android.ugc.aweme.setting.model.RestrictInfoResponse;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.0m19, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380090m19 {
    public static final InterfaceC1380100m1A LIZ = (InterfaceC1380100m1A) C09S2.LIZJ(InterfaceC1380100m1A.class, C0CQT.LIZJ);

    public static RestrictInfo LIZ(String str) {
        try {
            RestrictInfoResponse restrictInfoResponse = LIZ.LIZIZ(str).get();
            if (restrictInfoResponse != null) {
                restrictInfoResponse.mRestrictInfo.awemeId = str;
                return restrictInfoResponse.mRestrictInfo;
            }
            return null;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static CommonResponse LIZIZ(String str) {
        try {
            return LIZ.LIZ(str).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }
}
