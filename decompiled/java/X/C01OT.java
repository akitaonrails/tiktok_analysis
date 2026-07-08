package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01OT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.util.RepostMobEvent$preloadRepostTab$1", f = "RepostMobEvent.kt", l = {}, m = "invokeSuspend")
public final class C01OT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01OT(boolean z, InterfaceC1364105Vn<? super C01OT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01OT(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostMobEvent@22f7.preloadRepostTab$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20684815ws.LJIJI("preload_repost_tab", new Pair(C2286608xc.LJ(this.LL ? 1 : 0), "my_profile"));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RepostMobEvent@22f7.preloadRepostTab$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
