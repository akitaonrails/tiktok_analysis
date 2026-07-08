package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.GuideOutPushUGNewExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10DY, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.handler.AwemeShareHelper$Companion$downloadThenGuideShare$5", f = "AwemeShareHelper.kt", l = {1194}, m = "invokeSuspend")
public final class C10DY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10DY(Context context, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10DY(this.LLILZ, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PopupInstanceConfig popupInstanceConfig;
        C1C7U.LIZ("AwemeShareHelper$Companion@b6f8.downloadThenGuideShare$5");
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
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("AwemeShareHelper$Companion@b6f8.downloadThenGuideShare$5");
                return objLJFF;
            }
        }
        int i2 = C2187451AjH.LIZ;
        if (ChannelsAuthRefactorExp.INSTANCE.enabled()) {
            UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("download_video");
            unifiedAuthPopupConfigLIZJ.setSceneStatus(0);
            unifiedAuthPopupConfigLIZJ.setSceneId("download_video");
            unifiedAuthPopupConfigLIZJ.setEnterFrom(this.LLILLJJLI);
            unifiedAuthPopupConfigLIZJ.setEnterMethod("toast_disappear");
            unifiedAuthPopupConfigLIZJ.setAvatar(this.LLILLL);
            List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
            if (list != null && (!list.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
                popupInstanceConfig.setPopupCombinationType(1);
                popupInstanceConfig.popupFiltersConfig.setLoginStatusCheck(0);
            }
            ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(this.LLILZ, null, unifiedAuthPopupConfigLIZJ);
        } else if (!C824390WVp.LIZJ(this.LLILZ) && ((Boolean) GuideOutPushUGNewExp.LJI.getValue()).booleanValue()) {
            C19212010Ec.LIZJ.LJZL(this.LLILZ, new C1917290zzb("new_ui_friends", this.LLILLJJLI, "toast_disappear", "download_video", this.LLILLL, "bottom", null, null, null, 8128));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeShareHelper$Companion@b6f8.downloadThenGuideShare$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
