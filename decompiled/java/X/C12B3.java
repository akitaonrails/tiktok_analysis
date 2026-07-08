package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.CommonFeedData;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.FeedExtra;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.12B3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12B3 extends AbstractC1588960rS2<Aweme, CommonFeedData> {
    public final C12B7 LL;
    public String LLILLJJLI;
    public final BPEAHandler LLILLL;
    public final List<C12B4> LLILZ;

    public C12B3() {
        this(null);
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x000b A[SYNTHETIC] */
    @Override // X.AbstractC1255880imo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> getItems() {
        /*
            r6 = this;
            java.util.List<X.12B4> r0 = r6.LLILZ
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r0.iterator()
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r3 = r4.next()
            X.12B4 r3 = (X.C12B4) r3
            java.lang.Integer r2 = r3.LIZLLL
            if (r2 == 0) goto Lb
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L2e
            X.12B9 r0 = r3.LJFF
            if (r0 == 0) goto Lb
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LIZ
        L28:
            if (r0 == 0) goto Lb
            r5.add(r0)
            goto Lb
        L2e:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto Lb
            X.12B8 r0 = r3.LJ
            if (r0 == 0) goto Lb
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LIZ
            goto L28
        L3c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12B3.getItems():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0) {
            return ((CommonFeedData) t).hasMore;
        }
        return true;
    }

    public C12B3(C12B7 c12b7) {
        Aweme aweme;
        int i;
        C12B9 c12b9;
        this.LL = c12b7;
        this.LLILLL = new BPEAHandler(Looper.getMainLooper());
        ArrayList arrayList = new ArrayList();
        this.LLILZ = arrayList;
        if (c12b7 != null && (aweme = c12b7.LIZ) != null) {
            C1735810vGt.LIZ.getClass();
            boolean z = true;
            if (AwemeSaaSExtKt.isLive(aweme)) {
                i = 2;
            } else {
                z = false;
                i = 3;
            }
            C12B8 c12b8 = null;
            if (z) {
                c12b9 = null;
                c12b8 = new C12B8(aweme);
            } else {
                c12b9 = new C12B9(aweme);
            }
            arrayList.add(new C12B4(true, null, null, Integer.valueOf(i), c12b8, c12b9, null, null, 910));
        }
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        C2189821An6 c2189821An6;
        Object obj = objArr[1];
        if (obj instanceof C2189821An6) {
            c2189821An6 = (C2189821An6) obj;
        } else {
            c2189821An6 = null;
        }
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C12B1(null, this, c2189821An6, null, null), 3);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        C2189821An6 c2189821An6;
        ((ArrayList) this.LLILZ).clear();
        this.LLILLJJLI = null;
        Object obj = objArr[1];
        if (obj instanceof C2189821An6) {
            c2189821An6 = (C2189821An6) obj;
        } else {
            c2189821An6 = null;
        }
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C12B2(this, c2189821An6, null), 3);
    }

    @Override // X.AbstractC1255880imo, X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        Integer num;
        this.mIsLoading = true;
        Object obj = objArr[0];
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            if (num.intValue() == 1) {
                this.mListQueryType = num.intValue();
                refreshList(Arrays.copyOf(objArr, objArr.length));
            } else {
                if (num.intValue() == 2) {
                    this.mListQueryType = 1;
                    refreshList(Arrays.copyOf(objArr, objArr.length));
                    return false;
                }
                if (num.intValue() == 4) {
                    this.mListQueryType = num.intValue();
                    loadMoreList(Arrays.copyOf(objArr, objArr.length));
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(com.ss.android.ugc.aweme.feed.model.Aweme r7, X.C2189821An6 r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12B3.LJIIJJI(com.ss.android.ugc.aweme.feed.model.Aweme, X.1An6, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[PHI: r10 r18
      0x0046: PHI (r10v1 java.lang.Long) = (r10v0 java.lang.Long), (r10v7 java.lang.Long), (r10v7 java.lang.Long) binds: [B:16:0x002a, B:18:0x0030, B:20:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r18v2 java.lang.String) = (r18v1 java.lang.String), (r18v9 java.lang.String), (r18v9 java.lang.String) binds: [B:16:0x002a, B:18:0x0030, B:20:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082 A[PHI: r10 r16 r18
      0x0082: PHI (r10v2 java.lang.Long) = (r10v6 java.lang.Long), (r10v7 java.lang.Long) binds: [B:26:0x0048, B:40:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r16v1 java.util.List) = (r16v4 java.util.List), (r16v5 java.util.List) binds: [B:26:0x0048, B:40:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r18v3 java.lang.String) = (r18v8 java.lang.String), (r18v9 java.lang.String) binds: [B:26:0x0048, B:40:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8 A[LOOP:1: B:45:0x00b2->B:47:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.CommonFeedRequest LJIIL(int r28, X.C2189821An6 r29, com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.model.ECInsertContent r30) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12B3.LJIIL(int, X.1An6, com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.model.ECInsertContent):com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.CommonFeedRequest");
    }

    public final void LJIIJ(Feed feed, Aweme aweme, int i, String str) {
        String str2;
        FeedExtra feedExtra = feed.extra;
        if (feedExtra == null || (str2 = feedExtra.recommendInfo) == null) {
            str2 = "";
        }
        int size = ((ArrayList) this.LLILZ).size() + i + 1;
        HashMap<String, String> mobParams = aweme.getMobParams();
        if (mobParams != null) {
            mobParams.put("request_id", str);
            mobParams.put("order", String.valueOf(size));
            mobParams.put("rec_params", str2);
            mobParams.put("rec_session_id", this.LLILLJJLI);
            mobParams.put("action_type", "draw");
        }
    }
}
