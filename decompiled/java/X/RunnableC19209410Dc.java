package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import java.util.List;

/* JADX INFO: renamed from: X.10Dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class RunnableC19209410Dc implements Runnable {
    public boolean LL;
    public final /* synthetic */ AbstractC1375780luC LLILLJJLI;

    public final void LIZ() {
        if (this.LL) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC1375780luC abstractC1375780luC = this.LLILLJJLI;
        if (jCurrentTimeMillis >= abstractC1375780luC.LLJJJIL) {
            abstractC1375780luC.onDismiss();
            AbstractC1375780luC abstractC1375780luC2 = this.LLILLJJLI;
            if (!abstractC1375780luC2.LLJIJIL && (abstractC1375780luC2.LLILZLL instanceof InterfaceC1603190roz)) {
                if (ChannelsAuthRefactorExp.INSTANCE.enabled()) {
                    UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("publish_finish");
                    unifiedAuthPopupConfigLIZJ.setSceneId("publish_finish_push_post");
                    unifiedAuthPopupConfigLIZJ.setEnterFrom("homepage_friends");
                    unifiedAuthPopupConfigLIZJ.setEnterMethod("after_publish");
                    unifiedAuthPopupConfigLIZJ.setPopupTriggerId("social_338_post_video");
                    unifiedAuthPopupConfigLIZJ.setSysPage("publish_finish");
                    List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
                    if (list != null && !list.isEmpty()) {
                        ((PopupInstanceConfig) ListProtector.get(unifiedAuthPopupConfigLIZJ.popupInstances, 0)).setPopupCombinationType(3);
                    }
                    ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(this.LLILLJJLI.LLILZLL, null, unifiedAuthPopupConfigLIZJ);
                } else {
                    ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIIJ(this.LLILLJJLI.LLILZLL, "publish_finish", new InterfaceC1914010zuJ() { // from class: X.10Dd
                        @Override // X.InterfaceC1914010zuJ
                        public final void LIZIZ() {
                        }

                        @Override // X.InterfaceC1914010zuJ
                        public final void LIZ() {
                            String strLIZIZ = AddOptionForGuidanceExp.LIZIZ("publish");
                            if (TextUtils.isEmpty(strLIZIZ)) {
                                strLIZIZ = "normal";
                            }
                            C19212010Ec.LIZJ.LJIILJJIL(this.LIZ.LLILLJJLI.LLILZLL, new C1917290zzb(strLIZIZ, "homepage_friends", "after_publish", "publish", "", "bottom", 0L, 0L, "", null, null, "social_338_post_video"));
                        }
                    });
                }
            }
            this.LLILLJJLI.getClass();
            AbstractC1375780luC.LLJJJJ = false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("BaseUploadSuccessPopView$CloseRunnable@c239.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseUploadSuccessPopView$CloseRunnable@c239.run");
    }

    public RunnableC19209410Dc(AbstractC1375780luC abstractC1375780luC) {
        this.LLILLJJLI = abstractC1375780luC;
    }
}
