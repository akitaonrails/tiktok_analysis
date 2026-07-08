package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPI$impression$1", f = "SearchCSIProfilerBannerAPI.kt", l = {77}, m = "invokeSuspend")
public final class C2379209Ty extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ EnumC2193121AsQ LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2379209Ty(String str, EnumC2193121AsQ enumC2193121AsQ, String str2, String str3, Integer num, String str4, String str5, String str6, InterfaceC1364105Vn<? super C2379209Ty> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = enumC2193121AsQ;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = num;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = str6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2379209Ty c2379209Ty = new C2379209Ty(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c2379209Ty.LLILLJJLI = obj;
        return c2379209Ty;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("SearchCSIProfilerBannerAPI@11f3.impression$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLL;
            EnumC2193121AsQ enumC2193121AsQ = this.LLILZ;
            String str2 = this.LLILZIL;
            String str3 = this.LLILZLL;
            Integer num = this.LLIZ;
            String str4 = this.LLIZLLLIL;
            String str5 = this.LLJ;
            String str6 = this.LLJI;
            SearchCSIProfilerBannerAPI.LIZIZ.getClass();
            SearchCSIProfilerBannerAPI.API api = (SearchCSIProfilerBannerAPI.API) SearchCSIProfilerBannerAPI.LIZLLL.getValue();
            if (api != null) {
                SearchCSIProfilerBannerAPI.ImpressionRequest impressionRequest = new SearchCSIProfilerBannerAPI.ImpressionRequest(str, enumC2193121AsQ.getValue(), str2, str3, num, str4, str5, str6);
                this.LL = 1;
                obj = api.impression(impressionRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SearchCSIProfilerBannerAPI@11f3.impression$1");
                    return objLJFF;
                }
            } else {
                c098200Yq = null;
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SearchCSIProfilerBannerAPI@11f3.impression$1");
                return unit;
            }
        }
        c098200Yq = (C1500770p9n) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchCSIProfilerBannerAPI@11f3.impression$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
