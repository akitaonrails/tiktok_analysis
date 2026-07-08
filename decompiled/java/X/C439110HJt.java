package X;

import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0HJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439110HJt {
    public final String LIZ;
    public final InterfaceC346201Wa<C439120HJu> LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(493));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(492));
    public final C2252321DDq LJ = C1BNE.LIZ(new C437560HDu(EnumC437540HDs.UNKNOWN, 1022));
    public final C2252321DDq LJFF = C1BNE.LIZ(C1341405Mu.LIZ);
    public final C2252321DDq LJI = C1BNE.LIZ(null);
    public final C2252321DDq LJII;
    public final C2252321DDq LJIIIIZZ;
    public String LJIIIZ;
    public final C054G LJIIJ;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super X.C439120HJu> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.C438840HIs
            if (r0 == 0) goto L21
            r12 = r14
            X.0HIs r12 = (X.C438840HIs) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r12.LLILLL = r2
        L12:
            java.lang.Object r4 = r12.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r12.LLILLL
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L27
            goto L5e
        L21:
            X.0HIs r12 = new X.0HIs
            r12.<init>(r13, r14)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.stickerstore.api.StickerApiV2 r4 = X.C452670Hp3.LIZIZ()     // Catch: java.lang.Exception -> L7e
            java.lang.String r5 = r13.LIZ     // Catch: java.lang.Exception -> L7e
            X.0Hme r0 = X.EnumC451180Hme.AIMOJI_STICKER_STATIC     // Catch: java.lang.Exception -> L7e
            int r0 = r0.getType()     // Catch: java.lang.Exception -> L7e
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> L7e
            java.util.List r6 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Exception -> L7e
            r7 = 0
            r8 = 1
            X.0HJv r0 = X.EnumC439130HJv.STORE     // Catch: java.lang.Exception -> L7e
            int r0 = r0.getScene()     // Catch: java.lang.Exception -> L7e
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L7e
            java.lang.String r11 = r13.LJIIIZ     // Catch: java.lang.Exception -> L7e
            r12.LLILLL = r1     // Catch: java.lang.Exception -> L7e
            r10 = r8
            java.lang.Object r4 = r4.LJIIJ(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L7e
            if (r4 != r2) goto L61
            return r2
        L5e:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L7e
        L61:
            com.ss.android.ugc.aweme.im.sticker.api.model.GetStickerSetsResp r4 = (com.ss.android.ugc.aweme.im.sticker.api.model.GetStickerSetsResp) r4     // Catch: java.lang.Exception -> L7e
            java.util.List r0 = r4.getStickerSets()     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L70
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)     // Catch: java.lang.Exception -> L7e
            com.ss.android.ugc.aweme.im.common.model.IMStickerSetItem r0 = (com.ss.android.ugc.aweme.im.common.model.IMStickerSetItem) r0     // Catch: java.lang.Exception -> L7e
            goto L71
        L70:
            r0 = r3
        L71:
            if (r0 == 0) goto L7d
            X.0HJu r2 = new X.0HJu     // Catch: java.lang.Exception -> L7e
            java.util.List<com.ss.android.ugc.aweme.im.common.model.StickerItem> r1 = r0.stickers     // Catch: java.lang.Exception -> L7e
            com.ss.android.ugc.aweme.im.common.model.IMStickerSetMetaData r0 = r0.stickerSetMeta     // Catch: java.lang.Exception -> L7e
            r2.<init>(r0, r1)     // Catch: java.lang.Exception -> L7e
            return r2
        L7d:
            return r3
        L7e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C439110HJt.LIZIZ(X.05Vn):java.lang.Object");
    }

    public C439110HJt(String str, AnonymousClass0951 anonymousClass0951) {
        this.LIZ = str;
        this.LIZIZ = anonymousClass0951;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C0HK2.INSTANCE);
        this.LJII = c2252321DDqLIZ;
        this.LJIIIIZZ = c2252321DDqLIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(new C439140HJw(CoroutineExceptionHandler.LJJLIL)));
        this.LJIIJ = c054gLIZ;
        C23250099c.LIZLLL(c054gLIZ, null, null, new C438830HIr(this, null), 3);
        C23250099c.LIZLLL(c054gLIZ, null, null, new C438820HIq(this, null), 3);
        C23250099c.LIZLLL(c054gLIZ, null, null, new C438850HIt(this, null), 3);
        C23250099c.LIZLLL(c054gLIZ, null, null, new C438800HIo(this, null), 3);
        C23250099c.LIZLLL(c054gLIZ, null, null, new C438860HIu(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[PHI: r4
      0x0043: PHI (r4v1 float) = (r4v0 float), (r4v3 float) binds: [B:22:0x0040, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.model.IMSATaskDetail LIZ(X.C437560HDu r9, X.InterfaceC439080HJq r10) {
        /*
            com.ss.android.ugc.aweme.model.IMSATaskDetail r2 = new com.ss.android.ugc.aweme.model.IMSATaskDetail
            boolean r0 = r10 instanceof X.C1372105Yp
            if (r0 == 0) goto L46
            r0 = r10
            X.05Yp r0 = (X.C1372105Yp) r0
            java.lang.String r3 = r0.LIZIZ
        Lb:
            boolean r1 = r10 instanceof X.C0HK3
            if (r1 == 0) goto L3b
            r0 = r10
            X.0HK3 r0 = (X.C0HK3) r0
            java.lang.Float r0 = r0.LIZ
            if (r0 == 0) goto L3b
            float r4 = r0.floatValue()
        L1a:
            r0 = r10
            X.0HJy r0 = (X.InterfaceC439160HJy) r0
            java.lang.Long r0 = r0.LIZ()
            if (r0 == 0) goto L43
            long r5 = r0.longValue()
        L27:
            boolean r7 = r10 instanceof X.C438980HJg
            boolean r8 = r9.LJI
            X.0HDv r0 = r9.LIZJ
            java.lang.Integer r0 = r0.LIZJ
            if (r0 == 0) goto L39
            int r9 = r0.intValue()
        L35:
            r2.<init>(r3, r4, r5, r7, r8, r9)
            return r2
        L39:
            r9 = -1
            goto L35
        L3b:
            r4 = 0
            if (r1 != 0) goto L1a
            boolean r0 = r10 instanceof X.C0HK4
            if (r0 == 0) goto L43
            goto L1a
        L43:
            r5 = -1
            goto L27
        L46:
            java.lang.String r3 = ""
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C439110HJt.LIZ(X.0HDu, X.0HJq):com.ss.android.ugc.aweme.model.IMSATaskDetail");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025b A[PHI: r2
      0x025b: PHI (r2v12 java.lang.Object) = (r2v10 java.lang.Object), (r2v11 java.lang.Object), (r2v13 java.lang.Object) binds: [B:100:0x0241, B:89:0x0203, B:108:0x0259] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c2  */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C437560HDu r16, X.InterfaceC439080HJq r17, X.C439120HJu r18) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C439110HJt.LIZJ(X.0HDu, X.0HJq, X.0HJu):void");
    }
}
