package X;

import Y.AcS495S0100000_12;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.api.PublicScreenAutoTranslationSwitchEvent;
import com.bytedance.android.live.effect.karaoke.view.KaraokeSettingFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet;
import com.bytedance.android.livesdk.broadcast.GiftFeatureChannel;
import com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupGoLiveVisibleScopeSettingSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.dataChannel.GiftDisableVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.GroupChatGoLiveAutoApproveSwitch;
import com.bytedance.android.livesdk.dataChannel.LiveGoalVisibilityChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchSetting;
import com.bytedance.android.livesdk.livesetting.game.GameDualDevicePublicScreenSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.CustomizeYourExperienceFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewHistoryAuthorizationFragmentV2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import ttpobfuscated.e3;
import webcast.data.RechargeCustomError;

/* JADX INFO: renamed from: X.0UsP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785990UsP implements CompoundButton.OnCheckedChangeListener {
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
            case 22:
                onCheckedChanged$22(this, compoundButton, z);
                break;
            case 23:
                onCheckedChanged$23(this, compoundButton, z);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onCheckedChanged$24(this, compoundButton, z);
                break;
            case 25:
                onCheckedChanged$25(this, compoundButton, z);
                break;
            case 26:
                onCheckedChanged$26(this, compoundButton, z);
                break;
            case 27:
                onCheckedChanged$27(this, compoundButton, z);
                break;
            case 28:
                onCheckedChanged$28(this, compoundButton, z);
                break;
            case 29:
                onCheckedChanged$29(this, compoundButton, z);
                break;
            case 30:
                onCheckedChanged$30(this, compoundButton, z);
                break;
            case 31:
                onCheckedChanged$31(this, compoundButton, z);
                break;
            case 32:
                onCheckedChanged$32(this, compoundButton, z);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onCheckedChanged$33(this, compoundButton, z);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onCheckedChanged$34(this, compoundButton, z);
                break;
            case 35:
                onCheckedChanged$35(this, compoundButton, z);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onCheckedChanged$36(this, compoundButton, z);
                break;
            case 37:
                onCheckedChanged$37(this, compoundButton, z);
                break;
            case 38:
                onCheckedChanged$38(this, compoundButton, z);
                break;
            case 39:
                onCheckedChanged$39(this, compoundButton, z);
                break;
        }
    }

    public C785990UsP(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        C11GO c11go;
        if (z) {
            C127M accessory = ((CustomizeYourExperienceFragment) c785990UsP.l0).aS().getAccessory();
            if ((accessory instanceof AnonymousClass1278) && (c11go = (C11GO) accessory) != null) {
                c11go.LJIILJJIL(false);
            }
        }
        ((CustomizeYourExperienceFragment) c785990UsP.l0).dS();
    }

    public static final void onCheckedChanged$1(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        C11GO c11go;
        if (z) {
            C127M accessory = ((CustomizeYourExperienceFragment) c785990UsP.l0).bS().getAccessory();
            if ((accessory instanceof AnonymousClass1278) && (c11go = (C11GO) accessory) != null) {
                c11go.LJIILJJIL(false);
            }
        }
        ((CustomizeYourExperienceFragment) c785990UsP.l0).dS();
    }

    public static final void onCheckedChanged$10(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        LiveCommentSettingFragment liveCommentSettingFragment = (LiveCommentSettingFragment) c785990UsP.l0;
        liveCommentSettingFragment.getClass();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(liveCommentSettingFragment), null, null, new C751040Td8(liveCommentSettingFragment, z, c785990UsP, null), 3);
    }

    public static final void onCheckedChanged$11(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        LiveCommentSettingFragmentSheet liveCommentSettingFragmentSheet = (LiveCommentSettingFragmentSheet) c785990UsP.l0;
        liveCommentSettingFragmentSheet.getClass();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(liveCommentSettingFragmentSheet), null, null, new C751000Td4(liveCommentSettingFragmentSheet, z, null), 3);
    }

    public static final void onCheckedChanged$12(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        Object obj;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_translation_click");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ((LiveCommentSettingFragmentSheet) c785990UsP.l0));
        c474500IjALIZ.LJJIIZI(((LiveCommentSettingFragmentSheet) c785990UsP.l0).uS());
        c474500IjALIZ.LIZ();
        ((LiveCommentSettingFragmentSheet) c785990UsP.l0).getClass();
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.J5;
        c20337914i1.LJFF(Boolean.valueOf(z));
        InterfaceC1106030et7.K5.LJFF(Boolean.FALSE);
        InterfaceC1106030et7.L5.LJFF(Boolean.TRUE);
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_anchor_translation_update");
        c474500IjALIZ2.LJIJJLI(C475510Ikn.LJ((LiveCommentSettingFragmentSheet) c785990UsP.l0));
        Map mapUS = ((LiveCommentSettingFragmentSheet) c785990UsP.l0).uS();
        String str = "on";
        if (!c20337914i1.LIZIZ().booleanValue()) {
            obj = "on";
        } else {
            obj = "off";
        }
        HashMap map = (HashMap) mapUS;
        map.put("from_status", obj);
        if (!c20337914i1.LIZIZ().booleanValue()) {
            str = "off";
        }
        map.put("to_status", str);
        c474500IjALIZ2.LJJIIZI(mapUS);
        c474500IjALIZ2.LIZ();
    }

    public static final void onCheckedChanged$13(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        LiveCommentSettingFragmentSheet liveCommentSettingFragmentSheet = (LiveCommentSettingFragmentSheet) c785990UsP.l0;
        liveCommentSettingFragmentSheet.getClass();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(liveCommentSettingFragmentSheet), null, null, new C751010Td5(liveCommentSettingFragmentSheet, z, c785990UsP, null), 3);
    }

    public static final void onCheckedChanged$14(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        LiveCommentSettingFragmentSheet liveCommentSettingFragmentSheet = (LiveCommentSettingFragmentSheet) c785990UsP.l0;
        liveCommentSettingFragmentSheet.getClass();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(liveCommentSettingFragmentSheet), null, null, new C751030Td7(liveCommentSettingFragmentSheet, z, c785990UsP, null), 3);
    }

    public static final void onCheckedChanged$15(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        DataChannel dataChannel = ((GroupGoLiveVisibleScopeSettingSheet) c785990UsP.l0).LLJLLL;
        if (dataChannel != null) {
            dataChannel.zW(GroupChatGoLiveAutoApproveSwitch.class, Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [T, X.19GN] */
    public static final void onCheckedChanged$16(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        if (z) {
            BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = (BasePreviewSettingMainFragmentSheetInitializer) c785990UsP.l0;
            int i = basePreviewSettingMainFragmentSheetInitializer.LLJJJIL;
            if (i != 5) {
                if (i != 6) {
                    if (i != 8) {
                        if (i != 10) {
                            if (((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount()) {
                                C20743716Ff c20743716Ff = ((BasePreviewSettingMainFragmentSheetInitializer) c785990UsP.l0).LLL;
                                if (c20743716Ff != null) {
                                    c20743716Ff.setChecked(false);
                                }
                                C766270U4b.LIZLLL(2131855412);
                                return;
                            }
                            BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer2 = (BasePreviewSettingMainFragmentSheetInitializer) c785990UsP.l0;
                            basePreviewSettingMainFragmentSheetInitializer2.LLJJJ = true;
                            basePreviewSettingMainFragmentSheetInitializer2.LJJIJIIJIL(true, false);
                            C770220UJg c770220UJg = C770220UJg.LIZ;
                            C770220UJg.LJ(C13LE.LIZ(LiveGoalVisibilityChannel.class));
                            C770220UJg.LIZLLL(C13LE.LIZ(GiftDisableVisibilityChannel.class));
                        } else {
                            C20743716Ff c20743716Ff2 = basePreviewSettingMainFragmentSheetInitializer.LLL;
                            if (c20743716Ff2 != null) {
                                c20743716Ff2.setChecked(false);
                            }
                            BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer3 = (BasePreviewSettingMainFragmentSheetInitializer) c785990UsP.l0;
                            RechargeCustomError rechargeCustomError = basePreviewSettingMainFragmentSheetInitializer3.LLJJJJJIL;
                            if (rechargeCustomError != null) {
                                try {
                                    Gson gson = C19748512Ol.LIZIZ;
                                    ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException().mO0(basePreviewSettingMainFragmentSheetInitializer3.LL.getContext(), (CustomErrorExtra) gson.LJII(gson.LJIILL(rechargeCustomError), CustomErrorExtra.class), rechargeCustomError.errCode, Boolean.TRUE);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C20441214yg.LJ("FGW", e.getMessage());
                                }
                            }
                            ((BasePreviewSettingMainFragmentSheetInitializer) c785990UsP.l0).LJJIJIIJIL(false, false);
                        }
                    } else {
                        C20743716Ff c20743716Ff3 = basePreviewSettingMainFragmentSheetInitializer.LLL;
                        if (c20743716Ff3 != null) {
                            c20743716Ff3.setChecked(false);
                        }
                        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer4 = (BasePreviewSettingMainFragmentSheetInitializer) c785990UsP.l0;
                        basePreviewSettingMainFragmentSheetInitializer4.LJJJJLI(basePreviewSettingMainFragmentSheetInitializer4.LLJJJIL);
                        ((BasePreviewSettingMainFragmentSheetInitializer) c785990UsP.l0).LJJIJIIJIL(false, false);
                    }
                } else {
                    C20743716Ff c20743716Ff4 = basePreviewSettingMainFragmentSheetInitializer.LLL;
                    if (c20743716Ff4 != null) {
                        c20743716Ff4.setChecked(false);
                    }
                    BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer5 = (BasePreviewSettingMainFragmentSheetInitializer) c785990UsP.l0;
                    basePreviewSettingMainFragmentSheetInitializer5.getClass();
                    C259800zU c259800zU = new C259800zU();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String strLJFF = basePreviewSettingMainFragmentSheetInitializer5.LJFF(2131840906);
                    int iLJJJ = a0.LJJJ(strLJFF, e3.e, 0, false, 6);
                    int iLJJJ2 = a0.LJJJ(strLJFF, e3.f, 0, false, 6) - 1;
                    String strReplace = new Regex("[\\[\\]]").replace(strLJFF, "");
                    Context context = basePreviewSettingMainFragmentSheetInitializer5.LL.getContext();
                    if (iLJJJ >= 0 && iLJJJ <= iLJJJ2 && iLJJJ2 <= strReplace.length()) {
                        spannableStringBuilder.append((CharSequence) strReplace);
                        if (!TextUtils.isEmpty(strReplace)) {
                            C1119920fFW.LJIIIIZZ(spannableStringBuilder, iLJJJ, iLJJJ2, 33, 500);
                            C786410Ut5.q2(spannableStringBuilder, new C785790Us5(context, c259800zU, basePreviewSettingMainFragmentSheetInitializer5, 3), iLJJJ, iLJJJ2, 33);
                        }
                    } else {
                        spannableStringBuilder.append((CharSequence) strLJFF);
                    }
                    C19GO c19go = new C19GO(context);
                    c19go.LJJIIJ = true;
                    c19go.LJJIJIIJIL = false;
                    c19go.LJIIIIZZ = spannableStringBuilder;
                    c19go.LIZLLL = basePreviewSettingMainFragmentSheetInitializer5.LJFF(2131840907);
                    c19go.LJ(2131851997, new DialogInterfaceOnClickListenerC785930UsJ(context, basePreviewSettingMainFragmentSheetInitializer5, 3), false);
                    c19go.LIZJ(2131851998, new DialogInterfaceOnClickListenerC786020UsS(basePreviewSettingMainFragmentSheetInitializer5, 7), false);
                    ?? LIZ = c19go.LIZ();
                    c259800zU.element = LIZ;
                    C786410Ut5.M4(LIZ);
                    HashMap mapLJI = C2097608Jq.LJI(new Pair("action_type", "show"));
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("gpppa_popup");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJIILJJIL("start_broadcast");
                    c474500IjALIZ.LJIILIIL("start_broadcast");
                    c474500IjALIZ.LJIIJJI("live");
                    c474500IjALIZ.LJIILL("click");
                    c474500IjALIZ.LJJIIZI(mapLJI);
                    c474500IjALIZ.LIZ();
                    ((BasePreviewSettingMainFragmentSheetInitializer) c785990UsP.l0).LJJIJIIJIL(false, true);
                }
            } else {
                C20743716Ff c20743716Ff5 = basePreviewSettingMainFragmentSheetInitializer.LLL;
                if (c20743716Ff5 != null) {
                    c20743716Ff5.setChecked(false);
                }
                BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer6 = (BasePreviewSettingMainFragmentSheetInitializer) c785990UsP.l0;
                basePreviewSettingMainFragmentSheetInitializer6.LJJJJLI(basePreviewSettingMainFragmentSheetInitializer6.LLJJJIL);
                ((BasePreviewSettingMainFragmentSheetInitializer) c785990UsP.l0).LJJIJIIJIL(false, false);
            }
        } else {
            BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer7 = (BasePreviewSettingMainFragmentSheetInitializer) c785990UsP.l0;
            basePreviewSettingMainFragmentSheetInitializer7.LLJJJ = false;
            basePreviewSettingMainFragmentSheetInitializer7.LJJIJIIJIL(false, false);
            C770220UJg c770220UJg2 = C770220UJg.LIZ;
            C770220UJg.LIZLLL(C13LE.LIZ(LiveGoalVisibilityChannel.class));
            C770220UJg.LJ(C13LE.LIZ(GiftDisableVisibilityChannel.class));
        }
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer8 = (BasePreviewSettingMainFragmentSheetInitializer) c785990UsP.l0;
        int i2 = basePreviewSettingMainFragmentSheetInitializer8.LLJJJIL;
        if (i2 == 1) {
            if (basePreviewSettingMainFragmentSheetInitializer8.LLJJJ) {
                DataChannel dataChannel = basePreviewSettingMainFragmentSheetInitializer8.LLILLJJLI;
                if (dataChannel != null) {
                    dataChannel.zW(GiftFeatureChannel.class, 1);
                }
            } else {
                DataChannel dataChannel2 = basePreviewSettingMainFragmentSheetInitializer8.LLILLJJLI;
                if (dataChannel2 != null) {
                    dataChannel2.zW(GiftFeatureChannel.class, 2);
                }
            }
        } else {
            DataChannel dataChannel3 = basePreviewSettingMainFragmentSheetInitializer8.LLILLJJLI;
            if (dataChannel3 != null) {
                dataChannel3.zW(GiftFeatureChannel.class, Integer.valueOf(i2));
            }
        }
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer9 = (BasePreviewSettingMainFragmentSheetInitializer) c785990UsP.l0;
        basePreviewSettingMainFragmentSheetInitializer9.LJJJJ(false, basePreviewSettingMainFragmentSheetInitializer9.LLJJJ);
    }

    public static final void onCheckedChanged$17(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((ModeratorPermissionEditFragment) c785990UsP.l0).NR(compoundButton, z);
    }

    public static final void onCheckedChanged$18(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((ModeratorPermissionEditFragmentSheet) c785990UsP.l0).uS(compoundButton, z);
    }

    public static final void onCheckedChanged$19(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((ModeratorPermissionEditFragment) c785990UsP.l0).aS(compoundButton, z);
    }

    public static final void onCheckedChanged$2(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        C11GO c11go;
        if (z) {
            C127M accessory = ((CustomizeYourExperienceFragment) c785990UsP.l0).RR().getAccessory();
            if (accessory instanceof AnonymousClass1278) {
                c11go = (C11GO) accessory;
            } else {
                c11go = null;
            }
            if (c11go != null) {
                c11go.LJIILJJIL(false);
            }
            ((CustomizeYourExperienceFragment) c785990UsP.l0).SR().setCellEnabled(false);
        }
        ((CustomizeYourExperienceFragment) c785990UsP.l0).dS();
    }

    public static final void onCheckedChanged$20(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((ModeratorPermissionEditFragment) c785990UsP.l0).aS(compoundButton, z);
    }

    public static final void onCheckedChanged$21(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((ModeratorPermissionEditFragmentSheet) c785990UsP.l0).GS(compoundButton, z);
    }

    public static final void onCheckedChanged$22(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((ModeratorPermissionEditFragmentSheet) c785990UsP.l0).GS(compoundButton, z);
    }

    public static final void onCheckedChanged$23(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        C11GO c11go;
        if (z) {
            C127M accessory = ((CustomizeYourExperienceFragment) c785990UsP.l0).PR().getAccessory();
            if (accessory instanceof AnonymousClass1278) {
                c11go = (C11GO) accessory;
            } else {
                c11go = null;
            }
            if (c11go != null) {
                c11go.LJIILJJIL(false);
            }
            ((CustomizeYourExperienceFragment) c785990UsP.l0).SR().setCellEnabled(true);
            if (!CustomizeYourExperienceFragment.LLJJJIL) {
                CustomizeYourExperienceFragment.LLJJJIL = true;
            }
            if (((CustomizeYourExperienceFragment) c785990UsP.l0).UR().getVisibility() == 8) {
                C786410Ut5.LL(0, ((CustomizeYourExperienceFragment) c785990UsP.l0).UR());
            }
        }
        ((CustomizeYourExperienceFragment) c785990UsP.l0).dS();
    }

    public static final void onCheckedChanged$24(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        String str;
        ((VideoViewHistoryAuthorizationFragmentV2) c785990UsP.l0).LLJILJILJ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check status changed ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        VideoViewHistoryAuthorizationFragmentV2 videoViewHistoryAuthorizationFragmentV2 = (VideoViewHistoryAuthorizationFragmentV2) c785990UsP.l0;
        String str2 = videoViewHistoryAuthorizationFragmentV2.LLJ;
        if (Intrinsics.LJFF(videoViewHistoryAuthorizationFragmentV2.LLJIJIL, Boolean.TRUE)) {
            str = "auto_scene";
        } else {
            str = "click_bar";
        }
        C1350920lG6.LJIL("video_views_pop_up_click", str2, str, "toggle", CardStruct.IStatusCode.DEFAULT, ((VideoViewHistoryAuthorizationFragmentV2) c785990UsP.l0).PR(), "one_button", null, null, 384);
    }

    public static final void onCheckedChanged$25(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((Function1) c785990UsP.l0).invoke(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$26(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        String str;
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.v6;
        if (c20337914i1.LIZIZ().booleanValue()) {
            C20337914i1<Boolean> c20337914i12 = InterfaceC1106030et7.w6;
            if (!c20337914i12.LIZIZ().booleanValue()) {
                c20337914i12.LJFF(Boolean.TRUE);
                BasePreviewSettingMainFragment basePreviewSettingMainFragment = (BasePreviewSettingMainFragment) c785990UsP.l0;
                basePreviewSettingMainFragment.getClass();
                C782110Um9 c782110Um9 = new C782110Um9(basePreviewSettingMainFragment.getContext());
                c782110Um9.LJIIZILJ(2131842693);
                c782110Um9.LJII(2131842692);
                c782110Um9.LJIILIIL(2131842690, new AcS495S0100000_12(basePreviewSettingMainFragment, 42));
                c782110Um9.LJIIJ(2131842691, new AcS495S0100000_12(basePreviewSettingMainFragment, 43));
                C786410Ut5.E4(c782110Um9.LIZ());
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_caption_off_popup");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJIIZI(basePreviewSettingMainFragment.OR());
                c474500IjALIZ.LJ("show");
                c474500IjALIZ.LIZ();
                return;
            }
        }
        if (!((BasePreviewSettingMainFragment) c785990UsP.l0).LLLI) {
            c20337914i1.LJFF(Boolean.valueOf(!c20337914i1.LIZIZ().booleanValue()));
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_caption_icon_change");
            c474500IjALIZ2.LJIL();
            Map<String, String> mapOR = ((BasePreviewSettingMainFragment) c785990UsP.l0).OR();
            if (c20337914i1.LIZIZ().booleanValue()) {
                str = "on";
            } else {
                str = "off";
            }
            ((HashMap) mapOR).put("to_status", str);
            c474500IjALIZ2.LJJIIZI(mapOR);
            c474500IjALIZ2.LJ("show");
            c474500IjALIZ2.LIZ();
        }
        ((BasePreviewSettingMainFragment) c785990UsP.l0).LLLI = false;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [T, X.19GN] */
    public static final void onCheckedChanged$27(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        if (z) {
            BasePreviewSettingMainFragment basePreviewSettingMainFragment = (BasePreviewSettingMainFragment) c785990UsP.l0;
            int i = basePreviewSettingMainFragment.LLLF;
            if (i != 5) {
                if (i != 6) {
                    if (i != 8) {
                        basePreviewSettingMainFragment.LLLFFI = true;
                        basePreviewSettingMainFragment.hS(true, false);
                    } else {
                        basePreviewSettingMainFragment.aS().setChecked(false);
                        BasePreviewSettingMainFragment basePreviewSettingMainFragment2 = (BasePreviewSettingMainFragment) c785990UsP.l0;
                        basePreviewSettingMainFragment2.nS(basePreviewSettingMainFragment2.LLLF);
                        ((BasePreviewSettingMainFragment) c785990UsP.l0).hS(false, false);
                    }
                } else {
                    basePreviewSettingMainFragment.aS().setChecked(false);
                    BasePreviewSettingMainFragment basePreviewSettingMainFragment3 = (BasePreviewSettingMainFragment) c785990UsP.l0;
                    basePreviewSettingMainFragment3.getClass();
                    C259800zU c259800zU = new C259800zU();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String string = basePreviewSettingMainFragment3.getString(2131840906);
                    int iLJJJ = a0.LJJJ(string, e3.e, 0, false, 6);
                    int iLJJJ2 = a0.LJJJ(string, e3.f, 0, false, 6) - 1;
                    String strReplace = new Regex("[\\[\\]]").replace(string, "");
                    if (iLJJJ >= 0 && iLJJJ <= iLJJJ2 && iLJJJ2 <= strReplace.length()) {
                        spannableStringBuilder.append((CharSequence) strReplace);
                        if (!TextUtils.isEmpty(strReplace)) {
                            C1119920fFW.LJIIIIZZ(spannableStringBuilder, iLJJJ, iLJJJ2, 33, 500);
                            C786410Ut5.q2(spannableStringBuilder, new C785780Us4(basePreviewSettingMainFragment3, c259800zU, 5), iLJJJ, iLJJJ2, 33);
                        }
                    } else {
                        spannableStringBuilder.append((CharSequence) string);
                    }
                    C19GO c19go = new C19GO(basePreviewSettingMainFragment3.getContext());
                    c19go.LJJIIJ = true;
                    c19go.LJJIJIIJIL = false;
                    c19go.LJIIIIZZ = spannableStringBuilder;
                    c19go.LIZLLL = basePreviewSettingMainFragment3.getString(2131840907);
                    c19go.LJ(2131851997, new DialogInterfaceOnClickListenerC786020UsS(basePreviewSettingMainFragment3, 5), false);
                    c19go.LIZJ(2131851998, new DialogInterfaceOnClickListenerC786020UsS(basePreviewSettingMainFragment3, 6), false);
                    ?? LIZ = c19go.LIZ();
                    c259800zU.element = LIZ;
                    C786410Ut5.M4(LIZ);
                    HashMap mapLJI = C2097608Jq.LJI(new Pair("action_type", "show"));
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("gpppa_popup");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJIILJJIL("start_broadcast");
                    c474500IjALIZ.LJIILIIL("start_broadcast");
                    c474500IjALIZ.LJIIJJI("live");
                    c474500IjALIZ.LJIILL("click");
                    c474500IjALIZ.LJJIIZI(mapLJI);
                    c474500IjALIZ.LIZ();
                    ((BasePreviewSettingMainFragment) c785990UsP.l0).hS(false, true);
                }
            } else {
                basePreviewSettingMainFragment.aS().setChecked(false);
                BasePreviewSettingMainFragment basePreviewSettingMainFragment4 = (BasePreviewSettingMainFragment) c785990UsP.l0;
                basePreviewSettingMainFragment4.nS(basePreviewSettingMainFragment4.LLLF);
                ((BasePreviewSettingMainFragment) c785990UsP.l0).hS(false, false);
            }
        } else {
            BasePreviewSettingMainFragment basePreviewSettingMainFragment5 = (BasePreviewSettingMainFragment) c785990UsP.l0;
            basePreviewSettingMainFragment5.LLLFFI = false;
            basePreviewSettingMainFragment5.hS(false, false);
        }
        BasePreviewSettingMainFragment basePreviewSettingMainFragment6 = (BasePreviewSettingMainFragment) c785990UsP.l0;
        if (basePreviewSettingMainFragment6.LLLF == 1) {
            if (basePreviewSettingMainFragment6.LLLFFI) {
                DataChannel dataChannelLJ = C475510Ikn.LJ(basePreviewSettingMainFragment6);
                if (dataChannelLJ != null) {
                    dataChannelLJ.zW(GiftFeatureChannel.class, 1);
                    return;
                }
                return;
            }
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(basePreviewSettingMainFragment6);
            if (dataChannelLJ2 == null) {
                return;
            }
            dataChannelLJ2.zW(GiftFeatureChannel.class, 2);
            return;
        }
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(basePreviewSettingMainFragment6);
        if (dataChannelLJ3 == null) {
            return;
        }
        dataChannelLJ3.zW(GiftFeatureChannel.class, Integer.valueOf(((BasePreviewSettingMainFragment) c785990UsP.l0).LLLF));
    }

    public static final void onCheckedChanged$28(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((AdSettingsActivity) c785990UsP.l0).LLLLZIL().setEnabled(!z);
        if (z) {
            C786410Ut5.LJZL(0, ((AdSettingsActivity) c785990UsP.l0).LLLLZLL());
            String str = ((AdSettingsActivity) c785990UsP.l0).LLJILJIL;
            if (str != null && str.length() != 0) {
                C786410Ut5.LLLLZLL(((AdSettingsActivity) c785990UsP.l0).LLLLZLLLI(), 8);
                C786410Ut5.LJZL(0, ((AdSettingsActivity) c785990UsP.l0).LLLLZLLIL());
            } else {
                C786410Ut5.LLLLZLL(((AdSettingsActivity) c785990UsP.l0).LLLLZLLLI(), 0);
                C786410Ut5.LJZL(8, ((AdSettingsActivity) c785990UsP.l0).LLLLZLLIL());
            }
        } else {
            C786410Ut5.LJZL(8, ((AdSettingsActivity) c785990UsP.l0).LLLLZLL());
            C786410Ut5.LLLLZLL(((AdSettingsActivity) c785990UsP.l0).LLLLZLLLI(), 8);
            C786410Ut5.LJZL(8, ((AdSettingsActivity) c785990UsP.l0).LLLLZLLIL());
        }
        ((AdSettingsActivity) c785990UsP.l0).LLLZZIL(z);
    }

    public static final void onCheckedChanged$29(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((C013C) c785990UsP.l0).element = z;
    }

    public static final void onCheckedChanged$3(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        C751260TdU c751260TdU = (C751260TdU) c785990UsP.l0;
        c751260TdU.getClass();
        HashMap<Integer, Boolean> map = new HashMap<>();
        map.put(9, Boolean.valueOf(z));
        c751260TdU.LJFF(map, c751260TdU.LJIILJJIL, c785990UsP, null);
    }

    public static final void onCheckedChanged$30(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((C013C) c785990UsP.l0).element = z;
    }

    public static final void onCheckedChanged$31(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchChangeListener isChecked: ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("LiveSmallItemBeautyListView", C2188811AlT.LIZIZ(sbLIZ));
        C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJJIII;
        c20337914i1.LJFF(Boolean.valueOf(z));
        InterfaceC766480U4w.LJJIIJ.LJFF(Boolean.TRUE);
        ((C766590U5h) c785990UsP.l0).LJIIIIZZ(c20337914i1.LIZIZ().booleanValue());
        ((C766590U5h) c785990UsP.l0).LJIILJJIL.LLLLLZIL(c20337914i1.LIZIZ().booleanValue());
        ((C766590U5h) c785990UsP.l0).LJI(c20337914i1.LIZIZ().booleanValue());
        if (LiveBeautySwitchSetting.INSTANCE.inExperiment()) {
            C473410IhP.LIZIZ(RunnableC761200TtW.LL);
        }
    }

    public static final void onCheckedChanged$32(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        AbstractC752950TgD abstractC752950TgD;
        Function1<Boolean, Unit> function1LJII;
        C755180Tjo c755180Tjo = (C755180Tjo) c785990UsP.l0;
        if (!c755180Tjo.LJII && (abstractC752950TgD = c755180Tjo.LIZIZ) != null && (function1LJII = abstractC752950TgD.LJII()) != null) {
            function1LJII.invoke(Boolean.valueOf(z));
        }
    }

    public static final void onCheckedChanged$33(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((ModeratorPermissionEditFragmentSheet) c785990UsP.l0).GS(compoundButton, z);
    }

    public static final void onCheckedChanged$34(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((ModeratorPermissionEditFragmentSheet) c785990UsP.l0).uS(compoundButton, z);
    }

    public static final void onCheckedChanged$35(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((ModeratorPermissionEditFragment) c785990UsP.l0).aS(compoundButton, z);
    }

    public static final void onCheckedChanged$36(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((ModeratorPermissionEditFragment) c785990UsP.l0).NR(compoundButton, z);
    }

    public static final void onCheckedChanged$37(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        ((C013C) c785990UsP.l0).element = z;
    }

    public static final void onCheckedChanged$38(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        boolean zKQ2;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((KaraokeSettingFragment) c785990UsP.l0), null, null, new C764380Tye((KaraokeSettingFragment) c785990UsP.l0, z, null), 3);
        C0U17 c0u17 = C0U17.LIZ;
        KaraokeSettingFragment karaokeSettingFragment = (KaraokeSettingFragment) c785990UsP.l0;
        DataChannel dataChannel = karaokeSettingFragment.LLJJIJI;
        KaraokeViewModel karaokeViewModel = karaokeSettingFragment.LLJJIII;
        if (karaokeViewModel != null) {
            zKQ2 = karaokeViewModel.KQ2();
        } else {
            zKQ2 = false;
        }
        c0u17.LJIILIIL(dataChannel, "lyrics", z, zKQ2);
    }

    public static final void onCheckedChanged$39(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        boolean zKQ2;
        C0U1H c0u1hIQ2;
        AbstractC765580U1k abstractC765580U1k;
        KaraokeViewModel karaokeViewModel = ((KaraokeSettingFragment) c785990UsP.l0).LLJJIII;
        if (karaokeViewModel != null) {
            C765590U1l c765590U1l = karaokeViewModel.LLJLLIL;
            int iLJIIJJI = karaokeViewModel.LL.LJIIJJI();
            c765590U1l.getClass();
            C764820TzM.LIZ(iLJIIJJI).LJFF(Boolean.valueOf(z));
        }
        KaraokeViewModel karaokeViewModel2 = ((KaraokeSettingFragment) c785990UsP.l0).LLJJIII;
        if (karaokeViewModel2 != null && (c0u1hIQ2 = karaokeViewModel2.IQ2()) != null && (abstractC765580U1k = c0u1hIQ2.LIZJ) != null) {
            abstractC765580U1k.LLJJIII(z);
        }
        C0U17 c0u17 = C0U17.LIZ;
        KaraokeSettingFragment karaokeSettingFragment = (KaraokeSettingFragment) c785990UsP.l0;
        DataChannel dataChannel = karaokeSettingFragment.LLJJIJI;
        KaraokeViewModel karaokeViewModel3 = karaokeSettingFragment.LLJJIII;
        if (karaokeViewModel3 != null) {
            zKQ2 = karaokeViewModel3.KQ2();
        } else {
            zKQ2 = false;
        }
        c0u17.LJIILIIL(dataChannel, "vocal", z, zKQ2);
    }

    public static final void onCheckedChanged$4(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        C751260TdU c751260TdU = (C751260TdU) c785990UsP.l0;
        c751260TdU.getClass();
        HashMap<Integer, Boolean> map = new HashMap<>();
        map.put(13, Boolean.valueOf(z));
        c751260TdU.LJFF(map, c751260TdU.LJIIJJI, c785990UsP, null);
    }

    public static final void onCheckedChanged$5(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        C751260TdU c751260TdU = (C751260TdU) c785990UsP.l0;
        c751260TdU.getClass();
        HashMap<Integer, Boolean> map = new HashMap<>();
        map.put(4, Boolean.valueOf(z));
        c751260TdU.LJFF(map, c751260TdU.LJIIL, c785990UsP, null);
    }

    public static final void onCheckedChanged$6(C785990UsP c785990UsP, CompoundButton compoundButton, final boolean z) {
        final C751260TdU c751260TdU = (C751260TdU) c785990UsP.l0;
        Observer<Unit> observer = new Observer() { // from class: X.0TdV
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                View view;
                int i;
                View view2 = c751260TdU.LJIILL;
                int i2 = 0;
                if (view2 != null) {
                    if (z) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, view2);
                }
                if (!C500260Jjc.LJJIJLIJ() && (view = c751260TdU.LJIIZILJ) != null) {
                    if (!z) {
                        i2 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i2, view);
                }
                if (c751260TdU.LIZLLL()) {
                    View view3 = c751260TdU.LJIIZILJ;
                    if (view3 != null) {
                        C500260Jjc.LJIILIIL(view3);
                    }
                    View view4 = c751260TdU.LJIILL;
                    if (view4 != null) {
                        C500260Jjc.LJIILIIL(view4);
                    }
                }
            }
        };
        c751260TdU.getClass();
        HashMap<Integer, Boolean> map = new HashMap<>();
        map.put(8, Boolean.valueOf(z));
        c751260TdU.LJFF(map, c751260TdU.LJIILIIL, c785990UsP, observer);
    }

    public static final void onCheckedChanged$7(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        LiveCommentSettingFragment liveCommentSettingFragment = (LiveCommentSettingFragment) c785990UsP.l0;
        liveCommentSettingFragment.getClass();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(liveCommentSettingFragment), null, null, new C750990Td3(liveCommentSettingFragment, z, null), 3);
    }

    public static final void onCheckedChanged$8(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        Object obj;
        DataChannel dataChannelLJ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_translation_click");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ((LiveCommentSettingFragment) c785990UsP.l0));
        c474500IjALIZ.LJJIIZI(((LiveCommentSettingFragment) c785990UsP.l0).NR());
        c474500IjALIZ.LIZ();
        LiveCommentSettingFragment liveCommentSettingFragment = (LiveCommentSettingFragment) c785990UsP.l0;
        liveCommentSettingFragment.getClass();
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.J5;
        c20337914i1.LJFF(Boolean.valueOf(z));
        if (GameDualDevicePublicScreenSetting.INSTANCE.isExperimentGroup() && (dataChannelLJ = C475510Ikn.LJ(liveCommentSettingFragment)) != null) {
            dataChannelLJ.LC0(PublicScreenAutoTranslationSwitchEvent.class, Boolean.valueOf(z));
        }
        InterfaceC1106030et7.K5.LJFF(Boolean.FALSE);
        InterfaceC1106030et7.L5.LJFF(Boolean.TRUE);
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_anchor_translation_update");
        c474500IjALIZ2.LJIJJLI(C475510Ikn.LJ((LiveCommentSettingFragment) c785990UsP.l0));
        Map mapNR = ((LiveCommentSettingFragment) c785990UsP.l0).NR();
        String str = "on";
        if (!c20337914i1.LIZIZ().booleanValue()) {
            obj = "on";
        } else {
            obj = "off";
        }
        HashMap map = (HashMap) mapNR;
        map.put("from_status", obj);
        if (!c20337914i1.LIZIZ().booleanValue()) {
            str = "off";
        }
        map.put("to_status", str);
        c474500IjALIZ2.LJJIIZI(mapNR);
        c474500IjALIZ2.LIZ();
    }

    public static final void onCheckedChanged$9(C785990UsP c785990UsP, CompoundButton compoundButton, boolean z) {
        LiveCommentSettingFragment liveCommentSettingFragment = (LiveCommentSettingFragment) c785990UsP.l0;
        liveCommentSettingFragment.getClass();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(liveCommentSettingFragment), null, null, new C751020Td6(liveCommentSettingFragment, z, c785990UsP, null), 3);
    }
}
