package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowSessionImpl$2", f = "AIGCWorkflowSession.kt", l = {166}, m = "invokeSuspend")
public final class C555970LrH extends C09AX implements Function2<C555990LrJ, InterfaceC1364105Vn<? super C555990LrJ>, Object> {
    public Object LL;
    public AbstractC1406905f1 LLILLJJLI;
    public C1346605Ou LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C556030LrN LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555970LrH(C556030LrN c556030LrN, InterfaceC1364105Vn<? super C555970LrH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c556030LrN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C555970LrH c555970LrH = new C555970LrH(this.LLILZLL, interfaceC1364105Vn);
        c555970LrH.LLILZIL = obj;
        return c555970LrH;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555970LrH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C555990LrJ c555990LrJ, InterfaceC1364105Vn<? super C555990LrJ> interfaceC1364105Vn) {
        return ((a) create(c555990LrJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
