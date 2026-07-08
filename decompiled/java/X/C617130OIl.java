package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCloseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0OIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$deleteBulletin$1", f = "BulletinProfileViewModel.kt", l = {1602}, m = "invokeSuspend")
public final class C617130OIl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinProfileViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C617130OIl(BulletinProfileViewModel bulletinProfileViewModel, long j, InterfaceC1364105Vn<? super C617130OIl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinProfileViewModel;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C617130OIl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BulletinProfileViewModel@3b06.deleteBulletin$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.setState(AFwS240S0000000_9.get$arr$(355));
            C0OIU c0oiu = (C0OIU) this.LLILLJJLI.DQ2().getOperator();
            long j = this.LLILLL;
            this.LL = 1;
            obj = c0oiu.LLJJJIL(j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinProfileViewModel@3b06.deleteBulletin$1");
                return objLJFF;
            }
        }
        BulletinCloseResponse bulletinCloseResponse = (BulletinCloseResponse) obj;
        if (bulletinCloseResponse != null) {
            str = bulletinCloseResponse.message;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "success")) {
            this.LLILLJJLI.setState(AFwS240S0000000_9.get$arr$(356));
            IBulletinBoardDataService iBulletinBoardDataService = (IBulletinBoardDataService) PluggableExtentionKt.pluggableSpi$default(IBulletinBoardDataService.class, false, false, false, 14, null);
            if (iBulletinBoardDataService != null) {
                iBulletinBoardDataService.LJI(String.valueOf(this.LLILLL));
            }
        } else {
            this.LLILLJJLI.setState(new AwS588S0100000_9(bulletinCloseResponse, 220));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.deleteBulletin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
