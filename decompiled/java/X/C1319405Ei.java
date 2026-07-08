package X;

import com.mammon.audiosdk.enums.SAMICoreVopState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Ei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantVoiceCloneView$initFragments$2$recordStopClick$1$bindVoiceRet$1", f = "InstantVoiceCloneView.kt", l = {}, m = "invokeSuspend")
public final class C1319405Ei extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public C1319405Ei(InterfaceC1364105Vn<? super C1319405Ei> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1319405Ei(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLJJIJL;
        C1C7U.LIZ("InstantVoiceCloneView@888c.initFragments$2$recordStopClick$1$bindVoiceRet$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C05HM c05hm = C05HM.LIZIZ;
        if (c05hm.getCurrentState() != SAMICoreVopState.COMPLETED.getValue()) {
            iLJJIJL = c05hm.LJJIJL();
        } else {
            iLJJIJL = 0;
        }
        Integer numLJ = C2286608xc.LJ(iLJJIJL);
        C1C7U.LIZIZ("InstantVoiceCloneView@888c.initFragments$2$recordStopClick$1$bindVoiceRet$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return new C1319405Ei(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
