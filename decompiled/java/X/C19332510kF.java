package X;

import Y.AfS197S0100000_28;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.business.universalpopup.ui.PNSKrDeviceConsentNewUI;
import com.ss.android.ugc.aweme.lemon.profile.Lemon8PopupForContentSyncFragmentV2;
import com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.live.notificationlive.adapter.PushSettingFollowListAdapter;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationSettingsAdapter;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationSettingsViewModel;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.keywords.CommentFilterKeywordsPageV2;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS115S0110000_29;
import kotlin.jvm.internal.AwS135S0101000_29;
import kotlin.jvm.internal.AwS40S0010000_28;
import uxk.a;

/* JADX INFO: renamed from: X.10kF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19332510kF implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

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
            case 8:
                onCheckedChanged$8(this, compoundButton, z);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onCheckedChanged$9(this, compoundButton, z);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onCheckedChanged$10(this, compoundButton, z);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onCheckedChanged$11(this, compoundButton, z);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onCheckedChanged$12(this, compoundButton, z);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onCheckedChanged$13(this, compoundButton, z);
                break;
            case 14:
                onCheckedChanged$14(this, compoundButton, z);
                break;
            case 15:
                onCheckedChanged$15(this, compoundButton, z);
                break;
            case 16:
                onCheckedChanged$16(this, compoundButton, z);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onCheckedChanged$17(this, compoundButton, z);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onCheckedChanged$18(this, compoundButton, z);
                break;
            case 19:
                onCheckedChanged$19(this, compoundButton, z);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onCheckedChanged$20(this, compoundButton, z);
                break;
            case 21:
                onCheckedChanged$21(this, compoundButton, z);
                break;
        }
    }

    public C19332510kF(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        if (z || ((PNSKrDeviceConsentNewUI) c19332510kF.l0).LLJJI) {
            C0HZQ c0hzqHS = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).hS();
            if (c0hzqHS != null) {
                c0hzqHS.setChecked(z);
            }
            C0HZQ c0hzqGS = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).gS();
            if (c0hzqGS != null) {
                c0hzqGS.setChecked(z);
            }
            C0HZQ c0hzqDS = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).dS();
            if (c0hzqDS != null) {
                c0hzqDS.setChecked(z);
            }
        }
        ((PNSKrDeviceConsentNewUI) c19332510kF.l0).LLJJI = true;
        PNSKrDeviceConsentNewUI.aS("agree_all", z);
    }

    public static final void onCheckedChanged$1(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        C0HZQ c0hzqGS;
        C0HZQ c0hzqDS;
        C0HZQ c0hzqHS = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).hS();
        if (c0hzqHS != null) {
            c0hzqHS.setChecked(z);
        }
        PNSKrDeviceConsentNewUI pNSKrDeviceConsentNewUI = (PNSKrDeviceConsentNewUI) c19332510kF.l0;
        boolean z2 = false;
        pNSKrDeviceConsentNewUI.LLJJI = false;
        C0HZQ c0hzqBS = pNSKrDeviceConsentNewUI.bS();
        if (c0hzqBS != null) {
            C0HZQ c0hzqHS2 = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).hS();
            if (c0hzqHS2 != null && c0hzqHS2.isChecked() && (c0hzqGS = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).gS()) != null && c0hzqGS.isChecked() && (c0hzqDS = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).dS()) != null && c0hzqDS.isChecked()) {
                z2 = true;
            }
            c0hzqBS.setChecked(z2);
        }
        ((PNSKrDeviceConsentNewUI) c19332510kF.l0).kS();
        ((PNSKrDeviceConsentNewUI) c19332510kF.l0).getClass();
        PNSKrDeviceConsentNewUI.aS("terms-of-service", z);
    }

    public static final void onCheckedChanged$10(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        C19224310Iv c19224310Iv = (C19224310Iv) c19332510kF.l0;
        if (!c19224310Iv.LLJ) {
            c19224310Iv.T4(z);
        }
    }

    public static final void onCheckedChanged$11(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        PushSettingFollowListAdapter.SubSpaceItemViewSwitchHolder subSpaceItemViewSwitchHolder = (PushSettingFollowListAdapter.SubSpaceItemViewSwitchHolder) c19332510kF.l0;
        if (subSpaceItemViewSwitchHolder.LLJIJIL == null) {
            C11RK<C127K> c11rk = new C11RK<>();
            subSpaceItemViewSwitchHolder.LLJIJIL = c11rk;
            c11rk.LJIL(400L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS197S0100000_28(subSpaceItemViewSwitchHolder, 32));
        }
        C11RK<C127K> c11rk2 = subSpaceItemViewSwitchHolder.LLJIJIL;
        if (c11rk2 != null) {
            c11rk2.onNext(((PushSettingFollowListAdapter.SubSpaceItemViewSwitchHolder) c19332510kF.l0).LLJI);
        }
        C19328310jZ.LIZIZ.f6(z ? 1 : 0, "live_sub_space_push");
    }

    public static final void onCheckedChanged$12(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        int i;
        PostNotificationSettingsAdapter.FriendOnlySwitchHolder friendOnlySwitchHolder = (PostNotificationSettingsAdapter.FriendOnlySwitchHolder) c19332510kF.l0;
        friendOnlySwitchHolder.getClass();
        try {
            PostNotificationSettingsAdapter.LLILZLL = z;
            PostNotificationSettingsViewModel postNotificationSettingsViewModelV5 = friendOnlySwitchHolder.V5();
            postNotificationSettingsViewModelV5.getClass();
            postNotificationSettingsViewModelV5.setState(new AwS115S0110000_29(postNotificationSettingsViewModelV5, z, 11));
            if (AddOptionForGuidanceExp.LJFF) {
                i = 3;
            } else {
                i = 2;
            }
            friendOnlySwitchHolder.withState(friendOnlySwitchHolder.V5(), new AwS135S0101000_29(friendOnlySwitchHolder, i, 7));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((C11RK) ((PostNotificationSettingsAdapter.FriendOnlySwitchHolder) c19332510kF.l0).LLJILJILJ.getValue()).onNext(((PostNotificationSettingsAdapter.FriendOnlySwitchHolder) c19332510kF.l0).LLJIJIL);
        C19328310jZ.LIZIZ.f6(z ? 1 : 0, "follow_new_video_push_select");
    }

    public static final void onCheckedChanged$13(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        int i;
        String str;
        ((CommentFilterKeywordsPageV2) c19332510kF.l0).NR().LLJI = true;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        String str2 = ((CommentFilterKeywordsPageV2) c19332510kF.l0).NR().LL;
        String str3 = ((CommentFilterKeywordsPageV2) c19332510kF.l0).LLIZ;
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        if (i == 1) {
            str = "manual_filter_on";
        } else {
            str = "manual_filter_off";
        }
        C1887860zE8 c1887860zE8 = new C1887860zE8();
        if (str3.length() <= 0) {
            str3 = "comment_filters";
        }
        C1887860zE8.LIZ(c1887860zE8, "enter_from", str3);
        C1887860zE8.LIZ(c1887860zE8, "enter_method", str2);
        c1163504gr.onEventV3(str, c1887860zE8.LIZ);
        ((CommentFilterKeywordsPageV2) c19332510kF.l0).NR().LLILZ.setValue(Integer.valueOf(i));
    }

    public static final void onCheckedChanged$14(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        C1913640zti c1913640zti = (C1913640zti) c19332510kF.l0;
        if (c1913640zti.LJIIIZ) {
            return;
        }
        C1913660ztk c1913660ztk = c1913640zti.LJIIIIZZ;
        if (c1913660ztk != null) {
            boolean[] zArr = c1913660ztk.LLILZ;
            if (zArr.length != 0) {
                int length = zArr.length;
                for (int i = 0; i < length; i++) {
                    c1913660ztk.LLILZ[i] = z;
                }
                c1913660ztk.notifyDataSetChanged();
                c1913660ztk.LLILLL.invoke(Boolean.valueOf(c1913660ztk.LLLI()), Boolean.valueOf(c1913660ztk.LLLFZ()));
            }
        }
        ((C1913640zti) c19332510kF.l0).getClass();
        C1913640zti.LIZIZ("agree_all", z);
    }

    public static final void onCheckedChanged$15(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        C1913640zti c1913640zti = (C1913640zti) c19332510kF.l0;
        if (c1913640zti.LJIIIZ) {
            return;
        }
        c1913640zti.LJIIJ = true;
        c1913640zti.LJFF.setChecked(z);
        ((C1913640zti) c19332510kF.l0).LJI.setChecked(z);
        ((C1913640zti) c19332510kF.l0).LJII.setChecked(z);
        C1913640zti c1913640zti2 = (C1913640zti) c19332510kF.l0;
        c1913640zti2.LJIIJ = false;
        c1913640zti2.LJI();
        ((C1913640zti) c19332510kF.l0).getClass();
        C1913640zti.LIZIZ("agree_all", z);
    }

    public static final void onCheckedChanged$16(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        ((C1913640zti) c19332510kF.l0).LIZLLL();
        if (!((C1913640zti) c19332510kF.l0).LJIIJ) {
            C1913640zti.LIZIZ("terms-of-service", z);
        }
    }

    public static final void onCheckedChanged$17(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        ((C1913640zti) c19332510kF.l0).LIZLLL();
        if (!((C1913640zti) c19332510kF.l0).LJIIJ) {
            C1913640zti.LIZIZ("terms-and-conditions-kr", z);
        }
    }

    public static final void onCheckedChanged$18(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        ((C1913640zti) c19332510kF.l0).LIZLLL();
        if (!((C1913640zti) c19332510kF.l0).LJIIJ) {
            C1913640zti.LIZIZ("consent-to-collect-and-user-of-your-personal-information-for-marketing-purpose", z);
        }
    }

    public static final void onCheckedChanged$19(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        PNSKrDeviceConsentNewUI pNSKrDeviceConsentNewUI = (PNSKrDeviceConsentNewUI) c19332510kF.l0;
        if (pNSKrDeviceConsentNewUI.LLJJJJ) {
            return;
        }
        C1913700zto c1913700zto = pNSKrDeviceConsentNewUI.LLJJIJI;
        if (c1913700zto != null) {
            boolean[] zArr = c1913700zto.LLILZ;
            if (zArr.length != 0) {
                int length = zArr.length;
                for (int i = 0; i < length; i++) {
                    c1913700zto.LLILZ[i] = z;
                }
                c1913700zto.notifyDataSetChanged();
                c1913700zto.LLILLL.invoke(Boolean.valueOf(c1913700zto.LLLI()), Boolean.valueOf(c1913700zto.LLLFZ()));
            }
        }
        ((PNSKrDeviceConsentNewUI) c19332510kF.l0).getClass();
        PNSKrDeviceConsentNewUI.aS("agree_all", z);
    }

    public static final void onCheckedChanged$2(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        C0HZQ c0hzqGS;
        C0HZQ c0hzqDS;
        C0HZQ c0hzqGS2 = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).gS();
        if (c0hzqGS2 != null) {
            c0hzqGS2.setChecked(z);
        }
        PNSKrDeviceConsentNewUI pNSKrDeviceConsentNewUI = (PNSKrDeviceConsentNewUI) c19332510kF.l0;
        boolean z2 = false;
        pNSKrDeviceConsentNewUI.LLJJI = false;
        C0HZQ c0hzqBS = pNSKrDeviceConsentNewUI.bS();
        if (c0hzqBS != null) {
            C0HZQ c0hzqHS = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).hS();
            if (c0hzqHS != null && c0hzqHS.isChecked() && (c0hzqGS = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).gS()) != null && c0hzqGS.isChecked() && (c0hzqDS = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).dS()) != null && c0hzqDS.isChecked()) {
                z2 = true;
            }
            c0hzqBS.setChecked(z2);
        }
        ((PNSKrDeviceConsentNewUI) c19332510kF.l0).kS();
        ((PNSKrDeviceConsentNewUI) c19332510kF.l0).getClass();
        PNSKrDeviceConsentNewUI.aS("terms-and-conditions-kr", z);
    }

    public static final void onCheckedChanged$20(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        ((Lemon8PopupForContentSyncFragmentV2) c19332510kF.l0).LLILZ = z;
    }

    public static final void onCheckedChanged$21(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        Function2<View, Boolean, Unit> function2 = ((C10FD) c19332510kF.l0).LJFF;
        if (function2 != null) {
            function2.invoke(compoundButton, Boolean.valueOf(z));
        }
    }

    public static final void onCheckedChanged$3(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        C0HZQ c0hzqGS;
        C0HZQ c0hzqDS;
        C0HZQ c0hzqDS2 = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).dS();
        if (c0hzqDS2 != null) {
            c0hzqDS2.setChecked(z);
        }
        PNSKrDeviceConsentNewUI pNSKrDeviceConsentNewUI = (PNSKrDeviceConsentNewUI) c19332510kF.l0;
        boolean z2 = false;
        pNSKrDeviceConsentNewUI.LLJJI = false;
        C0HZQ c0hzqBS = pNSKrDeviceConsentNewUI.bS();
        if (c0hzqBS != null) {
            C0HZQ c0hzqHS = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).hS();
            if (c0hzqHS != null && c0hzqHS.isChecked() && (c0hzqGS = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).gS()) != null && c0hzqGS.isChecked() && (c0hzqDS = ((PNSKrDeviceConsentNewUI) c19332510kF.l0).dS()) != null && c0hzqDS.isChecked()) {
                z2 = true;
            }
            c0hzqBS.setChecked(z2);
        }
        ((PNSKrDeviceConsentNewUI) c19332510kF.l0).getClass();
        PNSKrDeviceConsentNewUI.aS("consent-to-collect-and-user-of-your-personal-information-for-marketing-purpose", z);
    }

    public static final void onCheckedChanged$4(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        String contentSource;
        ((C19224510Ix) c19332510kF.l0).P4().creativeModel.privacySettingModel.aigcInfo.AIGCLabelType = z ? 1 : 0;
        ((C19224510Ix) c19332510kF.l0).P4().creativeModel.privacySettingModel.aigcInfo.manualChangeSwitch = true;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", ((C19224510Ix) c19332510kF.l0).P4().getCreationId());
        c0lab.LJ("content_type", C1428470nHB.LJIILL(((C19224510Ix) c19332510kF.l0).P4()));
        AVETParameter avetParameter = ((C19224510Ix) c19332510kF.l0).P4().getAvetParameter();
        if (avetParameter != null) {
            contentSource = avetParameter.getContentSource();
        } else {
            contentSource = null;
        }
        c0lab.LJ("content_source", contentSource);
        c0lab.LIZ(z ? 1 : 0, "action_type");
        c0lab.LJ("enter_from", "video_post_page");
        C20684815ws.LJIILLIIL("aigc_toggle", c0lab.LIZ);
        ((C19224510Ix) c19332510kF.l0).i3(new AwS40S0010000_28(z, 10));
    }

    public static final void onCheckedChanged$5(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        int i;
        String str;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        ((C10J4) c19332510kF.l0).Z4().creativeModel.privacySettingModel.allowShareToStory = i;
        C0CHQ.LIZ().LJJIIZI().LJIJI();
        C0CHQ.LIZ().LJJIIZI().LJJIII(i);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("creation_id", ((C10J4) c19332510kF.l0).Z4().getCreationId());
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c0lab.LJ("to_status", str);
        C20684815ws.LJIILLIIL("click_add_story_control", c0lab.LIZ);
        ((C10J4) c19332510kF.l0).i3(new AwS40S0010000_28(z, 11));
    }

    public static final void onCheckedChanged$6(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        int i;
        String str;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        ((C10J6) c19332510kF.l0).T4().creativeModel.privacySettingModel.allowAIRemix = i;
        ((C10J6) c19332510kF.l0).i3(new AwS40S0010000_28(z, 12));
        String str2 = "on";
        if (z) {
            str = "on";
            str2 = "off";
        } else {
            str = "off";
        }
        C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
        C1403840mdS.LJ(((C10J6) c19332510kF.l0).T4(), "video_post_page", str2, str);
    }

    public static final void onCheckedChanged$7(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        int i;
        String str;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        ((C10J5) c19332510kF.l0).d5().creativeModel.privacySettingModel.allowCreateSticker = i;
        C0CHQ.LIZ().LJJIIZI().LJIILL();
        C0CHQ.LIZ().LJJIIZI().LJJJLZIJ(i);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", ((C10J5) c19332510kF.l0).d5().getCreationId());
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("shoot_way", ((C10J5) c19332510kF.l0).d5().mShootWay);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c0lab.LJ("to_status", str);
        C20684815ws.LJIILLIIL("change_sticker_status", c0lab.LIZ);
        ((C10J5) c19332510kF.l0).i3(new AwS40S0010000_28(z, 13));
    }

    public static final void onCheckedChanged$8(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        int i;
        String str;
        VideoPublishEditModel videoPublishEditModelT4 = ((C19223910Ir) c19332510kF.l0).T4();
        if (z) {
            i = 0;
        } else {
            i = 3;
        }
        videoPublishEditModelT4.commentSetting = i;
        a aVar = a.LIZ;
        int i2 = ((C19223910Ir) c19332510kF.l0).T4().commentSetting;
        aVar.getClass();
        a.LJII(i2);
        HashMap<String, String> mapK4 = ((C19223910Ir) c19332510kF.l0).K4();
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        mapK4.put("to_status", str);
        C20684815ws.LJIILLIIL("disable_comment", mapK4);
        ((C19223910Ir) c19332510kF.l0).i3(new AwS40S0010000_28(z, 15));
    }

    public static final void onCheckedChanged$9(C19332510kF c19332510kF, CompoundButton compoundButton, boolean z) {
        String str;
        ((C10KB) c19332510kF.l0).O4().storeBoolean(((C10KB) c19332510kF.l0).LLJI, z);
        C10KB c10kb = (C10KB) c19332510kF.l0;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c10kb.P4(str);
        ((C10KB) c19332510kF.l0).i3(new AwS40S0010000_28(z, 17));
    }
}
