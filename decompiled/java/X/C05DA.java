package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05DA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.DeviceOSPlatformMisc$asyncBlock$1", f = "DeviceOSPlatformMisc.kt", l = {}, m = "invokeSuspend")
public final class C05DA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
    public final /* synthetic */ C2219681BuA LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05DA(C2219681BuA c2219681BuA, Function0<Unit> function0, InterfaceC1364105Vn<? super C05DA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2219681BuA;
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05DA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DeviceOSPlatformMisc@ba6c.asyncBlock$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LL.LJIIJJI, null, null, new C05D9(this.LLILLJJLI, null), 3);
        C1C7U.LIZIZ("DeviceOSPlatformMisc@ba6c.asyncBlock$1");
        return anonymousClass0956LIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
