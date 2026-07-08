package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05RR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.professional.ProfessionalInboxManager$onUserUpdateEvent$1", f = "ProfessionalInboxManager.kt", l = {189, 193}, m = "invokeSuspend")
public final class C05RR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1434905jX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05RR(C1434905jX c1434905jX, InterfaceC1364105Vn<? super C05RR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1434905jX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05RR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        C1C7U.LIZ("ProfessionalInboxManager@ef99.onUserUpdateEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ProfessionalInboxManager@ef99.onUserUpdateEvent$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            IMUser iMUser = this.LLILLJJLI.LIZJ;
            this.LL = 1;
            obj = c1bgsLJ.LJIILJJIL(iMUser, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ProfessionalInboxManager@ef99.onUserUpdateEvent$1");
                return objLJFF;
            }
        }
        IMUser iMUser2 = (IMUser) obj;
        if (iMUser2 != null && (imUserBizInfo = iMUser2.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null && (num = userB2CAccountInfo.inboxMode) != null) {
            C1434905jX c1434905jX = this.LLILLJJLI;
            int iIntValue = num.intValue();
            if (iIntValue != 0) {
                C889930Yvf.LIZ.getClass();
                Keva repo = Keva.getRepo("ProfessionalInboxManager");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("user_inbox_mode_value_for:");
                sbLIZ.append(c1434905jX.LIZ);
                repo.storeInt(C2188811AlT.LIZIZ(sbLIZ), iIntValue);
            }
        } else {
            num = null;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C05RS c05rs = new C05RS(num, iMUser2, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c05rs) == objLJFF) {
            C1C7U.LIZIZ("ProfessionalInboxManager@ef99.onUserUpdateEvent$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfessionalInboxManager@ef99.onUserUpdateEvent$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
