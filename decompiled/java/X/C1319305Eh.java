package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Eh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantVoiceCloneView$initFragments$2$recordStopClick$1$vopInfo$1", f = "InstantVoiceCloneView.kt", l = {}, m = "invokeSuspend")
public final class C1319305Eh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C05HK>, Object> {
    public C1319305Eh(InterfaceC1364105Vn<? super C1319305Eh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1319305Eh(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InstantVoiceCloneView@888c.initFragments$2$recordStopClick$1$vopInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C05HK speakerInfo = C05HM.LIZIZ.getSpeakerInfo();
        C1C7U.LIZIZ("InstantVoiceCloneView@888c.initFragments$2$recordStopClick$1$vopInfo$1");
        return speakerInfo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C05HK> interfaceC1364105Vn) {
        return new C1319305Eh(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
