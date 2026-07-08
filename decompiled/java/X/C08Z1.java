package X;

import com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Z1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3$ensureDraftDataLoaded$draftPostItems$1", f = "SearchCSIProfileBannerRepoV3.kt", l = {}, m = "invokeSuspend")
public final class C08Z1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C2193391Asr>>, Object> {
    public final /* synthetic */ SearchCSIProfileBannerRepoV3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08Z1(SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3, InterfaceC1364105Vn<? super C08Z1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchCSIProfileBannerRepoV3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08Z1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCSIProfileBannerRepoV3@3eb2.ensureDraftDataLoaded$draftPostItems$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        List listLJJI = SearchCSIProfileBannerRepoV3.LJJI();
        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.ensureDraftDataLoaded$draftPostItems$1");
        return listLJJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C2193391Asr>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
