package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import defpackage.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbneo.RequestSearchHorizontalDataMethodIDL$requestUrl$1", f = "RequestSearchHorizontalDataMethodIDL.kt", l = {197}, m = "invokeSuspend")
public final class C651170PgR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C651160PgQ LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C651170PgR(String str, Map<String, ? extends Object> map, int i, C651160PgQ c651160PgQ, int i2, String str2, String str3, InterfaceC1364105Vn<? super C651170PgR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = map;
        this.LLILZ = i;
        this.LLILZIL = c651160PgQ;
        this.LLILZLL = i2;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C651170PgR(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> mapLJIILLIIL;
        Long lLJFF;
        List<? extends Map<?, ?>> list;
        q qVarLJJIJIIJI;
        C1C7U.LIZ("RequestSearchHorizontalDataMethodIDL@e9de.requestUrl$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                SearchApiNew.RealApi realApiLIZ = SearchApiNew.LIZ();
                String str = this.LLILLJJLI;
                Map<String, Object> map = this.LLILLL;
                if (map != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        arrayList.add(new Pair(entry.getKey(), entry.getValue().toString()));
                    }
                    mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
                } else {
                    mapLJIILLIIL = null;
                }
                C11NZ<String> c11nzJsbRequestAwemeList = realApiLIZ.jsbRequestAwemeList(str, mapLJIILLIIL);
                this.LL = 1;
                obj = C11UD.LIZJ(c11nzJsbRequestAwemeList, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("RequestSearchHorizontalDataMethodIDL@e9de.requestUrl$1");
                    return objLJFF;
                }
            }
            n nVar = (n) C7740030o.LIZ().getGson().LJII((String) obj, n.class);
            C649040Pd0 c649040Pd0LIZ = C647140PZw.LIZ.LIZ(this.LLILZ);
            SearchHorizontalData searchHorizontalData = new SearchHorizontalData();
            C651160PgQ c651160PgQ = this.LLILZIL;
            String str2 = this.LLIZLLLIL;
            searchHorizontalData.hasMore = C2399609ak.LIZ(nVar, "has_more");
            if (nVar.LJJIJIIJIL("new_cursor") && (qVarLJJIJIIJI = nVar.LJJIJIIJI("new_cursor")) != null) {
                lLJFF = C2286608xc.LJFF(qVarLJJIJIIJI.LJIIZILJ());
            } else {
                lLJFF = null;
            }
            searchHorizontalData.newCursor = lLJFF;
            searchHorizontalData.awemeListRaw = c651160PgQ.LJ(nVar, str2);
            if (c649040Pd0LIZ != null) {
                int i2 = this.LLILZLL;
                c649040Pd0LIZ.LIZIZ(i2, searchHorizontalData);
                Map<Integer, List<Map<?, ?>>> map2 = c649040Pd0LIZ.LJII;
                if (map2 != null) {
                    list = (List) ((HashMap) map2).get(Integer.valueOf(i2));
                } else {
                    list = null;
                }
                searchHorizontalData.LLILLJJLI = list;
            }
            C651160PgQ c651160PgQ2 = this.LLILZIL;
            int i3 = this.LLILZLL;
            List<Aweme> listLJ = searchHorizontalData.LJ();
            c651160PgQ2.getClass();
            C651160PgQ.LIZJ(i3, listLJ, c649040Pd0LIZ);
            C1440005kM.LIZ(new AnonymousClass0853(this.LLIZ, new JSONObject(C1741890vQh.LJIIIIZZ(nVar))));
            CompletionBlock<t.c> completionBlock = this.LLILZIL.LLILLL;
            if (completionBlock != null) {
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(t.c.class, this.LLIZ), "");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            CompletionBlock<t.c> completionBlock2 = this.LLILZIL.LLILLL;
            if (completionBlock2 != null) {
                String message = th.getMessage();
                if (message == null) {
                    message = "request fail";
                }
                C2382909Vj.LIZ(completionBlock2, 0, message, null, 4);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RequestSearchHorizontalDataMethodIDL@e9de.requestUrl$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
