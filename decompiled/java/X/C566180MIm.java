package X;

import Y.AgS289S0100000_8;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MIm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aiselfeffect.AiMeOverlayLoadComponent$showProgressScene$2$1", f = "AiMeOverlayLoadComponent.kt", l = {67}, m = "invokeSuspend")
public final class C566180MIm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C566170MIl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566180MIm(C566170MIl c566170MIl, InterfaceC1364105Vn<? super C566180MIm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c566170MIl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C566180MIm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252331DDr c2252331DDrLIZIZ;
        C1C7U.LIZ("AiMeOverlayLoadComponent@48ac.showProgressScene$2$1");
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
            InterfaceC566190MIn interfaceC566190MIn = this.LLILLJJLI.LLILLJJLI;
            if (interfaceC566190MIn != null && (c2252331DDrLIZIZ = interfaceC566190MIn.LIZIZ()) != null) {
                AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(this.LLILLJJLI, 21);
                this.LL = 1;
                if (C2252331DDr.LJIIJ(c2252331DDrLIZIZ, agS289S0100000_8, this) == objLJFF) {
                    C1C7U.LIZIZ("AiMeOverlayLoadComponent@48ac.showProgressScene$2$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiMeOverlayLoadComponent@48ac.showProgressScene$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
