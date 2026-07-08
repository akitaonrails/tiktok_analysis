package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelColumnView$startOverDialogShow$1$2$1$1$ret$1", f = "TTSPanelColumnView.kt", l = {}, m = "invokeSuspend")
public final class C1320105Ep extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public C1320105Ep(InterfaceC1364105Vn<? super C1320105Ep> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1320105Ep(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSPanelColumnView@49d6.startOverDialogShow$1$2$1$1$ret$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C05HM c05hm = C05HM.LIZIZ;
        int iLJJIJIL = c05hm.LJJIJIL();
        if (iLJJIJIL == 0) {
            iLJJIJIL = c05hm.LJJJ();
        }
        Integer numLJ = C2286608xc.LJ(iLJJIJIL);
        C1C7U.LIZIZ("TTSPanelColumnView@49d6.startOverDialogShow$1$2$1$1$ret$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return new C1320105Ep(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
