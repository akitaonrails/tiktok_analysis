package X;

import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760480vug extends C11T1<ReviewApi.ReviewRequest, n> {
    public final HashMap<ReviewApi.ReviewRequest, n> LIZIZ = new HashMap<>();

    @Override // X.C11T1
    public final List<Pair<ReviewApi.ReviewRequest, n>> LJ() {
        return C2097808Js.LJIL(this.LIZIZ);
    }

    public final void LJI() {
        this.LIZIZ.clear();
    }

    @Override // X.C11T1
    public final n LIZ(ReviewApi.ReviewRequest reviewRequest) {
        return this.LIZIZ.get(reviewRequest);
    }

    @Override // X.C11T1
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final void LJFF(ReviewApi.ReviewRequest reviewRequest, n nVar) {
        n nVar2;
        if (nVar != null) {
            k kVarLJJIIZ = nVar.LJJIIZ("data");
            if (kVarLJJIIZ instanceof n) {
                nVar2 = (n) kVarLJJIIZ;
            } else {
                nVar2 = null;
            }
            if (nVar.LJJIIZ("code") == null) {
                if (nVar2 == null) {
                    if (nVar.LJJIIZ("review_items") != null) {
                        HashMap<ReviewApi.ReviewRequest, n> map = this.LIZIZ;
                        n nVar3 = new n();
                        nVar3.LJJIII(0, "code");
                        nVar3.LJJIFFI("data", nVar);
                        nVar3.LJJIIJ("message", "success");
                        map.put(reviewRequest, nVar3);
                        return;
                    }
                    return;
                }
            } else if (nVar2 == null) {
                return;
            }
            if (nVar2.LJJIIZ("review_items") == null) {
                return;
            }
            this.LIZIZ.put(reviewRequest, nVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x000a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.Boolean r10, java.lang.Integer r11, java.lang.String r12) {
        /*
            r9 = this;
            java.util.HashMap<com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi$ReviewRequest, com.google.gson.n> r0 = r9.LIZIZ
            java.util.Collection r0 = r0.values()
            java.util.Iterator r8 = r0.iterator()
        La:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r1 = r8.next()
            com.google.gson.n r1 = (com.google.gson.n) r1
            java.lang.String r0 = "data"
            com.google.gson.k r1 = r1.LJJIIZ(r0)
            boolean r0 = r1 instanceof com.google.gson.n
            r7 = 0
            if (r0 == 0) goto La3
            com.google.gson.n r1 = (com.google.gson.n) r1
            if (r1 == 0) goto La3
            java.lang.String r0 = "review_items"
            com.google.gson.k r4 = r1.LJJIIZ(r0)
        L2b:
            boolean r0 = r4 instanceof com.google.gson.h
            if (r0 == 0) goto La
            com.google.gson.h r4 = (com.google.gson.h) r4
            if (r4 == 0) goto La
            java.util.Iterator r6 = r4.iterator()
            r5 = 0
            r3 = 0
        L39:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La
            java.lang.Object r1 = r6.next()
            if (r3 < 0) goto La5
            com.google.gson.k r1 = (com.google.gson.k) r1
            boolean r0 = r1 instanceof com.google.gson.n     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L72
            com.google.gson.n r1 = (com.google.gson.n) r1     // Catch: java.lang.Exception -> L96
            if (r1 == 0) goto L72
            java.lang.String r0 = "review"
            com.google.gson.k r1 = r1.LJJIIZ(r0)     // Catch: java.lang.Exception -> L96
        L55:
            boolean r0 = r1 instanceof com.google.gson.n     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L70
            com.google.gson.n r1 = (com.google.gson.n) r1     // Catch: java.lang.Exception -> L96
            if (r1 == 0) goto L70
            java.lang.String r0 = "review_id"
            com.google.gson.k r0 = r1.LJJIIZ(r0)     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto L70
            java.lang.String r0 = r0.LJIL()     // Catch: java.lang.Exception -> L96
        L69:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r12)     // Catch: java.lang.Exception -> L96
            if (r0 == 0) goto La0
            goto L74
        L70:
            r0 = r7
            goto L69
        L72:
            r1 = r7
            goto L55
        L74:
            com.google.gson.k r2 = r4.LJJIIJZLJL(r3)
            boolean r0 = r2 instanceof com.google.gson.n
            if (r0 == 0) goto La
            com.google.gson.n r2 = (com.google.gson.n) r2
            if (r2 == 0) goto La
            if (r11 == 0) goto L86
            int r5 = r11.intValue()
        L86:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "digg_count"
            r2.LJJIII(r1, r0)
            java.lang.String r0 = "is_digged"
            r2.LJJII(r10, r0)
            goto La
        L96:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.03xw r1 = X.EnumC1014603xw.ERR_JSON_EXP_ERROR
            r0 = 0
            X.C1019103yf.LIZ(r1, r2, r0)
        La0:
            int r3 = r3 + 1
            goto L39
        La3:
            r4 = r7
            goto L2b
        La5:
            X.C1697810uHb.LJIJI()
            throw r7
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1760480vug.LJIIIIZZ(java.lang.Boolean, java.lang.Integer, java.lang.String):void");
    }
}
