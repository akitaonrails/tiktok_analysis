package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.internal.AwS118S1100000_4;

/* JADX INFO: renamed from: X.0lNQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355460lNQ {
    public static void LIZ(final C19EG c19eg, long j, final GiftViewModel giftViewModel, FragmentManager fragmentManager) {
        InterfaceC20318714ev interfaceC20318714evB4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4();
        Boolean bool = (Boolean) interfaceC20318714evB4.LIZJ(Boolean.TRUE, "can_recharge");
        Integer num = (Integer) interfaceC20318714evB4.LIZJ(18, "low_age_user_limit");
        String str = (String) interfaceC20318714evB4.LIZJ("", "live_sdk_appeal_webview");
        if (C199499133x.LIZ(str)) {
            if (C2222691Bz1.LJIIIIZZ()) {
                str = "sslocal://webcast_webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            } else {
                str = "sslocal://webcast_webview?url=https%3A%2F%2Finapp-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        if (!bool.booleanValue()) {
            int iIntValue = num.intValue();
            if (C0DHG.LIZ() && C1388190mED.LIZ(c19eg) != null) {
                C632670Orh.LIZIZ(c19eg, new C19719212De(-169181603, new C341160DZa(iIntValue, c19eg, str), true));
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
            c1397580mTM.LIZIZ(c19eg.getResources().getString(2131858225, String.valueOf(iIntValue)));
            C985403tE.LIZ(c1397580mTM, new AwS118S1100000_4(c19eg, str, 12));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_bundle_charge_source", 4);
        C786410Ut5.LJJJI("key_charge_reason", "short_video", bundle);
        bundle.putLong("key_bundle_total_coins", j);
        DialogFragment dialogFragmentCreateRechargeDialogFragment = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().createRechargeDialogFragment(c19eg, new InterfaceC1806230x6T() { // from class: X.0lDP
            @Override // X.InterfaceC1806230x6T
            public final /* synthetic */ void LIZ() {
            }

            @Override // X.InterfaceC1806230x6T
            public final void LIZIZ(int i, int i2, String str2) {
            }

            @Override // X.InterfaceC1806230x6T
            public final /* synthetic */ void LIZJ() {
            }

            @Override // X.InterfaceC1806230x6T
            public final void onFail() {
                giftViewModel.BQ2(0, 0L, c19eg, "from_recharge");
            }

            @Override // X.InterfaceC1806230x6T
            public final void onSuccess(long j2) {
                giftViewModel.BQ2(1, j2, c19eg, "from_recharge");
            }
        }, bundle, new C1355500lNU().LIZ());
        if (dialogFragmentCreateRechargeDialogFragment != null) {
            dialogFragmentCreateRechargeDialogFragment.show(fragmentManager, "KeyboardToRechargePanel");
        }
    }
}
