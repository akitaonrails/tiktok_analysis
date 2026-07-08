package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18LP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorApiUtils$claimVoucher$1$1", f = "AnchorApiUtils.kt", l = {21}, m = "invokeSuspend")
public final class C18LP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ClaimVoucherRequest LLILLJJLI;
    public final /* synthetic */ Function1<PanelVoucherInfo, Unit> LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C18LP(ClaimVoucherRequest claimVoucherRequest, Function1<? super PanelVoucherInfo, Unit> function1, Function1<? super String, Unit> function12, InterfaceC1364105Vn<? super C18LP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = claimVoucherRequest;
        this.LLILLL = function1;
        this.LLILZ = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18LP(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ClaimVoucherResponseData claimVoucherResponseData;
        PanelVoucherInfo panelVoucherInfo;
        C1C7U.LIZ("AnchorApiUtils@b6d2.claimVoucher$1$1");
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
            C21268718Ld c21268718Ld = InterfaceC21268618Lc.LIZ;
            ClaimVoucherRequest claimVoucherRequest = this.LLILLJJLI;
            this.LL = 1;
            obj = c21268718Ld.LIZIZ(claimVoucherRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AnchorApiUtils@b6d2.claimVoucher$1$1");
                return objLJFF;
            }
        }
        Response response = (Response) obj;
        if (response != null) {
            Function1<PanelVoucherInfo, Unit> function1 = this.LLILLL;
            Function1<String, Unit> function12 = this.LLILZ;
            if (response.isCodeOK() && (claimVoucherResponseData = (ClaimVoucherResponseData) response.data) != null && (panelVoucherInfo = claimVoucherResponseData.voucher) != null) {
                if (function1 != null) {
                    function1.invoke(panelVoucherInfo);
                }
            } else if (function12 != null) {
                function12.invoke(String.valueOf(response.code));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnchorApiUtils@b6d2.claimVoucher$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
