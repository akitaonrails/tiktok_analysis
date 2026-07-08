package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$receiveWs$1", f = "DefaultIMUseCaseCenter.kt", l = {203, 244}, m = "invokeSuspend")
public final class C864310XvR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C863650XuN LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ byte[] LLILZIL;
    public final /* synthetic */ C1164204gy LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864310XvR(C863650XuN c863650XuN, String str, byte[] bArr, C1164204gy c1164204gy, InterfaceC1364105Vn<? super C864310XvR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c863650XuN;
        this.LLILZ = str;
        this.LLILZIL = bArr;
        this.LLILZLL = c1164204gy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C864310XvR c864310XvR = new C864310XvR(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c864310XvR.LLILLJJLI = obj;
        return c864310XvR;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C864310XvR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
