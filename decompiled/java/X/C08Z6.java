package X;

import com.bytedance.common.jato.boost.CpusetManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08Z6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.core.actor.MediatorActor$bindBigCore$1", f = "MediatorActor.kt", l = {}, m = "invokeSuspend")
public final class C08Z6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C08Z6(InterfaceC1364105Vn<? super C08Z6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08Z6(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediatorActor@95d0.bindBigCore$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CpusetManager.bindBigCore();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediatorActor@95d0.bindBigCore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C08Z6(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
