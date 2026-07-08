package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OIM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel$observeNetworkOverwrite$1", f = "BulletinListViewModel.kt", l = {329, 331}, m = "invokeSuspend")
public final class C0OIM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0OI4 LLILLJJLI;
    public final /* synthetic */ BulletinListViewModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OIM(C0OI4 c0oi4, BulletinListViewModel bulletinListViewModel, String str, InterfaceC1364105Vn<? super C0OIM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0oi4;
        this.LLILLL = bulletinListViewModel;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OIM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("BulletinListViewModel@dbe7.observeNetworkOverwrite$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BulletinListViewModel@dbe7.observeNetworkOverwrite$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0OPX.LJII("BBDiag [observe] coroutine started, waiting for drop(1).first()...");
            C1629806Zs c1629806Zs = new C1629806Zs(new C05RH(this.LLILLJJLI.LJ(C0OII.LJIIIIZZ)));
            this.LL = 1;
            obj = C09IC.LJIIZILJ(c1629806Zs, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinListViewModel@dbe7.observeNetworkOverwrite$1");
                return objLJFF;
            }
        }
        BulletinListResponse bulletinListResponse = (BulletinListResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BBDiag [observe] got network response! items=");
        List<BulletinItem> list = bulletinListResponse.bulletinItems;
        if (list != null) {
            numLJ = C2286608xc.LJ(list.size());
        } else {
            numLJ = null;
        }
        sbLIZ.append(numLJ);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        BulletinListViewModel bulletinListViewModel = this.LLILLL;
        String str = this.LLILZ;
        this.LL = 2;
        if (bulletinListViewModel.TQ2(bulletinListResponse, str, this) == objLJFF) {
            C1C7U.LIZIZ("BulletinListViewModel@dbe7.observeNetworkOverwrite$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinListViewModel@dbe7.observeNetworkOverwrite$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
