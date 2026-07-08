package X;

import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.ng.model.SearchAwemePoolEnterInnerFlowRequestNG;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DRP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.ng.viewmodel.SearchAwemePoolViewModelNG$RepoImpl$doLoadMore$2", f = "SearchAwemePoolViewModelNG.kt", l = {263}, m = "invokeSuspend")
public final class C0DRP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends List<? extends Aweme>, ? extends Boolean, ? extends Long>>, Object> {
    public int LL;
    public final /* synthetic */ SearchAwemePoolEnterInnerFlowRequestNG.LoadMoreRequest LLILLJJLI;
    public final /* synthetic */ HashMap<String, String> LLILLL;
    public final /* synthetic */ C0DRR LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DRP(SearchAwemePoolEnterInnerFlowRequestNG.LoadMoreRequest loadMoreRequest, HashMap<String, String> map, C0DRR c0drr, InterfaceC1364105Vn<? super C0DRP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = loadMoreRequest;
        this.LLILLL = map;
        this.LLILZ = c0drr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DRP(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        k kVarLJJIIZ;
        String string;
        C1C7U.LIZ("SearchAwemePoolViewModelNG$RepoImpl@6c1.doLoadMore$2");
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
            SearchApiNew.RealApi realApiLIZ = SearchApiNew.LIZ();
            String str = this.LLILLJJLI.url;
            HashMap<String, String> map = this.LLILLL;
            this.LL = 1;
            obj = realApiLIZ.commonHorizontalLodMore(str, map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchAwemePoolViewModelNG$RepoImpl@6c1.doLoadMore$2");
                return objLJFF;
            }
        }
        String str2 = (String) obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", str2);
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "innerFlowLoadMore"));
        C1227904rF.LIZ.getClass();
        n nVar = (n) C1227904rF.LIZIZ(str2, n.class);
        String str3 = this.LLILZ.LIZJ.awemeListPath;
        boolean zLJ = false;
        Long lLJFF = null;
        if (str3 != null) {
            kVarLJJIIZ = nVar;
            for (String str4 : a0.LJJLIIIJILLIZJL(str3, new String[]{"/"}, 0, 6)) {
                if (kVarLJJIIZ != null && (kVarLJJIIZ instanceof n)) {
                    kVarLJJIIZ = kVarLJJIIZ.LJIILIIL().LJJIIZ(str4);
                } else {
                    kVarLJJIIZ = null;
                }
            }
        } else {
            kVarLJJIIZ = nVar.LJJIIZ("aweme_list");
        }
        C1227904rF c1227904rF = C1227904rF.LIZ;
        if (kVarLJJIIZ == null || (string = kVarLJJIIZ.toString()) == null) {
            string = "[]";
        }
        Type type = new TypeToken<List<? extends Aweme>>() { // from class: X.0DRQ
        }.getType();
        c1227904rF.getClass();
        Object objLIZJ = C1227904rF.LIZJ(string, type);
        k kVarLJJIIZ2 = nVar.LJJIIZ("has_more");
        if (kVarLJJIIZ2 != null && Boolean.valueOf(kVarLJJIIZ2 instanceof q).booleanValue()) {
            zLJ = kVarLJJIIZ2.LJ();
        }
        Boolean boolValueOf = Boolean.valueOf(zLJ);
        k kVarLJJIIZ3 = nVar.LJJIIZ("offset");
        if (kVarLJJIIZ3 != null && (kVarLJJIIZ3 instanceof q)) {
            lLJFF = C2286608xc.LJFF(kVarLJJIIZ3.LJIIZILJ());
        }
        C443120HZe c443120HZe = new C443120HZe(objLIZJ, boolValueOf, lLJFF);
        C1C7U.LIZIZ("SearchAwemePoolViewModelNG$RepoImpl@6c1.doLoadMore$2");
        return c443120HZe;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends List<? extends Aweme>, ? extends Boolean, ? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
