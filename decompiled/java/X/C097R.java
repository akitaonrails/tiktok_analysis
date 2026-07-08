package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryAdInfo;
import com.ss.android.ugc.aweme.history.model.IabHistorySaveDetail;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.097R, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryNewDataHolder$saveSingleHistoryOnCurrentAd$1", f = "AdWebHistoryNewDataHolder.kt", l = {}, m = "invokeSuspend")
public final class C097R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2452409jG LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C097R(C2452409jG c2452409jG, InterfaceC1364105Vn<? super C097R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2452409jG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C097R(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        C1C7U.LIZ("AdWebHistoryNewDataHolder@6fdf.saveSingleHistoryOnCurrentAd$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2452409jG c2452409jG = this.LL;
        c2452409jG.getClass();
        try {
            AdWebHistoryAdInfo adWebHistoryAdInfo = c2452409jG.LIZLLL;
            if (adWebHistoryAdInfo != null) {
                str = adWebHistoryAdInfo.awemeId;
            } else {
                str = null;
            }
            C0VSJ c0vsjLIZLLL = c2452409jG.LIZLLL(str);
            C1227904rF c1227904rF = C1227904rF.LIZ;
            List<IabHistorySaveDetail> list = c2452409jG.LIZIZ;
            c1227904rF.getClass();
            String strLJI = C1227904rF.LJI(list);
            if (strLJI != null) {
                AnonymousClass0935.LIZIZ(c0vsjLIZLLL, strLJI);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Saved adWebHistorySessionList to disk at ");
            sbLIZ.append(c0vsjLIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c2452409jG.LJ(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdWebHistoryNewDataHolder@6fdf.saveSingleHistoryOnCurrentAd$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
