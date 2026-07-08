package X;

import com.ss.android.ugc.aweme.inbox.bulletin.core.convert.model.SimpleBulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0OMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.core.service.BulletinBoardDataServiceImplInternal$saveBulletinBoardAccountInfo$2", f = "BulletinBoardDataServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C618080OMc extends C09AX implements Function1<InterfaceC1364105Vn<? super C618110OMf>, Object> {
    public final /* synthetic */ BulletinAccountInfoResponse LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C618080OMc(BulletinAccountInfoResponse bulletinAccountInfoResponse, InterfaceC1364105Vn<? super C618080OMc> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = bulletinAccountInfoResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C618080OMc(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C618110OMf> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardDataServiceImplInternal@8dc8.saveBulletinBoardAccountInfo$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BulletinAccountInfoResponse bulletinAccountInfoResponse = this.LL;
        C618110OMf c618110OMfLIZJ = C0OMZ.LIZJ(new SimpleBulletinBoardInfo(bulletinAccountInfoResponse.accountInfo, bulletinAccountInfoResponse.identity, bulletinAccountInfoResponse.subscriptionInfo, bulletinAccountInfoResponse.channelAccessControl, bulletinAccountInfoResponse.quickPostSettingList, bulletinAccountInfoResponse.plusPostSettingList, bulletinAccountInfoResponse.commentEnable));
        if (!C622190Oan.LJFF().LIZIZ().LIZ(c618110OMfLIZJ)) {
            c618110OMfLIZJ = null;
        }
        C1C7U.LIZIZ("BulletinBoardDataServiceImplInternal@8dc8.saveBulletinBoardAccountInfo$2");
        return c618110OMfLIZJ;
    }
}
