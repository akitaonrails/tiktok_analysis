package X;

import Y.AgS289S0100000_8;
import com.ss.android.ugc.aweme.social.DMPlaygroundTopTabScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.DMPlaygroundTopTabScene$onViewCreated$1", f = "DMPlaygroundTopTabScene.kt", l = {58}, m = "invokeSuspend")
public final class C540860LJc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DMPlaygroundTopTabScene LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540860LJc(DMPlaygroundTopTabScene dMPlaygroundTopTabScene, InterfaceC1364105Vn<? super C540860LJc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dMPlaygroundTopTabScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C540860LJc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMPlaygroundTopTabScene@6811.onViewCreated$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            DMPlaygroundTopTabScene dMPlaygroundTopTabScene = this.LLILLJJLI;
            C05YD<AbstractC540910LJh> c05yd = dMPlaygroundTopTabScene.LLJIJIL;
            AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(dMPlaygroundTopTabScene, 26);
            this.LL = 1;
            if (c05yd.collect(agS289S0100000_8, this) == objLJFF) {
                C1C7U.LIZIZ("DMPlaygroundTopTabScene@6811.onViewCreated$1");
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
