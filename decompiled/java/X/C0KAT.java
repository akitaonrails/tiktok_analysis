package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackageRenewalSpecialStatusFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxFeedbackUrl;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KAT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KAT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubPackageRenewalSpecialStatusFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KAT(SubPackageRenewalSpecialStatusFragment subPackageRenewalSpecialStatusFragment) {
        super(0);
        this.LL = subPackageRenewalSpecialStatusFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2089008Gi c2089008Gi = new C2089008Gi(LiveSubscribeLynxFeedbackUrl.INSTANCE.getValue());
        Context context = this.LL.getContext();
        if (context != null) {
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
            String strLJ = c2089008Gi.LJ();
            strLJ.toString();
            C494790Jan.LJIIIZ(context, strLJ, null);
        }
        Map<String, String> map = this.LL.LLILZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_onhold_subscirbe_popup_contact_click");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
