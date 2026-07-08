package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05EV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantVoiceCloneView$initAgreeMentDetailPage$3$1", f = "InstantVoiceCloneView.kt", l = {337}, m = "invokeSuspend")
public final class C05EV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C11VM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05EV(C11VM c11vm, InterfaceC1364105Vn<? super C05EV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c11vm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05EV(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InstantVoiceCloneView@888c.initAgreeMentDetailPage$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C05EU c05eu = new C05EU(null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c05eu) == objLJFF) {
                C1C7U.LIZIZ("InstantVoiceCloneView@888c.initAgreeMentDetailPage$3$1");
                return objLJFF;
            }
        }
        C1749280vcc c1749280vcc = this.LLILLJJLI.LLJJJ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
        C11VM c11vm = this.LLILLJJLI;
        InterfaceC497601wk coroutineScope = c11vm.getCoroutineScope();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(coroutineScope, C2107308Nj.LIZ, null, new C05EY(c11vm, false, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InstantVoiceCloneView@888c.initAgreeMentDetailPage$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
