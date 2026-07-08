package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05PK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
public final class C05PK extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, Float, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05PK(InterfaceC1364105Vn<? super C05PK> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, Float f, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        f.floatValue();
        return new C05PK(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
