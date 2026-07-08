package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.detail.productscard.api.EcomSearchMixFeed;
import com.ss.android.ugc.aweme.ecommerce.search.detail.productscard.api.EcomSearchMixFeedList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PPK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PPK extends AbstractC1588960rS2<Aweme, EcomSearchMixFeedList> {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Map<String, Object> LLILZLL;
    public final String LLIZ;
    public final List<Aweme> LLIZLLLIL;
    public int LLJ;
    public String LLJI;
    public int LLJIJIL;
    public final CopyOnWriteArraySet<Integer> LLJILJIL;
    public final BPEAHandler LLJILJILJ;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final void LJIIJ() {
        if (this.LLJILJIL.contains(Integer.valueOf(this.LLJIJIL)) && C276280AsE.LIZ()) {
            return;
        }
        if (C276280AsE.LIZ()) {
            this.LLJILJIL.add(Integer.valueOf(this.LLJIJIL));
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C0PPL(this, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0) {
            return ((EcomSearchMixFeedList) t).hasMore;
        }
        return true;
    }

    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        boolean z;
        Object c098200Yq;
        EcomSearchMixFeedList ecomSearchMixFeedList = (EcomSearchMixFeedList) obj;
        String str = "";
        if (ecomSearchMixFeedList != null && !C086I.LIZIZ(ecomSearchMixFeedList.mItems)) {
            z = false;
        } else {
            z = true;
        }
        this.mIsNewDataEmpty = z;
        super.handleData(ecomSearchMixFeedList);
        EcomSearchMixFeedList ecomSearchMixFeedList2 = (EcomSearchMixFeedList) this.mData;
        ecomSearchMixFeedList2.getClass();
        Object obj2 = null;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(ecomSearchMixFeedList2.LL).optJSONObject("extra");
            if (jSONObjectOptJSONObject == null || (c098200Yq = jSONObjectOptJSONObject.optString("inner_search_id")) == null) {
                c098200Yq = "";
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        String str2 = (String) obj2;
        if (str2 != null) {
            str = str2;
        }
        this.LLJI = str;
        EcomSearchMixFeedList ecomSearchMixFeedList3 = (EcomSearchMixFeedList) this.mData;
        this.LLJIJIL = ecomSearchMixFeedList3.cursor;
        Iterator<EcomSearchMixFeed> it2 = ecomSearchMixFeedList3.mItems.iterator();
        while (it2.hasNext()) {
            Aweme aweme = it2.next().aweme;
            if (aweme != null) {
                this.LLIZLLLIL.add(aweme);
                LJIIJJI(aweme, (EcomSearchMixFeedList) this.mData);
            }
        }
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        LJIIJ();
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        LJIIJ();
    }

    public final void LJIIJJI(Aweme aweme, EcomSearchMixFeedList ecomSearchMixFeedList) {
        String str;
        if (ecomSearchMixFeedList == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        AwemeExtKt.appendMobParam(aweme, "is_inner", str);
        if (ecomSearchMixFeedList != null) {
            AwemeExtKt.appendExtraParamUseInSearch(aweme, "search_result_id", aweme.getAid());
            AwemeExtKt.appendMobParam(aweme, "inner_search_id", this.LLJI);
            AwemeExtKt.appendMobParam(aweme, "rank_inner", String.valueOf(this.LLJ));
            this.LLJ++;
            return;
        }
        AwemeExtKt.appendMobParam(aweme, "rank_inner", CardStruct.IStatusCode.DEFAULT);
        AwemeExtKt.appendExtraParamUseInSearch(aweme, "search_result_id", this.LLILZIL);
    }

    public C0PPK(Aweme aweme, String str, String str2, String str3, String str4, String str5, Map<String, ? extends Object> map, String str6) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = map;
        this.LLIZ = str6;
        ArrayList arrayList = new ArrayList();
        this.LLIZLLLIL = arrayList;
        this.LLJ = 1;
        this.LLJI = "";
        this.LLJILJIL = new CopyOnWriteArraySet<>();
        if (aweme != null) {
            arrayList.add(aweme);
            LJIIJJI(aweme, null);
        }
        LJIIJ();
        this.LLJILJILJ = new BPEAHandler(Looper.getMainLooper());
    }
}
