package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.SocialPublishLandingAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IPublishResourceFirstPolicyService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CWL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CWL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SocialPublishLandingAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CWL(SocialPublishLandingAssem socialPublishLandingAssem) {
        super(0);
        this.LL = socialPublishLandingAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        IPublishResourceFirstPolicyService iPublishResourceFirstPolicyService = (IPublishResourceFirstPolicyService) PluggableExtentionKt.pluggableSpi$default(IPublishResourceFirstPolicyService.class, false, false, false, 14, null);
        if (iPublishResourceFirstPolicyService != null) {
            iPublishResourceFirstPolicyService.start();
        }
        SocialPublishLandingAssem socialPublishLandingAssem = this.LL;
        if (!socialPublishLandingAssem.LLJIJIL) {
            socialPublishLandingAssem.LLJIJIL = true;
            C1618440sDa.LIZIZ.LJJIFFI().LJIIJJI(socialPublishLandingAssem.getContext(), LifecycleOwnerKt.getLifecycleScope(socialPublishLandingAssem));
        }
        return Unit.LIZ;
    }
}
