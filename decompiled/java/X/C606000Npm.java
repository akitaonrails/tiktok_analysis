package X;

import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageBarAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Npm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageBarAssem$initData$1$bulletinInfo$1", f = "BulletinPageBarAssem.kt", l = {348}, m = "invokeSuspend")
public final class C606000Npm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BulletinBoardInfo>, Object> {
    public int LL;
    public final /* synthetic */ BulletinPageBarAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C606000Npm(BulletinPageBarAssem bulletinPageBarAssem, InterfaceC1364105Vn<? super C606000Npm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinPageBarAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C606000Npm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinPageBarAssem@cc58.initData$1$bulletinInfo$1");
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
            BulletinProfileViewModel bulletinProfileViewModelNo = this.LLILLJJLI.No();
            this.LL = 1;
            Long l = bulletinProfileViewModelNo.LLILLJJLI;
            if (l != null) {
                obj = ((C0OIU) bulletinProfileViewModelNo.DQ2().getOperator()).LLZZJLIL(l.longValue());
            } else {
                obj = null;
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinPageBarAssem@cc58.initData$1$bulletinInfo$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BulletinPageBarAssem@cc58.initData$1$bulletinInfo$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BulletinBoardInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
