package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBizResourceEntryToggle;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ONf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel$sendRequest$1$1", f = "BulletinAccountEditViewModel.kt", l = {250, 252}, m = "invokeSuspend")
public final class C618370ONf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C618380ONg LLILLJJLI;
    public final /* synthetic */ BulletinBoardEditViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C618370ONf(C618380ONg c618380ONg, BulletinBoardEditViewModel bulletinBoardEditViewModel, String str, String str2, InterfaceC1364105Vn<? super C618370ONf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c618380ONg;
        this.LLILLL = bulletinBoardEditViewModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C618370ONf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardEditViewModel@acc0.sendRequest$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C618380ONg c618380ONg = this.LLILLJJLI;
            if (!(c618380ONg.LL instanceof C1623606Xi)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BulletinBoardEditViewModel@acc0.sendRequest$1$1");
                return unit;
            }
            BulletinBoardEditViewModel bulletinBoardEditViewModel = this.LLILLL;
            if (bulletinBoardEditViewModel.LLJILJILJ) {
                String str = this.LLILZ;
                String str2 = this.LLILZIL;
                this.LL = 1;
                if (bulletinBoardEditViewModel.wQ2(str, str2, this) == objLJFF) {
                    C1C7U.LIZIZ("BulletinBoardEditViewModel@acc0.sendRequest$1$1");
                    return objLJFF;
                }
            } else {
                String str3 = this.LLILZ;
                String str4 = this.LLILZIL;
                C1227904rF c1227904rF = C1227904rF.LIZ;
                List<BulletinBizResourceEntryToggle> list = c618380ONg.LLILLL;
                c1227904rF.getClass();
                String strLJI = C1227904rF.LJI(list);
                this.LL = 2;
                if (bulletinBoardEditViewModel.xQ2(str3, str4, strLJI, this) == objLJFF) {
                    C1C7U.LIZIZ("BulletinBoardEditViewModel@acc0.sendRequest$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinBoardEditViewModel@acc0.sendRequest$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
