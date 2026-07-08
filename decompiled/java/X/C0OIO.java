package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS10S0300100_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OIO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$closeBulletin$1", f = "BulletinProfileViewModel.kt", l = {1561}, m = "invokeSuspend")
public final class C0OIO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinProfileViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OIO(BulletinProfileViewModel bulletinProfileViewModel, long j, InterfaceC1364105Vn<? super C0OIO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinProfileViewModel;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OIO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BulletinShareModel bulletinShareModelLIZ;
        C0OI4 c0oi4;
        Long l;
        Object objA0 = obj;
        C1C7U.LIZ("BulletinProfileViewModel@3b06.closeBulletin$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objA0);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objA0);
            this.LLILLJJLI.setState(AFwS240S0000000_9.get$arr$(353));
            C0OIU c0oiu = (C0OIU) this.LLILLJJLI.DQ2().getOperator();
            long j = this.LLILLL;
            this.LL = 1;
            objA0 = c0oiu.A0(j, this);
            if (objA0 == objLJFF) {
                C1C7U.LIZIZ("BulletinProfileViewModel@3b06.closeBulletin$1");
                return objLJFF;
            }
        }
        BulletinAccountEditResponse bulletinAccountEditResponse = (BulletinAccountEditResponse) objA0;
        if (bulletinAccountEditResponse != null && bulletinAccountEditResponse.statusCode == 0) {
            BulletinBoardInfo bulletinBoardInfo = bulletinAccountEditResponse.accountInfo;
            if (bulletinBoardInfo != null) {
                BulletinProfileViewModel bulletinProfileViewModel = this.LLILLJJLI;
                long j2 = this.LLILLL;
                bulletinProfileViewModel.ZQ2(bulletinBoardInfo);
                BulletinBoardInfo bulletinBoardInfo2 = bulletinAccountEditResponse.accountInfo;
                if (bulletinBoardInfo2 != null && (l = bulletinProfileViewModel.LLILLJJLI) != null) {
                    bulletinProfileViewModel.setState(new AwS10S0300100_9(bulletinProfileViewModel, l.longValue(), bulletinAccountEditResponse, bulletinBoardInfo2, 3));
                }
                Integer num = bulletinBoardInfo.status;
                if (num != null) {
                    int iIntValue = num.intValue();
                    IBulletinBoardDataService iBulletinBoardDataService = (IBulletinBoardDataService) PluggableExtentionKt.pluggableSpi$default(IBulletinBoardDataService.class, false, false, false, 14, null);
                    if (iBulletinBoardDataService != null) {
                        iBulletinBoardDataService.LJIIIIZZ(iIntValue, String.valueOf(j2));
                    }
                }
                BulletinShareModel bulletinShareModel = bulletinProfileViewModel.getState().LLILZ;
                if (bulletinShareModel != null) {
                    bulletinShareModelLIZ = BulletinShareModel.LIZ(bulletinShareModel, bulletinBoardInfo);
                } else {
                    bulletinShareModelLIZ = null;
                }
                if (bulletinProfileViewModel.FQ2()) {
                    if (bulletinShareModelLIZ != null && (c0oi4 = bulletinProfileViewModel.LLJLILLLLZIIL) != null) {
                        c0oi4.LJFF(new AwS588S0100000_9(bulletinShareModelLIZ, 217));
                    }
                    bulletinProfileViewModel.setState(AFwS240S0000000_9.get$arr$(354));
                } else {
                    bulletinProfileViewModel.setState(new AwS588S0100000_9(bulletinShareModelLIZ, 218));
                }
            }
        } else {
            this.LLILLJJLI.setState(new AwS588S0100000_9(bulletinAccountEditResponse, 219));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.closeBulletin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
