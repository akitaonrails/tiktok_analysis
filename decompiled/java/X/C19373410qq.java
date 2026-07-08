package X;

import com.ss.android.ugc.aweme.search.lynx.core.config.SearchLynxQuickViewHolderReuseByFingerprintStruct;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.10qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19373410qq {
    public static final C19373410qq LIZ = new C19373410qq();
    public static final SearchLynxQuickViewHolderReuseByFingerprintStruct LIZIZ = new SearchLynxQuickViewHolderReuseByFingerprintStruct();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(127));

    public static final boolean LIZ(String str) {
        LIZ.getClass();
        C01GW c01gw = LIZJ;
        if (((SearchLynxQuickViewHolderReuseByFingerprintStruct) c01gw.getValue()).enable) {
            if (!((SearchLynxQuickViewHolderReuseByFingerprintStruct) c01gw.getValue()).blackList.contains(C649470Pdh.LJ(str))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
