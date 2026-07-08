package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0wgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.iap.service.IapServiceClass$subscriptionEntitlementPreCheck$1", f = "IapServiceClass.kt", l = {593}, m = "invokeSuspend")
public final class C1789930wgB extends C09AX implements Function1<InterfaceC1364105Vn<? super AbstractC1157840gEg<List<? extends C1789670wfl>>>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1789300wfA LLILLJJLI;
    public final /* synthetic */ C1789940wgC LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789930wgB(InterfaceC1789300wfA interfaceC1789300wfA, C1789940wgC c1789940wgC, InterfaceC1364105Vn<? super C1789930wgB> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1789300wfA;
        this.LLILLL = c1789940wgC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1789930wgB(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super AbstractC1157840gEg<List<? extends C1789670wfl>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1780720wRK enumC1780720wRK;
        Object objLIZIZ = obj;
        C1C7U.LIZ("IapServiceClass@66cd.subscriptionEntitlementPreCheck$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            InterfaceC1789300wfA interfaceC1789300wfA = this.LLILLJJLI;
            C1789940wgC c1789940wgC = this.LLILLL;
            long j = c1789940wgC.LIZ;
            String str = c1789940wgC.LIZIZ;
            String str2 = c1789940wgC.LIZLLL;
            long j2 = c1789940wgC.LJ;
            List<String> list = c1789940wgC.LIZJ;
            if (Intrinsics.LJFF(c1789940wgC.LJFF, "subs")) {
                enumC1780720wRK = EnumC1780720wRK.SUBSCRIPTION;
            } else {
                enumC1780720wRK = EnumC1780720wRK.INAPP;
            }
            C1789460wfQ c1789460wfQ = new C1789460wfQ(j, str, str2, j2, list, enumC1780720wRK);
            this.LL = 1;
            objLIZIZ = interfaceC1789300wfA.LIZIZ(c1789460wfQ, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("IapServiceClass@66cd.subscriptionEntitlementPreCheck$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IapServiceClass@66cd.subscriptionEntitlementPreCheck$1");
        return objLIZIZ;
    }
}
