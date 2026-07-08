package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.ProgressButtonStage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.checkout.CheckoutCoordinator$1$1$1", f = "CheckoutCoordinator.kt", l = {}, m = "invokeSuspend")
public final class C1054300dXg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CartInfo LL;
    public final /* synthetic */ C1054340dXk LLILLJJLI;
    public final /* synthetic */ ProgressButtonStage LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1054300dXg(CartInfo cartInfo, C1054340dXk c1054340dXk, ProgressButtonStage progressButtonStage, InterfaceC1364105Vn<? super C1054300dXg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = cartInfo;
        this.LLILLJJLI = c1054340dXk;
        this.LLILLL = progressButtonStage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1054300dXg(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1054310dXh interfaceC1054310dXh;
        C1C7U.LIZ("CheckoutCoordinator@e725.<init>$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CartInfo cartInfo = this.LL;
        C1227904rF.LIZ.getClass();
        String json = GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), cartInfo);
        InterfaceC1054310dXh interfaceC1054310dXh2 = this.LLILLJJLI.LIZLLL;
        if (interfaceC1054310dXh2 != null) {
            interfaceC1054310dXh2.LIZIZ(this.LLILLL, json);
        }
        if (this.LLILLL == ProgressButtonStage.Pay && (interfaceC1054310dXh = this.LLILLJJLI.LIZLLL) != null) {
            interfaceC1054310dXh.LIZ(json);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckoutCoordinator@e725.<init>$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
