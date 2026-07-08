package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Ek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantVoiceCloneView$initFragments$2$recordStopClick$1$1", f = "InstantVoiceCloneView.kt", l = {}, m = "invokeSuspend")
public final class C1319605Ek extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public C1319605Ek(InterfaceC1364105Vn<? super C1319605Ek> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1319605Ek(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InstantVoiceCloneView@888c.initFragments$2$recordStopClick$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer numLJ = C2286608xc.LJ(C05HM.LIZIZ.LJJIJIL());
        C1C7U.LIZIZ("InstantVoiceCloneView@888c.initFragments$2$recordStopClick$1$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return new C1319605Ek(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
