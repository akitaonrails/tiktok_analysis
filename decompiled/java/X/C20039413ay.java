package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.13ay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20039413ay extends AbstractC20039013au {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        RelatedProductInfo relatedProductInfo;
        String str;
        String str2;
        C13LG<Long> c13lg;
        Set<Map.Entry<String, RelatedProductInfo>> setEntrySet;
        Map.Entry entry;
        C21272518Mp.LIZ.getClass();
        Map<String, RelatedProductInfo> mapSnapshot = C21272518Mp.LJII.snapshot();
        String containerID = null;
        if (mapSnapshot != null && (setEntrySet = mapSnapshot.entrySet()) != null && (entry = (Map.Entry) C13LP.LJJLIIIJJIZ(setEntrySet)) != null) {
            relatedProductInfo = (RelatedProductInfo) entry.getValue();
        } else {
            relatedProductInfo = null;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        InterfaceC20039113av interfaceC20039113av = (InterfaceC20039113av) C1909107dp.LIZJ(InterfaceC20039113av.class, containerID);
        if (relatedProductInfo == null || (str = relatedProductInfo.videoId) == null) {
            str = "";
        }
        interfaceC20039113av.setItemId(str);
        if (relatedProductInfo == null || (str2 = relatedProductInfo.authorId) == null) {
            str2 = "";
        }
        interfaceC20039113av.setAuthorID(str2);
        ArrayList arrayList = new ArrayList();
        if (relatedProductInfo != null && (c13lg = relatedProductInfo.productIdList) != null) {
            Iterator<Long> it2 = c13lg.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(it2.next().longValue()));
            }
        }
        interfaceC20039113av.setProductId(arrayList);
        completionBlock.onSuccess(interfaceC20039113av, "");
    }
}
