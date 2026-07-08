package X;

import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchResponse;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0Ies, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C471840Ies {
    public final InterfaceC471870Iev<LiveSearchStruct> LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public long LJFF;
    public LiveSearchResponse LJII;
    public C11JF LJIIIIZZ;
    public String LIZLLL = "";
    public String LJ = "";
    public boolean LJI = true;
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(12));
    public String LJIIJ = "normal_search";
    public final C0IZG LJIIJJI = new C0IZG(new InterfaceC471880Iew() { // from class: X.0Ieu
        @Override // X.InterfaceC471880Iew
        public final void LIZ(boolean z) {
            C471840Ies c471840Ies = this.LIZ;
            c471840Ies.LIZIZ = false;
            if (!z && c471840Ies.LJII == null) {
                c471840Ies.LIZ.wv();
            } else {
                c471840Ies.LIZ.showLoadMoreError();
            }
        }

        @Override // X.InterfaceC471880Iew
        public final void LIZJ(boolean z) {
            C471840Ies c471840Ies = this.LIZ;
            c471840Ies.LIZIZ = false;
            if (!z && c471840Ies.LJII == null) {
                c471840Ies.LIZ.wv();
            } else {
                c471840Ies.LIZ.showLoadMoreError();
            }
        }

        @Override // X.InterfaceC471880Iew
        public final void LIZIZ(C472040IfC c472040IfC, boolean z) {
            this.LIZ.LIZIZ = false;
            boolean z2 = c472040IfC.hasMore;
            List<LiveSearchStruct> list = c472040IfC.liveList;
            if (list != null && (!list.isEmpty())) {
                C471840Ies c471840Ies = this.LIZ;
                c471840Ies.LJII = c472040IfC;
                if (z) {
                    c471840Ies.LIZ.Rg(list, z2, EnumC471940If2.FEED_LOAD_MORE);
                    return;
                } else {
                    c471840Ies.LIZ.Rg(list, z2, EnumC471940If2.FEED_REFRESH);
                    return;
                }
            }
            C471840Ies c471840Ies2 = this.LIZ;
            if (!z && c471840Ies2.LJII == null) {
                c471840Ies2.LIZ.wv();
            } else {
                c471840Ies2.LIZ.showLoadMoreError();
            }
        }
    });

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Ieu] */
    public C471840Ies(InterfaceC471870Iev<LiveSearchStruct> interfaceC471870Iev) {
        this.LIZ = interfaceC471870Iev;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final java.lang.String r20, final boolean r21) {
        /*
            r19 = this;
            r3 = r19
            X.0IZG r8 = r3.LJIIJJI
            java.lang.String r10 = r3.LJ
            java.lang.String r11 = r3.LJIIJ
            r0 = 0
            r12 = r21
            if (r12 != 0) goto Lf
            r8.LIZIZ = r0
        Lf:
            com.bytedance.android.live.base.model.feed.FeedExtra r1 = r8.LIZIZ
            r2 = 1
            r4 = 0
            if (r1 == 0) goto L1d
            boolean r0 = r1.hasMore
            if (r0 != 0) goto L1d
        L19:
            r2 = 0
        L1a:
            r3.LIZIZ = r2
            return
        L1d:
            boolean r0 = r8.LIZJ
            if (r0 != 0) goto L19
            r6 = 0
            if (r1 == 0) goto La8
            long r15 = r1.maxTime
            long r0 = r1.maxTime
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 == 0) goto Laa
            java.lang.String r17 = "drawer_loadmore"
        L2f:
            X.0IdW r0 = X.C471000IdW.LJ()
            java.util.List r1 = r0.LIZJ()
            if (r1 == 0) goto L54
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L54
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r4)
            com.bytedance.android.livesdk.model.ItemTab r0 = (com.bytedance.android.livesdk.model.ItemTab) r0
            java.lang.String r14 = r0.getUrl()
            if (r14 == 0) goto L54
            boolean r0 = kotlin.text.a0.LJJJIL(r14)
            if (r0 == 0) goto L56
        L54:
            java.lang.String r14 = "/webcast/feed/?content_type=0&channel_id=96"
        L56:
            X.0Ism r1 = X.C480460Ism.LIZ()
            java.lang.Class<com.bytedance.android.feed.api.FeedApi> r0 = com.bytedance.android.feed.api.FeedApi.class
            r1.getClass()
            java.lang.Object r13 = X.C480460Ism.LIZLLL(r0)
            com.bytedance.android.feed.api.FeedApi r13 = (com.bytedance.android.feed.api.FeedApi) r13
            java.util.LinkedHashMap r18 = new java.util.LinkedHashMap
            r18.<init>()
            X.11NZ r1 = r13.feed(r14, r15, r17, r18)
            X.0IOb<T, R> r0 = new X.InterfaceC1487280oo2() { // from class: X.0IOb
                static {
                    /*
                        X.0IOb r0 = new X.0IOb
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0IOb<T, R>) X.0IOb.LL X.0IOb
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C465710IOb.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C465710IOb.<init>():void");
                }

                @Override // X.InterfaceC1487280oo2
                public final java.lang.Object apply(java.lang.Object r3) {
                    /*
                        r2 = this;
                        com.bytedance.android.live.network.response.BaseListResponse r3 = (com.bytedance.android.live.network.response.BaseListResponse) r3
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>()
                        java.util.List<T> r0 = r3.data
                        if (r0 == 0) goto Le
                        r1.addAll(r0)
                    Le:
                        R extends com.bytedance.android.livesdk.model.Extra r0 = r3.extra
                        android.util.Pair r0 = android.util.Pair.create(r1, r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C465710IOb.apply(java.lang.Object):java.lang.Object");
                }
            }
            X.11ON r4 = r1.LJJJJZI(r0)
            Y.AfS176S0100000_7 r1 = new Y.AfS176S0100000_7
            r0 = 12
            r1.<init>(r8, r0)
            X.11JN r1 = r4.LJJIJIIJIL(r1)
            r8.LIZJ = r2
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r4 = r1.LJJJLZIJ(r0)
            X.0Iex r7 = new X.0Iex
            r9 = r20
            r7.<init>()
            Y.AfS55S0110000_7 r1 = new Y.AfS55S0110000_7
            r0 = 0
            r1.<init>(r8, r12, r0)
            X.01kM r0 = r4.LJJLL(r7, r1)
            X.11JF r0 = (X.C11JF) r0
            r8.LIZLLL = r0
            goto L1a
        La8:
            r15 = 0
        Laa:
            java.lang.String r17 = "drawer_refresh"
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C471840Ies.LIZ(java.lang.String, boolean):void");
    }

    public final void LIZIZ(LiveSearchResponse liveSearchResponse, long j, String str, String str2) {
        String str3;
        List<LiveSearchStruct> list;
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        String strLIZ = null;
        if (liveSearchResponse != null && (list = liveSearchResponse.liveList) != null && !list.isEmpty()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_search");
        c474500IjALIZ.LJJII(C472230IfV.LIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(C472230IfV.LIZIZ(), "enter_method");
        if (liveSearchResponse != null) {
            strLIZ = liveSearchResponse.LIZ();
        }
        if (strLIZ == null) {
            strLIZ = "";
        }
        c474500IjALIZ.LJJII(strLIZ, "search_id");
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "search_keyword");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
        c474500IjALIZ.LJJII(C472230IfV.LIZJ(this.LJIIJ), "search_type");
        c474500IjALIZ.LJJII(str3, "is_success");
        c474500IjALIZ.LJJII(str2, "pre_search_id");
        c474500IjALIZ.LIZ();
    }
}
