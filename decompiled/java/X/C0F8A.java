package X;

import com.ss.android.ugc.aweme.service.NLETextStickerServiceImpl;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0F8A, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F8A implements C0F8H {
    public final /* synthetic */ NLETextStickerServiceImpl LIZ;

    public C0F8A(NLETextStickerServiceImpl nLETextStickerServiceImpl) {
        this.LIZ = nLETextStickerServiceImpl;
    }

    @Override // X.C0F8H
    public final int LIZ(int i) {
        C363420EMq.LIZ.getClass();
        return C363420EMq.LJI(i);
    }

    @Override // X.C0F8H
    public final String LIZJ(String str) {
        Pair<String, String> pairLIZJ;
        String strLIZLLL;
        this.LIZ.getClass();
        if (a0.LJJJIL(str) || (((pairLIZJ = C0FGD.LIZJ(str)) == null || (strLIZLLL = pairLIZJ.getSecond()) == null) && (strLIZLLL = C0FGD.LIZLLL(str)) == null)) {
            return str;
        }
        return strLIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    @Override // X.C0F8H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r11, X.InterfaceC1364105Vn<? super X.C0F89> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C0F8E
            if (r0 == 0) goto L52
            r4 = r12
            X.0F8E r4 = (X.C0F8E) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L44
            if (r0 != r1) goto L5a
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r3
            if (r3 == 0) goto L58
            X.0F89 r4 = new X.0F89
            java.lang.String r5 = r3.getEffectId()
            if (r5 != 0) goto L30
            java.lang.String r5 = ""
        L30:
            java.lang.String r6 = r3.getResource_id()
            java.lang.String r7 = r3.getPanel()
            java.lang.String r8 = r3.getUnzipPath()
            java.lang.String r9 = r3.getExtra()
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L44:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.service.NLETextStickerServiceImpl r0 = r10.LIZ
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZIZ(r11, r4)
            if (r3 != r2) goto L22
            return r2
        L52:
            X.0F8E r4 = new X.0F8E
            r4.<init>(r10, r12)
            goto L12
        L58:
            r4 = 0
            return r4
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F8A.LIZLLL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[PHI: r1
      0x0082: PHI (r1v9 com.ss.android.ugc.effectmanager.effect.model.Effect) = 
      (r1v8 com.ss.android.ugc.effectmanager.effect.model.Effect)
      (r1v15 com.ss.android.ugc.effectmanager.effect.model.Effect)
     binds: [B:20:0x005d, B:26:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0F8H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0F86 LIZIZ(X.C0F89 r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F8A.LIZIZ(X.0F89, java.lang.String, java.lang.String):X.0F86");
    }
}
