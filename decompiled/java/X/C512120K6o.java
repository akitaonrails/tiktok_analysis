package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0K6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C512120K6o extends C1696260uF6 implements Function2<InterfaceC512170K6t, InterfaceC1364105Vn<? super Unit>, Object>, InterfaceC842703Qz {
    public C512120K6o(C512110K6n c512110K6n) {
        super(2, c512110K6n, C512110K6n.class, "handleEvent", "handleEvent(Lcom/ss/android/ugc/aweme/subscription/pgc/api/bridge/PgcSubscriptionEventBus$Event;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC512170K6t interfaceC512170K6t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        InterfaceC512170K6t interfaceC512170K6t2 = interfaceC512170K6t;
        this.receiver.getClass();
        if (interfaceC512170K6t2 instanceof C512130K6p) {
            C512130K6p c512130K6p = (C512130K6p) interfaceC512170K6t2;
            C512110K6n.LIZLLL(c512130K6p.LIZ, new C512050K6h(new C512140K6q(c512130K6p.LIZ, c512130K6p.LIZLLL, c512130K6p.LIZIZ, c512130K6p.LIZJ, null, c512130K6p.LJ, null, 80), null, null, 6));
        } else if (interfaceC512170K6t2 instanceof C512080K6k) {
            C512080K6k c512080K6k = (C512080K6k) interfaceC512170K6t2;
            String str = c512080K6k.LIZ;
            C512110K6n.LIZLLL(str, new C512050K6h(null, null, new C512070K6j(str, c512080K6k.LIZIZ, c512080K6k.LIZJ), 3));
        } else if (interfaceC512170K6t2 instanceof C221600tK) {
            String str2 = ((C221600tK) interfaceC512170K6t2).LIZ;
            C512110K6n.LIZLLL(str2, new C512050K6h(null, new C1166804hO(str2), null, 5));
        }
        return Unit.LIZ;
    }
}
