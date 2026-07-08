package Y;

import X.C01GW;
import X.C0FNV;
import X.C0XZ2;
import X.C13LP;
import X.C1452730nuJ;
import X.C1498600p6I;
import X.C1591860rWi;
import X.C1600710rkz;
import X.C1802190wzx;
import X.C1868040yiA;
import X.C19334810kc;
import X.C19EG;
import X.C19EH;
import X.C1B3O;
import X.C1B3Q;
import X.C1B3S;
import X.C1B3Y;
import X.C1B3Z;
import X.C1B4F;
import X.C1B4Q;
import X.C1BH6;
import X.C1BHA;
import X.C1BV2;
import X.C1BV9;
import X.C2193691AtL;
import X.C2193701AtM;
import X.C2196971Ayd;
import X.C2197371AzH;
import X.C2198701B3k;
import X.C2198861B4a;
import X.C2217221BqC;
import X.C2217231BqD;
import X.C2239731ClP;
import X.C2239861Clc;
import X.C2239941Clk;
import X.C2248681Czq;
import X.C2277891EDz;
import X.C2344009Gk;
import X.C703302op;
import X.C786410Ut5;
import X.C828330WeV;
import X.DialogC1389620mGW;
import X.EnumC1237810iJf;
import X.EnumC1237820iJg;
import X.EnumC1262370ixH;
import X.EnumC2193681AtK;
import X.EnumC852660Xce;
import X.InterfaceC1072780e1U;
import X.InterfaceC20621715mh;
import X.InterfaceC2198961B4k;
import X.InterfaceC828360WeY;
import X.RunnableC2216951Bpl;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.authorize.I18nAuthorizeFragment;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthCodeResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthInfoResponseData;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPage;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPageDetail;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage;
import com.ss.android.ugc.aweme.openauthorize.entity.WebAuthV2Response;
import com.ss.android.ugc.aweme.recommend.RecUserPopupInMainActivityController;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import com.ss.android.ugc.aweme.share.SystemShareActivityViewModel;
import com.ss.android.ugc.aweme.share.linkshare.LinkShareEntryFragment;
import com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareMainActivity;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.EditPageCreationModelInitializeKotlin;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tablet.impl.business.feed.bottombar.TabletBottomControlBarViewModel;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import u4.q0;

