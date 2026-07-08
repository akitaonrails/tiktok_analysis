package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelAuthEdmAndSmsGuideV3;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tdz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager$onAwemeCollectionStateChange$1", f = "PushPermissionPopupManager.kt", l = {828}, m = "invokeSuspend")
public final class C751570Tdz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IUniAuthGuidePopupApi LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751570Tdz(IUniAuthGuidePopupApi iUniAuthGuidePopupApi, InterfaceC1364105Vn<? super C751570Tdz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iUniAuthGuidePopupApi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751570Tdz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZIZ;
        PopupInstanceConfig popupInstanceConfig;
        C1C7U.LIZ("PushPermissionPopupManager@8bac.onAwemeCollectionStateChange$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("PushPermissionPopupManager@8bac.onAwemeCollectionStateChange$1");
                return objLJFF;
            }
        }
        if (ChannelAuthEdmAndSmsGuideV3.INSTANCE.enabled()) {
            UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = this.LLILLJJLI.LIZJ("favorite_video");
            unifiedAuthPopupConfigLIZJ.setSceneId("favorite_video");
            unifiedAuthPopupConfigLIZJ.setEnterFrom("homepage_hot");
            unifiedAuthPopupConfigLIZJ.setTrigger("favorite_video");
            unifiedAuthPopupConfigLIZJ.setPopupTriggerId("ug_338_follow_feed");
            List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
            if (list != null && (true ^ list.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
                popupInstanceConfig.setPopupCombinationType(0);
            }
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                IUniAuthGuidePopupApi iUniAuthGuidePopupApi = this.LLILLJJLI;
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ);
                if (c19egLIZIZ != null) {
                    unifiedAuthPopupConfigLIZJ.setSubSceneId(iUniAuthGuidePopupApi.LJ(c19egLIZIZ));
                }
                iUniAuthGuidePopupApi.LIZLLL(activityLIZIZ, null, unifiedAuthPopupConfigLIZJ);
            }
        } else {
            ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIIJ(null, "favourite_finish", null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushPermissionPopupManager@8bac.onAwemeCollectionStateChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
