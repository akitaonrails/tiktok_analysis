package X;

import android.app.Activity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DU3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.sea.bussiness.shopbag.list.SeaLiveShopBagList$tryClaimVouchers$1$1$2", f = "SeaLiveShopBagList.kt", l = {}, m = "invokeSuspend")
public final class C0DU3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1735600vGY LL;
    public final /* synthetic */ ArrayList<String> LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DU3(C1735600vGY c1735600vGY, ArrayList<String> arrayList, Activity activity, String str, InterfaceC1364105Vn<? super C0DU3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1735600vGY;
        this.LLILLJJLI = arrayList;
        this.LLILLL = activity;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DU3(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaLiveShopBagList@69e7.tryClaimVouchers$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJZ = this.LLILLJJLI;
        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLL);
        c1389890mGx.LJIIJ(this.LLILZ);
        c1389890mGx.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaLiveShopBagList@69e7.tryClaimVouchers$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
