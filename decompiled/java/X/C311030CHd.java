package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311030CHd {
    public static final C311030CHd LIZ = new C311030CHd();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3635));

    public static boolean LIZ() {
        IAiChatFeatureService iAiChatFeatureService;
        C1EPC c1epcLIZIZ;
        return ((Boolean) LIZIZ.getValue()).booleanValue() && (iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null)) != null && (c1epcLIZIZ = iAiChatFeatureService.LIZIZ()) != null && c1epcLIZIZ.isFeatureEnabled();
    }
}
