package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08hI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2185408hI {
    public static long LIZ() {
        try {
            return CastLongProtector.parseLong(u.LJJIFFI(C2213981Bky.LIZIZ.getVersionName(), e3.d, CardStruct.IStatusCode.DEFAULT, false));
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }
}
