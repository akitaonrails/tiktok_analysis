package X;

import Y.AgS199S0200000_8;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KkP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedALSController$setVideoImageMixedConfig$2", f = "VideoImageMixedALSController.kt", l = {113}, m = "invokeSuspend")
public final class C526230KkP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C525860Kjo LLILLJJLI;
    public final /* synthetic */ C522090Kdj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526230KkP(C525860Kjo c525860Kjo, C522090Kdj c522090Kdj, InterfaceC1364105Vn<? super C526230KkP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c525860Kjo;
        this.LLILLL = c522090Kdj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526230KkP(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoImageMixedALSController@1673.setVideoImageMixedConfig$2");
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
            InterfaceC346201Wa<InterfaceC525940Kjw> interfaceC346201WaT00 = this.LLILLJJLI.LJJJ().T00();
            AgS199S0200000_8 agS199S0200000_8 = new AgS199S0200000_8(this.LLILLJJLI, this.LLILLL, 10);
            this.LL = 1;
            if (interfaceC346201WaT00.collect(agS199S0200000_8, this) == objLJFF) {
                C1C7U.LIZIZ("VideoImageMixedALSController@1673.setVideoImageMixedConfig$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoImageMixedALSController@1673.setVideoImageMixedConfig$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
