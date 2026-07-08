package X;

import Y.ARunnableS101S0100000_1;
import Y.ARunnableS31S0400000_23;
import android.content.Context;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0qVL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552570qVL extends AbstractC1552670qVV {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1552680qVW interfaceC1552680qVW = (InterfaceC1552680qVW) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            String strLIZ = C1553670qX7.LIZ();
            C2499709qt c2499709qt = new C2499709qt(context, 1);
            UpdatePackage updatePackage = new UpdatePackage(interfaceC1552680qVW.getVersion().longValue(), interfaceC1552680qVW.getChannel(), (UpdatePackage.Package) null, (UpdatePackage.Package) null);
            updatePackage.setPackageType(interfaceC1552680qVW.getPackageType().intValue());
            updatePackage.setAccessKey(strLIZ);
            UpdatePackage.Package r5 = new UpdatePackage.Package(interfaceC1552680qVW.getVersion().longValue(), interfaceC1552680qVW.getUrlList(), interfaceC1552680qVW.getMd5());
            r5.setLength(interfaceC1552680qVW.getSize().longValue());
            updatePackage.setFullPackage(r5);
            new Object() { // from class: X.0qX1
            }.getClass();
            C1551530qTf c1551530qTfLJFF = C797990VSb.LIZ.LJFF();
            ArrayList arrayList = new ArrayList();
            arrayList.add(updatePackage);
            C0M66.LIZ(new ARunnableS101S0100000_1(context, 73));
            C1551510qTd.LIZ.LIZ().execute(new ARunnableS31S0400000_23(c2499709qt, c1551530qTfLJFF, arrayList, context, 4));
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1553360qWc.class, null), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -7, "cannot find context", null, 4);
    }
}
