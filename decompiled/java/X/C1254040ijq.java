package X;

import com.ss.android.ugc.profile.business.profile.popup.MyProfileGuideWidgetV2;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ijq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254040ijq extends C09AY implements InterfaceC1685420txc<InterfaceC960503pD, Integer, Boolean, Boolean, Boolean, Unit> {
    public final /* synthetic */ MyProfileGuideWidgetV2 LL;
    public final /* synthetic */ ViewOnClickListenerC1203580hQS LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1254040ijq(MyProfileGuideWidgetV2 myProfileGuideWidgetV2, ViewOnClickListenerC1203580hQS viewOnClickListenerC1203580hQS) {
        super(5);
        this.LL = myProfileGuideWidgetV2;
        this.LLILLJJLI = viewOnClickListenerC1203580hQS;
    }

    @Override // X.InterfaceC1685420txc
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC960503pD interfaceC960503pD, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        int iIntValue = num.intValue();
        ProfileState profileState = (ProfileState) interfaceC960503pD.withState(this.LL.LJI(), C1ECR.LL);
        if (iIntValue == 0 && this.LL.LJIL(profileState)) {
            this.LL.LJIJI(0);
            C1252570ihT.LIZ.getClass();
            C1252570ihT.LJI();
            C1252550ihR.LIZ.getClass();
            C1252550ihR.LJI = true;
            ViewOnClickListenerC1203580hQS viewOnClickListenerC1203580hQS = this.LLILLJJLI;
            if (viewOnClickListenerC1203580hQS != null) {
                C786410Ut5.D(viewOnClickListenerC1203580hQS, 4);
            }
        } else {
            this.LL.LJIJI(8);
            ViewOnClickListenerC1203580hQS viewOnClickListenerC1203580hQS2 = this.LLILLJJLI;
            if (viewOnClickListenerC1203580hQS2 != null) {
                C786410Ut5.D(viewOnClickListenerC1203580hQS2, 4);
            }
            C1252550ihR.LIZ.getClass();
            C1252550ihR.LJI = false;
        }
        return Unit.LIZ;
    }
}
