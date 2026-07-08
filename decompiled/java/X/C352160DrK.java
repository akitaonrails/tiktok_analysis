package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DrK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel$realCompile$2$2$1", f = "AudioRecordActivityViewModel.kt", l = {}, m = "invokeSuspend")
public final class C352160DrK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1463860oCG LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352160DrK(C1463860oCG c1463860oCG, InterfaceC1364105Vn<? super C352160DrK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1463860oCG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352160DrK(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudioRecordActivityViewModel@463c.realCompile$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((C1463840oCE) this.LL.getExporterApi()).cancelCompile();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AudioRecordActivityViewModel@463c.realCompile$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
