package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel$sendChangeAutoPostSwitchStatusRequest$1", f = "HighlightsListViewModel.kt", l = {139}, m = "invokeSuspend")
public final class C597670NcL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ HighlightsListViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function2<Boolean, Boolean, Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C597670NcL(HighlightsListViewModel highlightsListViewModel, boolean z, Function2<? super Boolean, ? super Boolean, Unit> function2, int i, InterfaceC1364105Vn<? super C597670NcL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = highlightsListViewModel;
        this.LLILLL = z;
        this.LLILZ = function2;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597670NcL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Response response;
        C1C7U.LIZ("HighlightsListViewModel@8591.sendChangeAutoPostSwitchStatusRequest$1");
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
            this.LLILLJJLI.setState(AFwS240S0000000_9.get$arr$(957));
            C2126408Us c2126408Us = C2126308Ur.LIZIZ;
            C597660NcK c597660NcK = new C597660NcK(this.LLILLJJLI, this.LLILZIL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c2126408Us, c597660NcK);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("HighlightsListViewModel@8591.sendChangeAutoPostSwitchStatusRequest$1");
                return objLJFF;
            }
        }
        C0X52 c0x52 = (C0X52) obj;
        if (c0x52 != null && c0x52.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        if (z && c0x52 != null && (response = (Response) c0x52.LIZIZ) != null && response.code == 0) {
            this.LLILLJJLI.setState(AFwS240S0000000_9.get$arr$(958));
            HighlightsListViewModel highlightsListViewModel = this.LLILLJJLI;
            boolean z2 = this.LLILLL;
            highlightsListViewModel.LLJILJILJ = z2;
            this.LLILZ.invoke(Boolean.valueOf(z2), true);
            HighlightsListViewModel.yQ2(this.LLILLJJLI, "send_req_setting_change_success", null, null, 14);
        } else {
            this.LLILLJJLI.setState(new AwS588S0100000_9(c0x52, (C0X52<Response<Object>>) 666));
            this.LLILZ.invoke(Boolean.valueOf(this.LLILLL), false);
            HighlightsListViewModel.yQ2(this.LLILLJJLI, "send_req_setting_change_fail", null, null, 14);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HighlightsListViewModel@8591.sendChangeAutoPostSwitchStatusRequest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
