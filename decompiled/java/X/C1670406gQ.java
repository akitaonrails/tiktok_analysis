package X;

import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06gQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.analytics.IMB2CAnalytics$mobOrgAccountShow$1", f = "IMB2CAnalytics.kt", l = {95}, m = "invokeSuspend")
public final class C1670406gQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C909290Zln LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1670406gQ(C909290Zln c909290Zln, InterfaceC1364105Vn<? super C1670406gQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c909290Zln;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1670406gQ(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String enterFromForMob;
        String enterMethod;
        Map mapLJIIJ;
        String singleChatFromUserId;
        C1C7U.LIZ("IMB2CAnalytics@8870.mobOrgAccountShow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                mapLJIIJ = (Map) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Pair[] pairArr = new Pair[2];
            C909290Zln c909290Zln = this.LLILLL;
            String str = "";
            if (c909290Zln == null || (enterFromForMob = c909290Zln.getEnterFromForMob()) == null) {
                enterFromForMob = "";
            }
            pairArr[0] = new Pair("enter_from", enterFromForMob);
            C909290Zln c909290Zln2 = this.LLILLL;
            if (c909290Zln2 == null || (enterMethod = c909290Zln2.getEnterMethod()) == null) {
                enterMethod = "";
            }
            pairArr[1] = new Pair("enter_method", enterMethod);
            mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            IIMChatAnalytics.LIZ.getClass();
            IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
            if (iIMChatAnalyticsLIZ != null) {
                C909290Zln c909290Zln3 = this.LLILLL;
                if (c909290Zln3 != null && (singleChatFromUserId = c909290Zln3.getSingleChatFromUserId()) != null) {
                    str = singleChatFromUserId;
                }
                this.LL = mapLJIIJ;
                this.LLILLJJLI = 1;
                if (iIMChatAnalyticsLIZ.LJI(str, mapLJIIJ, this) == objLJFF) {
                    C1C7U.LIZIZ("IMB2CAnalytics@8870.mobOrgAccountShow$1");
                    return objLJFF;
                }
            }
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_profile_org_account_identifier_show", mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMB2CAnalytics@8870.mobOrgAccountShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
