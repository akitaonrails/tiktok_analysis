package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.preload.IMImagePreloader$addResources$1", f = "IMImagePreloader.kt", l = {}, m = "invokeSuspend")
public final class C1336650kt5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C048000Fi> LL;
    public final /* synthetic */ C1336630kt3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1336650kt5(List<C048000Fi> list, C1336630kt3 c1336630kt3, InterfaceC1364105Vn<? super C1336650kt5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c1336630kt3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1336650kt5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMImagePreloader@b523.addResources$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C048000Fi> list = this.LL;
        C1336630kt3 c1336630kt3 = this.LLILLJJLI;
        for (C048000Fi c048000Fi : list) {
            if (!c1336630kt3.LIZJ.containsKey(c048000Fi.LIZ)) {
                c1336630kt3.LIZIZ.offer(c048000Fi);
                c1336630kt3.LIZLLL();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMImagePreloader@b523.addResources$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
