package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Eo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantVoiceCloneView$initFragments$2$useVoiceClick$1$ret$1", f = "InstantVoiceCloneView.kt", l = {}, m = "invokeSuspend")
public final class C1320005Eo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ C11VM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1320005Eo(C11VM c11vm, InterfaceC1364105Vn<? super C1320005Eo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c11vm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1320005Eo(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InstantVoiceCloneView@888c.initFragments$2$useVoiceClick$1$ret$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int iLJJIJL = C05HM.LIZIZ.LJJIJL();
        if (this.LL.LIZLLL()) {
            this.LL.getVopInstantCloneCameraService().stopAudition();
        }
        Integer numLJ = C2286608xc.LJ(iLJJIJL);
        C1C7U.LIZIZ("InstantVoiceCloneView@888c.initFragments$2$useVoiceClick$1$ret$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
