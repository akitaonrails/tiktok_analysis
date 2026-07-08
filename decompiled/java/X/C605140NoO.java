package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NoO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$getBulletinBoardAccountInfo$2", f = "BulletinProfileViewModel.kt", l = {763, 763}, m = "invokeSuspend")
public final class C605140NoO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ BulletinProfileViewModel LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605140NoO(BulletinProfileViewModel bulletinProfileViewModel, long j, InterfaceC1364105Vn<? super C605140NoO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = bulletinProfileViewModel;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C605140NoO c605140NoO = new C605140NoO(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c605140NoO.LLILLL = obj;
        return c605140NoO;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0957 anonymousClass0957LIZIZ;
        BulletinProfileViewModel bulletinProfileViewModel;
        BulletinAccountInfoResponse bulletinAccountInfoResponse;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("BulletinProfileViewModel@3b06.getBulletinBoardAccountInfo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    bulletinAccountInfoResponse = (BulletinAccountInfoResponse) this.LL;
                    bulletinProfileViewModel = (BulletinProfileViewModel) this.LLILLL;
                    C155000ia.LIZIZ(objLJLIIIL);
                    bulletinProfileViewModel.LQ2(bulletinAccountInfoResponse, (BulletinSettingList) objLJLIIIL, this.LLILZIL, false);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BulletinProfileViewModel@3b06.getBulletinBoardAccountInfo$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bulletinProfileViewModel = (BulletinProfileViewModel) this.LL;
            anonymousClass0957LIZIZ = (AnonymousClass0957) this.LLILLL;
            C155000ia.LIZIZ(objLJLIIIL);
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("after initAccount, upDate Db, thread:");
            sbLIZ.append(C786410Ut5.u3().getName());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C605150NoP(this.LLILZ, this.LLILZIL, null), 3);
            anonymousClass0957LIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C605130NoN(this.LLILZ, this.LLILZIL, null), 3);
            bulletinProfileViewModel = this.LLILZ;
            this.LLILLL = anonymousClass0957LIZIZ;
            this.LL = bulletinProfileViewModel;
            this.LLILLJJLI = 1;
            objLJLIIIL = c099gLIZIZ.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("BulletinProfileViewModel@3b06.getBulletinBoardAccountInfo$2");
                return objLJFF;
            }
        }
        BulletinAccountInfoResponse bulletinAccountInfoResponse2 = (BulletinAccountInfoResponse) objLJLIIIL;
        this.LLILLL = bulletinProfileViewModel;
        this.LL = bulletinAccountInfoResponse2;
        this.LLILLJJLI = 2;
        Object objLJLIIIL2 = anonymousClass0957LIZIZ.LJLIIIL(this);
        if (objLJLIIIL2 == objLJFF) {
            C1C7U.LIZIZ("BulletinProfileViewModel@3b06.getBulletinBoardAccountInfo$2");
            return objLJFF;
        }
        bulletinAccountInfoResponse = bulletinAccountInfoResponse2;
        objLJLIIIL = objLJLIIIL2;
        bulletinProfileViewModel.LQ2(bulletinAccountInfoResponse, (BulletinSettingList) objLJLIIIL, this.LLILZIL, false);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.getBulletinBoardAccountInfo$2");
        return unit2;
    }
}
