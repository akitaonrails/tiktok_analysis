package X;

import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceImageModel;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceMergeModel;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourcePreloadModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS80S1000000_30;

/* JADX INFO: renamed from: X.13uR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20160113uR extends C09AY implements Function0<Map<String, ? extends EcomResourcePreloadModel>> {
    public C20160113uR() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends EcomResourcePreloadModel> invoke() {
        boolean z;
        String str;
        List<EcomResourceImageModel> list;
        List<InterfaceC20160013uQ> list2 = C20160313uT.LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC20160013uQ> it2 = list2.iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            EcomResourcePreloadModel[] ecomResourcePreloadModelArrLIZ = it2.next().LIZ();
            ArrayList arrayList2 = new ArrayList();
            for (EcomResourcePreloadModel ecomResourcePreloadModel : ecomResourcePreloadModelArrLIZ) {
                if (ecomResourcePreloadModel.api.length() > 0 && ecomResourcePreloadModel.mergeModel == null) {
                    arrayList2.add(ecomResourcePreloadModel);
                }
            }
            C19719612Di.LJJI(arrayList2, arrayList);
        }
        int i = 10;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : arrayList) {
            linkedHashMap.put(((EcomResourcePreloadModel) obj).api, obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        List<InterfaceC20160013uQ> list3 = C20160313uT.LIZIZ;
        ArrayList<EcomResourcePreloadModel> arrayList3 = new ArrayList();
        Iterator<InterfaceC20160013uQ> it3 = list3.iterator();
        while (it3.hasNext()) {
            EcomResourcePreloadModel[] ecomResourcePreloadModelArrLIZ2 = it3.next().LIZ();
            ArrayList arrayList4 = new ArrayList();
            for (EcomResourcePreloadModel ecomResourcePreloadModel2 : ecomResourcePreloadModelArrLIZ2) {
                if (ecomResourcePreloadModel2.api.length() > 0 && ecomResourcePreloadModel2.mergeModel != null) {
                    arrayList4.add(ecomResourcePreloadModel2);
                }
            }
            C19719612Di.LJJI(arrayList4, arrayList3);
        }
        if (arrayList3.isEmpty()) {
            return C2097608Jq.LJIIZILJ(linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (EcomResourcePreloadModel ecomResourcePreloadModel3 : arrayList3) {
            List<EcomResourceImageModel> arrayList5 = (List) linkedHashMap3.get(ecomResourcePreloadModel3.api);
            if (arrayList5 == null) {
                EcomResourcePreloadModel ecomResourcePreloadModel4 = (EcomResourcePreloadModel) linkedHashMap2.get(ecomResourcePreloadModel3.api);
                arrayList5 = (ecomResourcePreloadModel4 == null || (list = ecomResourcePreloadModel4.images) == null) ? new ArrayList() : new ArrayList(list);
                linkedHashMap3.put(ecomResourcePreloadModel3.api, arrayList5);
            }
            List<EcomResourceImageModel> list4 = ecomResourcePreloadModel3.images;
            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(list4, i));
            Iterator<EcomResourceImageModel> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList6.add(it4.next().scene);
            }
            Iterator it5 = C13LP.LLIIJI(arrayList6).iterator();
            while (it5.hasNext()) {
                C19719612Di.LJJIIJ(arrayList5, new AwS80S1000000_30((String) it5.next(), 2), z);
            }
            EcomResourceMergeModel ecomResourceMergeModel = ecomResourcePreloadModel3.mergeModel;
            if (ecomResourceMergeModel != null && (((str = ecomResourceMergeModel.priority) != null && str.length() != 0) || ecomResourceMergeModel.delayMs != null)) {
                ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList5, i));
                for (EcomResourceImageModel ecomResourceImageModel : arrayList5) {
                    EcomResourceMergeModel ecomResourceMergeModel2 = ecomResourcePreloadModel3.mergeModel;
                    arrayList7.add(new EcomResourceImageModel(ecomResourceImageModel.path, ecomResourceImageModel.limit, ecomResourceImageModel.rgb565, ecomResourceImageModel.scene, ecomResourceImageModel.f61native, ecomResourceMergeModel2.priority, ecomResourceMergeModel2.delayMs, ecomResourceImageModel.width, ecomResourceImageModel.height, ecomResourceImageModel.lowWidth, ecomResourceImageModel.lowHeight, ecomResourceImageModel.highWidth, ecomResourceImageModel.highHeight, ecomResourceImageModel.diskCacheName));
                }
                arrayList5.clear();
                arrayList5.addAll(arrayList7);
            }
            arrayList5.addAll(ecomResourcePreloadModel3.images);
            i = 10;
            z = true;
        }
        for (Map.Entry entry : linkedHashMap3.entrySet()) {
            EcomResourcePreloadModel ecomResourcePreloadModel5 = (EcomResourcePreloadModel) linkedHashMap2.get(entry.getKey());
            if (ecomResourcePreloadModel5 != null) {
                linkedHashMap2.put(entry.getKey(), new EcomResourcePreloadModel(ecomResourcePreloadModel5.api, ecomResourcePreloadModel5.pageName, ecomResourcePreloadModel5.btmCode, ecomResourcePreloadModel5.isWebViewResource, (List) entry.getValue(), ecomResourcePreloadModel5.mergeModel));
            }
        }
        return C2097608Jq.LJIIZILJ(linkedHashMap2);
    }
}
