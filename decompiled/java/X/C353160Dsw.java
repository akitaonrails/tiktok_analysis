package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dsw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audio.copyrightdetect.EditAudioCopyrightDetectComponent$onCreate$1$1$3$1", f = "EditAudioCopyrightDetectComponent.kt", l = {}, m = "invokeSuspend")
public final class C353160Dsw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353160Dsw(boolean z, InterfaceC1364105Vn<? super C353160Dsw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353160Dsw(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditAudioCopyrightDetectComponent@e8b5.onCreate$1$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = C856830XjN.LIZ;
        C856830XjN.LIZIZ = this.LL;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditAudioCopyrightDetectComponent@e8b5.onCreate$1$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
