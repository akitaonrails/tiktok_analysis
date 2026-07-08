package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0Vhv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cache.FollowingFeedAssem$listener$2$1$onStateChange$3", f = "FollowingFeedAssem.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C804970Vhv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C804970Vhv(InterfaceC1364105Vn<? super C804970Vhv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C804970Vhv(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$3");
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
            long jIntValue = ((Number) C2277061EAu.LIZJ.getValue()).intValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jIntValue, this) == objLJFF) {
                C1C7U.LIZIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$3");
                return objLJFF;
            }
        }
        C804900Vho.LIZ.getClass();
        C804920Vhq c804920Vhq = new C804920Vhq();
        C804940Vhs c804940Vhs = new C804940Vhs();
        if (!C804900Vho.LIZLLL()) {
            C2252408s6.LIZ(new C804980Vhw(c804940Vhs));
        } else {
            C2252408s6.LIZ(new AwS557S0100000_13(c804920Vhq, 188));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C804970Vhv(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
