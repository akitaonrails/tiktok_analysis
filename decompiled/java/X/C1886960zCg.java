package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ICampaignPSPBusinessService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886960zCg extends AbstractC1886970zCh {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1886980zCi interfaceC1886980zCi = (InterfaceC1886980zCi) xBaseParamModel;
        C1404290meB c1404290meB = new C1404290meB(interfaceC1886980zCi.getCampaignInfo().getCampaignId(), interfaceC1886980zCi.getCampaignInfo().getEndTime().longValue());
        List<InterfaceC1887000zCk> tasks = interfaceC1886980zCi.getTasks();
        if (tasks == null) {
            tasks = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(tasks, 10));
        for (InterfaceC1887000zCk interfaceC1887000zCk : tasks) {
            arrayList.add(new C1869300ykC(interfaceC1887000zCk.getTaskId(), interfaceC1887000zCk.getTaskName(), interfaceC1887000zCk.getPspStrategyKey(), c1404290meB.LIZ));
        }
        List<InterfaceC1886990zCj> gameplays = interfaceC1886980zCi.getGameplays();
        if (gameplays == null) {
            gameplays = C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(gameplays, 10));
        for (InterfaceC1886990zCj interfaceC1886990zCj : gameplays) {
            arrayList2.add(new C1869290ykB(interfaceC1886990zCj.getGameplayId(), interfaceC1886990zCj.getPayload(), interfaceC1886990zCj.getPspStrategyKey(), c1404290meB.LIZ));
        }
        C1886940zCe c1886940zCe = new C1886940zCe(interfaceC1886980zCi.getScene(), c1404290meB, new ArrayList(arrayList), new ArrayList(arrayList2));
        ICampaignPSPBusinessService iCampaignPSPBusinessService = (ICampaignPSPBusinessService) PluggableExtentionKt.pluggableSpi$default(ICampaignPSPBusinessService.class, false, false, false, 14, null);
        if (iCampaignPSPBusinessService == null) {
            C2382909Vj.LIZ(completionBlock, 0, "ICampaignPSPBusinessService null", null, 4);
        } else {
            iCampaignPSPBusinessService.LIZIZ(c1886940zCe, new AwS394S0200000_28(completionBlock, (CompletionBlock<InterfaceC1887020zCm>) this, (C1886960zCg) 65), new AwS572S0100000_28(completionBlock, (CompletionBlock<InterfaceC1887020zCm>) 799));
        }
    }
}
