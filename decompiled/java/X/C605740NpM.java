package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.live.broadcast.stablemode.LiveAnchorDowngradeBus$release$2", f = "LiveAnchorDowngradeBus.kt", l = {}, m = "invokeSuspend")
public final class C605740NpM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C605740NpM(InterfaceC1364105Vn<? super C605740NpM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605740NpM(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveAnchorDowngradeBus@2e07.release$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C775900Uc8.LIZ.LIZIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveAnchorDowngradeBus@2e07.release$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C605740NpM(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
