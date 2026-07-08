package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureSwitchService;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.090X, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C090X {
    public static final C090X LIZ = new C090X();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1408));

    public static boolean LIZIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        IMixEditingFeatureSwitchService iMixEditingFeatureSwitchService;
        Boolean boolValueOf;
        boolean zBooleanValue = ((Boolean) C090Y.LIZ.getValue()).booleanValue();
        Integer num = 1;
        if (!LIZIZ()) {
            return false;
        }
        if (!zBooleanValue) {
            if (videoPublishEditModel != null && (iMixEditingFeatureSwitchService = (IMixEditingFeatureSwitchService) PluggableExtentionKt.pluggableSpi$default(IMixEditingFeatureSwitchService.class, false, false, false, 14, null)) != null && (boolValueOf = Boolean.valueOf(iMixEditingFeatureSwitchService.LIZ(videoPublishEditModel))) != null) {
                z = boolValueOf.booleanValue();
            }
            if (z) {
                num = 0;
            }
        }
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }
}
