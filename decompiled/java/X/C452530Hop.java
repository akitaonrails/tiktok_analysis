package X;

import Y.AObjectS59S0000000_6;
import com.ss.android.ugc.aweme.data.TypingRecommendationCacheData;

/* JADX INFO: renamed from: X.0Hop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452530Hop extends AbstractC2202061BGi<C452490Hol> implements InterfaceC452600How {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public volatile C2202081BGk LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C452530Hop.class, "data", "getData()Lknit/Loadable;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC2202061BGi
    public final C2202081BGk<C452490Hol> getData() {
        C2202081BGk<C452490Hol> c2202081BGk = this.LIZ;
        if (c2202081BGk == null) {
            synchronized (this) {
                c2202081BGk = this.LIZ;
                if (c2202081BGk == null) {
                    C2202081BGk<C452490Hol> c2202081BGk2 = new C2202081BGk<>(new AObjectS59S0000000_6(this, 4));
                    this.LIZ = c2202081BGk2;
                    return c2202081BGk2;
                }
            }
        }
        return c2202081BGk;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.data.TypingRecommendationCacheData>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C452520Hoo
            if (r0 == 0) goto L3d
            r4 = r8
            X.0Hoo r4 = (X.C452520Hoo) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L43
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
        L28:
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            java.lang.Object r0 = r5.getUserScopeObject()
            X.0Hol r0 = (X.C452490Hol) r0
            if (r0 == 0) goto L4b
            r4.LLILLL = r1
            java.lang.Object r0 = r0.LIZ(r6, r7, r4)
            if (r0 != r2) goto L28
            return r2
        L3d:
            X.0Hoo r4 = new X.0Hoo
            r4.<init>(r5, r8)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L4b:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452530Hop.LJIILJJIL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJIILL(String str, String str2, TypingRecommendationCacheData typingRecommendationCacheData) {
        C452490Hol userScopeObject = getUserScopeObject();
        if (userScopeObject != null) {
            userScopeObject.LJ(str, str2, typingRecommendationCacheData);
        }
    }
}
