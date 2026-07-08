package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.thankyou.ThankYouViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0D4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.thankyou.ThankYouViewModel$onViewOrderClicked$1", f = "ThankYouViewModel.kt", l = {38, 40, 42}, m = "invokeSuspend")
public final class C333190D4j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ThankYouViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333190D4j(ThankYouViewModel thankYouViewModel, String str, InterfaceC1364105Vn<? super C333190D4j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = thankYouViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C333190D4j(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ThankYouViewModel@4b9c.onViewOrderClicked$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ThankYouViewModel@4b9c.onViewOrderClicked$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0D6A c0d6a = this.LLILLJJLI.LL;
            String str = this.LLILLL;
            this.LL = 1;
            C333640D6c c333640D6c = c0d6a.LIZ;
            String strLIZIZ = C1024180cl6.LIZIZ();
            if (!(true ^ a0.LJJJIL(strLIZIZ)) || strLIZIZ == null) {
                strLIZIZ = "";
            }
            obj = c333640D6c.LIZ(strLIZIZ, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ThankYouViewModel@4b9c.onViewOrderClicked$1");
                return objLJFF;
            }
        }
        LocalOrderWrapper localOrderWrapper = (LocalOrderWrapper) obj;
        if (localOrderWrapper != null) {
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLJJLI;
            C333210D4l c333210D4l = new C333210D4l(localOrderWrapper);
            this.LL = 2;
            if (c2252331DDr.emit(c333210D4l, this) == objLJFF) {
                C1C7U.LIZIZ("ThankYouViewModel@4b9c.onViewOrderClicked$1");
                return objLJFF;
            }
        } else {
            C2252331DDr c2252331DDr2 = this.LLILLJJLI.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Order not found: ");
            sbLIZ.append(this.LLILLL);
            C333200D4k c333200D4k = new C333200D4k(C2188811AlT.LIZIZ(sbLIZ));
            this.LL = 3;
            if (c2252331DDr2.emit(c333200D4k, this) == objLJFF) {
                C1C7U.LIZIZ("ThankYouViewModel@4b9c.onViewOrderClicked$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ThankYouViewModel@4b9c.onViewOrderClicked$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
