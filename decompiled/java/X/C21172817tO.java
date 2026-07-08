package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17tO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.larus.business.markdown.impl.MarkdownServiceImpl$prepareAsync$1", f = "MarkdownServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C21172817tO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21172817tO(Context context, InterfaceC1364105Vn<? super C21172817tO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21172817tO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MarkdownServiceImpl@143.prepareAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC21173117tR interfaceC21173117tR = (InterfaceC21173117tR) C21173017tQ.LIZ.getValue();
        if (interfaceC21173117tR != null) {
            interfaceC21173117tR.init(this.LL);
        }
        if (C21419718s7.LIZ.LJIIJ()) {
            C21379518ld.LIZIZ("");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MarkdownServiceImpl@143.prepareAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
