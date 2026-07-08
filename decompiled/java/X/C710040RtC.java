package X;

import Y.AgS292S0100000_11;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.BioTranslationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.BioTranslationViewModel$onPrepared$1", f = "BioTranslationViewModel.kt", l = {45}, m = "invokeSuspend")
public final class C710040RtC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BioTranslationViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710040RtC(BioTranslationViewModel bioTranslationViewModel, InterfaceC1364105Vn<? super C710040RtC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bioTranslationViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C710040RtC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BioTranslationViewModel@f1b4.onPrepared$1");
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
            InterfaceC346201Wa<String> interfaceC346201WaLJJJJJ = C161N.LIZIZ.LJJJJJ();
            AgS292S0100000_11 agS292S0100000_11 = new AgS292S0100000_11(this.LLILLJJLI, 14);
            this.LL = 1;
            if (interfaceC346201WaLJJJJJ.collect(agS292S0100000_11, this) == objLJFF) {
                C1C7U.LIZIZ("BioTranslationViewModel@f1b4.onPrepared$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BioTranslationViewModel@f1b4.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
