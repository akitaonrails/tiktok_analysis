package com.bytedance.android.live.wallet;

import X.AbstractC1549150qPp;
import X.C006A;
import X.C0K8M;
import X.C11NZ;
import X.C1803830x2b;
import X.C1804840x4E;
import X.C1805380x56;
import X.C19EG;
import X.EnumC500800JkU;
import X.InterfaceC1051760dTa;
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
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import webcast.api.profit.IapListResult;
import webcast.api.profit.ListV3Result;

/* JADX INFO: loaded from: classes28.dex */
public interface IWalletService extends C006A {
    boolean canRedirectRechargeV3();

    C11NZ<Pair<String, String>> createOrderV3(int i, String str, int i2, int i3, int i4, boolean z, String str2, Integer num, String str3, int i5, String str4, String str5, Function2<Integer, Throwable, Pair<Integer, String>> function2);

    DialogFragment createRechargeDialogFragment(Context context, InterfaceC1806230x6T interfaceC1806230x6T, Bundle bundle, C1803830x2b c1803830x2b);

    int doExchangeBeforeRecharge(Context context, DialogFragment dialogFragment, Bundle bundle, InterfaceC1149850g1n interfaceC1149850g1n);

    C11NZ<ListV3Result> fetchDiamondV3(String str, int i, long j, long j2, boolean z, String str2, int i2, String str3, String str4, Long l, Function2<Integer, Throwable, Pair<Integer, String>> function2);

    String getCashierV3(Diamond diamond, int i, String str, String str2, int i2, boolean z, boolean z2, boolean z3, String str3, String str4);

    int getChargeSourceFromChargeFromHash(String str, int i);

    InterfaceC1807610x8h getIapViewModel(InterfaceC1807640x8k interfaceC1807640x8k);

    InterfaceC1808390x9x getKYCService();

    Map<String, InterfaceC1051760dTa> getLiveWalletJSB(WeakReference<Context> weakReference, IESJsBridge iESJsBridge);

    InterfaceC1051760dTa getLiveWalletJSBByName(String str, WeakReference<Context> weakReference, IESJsBridge iESJsBridge);

    InterfaceC1797160wrq getPayManager();

    InterfaceC1796500wqm getPayManagerV2();

    C0K8M getRechargeMonitor();

    InterfaceC1803290x1j getRechargeService();

    String getRechargeV3Cache(Long l);

    String getStoreDescription();

    InterfaceC1151200g3y getWalletMonitorService();

    View getWalletTabPicker(ViewGroup viewGroup, String str, Function1<Integer, Unit> function1, Boolean bool);

    RecyclerView.ViewHolder getWalletTabPickerViewHolder(ViewGroup viewGroup);

    void handleExchangeSuccess(C19EG c19eg, Function0<Unit> function0);

    View inflateAnimPriceLayout(ViewStub viewStub);

    void inflateAnimPriceLayout(ViewStub viewStub, Diamond diamond, Diamond diamond2, boolean z, Function1<Diamond, String> function1, Function0<Unit> function0);

    InterfaceC1804390x3V initializeRechargeApiStateTracking();

    boolean isRechargeV3CacheAvailable(int i);

    boolean isSupportPreloadReuseCashier(int i, boolean z);

    boolean isV3Phase2(int i);

    boolean isValidForRechargeV3();

    void monitor(String str, HashMap<String, Object> map);

    void monitorException(String str, int i, int i2, String str2, HashMap<String, Object> map);

    /* bridge */ /* synthetic */ void onInit();

    boolean openCashierV3(Context context, Diamond diamond, int i, String str, String str2, int i2, Long l, boolean z, boolean z2, boolean z3, Function0<Unit> function0);

    void openCustomV3Panel(Context context, String str, String str2, Integer num, Function0<Unit> function0);

    void preloadApApi();

    List<Class<? extends AbstractC1549150qPp<?, ?>>> provideJsbForHost();

    C11NZ<C1804840x4E> queryDiamond(int i, long j, long j2, RecommendStrategyParam recommendStrategyParam, InterfaceC1284030jWD interfaceC1284030jWD, int i2, InterfaceC1804390x3V interfaceC1804390x3V);

    Boolean queryShouldShowWebappProfileBanner();

    void reportWebappProfileBannerCheck(String str, String str2);

    void runPriceAnim(View view, C1805380x56 c1805380x56, C1805380x56 c1805380x562, Function0<Unit> function0);

    void setIapResultExtra(IapListResult.ListResultExtra listResultExtra);

    void setRechargeV3Cache(Long l, String str);

    DialogFragment showRechargeDialog(Context context, Bundle bundle, DataChannel dataChannel, DialogInterface.OnDismissListener onDismissListener, C1803830x2b c1803830x2b);

    boolean showVipAgreementIfNeeded(Context context, EnumC500800JkU enumC500800JkU, DialogInterface.OnDismissListener onDismissListener);

    void trackingAppResumeFromBackground(String str);

    void updateReferrerHostFromKeva(Context context);

    IWalletCenter walletCenter();

    IWalletExceptionService walletException();

    IWalletExchange walletExchange();

    InterfaceC1803690x2N walletObserversManager();

    InterfaceC1253830ijV walletOuterCenter();
}
