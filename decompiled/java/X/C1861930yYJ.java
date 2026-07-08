package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;

/* JADX INFO: renamed from: X.0yYJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoImageUploadProcessor$onProcess$1", f = "TakoImageUploadProcessor.kt", l = {}, m = "invokeSuspend")
public final class C1861930yYJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1861930yYJ(InterfaceC1364105Vn<? super C1861930yYJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1861930yYJ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoImageUploadProcessor@35fd.onProcess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1864400ycI.LIZ(C1864400ycI.LIZ, true, null, AFwS269S0000000_27.get$arr$(303), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoImageUploadProcessor@35fd.onProcess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1861930yYJ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
