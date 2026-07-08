package X;

import Y.ARunnableS110S0100000_10;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.search.appdiff.ISearchSugAppDiff;
import com.ss.android.ugc.aweme.search.model.SugPreInfoResponse;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS554S0100000_10;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QJX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QJX extends C1260870iur<AbstractC666100QAu<SearchSugResponse>, InterfaceC668290QJf> {
    public static Long LLJJL = 0L;
    public static Long LLJJLIIIJLLLLLLLZ = 0L;
    public C668540QKe LLILZLL;
    public final InterfaceC665370Q7z LLIZLLLIL;
    public final C19EG LLJ;
    public Fragment LLJI;
    public String LLJJIJI;
    public ArrayList<Integer> LLJJIJIIJIL;
    public ArrayList<String> LLJJIJIL;
    public Long LLJJJ;
    public SugPreInfoResponse LLJJJIL;
    public final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());
    public long LLILZIL = 0;
    public final Deque<C0QKX> LLIZ = new LinkedList();
    public boolean LLJIJIL = false;
    public final ConcurrentHashMap<String, SearchSugResponse> LLJILJIL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, SearchSugResponse> LLJILJILJ = new ConcurrentHashMap<>();
    public SearchSugResponse LLJILLL = null;
    public final ConcurrentHashMap<String, Integer> LLJJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Boolean> LLJJI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C668510QKb> LLJJIII = new ConcurrentHashMap<>();
    public C15O7 LLJJJJ = null;
    public long LLJJJJJIL = -1;
    public final ARunnableS110S0100000_10 LLJJJJLIIL = new ARunnableS110S0100000_10(this, 121);

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() throws JSONException {
        boolean zLJI = MethodIDManager.LJI(71811);
        T t = this.LL;
        SearchSugResponse searchSugResponse = t != 0 ? (SearchSugResponse) t.getData() : null;
        K k = this.LLILLJJLI;
        if (k != 0) {
            if (searchSugResponse != null) {
                C584850Mwl.LIZ.LJI(searchSugResponse.requestId, searchSugResponse.logPb);
                C0QH6 c0qh6 = C0QH6.LIZ;
                String str = searchSugResponse.LLILLL;
                c0qh6.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = C0QH6.LIZJ;
                if (j != 0) {
                    long j2 = jCurrentTimeMillis - j;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("gap", j2);
                    jSONObject.put("keyword", str);
                    jSONObject.put("type", "request_success");
                    if (C1839207Ig.LIZ()) {
                        C01V1.LIZIZ(new AwS554S0100000_10(jSONObject, 941));
                    } else {
                        AppLogNewUtils.onEventV3("search_sug_frequency_monitor", jSONObject);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(" request_success gap:");
                    sbLIZ.append(j2);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                C0QH6.LIZJ = jCurrentTimeMillis;
                if (((Number) C0BQR.LIZ.getValue()).intValue() == 0 || !Boolean.TRUE.equals(this.LLJJI.get(searchSugResponse.LLILLL))) {
                    LJIILLIIL(searchSugResponse, -1);
                } else {
                    this.LLJJI.remove(searchSugResponse.LLILLL);
                    if (searchSugResponse.resultStatus.intValue() != 1) {
                        this.LLJILLL = searchSugResponse;
                        LJIJ(searchSugResponse);
                    }
                }
            } else {
                ((InterfaceC668290QJf) k).Zj();
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:11:0x002c, B:13:0x0032, B:14:0x0041, B:16:0x0047, B:17:0x0053, B:20:0x005b, B:21:0x0064, B:23:0x006a, B:25:0x0079, B:26:0x007d, B:27:0x0081, B:29:0x0087, B:31:0x0093, B:32:0x0097, B:34:0x009d, B:36:0x00af, B:37:0x00c6, B:39:0x00cf, B:19:0x0059), top: B:50:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse r10) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QJX.LJIJ(com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse):void");
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC668290QJf) k).Zj();
        }
    }

    public final void LJIILLIIL(SearchSugResponse searchSugResponse, int i) {
        if (this.LLILLJJLI == 0) {
            return;
        }
        ISearchSugAppDiff.LIZ.getClass();
        C668600QKk.LIZIZ.getValue().LIZ();
        ((InterfaceC668290QJf) this.LLILLJJLI).HT(searchSugResponse, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ed A[PHI: r7
      0x02ed: PHI (r7v14 boolean) = (r7v13 boolean), (r7v16 boolean), (r7v16 boolean) binds: [B:148:0x02ec, B:85:0x01ae, B:90:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(X.C668540QKe r18, X.C19EG r19) {
        /*
            Method dump skipped, instruction units count: 1353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QJX.LJIIZILJ(X.0QKe, X.19EG):void");
    }

    public final void LJIJI(String str, boolean z) {
        if (z) {
            this.LLJJIJIIJIL = new ArrayList<>();
            this.LLJJIJIL = new ArrayList<>();
            this.LLJJIJIIJIL.add(0);
        } else {
            this.LLJJIJIIJIL.add(Integer.valueOf((int) (System.currentTimeMillis() - this.LLJJJ.longValue())));
        }
        this.LLJJIJIL.add(str);
        this.LLJJJ = Long.valueOf(System.currentTimeMillis());
    }

    public C0QJX(Fragment fragment, C19EG c19eg, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLIZLLLIL = interfaceC665370Q7z;
        this.LLJ = c19eg;
        this.LLJI = fragment;
        LJIIJ(new C0QKW(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019d A[PHI: r38
      0x019d: PHI (r38v2 java.lang.String) = (r38v0 java.lang.String), (r38v0 java.lang.String), (r38v3 java.lang.String) binds: [B:77:0x0209, B:79:0x021a, B:68:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C668540QKe LJIILL(X.C668540QKe r41, java.lang.String r42, boolean r43) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QJX.LJIILL(X.0QKe, java.lang.String, boolean):X.0QKe");
    }
}
