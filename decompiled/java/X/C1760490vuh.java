package X;

import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vuh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760490vuh extends C11T1<ReviewApi.ListShopReviewRequest, n> {
    public final HashMap<ReviewApi.ListShopReviewRequest, n> LIZIZ = new HashMap<>();

    @Override // X.C11T1
    public final List<Pair<ReviewApi.ListShopReviewRequest, n>> LJ() {
        return C2097808Js.LJIL(this.LIZIZ);
    }

    public final void LJI() {
        this.LIZIZ.clear();
    }

    @Override // X.C11T1
    public final n LIZ(ReviewApi.ListShopReviewRequest listShopReviewRequest) {
        return this.LIZIZ.get(listShopReviewRequest);
    }

    @Override // X.C11T1
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final void LJFF(ReviewApi.ListShopReviewRequest listShopReviewRequest, n nVar) {
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
                        HashMap<ReviewApi.ListShopReviewRequest, n> map = this.LIZIZ;
                        n nVar3 = new n();
                        nVar3.LJJIII(0, "code");
                        nVar3.LJJIFFI("data", nVar);
                        nVar3.LJJIIJ("message", "success");
                        map.put(listShopReviewRequest, nVar3);
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
            this.LIZIZ.put(listShopReviewRequest, nVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x000a, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9 A[LOOP:1: B:15:0x0039->B:53:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.Boolean r11, java.lang.Integer r12, java.lang.String r13) {
        /*
            r10 = this;
            java.util.HashMap<com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi$ListShopReviewRequest, com.google.gson.n> r0 = r10.LIZIZ
            java.util.Collection r0 = r0.values()
            java.util.Iterator r9 = r0.iterator()
        La:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lc4
            java.lang.Object r1 = r9.next()
            com.google.gson.n r1 = (com.google.gson.n) r1
            java.lang.String r0 = "data"
            com.google.gson.k r1 = r1.LJJIIZ(r0)
            boolean r0 = r1 instanceof com.google.gson.n
            r3 = 0
            if (r0 == 0) goto Lbd
            com.google.gson.n r1 = (com.google.gson.n) r1
            if (r1 == 0) goto Lbd
            java.lang.String r0 = "review_items"
            com.google.gson.k r6 = r1.LJJIIZ(r0)
        L2b:
            boolean r0 = r6 instanceof com.google.gson.h
            if (r0 == 0) goto La
            com.google.gson.h r6 = (com.google.gson.h) r6
            if (r6 == 0) goto La
            java.util.Iterator r8 = r6.iterator()
            r7 = 0
            r5 = 0
        L39:
            boolean r0 = r8.hasNext()
            java.lang.String r4 = "review_item"
            if (r0 == 0) goto La
            java.lang.Object r1 = r8.next()
            if (r5 < 0) goto Lc0
            com.google.gson.k r1 = (com.google.gson.k) r1
            boolean r0 = r1 instanceof com.google.gson.n
            if (r0 == 0) goto L84
            com.google.gson.n r1 = (com.google.gson.n) r1
            if (r1 == 0) goto L84
            com.google.gson.k r1 = r1.LJJIIZ(r4)
            boolean r0 = r1 instanceof com.google.gson.n
            if (r0 == 0) goto L78
            com.google.gson.n r1 = (com.google.gson.n) r1
            if (r1 == 0) goto L78
            java.lang.String r0 = "review"
            com.google.gson.k r1 = r1.LJJIIZ(r0)
        L63:
            boolean r0 = r1 instanceof com.google.gson.n
            if (r0 == 0) goto L84
            com.google.gson.n r1 = (com.google.gson.n) r1
            if (r1 == 0) goto L84
            java.lang.String r0 = "review_id"
            com.google.gson.k r0 = r1.LJJIIZ(r0)     // Catch: java.lang.Exception -> L7a
            if (r0 == 0) goto L84
            java.lang.String r0 = r0.LJIL()     // Catch: java.lang.Exception -> L7a
            goto L85
        L78:
            r1 = r3
            goto L63
        L7a:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.03xw r1 = X.EnumC1014603xw.ERR_JSON_EXP_ERROR
            r0 = 0
            X.C1019103yf.LIZ(r1, r2, r0)
        L84:
            r0 = r3
        L85:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r13)
            if (r0 == 0) goto Lb9
            com.google.gson.k r1 = r6.LJJIIJZLJL(r5)
            boolean r0 = r1 instanceof com.google.gson.n
            if (r0 == 0) goto L9b
            com.google.gson.n r1 = (com.google.gson.n) r1
            if (r1 == 0) goto L9b
            com.google.gson.k r3 = r1.LJJIIZ(r4)
        L9b:
            boolean r0 = r3 instanceof com.google.gson.n
            if (r0 == 0) goto La
            com.google.gson.n r3 = (com.google.gson.n) r3
            if (r3 == 0) goto La
            if (r12 == 0) goto La9
            int r7 = r12.intValue()
        La9:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = "digg_count"
            r3.LJJIII(r1, r0)
            java.lang.String r0 = "is_digged"
            r3.LJJII(r11, r0)
            goto La
        Lb9:
            int r5 = r5 + 1
            goto L39
        Lbd:
            r6 = r3
            goto L2b
        Lc0:
            X.C1697810uHb.LJIJI()
            throw r3
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1760490vuh.LJIIIIZZ(java.lang.Boolean, java.lang.Integer, java.lang.String):void");
    }
}
