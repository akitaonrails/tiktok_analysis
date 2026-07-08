package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem.PcsOnboardingMultiSKUAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import webcast.api.sub.SupportedServiceInfo;

/* JADX INFO: renamed from: X.0xbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825290xbD extends C09AY implements InterfaceC1631620sYq<UIAssem, AbstractC1411370mpb, List<? extends SupportedServiceInfo>, Unit> {
    public final /* synthetic */ PcsOnboardingMultiSKUAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825290xbD(PcsOnboardingMultiSKUAssem pcsOnboardingMultiSKUAssem) {
        super(3);
        this.LL = pcsOnboardingMultiSKUAssem;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(UIAssem uIAssem, AbstractC1411370mpb abstractC1411370mpb, List<? extends SupportedServiceInfo> list) {
        List<? extends SupportedServiceInfo> list2 = list;
        if (abstractC1411370mpb instanceof C1410940mou) {
            C500260Jjc.LLFFF(this.LL.hp().LLILZ);
            if (!list2.isEmpty()) {
                PcsOnboardingVM pcsOnboardingVMIp = this.LL.ip();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C1825400xbO());
                for (SupportedServiceInfo supportedServiceInfo : list2) {
                    int i = supportedServiceInfo.type;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 5) {
                                if (i == 6) {
                                    arrayList.add(new C1825410xbP(supportedServiceInfo.defaultEnabled));
                                }
                            } else {
                                arrayList.add(new C1825420xbQ(supportedServiceInfo.defaultEnabled));
                            }
                        } else {
                            arrayList.add(new C1825440xbS(supportedServiceInfo.defaultEnabled));
                        }
                    } else {
                        arrayList.add(new C1825430xbR(supportedServiceInfo.defaultEnabled));
                    }
                }
                pcsOnboardingVMIp.LLIZLLLIL = arrayList;
                PcsOnboardingMultiSKUAssem pcsOnboardingMultiSKUAssem = this.LL;
                C1833160xnu c1833160xnu = pcsOnboardingMultiSKUAssem.LLJJIJI;
                if (c1833160xnu != null) {
                    c1833160xnu.LL = pcsOnboardingMultiSKUAssem.ip().LLIZLLLIL;
                }
                C1833160xnu c1833160xnu2 = this.LL.LLJJIJI;
                if (c1833160xnu2 != null) {
                    c1833160xnu2.notifyDataSetChanged();
                }
            }
            IPcsOnboardingBottomFunctionAbility iPcsOnboardingBottomFunctionAbility = (IPcsOnboardingBottomFunctionAbility) this.LL.LLJJIII.getValue();
            if (iPcsOnboardingBottomFunctionAbility != null) {
                iPcsOnboardingBottomFunctionAbility.J91();
            }
        } else {
            C500260Jjc.LJIILLIIL(this.LL.hp().LLILZ);
            IPcsOnboardingBottomFunctionAbility iPcsOnboardingBottomFunctionAbility2 = (IPcsOnboardingBottomFunctionAbility) this.LL.LLJJIII.getValue();
            if (iPcsOnboardingBottomFunctionAbility2 != null) {
                iPcsOnboardingBottomFunctionAbility2.Cd0();
            }
        }
        return Unit.LIZ;
    }
}
