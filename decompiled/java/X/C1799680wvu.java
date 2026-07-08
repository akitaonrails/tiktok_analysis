package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0wvu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799680wvu extends AbstractC1799700wvw {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1799690wvv interfaceC1799690wvv = (InterfaceC1799690wvv) xBaseParamModel;
        int iIntValue = interfaceC1799690wvv.getUpdateLayoutAction().intValue();
        List<String> userIDs = interfaceC1799690wvv.getUserIDs();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(userIDs, 10));
        for (String str : userIDs) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
            if (lLJIILIIL != null) {
                arrayList.add(Long.valueOf(lLJIILIIL.longValue()));
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handle: invalid userId=");
                sbLIZ.append(str);
                sbLIZ.append(" action=");
                sbLIZ.append(iIntValue);
                sbLIZ.append(" rawUserIds=");
                sbLIZ.append(interfaceC1799690wvv.getUserIDs());
                C20441214yg.LJIIL("CohostUpdateLayoutMethod", C2188811AlT.LIZIZ(sbLIZ));
                C2382909Vj.LIZ(completionBlock, 0, "invalid userId", null, 4);
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handle: platform=");
        sbLIZ2.append(enumC1063300dmC);
        sbLIZ2.append(" action=");
        sbLIZ2.append(iIntValue);
        sbLIZ2.append(" rawUserIds=");
        sbLIZ2.append(interfaceC1799690wvv.getUserIDs());
        sbLIZ2.append(" parsedUserIds=");
        sbLIZ2.append(arrayList);
        C20441214yg.LJIIIZ("CohostUpdateLayoutMethod", C2188811AlT.LIZIZ(sbLIZ2));
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).BB0(iIntValue, arrayList, new C1799710wvx(this, completionBlock));
    }
}
