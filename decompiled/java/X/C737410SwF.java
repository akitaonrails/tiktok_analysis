package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SwF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.assem.ExploreFeedComponent$onLongPressCell$notInterested$1$1", f = "ExploreFeedComponent.kt", l = {}, m = "invokeSuspend")
public final class C737410SwF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20526015Tm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C737410SwF(C20526015Tm c20526015Tm, InterfaceC1364105Vn<? super C737410SwF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20526015Tm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C737410SwF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreFeedComponent@39dc.onLongPressCell$notInterested$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int iLIZ = C737370SwB.LIZ("homepage_explore");
        try {
            ShareDependService.LIZ.getClass();
            ShareDependServiceImpl.LJJJJI().LJJIIJ(iLIZ, this.LL.LL, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreFeedComponent@39dc.onLongPressCell$notInterested$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
