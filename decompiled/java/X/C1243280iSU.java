package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.discovery.api.MusicChartVideosV1Response;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0iSU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243280iSU extends AbstractC1255880imo<Aweme, MusicChartVideosV1Response> {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        List<Aweme> list;
        T t = this.mData;
        if (t == 0 || (list = ((MusicChartVideosV1Response) t).videos) == null || list.isEmpty()) {
            return null;
        }
        return ((MusicChartVideosV1Response) this.mData).videos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        Integer num;
        T t = this.mData;
        return (t == 0 || ((num = ((MusicChartVideosV1Response) t).hasMore) != null && num.intValue() == 0)) && C086I.LIZIZ(getItems());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        Integer num;
        T t = this.mData;
        return (t == 0 || (num = ((MusicChartVideosV1Response) t).hasMore) == null || num.intValue() != 1) ? false : true;
    }

    public final void LJIIJ(int i) {
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLILZIL.getValue(), null, null, new C1219430hq1(this, i, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, com.ss.android.ugc.aweme.music.discovery.api.MusicChartVideosV1Response] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, com.ss.android.ugc.aweme.music.discovery.api.MusicChartVideosV1Response] */
    @Override // X.AbstractC666100QAu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(java.lang.Object r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.music.discovery.api.MusicChartVideosV1Response r8 = (com.ss.android.ugc.aweme.music.discovery.api.MusicChartVideosV1Response) r8
            r4 = 0
            if (r8 == 0) goto L43
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r8.videos
        L7:
            r2 = 1
            if (r8 == 0) goto L13
            r1 = 0
            if (r3 == 0) goto L13
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L14
        L13:
            r1 = 1
        L14:
            r7.mIsNewDataEmpty = r1
            if (r1 != 0) goto L42
            if (r3 == 0) goto L42
            int r1 = r7.mListQueryType
            if (r1 == r2) goto L45
            r0 = 4
            if (r1 != r0) goto L42
            T r0 = r7.mData
            com.ss.android.ugc.aweme.music.discovery.api.MusicChartVideosV1Response r0 = (com.ss.android.ugc.aweme.music.discovery.api.MusicChartVideosV1Response) r0
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r0.videos
            if (r1 == 0) goto L33
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r8.videos
            if (r0 != 0) goto L2f
            X.13BV r0 = X.C13BV.INSTANCE
        L2f:
            java.util.List r4 = X.C13LP.LJLIL(r0, r1)
        L33:
            java.lang.Integer r2 = r8.statusCode
            java.lang.String r3 = r8.msg
            java.lang.Integer r5 = r8.cursor
            java.lang.Integer r6 = r8.hasMore
            com.ss.android.ugc.aweme.music.discovery.api.MusicChartVideosV1Response r1 = new com.ss.android.ugc.aweme.music.discovery.api.MusicChartVideosV1Response
            r1.<init>(r2, r3, r4, r5, r6)
            r7.mData = r1
        L42:
            return
        L43:
            r3 = r4
            goto L7
        L45:
            r7.mData = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1243280iSU.handleData(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        Integer num;
        int iIntValue = 0;
        if (!isDataEmpty() && (num = ((MusicChartVideosV1Response) this.mData).cursor) != null) {
            iIntValue = num.intValue();
        }
        LJIIJ(iIntValue);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        LJIIJ(0);
    }

    public C1243280iSU(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        this.LLILLL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3158));
        this.LLILZIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(723));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(int r7, java.lang.String r8, java.lang.String r9, X.InterfaceC1364105Vn r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C1219420hq0
            if (r0 == 0) goto L20
            r4 = r10
            X.0hq0 r4 = (X.C1219420hq0) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L68
        L20:
            X.0hq0 r4 = new X.0hq0
            r4.<init>(r6, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L6e
            r2.<init>()     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = "music_id"
            r2.put(r0, r8)     // Catch: java.lang.Exception -> L6e
            java.lang.String r1 = "source"
            java.lang.String r0 = "music_trending_hashtag_videos"
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L6e
            java.lang.String r1 = "count"
            java.lang.String r0 = "30"
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L6e
            java.lang.String r1 = "cursor"
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L6e
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = "hashtag_id"
            r2.put(r0, r9)     // Catch: java.lang.Exception -> L6e
            X.01GW r0 = r6.LLILZ     // Catch: java.lang.Exception -> L6e
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L6e
            com.ss.android.ugc.aweme.music.discovery.api.MusicChartApi r0 = (com.ss.android.ugc.aweme.music.discovery.api.MusicChartApi) r0     // Catch: java.lang.Exception -> L6e
            r4.LLILLL = r3     // Catch: java.lang.Exception -> L6e
            java.lang.Object r1 = r0.getVideoListByMusicId(r2, r4)     // Catch: java.lang.Exception -> L6e
            if (r1 != r5) goto L6b
            return r5
        L68:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L6e
        L6b:
            com.ss.android.ugc.aweme.music.discovery.api.MusicChartVideosV1Response r1 = (com.ss.android.ugc.aweme.music.discovery.api.MusicChartVideosV1Response) r1     // Catch: java.lang.Exception -> L6e
            return r1
        L6e:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.140q r1 = X.C201962140q.LIZIZ
            java.lang.String r0 = "request /tiktok/music/chart/videos/v1/ error"
            X.C201955140j.LJIIJ(r1, r0, r2)
            com.ss.android.ugc.aweme.music.discovery.api.MusicChartVideosV1Response r0 = new com.ss.android.ugc.aweme.music.discovery.api.MusicChartVideosV1Response
            r1 = 0
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1243280iSU.LJIIJJI(int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
