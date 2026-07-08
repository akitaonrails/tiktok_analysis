package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editeffect.search.middleware.sug.SearchSugResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nDE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editeffect.search.middleware.sug.EditEffectSearchSugComponent$fetchSug$1", f = "EditEffectSearchSugComponent.kt", l = {133, 144, 157}, m = "invokeSuspend")
public final class C1426020nDE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1426080nDK LLILLL;
    public final /* synthetic */ C1425990nDB LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1426020nDE(C1426080nDK c1426080nDK, C1425990nDB c1425990nDB, String str, InterfaceC1364105Vn<? super C1426020nDE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1426080nDK;
        this.LLILZ = c1425990nDB;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1426020nDE c1426020nDE = new C1426020nDE(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1426020nDE.LLILLJJLI = obj;
        return c1426020nDE;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String string;
        C1C7U.LIZ("EditEffectSearchSugComponent@5853.fetchSug$1");
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
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("EditEffectSearchSugComponent@5853.fetchSug$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("EditEffectSearchSugComponent@5853.fetchSug$1");
                return unit2;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1425990nDB c1425990nDB = this.LLILZ;
            String str = this.LLILZIL;
            Long l = this.LLILLL.LLJJIII;
            if (l == null || (string = l.toString()) == null) {
                string = "";
            }
            this.LL = 1;
            obj = c1425990nDB.LIZ(str, string, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EditEffectSearchSugComponent@5853.fetchSug$1");
                return objLJFF;
            }
        }
        SearchSugResponse searchSugResponse = (SearchSugResponse) obj;
        if (searchSugResponse != null && searchSugResponse.sugList != null) {
            c098200Yq = (SearchSugResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
            C1426080nDK c1426080nDK = this.LLILLL;
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
                SearchSugResponse searchSugResponse2 = (SearchSugResponse) c098200Yq;
                if (!this.LLILLL.isShowing()) {
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("EditEffectSearchSugComponent@5853.fetchSug$1");
                    return unit3;
                }
                if (this.LLILLL.P4(searchSugResponse2).isEmpty() && searchSugResponse2 != null) {
                    searchSugResponse2.sugList = new ArrayList();
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C1426030nDF c1426030nDF = new C1426030nDF(this.LLILLL, searchSugResponse2, null);
                this.LL = 3;
                if (C23250099c.LJI(this, abstractC2238408pq, c1426030nDF) == objLJFF) {
                    C1C7U.LIZIZ("EditEffectSearchSugComponent@5853.fetchSug$1");
                    return objLJFF;
                }
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("EditEffectSearchSugComponent@5853.fetchSug$1");
                return unit4;
            }
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C1426040nDG c1426040nDG = new C1426040nDG(c1426080nDK, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq2, c1426040nDG) == objLJFF) {
                C1C7U.LIZIZ("EditEffectSearchSugComponent@5853.fetchSug$1");
                return objLJFF;
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("EditEffectSearchSugComponent@5853.fetchSug$1");
            return unit22;
        }
        throw new IllegalStateException("sug list is empty");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
