package X;

import com.ss.android.ugc.aweme.poi.detail.ai.PoiAiSummaryListSharedVM;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.010l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2641010l extends C09AY implements Function1<PoiDetailApi.PoiAiSummaryVideosInfo, Unit> {
    public final /* synthetic */ C259800zU<PoiDetailApi.PoiAiSummaryVideosInfo> LL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILLJJLI;
    public final /* synthetic */ PoiAiSummaryListSharedVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2641010l(C259800zU<PoiDetailApi.PoiAiSummaryVideosInfo> c259800zU, List<InterfaceC1891350zJl> list, PoiAiSummaryListSharedVM poiAiSummaryListSharedVM) {
        super(1);
        this.LL = c259800zU;
        this.LLILLJJLI = list;
        this.LLILLL = poiAiSummaryListSharedVM;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiAiSummaryVideosInfo] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PoiAiSummaryVideosInfo r10) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiAiSummaryVideosInfo r10 = (com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PoiAiSummaryVideosInfo) r10
            X.00zU<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiAiSummaryVideosInfo> r0 = r9.LL
            r0.element = r10
            java.util.List r0 = r10.getVideoInfoList()
            if (r0 == 0) goto L8c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L15:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiAiSubSummarySourceItem r0 = (com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PoiAiSubSummarySourceItem) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.aweme
            if (r0 == 0) goto L15
            r2.add(r0)
            goto L15
        L29:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r2, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L38:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            X.00rG r0 = new X.00rG
            r0.<init>(r1)
            r3.add(r0)
            goto L38
        L4d:
            boolean r0 = r3.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L66
            if (r3 == 0) goto L64
            java.util.List<X.0zJl> r1 = r9.LLILLJJLI
            com.ss.android.ugc.aweme.poi.detail.ai.PoiAiSummaryListSharedVM r0 = r9.LLILLL
            r1.addAll(r3)
            java.util.concurrent.CopyOnWriteArrayList<X.00rG> r0 = r0.LLILZLL
            r0.addAll(r3)
        L64:
            if (r3 == 0) goto L8c
        L66:
            java.util.Iterator r2 = r3.iterator()
        L6a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r2.next()
            X.00rG r0 = (X.C208800rG) r0
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r3 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            r4 = 0
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r1 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r1
            if (r1 == 0) goto L6a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LL
            r1.LLILLL(r0)
            goto L6a
        L8c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2641010l.invoke(java.lang.Object):java.lang.Object");
    }
}
