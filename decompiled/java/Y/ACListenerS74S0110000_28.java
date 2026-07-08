package Y;

import X.C10AI;
import X.C10FW;
import X.C1389890mGx;
import X.C1463620oBs;
import X.C1868070yiD;
import X.C1914760zvW;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment;
import com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService;
import java.lang.ref.SoftReference;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
public class ACListenerS74S0110000_28 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS74S0110000_28 aCListenerS74S0110000_28, View view) {
        long j;
        C19EG c19eg;
        VideoPublishEditModel videoPublishEditModel;
        CMPreviewInfo cMPreviewInfo;
        CreativeModel creativeModel;
        if (aCListenerS74S0110000_28.z1) {
            PublishDefaultPermissionFragment publishDefaultPermissionFragment = (PublishDefaultPermissionFragment) aCListenerS74S0110000_28.l0;
            VideoPublishEditModel videoPublishEditModel2 = publishDefaultPermissionFragment.aS().getVideoPublishEditModel();
            PrivacySettingModel privacySettingModel = null;
            if (videoPublishEditModel2 != null && (creativeModel = videoPublishEditModel2.creativeModel) != null) {
                privacySettingModel = creativeModel.privacySettingModel;
            }
            C10AI c10ai = C10AI.LIZ;
            String strWR = publishDefaultPermissionFragment.WR();
            if (privacySettingModel != null && (cMPreviewInfo = privacySettingModel.cmPreviewInfo) != null) {
                j = cMPreviewInfo.previewDurationTimeInMs;
            } else {
                j = 0;
            }
            c10ai.getClass();
            C10AI.LIZ(j, strWR);
            SubscriptionPreviewService subscriptionPreviewService = (SubscriptionPreviewService) ServiceManager.get().getService(SubscriptionPreviewService.class);
            Context context = publishDefaultPermissionFragment.getContext();
            if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null && (videoPublishEditModel = publishDefaultPermissionFragment.aS().getVideoPublishEditModel()) != null) {
                publishDefaultPermissionFragment.LLJJJIL = new SoftReference<>(subscriptionPreviewService.LIZLLL(c19eg.getSupportFragmentManager(), new C10FW(new C1463620oBs(videoPublishEditModel), new C1868070yiD(publishDefaultPermissionFragment.aS().getVideoPublishEditModel()), publishDefaultPermissionFragment.WR())));
                return;
            }
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx((PublishDefaultPermissionFragment) aCListenerS74S0110000_28.l0);
        c1389890mGx.LJIIIZ(2131830346);
        c1389890mGx.LJIIJJI();
    }

    public static final void onClick$1(ACListenerS74S0110000_28 aCListenerS74S0110000_28, View view) {
        Bundle bundle;
        String string;
        Bundle bundle2;
        String string2;
        String str = "";
        if (aCListenerS74S0110000_28.z1) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("popup_id", "why_this_post_algo_refresh");
            BaseSharePackage baseSharePackage = ((C1914760zvW) aCListenerS74S0110000_28.l0).LL;
            if (baseSharePackage != null && (bundle2 = baseSharePackage.extras) != null && (string2 = bundle2.getString("panel_source")) != null) {
                str = string2;
            }
            pairArr[1] = new Pair("enter_from", str);
            pairArr[2] = new Pair("action", "stop_refresh");
            C20684815ws.LJIILLIIL("why_this_post_popup_click", C2097608Jq.LJIIIIZZ(pairArr));
            ((C1914760zvW) aCListenerS74S0110000_28.l0).getClass();
            IAlgoRefreshService iAlgoRefreshService = (IAlgoRefreshService) PluggableExtentionKt.pluggableSpi$default(IAlgoRefreshService.class, false, false, false, 14, null);
            if (iAlgoRefreshService != null) {
                iAlgoRefreshService.LIZ();
            }
        } else {
            Pair[] pairArr2 = new Pair[3];
            pairArr2[0] = new Pair("popup_id", "why_this_post_algo_refresh");
            BaseSharePackage baseSharePackage2 = ((C1914760zvW) aCListenerS74S0110000_28.l0).LL;
            if (baseSharePackage2 != null && (bundle = baseSharePackage2.extras) != null && (string = bundle.getString("panel_source")) != null) {
                str = string;
            }
            pairArr2[1] = new Pair("enter_from", str);
            pairArr2[2] = new Pair("action", "ok");
            C20684815ws.LJIILLIIL("why_this_post_popup_click", C2097608Jq.LJIIIIZZ(pairArr2));
        }
        ((C1914760zvW) aCListenerS74S0110000_28.l0).LLILLJJLI.close();
    }

    public ACListenerS74S0110000_28(boolean z, Object obj, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
