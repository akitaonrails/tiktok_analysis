package X;

import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS26S0310000_1;

/* JADX INFO: renamed from: X.0363, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class AnonymousClass0363 extends C1002203vw<OrderSubmitAssemViewModel> implements C034D {
    @Override // X.C034D
    public final void ta1() {
        IECommerceHostService iECommerceHostService;
        AnonymousClass0360 anonymousClass0360 = AnonymousClass0360.LIZ;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Context applicationContext = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
        EnumC969503qf enumC969503qf = EnumC969503qf.US_OSP_V1;
        anonymousClass0360.getClass();
        AnonymousClass0360.LIZIZ(applicationContext, enumC969503qf);
    }

    @Override // X.C034D
    public void zY1() {
        String str;
        LIZ().LLZIL = new ModuleManager();
        ModuleManager moduleManager = LIZ().LLZIL;
        if (moduleManager != null) {
            moduleManager.LJJII = EnumC969503qf.US_OSP_V1.getTemplate();
            moduleManager.LJJIJIIJI = "normal_checkout";
        }
        ModuleManager moduleManager2 = LIZ().LLZIL;
        if (moduleManager2 != null) {
            HashMap<String, Object> map = LIZ().LLLIL;
            Object obj = map != null ? map.get("previous_page") : null;
            if (!(obj instanceof String) || (str = (String) obj) == null) {
                str = "";
            }
            moduleManager2.LJJIIJ = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, X.02rt] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, X.02rW] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Object] */
    @Override // X.C034D
    public final void R90(List<? extends InterfaceC1891350zJl> list, BillInfoData billInfoData, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        boolean zLJIIZILJ = billInfoData.LJIIZILJ();
        Integer num = null;
        viewOnAttachStateChangeListenerC20604515jv.getState().LJIIJJI(C832403Na.LIZ(Integer.valueOf(EnumC969503qf.US_OSP_V1.getTemplate()), list, LIZ().uS2()), null);
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        for (Object obj : arrayList2) {
            if (obj instanceof C755502xF) {
                arrayList.add(obj);
            }
        }
        C755502xF c755502xF = (C755502xF) C13LP.LJJJLL(arrayList);
        if (c755502xF != null) {
            c259800zU.element = c755502xF.LLILZLL;
            c259800zU2.element = c755502xF.LLIZ;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (obj2 instanceof C722302rt) {
                    arrayList3.add(obj2);
                }
            }
            c259800zU.element = C13LP.LJJJLL(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (obj3 instanceof C720002rW) {
                    arrayList4.add(obj3);
                }
            }
            c259800zU2.element = C13LP.LJJJLL(arrayList4);
        }
        ModuleManager moduleManager = LIZ().LLZIL;
        if (moduleManager != null) {
            ModuleManager.LJI(moduleManager, "t_preload_module_data_end", null, false, 6);
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ = LIZ();
        C722302rt c722302rt = (C722302rt) c259800zU.element;
        C720002rW c720002rW = (C720002rW) c259800zU2.element;
        Summary summary = billInfoData.summary;
        if (summary != null) {
            num = summary.skuTotalQuantity;
        }
        ModuleManager moduleManager2 = orderSubmitAssemViewModelLIZ.LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LJII = 1;
        }
        orderSubmitAssemViewModelLIZ.setState(new AwS26S0310000_1(c720002rW, c722302rt, num, zLJIIZILJ, 3));
    }
}
