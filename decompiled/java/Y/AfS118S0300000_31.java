package Y;

import X.AnonymousClass1553;
import X.C09JN;
import X.C0POE;
import X.C11RK;
import X.C1515820pY4;
import X.C1C7U;
import X.C204607154j;
import X.C259800zU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes32.dex */
public class AfS118S0300000_31 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS118S0300000_31 afS118S0300000_31, Object obj) {
        C1C7U.LIZ("ExploreTopicFeedApi@fc3e.queryCustomFeedWithChunk$3");
        C1515820pY4 c1515820pY4 = (C1515820pY4) obj;
        try {
            final C259800zU c259800zU = (C259800zU) afS118S0300000_31.l0;
            final C259800zU c259800zU2 = (C259800zU) afS118S0300000_31.l2;
            final C11RK c11rk = (C11RK) afS118S0300000_31.l1;
            c1515820pY4.LIZLLL(new C0POE<ExploreTopicAwemeListResponse>() { // from class: X.15Uc
                @Override // X.C0POE
                public final void onComplete() {
                    ExploreTopicAwemeListResponse exploreTopicAwemeListResponse = c259800zU.element;
                    ExploreTopicAwemeListResponse exploreTopicAwemeListResponse2 = exploreTopicAwemeListResponse;
                    if (exploreTopicAwemeListResponse2 != null) {
                        exploreTopicAwemeListResponse2.LLILLJJLI = false;
                    }
                    if (exploreTopicAwemeListResponse != null) {
                        c11rk.onNext(exploreTopicAwemeListResponse);
                    }
                    c11rk.onComplete();
                }

                @Override // X.C0POE
                public final void onFailed(Throwable th) {
                    ExploreTopicAwemeListResponse exploreTopicAwemeListResponse = c259800zU.element;
                    ExploreTopicAwemeListResponse exploreTopicAwemeListResponse2 = exploreTopicAwemeListResponse;
                    if (exploreTopicAwemeListResponse2 != null) {
                        exploreTopicAwemeListResponse2.LLILLJJLI = false;
                    }
                    if (exploreTopicAwemeListResponse != null) {
                        c11rk.onNext(exploreTopicAwemeListResponse);
                    }
                    C11RK<ExploreTopicAwemeListResponse> c11rk2 = c11rk;
                    if (th == null) {
                        th = new Throwable("chunk error");
                    }
                    c11rk2.onError(th);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[PHI: r0
                  0x0036: PHI (r0v2 com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse) = 
                  (r0v1 com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse)
                  (r0v11 com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse)
                 binds: [B:3:0x0008, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Type inference failed for: r0v9, types: [T] */
                @Override // X.C0POE
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onNext(com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse r3) {
                    /*
                        r2 = this;
                        com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse r3 = (com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse) r3
                        X.00zU<com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse> r1 = r2
                        T r0 = r1.element
                        com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse r0 = (com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse) r0
                        if (r0 != 0) goto L36
                        r0 = r3
                        if (r3 != 0) goto L36
                        r0 = 0
                    Le:
                        r1.element = r0
                        X.00zU<com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse> r0 = r2
                        T r1 = r0.element
                        com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse r1 = (com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse) r1
                        if (r1 == 0) goto L2e
                        r0 = 1
                        r1.LLILLJJLI = r0
                        r3 = r1
                    L1c:
                        X.11RK<com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse> r0 = r1
                        r0.onNext(r3)
                        X.00zU<com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse> r1 = r3
                        T r0 = r1.element
                        if (r0 != 0) goto L2d
                        X.00zU<com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse> r0 = r2
                        T r0 = r0.element
                        r1.element = r0
                    L2d:
                        return
                    L2e:
                        if (r3 != 0) goto L1c
                        com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse r3 = new com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse
                        r3.<init>()
                        goto L1c
                    L36:
                        com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse r0 = r0.LJ(r3)
                        goto Le
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20527615Uc.onNext(java.lang.Object):void");
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ExploreTopicAwemeListResponse exploreTopicAwemeListResponse = (ExploreTopicAwemeListResponse) ((C259800zU) afS118S0300000_31.l0).element;
            if (exploreTopicAwemeListResponse != null) {
                exploreTopicAwemeListResponse.LLILLJJLI = false;
                ((C11RK) afS118S0300000_31.l1).onNext(exploreTopicAwemeListResponse);
            }
            ((C11RK) afS118S0300000_31.l1).onError(th);
        }
        C1C7U.LIZIZ("ExploreTopicFeedApi@fc3e.queryCustomFeedWithChunk$3");
    }

    public static final void accept$1(AfS118S0300000_31 afS118S0300000_31, Object obj) {
        C1C7U.LIZ("RecommendRepo@8c93.getMoreMusicList$2$1");
        SuggestMusicList suggestMusicList = (SuggestMusicList) obj;
        AnonymousClass1553 anonymousClass1553 = (AnonymousClass1553) afS118S0300000_31.l0;
        ((List) afS118S0300000_31.l1).addAll(anonymousClass1553.LJFF(anonymousClass1553.LLILLJJLI, new C204607154j(suggestMusicList.musicList, 0L, 0, suggestMusicList.cursor, suggestMusicList.hasMore, suggestMusicList.fromRecommend.booleanValue(), ((AnonymousClass1553) afS118S0300000_31.l0).LLILLJJLI.LIZIZ, suggestMusicList.logPb, 134)));
        ((CountDownLatch) afS118S0300000_31.l2).countDown();
        C1C7U.LIZIZ("RecommendRepo@8c93.getMoreMusicList$2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS118S0300000_31(Object obj, AnonymousClass1553 anonymousClass1553, List<MusicModel> list, CountDownLatch countDownLatch) {
        this.$t = countDownLatch;
        this.l0 = obj;
        this.l1 = anonymousClass1553;
        this.l2 = list;
    }
}
