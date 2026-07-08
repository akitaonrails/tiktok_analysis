package X;

import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem.SubSpaceFeedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0K33, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem.SubSpaceFeedAssem$observeSubscriptionStatusChanges$1", f = "SubSpaceFeedAssem.kt", l = {}, m = "invokeSuspend")
public final class C0K33 extends C09AX implements Function2<C512130K6p, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SubSpaceFeedAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K33(SubSpaceFeedAssem subSpaceFeedAssem, InterfaceC1364105Vn<? super C0K33> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = subSpaceFeedAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0K33(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubSpaceFeedAssem@ef67.observeSubscriptionStatusChanges$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C511370K3r c511370K3rIp = this.LL.ip();
        if (c511370K3rIp != null) {
            c511370K3rIp.LLJILLL = false;
        }
        this.LL.hp();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubSpaceFeedAssem@ef67.observeSubscriptionStatusChanges$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C512130K6p c512130K6p, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c512130K6p, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
