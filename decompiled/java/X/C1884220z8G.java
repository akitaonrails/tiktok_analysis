package X;

import android.os.SystemClock;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z8G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884220z8G extends AbstractC1255880imo<Aweme, FeedsResponse> implements InterfaceC497601wk {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final String LLILLJJLI;
    public SparkActivity LLILLL;
    public C1884270z8L LLIZLLLIL;
    public boolean LLJ;
    public final /* synthetic */ C054G LL = C2296808zG.LIZ(C0PEM.LIZ);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(429));
    public String LLILZIL = "-1";
    public final List<C1884270z8L> LLILZLL = new ArrayList();
    public final List<String> LLIZ = new ArrayList();
    public final AwS546S0100000_2 LLJI = new AwS546S0100000_2(this, 901);

    public final ReentrantLock LJIILIIL() {
        return (ReentrantLock) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1542220qEe interfaceC1542220qEe;
        SparkActivity sparkActivity = this.LLILLL;
        if (sparkActivity != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkActivity.LLJILJIL.LLILLL) != null && (interfaceC1542220qEe = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJIJI) != null) {
            interfaceC1542220qEe.hide();
        }
        this.LLJ = false;
        LJIILIIL().lock();
        ArrayList arrayList = new ArrayList(((FeedsResponse) this.mData).list);
        LJIILIIL().unlock();
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((FeedsResponse) t).hasMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void loadMore() throws JSONException {
        List<String> listSubList;
        C1884200z8E c1884200z8ELIZ = C1884190z8D.LIZ(this.LLILLJJLI);
        String str = this.LLILLJJLI;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1884200z8ELIZ.LIZ = Long.valueOf(jCurrentTimeMillis);
        c1884200z8ELIZ.LIZIZ = str;
        C20684815ws.LJIILLIIL("ac_load_more_start", C2097608Jq.LJIIIIZZ(new Pair("page_name", "watch_history"), new Pair("react_id", str), new Pair("start_timestamp", String.valueOf(jCurrentTimeMillis))));
        List<String> list = this.LLIZ;
        if (((FeedsResponse) this.mData).list.size() < ((ArrayList) this.LLIZ).size() && 1 != 0 && list != null && (listSubList = list.subList(((FeedsResponse) this.mData).list.size(), ((ArrayList) this.LLIZ).size())) != null && (true ^ listSubList.isEmpty())) {
            C23118094a.LJ(this.LL.LL);
            C23250099c.LIZLLL(this, null, null, new C1884250z8J(this, listSubList, null), 3);
            return;
        }
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("react_id", this.LLILLJJLI);
        jSONObject.put("next_cursor", this.LLILZIL);
        C1548820qPI.LIZIZ(new C397901gf(jCurrentThreadTimeMillis, new C1323820kYO(jSONObject), "ac_feeds_load_more"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJJI() {
        LJIILIIL().lock();
        C23118094a.LJ(this.LL.LL);
        ((FeedsResponse) this.mData).list.clear();
        ((ArrayList) this.LLILZLL).clear();
        ((ArrayList) this.LLIZ).clear();
        this.LLILZIL = "-1";
        this.LLIZLLLIL = null;
        EventBus.LIZLLL().LJJI(this);
        LJIILIIL().unlock();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIIJ(C1884180z8C c1884180z8C) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1542220qEe interfaceC1542220qEe;
        if (this.LLJ) {
            return false;
        }
        if (((FeedsResponse) this.mData).list.size() < ((ArrayList) this.LLIZ).size()) {
            SparkActivity sparkActivity = this.LLILLL;
            if (sparkActivity != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkActivity.LLJILJIL.LLILLL) != null && (interfaceC1542220qEe = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJIJI) != null) {
                interfaceC1542220qEe.show();
            }
            this.LLJ = true;
            C23250099c.LIZLLL(this, null, null, new C1884210z8F(this, c1884180z8C, null), 3);
            return true;
        }
        c1884180z8C.invoke();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIL(List<? extends Number> list) {
        LJIILIIL().lock();
        if (((ArrayList) this.LLIZ).isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends Number> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().intValue()));
        }
        Iterator it3 = C13LP.LJJJJI(C13LP.LJLLL(arrayList)).iterator();
        while (it3.hasNext()) {
            ListProtector.remove(this.LLIZ, ((Number) it3.next()).intValue());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Number number : list) {
            int size = ((FeedsResponse) this.mData).list.size();
            int iIntValue = number.intValue();
            if (iIntValue >= 0 && iIntValue < size) {
                arrayList2.add(ListProtector.get(((FeedsResponse) this.mData).list, number.intValue()));
            }
        }
        ((FeedsResponse) this.mData).list.removeAll(arrayList2);
        List listSubList = ((ArrayList) this.LLIZ).subList(((FeedsResponse) this.mData).list.size(), ((ArrayList) this.LLIZ).size());
        if (!listSubList.isEmpty()) {
            C23118094a.LJ(this.LL.LL);
            C23250099c.LIZLLL(this, null, null, new C1884240z8I(this, listSubList, null), 3);
        }
        LJIILIIL().unlock();
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) throws JSONException {
        loadMore();
    }

    @C14EU
    public final void onRenderFirstFrame(C1584420rKi c1584420rKi) {
        String aid;
        int iLJLLJ;
        Integer num;
        if (!Intrinsics.LJFF(c1584420rKi.LIZIZ, "account_history")) {
            return;
        }
        C1884200z8E c1884200z8ELIZ = C1884190z8D.LIZ(this.LLILLJJLI);
        Aweme aweme = c1584420rKi.LIZ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        String str = this.LLILLJJLI;
        IBaseListFragmentPanel iBaseListFragmentPanel = c1584420rKi.LIZLLL;
        if (iBaseListFragmentPanel != null) {
            iLJLLJ = iBaseListFragmentPanel.LJLLJ();
        } else {
            iLJLLJ = -1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = c1884200z8ELIZ.LIZJ;
        if (l != null) {
            C20684815ws.LJIILLIIL("ac_open_detail_success", C2097608Jq.LJIIIIZZ(new Pair("page_name", "watch_history"), new Pair("aweme_id", aid), new Pair("react_id", str), new Pair("index", String.valueOf(iLJLLJ)), new Pair("start_timestamp", String.valueOf(c1884200z8ELIZ.LIZJ)), new Pair("end_timestamp", String.valueOf(jCurrentTimeMillis)), new Pair("duration", String.valueOf(jCurrentTimeMillis - l.longValue()))));
            if (!Intrinsics.LJFF(aid, c1884200z8ELIZ.LIZLLL) || (num = c1884200z8ELIZ.LJFF) == null || iLJLLJ != num.intValue() || !Intrinsics.LJFF(str, c1884200z8ELIZ.LJ)) {
                EnumC1884170z8B enumC1884170z8B = EnumC1884170z8B.VIDEO_PLAY_INCORRECT;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start reactId = ");
                sbLIZ.append(c1884200z8ELIZ.LJ);
                sbLIZ.append(", current reactId = ");
                sbLIZ.append(str);
                sbLIZ.append("\nstart awemeId = ");
                sbLIZ.append(c1884200z8ELIZ.LIZLLL);
                sbLIZ.append(", current awemeId = ");
                sbLIZ.append(aid);
                sbLIZ.append("\nstart index = ");
                sbLIZ.append(c1884200z8ELIZ.LJFF);
                sbLIZ.append(", current index = ");
                sbLIZ.append(iLJLLJ);
                sbLIZ.append('.');
                C1885840zAs.LIZ(enumC1884170z8B, "Start info not matched", C2188811AlT.LIZIZ(sbLIZ));
            }
            c1884200z8ELIZ.LIZJ = null;
            c1884200z8ELIZ.LJ = null;
            c1884200z8ELIZ.LJFF = null;
            c1884200z8ELIZ.LIZLLL = null;
        }
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) throws JSONException {
        loadMore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1884220z8G(FeedsResponse feedsResponse, String str) {
        this.LLILLJJLI = str;
        EventBus.LIZLLL().LJIJJ(this);
        this.mData = feedsResponse;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(java.util.List<java.lang.String> r16, boolean r17, java.lang.String r18, java.lang.String r19, kotlin.jvm.functions.Function0<kotlin.Unit> r20, X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1884220z8G.LJIILJJIL(java.util.List, boolean, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }
}
