package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.relation.model.MaFListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.feed.TTBigCardFYPInsertManager$parseBigCardAweme$2", f = "TTBigCardFYPInsertManager.kt", l = {}, m = "invokeSuspend")
public final class C1007280cJq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MaFListResponse>, Object> {
    public final /* synthetic */ Aweme LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007280cJq(Aweme aweme, InterfaceC1364105Vn<? super C1007280cJq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007280cJq(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String cardInsertStatus;
        C1C7U.LIZ("TTBigCardFYPInsertManager@d115.parseBigCardAweme$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MaFListResponse maFListResponse = null;
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            CardInsertInfo cardInsertInfo = this.LL.getCardInsertInfo();
            if (cardInsertInfo != null) {
                cardInsertStatus = cardInsertInfo.getCardInsertStatus();
            } else {
                cardInsertStatus = null;
            }
            c1227904rF.getClass();
            MaFListResponse maFListResponse2 = (MaFListResponse) C1227904rF.LIZIZ(cardInsertStatus, MaFListResponse.class);
            C2174581A8q.LIZ.getClass();
            C1910890zpH c1910890zpHLJIIJ = C2174581A8q.LJIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parse big card response success: ");
            sbLIZ.append(maFListResponse2);
            c1910890zpHLJIIJ.LIZ("fcp_insert_manager", C2188811AlT.LIZIZ(sbLIZ));
            maFListResponse = maFListResponse2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2174581A8q.LIZ.getClass();
            C1910890zpH c1910890zpHLJIIJ2 = C2174581A8q.LJIIJ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("parse big card response fail: ");
            sbLIZ2.append(e.getMessage());
            c1910890zpHLJIIJ2.LIZ("fcp_insert_manager", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1C7U.LIZIZ("TTBigCardFYPInsertManager@d115.parseBigCardAweme$2");
        return maFListResponse;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MaFListResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
