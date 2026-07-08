package X;

import Y.AfS197S0100000_28;
import android.app.Activity;
import android.widget.CompoundButton;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.profile.business.live.notificationlive.adapter.PushSettingFollowListAdapter;
import com.ss.android.ugc.profile.business.live.notificationlive.ui.PushSettingNotificationChoiceViewModel;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationSettingsAdapter;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationSettingsViewModel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS40S0010000_28;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10kC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19332210kC implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                break;
            case 6:
                onCheckedChanged$6(this, compoundButton, z);
                break;
            case 7:
                onCheckedChanged$7(this, compoundButton, z);
                break;
        }
    }

    public C19332210kC(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onCheckedChanged$0(C19332210kC c19332210kC, CompoundButton compoundButton, boolean z) {
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LJIIIZ()) {
            PushSettingFollowListAdapter.CampaignItemViewSwitchHolder campaignItemViewSwitchHolder = (PushSettingFollowListAdapter.CampaignItemViewSwitchHolder) c19332210kC.l0;
            if (campaignItemViewSwitchHolder.LLJIJIL == null) {
                C11RK<C127K> c11rk = new C11RK<>();
                campaignItemViewSwitchHolder.LLJIJIL = c11rk;
                c11rk.LJIL(400L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS197S0100000_28(campaignItemViewSwitchHolder, 26));
            }
            C11RK<C127K> c11rk2 = campaignItemViewSwitchHolder.LLJIJIL;
            if (c11rk2 != null) {
                c11rk2.onNext(((PushSettingFollowListAdapter.CampaignItemViewSwitchHolder) c19332210kC.l0).LLJI);
            }
            C19328310jZ.LIZIZ.f6(z ? 1 : 0, "live_campaign_push");
            return;
        }
        ((C127A) c19332210kC.l1).LJIILJJIL(!z);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LJFF(((PushSettingFollowListAdapter.CampaignItemViewSwitchHolder) c19332210kC.l0).LLJI.getContext());
    }

    public static final void onCheckedChanged$1(C19332210kC c19332210kC, CompoundButton compoundButton, boolean z) {
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LJIIIZ()) {
            PushSettingFollowListAdapter.FollowItemViewSwitchHolder followItemViewSwitchHolder = (PushSettingFollowListAdapter.FollowItemViewSwitchHolder) c19332210kC.l0;
            followItemViewSwitchHolder.getClass();
            try {
                PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel = (PushSettingNotificationChoiceViewModel) followItemViewSwitchHolder.LLJILJIL.getValue();
                pushSettingNotificationChoiceViewModel.getClass();
                pushSettingNotificationChoiceViewModel.setState(new AwS41S0010000_29(z, 92));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            PushSettingFollowListAdapter.FollowItemViewSwitchHolder followItemViewSwitchHolder2 = (PushSettingFollowListAdapter.FollowItemViewSwitchHolder) c19332210kC.l0;
            if (followItemViewSwitchHolder2.LLJIJIL == null) {
                C11RK<C127K> c11rk = new C11RK<>();
                followItemViewSwitchHolder2.LLJIJIL = c11rk;
                c11rk.LJIL(400L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS197S0100000_28(followItemViewSwitchHolder2, 27));
            }
            C11RK<C127K> c11rk2 = followItemViewSwitchHolder2.LLJIJIL;
            if (c11rk2 != null) {
                c11rk2.onNext(((PushSettingFollowListAdapter.FollowItemViewSwitchHolder) c19332210kC.l0).LLJI);
            }
            C19328310jZ.LIZIZ.f6(z ? 1 : 0, "live_push");
            return;
        }
        ((C127A) c19332210kC.l1).LJIILJJIL(!z);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LJFF(((PushSettingFollowListAdapter.FollowItemViewSwitchHolder) c19332210kC.l0).LLJI.getContext());
    }

    public static final void onCheckedChanged$2(C19332210kC c19332210kC, CompoundButton compoundButton, boolean z) {
        ILiveOuterService iLiveOuterServiceQ4;
        C10E1 c10e1M4;
        ILiveOuterService iLiveOuterServiceQ42;
        C10E1 c10e1M42;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (iLiveOuterServiceQ42 = iLiveOuterService.q4()) != null && (c10e1M42 = iLiveOuterServiceQ42.M4()) != null && c10e1M42.LJIIIZ()) {
            PushSettingFollowListAdapter.LiveCustomizedItemViewSwitchHolder liveCustomizedItemViewSwitchHolder = (PushSettingFollowListAdapter.LiveCustomizedItemViewSwitchHolder) c19332210kC.l0;
            if (liveCustomizedItemViewSwitchHolder.LLJIJIL == null) {
                C11RK<C127K> c11rk = new C11RK<>();
                liveCustomizedItemViewSwitchHolder.LLJIJIL = c11rk;
                c11rk.LJIL(400L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS197S0100000_28(liveCustomizedItemViewSwitchHolder, 28));
            }
            C11RK<C127K> c11rk2 = liveCustomizedItemViewSwitchHolder.LLJIJIL;
            if (c11rk2 != null) {
                c11rk2.onNext(((PushSettingFollowListAdapter.LiveCustomizedItemViewSwitchHolder) c19332210kC.l0).LLJI);
            }
            C19328310jZ.LIZIZ.f6(z ? 1 : 0, "live_customized_update");
            return;
        }
        ((C127A) c19332210kC.l1).LJIILJJIL(!z);
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService2 == null || (iLiveOuterServiceQ4 = iLiveOuterService2.q4()) == null || (c10e1M4 = iLiveOuterServiceQ4.M4()) == null) {
            return;
        }
        c10e1M4.LJFF(((PushSettingFollowListAdapter.LiveCustomizedItemViewSwitchHolder) c19332210kC.l0).LLJI.getContext());
    }

    public static final void onCheckedChanged$3(C19332210kC c19332210kC, CompoundButton compoundButton, boolean z) {
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LJIIIZ()) {
            PushSettingFollowListAdapter.LiveOutMultiGuestPushItemViewSwitchHolder liveOutMultiGuestPushItemViewSwitchHolder = (PushSettingFollowListAdapter.LiveOutMultiGuestPushItemViewSwitchHolder) c19332210kC.l0;
            if (liveOutMultiGuestPushItemViewSwitchHolder.LLJIJIL == null) {
                C11RK<C127K> c11rk = new C11RK<>();
                liveOutMultiGuestPushItemViewSwitchHolder.LLJIJIL = c11rk;
                c11rk.LJIL(400L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS197S0100000_28(liveOutMultiGuestPushItemViewSwitchHolder, 29));
            }
            C11RK<C127K> c11rk2 = liveOutMultiGuestPushItemViewSwitchHolder.LLJIJIL;
            if (c11rk2 != null) {
                c11rk2.onNext(((PushSettingFollowListAdapter.LiveOutMultiGuestPushItemViewSwitchHolder) c19332210kC.l0).LLJI);
            }
            C19328310jZ.LIZIZ.f6(z ? 1 : 0, "live_out_multi_guest_push");
            return;
        }
        ((C127A) c19332210kC.l1).LJIILJJIL(!z);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LJFF(((PushSettingFollowListAdapter.LiveOutMultiGuestPushItemViewSwitchHolder) c19332210kC.l0).LLJI.getContext());
    }

    public static final void onCheckedChanged$4(C19332210kC c19332210kC, CompoundButton compoundButton, boolean z) {
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LJIIIZ()) {
            PushSettingFollowListAdapter.LiveTransactionItemViewSwitchHolder liveTransactionItemViewSwitchHolder = (PushSettingFollowListAdapter.LiveTransactionItemViewSwitchHolder) c19332210kC.l0;
            if (liveTransactionItemViewSwitchHolder.LLJIJIL == null) {
                C11RK<C127K> c11rk = new C11RK<>();
                liveTransactionItemViewSwitchHolder.LLJIJIL = c11rk;
                c11rk.LJIL(400L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS197S0100000_28(liveTransactionItemViewSwitchHolder, 30));
            }
            C11RK<C127K> c11rk2 = liveTransactionItemViewSwitchHolder.LLJIJIL;
            if (c11rk2 != null) {
                c11rk2.onNext(((PushSettingFollowListAdapter.LiveTransactionItemViewSwitchHolder) c19332210kC.l0).LLJI);
            }
            C19328310jZ.LIZIZ.f6(z ? 1 : 0, "live_transaction_push");
            return;
        }
        ((C127A) c19332210kC.l1).LJIILJJIL(!z);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LJFF(((PushSettingFollowListAdapter.LiveTransactionItemViewSwitchHolder) c19332210kC.l0).LLJI.getContext());
    }

    public static final void onCheckedChanged$5(C19332210kC c19332210kC, CompoundButton compoundButton, boolean z) {
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LJIIIZ()) {
            PushSettingFollowListAdapter.RewardItemViewSwitchHolder rewardItemViewSwitchHolder = (PushSettingFollowListAdapter.RewardItemViewSwitchHolder) c19332210kC.l0;
            if (rewardItemViewSwitchHolder.LLJIJIL == null) {
                C11RK<C127K> c11rk = new C11RK<>();
                rewardItemViewSwitchHolder.LLJIJIL = c11rk;
                c11rk.LJIL(400L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS197S0100000_28(rewardItemViewSwitchHolder, 31));
            }
            C11RK<C127K> c11rk2 = rewardItemViewSwitchHolder.LLJIJIL;
            if (c11rk2 != null) {
                c11rk2.onNext(((PushSettingFollowListAdapter.RewardItemViewSwitchHolder) c19332210kC.l0).LLJI);
            }
            C19328310jZ.LIZIZ.f6(z ? 1 : 0, "live_reward_push");
            return;
        }
        ((C127A) c19332210kC.l1).LJIILJJIL(!z);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LJFF(((PushSettingFollowListAdapter.RewardItemViewSwitchHolder) c19332210kC.l0).LLJI.getContext());
    }

    public static final void onCheckedChanged$6(C19332210kC c19332210kC, CompoundButton compoundButton, boolean z) {
        if (C19211110Dt.LIZ().LJIIL()) {
            PostNotificationSettingsAdapter.SwitchHolder switchHolder = (PostNotificationSettingsAdapter.SwitchHolder) c19332210kC.l0;
            switchHolder.getClass();
            try {
                PostNotificationSettingsViewModel postNotificationSettingsViewModel = (PostNotificationSettingsViewModel) switchHolder.LLJILJILJ.getValue();
                postNotificationSettingsViewModel.getClass();
                postNotificationSettingsViewModel.setState(new AwS41S0010000_29(z, 93));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            ((C11RK) ((PostNotificationSettingsAdapter.SwitchHolder) c19332210kC.l0).LLJILJIL.getValue()).onNext(((PostNotificationSettingsAdapter.SwitchHolder) c19332210kC.l0).LLJIJIL);
            C19328310jZ.LIZIZ.f6(z ? 1 : 0, "follow_new_video_push");
            Activity activityLIZ = C1388190mED.LIZ(((PostNotificationSettingsAdapter.SwitchHolder) c19332210kC.l0).LLJI.getContext());
            if (activityLIZ != null && (!z ? 1 : 0) != 0) {
                ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getFetchPushOffReasonManager().LIZ(activityLIZ);
                return;
            }
            return;
        }
        ((C127A) c19332210kC.l1).LJIILJJIL(!z);
        C19211110Dt.LIZ().LIZLLL(((PostNotificationSettingsAdapter.SwitchHolder) c19332210kC.l0).LLJIJIL.getContext());
    }

    public static final void onCheckedChanged$7(C19332210kC c19332210kC, CompoundButton compoundButton, boolean z) {
        String str;
        C856830XjN.LIZJ(z);
        C856790XjJ c856790XjJ = C856790XjJ.LIZ;
        String creationId = ((VideoPublishEditModel) c19332210kC.l0).getCreationId();
        c856790XjJ.getClass();
        if (z) {
            str = "copyright_auto_notify_button_turnon";
        } else {
            str = "copyright_auto_notify_button_turnoff";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", creationId);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
        ((C19224410Iw) c19332210kC.l1).i3(new AwS40S0010000_28(z, 29));
        if (z) {
            C1524705y1.LIZ(new AwS572S0100000_28((C19224410Iw) c19332210kC.l1, 987));
        }
    }
}
