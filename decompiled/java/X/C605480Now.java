package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0Now, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$updatePageBarEntrance$1", f = "BulletinProfileViewModel.kt", l = {944}, m = "invokeSuspend")
public final class C605480Now extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinProfileViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605480Now(BulletinProfileViewModel bulletinProfileViewModel, long j, InterfaceC1364105Vn<? super C605480Now> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinProfileViewModel;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605480Now(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinProfileViewModel@3b06.updatePageBarEntrance$1");
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
            C0OIU c0oiu = (C0OIU) this.LLILLJJLI.DQ2().getOperator();
            long j = this.LLILLL;
            int type = EnumC605370Nol.ACCOUNT_INFO_LOAD_BAR_ENTRANCE.getType();
            BulletinProfileViewModel bulletinProfileViewModel = this.LLILLJJLI;
            String str = bulletinProfileViewModel.LLILLL;
            String str2 = bulletinProfileViewModel.LLILZ;
            this.LL = 1;
            obj = c0oiu.LJJLIIIJLLLLLLLZ(j, type, str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinProfileViewModel@3b06.updatePageBarEntrance$1");
                return objLJFF;
            }
        }
        BulletinAccountInfoResponse bulletinAccountInfoResponse = (BulletinAccountInfoResponse) obj;
        if (bulletinAccountInfoResponse != null && bulletinAccountInfoResponse.statusCode == 0) {
            this.LLILLJJLI.setState(new AwS588S0100000_9(bulletinAccountInfoResponse, 531));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.updatePageBarEntrance$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
