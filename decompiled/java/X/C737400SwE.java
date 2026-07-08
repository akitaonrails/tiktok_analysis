package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.nearby.feedcard.NearbyFeedCellAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.nearby.feedcard.NearbyFeedCellAssem$onLongClick$notInterestedAction$1$1", f = "NearbyFeedCellAssem.kt", l = {}, m = "invokeSuspend")
public final class C737400SwE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NearbyFeedCellAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C737400SwE(NearbyFeedCellAssem nearbyFeedCellAssem, InterfaceC1364105Vn<? super C737400SwE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nearbyFeedCellAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C737400SwE(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NearbyFeedCellAssem@191c.onLongClick$notInterestedAction$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int iLIZ = C737370SwB.LIZ("homepage_nearby");
        try {
            ShareDependService.LIZ.getClass();
            ShareDependServiceImpl.LJJJJI().LJJIIJ(iLIZ, ((C1204470hRt) C631370Opb.LIZ(this.LL)).LL, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("something was wrong when request dislike api, e=");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NearbyFeedCellAssem@191c.onLongClick$notInterestedAction$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
