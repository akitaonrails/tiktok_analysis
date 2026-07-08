package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.allyearpaging.RecallAllYearMaterialApi;

/* JADX INFO: renamed from: X.0MGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565700MGq {
    public final RecallAllYearMaterialApi LIZ;

    public C565700MGq(RecallAllYearMaterialApi recallAllYearMaterialApi) {
        this.LIZ = recallAllYearMaterialApi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r7, int r8, int r9, X.InterfaceC1364105Vn<? super X.C485040J0k> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C0J11
            if (r0 == 0) goto L74
            r3 = r10
            X.0J11 r3 = (X.C0J11) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r5 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L66
            if (r0 != r1) goto L86
            X.C155000ia.LIZIZ(r5)
        L22:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.allyearpaging.LoadCelebrationMaterialResponse r5 = (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.allyearpaging.LoadCelebrationMaterialResponse) r5
            X.0sDa r0 = X.C1618440sDa.LIZIZ
            com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService r3 = r0.LJJLIIIJLLLLLLLZ()
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r5.awemes
            if (r2 != 0) goto L30
            X.13BV r2 = X.C13BV.INSTANCE
        L30:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0o1f r0 = r0.getAccountService()
            java.lang.String r1 = r0.getCurrentUserID()
            r0 = 2
            java.util.List r1 = r3.convertAwemeToForwardMedia(r2, r0, r1)
            if (r1 == 0) goto L7a
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L52:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r0 = (com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia) r0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel r0 = X.C565710MGr.LIZIZ(r0)
            r4.add(r0)
            goto L52
        L66:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.allyearpaging.RecallAllYearMaterialApi r0 = r6.LIZ
            r3.LLILLL = r1
            java.lang.Object r5 = r0.loadMaterial(r7, r8, r9, r3)
            if (r5 != r2) goto L22
            return r2
        L74:
            X.0J11 r3 = new X.0J11
            r3.<init>(r6, r10)
            goto L12
        L7a:
            X.13BV r4 = X.C13BV.INSTANCE
        L7c:
            long r2 = r5.cursor
            boolean r1 = r5.hasMore
            X.0J0k r0 = new X.0J0k
            r0.<init>(r4, r2, r1)
            return r0
        L86:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C565700MGq.LIZ(int, int, int, X.05Vn):java.lang.Object");
    }
}
