package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0364, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0364 extends C1002203vw<OrderSubmitAssemViewModel> implements C034D {
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
        EnumC969503qf enumC969503qf = EnumC969503qf.DEFAULT;
        anonymousClass0360.getClass();
        AnonymousClass0360.LIZIZ(applicationContext, enumC969503qf);
    }

    @Override // X.C034D
    public final void zY1() {
        String str;
        LIZ().LLZIL = new ModuleManager();
        ModuleManager moduleManager = LIZ().LLZIL;
        if (moduleManager != null) {
            moduleManager.LJJII = EnumC969503qf.DEFAULT.getTemplate();
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

    @Override // X.C034D
    public final void R90(List<? extends InterfaceC1891350zJl> list, BillInfoData billInfoData, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        ModuleManager moduleManager;
        OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ = LIZ();
        if (orderSubmitAssemViewModelLIZ != null && (moduleManager = orderSubmitAssemViewModelLIZ.LLZIL) != null) {
            moduleManager.LJII = 1;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("payment_module_move_up_value", 0) > 0) {
            viewOnAttachStateChangeListenerC20604515jv.getState().LJIIJJI(C832403Na.LIZ(Integer.valueOf(EnumC969503qf.DEFAULT.getTemplate()), list, LIZ().uS2()), null);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                if (!(obj instanceof C7768031q)) {
                    arrayList.add(obj);
                }
            }
            viewOnAttachStateChangeListenerC20604515jv.getState().LJIIJJI(C832403Na.LIZ(Integer.valueOf(EnumC969503qf.DEFAULT.getTemplate()), arrayList, LIZ().uS2()), null);
        }
        ModuleManager moduleManager2 = LIZ().LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LJJ = true;
        }
    }
}
