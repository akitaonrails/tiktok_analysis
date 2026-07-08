package X;

import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.ecommerce.network.EcommerceBystander;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pFE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.network.EcommerceBystander$handleStreamTrafficChanged$1", f = "EcommerceBystander.kt", l = {}, m = "invokeSuspend")
public final class C1504140pFE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1504140pFE(String str, InterfaceC1364105Vn<? super C1504140pFE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1504140pFE(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcommerceBystander@a442.handleStreamTrafficChanged$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EcommerceBystander ecommerceBystander = EcommerceBystander.LIZ;
        String strLJIJI = ecommerceBystander.LJIJI(this.LL);
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ(strLJIJI);
        C1504150pFF c1504150pFFRemove = EcommerceBystander.LIZJ.remove(strLJIJI);
        if (c1504150pFFRemove != null) {
            Request request = c1504150pFFRemove.LIZ;
            C0X52<?> c0x52 = c1504150pFFRemove.LIZIZ;
            ecommerceBystander.getClass();
            EcommerceBystander.LJIILJJIL(request, c0x52, true, null);
        } else {
            EcommerceBystander.LIZLLL.put(strLJIJI, Unit.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcommerceBystander@a442.handleStreamTrafficChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
