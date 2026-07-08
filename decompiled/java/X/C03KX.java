package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03KX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$checkAndUpdateBillInfoData$1", f = "OrderSubmitAssemViewModel.kt", l = {2596, 2613}, m = "invokeSuspend")
public final class C03KX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ BillInfoData LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLIZ;
    public final /* synthetic */ BillInfoRequest LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ ChangeInfo LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03KX(boolean z, BillInfoData billInfoData, boolean z2, Integer num, OrderSubmitAssemViewModel orderSubmitAssemViewModel, BillInfoRequest billInfoRequest, boolean z3, boolean z4, ChangeInfo changeInfo, InterfaceC1364105Vn<? super C03KX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = billInfoData;
        this.LLILZIL = z2;
        this.LLILZLL = num;
        this.LLIZ = orderSubmitAssemViewModel;
        this.LLIZLLLIL = billInfoRequest;
        this.LLJ = z3;
        this.LLJI = z4;
        this.LLJIJIL = changeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C03KX c03kx = new C03KX(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c03kx.LLILLJJLI = obj;
        return c03kx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ExceptionUX exceptionUX;
        C03WX c03wx;
        ChangeInfo changeInfo;
        Integer num;
        Integer num2;
        C752702wn c752702wnLIZIZ;
        List<String> list;
        AddonOrder addonOrder;
        ExceptionUX exceptionUX2;
        BillInfoData billInfoData;
        BillInfoData billInfoData2;
        C03WX c03wx2;
        BillInfoData billInfoData3;
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.checkAndUpdateBillInfoData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    billInfoData = this.LLILZ;
                    if (((billInfoData == null && Intrinsics.LJFF(billInfoData.LIZ, true) && (billInfoData3 = this.LLILZ) != null && Intrinsics.LJFF(billInfoData3.lastChunk, true)) || (billInfoData2 = this.LLILZ) == null || !Intrinsics.LJFF(billInfoData2.LIZ, true)) && (c03wx2 = this.LLIZ.LLLJIL) != null) {
                        c03wx2.LIZJ = null;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (this.LLILLL && C953203o2.LIZJ()) {
                if (C7806033c.LJIJJ(this.LLILZ, this.LLILZIL, this.LLILZLL)) {
                    OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLIZ;
                    BillInfoData billInfoData4 = this.LLILZ;
                    BillInfoRequest billInfoRequest = this.LLIZLLLIL;
                    boolean z = this.LLJ;
                    boolean z2 = this.LLJI;
                    boolean z3 = this.LLILZIL;
                    ChangeInfo changeInfo2 = this.LLJIJIL;
                    boolean z4 = this.LLILLL;
                    this.LL = 1;
                    if (orderSubmitAssemViewModel.SQ2(billInfoData4, billInfoRequest, z, z2, z3, changeInfo2, z4, this) == objLJFF) {
                        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.checkAndUpdateBillInfoData$1");
                        return objLJFF;
                    }
                }
            } else {
                BillInfoData billInfoData5 = this.LLILZ;
                if (billInfoData5 != null && (exceptionUX2 = billInfoData5.exceptionUX) != null) {
                    this.LLIZ.LLJ = exceptionUX2;
                }
                C03WX c03wx3 = this.LLIZ.LLLJIL;
                if (c03wx3 != null && Intrinsics.LJFF(c03wx3.LIZJ, true)) {
                    this.LLIZ.setState(AFwS228S0000000_1.get$arr$(471));
                } else {
                    this.LLIZ.setState(AFwS228S0000000_1.get$arr$(472));
                }
                if (C7806033c.LJIJJ(this.LLILZ, this.LLILZIL, this.LLILZLL)) {
                    OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LLIZ;
                    BillInfoData billInfoData6 = this.LLILZ;
                    BillInfoRequest billInfoRequest2 = this.LLIZLLLIL;
                    boolean z5 = this.LLJ;
                    boolean z6 = this.LLJI;
                    boolean z7 = this.LLILZIL;
                    ChangeInfo changeInfo3 = this.LLJIJIL;
                    boolean z8 = this.LLILLL;
                    this.LL = 2;
                    if (orderSubmitAssemViewModel2.SQ2(billInfoData6, billInfoRequest2, z5, z6, z7, changeInfo3, z8, this) == objLJFF) {
                        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.checkAndUpdateBillInfoData$1");
                        return objLJFF;
                    }
                } else {
                    C013C c013c = new C013C();
                    c013c.element = true;
                    OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = this.LLIZ;
                    BillInfoData billInfoData7 = this.LLILZ;
                    if (billInfoData7 != null) {
                        exceptionUX = billInfoData7.exceptionUX;
                    } else {
                        exceptionUX = null;
                    }
                    orderSubmitAssemViewModel3.LLJJIII = exceptionUX;
                    if (exceptionUX != null && (((num = exceptionUX.exceptionUXType) != null && num.intValue() == 8) || ((num2 = exceptionUX.exceptionUXType) != null && num2.intValue() == 17))) {
                        C752702wn c752702wn = orderSubmitAssemViewModel3.LLILZLL;
                        if (c752702wn != null) {
                            if (billInfoData7 != null && (addonOrder = billInfoData7.addonOrder) != null) {
                                list = addonOrder.filterSku;
                            } else {
                                list = null;
                            }
                            c752702wnLIZIZ = C752702wn.LIZIZ(c752702wn, null, null, list, 32735);
                        } else {
                            c752702wnLIZIZ = null;
                        }
                        orderSubmitAssemViewModel3.LLILZLL = c752702wnLIZIZ;
                        c013c.element = false;
                    }
                    OrderSubmitAssemViewModel orderSubmitAssemViewModel4 = this.LLIZ;
                    orderSubmitAssemViewModel4.f348X = false;
                    orderSubmitAssemViewModel4.Z = false;
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C826303Kr(this.LLILZ, orderSubmitAssemViewModel4, this.LLILZIL, null), 2);
                    if (!this.LLIZ.LLJLL && ((changeInfo = this.LLIZLLLIL.getChangeInfo()) == null || changeInfo.changeType != C03DI.DEFAULT.getValue())) {
                        C01GW c01gw = C03L9.LIZ;
                        if ((Intrinsics.LJFF(c01gw.getValue(), true) && !this.LLIZ.LLJLLIL) || !Intrinsics.LJFF(c01gw.getValue(), true)) {
                            OrderSubmitAssemViewModel orderSubmitAssemViewModel5 = this.LLIZ;
                            orderSubmitAssemViewModel5.LLJLLIL = true;
                            BillInfoData billInfoData8 = this.LLILZ;
                            if (billInfoData8 != null) {
                                orderSubmitAssemViewModel5.zS2(billInfoData8);
                            }
                        }
                    }
                    if (c013c.element && ((c03wx = this.LLIZ.LLLJIL) == null || !Intrinsics.LJFF(c03wx.LIZJ, true))) {
                        this.LLIZ.nT2();
                    }
                }
                billInfoData = this.LLILZ;
                if (billInfoData == null) {
                    c03wx2.LIZJ = null;
                } else {
                    c03wx2.LIZJ = null;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.checkAndUpdateBillInfoData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
