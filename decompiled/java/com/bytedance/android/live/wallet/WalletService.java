package com.bytedance.android.live.wallet;

import X.AbstractC1549150qPp;
import X.C07LT;
import X.C0IJT;
import X.C0K8M;
import X.C0TVZ;
import X.C0UO0;
import X.C1126800fQc;
import X.C1134860fdc;
import X.C1144350fsv;
import X.C1149590g1N;
import X.C1150800g3K;
import X.C1150850g3P;
import X.C1151110g3p;
import X.C1151360g4E;
import X.C1161920gLG;
import X.C11NZ;
import X.C1548820qPI;
import X.C1791860wjI;
import X.C1791940wjQ;
import X.C1792780wkm;
import X.C1793000wl8;
import X.C1796530wqp;
import X.C1796540wqq;
import X.C1797100wrk;
import X.C1797270ws1;
import X.C1797400wsE;
import X.C1799260wvE;
import X.C1800780wxg;
import X.C1802440x0M;
import X.C1803010x1H;
import X.C1803320x1m;
import X.C1803390x1t;
import X.C1803600x2E;
import X.C1803640x2I;
import X.C1803660x2K;
import X.C1803800x2Y;
import X.C1803830x2b;
import X.C1804110x33;
import X.C1804190x3B;
import X.C1804820x4C;
import X.C1804840x4E;
import X.C1805280x4w;
import X.C1805380x56;
import X.C1807660x8m;
import X.C1807890x99;
import X.C1808080x9S;
import X.C1808380x9w;
import X.C1808400x9y;
import X.C19EG;
import X.C1AWD;
import X.C2188811AlT;
import X.C474500IjA;
import X.C480460Ism;
import X.C497740JfY;
import X.C501590Jll;
import X.C516901zr;
import X.C748880TZe;
import X.C782110Um9;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1804100x32;
import X.EnumC1804200x3C;
import X.EnumC1805420x5A;
import X.EnumC1805800x5m;
import X.EnumC500800JkU;
import X.InterfaceC1051760dTa;
import X.InterfaceC1106030et7;
import X.InterfaceC1149850g1n;
import X.InterfaceC1151200g3y;
import X.InterfaceC1253830ijV;
import X.InterfaceC1284030jWD;
import X.InterfaceC1796500wqm;
import X.InterfaceC1797160wrq;
import X.InterfaceC1803290x1j;
import X.InterfaceC1803690x2N;
import X.InterfaceC1804390x3V;
import X.InterfaceC1806230x6T;
import X.InterfaceC1807610x8h;
import X.InterfaceC1807640x8k;
import X.InterfaceC1808390x9x;
import Y.AcS356S0200000_27;
import Y.AfS144S0000000_27;
import Y.AfS178S0100000_9;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.WalletRechargeService;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.wallet.common.IapViewModelImpl;
import com.bytedance.android.live.wallet.data.api.IWalletApi;
import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;
import com.bytedance.android.live.wallet.view.recharge.RechargeDialog;
import com.bytedance.android.live.walletnew.jsb.ChargeMethodNew;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.HideChargeIconForUserSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveEnableNewExchangeScenerio;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletApiTrackingSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletCashierForcePreloadEnabledFor22Setting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletCashierPreloadEnabledSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletCashierPreloadPhase2EnabledSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletVipAgreement2025Q3Experiment;
import com.bytedance.android.livesdk.livesetting.wallet.VipAgreementUpdateConfig;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.api.profit.IapListResult;
import webcast.api.profit.ListV3Result;

