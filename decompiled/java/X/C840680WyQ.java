package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0WyQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840680WyQ {
    public static final C840680WyQ LIZ = new C840680WyQ();

    /* JADX WARN: Removed duplicated region for block: B:272:0x050b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C840660WyO LIZ(X.C840710WyT r27) {
        /*
            Method dump skipped, instruction units count: 1364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C840680WyQ.LIZ(X.0WyT):X.0WyO");
    }

    public static void LIZIZ(C840660WyO c840660WyO) {
        Map<String, List<String>> mapLJIILIIL;
        List<String> list;
        String str;
        C840750WyX c840750WyX = c840660WyO.LIZ.LIZ;
        if (c840750WyX.LIZ == 400203 && Intrinsics.LJFF(c840750WyX.LIZIZ, "after") && (mapLJIILIIL = c840660WyO.LJIILIIL()) != null && (list = mapLJIILIIL.get("x-tt-net-final-url")) != null && (str = (String) C13LP.LJJJLL(list)) != null && !a0.LJJJIL(str)) {
            try {
                Uri uri = UriProtector.parse(URLDecoder.decode(str, "UTF-8"));
                if (uri != null) {
                    c840660WyO.LJJ = uri;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
