package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem.PcsOnboardingFrontBAssem;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.List;
import kotlin.Unit;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0xb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825220xb6 extends C09AY implements InterfaceC1631620sYq<UIAssem, AbstractC1411370mpb, SMBOptInQualificationResponse.ResponseData, Unit> {
    public final /* synthetic */ PcsOnboardingFrontBAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825220xb6(PcsOnboardingFrontBAssem pcsOnboardingFrontBAssem) {
        super(3);
        this.LL = pcsOnboardingFrontBAssem;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(UIAssem uIAssem, AbstractC1411370mpb abstractC1411370mpb, SMBOptInQualificationResponse.ResponseData responseData) {
        Integer numValueOf;
        SMBOptInQualificationResponse.ResponseData responseData2 = responseData;
        if (abstractC1411370mpb instanceof C1410940mou) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(5, 1);
            if (responseData2 != null) {
                numValueOf = Integer.valueOf(responseData2.servicePlusOptInStatus);
            } else {
                numValueOf = null;
            }
            if (!C13LP.LJJJJ(numValueOf, listLJIIJJI)) {
                C500260Jjc.LLFFF(this.LL.ip().LLILZ);
                this.LL.kp(3);
            } else {
                C500260Jjc.LJIILLIIL(this.LL.ip().LLILZ);
                IPcsOnboardingBottomFunctionAbility iPcsOnboardingBottomFunctionAbilityHp = this.LL.hp();
                if (iPcsOnboardingBottomFunctionAbilityHp != null) {
                    iPcsOnboardingBottomFunctionAbilityHp.Cd0();
                }
            }
        } else if (abstractC1411370mpb instanceof C1411380mpc) {
            C500260Jjc.LJIILLIIL(this.LL.ip().LLILZ);
            IPcsOnboardingBottomFunctionAbility iPcsOnboardingBottomFunctionAbilityHp2 = this.LL.hp();
            if (iPcsOnboardingBottomFunctionAbilityHp2 != null) {
                iPcsOnboardingBottomFunctionAbilityHp2.Cd0();
            }
        } else {
            C500260Jjc.LJIILLIIL(this.LL.ip().LLILZ);
            IPcsOnboardingBottomFunctionAbility iPcsOnboardingBottomFunctionAbilityHp3 = this.LL.hp();
            if (iPcsOnboardingBottomFunctionAbilityHp3 != null) {
                iPcsOnboardingBottomFunctionAbilityHp3.Cd0();
            }
        }
        return Unit.LIZ;
    }
}
