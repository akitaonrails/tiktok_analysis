package X;

import Y.AgS199S0200000_8;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MJH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineEffectHandler$useSticker$4", f = "AIGCOfflineEffectHandler.kt", l = {298}, m = "invokeSuspend")
public final class C0MJH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C578910MnB LLILLJJLI;
    public final /* synthetic */ C1627370sRz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MJH(C578910MnB c578910MnB, C1627370sRz c1627370sRz, InterfaceC1364105Vn<? super C0MJH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c578910MnB;
        this.LLILLL = c1627370sRz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MJH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOfflineEffectHandler@7df1.useSticker$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C01S9<Pair<Boolean, Boolean>> c01s9Yh1 = this.LLILLJJLI.LLIZLLLIL.yh1();
            AgS199S0200000_8 agS199S0200000_8 = new AgS199S0200000_8(this.LLILLJJLI, this.LLILLL, 14);
            this.LL = 1;
            if (c01s9Yh1.collect(agS199S0200000_8, this) == objLJFF) {
                C1C7U.LIZIZ("AIGCOfflineEffectHandler@7df1.useSticker$4");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
