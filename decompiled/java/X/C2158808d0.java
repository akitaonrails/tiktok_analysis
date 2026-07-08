package X;

import android.util.Log;
import com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08d0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3$handlePageStateChange$2", f = "SearchCSIProfileBannerRepoV3.kt", l = {1288, 1292, 1299}, m = "invokeSuspend")
public final class C2158808d0 extends C09AX implements Function2<String, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ SearchCSIProfileBannerRepoV3 LLILZ;
    public final /* synthetic */ EnumC2193241Asc LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2158808d0(boolean z, SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3, EnumC2193241Asc enumC2193241Asc, InterfaceC1364105Vn<? super C2158808d0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = searchCSIProfileBannerRepoV3;
        this.LLILZIL = enumC2193241Asc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2158808d0 c2158808d0 = new C2158808d0(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2158808d0.LLILLJJLI = obj;
        return c2158808d0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCSIProfileBannerRepoV3@3eb2.handlePageStateChange$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = (String) this.LLILLJJLI;
            if (this.LLILLL) {
                if (!this.LLILZ.LIZJ.LIZ()) {
                    SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3 = this.LLILZ;
                    EnumC2193241Asc enumC2193241Asc = this.LLILZIL;
                    this.LL = 1;
                    if (searchCSIProfileBannerRepoV3.LJJII(enumC2193241Asc, str, this) == objLJFF) {
                        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.handlePageStateChange$2");
                        return objLJFF;
                    }
                } else {
                    SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV32 = this.LLILZ;
                    EnumC2193241Asc enumC2193241Asc2 = this.LLILZIL;
                    this.LL = 2;
                    if (searchCSIProfileBannerRepoV32.LJJIIZI(enumC2193241Asc2, false, false, str, this) == objLJFF) {
                        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.handlePageStateChange$2");
                        return objLJFF;
                    }
                }
            } else {
                SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV33 = this.LLILZ;
                if (searchCSIProfileBannerRepoV33.LJII == null) {
                    EnumC2193241Asc enumC2193241Asc3 = this.LLILZIL;
                    this.LL = 3;
                    if (searchCSIProfileBannerRepoV33.LJJII(enumC2193241Asc3, null, this) == objLJFF) {
                        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.handlePageStateChange$2");
                        return objLJFF;
                    }
                } else {
                    C2286608xc.LJ(Log.d("CSIProfileRepoV3", "Only freq expired, not reached interval, keep current banner"));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.handlePageStateChange$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(str, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
