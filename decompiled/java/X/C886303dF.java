package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayVM;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCFillCVVHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SetPrimaryPIRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SetPrimaryVerifyResponse;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.verify.IPipoVerifyCenterService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03dF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayVM$savePrefillPaymentMethod$1", f = "AuctionAddressPayVM.kt", l = {283}, m = "invokeSuspend")
public final class C886303dF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AuctionAddressPayVM LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C886303dF(AuctionAddressPayVM auctionAddressPayVM, C19EG c19eg, String str, Function0<Unit> function0, InterfaceC1364105Vn<? super C886303dF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = auctionAddressPayVM;
        this.LLILLL = c19eg;
        this.LLILZ = str;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C886303dF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map mapLJIIZILJ;
        List<ElementDTO> list;
        boolean z;
        String str;
        String str2;
        String str3;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        String str4;
        String str5;
        PaymentInfo paymentInfo;
        PaymentMethodInfo paymentMethodInfo;
        PaymentInfo paymentInfo2;
        PaymentMethodInfo paymentMethodInfo2;
        boolean z2;
        String name;
        boolean z3;
        PaymentMethod paymentMethod;
        int iIntValue;
        PaymentInfo paymentInfo3;
        PaymentInfo paymentInfo4;
        PaymentMethod paymentMethod2;
        Map<String, String> map;
        T t;
        String lowerCase;
        final String str6;
        String str7;
        String str8;
        String str9;
        Object objLIZLLL = obj;
        C1C7U.LIZ("AuctionAddressPayVM@b013.savePrefillPaymentMethod$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Integer num = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZLLL);
            } else {
                C155000ia.LIZIZ(objLIZLLL);
                C1026103zn c1026103zn = this.LLILLJJLI.LLILZIL;
                if (c1026103zn != null && (map = c1026103zn.LLILZLL) != null) {
                    mapLJIIZILJ = C2097608Jq.LJIIZILJ(map);
                } else {
                    mapLJIIZILJ = null;
                }
                C1026103zn c1026103zn2 = this.LLILLJJLI.LLILZIL;
                if (c1026103zn2 != null && (paymentInfo4 = c1026103zn2.LLILLJJLI) != null && (paymentMethod2 = paymentInfo4.paymentMethod) != null) {
                    list = paymentMethod2.popupNeededElements;
                } else {
                    list = null;
                }
                boolean z4 = false;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<ElementDTO> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().id, "eg_ccdc_global_cvv")) {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    z3 = false;
                    if (z3) {
                        AuctionAddressPayVM auctionAddressPayVM = this.LLILLJJLI;
                        C1026103zn c1026103zn3 = auctionAddressPayVM.LLILZIL;
                        if (c1026103zn3 != null && (paymentInfo3 = c1026103zn3.LLILLJJLI) != null) {
                            paymentMethod = paymentInfo3.paymentMethod;
                        } else {
                            paymentMethod = null;
                        }
                        if (this.LLILLL != null && paymentMethod != null) {
                            EnterParams enterParamsLIZ = C878003bu.LIZ(mapLJIIZILJ, auctionAddressPayVM.LLIZLLLIL);
                            Integer numLJ = C2286608xc.LJ(C497820Jfg.LIZ(this.LLILLL));
                            if (numLJ.intValue() > 0) {
                                z4 = true;
                            }
                            if (z4) {
                                num = numLJ;
                            }
                            if (num == null) {
                                iIntValue = C2132808Xe.LIZJ()[1];
                            } else {
                                iIntValue = num.intValue();
                            }
                            int iLIZ = ((int) (((double) iIntValue) * 0.93d)) + C2132808Xe.LIZ(this.LLILLL);
                            String str10 = CCDCFillCVVHalfFragment._pnsPageId;
                            C887303dP.LIZ(this.LLILLL.getSupportFragmentManager(), iLIZ, paymentMethod, enterParamsLIZ, new AwS367S0200000_1((Function0) this.LLILZIL, (Function0<Unit>) this.LLILLJJLI, (AuctionAddressPayVM) 158));
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("AuctionAddressPayVM@b013.savePrefillPaymentMethod$1");
                            return unit;
                        }
                        auctionAddressPayVM.DQ2();
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("AuctionAddressPayVM@b013.savePrefillPaymentMethod$1");
                        return unit2;
                    }
                }
                if (mapLJIIZILJ != null) {
                    str = (String) C7726030a.LIZ("seller_id", mapLJIIZILJ);
                } else {
                    str = null;
                }
                if (mapLJIIZILJ != null) {
                    str2 = (String) C7726030a.LIZ("oec_user_id", mapLJIIZILJ);
                } else {
                    str2 = null;
                }
                if (mapLJIIZILJ == null) {
                    str3 = null;
                } else {
                    str3 = (String) C7726030a.LIZ("agreement_id", mapLJIIZILJ);
                }
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String name2 = ILocationDependencyService.class.getName();
                    if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
                }
                String priorityRegion = ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getPriorityRegion();
                C1026103zn c1026103zn4 = this.LLILLJJLI.LLILZIL;
                if (c1026103zn4 != null && (paymentInfo2 = c1026103zn4.LLILLJJLI) != null && (paymentMethodInfo2 = paymentInfo2.paymentMethodInfo) != null) {
                    str4 = paymentMethodInfo2.token;
                } else {
                    str4 = null;
                }
                if (c1026103zn4 == null || (paymentInfo = c1026103zn4.LLILLJJLI) == null || (paymentMethodInfo = paymentInfo.paymentMethodInfo) == null) {
                    str5 = null;
                } else {
                    str5 = paymentMethodInfo.id;
                }
                SetPrimaryPIRequest setPrimaryPIRequest = new SetPrimaryPIRequest(str, str2, str3, priorityRegion, str4, str5, C899503fN.LIZ.get("auction"), this.LLILZ, null);
                C877403bo c877403bo = PaymentApi.LIZ;
                this.LL = 1;
                c877403bo.getClass();
                objLIZLLL = ((PaymentApi) C877403bo.LIZIZ.create(PaymentApi.class)).LIZLLL(setPrimaryPIRequest, this);
                if (objLIZLLL == objLJFF) {
                    C1C7U.LIZIZ("AuctionAddressPayVM@b013.savePrefillPaymentMethod$1");
                    return objLJFF;
                }
            }
            Response response = (Response) objLIZLLL;
            if (response.isCodeOK() && (t = response.data) != 0) {
                if (!Intrinsics.LJFF(((SetPrimaryVerifyResponse) t).errorCode, CardStruct.IStatusCode.DEFAULT)) {
                    SetPrimaryVerifyResponse setPrimaryVerifyResponse = (SetPrimaryVerifyResponse) response.data;
                    if (setPrimaryVerifyResponse != null) {
                        str9 = setPrimaryVerifyResponse.errorCode;
                    } else {
                        str9 = null;
                    }
                    if (!Intrinsics.LJFF(str9, "")) {
                        this.LLILLJJLI.DQ2();
                        Unit unit3 = Unit.LIZ;
                        C1C7U.LIZIZ("AuctionAddressPayVM@b013.savePrefillPaymentMethod$1");
                        return unit3;
                    }
                }
                SetPrimaryVerifyResponse setPrimaryVerifyResponse2 = (SetPrimaryVerifyResponse) response.data;
                if (setPrimaryVerifyResponse2 != null && (str8 = setPrimaryVerifyResponse2.decision) != null) {
                    lowerCase = str8.toLowerCase(Locale.ROOT);
                } else {
                    lowerCase = null;
                }
                if (!Intrinsics.LJFF(lowerCase, EnumC899603fO.PASS.getValue()) && lowerCase != null) {
                    if (Intrinsics.LJFF(lowerCase, EnumC899603fO.REVIEW.getValue())) {
                        T t2 = response.data;
                        SetPrimaryVerifyResponse setPrimaryVerifyResponse3 = (SetPrimaryVerifyResponse) t2;
                        if (setPrimaryVerifyResponse3 != null) {
                            str6 = setPrimaryVerifyResponse3.verifyId;
                        } else {
                            str6 = null;
                        }
                        SetPrimaryVerifyResponse setPrimaryVerifyResponse4 = (SetPrimaryVerifyResponse) t2;
                        if (setPrimaryVerifyResponse4 != null) {
                            str7 = setPrimaryVerifyResponse4.riskVerifyInfo;
                        } else {
                            str7 = null;
                        }
                        if (str7 != null) {
                            C1713520ugw c1713520ugw = new C1713520ugw(new C1713590uh3(new C1713840uhS((n) null, 3), null, str7), new C1714040uhm(EnumC1714450uiR.HALF_PAGE, null, null, null, null, false, null, 126), null, 4);
                            final C19EG c19eg = this.LLILLL;
                            if (c19eg != null) {
                                final AuctionAddressPayVM auctionAddressPayVM2 = this.LLILLJJLI;
                                final Function0<Unit> function0 = this.LLILZIL;
                                Boolean.valueOf(((IPipoVerifyCenterService) ServiceManager.get().getService(IPipoVerifyCenterService.class)).LIZ(c19eg, c1713520ugw, new InterfaceC1713650uh9() { // from class: X.03dG
                                    @Override // X.InterfaceC1713650uh9
                                    public final void LIZ(C1713690uhD c1713690uhD) {
                                        if (Intrinsics.LJFF(c1713690uhD.LIZIZ, "PASS")) {
                                            AuctionAddressPayVM auctionAddressPayVM3 = auctionAddressPayVM2;
                                            C19EG c19eg2 = c19eg;
                                            String str11 = str6;
                                            Function0<Unit> function02 = function0;
                                            auctionAddressPayVM3.getClass();
                                            auctionAddressPayVM3.setState(AFwS228S0000000_1.get$arr$(419));
                                            C948503nH.LJI(auctionAddressPayVM3, C23271099x.INSTANCE, new C886303dF(auctionAddressPayVM3, c19eg2, str11, function02, null));
                                            return;
                                        }
                                        auctionAddressPayVM2.DQ2();
                                    }
                                }));
                            }
                        }
                    } else {
                        this.LLILLJJLI.DQ2();
                    }
                } else {
                    this.LLILZIL.invoke();
                }
            } else {
                this.LLILLJJLI.DQ2();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.DQ2();
            C1AF0.LJFF(th, "auction_save_prefill_failed");
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("AuctionAddressPayVM@b013.savePrefillPaymentMethod$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
