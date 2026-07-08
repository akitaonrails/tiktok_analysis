package Y;

import X.AbstractC1387200mCc;
import X.C0XQ7;
import X.C1209900hae;
import X.C1239820iMu;
import X.C1239830iMv;
import X.C1239880iN0;
import X.C1254710ikv;
import X.C1255210ilj;
import X.C1260090itb;
import X.C1388190mED;
import X.C1745060vVo;
import X.C1906580ziK;
import X.C1C7U;
import X.C2344809Gs;
import X.C7740030o;
import X.C810560Vqw;
import X.C810650Vr5;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.api.FeedActionApi;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import com.ss.android.ugc.profile.business.profile.tab.presenter.UserIdResponse;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AwS563S0100000_19;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class ACallableS424S0100000_19 implements Callable {
    public final int $t;
    public Object l0;

    public static final Object call$13(ACallableS424S0100000_19 aCallableS424S0100000_19) {
        return (FeedItemList) aCallableS424S0100000_19.l0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS424S0100000_19 aCallableS424S0100000_19) {
        FragmentManager fragmentManagerLJ;
        ((DetailFragmentPanel) aCallableS424S0100000_19.l0).getClass();
        C1C7U.LIZ("DetailFragmentPanel@5b0b.resetPlayedVideoCountIfNeeded$1L");
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (fragmentManagerLJ = abstractC1387200mCcLIZIZ.LJ()) != null && !DetailFragmentPanel.J(fragmentManagerLJ)) {
            C1209900hae.LIZ = -1;
        }
        C1C7U.LIZIZ("DetailFragmentPanel@5b0b.resetPlayedVideoCountIfNeeded$1L");
        return null;
    }

    public static final Object call$1(ACallableS424S0100000_19 aCallableS424S0100000_19) {
        DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) aCallableS424S0100000_19.l0;
        detailFragmentPanel.getClass();
        C1C7U.LIZ("DetailFragmentPanel@5b0b.onPlaying$1L");
        if (detailFragmentPanel.f344k0 == 0 && detailFragmentPanel.LLLLIIIILLL.isFromPostList() && ((detailFragmentPanel.LLLLIIIILLL.getFollowStatus().intValue() == 1 || detailFragmentPanel.LLLLIIIILLL.getFollowStatus().intValue() == 2) && C1209900hae.LIZLLL)) {
            C1209900hae.LIZ++;
        }
        C1C7U.LIZIZ("DetailFragmentPanel@5b0b.onPlaying$1L");
        return null;
    }

    public static final Object call$10(ACallableS424S0100000_19 aCallableS424S0100000_19) {
        C1C7U.LIZ("ScheduleItemDeleteModel@a668.sendRequest$1");
        String str = (String) ((Object[]) aCallableS424S0100000_19.l0)[0];
        FeedActionApi.LIZJ(str);
        C1C7U.LIZIZ("ScheduleItemDeleteModel@a668.sendRequest$1");
        return str;
    }

    public static final Object call$11(ACallableS424S0100000_19 aCallableS424S0100000_19) {
        C1C7U.LIZ("ItemDeleteModel@4b84.sendRequest$1");
        Object[] objArr = (Object[]) aCallableS424S0100000_19.l0;
        if (objArr.length == 2) {
            String str = (String) objArr[0];
            FeedActionApi.LIZIZ(str, ((Boolean) objArr[1]).booleanValue());
            C1C7U.LIZIZ("ItemDeleteModel@4b84.sendRequest$1");
            return str;
        }
        String str2 = (String) objArr[0];
        FeedActionApi.LIZ(str2);
        C1C7U.LIZIZ("ItemDeleteModel@4b84.sendRequest$1");
        return str2;
    }

    public static final Object call$12(ACallableS424S0100000_19 aCallableS424S0100000_19) {
        C1C7U.LIZ("UserIdPresenter@6d38.bindModel$1$sendRequest$1");
        String string = ((Uri.Builder) aCallableS424S0100000_19.l0).toString();
        String str = C1254710ikv.LIZ;
        boolean zLJI = MethodIDManager.LJI(202193);
        Object objApiExecuteGetJSONObject = C1260090itb.LIZIZ.apiExecuteGetJSONObject(string, UserIdResponse.class, "", true, null, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        C1C7U.LIZIZ("UserIdPresenter@6d38.bindModel$1$sendRequest$1");
        return objApiExecuteGetJSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$14(Y.ACallableS424S0100000_19 r16) {
        /*
            java.lang.String r5 = "ProfilePreloadLogicKt@e28a.doPreloadProfile$1"
            X.C1C7U.LIZ(r5)
            r6 = 1
            r1 = r16
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r7 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r8 = r0.getSecUid()
            r10 = 0
            r12 = 20
            java.lang.String r13 = "profile_preload"
            X.0XHi r14 = new X.0XHi
            r14.<init>()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r2 = r0.getCurUserId()
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
            boolean r15 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            java.lang.String r16 = "tab_on_node_show_preload"
            r9 = 0
            com.ss.android.ugc.aweme.feed.model.FeedItemList r4 = X.C1255950imv.LJI(r6, r7, r8, r9, r10, r12, r13, r14, r15, r16)
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L76
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
            X.C0XQ7.LJ()
            com.ss.android.ugc.aweme.IAccountService r0 = X.C0XQ7.LIZ
            com.ss.android.ugc.aweme.AccountUserService r0 = r0.LJIIJ()
            java.lang.String r0 = r0.getCurUserId()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L76
            r0 = 1000(0x3e8, float:1.401E-42)
        L6d:
            X.C1255780ime.LJJIJL(r4, r2, r3, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L76:
            r0 = 2000(0x7d0, float:2.803E-42)
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS424S0100000_19.call$14(Y.ACallableS424S0100000_19):java.lang.Object");
    }

    public static final Object call$2(ACallableS424S0100000_19 aCallableS424S0100000_19) {
        C1C7U.LIZ("ProfilePlatformViewModel@a192.onSuccess$1");
        C2344809Gs.LIZLLL(4, "aweme/v1/user", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), (ProfileUser) aCallableS424S0100000_19.l0));
        C1C7U.LIZIZ("ProfilePlatformViewModel@a192.onSuccess$1");
        return null;
    }

    public static final Object call$3(ACallableS424S0100000_19 aCallableS424S0100000_19) {
        C1C7U.LIZ("InboxFragmentV2@d7b5.showEmailPopUp$1");
        if (C0XQ7.LIZ().shouldShowEmailPopUp(1, null)) {
            C0XQ7.LIZ().showEmailPopUp(((InboxFragmentV2) aCallableS424S0100000_19.l0).getActivity(), 1, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxFragmentV2@d7b5.showEmailPopUp$1");
        return unit;
    }

    public static final Object call$4(ACallableS424S0100000_19 aCallableS424S0100000_19) {
        C1C7U.LIZ("BaseMyProfileGuideWidget@aba5.showEmailPopUp$1");
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19((BaseMyProfileGuideWidget) aCallableS424S0100000_19.l0, 3028);
        if (C0XQ7.LIZ().shouldShowEmailPopUp(2, awS563S0100000_19)) {
            BaseMyProfileGuideWidget baseMyProfileGuideWidget = (BaseMyProfileGuideWidget) aCallableS424S0100000_19.l0;
            baseMyProfileGuideWidget.getClass();
            if (C1388190mED.LIZIZ(C1745060vVo.LIZ(baseMyProfileGuideWidget)) != null) {
                IBindService iBindServiceLIZ = C0XQ7.LIZ();
                BaseMyProfileGuideWidget baseMyProfileGuideWidget2 = (BaseMyProfileGuideWidget) aCallableS424S0100000_19.l0;
                baseMyProfileGuideWidget2.getClass();
                iBindServiceLIZ.showEmailPopUp(C1388190mED.LIZIZ(C1745060vVo.LIZ(baseMyProfileGuideWidget2)), 2, awS563S0100000_19);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseMyProfileGuideWidget@aba5.showEmailPopUp$1");
        return unit;
    }

    public static final Object call$5(ACallableS424S0100000_19 aCallableS424S0100000_19) {
        C1C7U.LIZ("BottomProfileObserver@b5db.afterChangePageHandle$3");
        C810650Vr5.LIZ(((C1255210ilj) aCallableS424S0100000_19.l0).LLILLJJLI, "personal_homepage", "click");
        C1C7U.LIZIZ("BottomProfileObserver@b5db.afterChangePageHandle$3");
        return null;
    }

    public static final Object call$6(ACallableS424S0100000_19 aCallableS424S0100000_19) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) aCallableS424S0100000_19.l0;
        awemeListFragmentImpl.getClass();
        C1C7U.LIZ("AwemeListFragmentImpl@a373.updateDraftBoxCover$1L");
        C810560Vqw.LIZJ(new ARunnableS88S0200000_19(awemeListFragmentImpl, awemeListFragmentImpl.JS(), 56));
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.updateDraftBoxCover$1L");
        return null;
    }

    public static final Object call$7(ACallableS424S0100000_19 aCallableS424S0100000_19) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) aCallableS424S0100000_19.l0;
        awemeListFragmentImpl.getClass();
        C1C7U.LIZ("AwemeListFragmentImpl@a373.processAsyncTaskLifecycle$1L");
        awemeListFragmentImpl.RT(awemeListFragmentImpl.LLJJJ.LLJJIII);
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.processAsyncTaskLifecycle$1L");
        return null;
    }

    public static final Object call$8(ACallableS424S0100000_19 aCallableS424S0100000_19) {
        JSONObject jSONObject;
        C1C7U.LIZ("BlockedAuthenticator@6b85.initData$2");
        JSONObject jSONObject2 = ((C1239820iMu) aCallableS424S0100000_19.l0).LLILZIL;
        if (jSONObject2 != null) {
            jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "data");
        } else {
            jSONObject = null;
        }
        String strLIZ = C1239880iN0.LIZ("description", jSONObject);
        C1C7U.LIZIZ("BlockedAuthenticator@6b85.initData$2");
        return strLIZ;
    }

    public static final Object call$9(ACallableS424S0100000_19 aCallableS424S0100000_19) {
        JSONObject jSONObject;
        boolean z;
        C1C7U.LIZ("TwoStepAuthActivity@5ddc.setupViews$1");
        String strOptString = null;
        try {
            jSONObject = new JSONObject(((TwoStepAuthActivity) aCallableS424S0100000_19.l0).LLIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            String str = TwoStepAuthActivity._pnsPageId;
            jSONObject = null;
        }
        String str2 = TwoStepAuthActivity._pnsPageId;
        if (jSONObject != null) {
            TwoStepAuthActivity twoStepAuthActivity = (TwoStepAuthActivity) aCallableS424S0100000_19.l0;
            C1239830iMv c1239830iMv = twoStepAuthActivity.LLILZ;
            if (c1239830iMv != null) {
                c1239830iMv.LLILZIL = jSONObject;
            }
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
            if (jSONObject2 != null) {
                strOptString = jSONObject2.optString("profile_key");
            }
            twoStepAuthActivity.LLIZLLLIL = strOptString;
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("TwoStepAuthActivity@5ddc.setupViews$1");
        return boolValueOf;
    }

    public ACallableS424S0100000_19(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
