package X;

import Y.AfS196S0100000_27;
import Y.AkS475S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.api.IRechargeApi;
import com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra;
import com.bytedance.android.live.wallet.model.DiamondBuyResult;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletGPInsufficientFundGuidanceSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS71S0301000_12;
import org.json.JSONException;
import tikcast.api.wallet.tiktok.DiamondBuyRequestParams;
import tikcast.api.wallet.tiktok.GetABSStatusResponse;

/* JADX INFO: renamed from: X.0wrg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797060wrg extends C09AY implements Function2<Integer, DialogC1803170x1X, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Diamond LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ C259800zU<String> LLJ;
    public final /* synthetic */ Long LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ Integer LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ Integer LLJILLL;
    public final /* synthetic */ boolean LLJJ;
    public final /* synthetic */ InterfaceC1796910wrR LLJJI;
    public final /* synthetic */ Activity LLJJIII;
    public final /* synthetic */ String LLJJIJI;
    public final /* synthetic */ C1802730x0p LLJJIJIIJIL;
    public final /* synthetic */ InterfaceC1631620sYq<DiamondBuyResult, C1792170wjn, Boolean, Boolean> LLJJIJIL;
    public final /* synthetic */ String LLJJJ;
    public final /* synthetic */ Boolean LLJJJIL;
    public final /* synthetic */ Function1<Throwable, Boolean> LLJJJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1797060wrg(int i, Diamond diamond, int i2, String str, int i3, int i4, boolean z, String str2, C259800zU<String> c259800zU, Long l, int i5, Integer num, String str3, Integer num2, boolean z2, InterfaceC1796910wrR interfaceC1796910wrR, Activity activity, String str4, C1802730x0p c1802730x0p, InterfaceC1631620sYq<? super DiamondBuyResult, ? super C1792170wjn, ? super Boolean, Boolean> interfaceC1631620sYq, String str5, Boolean bool, Function1<? super Throwable, Boolean> function1) {
        super(2);
        this.LL = i;
        this.LLILLJJLI = diamond;
        this.LLILLL = i2;
        this.LLILZ = str;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
        this.LLIZ = z;
        this.LLIZLLLIL = str2;
        this.LLJ = c259800zU;
        this.LLJI = l;
        this.LLJIJIL = i5;
        this.LLJILJIL = num;
        this.LLJILJILJ = str3;
        this.LLJILLL = num2;
        this.LLJJ = z2;
        this.LLJJI = interfaceC1796910wrR;
        this.LLJJIII = activity;
        this.LLJJIJI = str4;
        this.LLJJIJIIJIL = c1802730x0p;
        this.LLJJIJIL = interfaceC1631620sYq;
        this.LLJJJ = str5;
        this.LLJJJIL = bool;
        this.LLJJJJ = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, DialogC1803170x1X dialogC1803170x1X) {
        final boolean z;
        boolean z2;
        String billingCountryCode;
        String packageName;
        int i;
        int i2;
        C11NZ<BaseResponse<DiamondBuyResult, CreateOrderExtra>> c11nzCreateOrder;
        boolean z3;
        final InterfaceC1796910wrR c1797130wrn;
        Context context;
        final int iIntValue = num.intValue();
        final DialogC1803170x1X dialogC1803170x1X2 = dialogC1803170x1X;
        final long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.LL == 7) {
            z = true;
        } else {
            z = false;
        }
        if (iIntValue == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        final DiamondBuyRequestParams diamondBuyRequestParams = new DiamondBuyRequestParams();
        diamondBuyRequestParams.voucherTokenList = this.LLJ.element;
        InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
        if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
            billingCountryCode = "";
        }
        String strLIZIZ = C1797270ws1.LIZIZ().LIZIZ();
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext == null || (context = iHostAppContext.context()) == null || (packageName = context.getPackageName()) == null) {
            packageName = "";
        }
        if (z) {
            C480460Ism.LIZ().getClass();
            IRechargeApi iRechargeApi = (IRechargeApi) C480460Ism.LIZIZ(IRechargeApi.class);
            int i3 = this.LL;
            Diamond diamond = this.LLILLJJLI;
            c11nzCreateOrder = iRechargeApi.createOrder(i3, diamond.id, diamond.LIZIZ, diamond.LIZJ, false, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ.element, this.LLJI, this.LLJIJIL, 0, this.LLJILJIL, this.LLJILJILJ, billingCountryCode, this.LLJILLL, packageName, strLIZIZ);
        } else if (this.LLILLJJLI.LJ != null && C1796440wqg.LIZIZ()) {
            C480460Ism.LIZ().getClass();
            IRechargeApi iRechargeApi2 = (IRechargeApi) C480460Ism.LIZLLL(IRechargeApi.class);
            Diamond diamond2 = this.LLILLJJLI;
            int i4 = diamond2.id;
            String str = diamond2.LIZIZ;
            long j = diamond2.LIZJ;
            diamond2.LJ.getClass();
            c11nzCreateOrder = iRechargeApi2.createAmazonOrder(6, i4, str, j, "", "", this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ.element, packageName);
        } else {
            C480460Ism.LIZ().getClass();
            IRechargeApi iRechargeApi3 = (IRechargeApi) C480460Ism.LIZIZ(IRechargeApi.class);
            if (z2) {
                i = 8;
            } else {
                i = 3;
            }
            Diamond diamond3 = this.LLILLJJLI;
            int i5 = diamond3.id;
            String str2 = diamond3.LIZIZ;
            long j2 = diamond3.LIZJ;
            boolean z4 = this.LLJJ;
            int i6 = this.LLILLL;
            String str3 = this.LLILZ;
            int i7 = this.LLILZIL;
            int i8 = this.LLILZLL;
            boolean z5 = this.LLIZ;
            String str4 = this.LLIZLLLIL;
            String str5 = this.LLJ.element;
            Long l = this.LLJI;
            int i9 = this.LLJIJIL;
            if (dialogC1803170x1X2 != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c11nzCreateOrder = iRechargeApi3.createOrder(i, i5, str2, j2, z4, i6, str3, i7, i8, z5, str4, str5, l, i9, i2, this.LLJILJIL, this.LLJILJILJ, billingCountryCode, this.LLJILLL, packageName, strLIZIZ);
        }
        final HashMap map = new HashMap();
        map.put("is_first_recharge", Integer.valueOf(this.LLJJ ? 1 : 0));
        map.put("is_subscription", 0);
        map.put("google_abs_recharge_mode", Integer.valueOf(iIntValue));
        map.put("productId", this.LLILLJJLI.iapId);
        final C259800zU c259800zU = new C259800zU();
        Unit unit = Unit.LIZ;
        C11PQ c11pqLJLLLLLL = C11PQ.LJLLLLLL(unit);
        C11PQ c11pqLJLLLLLL2 = C11PQ.LJLLLLLL(unit);
        LiveWalletGPInsufficientFundGuidanceSetting liveWalletGPInsufficientFundGuidanceSetting = LiveWalletGPInsufficientFundGuidanceSetting.INSTANCE;
        final int value = liveWalletGPInsufficientFundGuidanceSetting.getValue();
        if (liveWalletGPInsufficientFundGuidanceSetting.getValue() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        final C013C c013c = new C013C();
        InterfaceC1796910wrR interfaceC1796910wrR = this.LLJJI;
        if (interfaceC1796910wrR != null) {
            Activity activity = this.LLJJIII;
            Diamond diamond4 = this.LLILLJJLI;
            String str6 = this.LLJJIJI;
            C1802730x0p c1802730x0p = this.LLJJIJIIJIL;
            if (!z3) {
                c1797130wrn = interfaceC1796910wrR;
            } else {
                c1797130wrn = new C1797130wrn(C1797100wrk.LIZIZ, interfaceC1796910wrR, activity, diamond4, str6, c1802730x0p, new AwS71S0301000_12(c013c, (C013C) value, (int) c11pqLJLLLLLL, (C11PQ<Unit>) c11pqLJLLLLLL2, (C11PQ<Unit>) 2));
            }
        } else {
            c1797130wrn = null;
        }
        C11NZ c11nzLJIILIIL = c11pqLJLLLLLL.LJJJ(new AkS475S0100000_12(c11nzCreateOrder, 7), false).LJJIJIIJIL(new AfS196S0100000_27(c259800zU, 37)).LJJJ(new AkS475S0100000_12(c11pqLJLLLLLL2, 9), false).LJIILIIL(new C0UO0());
        final int i10 = this.LLILLL;
        final String str7 = this.LLJJIJI;
        final boolean z6 = this.LLJJ;
        final Diamond diamond5 = this.LLILLJJLI;
        final InterfaceC1796910wrR interfaceC1796910wrR2 = this.LLJJI;
        final InterfaceC1631620sYq<DiamondBuyResult, C1792170wjn, Boolean, Boolean> interfaceC1631620sYq = this.LLJJIJIL;
        final String str8 = this.LLJJJ;
        final Boolean bool = this.LLJJJIL;
        final Activity activity2 = this.LLJJIII;
        C09JN c09jn = new C09JN() { // from class: X.0wrc
            /* JADX WARN: Removed duplicated region for block: B:150:0x0365  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x026d A[PHI: r12
              0x026d: PHI (r12v4 java.lang.String) = (r12v3 java.lang.String), (r12v6 java.lang.String), (r12v6 java.lang.String) binds: [B:93:0x0268, B:89:0x025c, B:95:0x026f] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r32) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1124
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1797020wrc.accept(java.lang.Object):void");
            }
        };
        final Function1<Throwable, Boolean> function1 = this.LLJJJJ;
        final InterfaceC1796910wrR interfaceC1796910wrR3 = c1797130wrn;
        c11nzLJIILIIL.LJJLL(c09jn, new C09JN() { // from class: X.0wra
            @Override // X.C09JN
            public final void accept(Object obj) throws JSONException {
                C1C7U.LIZ("PayManager@437b.chargePayCommon$3$subscribe$5");
                Throwable th = (Throwable) obj;
                Pair pairLIZ = C517450KRb.LIZ(-1, th);
                int iIntValue2 = ((Number) pairLIZ.getFirst()).intValue();
                C1797270ws1.LIZJ().LJIIIZ(false, (String) pairLIZ.getSecond(), 31, "1-20-51-00", iIntValue2, "create wallet order api error", "", null);
                C1803540x28.LIZ(String.valueOf(iIntValue2));
                C1796530wqp c1796530wqp = C1796530wqp.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(th.getClass());
                sbLIZ.append(" : ");
                sbLIZ.append(th);
                c1796530wqp.LIZIZ(iIntValue2, C2188811AlT.LIZIZ(sbLIZ), map);
                C474010IiN.LIZIZ(EnumC474020IiO.CREATE_ORDER_FAIL);
                Function1<Throwable, Boolean> function12 = function1;
                if (function12 == null || !function12.invoke(th).booleanValue()) {
                    GetABSStatusResponse.ABSData aBSData = C1797220wrw.LL;
                    DialogC1803170x1X dialogC1803170x1X3 = dialogC1803170x1X2;
                    if (dialogC1803170x1X3 != null) {
                        dialogC1803170x1X3.dismiss();
                        C785410UrT.LIZ(dialogC1803170x1X3);
                    }
                    C1797100wrk.LIZIZ.LJII(interfaceC1796910wrR3, 2, iIntValue2, th, diamond5.iapId);
                }
                C1C7U.LIZIZ("PayManager@437b.chargePayCommon$3$subscribe$5");
            }
        });
        return unit;
    }
}
