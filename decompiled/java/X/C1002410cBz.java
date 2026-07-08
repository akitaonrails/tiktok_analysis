package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.home.repo.network.data.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002410cBz {
    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC989720brW LIZ(C0X52 c0x52) {
        if (c0x52 == null) {
            return new C989700brU(new C1035210d2t());
        }
        try {
            if (c0x52.LIZJ()) {
                return LIZIZ((BaseResponse) c0x52.LIZIZ);
            }
            return new C991340bu8(String.valueOf(c0x52.LIZ.LIZIZ), 6);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new C989700brU(th);
        }
    }

    public static AbstractC989720brW LIZIZ(BaseResponse baseResponse) {
        if (baseResponse == null) {
            return new C989700brU(new C1035210d2t());
        }
        try {
            if (Intrinsics.LJFF(baseResponse.resultCode, "success")) {
                T t = baseResponse.data;
                if (t == 0) {
                    return new C989700brU(new C1035210d2t());
                }
                return new C989710brV(t);
            }
            return new C991340bu8(baseResponse.resultCode, baseResponse.errorCode, baseResponse.errorMsg);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new C989700brU(th);
        }
    }
}
