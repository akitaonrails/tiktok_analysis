package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mjZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.channel.guitar.EffectGuitarHandler$handle$1", f = "EffectGuitarHandler.kt", l = {61}, m = "invokeSuspend")
public final class C1407630mjZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1407660mjc LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407630mjZ(C1407660mjc c1407660mjc, int i, InterfaceC1364105Vn<? super C1407630mjZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1407660mjc;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407630mjZ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EffectGuitarHandler@61e9.handle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C1407660mjc c1407660mjc = this.LLILLJJLI;
                int i2 = this.LLILLL;
                this.LL = 1;
                c1407660mjc.getClass();
                Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C1407710mjh(c1407660mjc, i2, null));
                if (objLJI != C099R.LJFF()) {
                    objLJI = Unit.LIZ;
                }
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("EffectGuitarHandler@61e9.handle$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1407660mjc c1407660mjc2 = this.LLILLJJLI;
            int i3 = this.LLILLL;
            c1407660mjc2.getClass();
            C201955140j.LJI("EffectGuitarHandler", e);
            C1411250mpP.LIZIZ(c1407660mjc2, i3, C786410Ut5.J3(C1407660mjc.LJ(0.0d, 0.0d, 3)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectGuitarHandler@61e9.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