/* JADX INFO: loaded from: classes28.dex */
public class WalletService implements IWalletService {
    @Override // com.bytedance.android.live.wallet.IWalletService
    public final String getStoreDescription() {
        WalletRechargeService walletRechargeService = (WalletRechargeService) PluggableExtentionKt.pluggableSpi(WalletRechargeService.class);
        if (walletRechargeService == null) {
            return null;
        }
        walletRechargeService.getStoreDescription();
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC1804390x3V initializeRechargeApiStateTracking() {
        return new C1807890x99();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final void preloadApApi() {
        if (PluggableExtentionKt.pluggableSpi(IWalletService.class) == null) {
            return;
        }
        C480460Ism.LIZ().getClass();
        IWalletApi iWalletApi = (IWalletApi) C480460Ism.LIZLLL(IWalletApi.class);
        C1151110g3p.LIZ.getClass();
        List<String> listLJIILLIIL = WalletCenter.LJIILLIIL();
        if (!LiveWalletApiTrackingSetting.INSTANCE.getValue()) {
            iWalletApi.getWalletInfoNew(listLJIILLIIL);
            iWalletApi.getUGBalanceInfo(1);
            return;
        }
        EnumC1805800x5m enumC1805800x5m = EnumC1805800x5m.GLOBAL;
        String value = enumC1805800x5m.getValue();
        EnumC1805420x5A enumC1805420x5A = EnumC1805420x5A.PREFETCH;
        iWalletApi.getLiveBalanceInfoWithHeader(value, enumC1805420x5A.getValue(), listLJIILLIIL);
        iWalletApi.getUGBalanceInfoWithHeader(enumC1805800x5m.getValue(), enumC1805420x5A.getValue(), 1);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideJsbForHost() {
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listAsList = Arrays.asList(C1793000wl8.class, C1791860wjI.class, C1791940wjQ.class, C1799260wvE.class, C1803010x1H.class, C1800780wxg.class, C1AWD.class, C1797400wsE.class, C1803390x1t.class, C0TVZ.class, C1792780wkm.class);
        C1150800g3K c1150800g3K = C1150800g3K.LL;
        if (!C1150800g3K.LLILLJJLI) {
            C1548820qPI.LIZLLL("exchange_dialog_event", c1150800g3K);
            C1150800g3K.LLILLJJLI = true;
        }
        C1805280x4w c1805280x4w = C1805280x4w.LL;
        if (!C1805280x4w.LLILLJJLI) {
            C1548820qPI.LIZLLL("wallet_exchange_status", c1805280x4w);
            C1805280x4w.LLILLJJLI = true;
        }
        C1803320x1m c1803320x1m = C1803320x1m.LL;
        if (!C1803320x1m.LLILLJJLI) {
            C1803320x1m.LLILLJJLI = true;
            C1548820qPI.LIZLLL("cancel_retention_popup_action", c1803320x1m);
        }
        return listAsList;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final IWalletExceptionService walletException() {
        C1802440x0M c1802440x0M = WalletExceptionService.LL;
        WalletExceptionService walletExceptionService = WalletExceptionService.LLILLJJLI;
        if (walletExceptionService == null) {
            synchronized (c1802440x0M) {
                try {
                    walletExceptionService = WalletExceptionService.LLILLJJLI;
                    if (walletExceptionService == null) {
                        walletExceptionService = new WalletExceptionService();
                        WalletExceptionService.LLILLJJLI = walletExceptionService;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return walletExceptionService;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final boolean canRedirectRechargeV3() {
        ((WalletRechargeService) ServiceManager.get().getService(WalletRechargeService.class)).canRedirectRechargeV3();
        return false;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC1796500wqm getPayManagerV2() {
        return C1797270ws1.LIZIZ();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC1803290x1j getRechargeService() {
        return C1797270ws1.LIZJ();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final boolean isValidForRechargeV3() {
        ((WalletRechargeService) ServiceManager.get().getService(WalletRechargeService.class)).isValidForRechargeV3();
        return false;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final Boolean queryShouldShowWebappProfileBanner() {
        C480460Ism.LIZ().getClass();
        ((IWalletApi) C480460Ism.LIZLLL(IWalletApi.class)).queryShouldShowWebappProfileBanner().LJIILIIL(new C0UO0()).LJJLL(new AfS144S0000000_27(5), new C516901zr(22));
        return InterfaceC1106030et7.Z5.LIZ();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC1808390x9x getKYCService() {
        return C1808400x9y.LIZ;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC1797160wrq getPayManager() {
        return C1797100wrk.LIZIZ;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final C0K8M getRechargeMonitor() {
        return C1796530wqp.LIZ;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC1151200g3y getWalletMonitorService() {
        return C1796540wqq.LIZ;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final IWalletCenter walletCenter() {
        return C1151110g3p.LIZ;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final IWalletExchange walletExchange() {
        return WalletExchange.LL;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC1803690x2N walletObserversManager() {
        return C1803660x2K.LIZ;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC1253830ijV walletOuterCenter() {
        return C1151110g3p.LIZ;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC1807610x8h getIapViewModel(InterfaceC1807640x8k interfaceC1807640x8k) {
        return new IapViewModelImpl(interfaceC1807640x8k);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final String getRechargeV3Cache(Long l) {
        WalletRechargeService walletRechargeService = (WalletRechargeService) ServiceManager.get().getService(WalletRechargeService.class);
        l.longValue();
        walletRechargeService.LJI();
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final RecyclerView.ViewHolder getWalletTabPickerViewHolder(ViewGroup viewGroup) {
        ((WalletRechargeService) ServiceManager.get().getService(WalletRechargeService.class)).LJIIJJI();
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final View inflateAnimPriceLayout(ViewStub viewStub) {
        ((WalletRechargeService) ServiceManager.get().getService(WalletRechargeService.class)).LJIIIZ();
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final boolean isRechargeV3CacheAvailable(int i) {
        String rechargeV3Cache = getRechargeV3Cache(Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (rechargeV3Cache != null && !rechargeV3Cache.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final boolean isV3Phase2(int i) {
        C1804840x4E c1804840x4ELJIILIIL = getRechargeService().LJIILIIL(C07LT.LIZ(i), null, null);
        if (isValidForRechargeV3() && canRedirectRechargeV3() && c1804840x4ELJIILIIL != null && c1804840x4ELJIILIIL.LJIJI()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final void setIapResultExtra(IapListResult.ListResultExtra listResultExtra) {
        walletCenter().setIapResultExtra(listResultExtra);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final void trackingAppResumeFromBackground(String str) {
        ((WalletRechargeService) ServiceManager.get().getService(WalletRechargeService.class)).trackingAppResumeFromBackground(str);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final void updateReferrerHostFromKeva(Context context) {
        ((WalletRechargeService) ServiceManager.get().getService(WalletRechargeService.class)).updateReferrerHostFromKeva(context);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final int getChargeSourceFromChargeFromHash(String str, int i) {
        EnumC1804100x32.Companion.getClass();
        if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).canRedirectRechargeV3()) {
            for (EnumC1804100x32 enumC1804100x32 : EnumC1804100x32.values()) {
                if (Intrinsics.LJFF(enumC1804100x32.getHash(), str)) {
                    return enumC1804100x32.getChargeSource();
                }
            }
            return i;
        }
        return i;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final Map<String, InterfaceC1051760dTa> getLiveWalletJSB(WeakReference<Context> weakReference, IESJsBridge iESJsBridge) {
        HashMap map = new HashMap();
        map.put("getPurchaseItemList", new C1803600x2E(weakReference.get(), iESJsBridge));
        map.put("charge", new ChargeMethodNew(weakReference.get(), iESJsBridge));
        map.put("rechargeV3Failed", new C1803640x2I(weakReference.get(), iESJsBridge));
        map.put("openGBLOCRpage", new C1808380x9w(weakReference.get(), iESJsBridge));
        return map;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final void handleExchangeSuccess(C19EG c19eg, Function0<Unit> function0) {
        C784440Upu.LIZ().LJ(C1149590g1N.class).LJJLJLI(new AfS178S0100000_9(function0, 68));
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final boolean isSupportPreloadReuseCashier(int i, boolean z) {
        C1804840x4E c1804840x4ELJIILIIL = getRechargeService().LJIILIIL(C07LT.LIZ(i), null, null);
        if (c1804840x4ELJIILIIL instanceof C1804820x4C) {
            int iIntValue = ((C1804820x4C) c1804840x4ELJIILIIL).LJIL().intValue();
            if (z) {
                return LiveWalletCashierPreloadPhase2EnabledSetting.INSTANCE.getValue();
            }
            if (!LiveWalletCashierPreloadEnabledSetting.INSTANCE.getValue()) {
                if (LiveWalletCashierForcePreloadEnabledFor22Setting.INSTANCE.getValue()) {
                    C1804190x3B c1804190x3B = EnumC1804200x3C.Companion;
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    c1804190x3B.getClass();
                    if (C1804190x3B.LIZ(numValueOf)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final void monitor(String str, HashMap<String, Object> map) {
        C501590Jll.LJ(map);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("big_optimize", 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_all");
        C1807660x8m.LIZJ(0, C2188811AlT.LIZIZ(sbLIZ), map);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final void reportWebappProfileBannerCheck(String str, String str2) {
        C1803800x2Y.LIZ.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_profile_webrechage_banner_check");
        c474500IjALIZ.LJJII(str, "enable_show");
        c474500IjALIZ.LJJII(str2, "fail_reason");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final void setRechargeV3Cache(Long l, String str) {
        WalletRechargeService walletRechargeService = (WalletRechargeService) ServiceManager.get().getService(WalletRechargeService.class);
        l.longValue();
        walletRechargeService.LJFF();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.android.live.wallet.IWalletService
    public final InterfaceC1051760dTa getLiveWalletJSBByName(String str, WeakReference<Context> weakReference, IESJsBridge iESJsBridge) {
        str.getClass();
        switch (str.hashCode()) {
            case -1361632588:
                if (!str.equals("charge")) {
                    return null;
                }
                return new ChargeMethodNew(weakReference.get(), iESJsBridge);
            case -422738330:
                if (!str.equals("openGBLOCRpage")) {
                    return null;
                }
                return new C1808380x9w(weakReference.get(), iESJsBridge);
            case 297224417:
                if (!str.equals("rechargeV3Failed")) {
                    return null;
                }
                return new C1803640x2I(weakReference.get(), iESJsBridge);
            case 1261903336:
                if (!str.equals("getPurchaseItemList")) {
                    return null;
                }
                return new C1803600x2E(weakReference.get(), iESJsBridge);
            default:
                return null;
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final boolean showVipAgreementIfNeeded(final Context context, final EnumC500800JkU enumC500800JkU, DialogInterface.OnDismissListener onDismissListener) {
        if (context == null) {
            return false;
        }
        C1808080x9S.LIZ.getClass();
        if (!(!Intrinsics.LJFF(InterfaceC1106030et7.V5.LIZ(), Boolean.TRUE))) {
            return false;
        }
        VipAgreementUpdateConfig value = LiveWalletVipAgreement2025Q3Experiment.INSTANCE.getValue();
        String strLJIJI = C497740JfY.LJIJI(2131853421);
        String strLJIJI2 = C497740JfY.LJIJI(2131853425);
        String strLJIJI3 = C497740JfY.LJIJI(2131853424);
        SpannableString spannableString = new SpannableString(C786410Ut5.j4(strLJIJI, Arrays.copyOf(new Object[]{strLJIJI2, strLJIJI3, C1808080x9S.LIZIZ.getValue().LIZIZ(value.date * ((long) LSPassThroughRecordSizeConfig.DEFAULT), Locale.getDefault())}, 3)));
        int iLJJJ = a0.LJJJ(spannableString, strLJIJI2, 0, false, 6);
        int iLJJJ2 = a0.LJJJ(spannableString, strLJIJI3, 0, false, 6);
        if (iLJJJ != -1) {
            final String str = value.virtualItemPolicyUrl;
            final AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(enumC500800JkU, 1033);
            C786410Ut5.p2(spannableString, new ClickableSpan(context, str, awS571S0100000_27) { // from class: X.011v
                public final String LL;
                public final Context LLILLJJLI;
                public final Function0<Unit> LLILLL;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    this.LLILLL.invoke();
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LLILLJJLI, this.LL);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(C20736316Cj.LIZIZ(R.attr.ewy, this.LLILLJJLI));
                    textPaint.setUnderlineText(true);
                }

                {
                    this.LL = str;
                    this.LLILLJJLI = context;
                    this.LLILLL = awS571S0100000_27;
                }
            }, iLJJJ, strLJIJI2.length() + iLJJJ, 17);
        }
        if (iLJJJ2 != -1) {
            final String str2 = value.rewardPolicyUrl;
            final AwS571S0100000_27 awS571S0100000_272 = new AwS571S0100000_27(enumC500800JkU, 1034);
            C786410Ut5.p2(spannableString, new ClickableSpan(context, str2, awS571S0100000_272) { // from class: X.011v
                public final String LL;
                public final Context LLILLJJLI;
                public final Function0<Unit> LLILLL;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    this.LLILLL.invoke();
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LLILLJJLI, this.LL);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(C20736316Cj.LIZIZ(R.attr.ewy, this.LLILLJJLI));
                    textPaint.setUnderlineText(true);
                }

                {
                    this.LL = str2;
                    this.LLILLJJLI = context;
                    this.LLILLL = awS571S0100000_272;
                }
            }, iLJJJ2, strLJIJI3.length() + iLJJJ2, 17);
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZJ = C497740JfY.LJIJI(2131853422);
        c782110Um9.LJIIIZ(spannableString);
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILJJIL = false;
        c782110Um9.LJIILL = false;
        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131853423), new AcS356S0200000_27(enumC500800JkU, onDismissListener, 2));
        c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.0x9R
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                String str3;
                String str4;
                C1808080x9S c1808080x9S = C1808080x9S.LIZ;
                EnumC500800JkU enumC500800JkU2 = enumC500800JkU;
                c1808080x9S.getClass();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_popup_mandatory_notification_show");
                c474500IjALIZ.LJJII("vip_2025q3", "popup_id");
                int[] iArr = C500810JkV.LIZ;
                int i = iArr[enumC500800JkU2.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        str3 = "creator";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str3 = "viewer";
                }
                c474500IjALIZ.LJJII(str3, "popup_type");
                int i2 = iArr[enumC500800JkU2.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        str4 = "go_live_page";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str4 = "live_room";
                }
                c474500IjALIZ.LJJII(str4, "popup_location");
                c474500IjALIZ.LIZ();
            }
        };
        C786410Ut5.E4(c782110Um9.LIZ());
        return true;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final DialogFragment createRechargeDialogFragment(Context context, InterfaceC1806230x6T interfaceC1806230x6T, Bundle bundle, C1803830x2b c1803830x2b) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String strValueOf = c1803830x2b.LIZJ.get("key_bundle_charge_source");
        if (strValueOf == null) {
            strValueOf = String.valueOf(bundle.getInt("key_bundle_charge_source"));
        }
        if (!strValueOf.equals(String.valueOf(5)) || canRedirectRechargeV3()) {
            C1150850g3P.LIZ(bundle);
        }
        if (!c1803830x2b.LJIJJ && C1797270ws1.LIZLLL().LIZ(context, bundle, interfaceC1806230x6T)) {
            return null;
        }
        C1803800x2Y.LIZ.getClass();
        if ((!C1803800x2Y.LJIIIZ().isEmpty()) && !c1803830x2b.LJIJJ && C1797270ws1.LIZLLL().LJ(context, bundle)) {
            return null;
        }
        return RechargeDialog.OR(bundle, null, interfaceC1806230x6T, c1803830x2b, null);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final int doExchangeBeforeRecharge(Context context, DialogFragment dialogFragment, Bundle bundle, InterfaceC1149850g1n interfaceC1149850g1n) {
        String string = bundle.getString("key_charge_reason");
        if (LiveEnableNewExchangeScenerio.INSTANCE.getValue()) {
            if (string.equals("redpacket_new") || string.equals("portal")) {
                C1144350fsv c1144350fsv = new C1144350fsv(null, Long.valueOf(bundle.getLong("key_bundle_total_coins")).intValue(), 0L, bundle.getString("key_charge_reason", ""), bundle.getString("key_charge_reason", ""), null, 224);
                if (C1150850g3P.LIZLLL(context, c1144350fsv, interfaceC1149850g1n)) {
                    return 2;
                }
                if (C1150850g3P.LJ(context, c1144350fsv, interfaceC1149850g1n)) {
                    return 1;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final View getWalletTabPicker(ViewGroup viewGroup, String str, Function1<Integer, Unit> function1, Boolean bool) {
        WalletRechargeService walletRechargeService = (WalletRechargeService) PluggableExtentionKt.pluggableSpi(WalletRechargeService.class);
        if (walletRechargeService == null) {
            return null;
        }
        bool.booleanValue();
        walletRechargeService.LJIIJJI();
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final void runPriceAnim(View view, C1805380x56 c1805380x56, C1805380x56 c1805380x562, Function0<Unit> function0) {
        ((WalletRechargeService) ServiceManager.get().getService(WalletRechargeService.class)).LJIIJ();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final void monitorException(String str, int i, int i2, String str2, HashMap<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("error_code", Integer.valueOf(i));
        map.put("detail_code", Integer.valueOf(i2));
        map.put("error_msg", str2);
        map.put("big_optimize", 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_all");
        if (!"ttlive_query_pipo_purchase_all".equals(C2188811AlT.LIZIZ(sbLIZ)) || SlardarSampleSetting.INSTANCE.isReport("ttlive_query_pipo_purchase_all", 0.01d)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("_all");
            C1807660x8m.LIZJ(1, C2188811AlT.LIZIZ(sbLIZ2), map);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append("_error");
        C1807660x8m.LIZJ(1, C2188811AlT.LIZIZ(sbLIZ3), map);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final void openCustomV3Panel(Context context, String str, String str2, Integer num, Function0<Unit> function0) {
        WalletRechargeService walletRechargeService = (WalletRechargeService) PluggableExtentionKt.pluggableSpi(WalletRechargeService.class);
        if (walletRechargeService == null) {
            return;
        }
        walletRechargeService.LIZLLL();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final DialogFragment showRechargeDialog(Context context, Bundle bundle, DataChannel dataChannel, DialogInterface.OnDismissListener onDismissListener, C1803830x2b c1803830x2b) {
        if (HideChargeIconForUserSetting.INSTANCE.getValue() || !CanRechargeSetting.INSTANCE.getValue()) {
            return null;
        }
        FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        int i = 1;
        if (!bundle.containsKey("key_bundle_banner_url") || TextUtils.isEmpty(bundle.getString("key_bundle_banner_url"))) {
            i = 1 ^ (TextUtils.isEmpty(null) ? 1 : 0);
            C786410Ut5.LJJJI("key_bundle_banner_url", null, bundle);
        }
        bundle.putInt("key_bundle_charge_type", i);
        C1150850g3P.LIZ(bundle);
        if (C1797270ws1.LIZLLL().LIZ(context, bundle, null) || C1797270ws1.LIZLLL().LJ(context, bundle)) {
            return null;
        }
        RechargeDialog rechargeDialogOR = RechargeDialog.OR(bundle, onDismissListener, null, c1803830x2b, dataChannel);
        if (fragmentManager == null || fragmentManager.LJJJJZI("RechargeDialog") != null) {
            return null;
        }
        rechargeDialogOR.show(fragmentManager, "RechargeDialog");
        return rechargeDialogOR;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final void inflateAnimPriceLayout(ViewStub viewStub, Diamond diamond, Diamond diamond2, boolean z, Function1<Diamond, String> function1, Function0<Unit> function0) {
        ((WalletRechargeService) ServiceManager.get().getService(WalletRechargeService.class)).LJII();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final C11NZ<C1804840x4E> queryDiamond(int i, long j, long j2, RecommendStrategyParam recommendStrategyParam, InterfaceC1284030jWD interfaceC1284030jWD, int i2, InterfaceC1804390x3V interfaceC1804390x3V) {
        return getRechargeService().LJ(C07LT.LIZ(i), j, j2, recommendStrategyParam, interfaceC1284030jWD, i2, interfaceC1804390x3V, false);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final String getCashierV3(Diamond diamond, int i, String str, String str2, int i2, boolean z, boolean z2, boolean z3, String str3, String str4) {
        WalletRechargeService walletRechargeService;
        C1804840x4E c1804840x4ELJIILIIL = getRechargeService().LJIILIIL(C07LT.LIZ(i2), null, null);
        if (!(c1804840x4ELJIILIIL instanceof C1804820x4C)) {
            return null;
        }
        C1804820x4C c1804820x4C = (C1804820x4C) c1804840x4ELJIILIIL;
        for (Diamond diamond2 : c1804820x4C.LJFF) {
            if (diamond != null && diamond2.count == diamond.count) {
                break;
            }
        }
        ListV3Result.Extra extra = c1804820x4C.LJIIIZ;
        if (extra == null || extra.rechargeV3CashierUrl.isEmpty() || (walletRechargeService = (WalletRechargeService) PluggableExtentionKt.pluggableSpi(WalletRechargeService.class)) == null) {
            return null;
        }
        isSupportPreloadReuseCashier(i2, z3);
        C1126800fQc.LIZ.py();
        C1134860fdc c1134860fdc = C1134860fdc.LIZ;
        C1151360g4E.LIZLLL();
        getRechargeService().LIZJ();
        walletRechargeService.LIZIZ();
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final C11NZ<ListV3Result> fetchDiamondV3(String str, int i, long j, long j2, boolean z, String str2, int i2, String str3, String str4, Long l, Function2<Integer, Throwable, Pair<Integer, String>> function2) {
        return ((WalletRechargeService) ServiceManager.get().getService(WalletRechargeService.class)).LIZ();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final boolean openCashierV3(Context context, Diamond diamond, int i, String str, String str2, int i2, Long l, boolean z, boolean z2, boolean z3, Function0<Unit> function0) {
        ListV3Result.Extra extra;
        WalletRechargeService walletRechargeService;
        EnumC1805800x5m enumC1805800x5m;
        C1804840x4E c1804840x4ELJIILIIL = getRechargeService().LJIILIIL(C07LT.LIZ(i2), null, null);
        if (!(c1804840x4ELJIILIIL instanceof C1804820x4C) || (extra = ((C1804820x4C) c1804840x4ELJIILIIL).LJIIIZ) == null || extra.rechargeV3CashierUrl.isEmpty() || (walletRechargeService = (WalletRechargeService) PluggableExtentionKt.pluggableSpi(WalletRechargeService.class)) == null || getRechargeService() == null) {
            return false;
        }
        if (i2 == 1) {
            enumC1805800x5m = EnumC1805800x5m.WALLET;
        } else {
            enumC1805800x5m = EnumC1805800x5m.LIVE_DETAIL;
        }
        enumC1805800x5m.getValue();
        C1804110x33 c1804110x33 = EnumC1804100x32.Companion;
        Integer numValueOf = Integer.valueOf(i2);
        boolean zCanRedirectRechargeV3 = canRedirectRechargeV3();
        boolean zIsV3Phase2 = isV3Phase2(i2);
        c1804110x33.getClass();
        EnumC1804100x32 enumC1804100x32LIZ = C1804110x33.LIZ(zCanRedirectRechargeV3, numValueOf, zIsV3Phase2);
        if (enumC1804100x32LIZ != null) {
            enumC1804100x32LIZ.getHash();
        }
        walletRechargeService.LIZJ();
        return false;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public final C11NZ<Pair<String, String>> createOrderV3(int i, String str, int i2, int i3, int i4, boolean z, String str2, Integer num, String str3, int i5, String str4, String str5, Function2<Integer, Throwable, Pair<Integer, String>> function2) {
        return ((WalletRechargeService) ServiceManager.get().getService(WalletRechargeService.class)).LJIIIIZZ();
    }
}
