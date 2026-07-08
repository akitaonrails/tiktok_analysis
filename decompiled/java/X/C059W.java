package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.059W, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem$RenderUi$3$3$1$2$2", f = "TakoContentPreviewAssem.kt", l = {}, m = "invokeSuspend")
public final class C059W extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;

    public C059W(InterfaceC1364105Vn<? super C059W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C059W c059w = new C059W(interfaceC1364105Vn);
        c059w.LL = ((Boolean) obj).booleanValue();
        return c059w;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL);
        C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1$2$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
