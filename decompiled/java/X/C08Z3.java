package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Z3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3$fetchAndProcessDraftList$1", f = "SearchCSIProfileBannerRepoV3.kt", l = {482}, m = "invokeSuspend")
public final class C08Z3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchCSIProfileBannerRepoV3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08Z3(SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3, InterfaceC1364105Vn<? super C08Z3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchCSIProfileBannerRepoV3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08Z3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCSIProfileBannerRepoV3@3eb2.fetchAndProcessDraftList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Integer numValueOf = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C08Z2 c08z2 = new C08Z2(this.LLILLJJLI, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c08z2);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.fetchAndProcessDraftList$1");
                    return objLJFF;
                }
            }
            List<C2193391Asr> list = (List) obj;
            SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3 = this.LLILLJJLI;
            searchCSIProfileBannerRepoV3.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preProcessDraftList: size=");
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            }
            sbLIZ.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            searchCSIProfileBannerRepoV3.LIZJ.LJJ(list);
            list.size();
            searchCSIProfileBannerRepoV3.LJJIIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.fetchAndProcessDraftList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
