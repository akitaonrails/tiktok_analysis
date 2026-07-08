package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;

/* JADX INFO: renamed from: X.0Wdm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827880Wdm extends AbstractC827890Wdn implements InterfaceC827910Wdp, InterfaceC827920Wdq {
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC827910Wdp
    public final void LIZ() {
    }

    @Override // X.InterfaceC827920Wdq
    public final void onActivityPaused(Activity activity) {
        boolean zLJI = MethodIDManager.LJI(71730);
        C809270Vor.LIZJ(activity).onPause();
        C827040WcQ.LIZ.getClass();
        C827040WcQ.LIZ(activity);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC827920Wdq
    public final void onActivityResumed(Activity activity) {
        boolean z;
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi(IMainService.class);
        C827040WcQ.LIZ.getClass();
        C827040WcQ.LIZIZ(activity);
        boolean z2 = false;
        this.LIZJ = false;
        this.LIZLLL = false;
        if ((activity instanceof C19EG) && iMainService != null && iMainService.isMainActivity((C19EG) activity)) {
            z = true;
        } else {
            z = false;
        }
        this.LJ = z;
        if (activity == null) {
            throw new NullPointerException("getIntent");
        }
        Intent intent = activity.getIntent();
        try {
            this.LIZJ = intent.getBooleanExtra("from_notification", false);
            Uri data = intent.getData();
            if (intent.getBooleanExtra("ads_app_activity_by_wap_click", false) || (data != null && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "gd_label") != null && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "gd_label").startsWith("click_wap"))) {
                z2 = true;
            }
            this.LIZLLL = z2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
