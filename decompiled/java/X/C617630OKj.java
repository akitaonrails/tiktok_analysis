package X;

import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardEditAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardUpdateInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardEditAssem$initData$1$updateInfo$1", f = "BulletinBoardEditAssem.kt", l = {530}, m = "invokeSuspend")
public final class C617630OKj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BulletinBoardUpdateInfo>, Object> {
    public int LL;
    public final /* synthetic */ BulletinBoardEditAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C617630OKj(BulletinBoardEditAssem bulletinBoardEditAssem, InterfaceC1364105Vn<? super C617630OKj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinBoardEditAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C617630OKj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardEditAssem@f3cf.initData$1$updateInfo$1");
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
            BulletinBoardEditViewModel bulletinBoardEditViewModelLo = this.LLILLJJLI.Lo();
            this.LL = 1;
            obj = ((C0OIU) bulletinBoardEditViewModelLo.vQ2().getOperator()).LLLLLLL();
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinBoardEditAssem@f3cf.initData$1$updateInfo$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BulletinBoardEditAssem@f3cf.initData$1$updateInfo$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BulletinBoardUpdateInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
