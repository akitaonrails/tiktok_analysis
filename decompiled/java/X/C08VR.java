package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08VR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.hybrid.spark.roma.expr.ExprTokenizer$asSequence$1", f = "ExprTokenizer.kt", l = {84, 122}, m = "invokeSuspend")
public final class C08VR extends C09AW implements Function2<AbstractC1421005hI<? super C1924407gI>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ C1925107gP LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08VR(C118300cf c118300cf, C1925107gP c1925107gP, InterfaceC1364105Vn<? super C08VR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c118300cf;
        this.LLILZIL = c1925107gP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C08VR c08vr = new C08VR(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c08vr.LLILLL = obj;
        return c08vr;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x002a A[SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08VR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1421005hI<? super C1924407gI> abstractC1421005hI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1421005hI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
