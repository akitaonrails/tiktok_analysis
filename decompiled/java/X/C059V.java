package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.059V, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem$RenderUi$3$3$1$3$2", f = "TakoContentPreviewAssem.kt", l = {}, m = "invokeSuspend")
public final class C059V extends C09AX implements Function2<Float, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ float LL;

    public C059V(InterfaceC1364105Vn<? super C059V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C059V c059v = new C059V(interfaceC1364105Vn);
        c059v.LL = ((Number) obj).floatValue();
        return c059v;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1$3$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL >= 0.95f) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1$3$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Float f, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Float.valueOf(f.floatValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
