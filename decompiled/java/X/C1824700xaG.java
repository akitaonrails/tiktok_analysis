package X;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem.showcase.PcsOnboardingContinueAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0xaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824700xaG extends C09AY implements InterfaceC1631620sYq<UIAssem, AbstractC1411370mpb, List<? extends SMBOptInStep>, Unit> {
    public final /* synthetic */ PcsOnboardingContinueAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824700xaG(PcsOnboardingContinueAssem pcsOnboardingContinueAssem) {
        super(3);
        this.LL = pcsOnboardingContinueAssem;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(UIAssem uIAssem, AbstractC1411370mpb abstractC1411370mpb, List<? extends SMBOptInStep> list) {
        String string;
        Resources resources;
        List<? extends SMBOptInStep> list2 = list;
        if (abstractC1411370mpb instanceof C1410940mou) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PcsOnboardingContinueAssem.initVM SUCCESS optInSteps.size=");
            sbLIZ.append(list2.size());
            C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (!list2.isEmpty()) {
                C500260Jjc.LLFFF(this.LL.hp().LLJLILLLLZIIL);
                PcsOnboardingContinueAssem pcsOnboardingContinueAssem = this.LL;
                int size = C1411040mp4.LIZ(pcsOnboardingContinueAssem.ip().getState().LLILZIL, false).size() - pcsOnboardingContinueAssem.ip().xQ2();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("PcsOnboardingContinueAssem.initContent count=");
                sbLIZ2.append(size);
                C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                if (size > 0) {
                    TuxTextView tuxTextView = pcsOnboardingContinueAssem.hp().LLJLLIL;
                    Context context = pcsOnboardingContinueAssem.getContext();
                    String quantityString = null;
                    if (context != null) {
                        string = context.getString(2131855942);
                    } else {
                        string = null;
                    }
                    tuxTextView.setText(string);
                    TuxTextView tuxTextView2 = pcsOnboardingContinueAssem.hp().LLJLL;
                    Context context2 = pcsOnboardingContinueAssem.getContext();
                    if (context2 != null && (resources = context2.getResources()) != null) {
                        quantityString = resources.getQuantityString(2131755965, size, Integer.valueOf(size));
                    }
                    tuxTextView2.setText(quantityString);
                    pcsOnboardingContinueAssem.mp(C497740JfY.LJIJI(2131855873));
                    pcsOnboardingContinueAssem.ip().LJJJJL();
                    IPcsOnboardingBottomFunctionAbility iPcsOnboardingBottomFunctionAbility = (IPcsOnboardingBottomFunctionAbility) pcsOnboardingContinueAssem.LLJJJIL.getValue();
                    if (iPcsOnboardingBottomFunctionAbility != null) {
                        iPcsOnboardingBottomFunctionAbility.J91();
                    }
                    C1824200xZS.LJI("show", pcsOnboardingContinueAssem.ip().DQ2().getShowEntrance(), "");
                } else {
                    Gson gson = C1822270xWL.LIZ;
                    C1822270xWL.LJIIIZ(pcsOnboardingContinueAssem.ip().DQ2(), false);
                    IPcsOnboardingBottomFunctionAbility iPcsOnboardingBottomFunctionAbility2 = (IPcsOnboardingBottomFunctionAbility) pcsOnboardingContinueAssem.LLJJJIL.getValue();
                    if (iPcsOnboardingBottomFunctionAbility2 != null) {
                        iPcsOnboardingBottomFunctionAbility2.EC1();
                    }
                }
            }
        } else {
            C500260Jjc.LJIILLIIL(this.LL.hp().LLJLILLLLZIIL);
        }
        return Unit.LIZ;
    }
}
