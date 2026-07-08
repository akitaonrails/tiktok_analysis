package X;

import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05RF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
public final class C05RF extends C09AX implements InterfaceC1631620sYq<C05RG, Map<Object, ? extends Float>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ C05RG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Object LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05RF(Object obj, InterfaceC1364105Vn<? super C05RF> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = obj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C05RG c05rg = this.LL;
        Float f = (Float) ((Map) this.LLILLJJLI).get(this.LLILLL);
        if (f != null) {
            c05rg.LIZ(f.floatValue(), 0.0f);
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C05RG c05rg, Map<Object, ? extends Float> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C05RF c05rf = new C05RF(this.LLILLL, interfaceC1364105Vn);
        c05rf.LL = c05rg;
        c05rf.LLILLJJLI = map;
        return c05rf.invokeSuspend(Unit.LIZ);
    }
}
