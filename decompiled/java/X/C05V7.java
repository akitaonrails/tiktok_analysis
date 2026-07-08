package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05V7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
public final class C05V7 extends C09AX implements InterfaceC1631620sYq<InterfaceC595070NVp, C1378605aS, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05V7(InterfaceC1364105Vn<? super C05V7> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC595070NVp interfaceC595070NVp, C1378605aS c1378605aS, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05V7(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
