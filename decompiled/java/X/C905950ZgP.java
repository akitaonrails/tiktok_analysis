package X;

import com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent;
import com.ss.android.ugc.aweme.im.streaming.api.StreamingResponseData;
import java.util.Set;

/* JADX INFO: renamed from: X.0ZgP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905950ZgP implements InterfaceC905750Zg5 {
    public static final /* synthetic */ int LIZLLL = 0;
    public final EnumC542860LQu LIZ;
    public final InterfaceC906020ZgW LIZIZ;
    public final InterfaceC906010ZgV LIZJ;

    @Override // X.InterfaceC905750Zg5
    public final void LIZ(Set<String> set) {
        this.LIZJ.LIZ(set);
    }

    @Override // X.InterfaceC905750Zg5
    public final void LIZIZ(String str) {
        this.LIZJ.LIZIZ(str);
    }

    @Override // X.InterfaceC905750Zg5
    public final void LJJIIJ(String str) {
        this.LIZIZ.cancel();
    }

    @Override // X.InterfaceC905750Zg5
    public final C905810ZgB LJFF(C869590Y9l c869590Y9l, RetryInfoComponent retryInfoComponent) {
        C875220YVc c875220YVcLIZJ;
        InterfaceC905820ZgC c905860ZgG;
        C875220YVc c875220YVc = null;
        if (!C0ZDX.LJJJJJL(c869590Y9l)) {
            return null;
        }
        String uuid = c869590Y9l.getUuid();
        Object localCache = c869590Y9l.getLocalCache(600);
        if (!(localCache instanceof C875220YVc) || (c875220YVcLIZJ = (C875220YVc) localCache) == null) {
            c875220YVcLIZJ = this.LIZJ.LIZJ(c869590Y9l);
            if (c875220YVcLIZJ != null) {
                c869590Y9l.putLocalCache(600, c875220YVcLIZJ);
                c875220YVc = c875220YVcLIZJ;
            }
        } else {
            c875220YVc = c875220YVcLIZJ;
        }
        C095D c095d = new C095D(new C905910ZgL(c875220YVc, this, c869590Y9l, retryInfoComponent, null));
        if (c875220YVc == null) {
            c905860ZgG = C905870ZgH.LIZ;
        } else {
            StreamingResponseData streamingResponseData = c875220YVc.LIZIZ;
            if (streamingResponseData.isFinish) {
                if (c875220YVc.LIZLLL) {
                    c905860ZgG = new C905840ZgE(c875220YVc.LIZ);
                } else {
                    c905860ZgG = new C905850ZgF(c875220YVc.LIZ);
                }
            } else if (streamingResponseData.errorCode != 0) {
                StreamingResponseData streamingResponseData2 = c875220YVc.LIZIZ;
                c905860ZgG = new C905830ZgD(new C589290N9j(streamingResponseData2.errorCode, streamingResponseData2.errorMessage), c875220YVc.LIZ);
            } else {
                c905860ZgG = new C905860ZgG(c875220YVc.LIZ);
            }
        }
        return new C905810ZgB(uuid, c095d, c905860ZgG);
    }

    public C905950ZgP(EnumC542860LQu enumC542860LQu, C906660ZhY c906660ZhY, C0YVE c0yve) {
        this.LIZ = enumC542860LQu;
        this.LIZIZ = c906660ZhY;
        this.LIZJ = c0yve;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[PHI: r9
      0x0080: PHI (r9v6 java.lang.String) = (r9v1 java.lang.String), (r9v7 java.lang.String) binds: [B:21:0x007e, B:19:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[PHI: r9
      0x008c: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v6 java.lang.String), (r9v6 java.lang.String) binds: [B:21:0x007e, B:23:0x0084, B:25:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0 A[PHI: r9 r10
      0x00a0: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v6 java.lang.String) binds: [B:29:0x009e, B:25:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a0: PHI (r10v5 java.lang.Long) = (r10v1 java.lang.Long), (r10v6 java.lang.Long) binds: [B:29:0x009e, B:25:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[PHI: r9 r10
      0x00a4: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v5 java.lang.String) binds: [B:29:0x009e, B:31:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r10v4 java.lang.Long) = (r10v1 java.lang.Long), (r10v5 java.lang.Long) binds: [B:29:0x009e, B:31:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    @Override // X.InterfaceC905750Zg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C869590Y9l r16, com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent r17, X.InterfaceC1364105Vn<? super X.C905810ZgB> r18) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C905950ZgP.LIZLLL(X.0Y9l, com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    @Override // X.InterfaceC905750Zg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C906000ZgU
            if (r0 == 0) goto L3a
            r4 = r8
            X.0ZgU r4 = (X.C906000ZgU) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L40
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0ZgW r0 = r5.LIZIZ
            r0.cancel()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2a:
            X.C155000ia.LIZIZ(r3)
            X.0ZgV r0 = r5.LIZJ
            r4.LL = r6
            r4.LLILZ = r1
            java.lang.Object r0 = r0.LJ(r6, r7, r4)
            if (r0 != r2) goto L22
            return r2
        L3a:
            X.0ZgU r4 = new X.0ZgU
            r4.<init>(r5, r8)
            goto L12
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C905950ZgP.LJ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    @Override // X.InterfaceC905750Zg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r25, long r26, java.lang.String r28, java.lang.Long r29, int r30, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.im.streaming.api.StreamingInterruptResponseData>> r31) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C905950ZgP.LJI(java.lang.String, long, java.lang.String, java.lang.Long, int, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC905750Zg5
    public final C095D LIZJ(String str, String str2, Long l, String str3, long j, String str4, RetryInfoComponent retryInfoComponent) {
        return new C095D(new C905930ZgN(this, str, str2, l, str3, j, str4, retryInfoComponent, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(59:0|2|(2:4|(1:6)(1:15))(0)|7|(1:(5:(2:302|(1:(1:(56:14|16|264|151|294|36|(1:38)(1:39)|40|(2:42|44)(1:43)|(1:46)|47|292|48|(44:298|50|(2:52|54)|(1:56)|57|290|58|256|59|270|60|258|61|262|62|284|63|288|64|329|65|321|66|323|67|325|68|333|69|72|327|73|(2:75|156)|300|76|304|77|308|78|335|79|337|80|81)|53|(0)|57|290|58|256|59|270|60|258|61|262|62|284|63|288|64|329|65|321|66|323|67|325|68|333|69|72|327|73|(0)|300|76|304|77|308|78|335|79|337|80|81)(2:17|18))(13:19|20|311|188|309|189|(1:191)(1:195)|192|(2:194|196)|197|306|198|199))(16:21|22|313|185|(1:187)|311|188|309|189|(0)(0)|192|(0)|197|306|198|199))(14:25|331|26|300|76|304|77|308|78|335|79|337|80|81)|340|(3:296|250|339)|(1:254)|255)(1:34))(2:31|(1:33))|35|294|36|(0)(0)|40|(0)(0)|(0)|47|292|48|(0)|53|(0)|57|290|58|256|59|270|60|258|61|262|62|284|63|288|64|329|65|321|66|323|67|325|68|333|69|72|327|73|(0)|300|76|304|77|308|78|335|79|337|80|81|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0361, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0362, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0364, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0365, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0367, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0368, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x036a, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x036b, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x036d, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x036e, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0370, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0371, code lost:
    
        r8 = r8;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0374, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0375, code lost:
    
        r8 = r8;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0377, code lost:
    
        r8 = r8;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03a2, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03a7, code lost:
    
        r0 = X.C1597206Ne.LIZ;
        r24 = X.EnumC905990ZgT.ERROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03af, code lost:
    
        r25 = java.lang.System.currentTimeMillis() - r7.element;
        r0 = r10.element;
        r29 = r6.size();
        r13 = ((X.C1887807aO) r4.element).LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03c2, code lost:
    
        r0 = r5.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03c7, code lost:
    
        r33 = r43.LIZ.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03d1, code lost:
    
        if ((r3 instanceof X.C906040ZgY) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03d3, code lost:
    
        r0 = ((X.C906040ZgY) r3).LL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03d8, code lost:
    
        r35 = X.C2286608xc.LJ(r0);
        r36 = r3.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03e0, code lost:
    
        if (r36 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03e3, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03e5, code lost:
    
        r36 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03e7, code lost:
    
        X.C1597206Ne.LIZ(r8, r24, r25, r0, r29, r13, r0, r33, r9, r35, r36, (java.lang.Integer) r12.element, com.bytedance.speech.speechengine.SpeechEngineDefines.TTS_WORK_MODE_BOTH);
        r1 = r4.element;
        r0 = (X.C1887807aO) r1;
        r3 = ((X.C1887807aO) r1).LIZIZ + 1;
        r1 = r0.LIZ;
        r0.getClass();
        r4.element = new X.C1887807aO(r1, r3);
        r13 = X.C906030ZgX.LIZ[r1.strategy.ordinal()];
        r4 = r4;
        r4 = r4;
        r5 = r5;
        r5 = r5;
        r7 = r7;
        r7 = r7;
        r10 = r10;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0423, code lost:
    
        if (r13 != 1) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0425, code lost:
    
        if (r13 != 2) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x042b, code lost:
    
        r0 = ((X.C1887807aO) r4.element).LIZ.delayMs;
        r2.LL = r11;
        r2.LLILLJJLI = r8;
        r2.LLILLL = r18;
        r2.LLILZ = r15;
        r2.LLILZIL = r19;
        r2.LLILZLL = r6;
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0445, code lost:
    
        r2.LLIZ = r9;
        r2.LLIZLLLIL = r22;
        r2.LLJ = r4;
        r2.LLJI = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x044f, code lost:
    
        r2.LLJIJIL = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0451, code lost:
    
        r2.LLJILJIL = r10;
        r2.LLJILJILJ = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0455, code lost:
    
        r2.LLJILLL = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0459, code lost:
    
        r2.LLJJ = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x045e, code lost:
    
        r2.LLJJIJI = 5;
        r4 = r4;
        r5 = r5;
        r7 = r7;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0467, code lost:
    
        if (X.AnonymousClass0958.LIZIZ(r0, r2) == r21) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0472, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0476, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0479, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x047c, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x047f, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0482, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0485, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0488, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x048b, code lost:
    
        r14 = r5.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x048f, code lost:
    
        if ((r3 instanceof X.C906040ZgY) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0491, code lost:
    
        r1 = ((X.C906040ZgY) r3).LL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0496, code lost:
    
        r36 = r3.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x049a, code lost:
    
        if (r36 == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x049d, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x049f, code lost:
    
        r36 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04a1, code lost:
    
        r22 = new com.ss.android.ugc.aweme.im.streaming.api.StreamingResponseData(r8, null, null, r18, 0, "", X.C13BV.INSTANCE, false, r14, 0, false, ((X.C1887807aO) r4.element).LIZ, r1, r36, null);
        r1 = r43.LIZJ;
        r17 = X.C13LP.LLIIII(r6.values());
        r2.LL = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04d7, code lost:
    
        r2.LLILLJJLI = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x04d9, code lost:
    
        r2.LLILLL = r6;
        r2.LLILZ = r9;
        r2.LLILZIL = r4;
        r2.LLILZLL = r5;
        r2.LLIZ = r7;
        r2.LLIZLLLIL = r10;
        r2.LLJ = r12;
        r2.LLJI = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04e9, code lost:
    
        r2.LLJIJIL = null;
        r2.LLJILJIL = null;
        r2.LLJILJILJ = null;
        r2.LLJJ = r20;
        r2.LLJJIJI = 3;
        r4 = r4;
        r5 = r5;
        r7 = r7;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0504, code lost:
    
        if (r1.LJII(r8, r19, r22, r17, r2) == r21) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0506, code lost:
    
        return r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x058e, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0598, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x059a, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x059c, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x05a3, code lost:
    
        throw new X.C1954807lC();
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x05a4, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x05a6, code lost:
    
        return r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x05a9, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x05ab, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x05ad, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x05af, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x05b0, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x05b2, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x05b4, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x05b5, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05b9, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x05ba, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x05bc, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x05bd, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05c0, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x05c1, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x05c3, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x05c4, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x05c6, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x05c7, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x05c9, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x05ca, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02ff, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x034d, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x034e, code lost:
    
        r20 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0351, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0353, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0355, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0357, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0359, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x035b, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x035d, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x035f, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:117:0x038e, B:122:0x03a0], limit reached: 305 */
    /* JADX WARN: Path cross not found for [B:122:0x03a0, B:117:0x038e], limit reached: 305 */
    /* JADX WARN: Path cross not found for [B:298:0x0261, B:53:0x026c], limit reached: 305 */
    /* JADX WARN: Path cross not found for [B:53:0x026c, B:298:0x0261], limit reached: 305 */
    /* JADX WARN: Removed duplicated region for block: B:117:0x038e A[Catch: all -> 0x05b7, TryCatch #15 {all -> 0x05b7, blocks: (B:115:0x0379, B:117:0x038e, B:119:0x0397), top: B:280:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0538 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0560 A[Catch: all -> 0x0592, TryCatch #47 {all -> 0x0592, blocks: (B:189:0x0554, B:191:0x0560, B:192:0x0565, B:197:0x0574), top: B:309:0x0554 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0261 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x021b A[Catch: all -> 0x05c6, TryCatch #24 {all -> 0x05c6, blocks: (B:36:0x0202, B:40:0x021d, B:47:0x0247, B:39:0x021b), top: B:294:0x0202 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x030c  */
    /* JADX WARN: Type inference failed for: r0v104, types: [T, X.07aO] */
    /* JADX WARN: Type inference failed for: r10v0, types: [int] */
    /* JADX WARN: Type inference failed for: r10v10, types: [X.00w2] */
    /* JADX WARN: Type inference failed for: r10v17, types: [X.00w2] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.00w2] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [X.00w2] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9, types: [X.00w2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.07aO] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [X.00zU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [X.00zU] */
    /* JADX WARN: Type inference failed for: r4v22, types: [X.00zU] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.00zU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [X.00zU] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [X.00cf] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [X.00cf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [X.00cf] */
    /* JADX WARN: Type inference failed for: r5v24, types: [X.00cf] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.00cf] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10, types: [X.00w2] */
    /* JADX WARN: Type inference failed for: r7v17, types: [X.00w2] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.00w2] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.00w2] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [X.00w2, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0377 -> B:280:0x0379). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x030a -> B:300:0x030e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC346701Wf<? super X.InterfaceC905820ZgC> r44, java.lang.String r45, java.lang.String r46, java.lang.Long r47, java.lang.String r48, long r49, java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.streaming.api.BlockUIData> r51, int r52, java.lang.String r53, com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent r54, X.EnumC905940ZgO r55, X.InterfaceC1364105Vn<? super kotlin.Unit> r56) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C905950ZgP.LJII(X.01Wf, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, long, java.util.Map, int, java.lang.String, com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent, X.0ZgO, X.05Vn):java.lang.Object");
    }
}
