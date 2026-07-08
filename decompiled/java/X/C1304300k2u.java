package X;

import java.util.Iterator;
import java.util.Vector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.DeviceOSPlatformMisc$invokeListen$1", f = "DeviceOSPlatformMisc.kt", l = {}, m = "invokeSuspend")
public final class C1304300k2u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2219681BuA LL;
    public final /* synthetic */ EnumC1304340k2y LLILLJJLI;
    public final /* synthetic */ Object LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1304300k2u(C2219681BuA c2219681BuA, EnumC1304340k2y enumC1304340k2y, Object obj, InterfaceC1364105Vn<? super C1304300k2u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2219681BuA;
        this.LLILLJJLI = enumC1304340k2y;
        this.LLILLL = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1304300k2u(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DeviceOSPlatformMisc@ba6c.invokeListen$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Vector<C1304330k2x> vector = this.LL.LIZIZ.get(this.LLILLJJLI);
        if (vector != null) {
            Object obj2 = this.LLILLL;
            Iterator<C1304330k2x> it2 = vector.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ.invoke(obj2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DeviceOSPlatformMisc@ba6c.invokeListen$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
