package X;

import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07nf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1970107nf {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(412));

    public static final boolean LIZ(Uri uri) {
        Set setLJLIIL;
        if (uri != null) {
            C1400200mXa.LIZ.getClass();
            try {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                String[] strArr = C1400200mXa.LIZIZ;
                String[] strArr2 = (String[]) settingsManagerLIZLLL.LJIIIIZZ("ug_push_dp_saf_disable_query_keys", String[].class, strArr);
                if (strArr2 != null && strArr2.length != 0) {
                    setLJLIIL = C13LQ.LJLIIL(strArr2);
                } else {
                    setLJLIIL = C13LQ.LJLIIL(strArr);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                setLJLIIL = C13LQ.LJLIIL(C1400200mXa.LIZIZ);
            }
            if (!setLJLIIL.isEmpty()) {
                Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                Iterator it2 = setLJLIIL.iterator();
                while (it2.hasNext()) {
                    if (queryParameterNames.contains(it2.next())) {
                        return false;
                    }
                }
            }
        }
        return ((Boolean) LIZ.getValue()).booleanValue();
    }
}
