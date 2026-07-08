package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play.PlaybookTagAggregation;
import webcast.data.multi_guest_play.PlaybookTagInfo;

/* JADX INFO: renamed from: X.14uU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20415214uU extends AbstractC20415414uW {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        List<PlaybookTagAggregation> list;
        String containerID;
        String containerID2;
        String containerID3;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = C0TF9.LIZIZ();
        if (playbookAnchorServiceV2LIZIZ != null && (list = playbookAnchorServiceV2LIZIZ.LLJJIJIL) != null) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            InterfaceC20415314uV interfaceC20415314uV = (InterfaceC20415314uV) C1909107dp.LIZJ(InterfaceC20415314uV.class, containerID);
            ArrayList arrayList = new ArrayList();
            for (PlaybookTagAggregation playbookTagAggregation : list) {
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID2 = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID2 = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC20415514uX.class, containerID2);
                InterfaceC20415514uX interfaceC20415514uX = (InterfaceC20415514uX) xBaseModelLIZJ;
                interfaceC20415514uX.setPlaybookFirstLevelTagType(Integer.valueOf(playbookTagAggregation.playbookFirstLevelTagType));
                interfaceC20415514uX.setFirstLevelTagTranslatedName(playbookTagAggregation.firstLevelTagTranslatedName);
                List<PlaybookTagInfo> list2 = playbookTagAggregation.tags;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (PlaybookTagInfo playbookTagInfo : list2) {
                    InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC3 != null) {
                        containerID3 = interfaceC634840OvC3.getContainerID();
                    } else {
                        containerID3 = null;
                    }
                    InterfaceC20415614uY interfaceC20415614uY = (InterfaceC20415614uY) C1909107dp.LIZJ(InterfaceC20415614uY.class, containerID3);
                    interfaceC20415614uY.setTagType(Integer.valueOf(playbookTagInfo.tagType));
                    interfaceC20415614uY.setTagTranslatedName(playbookTagInfo.tagTranslatedName);
                    arrayList2.add(interfaceC20415614uY);
                }
                interfaceC20415514uX.setTags(arrayList2);
                arrayList.add(xBaseModelLIZJ);
            }
            interfaceC20415314uV.setTagAggregations(arrayList);
            completionBlock.onSuccess(interfaceC20415314uV, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
