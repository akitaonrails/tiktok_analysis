package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MoG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.servicimpl.LighteningGoNextAction$startPhotoProcess$3", f = "LighteningGoNextAction.kt", l = {827}, m = "invokeSuspend")
public final class C579580MoG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C579550MoD LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C579580MoG(C579550MoD c579550MoD, InterfaceC1364105Vn<? super C579580MoG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c579550MoD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C579580MoG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LighteningGoNextAction@4c30.startPhotoProcess$3");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("LighteningGoNextAction@4c30.startPhotoProcess$3");
                return objLJFF;
            }
        }
        if (!this.LLILLJJLI.LJIIZILJ) {
            C579550MoD c579550MoD = this.LLILLJJLI;
            c579550MoD.LJIILJJIL.LIZ(AFwS194S0000000_8.get$arr$(647), new AwS587S0100000_8(c579550MoD, 788), c579550MoD.LJIILLIIL);
            this.LLILLJJLI.LJIIZILJ = true;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LighteningGoNextAction@4c30.startPhotoProcess$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
