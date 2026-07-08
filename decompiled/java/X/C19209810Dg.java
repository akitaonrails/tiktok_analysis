package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.GuideOutPushUGNewExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10Dg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.action.BaseCopyAction$copyToClipBoard$1$1", f = "BaseCopyAction.kt", l = {114}, m = "invokeSuspend")
public final class C19209810Dg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1377850lxX LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Activity LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19209810Dg(C1377850lxX c1377850lxX, Context context, Activity activity, InterfaceC1364105Vn<? super C19209810Dg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1377850lxX;
        this.LLILLL = context;
        this.LLILZ = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19209810Dg(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        PopupInstanceConfig popupInstanceConfig;
        C1C7U.LIZ("BaseCopyAction@bb2c.copyToClipBoard$1$1");
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
            if (AnonymousClass0958.LIZIZ(4000L, this) == objLJFF) {
                C1C7U.LIZIZ("BaseCopyAction@bb2c.copyToClipBoard$1$1");
                return objLJFF;
            }
        }
        if (ChannelsAuthRefactorExp.INSTANCE.enabled()) {
            C211000rc.LIZ("[Push-Sys]");
            UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("copy_link_finish_profile");
            unifiedAuthPopupConfigLIZJ.setSceneId("copy_link_finish_not_story_transform");
            unifiedAuthPopupConfigLIZJ.setEnterFrom(this.LLILLJJLI.LL);
            unifiedAuthPopupConfigLIZJ.setEnterMethod("toast_disappear");
            C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
            if (c19212010Ec.LLFII()) {
                str = "copy_link_success_feed";
            } else {
                str = "copy_link_success_profile";
            }
            unifiedAuthPopupConfigLIZJ.setTrigger(str);
            unifiedAuthPopupConfigLIZJ.setAvatar(c19212010Ec.LJJJ());
            unifiedAuthPopupConfigLIZJ.setSysPage("share_outapp_finish");
            List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
            if (list != null && (true ^ list.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
                popupInstanceConfig.setPopupCombinationType(2);
                popupInstanceConfig.popupFiltersConfig.setLoginStatusCheck(0);
            }
            ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(this.LLILLL, null, unifiedAuthPopupConfigLIZJ);
        } else {
            IPushPermissionApi iPushPermissionApi = (IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class);
            Activity activity = this.LLILZ;
            final Context context = this.LLILLL;
            final C1377850lxX c1377850lxX = this.LLILLJJLI;
            iPushPermissionApi.LJIIJ(activity, "share_outapp_finish", new InterfaceC1914010zuJ() { // from class: X.10Di
                @Override // X.InterfaceC1914010zuJ
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1914010zuJ
                public final void LIZ() {
                    int i2 = C2187451AjH.LIZ;
                    if (C824390WVp.LIZJ(context) || !GuideOutPushUGNewExp.LIZ()) {
                        return;
                    }
                    C19212010Ec c19212010Ec2 = C19212010Ec.LIZJ;
                    if (TextUtils.isEmpty(c19212010Ec2.LJJJ())) {
                        return;
                    }
                    c19212010Ec2.LJZL(context, new C1917290zzb("new_ui_friends", c1377850lxX.LL, "toast_disappear", c19212010Ec2.LLFII() ? "copy_link_success_feed" : "copy_link_success_profile", c19212010Ec2.LJJJ(), "bottom", null, null, null, 8128));
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseCopyAction@bb2c.copyToClipBoard$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
