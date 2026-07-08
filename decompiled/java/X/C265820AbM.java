package X;

import com.ss.android.ugc.aweme.feed.spi.ICommonFeedCustomLogic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0AbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C265820AbM {
    public static final C265820AbM LIZ = new C265820AbM();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C265810AbL());

    public static boolean LIZ() {
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            return true;
        }
        ICommonFeedCustomLogic iCommonFeedCustomLogic = (ICommonFeedCustomLogic) PluggableExtentionKt.pluggableSpi$default(ICommonFeedCustomLogic.class, false, false, false, 14, null);
        if (iCommonFeedCustomLogic != null) {
            iCommonFeedCustomLogic.LIZIZ();
        }
        return false;
    }
}
