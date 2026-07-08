package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.services.animation.MockAnimationServiceImpl$triggerMockAnimationWithDelay$1", f = "MockAnimationServiceImpl.kt", l = {117}, m = "invokeSuspend")
public final class C1702940uPs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1702970uPv LLILLJJLI;
    public final /* synthetic */ C1842380y2m LLILLL;
    public final /* synthetic */ C0N5A LLILZ;
    public final /* synthetic */ InterfaceC1702950uPt LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702940uPs(InterfaceC1702970uPv interfaceC1702970uPv, C1842380y2m c1842380y2m, C0N5A c0n5a, InterfaceC1702950uPt interfaceC1702950uPt, InterfaceC1364105Vn<? super C1702940uPs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1702970uPv;
        this.LLILLL = c1842380y2m;
        this.LLILZ = c0n5a;
        this.LLILZIL = interfaceC1702950uPt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702940uPs(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MockAnimationServiceImpl@3f3a.triggerMockAnimationWithDelay$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("MockAnimationServiceImpl@3f3a.triggerMockAnimationWithDelay$1");
                return objLJFF;
            }
        }
        C1842380y2m c1842380y2mLIZ = this.LLILLJJLI.LIZ(this.LLILLL);
        if (c1842380y2mLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Mock entrance data created and callback invoked for scenario: ");
            sbLIZ.append(this.LLILZ.name());
            C20441214yg.LIZIZ("MockAnimationServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILZIL.LLLFF(c1842380y2mLIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MockAnimationServiceImpl@3f3a.triggerMockAnimationWithDelay$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
