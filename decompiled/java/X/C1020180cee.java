package X;

import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0cee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020180cee extends AbstractC1020170ced {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1020190cef interfaceC1020190cef = (InterfaceC1020190cef) xBaseParamModel;
        ArrayList arrayList = new ArrayList();
        List<Object> trackUrlList = interfaceC1020190cef.getTrackUrlList();
        if (trackUrlList != null) {
            Iterator<Object> it2 = trackUrlList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().toString());
            }
        }
        String trackLabel = interfaceC1020190cef.getTrackLabel();
        if (trackLabel == null) {
            trackLabel = "";
        }
        String creativeId = interfaceC1020190cef.getCreativeId();
        if (creativeId == null) {
            creativeId = "";
        }
        String logExtra = interfaceC1020190cef.getLogExtra();
        String adId = interfaceC1020190cef.getAdId();
        String groupId = interfaceC1020190cef.getGroupId();
        String containerID = null;
        if (arrayList.isEmpty()) {
            C2382909Vj.LIZ(completionBlock, -1, "empty track_url_list", null, 4);
            return;
        }
        if (!TextUtils.isEmpty(trackLabel) && !TextUtils.isEmpty(creativeId)) {
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() != null) {
                C1028210crb.LJJIIZI(trackLabel, C2095008Iq.LJIILIIL(creativeId), logExtra, groupId, arrayList, adId);
            }
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1020200ceg.class, containerID), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, "empty trackLabel or creativeId", null, 4);
    }
}
