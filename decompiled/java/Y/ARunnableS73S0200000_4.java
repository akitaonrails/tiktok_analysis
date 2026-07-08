package Y;

import X.AbstractC21673619ry;
import X.AbstractC305760Byg;
import X.C072Z;
import X.C086I;
import X.C098200Yq;
import X.C0C46;
import X.C0C4Z;
import X.C0C5P;
import X.C0C6R;
import X.C0C6T;
import X.C0CG3;
import X.C0CJW;
import X.C0CKZ;
import X.C0CN5;
import X.C0DEV;
import X.C0DF2;
import X.C0DF6;
import X.C0DID;
import X.C0DQJ;
import X.C0F8J;
import X.C0V6X;
import X.C0V6Y;
import X.C1150504el;
import X.C118300cf;
import X.C1238740iLA;
import X.C12ES;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LP;
import X.C1424850nBL;
import X.C1483340ohg;
import X.C14K4;
import X.C1505630pHd;
import X.C15O7;
import X.C1702430uP3;
import X.C1720406oU;
import X.C1846060y8i;
import X.C1852707Nl;
import X.C1861330yXL;
import X.C189200o6;
import X.C19EG;
import X.C1BCA;
import X.C1C7U;
import X.C202094145s;
import X.C20244914Jj;
import X.C20246014Ju;
import X.C20600815jK;
import X.C20684815ws;
import X.C21382118m3;
import X.C2187451AjH;
import X.C2187801Ajq;
import X.C2187891Ajz;
import X.C2188811AlT;
import X.C2266651Dnj;
import X.C2344009Gk;
import X.C259510AEz;
import X.C259800zU;
import X.C291001Au;
import X.C305780Byi;
import X.C310800CGg;
import X.C310810CGh;
import X.C312980COq;
import X.C325790Cpt;
import X.C331070CyP;
import X.C336550DHh;
import X.C343520DdO;
import X.C343970De7;
import X.C384250F4t;
import X.C418440Gaw;
import X.C426750GoL;
import X.C430210Gtv;
import X.C676190Qfh;
import X.C786410Ut5;
import X.C814420VxA;
import X.C985403tE;
import X.DialogC1368760lis;
import X.EnumC1585090rLn;
import X.EnumC312610CNf;
import X.InterfaceC1006670cIr;
import X.InterfaceC1891350zJl;
import X.InterfaceC20236714Gf;
import X.InterfaceC20318714ev;
import X.InterfaceC304970BxP;
import X.InterfaceC342000Daw;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnLayoutChangeListenerC346310Dht;
import X.ViewTreeObserverOnPreDrawListenerC1775920wJa;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.common.live_data.NextLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.aweme.amazon.model.AmazonWebMessage;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.cell.GroupDetailMemberCell;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponseV2;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.UrlModelWrap;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.request_combine.model.LiveSettingCombineModelV2;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.setting.IAbTestManager;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonChunkTask;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonRequest;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonTask;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.additional.AdditionalAreaAssem;
import com.ss.android.ugc.aweme.tako.ui.TakoContentAssem;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.ugc.mediabox.arch.viewmodel.SimArchLiveData;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS89S1200000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS73S0200000_4 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void run$52(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        ((SimArchLiveData) aRunnableS73S0200000_4.l0).lambda$postValue$0(aRunnableS73S0200000_4.l1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
            case 26:
                run$26(this);
                break;
            case 27:
                run$27(this);
                break;
            case 28:
                run$28(this);
                break;
            case 29:
                run$29(this);
                break;
            case 30:
                run$30(this);
                break;
            case 31:
                run$31(this);
                break;
            case 32:
                run$32(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                run$33(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                run$34(this);
                break;
            case 35:
                run$35(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                run$36(this);
                break;
            case 37:
                run$37(this);
                break;
            case 38:
                run$38(this);
                break;
            case 39:
                run$39(this);
                break;
            case 40:
                run$40(this);
                break;
            case 41:
                run$41(this);
                break;
            case 42:
                run$42(this);
                break;
            case 43:
                run$43(this);
                break;
            case 44:
                run$44(this);
                break;
            case 45:
                run$45(this);
                break;
            case 46:
                run$46(this);
                break;
            case 47:
                run$47(this);
                break;
            case 48:
                run$48(this);
                break;
            case 49:
                run$49(this);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                run$50(this);
                break;
            case 51:
                run$51(this);
                break;
            case 52:
                run$52(this);
                break;
            case 53:
                run$53(this);
                break;
            case 54:
                run$54(this);
                break;
            case 55:
                run$55(this);
                break;
            case 56:
                run$56(this);
                break;
            case 57:
                run$57(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        View childAt;
        int height = ((View) this.l0).getHeight();
        ViewParent parent = ((View) this.l0).getParent();
        ViewGroup viewGroup = parent instanceof RecyclerView ? (ViewGroup) parent : null;
        int adapterPosition = ((C0DID) this.l1).getAdapterPosition();
        int height2 = 0;
        for (int i = 0; i < adapterPosition; i++) {
            height2 += (viewGroup == null || (childAt = viewGroup.getChildAt(i)) == null) ? 0 : childAt.getHeight();
        }
        ((View) this.l0).getLayoutParams().height = height - height2;
        View view = (View) this.l0;
        C786410Ut5.W5(view, view.getLayoutParams());
    }

    public final void LIZ$1() {
        UrlModel[] urlModelArr;
        AbstractC305760Byg abstractC305760Byg = (AbstractC305760Byg) this.l1;
        C0CG3 c0cg3 = (C0CG3) this.l0;
        abstractC305760Byg.getClass();
        c0cg3.getClass();
        List listAsList = null;
        try {
            SettingsManager.LIZLLL().getClass();
            urlModelArr = (UrlModel[]) SettingsManager.LJII("default_cover_urls", com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel[].class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        List listAsList2 = urlModelArr != null ? Arrays.asList(urlModelArr) : null;
        int i = 0;
        if (!C086I.LIZIZ(listAsList2)) {
            HashSet hashSet = new HashSet();
            try {
                Iterator it2 = listAsList2.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    hashSet.add(new UrlModelWrap(i2, (UrlModel) it2.next()).toJsonString());
                    i2++;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1238740iLA.LIZJ("profile").LIZLLL().putStringSet("default_profile_cover_url", hashSet).apply();
        }
        try {
            SettingsManager.LIZLLL().getClass();
            UrlModel[] urlModelArr2 = (UrlModel[]) SettingsManager.LJII("white_cover_urls", com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel.class);
            if (urlModelArr2 != null) {
                listAsList = Arrays.asList(urlModelArr2);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        if (C086I.LIZIZ(listAsList)) {
            return;
        }
        HashSet hashSet2 = new HashSet();
        try {
            Iterator it3 = listAsList.iterator();
            while (it3.hasNext()) {
                hashSet2.add(new UrlModelWrap(i, (UrlModel) it3.next()).toJsonString());
                i++;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C1238740iLA.LIZJ("profile").LIZLLL().putStringSet("default_profile_cover_url_white", hashSet2).apply();
    }

    public final void LIZ$10() {
        Rect rect = new Rect();
        ((C1424850nBL) this.l1).getGlobalVisibleRect(rect);
        int height = (((int) (((double) (rect.bottom - rect.top)) * 0.85d)) - ((View) this.l0).getHeight()) >> 1;
        if (height > 0) {
            C426750GoL.LJIIL(((C1424850nBL) this.l1).LLJJ, null, Integer.valueOf(height), null, null, 29);
        }
        C786410Ut5.LJLLLLLL(0, (View) this.l0);
    }

    public final void LIZ$11() {
        AbstractC21673619ry adapter = ((RecyclerView) this.l0).getAdapter();
        if (adapter == null || adapter.getItemCount() <= 0) {
            ((RecyclerView) this.l0).smoothScrollToPosition(((C336550DHh) this.l1).LIZIZ);
            return;
        }
        int itemCount = adapter.getItemCount() - 1;
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) this.l0).getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        ((RecyclerView) this.l0).smoothScrollToPosition(itemCount);
        RecyclerView recyclerView = (RecyclerView) this.l0;
        HandlerHook.viewPost(recyclerView, new ARunnableS12S0201000_4(itemCount, recyclerView, linearLayoutManager, 4));
    }

    public final void LIZ$12() {
        try {
            C0CKZ c0ckz = C0CKZ.LIZLLL;
            c0ckz.LJ("ab_settings_migrate");
            c0ckz.LJ("ab_settings_migrate_before_save_config_data");
            n nVarLJ = ((FetchABTestCommonChunkTask) this.l0).LJ((n) this.l1);
            if (C1702430uP3.LIZJ) {
                C2187451AjH.LJFF(2000L);
            }
            C1150504el.LIZ().LIZLLL("method_save_config_value", false);
            if (C2187891Ajz.LIZJ()) {
                Map<String, C1505630pHd> map = C2187801Ajq.LIZ;
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 1);
            }
            c0ckz.LJI("ab_settings_migrate_before_save_config_data");
            c0ckz.LJ("ab_settings_migrate_save_config_data");
            try {
                C0C5P.LIZJ().LJIILL(nVarLJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            C0CKZ c0ckz2 = C0CKZ.LIZLLL;
            c0ckz2.LJI("ab_settings_migrate_save_config_data");
            c0ckz2.LJ("ab_settings_migrate_inject_ab_response");
            C15O7.LIZIZ(new Callable() { // from class: X.0CKe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("FetchABTestCommonChunkTask@eeed.handleSettingsMigrateIfNeed$1$1$2");
                    if (C0CCS.LIZ) {
                        C2187451AjH.LJJI(3000L);
                    }
                    ((IAbTestManager) ServiceManager.get().getService(IAbTestManager.class)).LIZLLL(true);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FetchABTestCommonChunkTask@eeed.handleSettingsMigrateIfNeed$1$1$2");
                    return unit;
                }
            }, C15O7.LJIIIIZZ, null);
            AbstractC305760Byg.LLIZLLLIL.LIZLLL(nVarLJ);
            if (C1852707Nl.LIZ()) {
                Thread.sleep(C072Z.LIZ());
            }
            ((IAbTestManager) ServiceManager.get().getService(IAbTestManager.class)).LIZIZ(nVarLJ);
            if (C2187891Ajz.LIZJ()) {
                Map<String, C1505630pHd> map2 = C2187801Ajq.LIZ;
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 5);
            }
            C1150504el.LIZ().LJI("method_save_config_value", false);
            C0C4Z.LIZ = null;
            if (!C1720406oU.LIZIZ.LIZ("config_fetch_success")) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
                c2344009Gk.LJIIIIZZ("source", CardStruct.IStatusCode.DEFAULT);
                c2344009Gk.LIZJ(1, "is_adapter");
                C20684815ws.LJIILLIIL("config_fetch_success", c2344009Gk.LIZ);
            }
            c0ckz2.LJI("ab_settings_migrate_inject_ab_response");
            C0CJW.LIZLLL.LJI(SystemClock.uptimeMillis() - C202094145s.LJIILL, "ab_settings_migrate_inject_ab_response_coordinate");
            c0ckz2.LJI("ab_settings_migrate");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final void LIZ$13() {
        try {
            C0CKZ c0ckz = C0CKZ.LIZLLL;
            c0ckz.LJ("ab_settings_migrate");
            c0ckz.LJ("ab_settings_migrate_before_save_config_data");
            n nVarLJIIIIZZ = ((FetchABTestCommonRequest) this.l0).LJIIIIZZ((n) this.l1);
            if (C1702430uP3.LIZJ) {
                C2187451AjH.LJFF(2000L);
            }
            C1150504el.LIZ().LIZLLL("method_save_config_value", false);
            if (C2187891Ajz.LIZJ()) {
                Map<String, C1505630pHd> map = C2187801Ajq.LIZ;
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 1);
            }
            c0ckz.LJI("ab_settings_migrate_before_save_config_data");
            c0ckz.LJ("ab_settings_migrate_save_config_data");
            try {
                C0C5P.LIZJ().LJIILL(nVarLJIIIIZZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            C0CKZ c0ckz2 = C0CKZ.LIZLLL;
            c0ckz2.LJI("ab_settings_migrate_save_config_data");
            c0ckz2.LJ("ab_settings_migrate_inject_ab_response");
            C15O7.LIZIZ(new Callable() { // from class: X.0CKf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("FetchABTestCommonRequest@87b9.handleSettingsMigrateIfNeed$1$1$2");
                    if (C0CCS.LIZ) {
                        C2187451AjH.LJJI(3000L);
                    }
                    ((IAbTestManager) ServiceManager.get().getService(IAbTestManager.class)).LIZLLL(true);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FetchABTestCommonRequest@87b9.handleSettingsMigrateIfNeed$1$1$2");
                    return unit;
                }
            }, C15O7.LJIIIIZZ, null);
            AbstractC305760Byg.LLIZLLLIL.LIZLLL(nVarLJIIIIZZ);
            if (C1852707Nl.LIZ()) {
                Thread.sleep(C072Z.LIZ());
            }
            ((IAbTestManager) ServiceManager.get().getService(IAbTestManager.class)).LIZIZ(nVarLJIIIIZZ);
            if (C2187891Ajz.LIZJ()) {
                Map<String, C1505630pHd> map2 = C2187801Ajq.LIZ;
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 5);
            }
            C1150504el.LIZ().LJI("method_save_config_value", false);
            C0C4Z.LIZ = null;
            if (!C1720406oU.LIZIZ.LIZ("config_fetch_success")) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
                c2344009Gk.LJIIIIZZ("source", CardStruct.IStatusCode.DEFAULT);
                c2344009Gk.LIZJ(1, "is_adapter");
                C20684815ws.LJIILLIIL("config_fetch_success", c2344009Gk.LIZ);
            }
            c0ckz2.LJI("ab_settings_migrate_inject_ab_response");
            C0CJW.LIZLLL.LJI(SystemClock.uptimeMillis() - C202094145s.LJIILL, "ab_settings_migrate_inject_ab_response_coordinate");
            c0ckz2.LJI("ab_settings_migrate");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final void LIZ$14() {
        try {
            C0CKZ c0ckz = C0CKZ.LIZLLL;
            c0ckz.LJ("ab_settings_migrate");
            c0ckz.LJ("ab_settings_migrate_before_save_config_data");
            n nVarLJIIIIZZ = ((FetchABTestCommonTask) this.l0).LJIIIIZZ((n) this.l1);
            if (C1702430uP3.LIZJ) {
                C2187451AjH.LJFF(2000L);
            }
            C1150504el.LIZ().LIZLLL("method_save_config_value", false);
            if (C2187891Ajz.LIZJ()) {
                Map<String, C1505630pHd> map = C2187801Ajq.LIZ;
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 1);
            }
            c0ckz.LJI("ab_settings_migrate_before_save_config_data");
            c0ckz.LJ("ab_settings_migrate_save_config_data");
            try {
                C0C5P.LIZJ().LJIILL(nVarLJIIIIZZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            C0CKZ c0ckz2 = C0CKZ.LIZLLL;
            c0ckz2.LJI("ab_settings_migrate_save_config_data");
            c0ckz2.LJ("ab_settings_migrate_inject_ab_response");
            C15O7.LIZIZ(new Callable() { // from class: X.0CKg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("FetchABTestCommonTask@c5b4.handleSettingsMigrateIfNeed$1$1$2");
                    if (C0CCS.LIZ) {
                        C2187451AjH.LJJI(3000L);
                    }
                    ((IAbTestManager) ServiceManager.get().getService(IAbTestManager.class)).LIZLLL(true);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FetchABTestCommonTask@c5b4.handleSettingsMigrateIfNeed$1$1$2");
                    return unit;
                }
            }, C15O7.LJIIIIZZ, null);
            AbstractC305760Byg.LLIZLLLIL.LIZLLL(nVarLJIIIIZZ);
            if (C1852707Nl.LIZ()) {
                Thread.sleep(C072Z.LIZ());
            }
            ((IAbTestManager) ServiceManager.get().getService(IAbTestManager.class)).LIZIZ(nVarLJIIIIZZ);
            if (C2187891Ajz.LIZJ()) {
                Map<String, C1505630pHd> map2 = C2187801Ajq.LIZ;
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 5);
            }
            C1150504el.LIZ().LJI("method_save_config_value", false);
            C0C4Z.LIZ = null;
            if (!C1720406oU.LIZIZ.LIZ("config_fetch_success")) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
                c2344009Gk.LJIIIIZZ("source", CardStruct.IStatusCode.DEFAULT);
                c2344009Gk.LIZJ(1, "is_adapter");
                C20684815ws.LJIILLIIL("config_fetch_success", c2344009Gk.LIZ);
            }
            c0ckz2.LJI("ab_settings_migrate_inject_ab_response");
            C0CJW.LIZLLL.LJI(SystemClock.uptimeMillis() - C202094145s.LJIILL, "ab_settings_migrate_inject_ab_response_coordinate");
            c0ckz2.LJI("ab_settings_migrate");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final void LIZ$15() {
        Context context = (Context) this.l0;
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJI(context.getResources().getString(2131858238));
        c1397580mTM.LIZIZ(((Context) this.l0).getResources().getString(2131858237));
        C985403tE.LIZ(c1397580mTM, new AwS370S0200000_4((Context) this.l0, (Context) this.l1, (Function0<Unit>) 104));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final void LIZ$16() {
        Context context = (Context) this.l0;
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJI(context.getResources().getString(2131858235));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((Context) this.l0).getResources().getString(2131858233));
        sbLIZ.append("\n ");
        sbLIZ.append(((Context) this.l0).getResources().getString(2131858234));
        c1397580mTM.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        C985403tE.LIZ(c1397580mTM, new AwS370S0200000_4((Context) this.l0, (Context) this.l1, (Function0<Unit>) 105));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final void LIZ$17() {
        List listLLIIII = C13LP.LLIIII(((C384250F4t) this.l0).LIZIZ);
        Integer num = (Integer) this.l1;
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            try {
                ((Function1) it2.next()).invoke(num);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Selection listener error ");
                sbLIZ.append(e.getMessage());
                C0F8J.LIZ("TextTemplateSelectionManager", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final void LIZ$18() {
        int width = (((TextView) this.l0).getWidth() - ((TextView) this.l0).getPaddingLeft()) - ((TextView) this.l0).getPaddingRight();
        if (width <= 0) {
            return;
        }
        if (new StaticLayout(((TextView) this.l0).getText(), ((TextView) this.l0).getPaint(), width, Layout.Alignment.ALIGN_NORMAL, ((TextView) this.l0).getLineSpacingMultiplier(), ((TextView) this.l0).getLineSpacingExtra(), ((TextView) this.l0).getIncludeFontPadding()).getLineCount() > 2) {
            ((TextView) this.l0).setTextSize(14.0f);
            ((TextView) this.l0).setMaxLines(2);
            ((TextView) this.l0).setEllipsize(TextUtils.TruncateAt.END);
        }
        Integer num = (Integer) this.l1;
        if (num != null) {
            ((TextView) this.l0).setTextColor(num.intValue());
        }
    }

    public final void LIZ$19() {
        if (((RecyclerView) ((DialogC1368760lis) this.l0).findViewById(R.id.eqp)).getLayoutManager() instanceof LinearLayoutManager) {
            ((LinearLayoutManager) ((RecyclerView) ((DialogC1368760lis) this.l0).findViewById(R.id.eqp)).getLayoutManager()).scrollToPositionWithOffset(((C118300cf) this.l1).element, 0);
        } else {
            ((RecyclerView) ((DialogC1368760lis) this.l0).findViewById(R.id.eqp)).scrollToPosition(((C118300cf) this.l1).element);
        }
    }

    public final void LIZ$2() {
        Rect rect = new Rect();
        ((View) this.l0).getHitRect(rect);
        rect.left -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        rect.top -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        rect.right += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        rect.bottom += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public final void LIZ$3() {
        C20244914Jj c20244914JjLIZ;
        if (((View) this.l0).getParent() != null) {
            C20246014Ju c20246014JuLIZ = C14K4.LIZ((View) this.l0);
            Integer numValueOf = (c20246014JuLIZ == null || (c20244914JjLIZ = c20246014JuLIZ.LIZ(2)) == null) ? null : Integer.valueOf(c20244914JjLIZ.LIZLLL);
            LinearLayout linearLayoutOR = ((MixVideosDialog) this.l1).OR();
            if (linearLayoutOR != null) {
                linearLayoutOR.setPadding(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((numValueOf == null || numValueOf.intValue() == 0) ? 12 : 4))));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$4() {
        /*
            r10 = this;
            java.lang.Object r2 = r10.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r10.l1
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            int r7 = r0.getHeight()
            r0 = 2131099706(0x7f06003a, float:1.7811773E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r2)
            r4 = 26
            if (r0 == 0) goto L94
            int r0 = r0.intValue()
            r6 = 0
            int r9 = X.C2441009hQ.LJIIL(r0, r6)
            r0 = 2131100726(0x7f060436, float:1.7813842E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r2)
            if (r0 == 0) goto L94
            int r0 = r0.intValue()
            int r8 = X.C2441009hQ.LJIIL(r0, r4)
            r0 = 2131099703(0x7f060037, float:1.7811767E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r2)
            if (r0 == 0) goto L94
            int r1 = r0.intValue()
            r0 = 30
            int r5 = X.C2441009hQ.LJIIL(r1, r0)
            r0 = 2131099699(0x7f060033, float:1.7811759E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r2)
            if (r0 == 0) goto L94
            int r2 = r0.intValue()
            r0 = 6
            int[] r3 = new int[r0]
            r3[r6] = r9
            r1 = 1
            r3[r1] = r9
            r0 = 2
            r3[r0] = r9
            r0 = 3
            r3[r0] = r8
            r0 = 4
            r3[r0] = r5
            r0 = 5
            r3[r0] = r2
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setShape(r6)
            r2.setGradientType(r1)
            float r0 = (float) r7
            r2.setGradientRadius(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            r0 = 0
            r2.setGradientCenter(r1, r0)
            r2.setColors(r3)
        L7d:
            java.lang.Object r0 = r10.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = X.C960203pA.LIZIZ(r0)
            if (r0 == 0) goto L8c
            if (r2 == 0) goto L8c
            r2.setAlpha(r4)
        L8c:
            java.lang.Object r0 = r10.l1
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setBackground(r2)
            return
        L94:
            r2 = 0
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS73S0200000_4.LIZ$4():void");
    }

    public final void LIZ$5() {
        Object c098200Yq;
        try {
            List list = (List) this.l0;
            C325790Cpt c325790Cpt = (C325790Cpt) this.l1;
            try {
                C1483340ohg.LIZIZ(c325790Cpt.LIZJ, c325790Cpt.LIZLLL, c325790Cpt.LJ, list, c325790Cpt.LIZ, c325790Cpt.LIZIZ, true);
            } catch (ConcurrentModificationException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public final void LIZ$6() {
        String str;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        if (((Boolean) C259510AEz.LIZ.getValue()).booleanValue()) {
            LiveSDKSettingResponseV2 liveSetting = ((LiveSettingCombineModelV2) this.l0).getLiveSetting();
            if (liveSetting == null || (serverTimeExtra = liveSetting.extra) == null || (str = serverTimeExtra.logid) == null) {
                str = "";
            }
            ((InterfaceC20318714ev) this.l1).LJ(((LiveSettingCombineModelV2) this.l0).getLiveSetting(), new ARunnableS2S1000000_4(str, 0));
        } else {
            ((InterfaceC20318714ev) this.l1).LJ(((LiveSettingCombineModelV2) this.l0).getLiveSetting(), null);
        }
        ((LiveSettingCombineModelV2) this.l0).setLiveSetting(null);
    }

    public final void LIZ$7() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = ((TuxTextView) this.l0).getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || ((View) this.l1) == null) {
            return;
        }
        int top = (((View) this.l1).getTop() - marginLayoutParams.topMargin) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        ((TuxTextView) this.l0).setMaxLines(3);
        ((TuxTextView) this.l0).setEllipsize(TextUtils.TruncateAt.END);
        if (((TuxTextView) this.l0).getHeight() <= top || top <= 0) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            C21382118m3.LIZIZ((TuxTextView) this.l0, 14, 32, 1, 2);
            return;
        }
        try {
            ((TuxTextView) this.l0).setAutoSizeTextTypeUniformWithConfiguration(14, 32, 1, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        TuxTextView tuxTextView = (TuxTextView) this.l0;
        ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            if (top < iLIZIZ) {
                top = iLIZIZ;
            }
            marginLayoutParams2.height = top;
        }
        C786410Ut5.R6(tuxTextView, layoutParams2);
    }

    public final void LIZ$8() {
        Layout layout;
        if (((TuxTextView) this.l0).getParent() == null || Intrinsics.LJFF(((C0DEV) this.l1).LIZLLL, Boolean.TRUE) || (layout = ((TuxTextView) this.l0).getLayout()) == null || layout.getLineCount() <= 0 || layout.getEllipsisCount(layout.getLineCount() - 1) <= 0) {
            return;
        }
        C786410Ut5.h9((TuxTextView) this.l0, new ACListenerS139S0100000_4((C0DEV) this.l1, 88));
    }

    public final void LIZ$9() {
        Rect rect = new Rect();
        ((RelationButton) this.l0).getHitRect(rect);
        rect.top -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        rect.bottom += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        ((GroupDetailMemberCell) this.l1).itemView.setTouchDelegate(new TouchDelegate(rect, (RelationButton) this.l0));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$20() {
        /*
            r5 = this;
            boolean r0 = X.C268330AfP.LJIIJ()
            r3 = 0
            if (r0 != 0) goto L82
            java.lang.Object r0 = r5.l0
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            android.text.Layout r0 = r0.getLayout()
            r4 = 0
            if (r0 == 0) goto L82
            int r0 = r0.getLineCount()
            if (r0 <= 0) goto L82
            java.lang.Object r0 = r5.l0
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L82
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L82
            int r0 = r1.getChildCount()
            r2 = 1
            if (r0 <= r2) goto L82
            java.lang.Object r0 = r5.l0
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L73
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L73
            android.view.View r2 = r1.getChildAt(r2)
            if (r2 == 0) goto L73
            java.lang.Object r1 = r5.l1
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            boolean r0 = r2 instanceof com.bytedance.tux.input.TuxTextView
            if (r0 == 0) goto L7f
            r0 = r2
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L7f
            android.text.Layout r0 = r0.getLayout()
            if (r0 == 0) goto L7f
            int r0 = r0.getEllipsisCount(r4)
            if (r0 <= 0) goto L7f
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.weight = r0
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L73
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            if (r1 == 0) goto L73
            r1.weight = r3
            r0 = -2
            r1.width = r0
        L73:
            java.lang.Object r1 = r5.l0
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            java.lang.Object r0 = r5.l1
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            X.C786410Ut5.R6(r1, r0)
            return
        L7f:
            r1.weight = r3
            goto L73
        L82:
            java.lang.Object r0 = r5.l1
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r0.weight = r3
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS73S0200000_4.LIZ$20():void");
    }

    public static final void run$0(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("EmptyRecommendItemViewBinder$EmptyRecommendItemViewBinder@fe.1");
        try {
            aRunnableS73S0200000_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EmptyRecommendItemViewBinder$EmptyRecommendItemViewBinder@fe.1");
    }

    public static final void run$1(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("SettingManager@d659.setServerSetting$1");
        try {
            aRunnableS73S0200000_4.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SettingManager@d659.setServerSetting$1");
    }

    public static final void run$10(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ShopMallMixFragment@3794.onViewCreated$3$5$1");
        try {
            Rect rect = new Rect();
            rect.set(0, 0, ((View) aRunnableS73S0200000_4.l0).getWidth(), ((View) aRunnableS73S0200000_4.l0).getHeight());
            ((View) aRunnableS73S0200000_4.l0).setTouchDelegate(new TouchDelegate(rect, (TuxIconView) aRunnableS73S0200000_4.l1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShopMallMixFragment@3794.onViewCreated$3$5$1");
    }

    public static final void run$11(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("IMContactInitTask@ddf3.run$1$1$1");
        try {
            C1397580mTM c1397580mTM = new C1397580mTM((Context) aRunnableS73S0200000_4.l0);
            c1397580mTM.LIZIZ(new String((byte[]) aRunnableS73S0200000_4.l1, Charsets.UTF_8));
            new C1397510mTF(c1397580mTM).LIZLLL();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMContactInitTask@ddf3.run$1$1$1");
    }

    public static final void run$12(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MixVideosDialog@fefc.onResume$1$1");
        try {
            aRunnableS73S0200000_4.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixVideosDialog@fefc.onResume$1$1");
    }

    public static final void run$13(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MixVideosDialog@fefc.scrollToCurrentAweme$1");
        try {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((RecyclerView.LayoutManager) aRunnableS73S0200000_4.l0);
            MixVideosDialog mixVideosDialog = (MixVideosDialog) aRunnableS73S0200000_4.l1;
            linearLayoutManager.scrollToPositionWithOffset(mixVideosDialog.LLJLLIL, (int) (((double) C12ES.LIZJ(101.0f, mixVideosDialog.getContext())) * 1.5d));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixVideosDialog@fefc.scrollToCurrentAweme$1");
    }

    public static final void run$14(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("SearchProsConsTabFragment@4a61.onViewCreated$1$2$1");
        try {
            Iterator it2 = ((List) aRunnableS73S0200000_4.l0).iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (((C331070CyP) it2.next()).LLILZIL) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() >= 0) {
                ((ViewOnAttachStateChangeListenerC20604515jv) aRunnableS73S0200000_4.l1).smoothScrollToPosition(numValueOf.intValue());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchProsConsTabFragment@4a61.onViewCreated$1$2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$15(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        Window window;
        int iIntValue;
        C1C7U.LIZ("LiveRepostAddNoteChannel@89b4.share$2$1");
        try {
            Dialog dialog = ((DialogFragment) ((Fragment) aRunnableS73S0200000_4.l0)).getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                Integer num = (Integer) ((C259800zU) aRunnableS73S0200000_4.l1).element;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 16;
                }
                window.setSoftInputMode(iIntValue);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveRepostAddNoteChannel@89b4.share$2$1");
    }

    public static final void run$16(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MixStudioHomePageAssem@94b0.onCreateView$contentView$1$1");
        try {
            aRunnableS73S0200000_4.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.onCreateView$contentView$1$1");
    }

    public static final void run$17(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("StoryPreloaderV2Impl@f0d7.preloadVideoBatch$$inlined$runIsolatedOnIo$1");
        try {
            aRunnableS73S0200000_4.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryPreloaderV2Impl@f0d7.preloadVideoBatch$$inlined$runIsolatedOnIo$1");
    }

    public static final void run$18(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("TabStabilityReporter@8aab.tryReportTabStabilityDiff$1");
        try {
            C343520DdO c343520DdO = C343520DdO.LIZ;
            C19EG c19eg = (C19EG) aRunnableS73S0200000_4.l0;
            EnumC1585090rLn enumC1585090rLn = (EnumC1585090rLn) aRunnableS73S0200000_4.l1;
            c343520DdO.getClass();
            C343520DdO.LIZ(c19eg, enumC1585090rLn);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TabStabilityReporter@8aab.tryReportTabStabilityDiff$1");
    }

    public static final void run$19(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("TabStabilityReporter@8aab.tryReportTabStabilityDiff$3");
        try {
            C343520DdO c343520DdO = C343520DdO.LIZ;
            C19EG c19eg = (C19EG) aRunnableS73S0200000_4.l0;
            EnumC1585090rLn enumC1585090rLn = (EnumC1585090rLn) aRunnableS73S0200000_4.l1;
            c343520DdO.getClass();
            C343520DdO.LIZ(c19eg, enumC1585090rLn);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TabStabilityReporter@8aab.tryReportTabStabilityDiff$3");
    }

    public static final void run$2(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("InboxSearchGenericUtils@3ff4.setDeleteIconTouchDelegate$1$1");
        try {
            aRunnableS73S0200000_4.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxSearchGenericUtils@3ff4.setDeleteIconTouchDelegate$1$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$20(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("AdditionalAreaAssem@3a82.onViewCreated$12$1");
        try {
            if (((Boolean) ((C291001Au) aRunnableS73S0200000_4.l0).LIZ).booleanValue()) {
                ((AdditionalAreaAssem) aRunnableS73S0200000_4.l1).LLJLILLLLZIIL = Boolean.TRUE;
            } else {
                AdditionalAreaAssem additionalAreaAssem = (AdditionalAreaAssem) aRunnableS73S0200000_4.l1;
                additionalAreaAssem.LLJLILLLLZIIL = Boolean.FALSE;
                FrameLayout frameLayout = additionalAreaAssem.LLJJI;
                if (frameLayout != null) {
                    HandlerHook.viewPostDelay(frameLayout, new ARunnableS104S0100000_4(additionalAreaAssem, 50), 200L);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdditionalAreaAssem@3a82.onViewCreated$12$1");
    }

    public static final void run$21(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("DefaultMethodTimeCostUploader@3334.uploadAsync$1");
        try {
            C310800CGg c310800CGg = (C310800CGg) aRunnableS73S0200000_4.l0;
            C310810CGh c310810CGh = (C310810CGh) aRunnableS73S0200000_4.l1;
            c310800CGg.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("method_name", c310810CGh.LIZ);
            linkedHashMap.put("method_time_cost", String.valueOf(c310810CGh.LIZIZ));
            C20684815ws.LJIILLIIL("prf_method_time_cost", linkedHashMap);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DefaultMethodTimeCostUploader@3334.uploadAsync$1");
    }

    public static final void run$22(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("TTSPanelColumnView@49d6.showLoading$$inlined$doOnPreDraw$1");
        try {
            Function0 function0 = (Function0) aRunnableS73S0200000_4.l1;
            if (function0 != null) {
                function0.invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTSPanelColumnView@49d6.showLoading$$inlined$doOnPreDraw$1");
    }

    public static final void run$23(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        int itemCount;
        C1C7U.LIZ("AdjustablePaddingTargetFooter@578.checkFirstSugState$1$1");
        try {
            try {
                AbstractC21673619ry adapter = ((RecyclerView) aRunnableS73S0200000_4.l0).getAdapter();
                if (adapter != null) {
                    itemCount = adapter.getItemCount();
                } else {
                    itemCount = 0;
                }
                C1861330yXL.LJI((LinearLayoutManager) ((RecyclerView) aRunnableS73S0200000_4.l0).getLayoutManager(), itemCount - 2, (Context) aRunnableS73S0200000_4.l1, 0.0d, 12);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdjustablePaddingTargetFooter@578.checkFirstSugState$1$1");
    }

    public static final void run$24(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) aRunnableS73S0200000_4.l0;
        Runnable runnable = (Runnable) aRunnableS73S0200000_4.l1;
        C1C7U.LIZ("MessageShowHandler@5daa.tryRequestPushPermissionPopup$3L");
        int i = C2187451AjH.LIZ;
        if (atomicBoolean.compareAndSet(false, true)) {
            runnable.run();
        }
        C1C7U.LIZIZ("MessageShowHandler@5daa.tryRequestPushPermissionPopup$3L");
    }

    public static final void run$25(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ColdLaunchRequestCombiner@5259.request$3$onNext$1");
        try {
            C312980COq c312980COq = C312980COq.LIZ;
            Context context = (Context) aRunnableS73S0200000_4.l0;
            SettingCombineModel settingCombineModel = (SettingCombineModel) aRunnableS73S0200000_4.l1;
            c312980COq.getClass();
            C312980COq.LJ(context, settingCombineModel);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ColdLaunchRequestCombiner@5259.request$3$onNext$1");
    }

    public static final void run$26(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("CombineLiveSettingRequest@a548.doUpdateSettingV2$1");
        try {
            aRunnableS73S0200000_4.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CombineLiveSettingRequest@a548.doUpdateSettingV2$1");
    }

    public static final void run$27(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("PGCSubSpaceInputPanelCoordinator@a3ae.showIme$1");
        try {
            ((View) aRunnableS73S0200000_4.l0).requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) aRunnableS73S0200000_4.l1;
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput((View) aRunnableS73S0200000_4.l0, 1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PGCSubSpaceInputPanelCoordinator@a3ae.showIme$1");
    }

    public static final void run$28(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("SearchSugUnifiedViewHolder@b39.bindAvatar$1$1");
        try {
            String userAvatarUri = ((SugExtraInfo) aRunnableS73S0200000_4.l0).getUserAvatarUri();
            if (userAvatarUri == null) {
                userAvatarUri = "";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(userAvatarUri);
            c1331670kl3LJIIIZ.LJJ((C430210Gtv) aRunnableS73S0200000_4.l1);
            c1331670kl3LJIIIZ.LIZLLL("sug_unified");
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchSugUnifiedViewHolder@b39.bindAvatar$1$1");
    }

    public static final void run$29(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("NujRevampSwipeUpComponentKt@d414.adjustTitleSizeForSafeDistance$1");
        try {
            aRunnableS73S0200000_4.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NujRevampSwipeUpComponentKt@d414.adjustTitleSizeForSafeDistance$1");
    }

    public static final void run$3(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("NextLiveData@6667.postValue$1");
        try {
            ((NextLiveData) aRunnableS73S0200000_4.l0).setValue(aRunnableS73S0200000_4.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NextLiveData@6667.postValue$1");
    }

    public static final void run$30(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        InterfaceC1006670cIr interfaceC1006670cIr = (InterfaceC1006670cIr) aRunnableS73S0200000_4.l0;
        Runnable runnable = (Runnable) aRunnableS73S0200000_4.l1;
        C1C7U.LIZ("StartupStateUtils@39b4.delayRunAfterColdStartOrFirstFeedCompleted$1L");
        C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, interfaceC1006670cIr);
        C0CN5.LJIIIIZZ(runnable);
        C1C7U.LIZIZ("StartupStateUtils@39b4.delayRunAfterColdStartOrFirstFeedCompleted$1L");
    }

    public static final void run$31(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("TakoLanguageStyleSettingActivity@e5dd.bindDemoChatData$1$1");
        try {
            ((ViewOnAttachStateChangeListenerC20604515jv) aRunnableS73S0200000_4.l0).smoothScrollToPosition(((List) aRunnableS73S0200000_4.l1).size() - 1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoLanguageStyleSettingActivity@e5dd.bindDemoChatData$1$1");
    }

    public static final void run$32(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("CropImagesCard@a085.scrollToIndex$1");
        try {
            if (((View) aRunnableS73S0200000_4.l0).getParent() != null) {
                ((C676190Qfh) aRunnableS73S0200000_4.l1).smoothScrollTo(((View) aRunnableS73S0200000_4.l0).getLeft() - ((View) aRunnableS73S0200000_4.l0).getPaddingLeft(), 0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CropImagesCard@a085.scrollToIndex$1");
    }

    public static final void run$33(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("SearchTabTakoEntranceUIHelper@ea68.inflateTabByExperiment$5");
        try {
            if (C426750GoL.LIZLLL((C19EG) aRunnableS73S0200000_4.l0)) {
                View childAt = ((C1846060y8i) aRunnableS73S0200000_4.l1).getChildAt(0);
                if (childAt != null) {
                    childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), 0, childAt.getPaddingBottom());
                }
            } else {
                View childAt2 = ((C1846060y8i) aRunnableS73S0200000_4.l1).getChildAt(0);
                if (childAt2 != null) {
                    childAt2.setPadding(0, childAt2.getPaddingTop(), childAt2.getPaddingRight(), childAt2.getPaddingBottom());
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchTabTakoEntranceUIHelper@ea68.inflateTabByExperiment$5");
    }

    public static final void run$34(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("EcCompleteHandler@aa35.dismissSheet$1");
        try {
            C0DF2 c0df2 = C0DF2.LIZ;
            C0DF6 c0df6 = (C0DF6) aRunnableS73S0200000_4.l0;
            c0df2.getClass();
            C0DF2.LIZIZ(c0df6, C2266651Dnj.LIZ, new AwS89S1200000_4(c0df6, C0DF2.LJ(c0df6), "complete_dismiss", 4));
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF((Fragment) aRunnableS73S0200000_4.l1, C343970De7.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcCompleteHandler@aa35.dismissSheet$1");
    }

    public static final void run$35(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("PdpReviewRender@189e.applyAiOverviewStateImmediately$2");
        try {
            aRunnableS73S0200000_4.LIZ$8();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpReviewRender@189e.applyAiOverviewStateImmediately$2");
    }

    public static final void run$36(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("PdpTaskManager@87c5.trackFirstScreen$1$1");
        try {
            C786410Ut5.D3(((View) aRunnableS73S0200000_4.l0).getViewTreeObserver(), (ViewTreeObserverOnPreDrawListenerC1775920wJa) aRunnableS73S0200000_4.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpTaskManager@87c5.trackFirstScreen$1$1");
    }

    public static final void run$37(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C20600815jK<InterfaceC1891350zJl> state;
        C1C7U.LIZ("TakoContentAssem@bd9.bind$2$7");
        try {
            TakoContentAssem takoContentAssem = (TakoContentAssem) aRunnableS73S0200000_4.l0;
            takoContentAssem.LLLIZZ = false;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = takoContentAssem.LLJJL;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                List<InterfaceC1891350zJl> list = ((TakoContentAssem) aRunnableS73S0200000_4.l0).LLLILZJ;
                if (list == null) {
                    list = (List) aRunnableS73S0200000_4.l1;
                }
                state.LJIILL(list, null);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoContentAssem@bd9.bind$2$7");
    }

    public static final void run$38(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("GiftAnchorPanelGiftPageGiftPageBottomAssem@c42.awaitPostThenNextLayout$2$posted$1");
        try {
            if (((InterfaceC20236714Gf) aRunnableS73S0200000_4.l0).isActive()) {
                View view = (View) aRunnableS73S0200000_4.l1;
                InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) aRunnableS73S0200000_4.l0;
                if (view.isLaidOut() && !view.isLayoutRequested()) {
                    if (interfaceC20236714Gf.isActive()) {
                        Unit unit = Unit.LIZ;
                        C189200o6.m2constructorimpl(unit);
                        interfaceC20236714Gf.resumeWith(unit);
                    }
                } else {
                    view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC346310Dht(interfaceC20236714Gf, 1));
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageGiftPageBottomAssem@c42.awaitPostThenNextLayout$2$posted$1");
    }

    public static final void run$39(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("GroupDetailMemberCell@a1f6.bindButton$2$1");
        try {
            aRunnableS73S0200000_4.LIZ$9();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupDetailMemberCell@a1f6.bindButton$2$1");
    }

    public static final void run$4(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1C7U.LIZ("TuxSheet@5e9f.onActivityCreated$1$1$2$1");
        try {
            View view = (View) aRunnableS73S0200000_4.l0;
            float top = ((View) aRunnableS73S0200000_4.l1).getTop() - ((View) aRunnableS73S0200000_4.l0).getHeight();
            ViewGroup.LayoutParams layoutParams = ((View) aRunnableS73S0200000_4.l0).getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i = marginLayoutParams.bottomMargin;
            } else {
                i = 0;
            }
            C786410Ut5.ed(view, top - i);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TuxSheet@5e9f.onActivityCreated$1$1$2$1");
    }

    public static final void run$40(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateListView@b16d.onFetchTemplatesEmpty$1$1");
        try {
            aRunnableS73S0200000_4.LIZ$10();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateListView@b16d.onFetchTemplatesEmpty$1$1");
    }

    public static final void run$41(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        Set set = (Set) aRunnableS73S0200000_4.l0;
        Map map = (Map) aRunnableS73S0200000_4.l1;
        C1C7U.LIZ("ConfigurationManager@954c.notifyChangedConfigs$1L");
        try {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                List list = (List) map.get((String) it2.next());
                if (list != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC304970BxP) it3.next()).LIZ();
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0C46.LIZIZ("FetchAB/ConfigManager", e);
        }
        C1C7U.LIZIZ("ConfigurationManager@954c.notifyChangedConfigs$1L");
    }

    public static final void run$42(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("AdjustablePaddingTargetFooter@bbd.validateInner$3");
        try {
            aRunnableS73S0200000_4.LIZ$11();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdjustablePaddingTargetFooter@bbd.validateInner$3");
    }

    public static final void run$43(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        final C0C6R c0c6r = (C0C6R) aRunnableS73S0200000_4.l0;
        Function0 function0 = (Function0) aRunnableS73S0200000_4.l1;
        C1C7U.LIZ("ABMockEvent@a1fd.recordMessage$lambda-9$1L");
        try {
            if (!c0c6r.LJIILJJIL) {
                try {
                    new C0C6T() { // from class: X.0C45
                        @Override // X.C0C6T
                        public final Object call() {
                            Keva repoSync;
                            C0C6R c0c6r2 = c0c6r;
                            synchronized (Boolean.valueOf(c0c6r2.LJIILJJIL)) {
                                try {
                                    if (!c0c6r2.LJIILJJIL) {
                                        c0c6r2.LJIILJJIL = true;
                                        if (!C0C6R.LJ()) {
                                            if (C0C6R.LJJIIJ == null) {
                                                C0C6R.LJJIIJ = KevaImpl.getRepoSync("abmock_manager", 0);
                                            }
                                            Keva keva = C0C6R.LJJIIJ;
                                            c0c6r2.LJIIJ = keva != null ? keva.getInt(c0c6r2.LJII, 50) : 50;
                                            c0c6r2.LJIIJJI = AbstractC19994813Le.Default.nextInt(LSPassThroughRecordSizeConfig.DEFAULT) < c0c6r2.LJIIJ;
                                            Keva keva2 = C0C6R.LJJIIJ;
                                            String string = keva2 != null ? keva2.getString("last_ab_event_repo", "_2") : null;
                                            c0c6r2.LJIILIIL = string;
                                            if (c0c6r2.LJIIJJI) {
                                                if (Intrinsics.LJFF(string, "_2")) {
                                                    Keva keva3 = C0C6R.LJJIIJ;
                                                    if (keva3 != null) {
                                                        keva3.storeString("last_ab_event_repo", "_1");
                                                    }
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append("abmock_manager");
                                                    sbLIZ.append("_1");
                                                    repoSync = KevaImpl.getRepoSync(C2188811AlT.LIZIZ(sbLIZ), 0);
                                                } else {
                                                    Keva keva4 = C0C6R.LJJIIJ;
                                                    if (keva4 != null) {
                                                        keva4.storeString("last_ab_event_repo", "_2");
                                                    }
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append("abmock_manager");
                                                    sbLIZ2.append("_2");
                                                    repoSync = KevaImpl.getRepoSync(C2188811AlT.LIZIZ(sbLIZ2), 0);
                                                }
                                                c0c6r2.LJIIL = repoSync;
                                            } else {
                                                c0c6r2.LIZ = null;
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            return Unit.LIZ;
                        }
                    }.call();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cause: ");
                    sbLIZ.append(th);
                    sbLIZ.append("--message: ");
                    sbLIZ.append("initRepoMessage");
                    C0C46.LIZIZ("ABMockEvent", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
                }
            }
            if (c0c6r.LJIIJJI) {
                function0.invoke();
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cause: ");
            sbLIZ2.append(th2);
            sbLIZ2.append("--message: ");
            sbLIZ2.append("recordMessage");
            C0C46.LIZIZ("ABMockEvent", new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th2));
        }
        C1C7U.LIZIZ("ABMockEvent@a1fd.recordMessage$lambda-9$1L");
    }

    public static final void run$44(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("FetchABTestCommonChunkTask@eeed.handleSettingsMigrateIfNeed$1");
        try {
            aRunnableS73S0200000_4.LIZ$12();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FetchABTestCommonChunkTask@eeed.handleSettingsMigrateIfNeed$1");
    }

    public static final void run$45(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("FetchABTestCommonRequest@87b9.handleSettingsMigrateIfNeed$1");
        try {
            aRunnableS73S0200000_4.LIZ$13();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FetchABTestCommonRequest@87b9.handleSettingsMigrateIfNeed$1");
    }

    public static final void run$46(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("FetchABTestCommonTask@c5b4.handleSettingsMigrateIfNeed$1");
        try {
            aRunnableS73S0200000_4.LIZ$14();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FetchABTestCommonTask@c5b4.handleSettingsMigrateIfNeed$1");
    }

    public static final void run$47(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("CheckIsKidsVideo@31ac.showBlockDialog$result$1$3");
        try {
            aRunnableS73S0200000_4.LIZ$15();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CheckIsKidsVideo@31ac.showBlockDialog$result$1$3");
    }

    public static final void run$48(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("CheckIsKidsVideo@31ac.showBlockDialog$result$1$4");
        try {
            aRunnableS73S0200000_4.LIZ$16();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CheckIsKidsVideo@31ac.showBlockDialog$result$1$4");
    }

    public static final void run$49(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("TextTemplateSelectionManager@9f3c.notifySelectionChanged$1");
        try {
            aRunnableS73S0200000_4.LIZ$17();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TextTemplateSelectionManager@9f3c.notifySelectionChanged$1");
    }

    public static final void run$5(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("TuxSheet@5e9f.onActivityCreated$1$1$2");
        try {
            View view = (View) aRunnableS73S0200000_4.l0;
            HandlerHook.viewPost(view, new ARunnableS73S0200000_4(view, (View) aRunnableS73S0200000_4.l1, 4));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TuxSheet@5e9f.onActivityCreated$1$1$2");
    }

    public static final void run$50(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("PgcSubFestBannerBinderAdapter@99e8.configureText$4");
        try {
            aRunnableS73S0200000_4.LIZ$18();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PgcSubFestBannerBinderAdapter@99e8.configureText$4");
    }

    public static final void run$51(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorEvent$1");
        try {
            C305780Byi c305780Byi = (C305780Byi) aRunnableS73S0200000_4.l0;
            String str = c305780Byi.LIZ;
            int i = c305780Byi.LIZIZ;
            JSONObject jSONObject = c305780Byi.LIZJ;
            JSONObject jSONObject2 = c305780Byi.LIZLLL;
            JSONObject jSONObject3 = (JSONObject) aRunnableS73S0200000_4.l1;
            boolean z = C0V6Y.LIZ;
            C0V6Y.LIZJ(new C0V6X(str, i, null, jSONObject, jSONObject2, jSONObject3));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorEvent$1");
    }

    public static final void run$53(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MoreContactsShareBottomDialog@de3f.scrollToSuggested$1");
        try {
            aRunnableS73S0200000_4.LIZ$19();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MoreContactsShareBottomDialog@de3f.scrollToSuggested$1");
    }

    public static final void run$54(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ClickSearchViewModel@2c5d.setVisibleIndex$1");
        try {
            ((com.bytedance.ies.sdk.widgets.NextLiveData) ((ClickSearchViewModel) aRunnableS73S0200000_4.l0).LLILLL.getValue()).setValue((Integer) aRunnableS73S0200000_4.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClickSearchViewModel@2c5d.setVisibleIndex$1");
    }

    public static final void run$55(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MarkdownTextViewExt@7986.setContent$1$1");
        try {
            ((Function1) aRunnableS73S0200000_4.l0).invoke((InterfaceC342000Daw) aRunnableS73S0200000_4.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MarkdownTextViewExt@7986.setContent$1$1");
    }

    public static final void run$56(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("AccountOrgIdentifierProtocol@1e8e.createTextConfig$1$2");
        try {
            aRunnableS73S0200000_4.LIZ$20();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AccountOrgIdentifierProtocol@1e8e.createTextConfig$1$2");
    }

    public static final void run$57(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        String str;
        C1C7U.LIZ("AmazonWebMessageHandlerImpl@b358.onReloadView$1");
        try {
            if (((C0DQJ) aRunnableS73S0200000_4.l0).LIZ.getParent() != null && (str = ((AmazonWebMessage) aRunnableS73S0200000_4.l1).url) != null) {
                C786410Ut5.ue(((C0DQJ) aRunnableS73S0200000_4.l0).LIZ, str);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AmazonWebMessageHandlerImpl@b358.onReloadView$1");
    }

    public static final void run$6(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("NextLiveData@dd3b.postValue$1");
        try {
            ((com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData) aRunnableS73S0200000_4.l1).setValue(aRunnableS73S0200000_4.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NextLiveData@dd3b.postValue$1");
    }

    public static final void run$7(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("CheckoutFragment@f43c.onPaymentContainerAvailable$1");
        try {
            if (((FrameLayout) aRunnableS73S0200000_4.l0).getParent() != null && ((CheckoutFragment) aRunnableS73S0200000_4.l1).isAdded()) {
                ((CheckoutFragment) aRunnableS73S0200000_4.l1).MR().yQ2();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CheckoutFragment@f43c.onPaymentContainerAvailable$1");
    }

    public static final void run$8(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        CheckoutViewModel checkoutViewModel;
        C1C7U.LIZ("OnestepCheckoutFragment@9eff.onPaymentContainerAvailable$1");
        try {
            if (((FrameLayout) aRunnableS73S0200000_4.l0).getParent() != null && ((OnestepCheckoutFragment) aRunnableS73S0200000_4.l1).isAdded() && (checkoutViewModel = ((OnestepCheckoutFragment) aRunnableS73S0200000_4.l1).LLILLL) != null) {
                checkoutViewModel.yQ2();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OnestepCheckoutFragment@9eff.onPaymentContainerAvailable$1");
    }

    public static final void run$9(ARunnableS73S0200000_4 aRunnableS73S0200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("OnestepCheckoutFragment@9eff.onViewCreated$$inlined$doOnPreDraw$1");
        try {
            View view = (View) aRunnableS73S0200000_4.l1;
            HandlerHook.viewPost(view, new ARunnableS104S0100000_4(view, 16));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OnestepCheckoutFragment@9eff.onViewCreated$$inlined$doOnPreDraw$1");
    }

    public ARunnableS73S0200000_4(ClickSearchViewModel clickSearchViewModel, int i) {
        this.$t = i;
        this.l0 = clickSearchViewModel;
        this.l1 = null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS73S0200000_4(java.util.List r2, java.util.List<X.C331070CyP> r3, X.ViewOnAttachStateChangeListenerC20604515jv r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 14 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS73S0200000_4.<init>(java.util.List, X.15jv, int):void");
    }

    public ARunnableS73S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
