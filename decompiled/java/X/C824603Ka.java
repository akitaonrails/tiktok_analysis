package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03Ka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel$checkAndUpdateBillInfoData$1", f = "MiniOspViewModel.kt", l = {1022}, m = "invokeSuspend")
public final class C824603Ka extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BillInfoData LLILLL;
    public final /* synthetic */ MiniOspViewModel LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ BillInfoRequest LLIZ;
    public final /* synthetic */ ChangeInfo LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C824603Ka(BillInfoData billInfoData, MiniOspViewModel miniOspViewModel, boolean z, Integer num, BillInfoRequest billInfoRequest, ChangeInfo changeInfo, InterfaceC1364105Vn<? super C824603Ka> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = billInfoData;
        this.LLILZ = miniOspViewModel;
        this.LLILZIL = z;
        this.LLILZLL = num;
        this.LLIZ = billInfoRequest;
        this.LLIZLLLIL = changeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C824603Ka c824603Ka = new C824603Ka(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c824603Ka.LLILLJJLI = obj;
        return c824603Ka;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ExceptionUX exceptionUX;
        ChangeInfo changeInfo;
        BillInfoData billInfoData;
        BillInfoData billInfoData2;
        C03WX c03wx;
        BillInfoData billInfoData3;
        C1C7U.LIZ("MiniOspViewModel@8f4.checkAndUpdateBillInfoData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            BillInfoData billInfoData4 = this.LLILLL;
            if (billInfoData4 != null && billInfoData4.exceptionUX != null) {
                this.LLILZ.getClass();
            }
            C03WX c03wx2 = this.LLILZ.LLJJL;
            if (c03wx2 != null && Intrinsics.LJFF(c03wx2.LIZJ, true)) {
                this.LLILZ.setState(AFwS228S0000000_1.get$arr$(447));
            } else {
                this.LLILZ.setState(AFwS228S0000000_1.get$arr$(448));
            }
            if (C7806033c.LJIJJ(this.LLILLL, this.LLILZIL, this.LLILZLL)) {
                MiniOspViewModel miniOspViewModel = this.LLILZ;
                BillInfoData billInfoData5 = this.LLILLL;
                BillInfoRequest billInfoRequest = this.LLIZ;
                boolean z = this.LLILZIL;
                ChangeInfo changeInfo2 = this.LLIZLLLIL;
                this.LL = 1;
                if (miniOspViewModel.BQ2(billInfoData5, billInfoRequest, z, changeInfo2, this) == objLJFF) {
                    C1C7U.LIZIZ("MiniOspViewModel@8f4.checkAndUpdateBillInfoData$1");
                    return objLJFF;
                }
            } else {
                MiniOspViewModel miniOspViewModel2 = this.LLILZ;
                BillInfoData billInfoData6 = this.LLILLL;
                if (billInfoData6 != null) {
                    exceptionUX = billInfoData6.exceptionUX;
                } else {
                    exceptionUX = null;
                }
                miniOspViewModel2.LLIZLLLIL = exceptionUX;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C825003Ke(billInfoData6, miniOspViewModel2, null), 2);
                if (!this.LLILZ.LLJJIII && (((changeInfo = this.LLIZ.getChangeInfo()) == null || changeInfo.changeType != C03DI.DEFAULT.getValue()) && (billInfoData = this.LLILLL) != null)) {
                    this.LLILZ.YQ2(billInfoData);
                }
                C03WX c03wx3 = this.LLILZ.LLJJL;
                if (c03wx3 == null || !Intrinsics.LJFF(c03wx3.LIZJ, true)) {
                    MiniOspViewModel miniOspViewModel3 = this.LLILZ;
                    miniOspViewModel3.getClass();
                    miniOspViewModel3.withState(new AwS580S0100000_1(miniOspViewModel3, 429));
                }
                this.LLILZ.dR2();
            }
        }
        BillInfoData billInfoData7 = this.LLILLL;
        if (((billInfoData7 != null && Intrinsics.LJFF(billInfoData7.LIZ, true) && (billInfoData3 = this.LLILLL) != null && Intrinsics.LJFF(billInfoData3.lastChunk, true)) || (billInfoData2 = this.LLILLL) == null || !Intrinsics.LJFF(billInfoData2.LIZ, true)) && (c03wx = this.LLILZ.LLJJL) != null) {
            c03wx.LIZJ = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MiniOspViewModel@8f4.checkAndUpdateBillInfoData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
