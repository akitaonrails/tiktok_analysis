package X;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerActionSimulation$doAction$2", f = "StickerActionSimulation.kt", l = {55}, m = "invokeSuspend")
public final class C390940FUm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C390930FUl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C390940FUm(C390930FUl c390930FUl, InterfaceC1364105Vn<? super C390940FUm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c390930FUl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C390940FUm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerActionSimulation@6bca.doAction$2");
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
            this.LLILLJJLI.LIZIZ();
            this.LLILLJJLI.LIZJ();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("StickerActionSimulation@6bca.doAction$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LIZIZ();
        MotionEvent motionEventLIZJ = this.LLILLJJLI.LIZJ();
        if (motionEventLIZJ != null) {
            ((C0FUM) this.LLILLJJLI.LIZIZ.getValue()).LIZIZ(motionEventLIZJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerActionSimulation@6bca.doAction$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
