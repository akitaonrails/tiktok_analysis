package X;

import Y.AgS286S0100000_5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EkK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout.canvas.CutoutCanvasApiCoordinator$showStopCutoutDialog$1$2", f = "CutoutCanvasApiCoordinator.kt", l = {227}, m = "invokeSuspend")
public final class C373300EkK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C373060Ejw LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C373300EkK(C373060Ejw c373060Ejw, InterfaceC1364105Vn<? super C373300EkK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c373060Ejw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C373300EkK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05YD<Boolean> c05ydOF2;
        C1C7U.LIZ("CutoutCanvasApiCoordinator@26d7.showStopCutoutDialog$1$2");
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
            InterfaceC373870ElF interfaceC373870ElFI3 = this.LLILLJJLI.i3();
            if (interfaceC373870ElFI3 != null && (c05ydOF2 = interfaceC373870ElFI3.OF2()) != null) {
                C20099713kh c20099713khLJJIJL = C09IC.LJJIJL(new C0FXA(c05ydOF2, 4), 1);
                AgS286S0100000_5 agS286S0100000_5 = new AgS286S0100000_5(this.LLILLJJLI, 8);
                this.LL = 1;
                if (c20099713khLJJIJL.collect(agS286S0100000_5, this) == objLJFF) {
                    C1C7U.LIZIZ("CutoutCanvasApiCoordinator@26d7.showStopCutoutDialog$1$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CutoutCanvasApiCoordinator@26d7.showStopCutoutDialog$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
