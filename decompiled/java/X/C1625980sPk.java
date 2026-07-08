package X;

import Y.AgS305S0100000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.whitelist.EffectWhitelistFuncExclusionComponent$onCreate$1", f = "EffectWhitelistFuncExclusionComponent.kt", l = {41}, m = "invokeSuspend")
public final class C1625980sPk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1624630sNZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1625980sPk(C1624630sNZ c1624630sNZ, InterfaceC1364105Vn<? super C1625980sPk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1624630sNZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1625980sPk(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectWhitelistFuncExclusionComponent@a47d.onCreate$1");
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
            C095D c095dLJJ = this.LLILLJJLI.getStickerApiComponent().C0().LJII().LJJ();
            AgS305S0100000_25 agS305S0100000_25 = new AgS305S0100000_25(this.LLILLJJLI, 19);
            this.LL = 1;
            if (c095dLJJ.collect(agS305S0100000_25, this) == objLJFF) {
                C1C7U.LIZIZ("EffectWhitelistFuncExclusionComponent@a47d.onCreate$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectWhitelistFuncExclusionComponent@a47d.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
