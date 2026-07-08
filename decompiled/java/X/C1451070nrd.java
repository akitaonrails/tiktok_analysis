package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nrd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.preview.ImageEditItemScene$updateSynthesisImagePathOnSave$1", f = "ImageEditItemScene.kt", l = {}, m = "invokeSuspend")
public final class C1451070nrd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1450990nrV LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1451070nrd(C1450990nrV c1450990nrV, InterfaceC1364105Vn<? super C1451070nrd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1450990nrV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1451070nrd(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ImageEditItemScene@e4f8.updateSynthesisImagePathOnSave$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1450940nrQ c1450940nrQ = this.LL.LLJLIL;
        if (c1450940nrQ == null) {
            c1450940nrQ = null;
        }
        c1450940nrQ.LJIIIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditItemScene@e4f8.updateSynthesisImagePathOnSave$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
