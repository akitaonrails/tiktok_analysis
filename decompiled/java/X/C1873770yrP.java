package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0yrP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1873770yrP extends AbstractC1873780yrQ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1873790yrR interfaceC1873790yrR = (InterfaceC1873790yrR) xBaseParamModel;
        InterfaceC1873810yrT interfaceC1873810yrT = (InterfaceC1873810yrT) C1909107dp.LIZJ(InterfaceC1873810yrT.class, null);
        if (enumC1063300dmC != EnumC1063300dmC.LYNX) {
            C2382909Vj.LIZ(completionBlock, 0, "type != XBridgePlatformType.LYNX", null, 4);
            return;
        }
        List<String> userIdList = interfaceC1873790yrR.getUserIdList();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = userIdList.iterator();
        while (it2.hasNext()) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(it2.next());
            if (lLJIILIIL != null) {
                arrayList.add(lLJIILIIL);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new C916860Zy0(((Number) it3.next()).longValue(), 0L));
        }
        if (arrayList2.isEmpty()) {
            C2382909Vj.LIZ(completionBlock, 0, "invitee list is empty", null, 4);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invitee list = ");
        sbLIZ.append(arrayList2);
        sbLIZ.append(", linkPage = ");
        sbLIZ.append(interfaceC1873790yrR.getLinkPage());
        C20441214yg.LIZIZ("InviteViewerToMic", C2188811AlT.LIZIZ(sbLIZ));
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).QX0(new C918350a0P(C918390a0T.LIZ(arrayList2), new C915880ZwQ(interfaceC1873790yrR.getLinkPage(), true, 1), new C918360a0Q(1, null, new AwS607S0100000_28(completionBlock, (CompletionBlock<InterfaceC1874320ysI>) 187), new AwS394S0200000_28(completionBlock, (CompletionBlock<InterfaceC1873810yrT>) interfaceC1873810yrT, (InterfaceC1873810yrT) 52)), 8), new AwS394S0200000_28(completionBlock, (CompletionBlock<InterfaceC1873810yrT>) interfaceC1873810yrT, (InterfaceC1873810yrT) 51));
    }
}
