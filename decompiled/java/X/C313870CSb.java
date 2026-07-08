package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.linkcore.tracker.TrackerImpl$1", f = "TrackerImpl.kt", l = {64}, m = "invokeSuspend")
public final class C313870CSb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Boolean>>, Object> {
    public int LL;

    public C313870CSb(InterfaceC1364105Vn<? super C313870CSb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313870CSb(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TrackerImpl@989c.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1304610k3P c1304610k3P = C1304610k3P.LIZ;
            this.LL = 1;
            obj = c1304610k3P.LIZLLL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TrackerImpl@989c.<init>$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TrackerImpl@989c.<init>$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Boolean>> interfaceC1364105Vn) {
        return new C313870CSb(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
