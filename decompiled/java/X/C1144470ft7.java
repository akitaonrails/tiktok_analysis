package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.List;
import webcast.data.BagItem;

/* JADX INFO: renamed from: X.0ft7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144470ft7 extends AbstractC1144480ft8 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0ftA, com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        ?? arrayList;
        String containerID;
        String str;
        List urls;
        InterfaceC1144510ftB interfaceC1144510ftB = (InterfaceC1144510ftB) xBaseParamModel;
        List list = (List) DataChannelGlobal.LLILZ.gg0(C1148030fyr.class);
        String containerID2 = null;
        if (list != null) {
            ArrayList<BagItem> arrayList2 = new ArrayList();
            for (Object obj : list) {
                long j = ((BagItem) obj).itemId;
                Number itemId = interfaceC1144510ftB.getItemId();
                if (((itemId instanceof Long) && j == itemId.longValue()) || interfaceC1144510ftB.getItemId() == null) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (BagItem bagItem : arrayList2) {
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1144490ft9.class);
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                } else {
                    containerID = null;
                }
                InterfaceC1144490ft9 interfaceC1144490ft9 = (InterfaceC1144490ft9) C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
                interfaceC1144490ft9.setItemId(Long.valueOf(bagItem.itemId));
                interfaceC1144490ft9.setCount(Long.valueOf(bagItem.count));
                interfaceC1144490ft9.setAvailable(Boolean.valueOf(bagItem.available));
                interfaceC1144490ft9.setExpireAt(Long.valueOf(bagItem.minExpireAt));
                interfaceC1144490ft9.setActivateAt(Long.valueOf(bagItem.activateAt));
                interfaceC1144490ft9.setType(Integer.valueOf(bagItem.itemType));
                interfaceC1144490ft9.setGiftName(bagItem.name);
                ImageModel imageModel = bagItem.image;
                if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                    str = (String) C13LP.LJJJLL(urls);
                } else {
                    str = null;
                }
                interfaceC1144490ft9.setIconUrl(str);
                arrayList.add(interfaceC1144490ft9);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        }
        ?? r1 = (InterfaceC1144500ftA) C1909107dp.LIZJ(InterfaceC1144500ftA.class, containerID2);
        r1.setBagItems(arrayList);
        completionBlock.onSuccess(r1, "");
    }
}
