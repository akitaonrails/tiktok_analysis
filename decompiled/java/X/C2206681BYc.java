package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.ss.android.ugc.aweme.ad.settings.AdLandPageTTWebConfigModel;
import com.ss.android.ugc.aweme.settings.TTWebViewEnableStatusSettings;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1BYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206681BYc {
    public static final AdLandPageTTWebConfigModel LIZ = new AdLandPageTTWebConfigModel(false, false, false, true, "default", false, 30000, true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(174));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(176));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(177));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(175));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(179));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(178));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(173));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(180));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(328));

    public static boolean LIZJ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static boolean LIZ() {
        Object c098200Yq;
        if (LIZJ()) {
            TTWebViewEnableStatusSettings.LIZ.getClass();
            if (TTWebViewEnableStatusSettings.LIZ().isTTWebViewEnabled) {
                Iterable iterable = TTWebViewEnableStatusSettings.LIZ().allowBidList;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator<k> it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        try {
                            c098200Yq = Boolean.valueOf(it2.next().LJIL().equals("tt_hybrid_commerce"));
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Boolean bool = Boolean.FALSE;
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = bool;
                        }
                        if (((Boolean) c098200Yq).booleanValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean LIZIZ() {
        return LIZJ() && ((Boolean) LIZJ.getValue()).booleanValue();
    }
}
