package X;

import com.ss.android.ugc.aweme.feed.exp.LivePreviewCtaDelayConfig;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0etz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106570etz {
    public static final C1106570etz LIZ = new C1106570etz();
    public static final LivePreviewCtaDelayConfig LIZIZ = new LivePreviewCtaDelayConfig(false, 0, 0, 3000, 300, false, "", 0, 0, false, 3000, 3000, 3000, 3000, 3000, 3000);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(378));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(380));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(379));

    public static boolean LIZ() {
        return LivePreviewCTASmartDisplayManager.INSTANCE.getDelayShowTime() > 0;
    }

    public static float LIZIZ() {
        return ((Number) LIZJ.getValue()).floatValue();
    }

    public static LivePreviewCtaDelayConfig LIZJ() {
        return (LivePreviewCtaDelayConfig) LIZLLL.getValue();
    }
}
