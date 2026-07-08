package X;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0942, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3Adapter$1", f = "SearchCSIProfileBannerRepoFactory.kt", l = {67}, m = "invokeSuspend")
public final class AnonymousClass0942 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2193201AsY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0942(C2193201AsY c2193201AsY, InterfaceC1364105Vn<? super AnonymousClass0942> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2193201AsY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0942(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCSIProfileBannerRepoV3Adapter@de2f.<init>$1");
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
            if (C2252671DEz.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3Adapter@de2f.<init>$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.LIZIZ.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3Adapter@de2f.<init>$1");
            return unit;
        }
        this.LLILLJJLI.LIZJ.initialize();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3Adapter@de2f.<init>$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
