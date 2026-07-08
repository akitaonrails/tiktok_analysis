package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.ReflowSideProcessor$init$1", f = "ReflowSideProcessor.kt", l = {}, m = "invokeSuspend")
public final class C327420CsW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1234160iDm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327420CsW(C1234160iDm c1234160iDm, InterfaceC1364105Vn<? super C327420CsW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1234160iDm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327420CsW(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReflowSideProcessor@9181.init$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EventLiveData<FollowStatus> relationObservable = C1076010e6h.LIZJ.LIZIZ().getRelationObservable();
        final C1234160iDm c1234160iDm = this.LL;
        relationObservable.observeForever(new Observer() { // from class: X.0CsV
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj2) {
                C1234160iDm c1234160iDm2 = c1234160iDm;
                C23250099c.LIZLLL(c1234160iDm2.LIZ, C0PEM.LIZJ, null, new C327400CsU(c1234160iDm2, (FollowStatus) obj2, null), 2);
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReflowSideProcessor@9181.init$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
