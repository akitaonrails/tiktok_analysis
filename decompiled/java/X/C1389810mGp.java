package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0mGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389810mGp extends AbstractC1389820mGq {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String musicId;
        Integer num;
        InterfaceC1389830mGr interfaceC1389830mGr = (InterfaceC1389830mGr) xBaseParamModel;
        String ccTemplateId = interfaceC1389830mGr.getCcTemplateId();
        if (ccTemplateId != null && (musicId = interfaceC1389830mGr.getMusicId()) != null) {
            Number musicBeginTime = interfaceC1389830mGr.getMusicBeginTime();
            if ((musicBeginTime instanceof Integer) && (num = (Integer) musicBeginTime) != null) {
                int iIntValue = num.intValue();
                if (ccTemplateId.length() != 0 && musicId.length() != 0) {
                    C527590Kmb.LIZ.getClass();
                    C527590Kmb.LIZIZ(ccTemplateId, musicId, iIntValue, null);
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1389840mGs.class, null), "");
                }
            }
        }
    }
}
