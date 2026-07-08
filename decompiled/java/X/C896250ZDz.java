package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.0ZDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896250ZDz {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"user_disclaimer", "biz_disclaimer", "user_view_ad", "biz_view_ad"});

    public static boolean LIZ(ByteString byteString) {
        try {
            return Intrinsics.LJFF(C905470Zfd.ADAPTER.decode(byteString).b2c_info.business_scenario, "script");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LIZIZ(C869590Y9l c869590Y9l) {
        String str;
        if (c869590Y9l.getMsgType() != 1 || (str = c869590Y9l.getExt().get("a:landing_msg_type")) == null) {
            return false;
        }
        return LIZ.contains(str);
    }
}
