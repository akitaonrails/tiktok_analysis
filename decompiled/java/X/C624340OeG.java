package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInvitationResponse;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.view.guidepush.BulletinBoardGuideBannerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OeG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.view.guidepush.BulletinBoardGuideBannerAssem$onCreate$1", f = "BulletinBoardGuideBannerAssem.kt", l = {94}, m = "invokeSuspend")
public final class C624340OeG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinBoardGuideBannerAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C624340OeG(BulletinBoardGuideBannerAssem bulletinBoardGuideBannerAssem, String str, InterfaceC1364105Vn<? super C624340OeG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinBoardGuideBannerAssem;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C624340OeG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C624310OeD c624310OeD;
        C1C7U.LIZ("BulletinBoardGuideBannerAssem@1482.onCreate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                NotificationApi.Api apiLIZ = NotificationApi.LIZ();
                this.LL = 1;
                obj = apiLIZ.LJJJ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BulletinBoardGuideBannerAssem@1482.onCreate$1");
                    return objLJFF;
                }
            }
            BulletinAccountInvitationResponse bulletinAccountInvitationResponse = (BulletinAccountInvitationResponse) obj;
            if (bulletinAccountInvitationResponse.status_code == 0) {
                c624310OeD = new C624310OeD(bulletinAccountInvitationResponse.getTitle(), bulletinAccountInvitationResponse.getText(), bulletinAccountInvitationResponse.getSchemaUrl(), bulletinAccountInvitationResponse.getAvatar(), bulletinAccountInvitationResponse.getCreatorTypeStr(), 4);
            } else {
                c624310OeD = new C624310OeD(0);
            }
            this.LLILLJJLI.so(true, this.LLILLL, c624310OeD);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchBulletinAccountInvitation failed with exception: ");
            sbLIZ.append(e);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLJJLI.so(true, this.LLILLL, new C624310OeD(0));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinBoardGuideBannerAssem@1482.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
