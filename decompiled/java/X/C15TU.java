package X;

import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.explore.ExploreClientExtra;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15TU, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15TU implements InterfaceC736910SvR<C15TN> {
    public final C15TZ LL;
    public final Set<Long> LLILLJJLI = new LinkedHashSet();
    public final C15TT LLILLL = new C15TT(this);

    @Override // X.InterfaceC736910SvR
    public final void release() {
        C15TZ c15tz = this.LL;
        c15tz.getClass();
        C2153908cD c2153908cD = C2153908cD.LIZ;
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(459);
        c2153908cD.getClass();
        C2153908cD.LIZIZ("explore_topic_feed_chunk_process_request", aFwS221S0000000_31);
        c15tz.LIZ.set(EnumC1568470quz.COMPLETE);
        c15tz.LIZIZ = null;
        C2296808zG.LIZJ(c15tz.LJFF, null);
        AnonymousClass0956 anonymousClass0956 = c15tz.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c15tz.LIZLLL = null;
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLL;
    }

    public C15TU(C15TZ c15tz) {
        this.LL = c15tz;
    }

    public static void LIZ(ExploreTopicAwemeListResponse exploreTopicAwemeListResponse) {
        List<Aweme> list;
        List<Aweme> list2;
        VideoUrlModel playAddr;
        VideoUrlModel playAddr2;
        String aid;
        C15UU c15uu = C15UU.LIZ;
        if (exploreTopicAwemeListResponse != null) {
            list = exploreTopicAwemeListResponse.items;
        } else {
            list = null;
        }
        c15uu.getClass();
        if (list != null) {
            Iterator<Aweme> it2 = list.iterator();
            while (it2 != null && it2.hasNext()) {
                Aweme next = it2.next();
                if (next == null || (aid = next.getAid()) == null || aid.length() == 0) {
                    it2.remove();
                }
            }
        }
        if (exploreTopicAwemeListResponse != null && (list2 = exploreTopicAwemeListResponse.items) != null) {
            for (Aweme aweme : list2) {
                AwemeBizExtKt.setExploreClientExtra(aweme, new ExploreClientExtra(0, null, false));
                Video video = aweme.getVideo();
                if (video == null || (playAddr2 = video.getPlayAddr()) == null || playAddr2.getSourceId() == null) {
                    Video video2 = aweme.getVideo();
                    if (video2 != null && (playAddr = video2.getPlayAddr()) != null) {
                        playAddr.setSourceId(aweme.getAid());
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[Catch: all -> 0x0119, TryCatch #1 {all -> 0x0119, blocks: (B:50:0x010e, B:51:0x0111, B:40:0x00dc, B:41:0x00df, B:43:0x00e3, B:45:0x00eb, B:18:0x005d, B:34:0x00bb, B:36:0x00c0, B:37:0x00c3, B:29:0x0084, B:31:0x0090, B:47:0x00f3), top: B:66:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3 A[Catch: all -> 0x0119, TryCatch #1 {all -> 0x0119, blocks: (B:50:0x010e, B:51:0x0111, B:40:0x00dc, B:41:0x00df, B:43:0x00e3, B:45:0x00eb, B:18:0x005d, B:34:0x00bb, B:36:0x00c0, B:37:0x00c3, B:29:0x0084, B:31:0x0090, B:47:0x00f3), top: B:66:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1 A[PHI: r11
      0x00f1: PHI (r11v9 java.lang.Object) = (r11v8 java.lang.Object), (r11v10 java.lang.Object) binds: [B:42:0x00e1, B:44:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.Long r23, java.lang.String r24, java.lang.String r25, X.C15TH r26, com.ss.android.ugc.aweme.explore.api.ExploreTopicFeedRequestOverride r27, kotlin.jvm.functions.Function0<kotlin.Unit> r28, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse, kotlin.Unit> r29, X.InterfaceC1364105Vn<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15TU.LIZIZ(java.lang.Long, java.lang.String, java.lang.String, X.15TH, com.ss.android.ugc.aweme.explore.api.ExploreTopicFeedRequestOverride, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
