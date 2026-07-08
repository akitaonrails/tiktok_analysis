package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05PL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
public final class C05PL extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, C1378605aS, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05PL(InterfaceC1364105Vn<? super C05PL> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, C1378605aS c1378605aS, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05PL(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
