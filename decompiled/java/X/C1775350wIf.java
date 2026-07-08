package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.player.video.EcVideoView$playReal$2", f = "EcVideoView.kt", l = {307}, m = "invokeSuspend")
public final class C1775350wIf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1775290wIZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775350wIf(C1775290wIZ c1775290wIZ, InterfaceC1364105Vn<? super C1775350wIf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1775290wIZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1775350wIf(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIIIIZZ;
        C1C7U.LIZ("EcVideoView@8143.playReal$2");
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
            C1775280wIY c1775280wIY = this.LLILLJJLI.LLLFFI;
            if (c1775280wIY != null) {
                EnumC1775210wIR enumC1775210wIR = EnumC1775210wIR.EMIT_PLAY;
                this.LL = 1;
                AbstractC1775220wIS abstractC1775220wIS = c1775280wIY.LIZ;
                if (abstractC1775220wIS == null || (objLJIIIIZZ = AbstractC1775220wIS.LJIIIIZZ(abstractC1775220wIS, enumC1775210wIR, this)) != C099R.LJFF()) {
                    objLJIIIIZZ = Unit.LIZ;
                }
                if (objLJIIIIZZ == objLJFF) {
                    C1C7U.LIZIZ("EcVideoView@8143.playReal$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcVideoView@8143.playReal$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
