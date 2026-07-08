package X;

import Y.ARunnableS30S1200000_27;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorGeneralType;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.0wvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799600wvm extends AbstractC1799560wvi {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String string;
        InterfaceC1799590wvl interfaceC1799590wvl = (InterfaceC1799590wvl) xBaseParamModel;
        if (interfaceC1799590wvl.getType() == null) {
            C2382909Vj.LIZ(completionBlock, 0, "params 'type' should be no null", null, 4);
            return;
        }
        int iIntValue = interfaceC1799590wvl.getType().intValue();
        AnchorListManager.LIZ.getClass();
        for (AnchorPublishStruct anchorPublishStruct : (ArrayList) AnchorListManager.LJI()) {
            if (anchorPublishStruct.type == iIntValue) {
                if (anchorPublishStruct.generalType != AnchorGeneralType.E2E_GENERAL_TYPE.getType()) {
                    C2382909Vj.LIZ(completionBlock, 0, "Not Anchor General Type", null, 4);
                    return;
                }
                String keyword = interfaceC1799590wvl.getKeyword();
                if (!C123100dR.LIZ(keyword)) {
                    if (C123100dR.LIZ(anchorPublishStruct.keyword)) {
                        keyword = anchorPublishStruct.keyword;
                    } else {
                        keyword = anchorPublishStruct.title;
                    }
                }
                String subtype = interfaceC1799590wvl.getSubtype();
                if (subtype == null) {
                    subtype = anchorPublishStruct.subtype;
                }
                String consumeURL = interfaceC1799590wvl.getConsumeURL();
                if (consumeURL == null) {
                    consumeURL = anchorPublishStruct.consumeUrl;
                }
                Map<String, Object> content = interfaceC1799590wvl.getContent();
                if (content == null || (string = content.toString()) == null) {
                    string = anchorPublishStruct.content;
                }
                if (keyword != null && keyword.length() != 0) {
                    if (string == null) {
                        string = "";
                    }
                    if (subtype == null) {
                        subtype = anchorPublishStruct.subtype;
                    }
                    if (consumeURL == null) {
                        consumeURL = anchorPublishStruct.consumeUrl;
                    }
                    C1440005kM.LIZ(new C1799610wvn(new AnchorTransData(iIntValue, string, keyword, "", 0, "", null, true, consumeURL, "", Long.MAX_VALUE, "", subtype, true, null, null, null, null, anchorPublishStruct.generalType, -1, C0N7K.COMMON_JSB.getStr(), null)));
                    C20684815ws.LJFF().submit(new ARunnableS30S1200000_27(new C2344009Gk(), anchorPublishStruct, keyword, 3));
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1799570wvj.class, null), "Add Success");
                    return;
                }
                C2382909Vj.LIZ(completionBlock, 0, "Keyword should not be empty", null, 4);
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, 0, "PublishAnchorStruct not found", null, 4);
    }
}
