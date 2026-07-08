package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$getBulletinBoardAccountInfo$2$settingDeferred$1", f = "BulletinProfileViewModel.kt", l = {761}, m = "invokeSuspend")
public final class C605130NoN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BulletinSettingList>, Object> {
    public int LL;
    public final /* synthetic */ BulletinProfileViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605130NoN(BulletinProfileViewModel bulletinProfileViewModel, long j, InterfaceC1364105Vn<? super C605130NoN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinProfileViewModel;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605130NoN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinProfileViewModel@3b06.getBulletinBoardAccountInfo$2$settingDeferred$1");
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
            String strValueOf = String.valueOf(this.LLILLL);
            this.LL = 1;
            obj = c0oiu.LLJIJIL(strValueOf, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinProfileViewModel@3b06.getBulletinBoardAccountInfo$2$settingDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.getBulletinBoardAccountInfo$2$settingDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BulletinSettingList> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
