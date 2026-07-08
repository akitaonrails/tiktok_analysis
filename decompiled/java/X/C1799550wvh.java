package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorGeneralType;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS13S1001000_27;

/* JADX INFO: renamed from: X.0wvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799550wvh extends AbstractC1799510wvd {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object next;
        InterfaceC1799530wvf interfaceC1799530wvf = (InterfaceC1799530wvf) xBaseParamModel;
        if (interfaceC1799530wvf.getType() == null) {
            C2382909Vj.LIZ(completionBlock, 0, "params 'type' should be no null", null, 4);
            return;
        }
        AwS13S1001000_27 awS13S1001000_27 = new AwS13S1001000_27(interfaceC1799530wvf.getSubtype(), interfaceC1799530wvf.getType().intValue(), 3);
        AnchorListManager.LIZ.getClass();
        Iterator it2 = ((ArrayList) AnchorListManager.LJI()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((Boolean) awS13S1001000_27.invoke(next)).booleanValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) next;
        if (anchorPublishStruct == null) {
            C2382909Vj.LIZ(completionBlock, 0, "Target Anchor Struct not found", null, 4);
            return;
        }
        if (anchorPublishStruct.generalType != AnchorGeneralType.E2E_GENERAL_TYPE.getType()) {
            C2382909Vj.LIZ(completionBlock, 0, "Not Anchor General Type", null, 4);
            return;
        }
        String str = anchorPublishStruct.keyword;
        String str2 = anchorPublishStruct.consumeUrl;
        String str3 = anchorPublishStruct.content;
        if (str != null && str.length() != 0) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1799540wvg.class, null);
            InterfaceC1799540wvg interfaceC1799540wvg = (InterfaceC1799540wvg) xBaseModelLIZJ;
            interfaceC1799540wvg.setConsumeURL(str2);
            interfaceC1799540wvg.setContent(str3);
            interfaceC1799540wvg.setKeyword(str);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "Add Success");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "Keyword should not be empty", null, 4);
    }
}
