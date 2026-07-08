package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [D] */
/* JADX INFO: renamed from: X.0O6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.mota.runner.network.NetworkRunner$run$1", f = "NetworkRunner.kt", l = {58, 64, 70}, m = "invokeSuspend")
public final class C614030O6n<D> extends C09AX implements Function2<InterfaceC346701Wf<? super C0O7A<D>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C613690O5f LL;
    public C0O76 LLILLJJLI;
    public C613970O6h LLILLL;
    public C0O76 LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C613970O6h<D> LLIZ;
    public final /* synthetic */ C614000O6k LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C614030O6n(C613970O6h<D> c613970O6h, C614000O6k c614000O6k, InterfaceC1364105Vn<? super C614030O6n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c613970O6h;
        this.LLIZLLLIL = c614000O6k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C614030O6n c614030O6n = new C614030O6n(this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c614030O6n.LLILZLL = obj;
        return c614030O6n;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cd  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614030O6n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
