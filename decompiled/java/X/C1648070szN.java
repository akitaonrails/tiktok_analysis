package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import pyl.q;

/* JADX INFO: renamed from: X.0szN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.EffectCameraFlipComponent$flip$1", f = "EffectCameraFlipComponent.kt", l = {}, m = "invokeSuspend")
public final class C1648070szN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ q LL;
    public final /* synthetic */ C1648060szM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1648070szN(q qVar, C1648060szM c1648060szM, InterfaceC1364105Vn<? super C1648070szN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = qVar;
        this.LLILLJJLI = c1648060szM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1648070szN(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectCameraFlipComponent@3b74.flip$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LIZ != this.LLILLJJLI.o2().Ue()) {
            this.LLILLJJLI.o2().cd0(this.LL, null, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectCameraFlipComponent@3b74.flip$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
