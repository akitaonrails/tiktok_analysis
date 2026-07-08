package X;

import Y.AgS287S0100000_6;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.PopularStickerListManager$ensureFavStickerJob$1", f = "PopularStickerListManager.kt", l = {58}, m = "invokeSuspend")
public final class C450230Hl7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C452680Hp4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450230Hl7(C452680Hp4 c452680Hp4, InterfaceC1364105Vn<? super C450230Hl7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c452680Hp4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C450230Hl7(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PopularStickerListManager@7b34.ensureFavStickerJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C452680Hp4 c452680Hp4 = this.LLILLJJLI;
            InterfaceC450290HlD interfaceC450290HlD = c452680Hp4.LJII;
            if (interfaceC450290HlD == null) {
                synchronized (c452680Hp4) {
                    interfaceC450290HlD = c452680Hp4.LJII;
                    if (interfaceC450290HlD == null) {
                        interfaceC450290HlD = (InterfaceC450290HlD) C1807670x8n.LLLLLZ();
                        c452680Hp4.LJII = interfaceC450290HlD;
                    }
                }
            }
            C01S9<AbstractC450200Hl4> favouriteStickerUpdateFlow = interfaceC450290HlD.getFavouriteStickerUpdateFlow();
            if (favouriteStickerUpdateFlow != null) {
                AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 178);
                this.LL = 1;
                if (favouriteStickerUpdateFlow.collect(agS287S0100000_6, this) == objLJFF) {
                    C1C7U.LIZIZ("PopularStickerListManager@7b34.ensureFavStickerJob$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PopularStickerListManager@7b34.ensureFavStickerJob$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
