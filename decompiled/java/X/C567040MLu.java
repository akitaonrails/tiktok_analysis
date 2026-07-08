package X;

import Y.AgS289S0100000_8;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MLu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.RecordStickerLogicComponent$onCreate$23", f = "RecordStickerLogicComponent.kt", l = {1843}, m = "invokeSuspend")
public final class C567040MLu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ l0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567040MLu(l0 l0Var, InterfaceC1364105Vn<? super C567040MLu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = l0Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567040MLu(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordStickerLogicComponent@6428.onCreate$23");
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
            C095D c095dLJJ = this.LLILLJJLI.C0().LJII().LJJ();
            AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(this.LLILLJJLI, 37);
            this.LL = 1;
            if (c095dLJJ.collect(agS289S0100000_8, this) == objLJFF) {
                C1C7U.LIZIZ("RecordStickerLogicComponent@6428.onCreate$23");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordStickerLogicComponent@6428.onCreate$23");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
