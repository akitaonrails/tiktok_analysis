package X;

import com.bytedance.keva.Keva;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.anchor.service.IAnchorListService;
import com.ss.android.ugc.aweme.check.IAutoSoundCheckService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0zJB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890990zJB extends AbstractC1873460yqu {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1873500yqy.class, null);
        InterfaceC1873500yqy interfaceC1873500yqy = (InterfaceC1873500yqy) xBaseModelLIZJ;
        interfaceC1873500yqy.setName("AdAuthorization");
        interfaceC1873500yqy.setStatus(Boolean.valueOf(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAdAuthorization()));
        arrayList.add(xBaseModelLIZJ);
        C1891120zJO.LIZ.getClass();
        XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1873500yqy.class, null);
        InterfaceC1873500yqy interfaceC1873500yqy2 = (InterfaceC1873500yqy) xBaseModelLIZJ2;
        interfaceC1873500yqy2.setName("VideoInspiration");
        interfaceC1873500yqy2.setStatus(Boolean.valueOf(((Boolean) C23250099c.LJ(C23271099x.INSTANCE, new C05G2(null))).booleanValue()));
        arrayList.add(xBaseModelLIZJ2);
        if (!((IAnchorListService) ServiceManager.get().getService(IAnchorListService.class)).LIZIZ(EnumC1430380nKG.ANCHOR_SHOP_LINK.getTYPE()) ? ((IAutoSoundCheckService) ServiceManager.get().getService(IAutoSoundCheckService.class)).LIZLLL() : ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJZZIII()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(InterfaceC1873500yqy.class, null);
            InterfaceC1873500yqy interfaceC1873500yqy3 = (InterfaceC1873500yqy) xBaseModelLIZJ3;
            interfaceC1873500yqy3.setName("VideoSoundCopyright");
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            Keva.getRepo("copyright_auto_check").storeBoolean(curUserId, true);
            interfaceC1873500yqy3.setStatus(Boolean.valueOf(((Boolean) C23250099c.LJ(C23271099x.INSTANCE, new C01XH(null))).booleanValue()));
            arrayList.add(xBaseModelLIZJ3);
        }
        if (((Boolean) C1386740mBs.LIZ.getValue()).booleanValue()) {
            XBaseModel xBaseModelLIZJ4 = C1909107dp.LIZJ(InterfaceC1873500yqy.class, null);
            InterfaceC1873500yqy interfaceC1873500yqy4 = (InterfaceC1873500yqy) xBaseModelLIZJ4;
            interfaceC1873500yqy4.setName("AIStudioEntrance");
            interfaceC1873500yqy4.setStatus(Boolean.valueOf(((Boolean) C23250099c.LJ(C23271099x.INSTANCE, new C350501Xr(null))).booleanValue()));
            arrayList.add(xBaseModelLIZJ4);
        }
        if (((Boolean) C0BOO.LIZ.getValue()).booleanValue()) {
            XBaseModel xBaseModelLIZJ5 = C1909107dp.LIZJ(InterfaceC1873500yqy.class, null);
            InterfaceC1873500yqy interfaceC1873500yqy5 = (InterfaceC1873500yqy) xBaseModelLIZJ5;
            interfaceC1873500yqy5.setName("AutoDubbingAuthorization");
            interfaceC1873500yqy5.setStatus(Boolean.valueOf(((Boolean) C23250099c.LJ(C23271099x.INSTANCE, new C05G3(null))).booleanValue()));
            arrayList.add(xBaseModelLIZJ5);
        }
        XBaseModel xBaseModelLIZJ6 = C1909107dp.LIZJ(InterfaceC1873470yqv.class, null);
        ((InterfaceC1873470yqv) xBaseModelLIZJ6).setSettings(arrayList);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ6, "");
    }
}
