package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", l = {416, 418, 422, 422}, m = "invokeSuspend")
public final class C1681070tqb extends C09AX implements Function2<Float, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1677030tk5 LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1681100tqe LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681070tqb(C1681100tqe c1681100tqe, InterfaceC1364105Vn<? super C1681070tqb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1681100tqe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1681070tqb c1681070tqb = new C1681070tqb(this.LLILZ, interfaceC1364105Vn);
        c1681070tqb.LLILLL = obj;
        return c1681070tqb;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6 A[RETURN] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1681070tqb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Float f, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(f, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
