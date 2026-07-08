package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18VT, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.input.component.AiChatInputFeatureComponent$onCreate$2", f = "AiChatInputFeatureComponent.kt", l = {219, 227, 232, 246, 254, 257}, m = "invokeSuspend")
public final class C18VT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C18VZ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18VT(C18VZ c18vz, InterfaceC1364105Vn<? super C18VT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c18vz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C18VT c18vt = new C18VT(this.LLILLL, interfaceC1364105Vn);
        c18vt.LLILLJJLI = obj;
        return c18vt;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18VT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
