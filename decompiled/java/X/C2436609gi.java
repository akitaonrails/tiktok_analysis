package X;

import android.net.Uri;
import android.util.Log;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.09gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2436609gi {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Uri uri, String str) {
        try {
            C1CC2.LJII(1, "livesdk_schema_handle", C2097608Jq.LJIIIIZZ(new Pair("base_uri", uri.buildUpon().clearQuery().build().toString()), new Pair("full_uri", uri.toString()), new Pair("stack_trace", Log.getStackTraceString(new Throwable())), new Pair("scheme", uri.getScheme()), new Pair("host", uri.getHost()), new Pair("handler_type", "handler_type_new"), new Pair("handler_path", str)));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void LIZIZ(String str, String str2) {
        try {
            LIZ(UriProtector.parse(str), str2);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
