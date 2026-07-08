package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z87, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884130z87 extends AbstractC1255880imo<Aweme, FeedsResponse> implements InterfaceC497601wk {
    public final /* synthetic */ C054G LL = C2296808zG.LIZ(C0PEM.LIZ);
    public final String LLILLJJLI;
    public final LinkedBlockingDeque<C1876870ywP> LLILLL;
    public final C1DEV LLILZ;
    public final C1DEU LLILZIL;
    public volatile boolean LLILZLL;
    public final AtomicBoolean LLIZ;
    public int LLIZLLLIL;
    public final CopyOnWriteArrayList<InterfaceC1876680yw6> LLJ;
    public String LLJI;
    public String LLJIJIL;
    public C2189821An6 LLJILJIL;
    public final C1879650z0t LLJILJILJ;

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
    }

    public final boolean LJIILIIL() {
        return (this.LLJ.isEmpty() ^ true) && !Intrinsics.LJFF(this.LLJI, this.LLJ.get(0).getWatchTimestamp());
    }

    public final boolean LJIILJJIL() {
        return (this.LLJ.isEmpty() ^ true) && !Intrinsics.LJFF(this.LLJIJIL, ((InterfaceC1876680yw6) C13LP.LJJLIIIJJI(this.LLJ)).getWatchTimestamp());
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        List<Aweme> list;
        FeedsResponse feedsResponse = (FeedsResponse) this.mData;
        return (feedsResponse == null || (list = feedsResponse.list) == null) ? new ArrayList() : list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        FeedsResponse feedsResponse = (FeedsResponse) this.mData;
        return feedsResponse != null && feedsResponse.hasMore;
    }

    public static List LJIIJJI(List list) {
        BatchDetailList batchDetailListLJIILIIL;
        List<Aweme> list2;
        DetailFeedService detailFeedService = (DetailFeedService) PluggableExtentionKt.pluggableSpi$default(DetailFeedService.class, false, false, false, 14, null);
        if (detailFeedService != null && (batchDetailListLJIILIIL = detailFeedService.LJIILIIL(42, list.toString())) != null && (list2 = batchDetailListLJIILIIL.items) != null) {
            return list2;
        }
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0136, code lost:
    
        if (r4.equals("replace") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013d, code lost:
    
        if (r4.equals("__refresh") != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013f, code lost:
    
        r10.LLJI = r1.LIZIZ;
        r10.LLJIJIL = r1.LIZJ;
        r10.LLJ.clear();
        r10.LLJ.addAll(r1.LIZ);
        r0 = (com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse) r10.mData;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0157, code lost:
    
        if (r0 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
    
        r0 = r0.list;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015b, code lost:
    
        if (r0 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015d, code lost:
    
        r0.clear();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020c A[Catch: Exception -> 0x02c6, TryCatch #10 {Exception -> 0x02c6, blocks: (B:95:0x01e8, B:99:0x0205, B:102:0x020c, B:104:0x0212, B:106:0x0218, B:108:0x021c, B:109:0x021f, B:110:0x0225, B:112:0x022b, B:114:0x0231, B:116:0x0235, B:117:0x0239), top: B:206:0x01e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0225 A[Catch: Exception -> 0x02c6, TryCatch #10 {Exception -> 0x02c6, blocks: (B:95:0x01e8, B:99:0x0205, B:102:0x020c, B:104:0x0212, B:106:0x0218, B:108:0x021c, B:109:0x021f, B:110:0x0225, B:112:0x022b, B:114:0x0231, B:116:0x0235, B:117:0x0239), top: B:206:0x01e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0245 A[Catch: Exception -> 0x02c4, TryCatch #11 {Exception -> 0x02c4, blocks: (B:130:0x025f, B:132:0x0265, B:133:0x026b, B:120:0x0245, B:122:0x024b, B:124:0x024f, B:125:0x0252, B:127:0x0258, B:129:0x025c, B:118:0x023f), top: B:207:0x023f }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0265 A[Catch: Exception -> 0x02c4, TryCatch #11 {Exception -> 0x02c4, blocks: (B:130:0x025f, B:132:0x0265, B:133:0x026b, B:120:0x0245, B:122:0x024b, B:124:0x024f, B:125:0x0252, B:127:0x0258, B:129:0x025c, B:118:0x023f), top: B:207:0x023f }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0293 A[Catch: Exception -> 0x02c2, TryCatch #12 {Exception -> 0x02c2, blocks: (B:136:0x028f, B:138:0x0293, B:139:0x0297, B:140:0x02a9, B:142:0x02af, B:143:0x02bd), top: B:209:0x028f }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02af A[Catch: Exception -> 0x02c2, LOOP:0: B:140:0x02a9->B:142:0x02af, LOOP_END, TryCatch #12 {Exception -> 0x02c2, blocks: (B:136:0x028f, B:138:0x0293, B:139:0x0297, B:140:0x02a9, B:142:0x02af, B:143:0x02bd), top: B:209:0x028f }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0394 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x023f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175 A[Catch: Exception -> 0x02d0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02d0, blocks: (B:71:0x0164, B:76:0x0175), top: B:187:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0205 A[Catch: Exception -> 0x02c6, TRY_ENTER, TryCatch #10 {Exception -> 0x02c6, blocks: (B:95:0x01e8, B:99:0x0205, B:102:0x020c, B:104:0x0212, B:106:0x0218, B:108:0x021c, B:109:0x021f, B:110:0x0225, B:112:0x022b, B:114:0x0231, B:116:0x0235, B:117:0x0239), top: B:206:0x01e8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1884130z87.LJIIJ(X.05Vn):java.lang.Object");
    }

    public final void LJIILL(boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            jSONObject.put("cursor", this.LLJI);
            jSONObject.put("direction", "prev");
        } else {
            jSONObject.put("cursor", this.LLJIJIL);
            jSONObject.put("direction", "next");
        }
        C1548820qPI.LIZIZ(new C397901gf(SystemClock.currentThreadTimeMillis(), new C1323820kYO(jSONObject), "wh_load_more"));
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        boolean z = false;
        if (objArr.length != 0) {
            Object obj = objArr[0];
            if (Intrinsics.LJFF(obj, 1)) {
                if (objArr.length > 1) {
                    z = true;
                }
                Object obj2 = null;
                if (z) {
                    obj2 = objArr[1];
                }
                if ((obj2 instanceof C2189821An6) && obj2 != null) {
                    new C2217391BqT(this) { // from class: X.0z89
                        @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217311BqL
                        public final Object get() {
                            return ((C1884130z87) this.receiver).LLJILJIL;
                        }

                        @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217291BqJ
                        public final void set(Object obj3) {
                            ((C1884130z87) this.receiver).LLJILJIL = (C2189821An6) obj3;
                        }
                    }.set(obj2);
                }
            } else {
                if (Intrinsics.LJFF(obj, 2)) {
                    return LJIILIIL();
                }
                if (Intrinsics.LJFF(obj, 4) || Intrinsics.LJFF(obj, 8) || Intrinsics.LJFF(obj, 20)) {
                    return LJIILJJIL();
                }
            }
        }
        return true;
    }

    @Override // X.AbstractC1255880imo
    public final void loadLatestList(Object... objArr) throws JSONException {
        this.LLJILJILJ.LIZIZ("prev", this.LLJI);
        LJIILL(true);
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) throws JSONException {
        this.LLJILJILJ.LIZIZ("next", this.LLJIJIL);
        LJIILL(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1884130z87(FeedsResponse feedsResponse, String str) {
        this.LLILLJJLI = str;
        this.mData = feedsResponse;
        this.LLILLL = new LinkedBlockingDeque<>();
        this.LLILZ = C2191201ApK.LIZ();
        this.LLILZIL = C2252461DEe.LIZ(1);
        this.LLIZ = new AtomicBoolean(false);
        this.LLJ = new CopyOnWriteArrayList<>();
        this.LLJI = "";
        this.LLJIJIL = "";
        this.LLJILJILJ = new C1879650z0t(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.InterfaceC1876730ywB r13, X.InterfaceC1876240yvO<X.InterfaceC1876690yw7> r14, X.InterfaceC1364105Vn<? super java.lang.Integer> r15) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1884130z87.LJIIL(X.0ywB, X.0yvO, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(java.util.List<? extends X.InterfaceC1876680yw6> r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, X.InterfaceC1876240yvO<java.lang.Object> r22) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1884130z87.LJIILLIIL(java.util.List, java.lang.String, java.lang.String, java.lang.String, X.0yvO):void");
    }
}
