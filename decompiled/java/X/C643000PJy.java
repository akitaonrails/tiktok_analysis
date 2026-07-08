package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.core.viewmodel.SearchLynxAwemeListRepoViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643000PJy extends C0PHI<SearchMixFeed> {
    public final C0PK0 LIZIZ = new C0PBX<SearchMixFeed>() { // from class: X.0PK0
        public final C0PBZ LIZIZ(Aweme aweme, SearchMixFeed searchMixFeed) {
            C640750PBh c640750PBh;
            C0DYF c0dyfVQ2;
            if (!Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "SearchLynxVideo") || aweme == null) {
                return null;
            }
            List<Aweme> awemeList = searchMixFeed.getDynamicPatch().getAwemeList();
            int i = 0;
            if (awemeList != null) {
                Iterator<Aweme> it2 = awemeList.iterator();
                int i2 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().getAid(), aweme.getAid())) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                c640750PBh = new C640750PBh(i2, null, false, 0, 14);
            } else {
                c640750PBh = null;
            }
            SearchLynxAwemeListRepoViewModel searchLynxAwemeListRepoViewModelLJI = C643000PJy.LJI();
            if (searchLynxAwemeListRepoViewModelLJI != null && (c0dyfVQ2 = searchLynxAwemeListRepoViewModelLJI.vQ2(searchMixFeed)) != null) {
                if (((ArrayList) c0dyfVQ2.LIZLLL).size() == 1 && Intrinsics.LJFF(((Aweme) ListProtector.get(c0dyfVQ2.LIZLLL, 0)).getAid(), aweme.getAid())) {
                    return C0PHQ.LIZ;
                }
                List<Aweme> list = c0dyfVQ2.LIZLLL;
                if (list == null) {
                    return null;
                }
                Iterator it3 = ((ArrayList) list).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (Intrinsics.LJFF(((Aweme) it3.next()).getAid(), aweme.getAid())) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                return new C640750PBh(i, null, false, 0, 14);
            }
            return c640750PBh;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00b4 A[SYNTHETIC] */
        @Override // X.C0PBX
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.C0PBZ LIZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r12, com.ss.android.ugc.aweme.feed.model.Aweme r13, X.C0PHW r14) {
            /*
                r11 = this;
                r5 = 0
                if (r14 == 0) goto L3e
                com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.LIZLLL()
            L7:
                com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.core.viewmodel.SearchLynxAwemeListRepoViewModel r0 = X.C643000PJy.LJI()
                if (r0 == 0) goto L3c
                X.0DYF r3 = r0.vQ2(r12)
            L11:
                java.lang.String r2 = "SearchLynxVideo"
                r6 = 0
                if (r3 == 0) goto L7d
                java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r3.LIZLLL
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                int r1 = r0.size()
                r0 = 1
                if (r1 != r0) goto L40
                java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r3.LIZLLL
                java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
                java.lang.String r0 = r0.getAid()
                if (r4 == 0) goto L33
                java.lang.String r5 = r4.getAid()
            L33:
                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
                if (r0 == 0) goto L40
                X.0PHQ r5 = X.C0PHQ.LIZ
                return r5
            L3c:
                r3 = r5
                goto L11
            L3e:
                r4 = r5
                goto L7
            L40:
                if (r4 == 0) goto Lc0
                java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getSearchFeedType(r4)
                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
                if (r0 == 0) goto L7f
                java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r3.LIZLLL
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                java.util.Iterator r2 = r0.iterator()
            L54:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L71
                java.lang.Object r0 = r2.next()
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
                java.lang.String r1 = r0.getAid()
                java.lang.String r0 = r4.getAid()
                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                if (r0 != 0) goto L72
                int r6 = r6 + 1
                goto L54
            L71:
                r6 = -1
            L72:
                X.0PBh r5 = new X.0PBh
                r7 = 0
                r8 = 0
                r10 = 14
                r9 = r8
                r5.<init>(r6, r7, r8, r9, r10)
                return r5
            L7d:
                if (r4 == 0) goto Lc0
            L7f:
                java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getSearchFeedType(r4)
                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
                if (r0 == 0) goto Lc0
                com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r12.getDynamicPatch()
                java.util.List r0 = r0.getAwemeList()
                if (r0 == 0) goto Lc0
                java.util.Iterator r2 = r0.iterator()
            L97:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto Lb4
                java.lang.Object r0 = r2.next()
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
                java.lang.String r1 = r0.getAid()
                java.lang.String r0 = r4.getAid()
                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                if (r0 != 0) goto Lb5
                int r6 = r6 + 1
                goto L97
            Lb4:
                r6 = -1
            Lb5:
                X.0PBh r5 = new X.0PBh
                r7 = 0
                r8 = 0
                r10 = 14
                r9 = r8
                r5.<init>(r6, r7, r8, r9, r10)
                return r5
            Lc0:
                X.0PBZ r5 = r11.LIZIZ(r13, r12)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C0PK0.LIZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed, com.ss.android.ugc.aweme.feed.model.Aweme, X.0PHW):X.0PBZ");
        }
    };
    public final C0PHM LIZJ = C0PHM.ALL_COLUMNS;
    public final C642240PHa LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0PK0] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0PK1] */
    public C643000PJy() {
        boolean z = true;
        this.LIZLLL = new C642240PHa(z, false, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, new C0PJP() { // from class: X.0PJw
            @Override // X.C0PJP
            public final boolean LIZIZ(C0PHX c0phx) {
                SearchLynxAwemeListRepoViewModel searchLynxAwemeListRepoViewModelLJI;
                C0DYF c0dyfVQ2;
                HashMap<String, Object> map;
                C0P7A c0p7a = c0phx.LIZ.LJIIIZ;
                c0phx.LJ();
                String str = c0phx.LJIIIZ;
                C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(SearchMixFeed.class));
                Object obj = null;
                if (c640970PCd != null && (map = c640970PCd.LIZ) != null) {
                    obj = map.get(str);
                }
                SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                if (searchMixFeed == null || (searchLynxAwemeListRepoViewModelLJI = C643000PJy.LJI()) == null || (c0dyfVQ2 = searchLynxAwemeListRepoViewModelLJI.vQ2(searchMixFeed)) == null) {
                    return false;
                }
                return c0dyfVQ2.LJ;
            }

            @Override // X.C0PJP
            public final void LIZ(C0PHX c0phx, AwS589S0100000_10 awS589S0100000_10, AwS589S0100000_10 awS589S0100000_102) {
                C0DYF c0dyfVQ2;
                LifecycleOwner lifecycleOwnerLJFF;
                HashMap<String, Object> map;
                C0P7A c0p7a = c0phx.LIZ.LJIIIZ;
                c0phx.LJ();
                String str = c0phx.LJIIIZ;
                C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(SearchMixFeed.class));
                Object obj = null;
                if (c640970PCd != null && (map = c640970PCd.LIZ) != null) {
                    obj = map.get(str);
                }
                SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                if (searchMixFeed == null) {
                    awS589S0100000_102.invoke(new IllegalStateException("no search mix feed found"));
                    return;
                }
                SearchLynxAwemeListRepoViewModel searchLynxAwemeListRepoViewModelLJI = C643000PJy.LJI();
                if (searchLynxAwemeListRepoViewModelLJI != null && (c0dyfVQ2 = searchLynxAwemeListRepoViewModelLJI.vQ2(searchMixFeed)) != null) {
                    AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                    if (abstractC1387200mCcLJ != null && (lifecycleOwnerLJFF = abstractC1387200mCcLJ.LJFF()) != null) {
                        C948503nH.LJ(lifecycleOwnerLJFF, C23271099x.INSTANCE, new C0DY6(c0dyfVQ2, c0phx, awS589S0100000_10, awS589S0100000_102, null));
                        return;
                    }
                    return;
                }
                awS589S0100000_102.invoke(new IllegalStateException("no repo found"));
            }
        }, new C0PIA() { // from class: X.0PK1
            @Override // X.C0PIA
            public final int LIZ(C0PHX c0phx) {
                SearchLynxAwemeListRepoViewModel searchLynxAwemeListRepoViewModelLJI;
                C0DYF c0dyfVQ2;
                HashMap<String, Object> map;
                C0P7A c0p7a = c0phx.LIZ.LJIIIZ;
                c0phx.LJ();
                String str = c0phx.LJIIIZ;
                C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(SearchMixFeed.class));
                Object obj = null;
                if (c640970PCd != null && (map = c640970PCd.LIZ) != null) {
                    obj = map.get(str);
                }
                SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                if (searchMixFeed == null || (searchLynxAwemeListRepoViewModelLJI = C643000PJy.LJI()) == null || (c0dyfVQ2 = searchLynxAwemeListRepoViewModelLJI.vQ2(searchMixFeed)) == null) {
                    return 0;
                }
                return c0dyfVQ2.LJFF;
            }

            @Override // X.C0PIA
            public final boolean LIZIZ(C0PHX c0phx, C0PHT c0pht) {
                SearchLynxAwemeListRepoViewModel searchLynxAwemeListRepoViewModelLJI;
                C0DYF c0dyfVQ2;
                HashMap<String, Object> map;
                C0P7A c0p7a = c0phx.LIZ.LJIIIZ;
                c0phx.LJ();
                String str = c0phx.LJIIIZ;
                C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(SearchMixFeed.class));
                Object obj = null;
                if (c640970PCd != null && (map = c640970PCd.LIZ) != null) {
                    obj = map.get(str);
                }
                SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                if (searchMixFeed == null || (searchLynxAwemeListRepoViewModelLJI = C643000PJy.LJI()) == null || (c0dyfVQ2 = searchLynxAwemeListRepoViewModelLJI.vQ2(searchMixFeed)) == null || !c0dyfVQ2.LJI) {
                    return true;
                }
                C0PHW c0phw = c0pht.LJ;
                c0phx.LJ();
                return !Intrinsics.LJFF(c0phw, C13LP.LJJLIIIJL(c0phx.LJIIJJI));
            }
        }, 3094);
    }

    public static final SearchLynxAwemeListRepoViewModel LJI() {
        return C0PK2.LIZ();
    }

    @Override // X.C0PHI
    public final C0PHM LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.C0PHI
    public final C0PBX<SearchMixFeed> LJ() {
        return this.LIZIZ;
    }

    @Override // X.C0PHI
    public final C642240PHa LJFF() {
        return this.LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    @Override // X.C0PHI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LIZIZ(X.InterfaceC594520NTm r8, X.C0PHT r9) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r8 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r8
            X.0PHW r0 = r9.LIZ()
            r6 = 0
            if (r0 == 0) goto L4f
            X.0PHX r1 = r0.LIZJ
            if (r1 == 0) goto L4f
            X.0PHT r0 = r1.LIZ
            X.0P7A r0 = r0.LJIIIZ
            r1.LJ()
            java.lang.String r2 = r1.LJIIIZ
            java.util.HashMap<X.13IQ<?>, X.0PCd> r1 = r0.LIZ
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed> r0 = com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed.class
            X.12Dl r0 = X.C13LE.LIZ(r0)
            java.lang.Object r0 = r1.get(r0)
            X.0PCd r0 = (X.C640970PCd) r0
            if (r0 == 0) goto L4d
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r0.LIZ
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r0.get(r2)
        L2e:
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r0 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r0
            if (r0 == 0) goto L4f
            int r1 = r0.retrieveIncrementalId()
            int r0 = r8.retrieveIncrementalId()
            if (r1 == r0) goto L4f
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r8.getDynamicPatch()
            java.lang.Boolean r1 = r0.getNeedGeneralSearchVideos()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4f
        L4c:
            return r6
        L4d:
            r0 = r6
            goto L2e
        L4f:
            com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.core.viewmodel.SearchLynxAwemeListRepoViewModel r0 = LJI()
            if (r0 == 0) goto L4c
            X.0DYF r0 = r0.vQ2(r8)
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = r0.LIZLLL
            if (r5 == 0) goto L4c
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r4 = r0.iterator()
            r1 = 0
        L65:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r3 = r4.next()
            int r2 = r1 + 1
            if (r1 < 0) goto L98
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.ss.android.ugc.aweme.feed.model.Aweme) r3
            boolean r0 = X.C1839507Ij.LIZ()
            if (r0 == 0) goto L84
            java.lang.String r1 = "search_result_id"
            java.lang.String r0 = r8.getProviderDocIdStr()
            com.ss.android.ugc.aweme.feed.model.AwemeExtKt.appendExtraParamUseInSearch(r3, r1, r0)
        L84:
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r8.getDynamicPatch()
            java.lang.String r1 = r0.getTokenType()
            java.lang.String r0 = "token_type"
            com.ss.android.ugc.aweme.feed.model.AwemeExtKt.appendExtraParamUseInSearch(r3, r0, r1)
            java.lang.String r0 = "SearchLynxVideo"
            com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.setSearchFeedType(r3, r0)
            r1 = r2
            goto L65
        L98:
            X.C1697810uHb.LJIJI()
            throw r6
        L9c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C643000PJy.LIZIZ(X.0NTm, X.0PHT):java.util.List");
    }
}
