package X;

import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS38S2000000_16;

/* JADX INFO: renamed from: X.0ceT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020070ceT extends AbstractC1020080ceU {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        List<Object> trackUrlList;
        InterfaceC1020090ceV interfaceC1020090ceV = (InterfaceC1020090ceV) xBaseParamModel;
        String trackLabel = interfaceC1020090ceV.getTrackLabel();
        if (trackLabel == null) {
            trackLabel = "";
        }
        String creativeId = interfaceC1020090ceV.getCreativeId();
        if (creativeId == null) {
            creativeId = "";
        }
        String logExtra = interfaceC1020090ceV.getLogExtra();
        if (logExtra == null) {
            logExtra = "";
        }
        String adId = interfaceC1020090ceV.getAdId();
        if (adId == null) {
            adId = "";
        }
        String groupId = interfaceC1020090ceV.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        String containerID = null;
        if (interfaceC1020090ceV.getTrackUrlList() == null || ((trackUrlList = interfaceC1020090ceV.getTrackUrlList()) != null && trackUrlList.isEmpty())) {
            C2382909Vj.LIZ(completionBlock, -1, "empty track_url_list", null, 4);
            return;
        }
        if (!TextUtils.isEmpty(trackLabel) && !TextUtils.isEmpty(creativeId)) {
            ArrayList arrayList = new ArrayList();
            List<Object> trackUrlList2 = interfaceC1020090ceV.getTrackUrlList();
            if (trackUrlList2 != null) {
                Iterator<Object> it2 = trackUrlList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().toString());
                }
            }
            C2201701BEy c2201701BEy = C2201701BEy.LIZ;
            Long lLJIILIIL = C2095008Iq.LJIILIIL(creativeId);
            new AwS38S2000000_16(groupId, adId, 2);
            c2201701BEy.getClass();
            C2201701BEy.LIZIZ(trackLabel, arrayList, lLJIILIIL, logExtra, null);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1020100ceW.class, containerID), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, "empty trackLabel or creativeId", null, 4);
    }
}
