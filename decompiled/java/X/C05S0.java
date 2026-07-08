package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05S0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05S0 {
    public static final C05S0 LIZ = new C05S0();

    public static void LIZ(LifecycleOwner lifecycleOwner, C2252321DDq c2252321DDq, boolean z, Function1 function1) {
        ISocialThoughtDataCenterService iSocialThoughtDataCenterServiceLJJIIZI;
        SocialThoughtService socialThoughtService = (SocialThoughtService) PluggableExtentionKt.pluggableSpi$default(SocialThoughtService.class, false, false, false, 14, null);
        if (socialThoughtService != null && (iSocialThoughtDataCenterServiceLJJIIZI = socialThoughtService.LJJIIZI()) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C1353605Rm(lifecycleOwner, z, c2252321DDq, iSocialThoughtDataCenterServiceLJJIIZI, function1, null), 3);
        }
    }
}