/* JADX INFO: loaded from: classes35.dex */
public class AObserverS236S0100000_34 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onChanged$20(this, obj);
                break;
            case 21:
                onChanged$21(this, obj);
                break;
            case 22:
                onChanged$22(this, obj);
                break;
            case 23:
                onChanged$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onChanged$24(this, obj);
                break;
            case 25:
                onChanged$25(this, obj);
                break;
            case 26:
                onChanged$26(this, obj);
                break;
            case 27:
                onChanged$27(this, obj);
                break;
            case 28:
                onChanged$28(this, obj);
                break;
            case 29:
                onChanged$29(this, obj);
                break;
            case 30:
                onChanged$30(this, obj);
                break;
            case 31:
                onChanged$31(this, obj);
                break;
            case 32:
                onChanged$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onChanged$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onChanged$34(this, obj);
                break;
            case 35:
                onChanged$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onChanged$36(this, obj);
                break;
        }
    }

    public AObserverS236S0100000_34(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        String str;
        I18nAuthorizeFragment i18nAuthorizeFragment;
        Pair pair = (Pair) obj;
        DialogC1389620mGW dialogC1389620mGW = ((BaseI18nAuthorizedFragment) aObserverS236S0100000_34.l0).LLIZ;
        C1B3S c1b3s = null;
        if (dialogC1389620mGW == null) {
            dialogC1389620mGW = null;
        }
        C786410Ut5.LJIIJ(dialogC1389620mGW);
        if (pair != null) {
            BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) aObserverS236S0100000_34.l0;
            WebAuthV2Response webAuthV2Response = (WebAuthV2Response) pair.getFirst();
            if (webAuthV2Response != null) {
                String str2 = "";
                int iIntValue = -1;
                boolean z = true;
                if (baseI18nAuthorizedFragment.LLJJIJI == null) {
                    Fragment fragment = BaseI18nAuthorizedFragment.LLJLLL;
                    if (!(fragment instanceof I18nAuthorizeFragment) || (i18nAuthorizeFragment = (I18nAuthorizeFragment) fragment) == null || (str = i18nAuthorizeFragment.LLLFFI) == null) {
                        C1B3S c1b3s2 = baseI18nAuthorizedFragment.LLILZIL;
                        if (c1b3s2 == null) {
                            c1b3s2 = null;
                        }
                        str = c1b3s2.LJII;
                    }
                    String str3 = webAuthV2Response.code;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    C1B3S c1b3s3 = baseI18nAuthorizedFragment.LLILZIL;
                    if (c1b3s3 != null) {
                        c1b3s = c1b3s3;
                    }
                    C1B3O c1b3o = new C1B3O(str2, c1b3s.LIZ, str, webAuthV2Response.error, webAuthV2Response.errorDescription, webAuthV2Response.redirectUrl, webAuthV2Response.netErrorMessage, webAuthV2Response.netErrorCode, webAuthV2Response.netErrorStatusCode);
                    String str4 = webAuthV2Response.code;
                    if (str4 == null || str4.length() <= 0) {
                        z = false;
                    }
                    Integer num = webAuthV2Response.errorCode;
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    baseI18nAuthorizedFragment.mS(iIntValue, webAuthV2Response.errorDescription, z);
                    baseI18nAuthorizedFragment.sS(c1b3o, (String) pair.getSecond());
                    return;
                }
                if (webAuthV2Response.redirectUrl == null) {
                    baseI18nAuthorizedFragment.bS(-1, "Unknown error");
                    return;
                }
                baseI18nAuthorizedFragment.mS(0, "Share succeeded.", true);
                C19EG activity = baseI18nAuthorizedFragment.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                ThirdPartyBizCert thirdPartyBizCert = new ThirdPartyBizCert(268435457);
                Context context = baseI18nAuthorizedFragment.getContext();
                if (context == null) {
                    return;
                }
                C828330WeV c828330WeV = new C828330WeV(thirdPartyBizCert);
                String str5 = webAuthV2Response.redirectUrl;
                if (str5 != null) {
                    str2 = str5;
                }
                c828330WeV.LIZIZ(context, str2, new InterfaceC828360WeY() { // from class: X.09fe
                    @Override // X.InterfaceC828360WeY
                    public final void LIZ(Context context2, String str6) {
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str6));
                            intent.addFlags(268435456);
                            intent.addCategory("android.intent.category.BROWSABLE");
                            C2429209fW.LIZ().appendDataFlowId(intent, 1207967489);
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, intent, "Context_startActivity_1");
                            C1701330uNH.LIZ(intent, context2);
                            C2204961BRm.LJJJJJL(context2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu9d5fBzjv//UXOg08/nzG/a6/y+Q/Xj8/U1lCvJFyxPQmIVA==", null));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }, null);
            }
        }
    }

    public static final void onChanged$1(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        C2198701B3k c2198701B3k = (C2198701B3k) obj;
        if (c2198701B3k != null) {
            BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) aObserverS236S0100000_34.l0;
            if (c2198701B3k.LIZ) {
                DialogC1389620mGW dialogC1389620mGW = baseI18nAuthorizedFragment.LLIZ;
                if (dialogC1389620mGW == null) {
                    dialogC1389620mGW = null;
                }
                C0FNV.LIZJ(dialogC1389620mGW);
            }
            if (c2198701B3k.LIZIZ) {
                baseI18nAuthorizedFragment.ZR(C1B3Y.LIZIZ(-2, EnumC2193681AtK.ACCESS_DENIED, baseI18nAuthorizedFragment.SR()));
            }
        }
    }

    public static final void onChanged$10(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        BPEAHandler bPEAHandler;
        if (((C2239861Clc) aObserverS236S0100000_34.l0).LJIIJ != null) {
            if (C2239941Clk.LIZ().delayTimeMills != 0) {
                BPEAHandler bPEAHandler2 = C1498600p6I.LIZ;
                Runnable runnable = ((C2239861Clc) aObserverS236S0100000_34.l0).LJIIJ;
                long j = C2239941Clk.LIZ().delayTimeMills;
                if (runnable != null && (bPEAHandler = C1498600p6I.LIZ) != null) {
                    C786410Ut5.LJLIIL(j, bPEAHandler, runnable);
                }
            } else {
                BPEAHandler bPEAHandler3 = C1498600p6I.LIZ;
                C1498600p6I.LIZIZ(new ARunnableS112S0100000_12((C2239861Clc) aObserverS236S0100000_34.l0, 214));
            }
            C2239861Clc c2239861Clc = (C2239861Clc) aObserverS236S0100000_34.l0;
            c2239861Clc.LJIIIZ = true;
            c2239861Clc.LJIIJ = null;
        }
    }

    public static final void onChanged$11(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C01GW<InterfaceC20621715mh> c01gw = RecUserPopupInMainActivityController.LLJI;
            InterfaceC20621715mh value = c01gw.getValue();
            if (value != null) {
                value.Mn0(((RecUserPopupInMainActivityController) aObserverS236S0100000_34.l0).LLILZ.LLIZLLLIL);
            }
            InterfaceC1072780e1U interfaceC1072780e1ULIZJ = RecUserPopupInMainActivityController.LLIZLLLIL;
            if (interfaceC1072780e1ULIZJ == null) {
                interfaceC1072780e1ULIZJ = C2277891EDz.LIZIZ.LIZJ();
                RecUserPopupInMainActivityController.LLIZLLLIL = interfaceC1072780e1ULIZJ;
            }
            interfaceC1072780e1ULIZJ.LJIIIZ(((RecUserPopupInMainActivityController) aObserverS236S0100000_34.l0).LLILZ.LLIZLLLIL);
            RecUserPopupInMainActivityController recUserPopupInMainActivityController = (RecUserPopupInMainActivityController) aObserverS236S0100000_34.l0;
            InterfaceC1072780e1U interfaceC1072780e1ULIZJ2 = RecUserPopupInMainActivityController.LLIZLLLIL;
            if (interfaceC1072780e1ULIZJ2 == null) {
                interfaceC1072780e1ULIZJ2 = C2277891EDz.LIZIZ.LIZJ();
                RecUserPopupInMainActivityController.LLIZLLLIL = interfaceC1072780e1ULIZJ2;
            }
            InterfaceC20621715mh value2 = c01gw.getValue();
            RecUserPopupInMainActivityController recUserPopupInMainActivityController2 = (RecUserPopupInMainActivityController) aObserverS236S0100000_34.l0;
            recUserPopupInMainActivityController.LIZLLL(interfaceC1072780e1ULIZJ2, value2, recUserPopupInMainActivityController2.LL, EnumC1262370ixH.INBOX_PROFILE_POPUP, recUserPopupInMainActivityController2.LLILZ.LLIZLLLIL);
        }
    }

    public static final void onChanged$12(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        ((SystemShareActivity) aObserverS236S0100000_34.l0).LLLZLZ((C1B4Q) obj);
    }

    public static final void onChanged$13(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        ((SystemShareActivity) aObserverS236S0100000_34.l0).finish();
    }

    public static final void onChanged$14(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        ((SystemShareActivityViewModel) aObserverS236S0100000_34.l0).xQ2((C1B4Q) obj);
    }

    public static final void onChanged$15(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        OpenLinkShareMainActivity openLinkShareMainActivity;
        C19EG activity = ((LinkShareEntryFragment) aObserverS236S0100000_34.l0).getActivity();
        if ((activity instanceof OpenLinkShareMainActivity) && (openLinkShareMainActivity = (OpenLinkShareMainActivity) activity) != null) {
            openLinkShareMainActivity.close();
        }
    }

    public static final void onChanged$16(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        OpenLinkShareMainActivity openLinkShareMainActivity;
        C19EG activity = ((LinkShareEntryFragment) aObserverS236S0100000_34.l0).getActivity();
        if ((activity instanceof OpenLinkShareMainActivity) && (openLinkShareMainActivity = (OpenLinkShareMainActivity) activity) != null) {
            openLinkShareMainActivity.LLLLZI(C1B4F.LJIILL);
            openLinkShareMainActivity.close();
        }
    }

    public static final void onChanged$17(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        OpenLinkShareMainActivity openLinkShareMainActivity;
        C1B4F c1b4f = (C1B4F) obj;
        C19EG activity = ((LinkShareEntryFragment) aObserverS236S0100000_34.l0).getActivity();
        if ((activity instanceof OpenLinkShareMainActivity) && (openLinkShareMainActivity = (OpenLinkShareMainActivity) activity) != null && c1b4f.LIZ != 0) {
            openLinkShareMainActivity.LLLLZI(c1b4f);
        }
    }

    public static final void onChanged$18(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        EditPageCreationModelInitializeKotlin editPageCreationModelInitializeKotlin = EditPageCreationModelInitializeKotlin.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObserverS236S0100000_34.l0;
        editPageCreationModelInitializeKotlin.getClass();
        EditPageCreationModelInitializeKotlin.LIZIZ((CreativeModel) obj, videoPublishEditModel);
    }

    public static final void onChanged$19(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        EditPageCreationModelInitializeKotlin editPageCreationModelInitializeKotlin = EditPageCreationModelInitializeKotlin.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObserverS236S0100000_34.l0;
        editPageCreationModelInitializeKotlin.getClass();
        EditPageCreationModelInitializeKotlin.LIZIZ((CreativeModel) obj, videoPublishEditModel);
    }

    public static final void onChanged$2(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        boolean z;
        AuthInfoResponseData authInfoResponseData = (AuthInfoResponseData) obj;
        if (authInfoResponseData != null) {
            BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) aObserverS236S0100000_34.l0;
            if (authInfoResponseData.errorCode == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                baseI18nAuthorizedFragment.getClass();
                baseI18nAuthorizedFragment.LLJILJILJ = authInfoResponseData.clientName;
                Bundle arguments = baseI18nAuthorizedFragment.getArguments();
                if (arguments != null) {
                    C786410Ut5.LJJJI("client_app_name", baseI18nAuthorizedFragment.LLJILJILJ, arguments);
                }
                C1B3Q c1b3q = C1B3Q.LIZ;
                C2344009Gk c2344009GkOR = baseI18nAuthorizedFragment.OR();
                c1b3q.getClass();
                C1B3Q.LIZLLL(c2344009GkOR, "/passport/open/auth_info/v2/");
                baseI18nAuthorizedFragment.oS(authInfoResponseData.canSkipConfirm);
                return;
            }
            C1B3Q c1b3q2 = C1B3Q.LIZ;
            C2344009Gk c2344009GkOR2 = baseI18nAuthorizedFragment.OR();
            Integer numValueOf = Integer.valueOf(authInfoResponseData.errorCode);
            String str = authInfoResponseData.LIZ;
            if (str == null) {
                str = authInfoResponseData.description;
            }
            Context contextRequireContext = baseI18nAuthorizedFragment.requireContext();
            c1b3q2.getClass();
            C1B3Q.LIZJ(c2344009GkOR2, numValueOf, str, "/passport/open/auth_info/v2/", contextRequireContext);
            int i = authInfoResponseData.errorCode;
            if (i == -1) {
                baseI18nAuthorizedFragment.oS(false);
            } else {
                BaseI18nAuthorizedFragment.aS(baseI18nAuthorizedFragment, C1B3Y.LIZIZ(i, EnumC2193681AtK.SERVER_ERROR, authInfoResponseData.description));
            }
        }
    }

    public static final void onChanged$20(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        C1452730nuJ c1452730nuJ = (C1452730nuJ) obj;
        if (c1452730nuJ != null) {
            SafeHandler safeHandler = null;
            if (c1452730nuJ.LIZ == 0) {
                EditCaptionScene editCaptionScene = (EditCaptionScene) aObserverS236S0100000_34.l0;
                editCaptionScene.LLJJJJLIIL = true;
                C786410Ut5.LJLLLLLL(8, editCaptionScene.LLLLLLL());
                if (((EditCaptionScene) aObserverS236S0100000_34.l0).LLLLLLZZ().getAdapter() != null) {
                    EditCaptionScene editCaptionScene2 = (EditCaptionScene) aObserverS236S0100000_34.l0;
                    SafeHandler safeHandler2 = editCaptionScene2.LLLFZ;
                    if (safeHandler2 == null) {
                        safeHandler2 = null;
                    }
                    safeHandler2.post((RunnableC2216951Bpl) editCaptionScene2.LLLII.getValue());
                }
                q0.LJJIFFI(((EditCaptionScene) aObserverS236S0100000_34.l0).LLLLLJLJLL(), null);
                return;
            }
            EditCaptionScene editCaptionScene3 = (EditCaptionScene) aObserverS236S0100000_34.l0;
            editCaptionScene3.LLJJJJLIIL = false;
            C786410Ut5.LJLLLLLL(0, editCaptionScene3.LLLLLLL());
            EditCaptionScene editCaptionScene4 = (EditCaptionScene) aObserverS236S0100000_34.l0;
            SafeHandler safeHandler3 = editCaptionScene4.LLLFZ;
            if (safeHandler3 != null) {
                safeHandler = safeHandler3;
            }
            safeHandler.removeCallbacks((RunnableC2216951Bpl) editCaptionScene4.LLLII.getValue());
            q0.LJJIFFI(((EditCaptionScene) aObserverS236S0100000_34.l0).LLLLLJLJLL(), (String) ((EditCaptionScene) aObserverS236S0100000_34.l0).LLLZIL.getValue());
        }
    }

    public static final void onChanged$21(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        Integer num = (Integer) obj;
        TabletBottomControlBarViewModel tabletBottomControlBarViewModel = (TabletBottomControlBarViewModel) aObserverS236S0100000_34.l0;
        boolean z = false;
        if (num != null && num.intValue() > 0) {
            z = true;
        }
        C1868040yiA c1868040yiA = (C1868040yiA) tabletBottomControlBarViewModel.LLILLL.getValue();
        if (c1868040yiA.LIZJ != z) {
            tabletBottomControlBarViewModel.LLILLL.setValue(C1868040yiA.LIZ(c1868040yiA, null, null, z, 3));
            tabletBottomControlBarViewModel.yQ2();
        }
    }

    public static final void onChanged$22(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        C1BHA.LLILZ = (String) obj;
        C1BHA c1bha = (C1BHA) aObserverS236S0100000_34.l0;
        c1bha.setTitle(c1bha.LIZIZ());
        if (Intrinsics.LJFF(C1BHA.LLILZ, "loading")) {
            ((C1BHA) aObserverS236S0100000_34.l0).setSubTitle("");
            C1BHA.LLILZ = "safe";
        }
    }

    public static final void onChanged$23(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        String str = (String) obj;
        C1BH6.LIZ.getClass();
        if (C1BH6.LIZIZ()) {
            ((C1BHA) aObserverS236S0100000_34.l0).setSubTitle(str);
        }
    }

    public static final void onChanged$24(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        VerticalViewPager verticalViewPagerLLLIIIIL;
        int iIntValue = ((Number) obj).intValue();
        ScrollSwitchStateManager scrollSwitchStateManager = ((C2248681Czq) aObserverS236S0100000_34.l0).LLIZ;
        CommonPageFragment commonPageFragmentZQ2 = null;
        if (scrollSwitchStateManager != null) {
            commonPageFragmentZQ2 = scrollSwitchStateManager.zQ2();
        }
        if ((commonPageFragmentZQ2 instanceof IDetailBaseAbility) || (commonPageFragmentZQ2 != null && C1600710rkz.LIZ(commonPageFragmentZQ2) != null)) {
            C2248681Czq c2248681Czq = (C2248681Czq) aObserverS236S0100000_34.l0;
            c2248681Czq.LJIIIIZZ(c2248681Czq.LLJJ, iIntValue, true);
        }
        IBaseListFragmentPanel iBaseListFragmentPanel = ((C2248681Czq) aObserverS236S0100000_34.l0).LLJ;
        if (iBaseListFragmentPanel != null && (verticalViewPagerLLLIIIIL = iBaseListFragmentPanel.LLLIIIIL()) != null) {
            verticalViewPagerLLLIIIIL.setCanTouch(true);
        }
    }

    public static final void onChanged$25(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        Fragment fragment;
        VerticalViewPager verticalViewPagerLLLIIIIL;
        WeakReference<Fragment> weakReference;
        int iIntValue = ((Number) obj).intValue();
        ScrollSwitchStateManager scrollSwitchStateManager = ((C2248681Czq) aObserverS236S0100000_34.l0).LLIZ;
        if (scrollSwitchStateManager != null && (weakReference = scrollSwitchStateManager.LLJJJIL) != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        boolean zLIZLLL = C1591860rWi.LIZLLL(fragment);
        C2248681Czq c2248681Czq = (C2248681Czq) aObserverS236S0100000_34.l0;
        c2248681Czq.LJIIIIZZ(c2248681Czq.LLJJ, iIntValue, zLIZLLL);
        IBaseListFragmentPanel iBaseListFragmentPanel = ((C2248681Czq) aObserverS236S0100000_34.l0).LLJ;
        if (iBaseListFragmentPanel != null && (verticalViewPagerLLLIIIIL = iBaseListFragmentPanel.LLLIIIIL()) != null) {
            verticalViewPagerLLLIIIIL.setCanTouch(true);
        }
    }

    public static final void onChanged$26(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        ((C2217221BqC) aObserverS236S0100000_34.l0).w2(((Boolean) ((Pair) obj).getFirst()).booleanValue());
    }

    public static final void onChanged$27(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        ((C2217221BqC) aObserverS236S0100000_34.l0).w2(((Boolean) ((Pair) obj).getFirst()).booleanValue());
    }

    public static final void onChanged$28(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        ((C2217231BqD) aObserverS236S0100000_34.l0).H2(((Boolean) ((Pair) obj).getFirst()).booleanValue());
    }

    public static final void onChanged$29(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        ((C2217231BqD) aObserverS236S0100000_34.l0).H2(((Boolean) ((Pair) obj).getFirst()).booleanValue());
    }

    public static final void onChanged$3(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        List<AuthorizedScope> scopeList;
        List<AuthorizedScope> bcScopeList;
        AuthorizedPage authorizedPage = (AuthorizedPage) obj;
        DialogC1389620mGW dialogC1389620mGW = null;
        if (authorizedPage != null) {
            BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) aObserverS236S0100000_34.l0;
            Integer num = authorizedPage.statusCode;
            if (num != null && num.intValue() == 0) {
                C1B3Q c1b3q = C1B3Q.LIZ;
                C2344009Gk c2344009GkOR = baseI18nAuthorizedFragment.OR();
                c1b3q.getClass();
                C1B3Q.LIZLLL(c2344009GkOR, "/aweme/v1/openapi/authorized/page/detail/");
                Boolean boolIsLite = authorizedPage.isLite();
                int i = 0;
                if (boolIsLite != null && boolIsLite.booleanValue()) {
                    baseI18nAuthorizedFragment.hS(authorizedPage);
                    baseI18nAuthorizedFragment.dS(authorizedPage);
                } else if (baseI18nAuthorizedFragment.LLJJI && C703302op.LIZ(baseI18nAuthorizedFragment.LLJJIJI)) {
                    AuthorizedPageDetail authorizedPageDetail = authorizedPage.pageDetail;
                    if (authorizedPageDetail != null && (bcScopeList = authorizedPageDetail.getBcScopeList()) != null) {
                        int size = bcScopeList.size();
                        String strLIZ = null;
                        while (i < size) {
                            C2197371AzH.LIZ.getClass();
                            strLIZ = C2197371AzH.LIZ(i, strLIZ, bcScopeList);
                            i++;
                        }
                        AuthCommonViewModel authCommonViewModel = baseI18nAuthorizedFragment.LLILZ;
                        if (authCommonViewModel == null) {
                            authCommonViewModel = null;
                        }
                        authCommonViewModel.LLJILJIL.postValue(C13LP.LJLLLL(new AComparatorS24S0000000_5(162), bcScopeList));
                        C1B3S c1b3s = baseI18nAuthorizedFragment.LLILZIL;
                        if (c1b3s == null) {
                            c1b3s = null;
                        }
                        c1b3s.LJII = strLIZ;
                        Bundle arguments = baseI18nAuthorizedFragment.getArguments();
                        if (arguments != null) {
                            C786410Ut5.LJJJI("_bytedance_params_scope", strLIZ, arguments);
                        }
                        baseI18nAuthorizedFragment.hS(authorizedPage);
                        baseI18nAuthorizedFragment.dS(authorizedPage);
                    } else {
                        BaseI18nAuthorizedFragment.aS(baseI18nAuthorizedFragment, C1B3Y.LIZIZ(-1, EnumC2193681AtK.INVALID_SCOPE, null));
                    }
                } else {
                    AuthorizedPageDetail authorizedPageDetail2 = authorizedPage.pageDetail;
                    if (authorizedPageDetail2 != null && (scopeList = authorizedPageDetail2.getScopeList()) != null) {
                        int size2 = scopeList.size();
                        String strLIZ2 = null;
                        while (i < size2) {
                            C2197371AzH.LIZ.getClass();
                            strLIZ2 = C2197371AzH.LIZ(i, strLIZ2, scopeList);
                            i++;
                        }
                        AuthCommonViewModel authCommonViewModel2 = baseI18nAuthorizedFragment.LLILZ;
                        if (authCommonViewModel2 == null) {
                            authCommonViewModel2 = null;
                        }
                        authCommonViewModel2.LLJILJIL.postValue(C13LP.LJLLLL(new AComparatorS24S0000000_5(162), scopeList));
                        C1B3S c1b3s2 = baseI18nAuthorizedFragment.LLILZIL;
                        if (c1b3s2 == null) {
                            c1b3s2 = null;
                        }
                        c1b3s2.LJII = strLIZ2;
                        C786410Ut5.LJJJI("_bytedance_params_scope", strLIZ2, baseI18nAuthorizedFragment.getArguments());
                        baseI18nAuthorizedFragment.hS(authorizedPage);
                        baseI18nAuthorizedFragment.dS(authorizedPage);
                    } else {
                        BaseI18nAuthorizedFragment.aS(baseI18nAuthorizedFragment, C1B3Y.LIZIZ(-1, EnumC2193681AtK.INVALID_SCOPE, null));
                    }
                }
            } else {
                C2193701AtM c2193701AtMLIZ = C2193691AtL.LIZ(authorizedPage.statusCode);
                C1B3O c1b3oLIZ = C1B3Y.LIZ(c2193701AtMLIZ.LIZ, c2193701AtMLIZ.LIZIZ.getValue(), authorizedPage.statusMsg, null);
                C1B3Q c1b3q2 = C1B3Q.LIZ;
                C2344009Gk c2344009GkOR2 = baseI18nAuthorizedFragment.OR();
                Integer num2 = authorizedPage.statusCode;
                String str = authorizedPage.statusMsg;
                Context contextRequireContext = baseI18nAuthorizedFragment.requireContext();
                c1b3q2.getClass();
                C1B3Q.LIZJ(c2344009GkOR2, num2, str, "/aweme/v1/openapi/authorized/page/detail/", contextRequireContext);
                BaseI18nAuthorizedFragment.aS(baseI18nAuthorizedFragment, c1b3oLIZ);
            }
        }
        DialogC1389620mGW dialogC1389620mGW2 = ((BaseI18nAuthorizedFragment) aObserverS236S0100000_34.l0).LLIZ;
        if (dialogC1389620mGW2 != null) {
            dialogC1389620mGW = dialogC1389620mGW2;
        }
        C786410Ut5.LJIIJ(dialogC1389620mGW);
    }

    public static final void onChanged$30(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        Bundle bundle = (Bundle) obj;
        C786410Ut5.LJJJI("deprecation_banner_text", ((C1BV2) aObserverS236S0100000_34.l0).LIZLLL.LLJJ, bundle);
        C786410Ut5.LJJJI("deprecation_banner_title", ((C1BV2) aObserverS236S0100000_34.l0).LIZLLL.LLJJI, bundle);
        C786410Ut5.LJJJI("deprecation_banner_description", ((C1BV2) aObserverS236S0100000_34.l0).LIZLLL.LLJJIII, bundle);
        C786410Ut5.LJJJI("login_panel_type", ((C1BV2) aObserverS236S0100000_34.l0).LIZIZ.LLILZ, bundle);
        C786410Ut5.LJJJI("oauth_platform", ((C1BV2) aObserverS236S0100000_34.l0).LJII, bundle);
        if (((C1BV2) aObserverS236S0100000_34.l0).LJ == EnumC852660Xce.BIND_EMAIL) {
            bundle.putInt("email_source", EnumC1237810iJf.PRE_LOGIN_NON_1P_EMAIL.getValue());
        }
        C1BV2 c1bv2 = (C1BV2) aObserverS236S0100000_34.l0;
        if (!c1bv2.LJIIL) {
            c1bv2.LIZLLL.wQ2();
        }
        C1BV2 c1bv22 = (C1BV2) aObserverS236S0100000_34.l0;
        c1bv22.getClass();
        C19334810kc c19334810kc = new C19334810kc(c1bv22, 9);
        if (C0XZ2.LIZIZ(((C1BV2) aObserverS236S0100000_34.l0).LJIIIIZZ)) {
            C1BV2 c1bv23 = (C1BV2) aObserverS236S0100000_34.l0;
            IBindService iBindService = c1bv23.LJIILJJIL;
            BaseActivity baseActivity = c1bv23.LIZ;
            C1BV9 c1bv9 = c1bv23.LIZIZ;
            iBindService.verifyEmailMagicLinkOnly(baseActivity, c1bv9.LL, c1bv9.LLILLJJLI, Integer.valueOf(c1bv23.LJ.getValue()), bundle, c19334810kc);
            return;
        }
        C1BV2 c1bv24 = (C1BV2) aObserverS236S0100000_34.l0;
        IBindService iBindService2 = c1bv24.LJIILJJIL;
        BaseActivity baseActivity2 = c1bv24.LIZ;
        C1BV9 c1bv92 = c1bv24.LIZIZ;
        iBindService2.bindOrVerifyEmailWithCodeAndLogin(baseActivity2, c1bv92.LL, c1bv92.LLILLJJLI, Integer.valueOf(c1bv24.LJ.getValue()), bundle, c19334810kc);
    }

    public static final void onChanged$31(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        Bundle bundle = (Bundle) obj;
        C786410Ut5.LJJJI("deprecation_banner_text", ((C1BV2) aObserverS236S0100000_34.l0).LIZLLL.LLJJ, bundle);
        C786410Ut5.LJJJI("deprecation_banner_title", ((C1BV2) aObserverS236S0100000_34.l0).LIZLLL.LLJJI, bundle);
        C786410Ut5.LJJJI("deprecation_banner_description", ((C1BV2) aObserverS236S0100000_34.l0).LIZLLL.LLJJIII, bundle);
        C786410Ut5.LJJJI("login_panel_type", ((C1BV2) aObserverS236S0100000_34.l0).LIZIZ.LLILZ, bundle);
        C786410Ut5.LJJJI("oauth_platform", ((C1BV2) aObserverS236S0100000_34.l0).LJII, bundle);
        if (((C1BV2) aObserverS236S0100000_34.l0).LJFF == EnumC852660Xce.BIND_PHONE) {
            bundle.putInt("phone_number_source", EnumC1237820iJg.PRE_LOGIN_1P_PHONE.getValue());
        }
        C1BV2 c1bv2 = (C1BV2) aObserverS236S0100000_34.l0;
        if (!c1bv2.LJIIL) {
            c1bv2.LIZLLL.wQ2();
        }
        C1BV2 c1bv22 = (C1BV2) aObserverS236S0100000_34.l0;
        c1bv22.getClass();
        C19334810kc c19334810kc = new C19334810kc(c1bv22, 9);
        C1BV2 c1bv23 = (C1BV2) aObserverS236S0100000_34.l0;
        IBindService iBindService = c1bv23.LJIILJJIL;
        BaseActivity baseActivity = c1bv23.LIZ;
        C1BV9 c1bv9 = c1bv23.LIZIZ;
        iBindService.bindOrVerifyPhoneWithCodeAndLogin(baseActivity, c1bv9.LL, c1bv9.LLILLJJLI, Integer.valueOf(c1bv23.LJFF.getValue()), bundle, c19334810kc);
    }

    public static final void onChanged$32(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        C1B4Q c1b4q = (C1B4Q) obj;
        InterfaceC2198961B4k interfaceC2198961B4k = ((C2198861B4a) aObserverS236S0100000_34.l0).LJFF.get();
        if (interfaceC2198961B4k != null) {
            interfaceC2198961B4k.LLILLL(c1b4q);
        }
    }

    public static final void onChanged$33(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        InterfaceC2198961B4k interfaceC2198961B4k = ((C2198861B4a) aObserverS236S0100000_34.l0).LJFF.get();
        if (interfaceC2198961B4k != null) {
            interfaceC2198961B4k.LLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$34(Y.AObserverS236S0100000_34 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS236S0100000_34.onChanged$34(Y.AObserverS236S0100000_34, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$35(Y.AObserverS236S0100000_34 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS236S0100000_34.onChanged$35(Y.AObserverS236S0100000_34, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$36(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        C1802190wzx c1802190wzx;
        C2196971Ayd c2196971Ayd = (C2196971Ayd) aObserverS236S0100000_34.l0;
        c2196971Ayd.LIZJ = (MinisMetaResp) ((NetworkResponse) obj).data;
        c2196971Ayd.LJ();
        if (c2196971Ayd.LJIIJJI != null && (c1802190wzx = c2196971Ayd.LJII) != null) {
            c1802190wzx.LJFF(c2196971Ayd);
        }
    }

    public static final void onChanged$4(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        String str = (String) obj;
        if (str != null) {
            ((BaseI18nAuthorizedFragment) aObserverS236S0100000_34.l0).LLJJ = str;
        }
    }

    public static final void onChanged$5(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        OAuthPage oAuthPage = (OAuthPage) obj;
        DialogC1389620mGW dialogC1389620mGW = ((BaseI18nAuthorizedFragment) aObserverS236S0100000_34.l0).LLIZ;
        if (dialogC1389620mGW == null) {
            dialogC1389620mGW = null;
        }
        C786410Ut5.LJIIJ(dialogC1389620mGW);
        if (oAuthPage != null) {
            ((BaseI18nAuthorizedFragment) aObserverS236S0100000_34.l0).qS(oAuthPage);
        }
    }

    public static final void onChanged$6(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        boolean z;
        C1B3S c1b3s;
        C1B3S c1b3s2;
        String string;
        AuthCodeResponse authCodeResponse = (AuthCodeResponse) obj;
        if (authCodeResponse != null) {
            BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) aObserverS236S0100000_34.l0;
            String str = authCodeResponse.redirectUrl;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            String str2 = "";
            int iIntValue = -1;
            if (!z) {
                Bundle arguments = baseI18nAuthorizedFragment.getArguments();
                if (arguments != null && (string = arguments.getString("_bytedance_params_redirect_uri")) != null && string.length() != 0) {
                    baseI18nAuthorizedFragment.cS(C1B3Y.LIZJ(null, null, null, authCodeResponse.redirectUrl, 7));
                    return;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(authCodeResponse.redirectUrl), "code");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
                if (str2.length() > 0) {
                    C1B3S c1b3s3 = baseI18nAuthorizedFragment.LLILZIL;
                    if (c1b3s3 == null) {
                        c1b3s2 = null;
                    } else {
                        c1b3s2 = c1b3s3;
                    }
                    String str3 = c1b3s2.LJII;
                    if (c1b3s3 == null) {
                        c1b3s3 = null;
                    }
                    baseI18nAuthorizedFragment.cS(C1B3Y.LIZJ(str2, str3, c1b3s3.LIZ, null, 8));
                    return;
                }
                Integer num = authCodeResponse.errorCode;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                BaseI18nAuthorizedFragment.aS(baseI18nAuthorizedFragment, C1B3Y.LIZ(iIntValue, authCodeResponse.error, authCodeResponse.errorDescription, authCodeResponse.errorMessage));
                return;
            }
            String str4 = authCodeResponse.code;
            if (str4 != null && str4.length() != 0) {
                String str5 = authCodeResponse.code;
                if (str5 != null) {
                    str2 = str5;
                }
                C1B3S c1b3s4 = baseI18nAuthorizedFragment.LLILZIL;
                if (c1b3s4 == null) {
                    c1b3s = null;
                } else {
                    c1b3s = c1b3s4;
                }
                String str6 = c1b3s.LJII;
                if (c1b3s4 == null) {
                    c1b3s4 = null;
                }
                baseI18nAuthorizedFragment.cS(C1B3Y.LIZJ(str2, str6, c1b3s4.LIZ, null, 8));
                return;
            }
            Integer num2 = authCodeResponse.errorCode;
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            BaseI18nAuthorizedFragment.aS(baseI18nAuthorizedFragment, C1B3Y.LIZ(iIntValue, authCodeResponse.error, authCodeResponse.errorDescription, authCodeResponse.errorMessage));
        }
    }

    public static final void onChanged$7(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        I18nAuthorizeFragment i18nAuthorizeFragmentLIZ = C1B3Z.LIZ(((BaseI18nAuthorizedFragment) aObserverS236S0100000_34.l0).getArguments(), false, true);
        BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) aObserverS236S0100000_34.l0;
        i18nAuthorizeFragmentLIZ.LLLLLZL = baseI18nAuthorizedFragment.LLJL;
        BaseI18nAuthorizedFragment.LLJLLL = i18nAuthorizeFragmentLIZ;
        C19EH c19ehLJIIJ = baseI18nAuthorizedFragment.getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.drh, i18nAuthorizeFragmentLIZ, null);
        c19ehLJIIJ.LJIIJ();
        baseI18nAuthorizedFragment.wS();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$8(Y.AObserverS236S0100000_34 r7, java.lang.Object r8) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS236S0100000_34.onChanged$8(Y.AObserverS236S0100000_34, java.lang.Object):void");
    }

    public static final void onChanged$9(AObserverS236S0100000_34 aObserverS236S0100000_34, Object obj) {
        ((C2239731ClP) aObserverS236S0100000_34.l0).LJIIJ(-1);
    }
}
