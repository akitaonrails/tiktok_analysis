package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09BT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.UDPSocketPlatformMisc$emitError$1", f = "UDPSocketPlatformMisc.kt", l = {}, m = "invokeSuspend")
public final class C09BT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C09BR LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09BT(C09BR c09br, int i, int i2, String str, InterfaceC1364105Vn<? super C09BT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c09br;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09BT(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UDPSocketPlatformMisc@e2cc.emitError$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.onError(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UDPSocketPlatformMisc@e2cc.emitError$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
