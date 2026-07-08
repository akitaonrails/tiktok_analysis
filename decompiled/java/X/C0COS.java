package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0COS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0COS extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0COS(String str) {
        super(0);
        this.LL = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r4 = this;
            java.lang.String r0 = r4.LL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r0 != 0) goto L57
            X.01GW r1 = X.C0COR.LIZ
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.feed.experiment.SurfaceViewPage r0 = (com.ss.android.ugc.aweme.feed.experiment.SurfaceViewPage) r0
            r2 = 1
            if (r0 == 0) goto L5c
            java.util.List<java.lang.String> r0 = r0.pages
            if (r0 == 0) goto L5c
            int r0 = r0.size()
            if (r0 <= r2) goto L5c
        L1e:
            boolean r0 = X.C1481060oe0.LJI()
            if (r0 == 0) goto L57
        L24:
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.feed.experiment.SurfaceViewPage r0 = (com.ss.android.ugc.aweme.feed.experiment.SurfaceViewPage) r0
            if (r0 == 0) goto L38
            java.util.List<java.lang.String> r1 = r0.pages
            if (r1 == 0) goto L38
            java.lang.String r0 = r4.LL
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 != 0) goto L56
        L38:
            java.lang.String r1 = r4.LL
            X.01GW r0 = X.C0COR.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.experiment.SurfaceViewPageWithMap r0 = (com.ss.android.ugc.aweme.feed.experiment.SurfaceViewPageWithMap) r0
            if (r0 == 0) goto L57
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.pagesWithMap
            if (r0 == 0) goto L57
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L57
            int r0 = r0.intValue()
            if (r0 != r2) goto L57
        L56:
            r3 = 1
        L57:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L5c:
            X.01GW r0 = X.C0COR.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.experiment.SurfaceViewPageWithMap r0 = (com.ss.android.ugc.aweme.feed.experiment.SurfaceViewPageWithMap) r0
            if (r0 == 0) goto L24
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.pagesWithMap
            if (r0 == 0) goto L24
            int r0 = r0.size()
            if (r0 <= r2) goto L24
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0COS.invoke():java.lang.Object");
    }
}
