package X;

import com.ss.android.ugc.aweme.im.common.experiment.DMTypingRecommendationConfig;

/* JADX INFO: renamed from: X.0Hox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452610Hox implements InterfaceC452410Hod {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final DMTypingRecommendationConfig LL = C452450Hoh.LIZ();
    public volatile InterfaceC452460Hoi LLILLJJLI;
    public volatile C452530Hop LLILLL;
    public volatile InterfaceC1808720xAU LLILZ;
    public volatile C452540Hoq LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C452610Hox.class, "typingRecommendStickerAnalytics", "getTypingRecommendStickerAnalytics()Lcom/ss/android/ugc/aweme/analytics/ITypingRecommendStickerAnalytics;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C452610Hox.class, "dbCache", "getDbCache()Lcom/ss/android/ugc/aweme/data/TypingRecommendationDBCache;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C452610Hox.class, "inMemoryCache", "getInMemoryCache()Lcom/ss/android/ugc/aweme/im/sticker/api/cache/TypingRecommendationStickerCache;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C452610Hox.class, "inMemoryTypingRecommendationCache", "getInMemoryTypingRecommendationCache()Lcom/ss/android/ugc/aweme/data/TypingRecommendationCache;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final InterfaceC452600How LIZ() {
        C452530Hop c452530Hop = this.LLILLL;
        if (c452530Hop == null) {
            synchronized (this) {
                c452530Hop = this.LLILLL;
                if (c452530Hop == null) {
                    C452530Hop c452530Hop2 = (C452530Hop) C1807670x8n.LJJJI();
                    this.LLILLL = c452530Hop2;
                    return c452530Hop2;
                }
            }
        }
        return c452530Hop;
    }

    public final InterfaceC452360HoY LIZIZ() {
        C452540Hoq c452540Hoq = this.LLILZIL;
        if (c452540Hoq == null) {
            synchronized (this) {
                c452540Hoq = this.LLILZIL;
                if (c452540Hoq == null) {
                    C452540Hoq c452540Hoq2 = (C452540Hoq) C1807670x8n.LJJJ();
                    this.LLILZIL = c452540Hoq2;
                    return c452540Hoq2;
                }
            }
        }
        return c452540Hoq;
    }

    public final InterfaceC452460Hoi LIZJ() {
        InterfaceC452460Hoi interfaceC452460Hoi = this.LLILLJJLI;
        if (interfaceC452460Hoi == null) {
            synchronized (this) {
                interfaceC452460Hoi = this.LLILLJJLI;
                if (interfaceC452460Hoi == null) {
                    InterfaceC452460Hoi interfaceC452460Hoi2 = (InterfaceC452460Hoi) C1807670x8n.LLLLLLL();
                    this.LLILLJJLI = interfaceC452460Hoi2;
                    return interfaceC452460Hoi2;
                }
            }
        }
        return interfaceC452460Hoi;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @Override // X.InterfaceC452410Hod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uy(java.lang.String r39, java.lang.String r40, boolean r41, com.ss.android.ugc.aweme.model.IMPersonalizedRecommendationParams r42, java.lang.String r43, boolean r44, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.model.TypingRecommendationResponse>> r45) {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452610Hox.uy(java.lang.String, java.lang.String, boolean, com.ss.android.ugc.aweme.model.IMPersonalizedRecommendationParams, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
