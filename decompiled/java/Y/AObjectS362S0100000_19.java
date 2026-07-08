package Y;

import X.AbstractDialogInterfaceC1397690mTX;
import X.C0J9U;
import X.C0XQ7;
import X.C1226060i0i;
import X.C1235000iF8;
import X.C1238760iLC;
import X.C1259360isQ;
import X.C12E8;
import X.C1397660mTU;
import X.C1401320mZO;
import X.C1481605r4;
import X.C1600770rl5;
import X.C1601380rm4;
import X.C1915907ev;
import X.C20515215Pi;
import X.C2344809Gs;
import X.C553680Lna;
import X.C735840Sti;
import X.C758320Tos;
import X.C810560Vqw;
import X.EnumC1235020iFA;
import X.InterfaceC1225900i0S;
import X.InterfaceC1226070i0j;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import com.ss.android.ugc.aweme.setting.AccountAttributesApiResponse;
import com.ss.android.ugc.aweme.setting.AccountAttributesData;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.adapter.BlackHolder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import com.ss.android.ugc.profile.business.profile.tab.MTAwemeListFragment;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.I18nAbsProfileFragmentV2;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AObjectS362S0100000_19 implements Function1 {
    public final int $t;
    public Object l0;

    public static final Object invoke$14(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        return ((BlackHolder) aObjectS362S0100000_19.l0).lambda$showBlockDialog$0((Boolean) obj);
    }

    public static final Object invoke$15(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        return ((BlackHolder) aObjectS362S0100000_19.l0).lambda$showUnblockDialog$3((Boolean) obj);
    }

    public static final Object invoke$16(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        return ((BlackHolder) aObjectS362S0100000_19.l0).lambda$showBlockDialog$1((C1397660mTU) obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            default:
                return null;
        }
    }

    public AObjectS362S0100000_19(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObjectS362S0100000_19.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.LLLLZIL(false);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObjectS362S0100000_19.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        Object obj2 = ((AbstractDialogInterfaceC1397690mTX) obj).LLIZ;
        if (obj2 == null) {
            i18nSettingManageMyAccountActivity.LLZLLLL(false, EnumC1235020iFA.CLOSE, null);
        } else if ((obj2 instanceof String) && TextUtils.equals("button_close", (String) obj2)) {
            i18nSettingManageMyAccountActivity.LLZLLLL(false, EnumC1235020iFA.X_OUT, null);
            return null;
        }
        return null;
    }

    public static final Object invoke$10(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObjectS362S0100000_19.l0;
        i18nSettingManageMyAccountActivity.LLILZ = true;
        i18nSettingManageMyAccountActivity.LLZLLLL(false, EnumC1235020iFA.VERIFY, null);
        C0XQ7.LIZ().verifyEmail(i18nSettingManageMyAccountActivity, i18nSettingManageMyAccountActivity.LLLIIII, new Bundle(), null);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObjectS362S0100000_19.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        i18nSettingManageMyAccountActivity.LLZLLLL(false, EnumC1235020iFA.CHANGE, null);
        i18nSettingManageMyAccountActivity.LLLLZI(false);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        ((C1401320mZO) aObjectS362S0100000_19.l0).mHandler.sendMessage((Message) obj);
        return null;
    }

    public static final Object invoke$13(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        if (obj != null) {
            ((MTAwemeListFragment) aObjectS362S0100000_19.l0).xU("fresh_need_refresh_event", false, false);
            return null;
        }
        return null;
    }

    public static final Object invoke$17(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        ((C1600770rl5) aObjectS362S0100000_19.l0).LL.LL.setOptPageChangeOffset(((Float) obj).floatValue());
        return null;
    }

    public static final Object invoke$18(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        I18nAbsProfileFragmentV2 i18nAbsProfileFragmentV2 = (I18nAbsProfileFragmentV2) aObjectS362S0100000_19.l0;
        i18nAbsProfileFragmentV2.getClass();
        i18nAbsProfileFragmentV2.LLIZLLLIL = ((Integer) obj).intValue();
        return null;
    }

    public static final Object invoke$19(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        ((AwemeListFragmentImpl) aObjectS362S0100000_19.l0).uU((Aweme) obj);
        return null;
    }

    public static final Object invoke$2(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObjectS362S0100000_19.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        i18nSettingManageMyAccountActivity.LLLFFI = ((Boolean) obj).booleanValue();
        return null;
    }

    public static final Object invoke$20(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) aObjectS362S0100000_19.l0;
        awemeListFragmentImpl.getClass();
        C810560Vqw.LIZJ(new ARunnableS88S0200000_19(awemeListFragmentImpl, (C553680Lna) obj, 58));
        return null;
    }

    public static final Object invoke$21(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        C12E8 c12e8 = (C12E8) obj;
        C1259360isQ c1259360isQ = ((AwemeListFragmentImpl) aObjectS362S0100000_19.l0).LLJJJ;
        if (c1259360isQ != null) {
            try {
                if (c1259360isQ.LLJZIJLIL != c12e8 && c1259360isQ.LLLIL) {
                    c1259360isQ.LLJZIJLIL = c12e8;
                    c1259360isQ.notifyDataSetChanged();
                    return null;
                }
                return null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LJI(e);
                return null;
            }
        }
        return null;
    }

    public static final Object invoke$22(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        ((AwemeListFragmentImpl) aObjectS362S0100000_19.l0).I5(14);
        C735840Sti.LIZ.getClass();
        C735840Sti.LJIJ("click", "personal_homepage_bottom");
        ((C20515215Pi) obj).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$23(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        ((AwemeListFragmentImpl) aObjectS362S0100000_19.l0).AU();
        return Unit.LIZ;
    }

    public static final Object invoke$24(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        ((AwemeListFragmentImpl) aObjectS362S0100000_19.l0).AU();
        return Unit.LIZ;
    }

    public static final Object invoke$25(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) aObjectS362S0100000_19.l0;
        MigrateTaskStatus migrateTaskStatus = (MigrateTaskStatus) obj;
        if (awemeListFragmentImpl.LLJILLL && awemeListFragmentImpl.LLJJJ != null) {
            C1481605r4.LIZIZ(new ARunnableS88S0200000_19(awemeListFragmentImpl, migrateTaskStatus, 59));
            return null;
        }
        return null;
    }

    public static final Object invoke$26(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        C1915907ev c1915907ev = (C1915907ev) obj;
        ((InterfaceC1225900i0S) aObjectS362S0100000_19.l0).LIZIZ(new C758320Tos(c1915907ev.LIZ, c1915907ev.LIZIZ, c1915907ev.LIZJ, c1915907ev.LIZLLL));
        return Unit.LIZ;
    }

    public static final Object invoke$27(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        C1226060i0i c1226060i0i = (C1226060i0i) obj;
        ((InterfaceC1226070i0j) aObjectS362S0100000_19.l0).LIZIZ(new C0J9U(c1226060i0i.LIZ, c1226060i0i.LIZIZ, c1226060i0i.LIZJ));
        return Unit.LIZ;
    }

    public static final Object invoke$28(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        ((InterfaceC1226070i0j) aObjectS362S0100000_19.l0).LIZ(((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$29(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        ((InterfaceC1225900i0S) aObjectS362S0100000_19.l0).LIZ(((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        C1235000iF8 c1235000iF8 = (C1235000iF8) aObjectS362S0100000_19.l0;
        c1235000iF8.getClass();
        Object obj2 = ((AbstractDialogInterfaceC1397690mTX) obj).LLIZ;
        if (obj2 == null) {
            c1235000iF8.LIZJ.LLZLLLL(true, EnumC1235020iFA.CLOSE, null);
        } else if ((obj2 instanceof String) && TextUtils.equals("button_close", (String) obj2)) {
            c1235000iF8.LIZJ.LLZLLLL(true, EnumC1235020iFA.X_OUT, null);
            return null;
        }
        return null;
    }

    public static final Object invoke$30(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        Aweme aweme = (Aweme) obj;
        ((C1601380rm4) aObjectS362S0100000_19.l0).getClass();
        if (aweme == null) {
            return null;
        }
        return aweme.getAuthor();
    }

    public static final Object invoke$4(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObjectS362S0100000_19.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        i18nSettingManageMyAccountActivity.LLZLLLL(true, EnumC1235020iFA.CHANGE, null);
        i18nSettingManageMyAccountActivity.LLLLZI(true);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        String string;
        String string2;
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObjectS362S0100000_19.l0;
        AccountAttributesApiResponse accountAttributesApiResponse = (AccountAttributesApiResponse) obj;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        if (!accountAttributesApiResponse.message.equals("success")) {
            return Unit.LIZ;
        }
        AccountAttributesData accountAttributesData = accountAttributesApiResponse.data;
        i18nSettingManageMyAccountActivity.LLILLL = accountAttributesData;
        if (accountAttributesData != null) {
            i18nSettingManageMyAccountActivity.LLILLJJLI = Boolean.valueOf(accountAttributesData.passwordExists).booleanValue();
            SharePrefCache.inst().getUserHasPassword().LJ(Boolean.valueOf(i18nSettingManageMyAccountActivity.LLILLJJLI));
            if (!i18nSettingManageMyAccountActivity.LLIZ) {
                C1238760iLC c1238760iLC = i18nSettingManageMyAccountActivity.LLJJI;
                if (c1238760iLC != null) {
                    if (i18nSettingManageMyAccountActivity.LLILLL.passkeyExists) {
                        string2 = i18nSettingManageMyAccountActivity.getString(2131821294);
                    } else {
                        string2 = i18nSettingManageMyAccountActivity.getString(2131821295);
                    }
                    c1238760iLC.LJIIIZ(string2);
                }
                C1238760iLC c1238760iLC2 = i18nSettingManageMyAccountActivity.LLJJ;
                if (c1238760iLC2 != null) {
                    if (i18nSettingManageMyAccountActivity.LLILLL.passwordExists) {
                        string = "";
                    } else {
                        string = i18nSettingManageMyAccountActivity.getString(2131821313);
                    }
                    c1238760iLC2.LJIIIZ(string);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObjectS362S0100000_19.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.LLLLZIL(true);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) throws Throwable {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObjectS362S0100000_19.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(i18nSettingManageMyAccountActivity.LLILZLL.getAppealUrl()));
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        try {
            I18nSettingManageMyAccountActivity.LLLLLZL(i18nSettingManageMyAccountActivity, intent);
            return null;
        } catch (ActivityNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(i18nSettingManageMyAccountActivity, "//webview");
            smartRouteBuildRoute.withParam(UriProtector.parse(i18nSettingManageMyAccountActivity.LLILZLL.getAppealUrl()));
            smartRouteBuildRoute.open();
            return null;
        }
    }

    public static final Object invoke$8(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObjectS362S0100000_19.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        i18nSettingManageMyAccountActivity.LLZLLLL(false, EnumC1235020iFA.CHANGE, null);
        i18nSettingManageMyAccountActivity.LLLLZI(false);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AObjectS362S0100000_19 aObjectS362S0100000_19, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObjectS362S0100000_19.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.LLLLZIL(false);
        return Unit.LIZ;
    }
}
