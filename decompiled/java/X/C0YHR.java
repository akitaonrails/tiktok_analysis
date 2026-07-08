package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YHR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.message.media.DefaultMediaAbility$sendMsgWithAttachment$1", f = "DefaultMediaAbility.kt", l = {55, 58}, m = "invokeSuspend")
public final class C0YHR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C873500YOm $input;
    public final /* synthetic */ boolean $refactorEnabled;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ C0YHQ this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YHR(C0YHQ c0yhq, C873500YOm c873500YOm, boolean z, InterfaceC1364105Vn<? super C0YHR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.this$0 = c0yhq;
        this.$input = c873500YOm;
        this.$refactorEnabled = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0YHR c0yhr = new C0YHR(this.this$0, this.$input, this.$refactorEnabled, interfaceC1364105Vn);
        c0yhr.L$0 = obj;
        return c0yhr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0026, code lost:
    
        X.C189200o6.m1boximpl(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YHR.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
