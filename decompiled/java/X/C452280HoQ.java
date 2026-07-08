package X;

import androidx.lifecycle.LifecycleCoroutineScope;

/* JADX INFO: renamed from: X.0HoQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452280HoQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
    public final InterfaceC497601wk LIZ;
    public final InterfaceC452320HoU LIZIZ;
    public final InterfaceC452240HoM LIZJ;
    public C452330HoV LIZLLL;
    public AnonymousClass0956 LJ;
    public String LJFF = "";
    public long LJI;
    public volatile C452610Hox LJII;
    public volatile C0XJN LJIIIIZZ;
    public volatile C452540Hoq LJIIIZ;
    public volatile C452530Hop LJIIJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C452280HoQ.class, "typingRecommendation", "getTypingRecommendation()Lcom/ss/android/ugc/aweme/ability/ITypingRecommendation;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C452280HoQ.class, "inputFormatAbility", "getInputFormatAbility()Lcom/ss/android/ugc/aweme/ability/ITypingRecommendationInputFormatAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C452280HoQ.class, "typingRecommendationCache", "getTypingRecommendationCache()Lcom/ss/android/ugc/aweme/data/TypingRecommendationCache;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C452280HoQ.class, "typingRecommendationDBCache", "getTypingRecommendationDBCache()Lcom/ss/android/ugc/aweme/data/TypingRecommendationDBCache;", 0);
        c09r3.getClass();
        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final InterfaceC452350HoX LIZ() {
        C0XJN c0xjn = this.LJIIIIZZ;
        if (c0xjn == null) {
            synchronized (this) {
                c0xjn = this.LJIIIIZZ;
                if (c0xjn == null) {
                    C0XJN c0xjn2 = (C0XJN) C1807670x8n.LJJIJIIJI();
                    this.LJIIIIZZ = c0xjn2;
                    return c0xjn2;
                }
            }
        }
        return c0xjn;
    }

    public final InterfaceC452360HoY LIZIZ() {
        C452540Hoq c452540Hoq = this.LJIIIZ;
        if (c452540Hoq == null) {
            synchronized (this) {
                c452540Hoq = this.LJIIIZ;
                if (c452540Hoq == null) {
                    C452540Hoq c452540Hoq2 = (C452540Hoq) C1807670x8n.LJJJ();
                    this.LJIIIZ = c452540Hoq2;
                    return c452540Hoq2;
                }
            }
        }
        return c452540Hoq;
    }

    public final void LIZJ(String str) {
        if (this.LIZIZ.isLandscapeMode()) {
            return;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new C452330HoV(0);
        }
        if (str != null && str.length() != 0) {
            LIZLLL(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r4 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c3, code lost:
    
        if (r7.LIZJ() != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d4, code lost:
    
        if (r4 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f8, code lost:
    
        if (X.C439870HMr.LIZIZ(X.C1350750lFp.LIZIZ(r6)) == 1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.CharSequence r16) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452280HoQ.LIZLLL(java.lang.CharSequence):void");
    }

    public C452280HoQ(LifecycleCoroutineScope lifecycleCoroutineScope, C452270HoP c452270HoP, C452180HoG c452180HoG) {
        this.LIZ = lifecycleCoroutineScope;
        this.LIZIZ = c452270HoP;
        this.LIZJ = c452180HoG;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C452330HoV r9, java.lang.String r10, long r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452280HoQ.LJ(X.0HoV, java.lang.String, long, X.05Vn):java.lang.Object");
    }
}
