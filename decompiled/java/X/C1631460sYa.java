package X;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import njp.a;

/* JADX INFO: renamed from: X.0sYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.childeffectpanel.ChildEffectButtonComponent$onCreate$2$1", f = "ChildEffectButtonComponent.kt", l = {96}, m = "invokeSuspend")
public final class C1631460sYa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1631480sYc LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631460sYa(C1631480sYc c1631480sYc, InterfaceC1364105Vn<? super C1631460sYa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1631480sYc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1631460sYa(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951LJJIJIL;
        InterfaceC346201Wa c1698260uIK;
        C385670FAf<Boolean> c385670FAfA3;
        C1C7U.LIZ("ChildEffectButtonComponent@45ab.onCreate$2$1");
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
            InterfaceC346201Wa interfaceC346201WaAsFlow = FlowLiveDataConversions.asFlow(this.LLILLJJLI.nq().C0().LJII().LJIJJLI());
            InterfaceC577400Mkk interfaceC577400MkkW2 = this.LLILLJJLI.w2();
            if (interfaceC577400MkkW2 != null && (c385670FAfA3 = interfaceC577400MkkW2.A3()) != null) {
                anonymousClass0951LJJIJIL = C09IC.LJJIJIL(C540970LJn.LIZ(c385670FAfA3), LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI), C1370905Yd.LIZ(C05YW.LIZ, 0L, 3), c385670FAfA3.LIZJ());
            } else {
                anonymousClass0951LJJIJIL = null;
            }
            AFwS266S0000000_25 aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(299);
            AFwS311S0000000_25 aFwS311S0000000_25 = AFwS311S0000000_25.get$arr$(30);
            if (anonymousClass0951LJJIJIL != null) {
                c1698260uIK = new C414301jJ(interfaceC346201WaAsFlow, anonymousClass0951LJJIJIL, new C0ON2(aFwS311S0000000_25));
            } else {
                c1698260uIK = new C1698260uIK(interfaceC346201WaAsFlow, aFwS266S0000000_25, 9);
            }
            C1631450sYZ c1631450sYZ = new C1631450sYZ(this.LLILLJJLI, null);
            this.LL = 1;
            if (C09IC.LJII(c1698260uIK, this, c1631450sYZ) == objLJFF) {
                C1C7U.LIZIZ("ChildEffectButtonComponent@45ab.onCreate$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChildEffectButtonComponent@45ab.onCreate$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
