package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0vah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748090vah extends AbstractC1748100vai {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        ArrayList arrayList = new ArrayList();
        C973303rH.LL.getClass();
        for (Region region : C973303rH.LLILLL) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1748120vak.class, null);
            InterfaceC1748120vak interfaceC1748120vak = (InterfaceC1748120vak) xBaseModelLIZJ;
            interfaceC1748120vak.setName(region.name);
            interfaceC1748120vak.setGeonameID(region.geoNameId);
            interfaceC1748120vak.setCode(region.code);
            interfaceC1748120vak.setDistrictKey(region.districtKey);
            arrayList.add(xBaseModelLIZJ);
        }
        XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1748110vaj.class, null);
        InterfaceC1748110vaj interfaceC1748110vaj = (InterfaceC1748110vaj) xBaseModelLIZJ2;
        C973303rH.LL.getClass();
        interfaceC1748110vaj.setSelectedAddressID(C973303rH.LLILLJJLI);
        interfaceC1748110vaj.setSelectedArea(arrayList);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
    }
}
