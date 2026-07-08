package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelAuthEdmAndSmsGuideV3;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Te1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM$tryShowGuideOutPush$1", f = "UpvotePublishVM.kt", l = {212}, m = "invokeSuspend")
public final class C751590Te1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ UpvotePublishVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751590Te1(Activity activity, UpvotePublishVM upvotePublishVM, InterfaceC1364105Vn<? super C751590Te1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = activity;
        this.LLILLL = upvotePublishVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751590Te1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UpvotePublishVM@b134.tryShowGuideOutPush$1");
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
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("UpvotePublishVM@b134.tryShowGuideOutPush$1");
                return objLJFF;
            }
        }
        final Activity activity = this.LLILLJJLI;
        if (activity != null) {
            final UpvotePublishVM upvotePublishVM = this.LLILLL;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                if (!ChannelsAuthRefactorExp.INSTANCE.enabled() && !ChannelAuthEdmAndSmsGuideV3.INSTANCE.enabled()) {
                    ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIIJ(activity, "repost_finish", new InterfaceC1914010zuJ() { // from class: X.0Te2
                        @Override // X.InterfaceC1914010zuJ
                        public final void LIZIZ() {
                        }

                        @Override // X.InterfaceC1914010zuJ
                        public final void LIZ() {
                            String strLIZIZ = AddOptionForGuidanceExp.LIZIZ("repost");
                            upvotePublishVM.getClass();
                            if (UpvotePublishVM.wQ2() || activity.isFinishing() || activity.isDestroyed()) {
                                return;
                            }
                            C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
                            Activity activity2 = activity;
                            if (strLIZIZ.length() == 0) {
                                strLIZIZ = "normal";
                            }
                            c19212010Ec.LJIILJJIL(activity2, new C1917290zzb(strLIZIZ, upvotePublishVM.vQ2(), "direct_repost", "repost", null, null, null, null, "social_338_repost", 4080));
                        }
                    });
                } else {
                    upvotePublishVM.getClass();
                    if (UpvotePublishVM.wQ2()) {
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("UpvotePublishVM@b134.tryShowGuideOutPush$1");
                        return unit;
                    }
                    UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("repost_finish");
                    unifiedAuthPopupConfigLIZJ.setSceneId("repost_finish_direct");
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(activity);
                    if (c19egLIZIZ != null) {
                        String strLJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LJ(c19egLIZIZ);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("EnterFrom: ");
                        sbLIZ.append(upvotePublishVM.vQ2());
                        sbLIZ.append("; TabName: ");
                        sbLIZ.append(strLJ);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C211000rc.LIZ("[Push]");
                        unifiedAuthPopupConfigLIZJ.setSubSceneId(strLJ);
                    }
                    unifiedAuthPopupConfigLIZJ.setEnterFrom(upvotePublishVM.vQ2());
                    unifiedAuthPopupConfigLIZJ.setEnterMethod("direct_repost");
                    unifiedAuthPopupConfigLIZJ.setPopupTriggerId("social_338_repost");
                    unifiedAuthPopupConfigLIZJ.setSysPage("repost_finish");
                    ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(activity, null, unifiedAuthPopupConfigLIZJ);
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("UpvotePublishVM@b134.tryShowGuideOutPush$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
