package X;

import com.ss.android.ugc.aweme.net.experiment.RiskyRetryRequestStrategy;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0p6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498940p6q extends C1216130hkh {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1498930p6p());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1499010p6x());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1498920p6o());

    public static RiskyRetryRequestStrategy LIZJ() {
        return (RiskyRetryRequestStrategy) LIZJ.getValue();
    }

    public static boolean LIZIZ(String str, String str2) {
        if (!LIZJ().enable) {
            return false;
        }
        if (!LIZJ().enableDuringStartup && !C0CN5.LJII()) {
            return false;
        }
        Iterator<String> it2 = LIZJ().enableWhenUrlContains.iterator();
        while (it2.hasNext()) {
            if (a0.LJJIIZI(str2, it2.next(), false)) {
                if (Intrinsics.LJFF(str, "/") || C1216130hkh.LIZ(str, LIZJ().disableWhenPathStartsWith)) {
                    return false;
                }
                return C1216130hkh.LIZ(str, LIZJ().enableWhenPathStartsWith);
            }
        }
        return false;
    }
}
