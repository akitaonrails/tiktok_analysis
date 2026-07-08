package X;

import Y.AfS99S0300000_1;
import android.app.Activity;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03Lc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$queryRequestByChunk$1", f = "OrderSubmitAssemViewModel.kt", l = {2297}, m = "invokeSuspend")
public final class C827403Lc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public OrderSubmitAssemViewModel LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILZ;
    public final /* synthetic */ BillInfoRequest LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ ChangeInfo LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ C05XL<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C827403Lc(OrderSubmitAssemViewModel orderSubmitAssemViewModel, BillInfoRequest billInfoRequest, boolean z, ChangeInfo changeInfo, boolean z2, boolean z3, C05XL<Unit> c05xl, InterfaceC1364105Vn<? super C827403Lc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = orderSubmitAssemViewModel;
        this.LLILZIL = billInfoRequest;
        this.LLILZLL = z;
        this.LLIZ = changeInfo;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
        this.LLJI = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C827403Lc(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final C259800zU c259800zU;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel;
        Integer numLJ;
        Object objLJJJLL = obj;
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.queryRequestByChunk$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        InterfaceC420801kM interfaceC420801kMLJJLL = null;
        if (i != 0) {
            if (i == 1) {
                orderSubmitAssemViewModel = this.LLILLJJLI;
                c259800zU = this.LL;
                C155000ia.LIZIZ(objLJJJLL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJJJLL);
            C11JF c11jf = this.LLILZ.E;
            if (c11jf != null) {
                c11jf.dispose();
            }
            c259800zU = new C259800zU();
            orderSubmitAssemViewModel = this.LLILZ;
            C03WX c03wx = orderSubmitAssemViewModel.LLLJIL;
            if (c03wx != null) {
                BillInfoRequest billInfoRequest = this.LLILZIL;
                boolean z = !orderSubmitAssemViewModel.LLJLL;
                HashMap<String, Object> map = orderSubmitAssemViewModel.LLLIL;
                if (map == null) {
                    map = new HashMap<>();
                }
                boolean z2 = this.LLILZLL;
                ChangeInfo changeInfo = this.LLIZ;
                if (changeInfo != null) {
                    numLJ = C2286608xc.LJ(changeInfo.changeType);
                } else {
                    numLJ = null;
                }
                this.LL = c259800zU;
                this.LLILLJJLI = orderSubmitAssemViewModel;
                this.LLILLL = 1;
                objLJJJLL = c03wx.LJJJLL(billInfoRequest, z, map, z2, true, numLJ, this);
                if (objLJJJLL == objLJFF) {
                    C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.queryRequestByChunk$1");
                    return objLJFF;
                }
            }
            orderSubmitAssemViewModel.E = (C11JF) interfaceC420801kMLJJLL;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.queryRequestByChunk$1");
            return unit;
        }
        C11NZ c11nz = (C11NZ) objLJJJLL;
        if (c11nz != null) {
            C11O8 c11o8LJJJLZIJ = c11nz.LJJJLZIJ(C1701940uOG.LIZIZ());
            final OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LLILZ;
            final BillInfoRequest billInfoRequest2 = this.LLILZIL;
            final boolean z3 = this.LLIZLLLIL;
            final boolean z4 = this.LLJ;
            final ChangeInfo changeInfo2 = this.LLIZ;
            final C05XL<Unit> c05xl = this.LLJI;
            interfaceC420801kMLJJLL = c11o8LJJJLZIJ.LJJLL(new C09JN() { // from class: X.0366
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    String string;
                    T t;
                    T t2;
                    List<ShopOrderNew> list;
                    AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
                    boolean z5;
                    C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.queryRequestByChunk$1$1");
                    Response response = (Response) obj2;
                    OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = orderSubmitAssemViewModel2;
                    String name = null;
                    if (response != null) {
                        string = Integer.valueOf(response.code).toString();
                    } else {
                        string = null;
                    }
                    orderSubmitAssemViewModel3.LLJJIJI = string;
                    if (response != null) {
                        t = response.data;
                    } else {
                        t = null;
                    }
                    if (t == null) {
                        orderSubmitAssemViewModel2.dS2(c259800zU.element);
                        C1AF0.LIZJ("query by chunk data interrupt data null");
                        C1120604Zw c1120604Zw = C1120604Zw.LIZ;
                        String string2 = C7879035x.LIZ().getResources().getString(2131848101);
                        if (C034S.LIZ()) {
                            c1120604Zw.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            String name2 = IActivityStackDependencyService.class.getName();
                            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                                name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
                            }
                            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z5);
                        } else {
                            c1120604Zw.LIZ();
                            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
                        }
                        Activity topActivity = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).getTopActivity();
                        if (topActivity != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(topActivity);
                            c1389890mGx.LJIIJ(string2);
                            c1389890mGx.LJIIJJI();
                        }
                        orderSubmitAssemViewModel2.setState(AFwS228S0000000_1.get$arr$(451));
                    } else {
                        C259800zU<BillInfoData> c259800zU2 = c259800zU;
                        BillInfoData billInfoData = c259800zU2.element;
                        if (billInfoData == null) {
                            t2 = response.data;
                        } else {
                            t2 = (T) billInfoData.LJIILLIIL((BillInfoData) response.data);
                        }
                        c259800zU2.element = t2;
                        BillInfoData billInfoData2 = (BillInfoData) response.data;
                        if (billInfoData2 != null && Intrinsics.LJFF(billInfoData2.lastChunk, Boolean.TRUE)) {
                            if (orderSubmitAssemViewModel2.LLLLZLL) {
                                BillInfoData billInfoData3 = c259800zU.element;
                                if (billInfoData3 == null || (list = billInfoData3.newShopOrders) == null || list.isEmpty()) {
                                    ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("restore_sku_quantity_event", "{}");
                                }
                                orderSubmitAssemViewModel2.LLLLZLL = false;
                            }
                            OrderSubmitAssemViewModel.RQ2(orderSubmitAssemViewModel2, c259800zU.element, billInfoRequest2, z3, z4, false, response.chunkIndex, changeInfo2, false, 128);
                            orderSubmitAssemViewModel2.setState(AFwS228S0000000_1.get$arr$(454));
                            c05xl.LJIIZILJ(Unit.LIZ);
                        }
                    }
                    C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.queryRequestByChunk$1$1");
                }
            }, new AfS99S0300000_1(orderSubmitAssemViewModel2, c259800zU, c05xl, 0));
        }
        orderSubmitAssemViewModel.E = (C11JF) interfaceC420801kMLJJLL;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.queryRequestByChunk$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
