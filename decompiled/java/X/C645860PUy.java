package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645860PUy {
    public static final boolean LJ(int i, SearchMixFeed searchMixFeed) {
        String str;
        if (searchMixFeed.getFeedType() != 37) {
            if (C649470Pdh.LJIJ(i) || i == 8) {
                DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
                if (dynamicPatch != null) {
                    str = dynamicPatch.schema;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(C649470Pdh.LJ(str), "related_search")) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4 A[PHI: r3
      0x00b4: PHI (r3v1 X.0PWx) = (r3v0 X.0PWx), (r3v3 X.0PWx) binds: [B:48:0x00b0, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(int r6, com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r7, X.C653660PkS r8, java.lang.String r9) {
        /*
            r4 = 0
            if (r7 == 0) goto Laf
            X.0PCY r0 = r7.wO2()
            if (r0 == 0) goto Laf
            X.0sD9 r3 = r0.LIZJ()
            X.0PWx r3 = (X.C646370PWx) r3
        Lf:
            X.0PCY r0 = r7.Ph1()
            if (r0 == 0) goto Lb4
            X.0sD9 r5 = r0.LIZJ()
            X.0PRC r5 = (X.C0PRC) r5
        L1b:
            X.0PJg r2 = new X.0PJg
            r2.<init>()
            java.lang.String r1 = "words_source"
            java.lang.String r0 = "click_recom"
            r2.LJIIZILJ(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.LJJJJJL(r0)
            if (r5 == 0) goto Lad
            java.lang.String r1 = r5.LLILLL
        L32:
            java.lang.String r0 = "search_id"
            r2.LJIIZILJ(r0, r1)
            if (r8 == 0) goto Lab
            java.lang.String r1 = r8.LJIIL
        L3b:
            java.lang.String r0 = "impr_id"
            r2.LJIIZILJ(r0, r1)
            if (r5 == 0) goto La9
            java.lang.String r1 = r5.LLIZLLLIL
        L44:
            java.lang.String r0 = "raw_query"
            r2.LJIIZILJ(r0, r1)
            if (r7 == 0) goto La7
            X.0PCY r0 = r7.uF()
            if (r0 == 0) goto La7
            X.0sD9 r0 = r0.LIZJ()
            X.0PM7 r0 = (X.C0PM7) r0
            if (r0 == 0) goto La7
            java.lang.String r1 = r0.LLILLL
        L5b:
            java.lang.String r0 = "last_feed_group_id"
            r2.LJIIZILJ(r0, r1)
            if (r7 == 0) goto La5
            X.0PCY r0 = r7.P70()
            if (r0 == 0) goto La5
            X.0sD9 r0 = r0.LIZJ()
            X.0Q39 r0 = (X.C0Q39) r0
            if (r0 == 0) goto La5
            java.lang.String r1 = r0.LLILLJJLI
        L72:
            java.lang.String r0 = "last_from_group_id"
            r2.LJIIZILJ(r0, r1)
            java.lang.String r1 = "search_position"
            java.lang.String r0 = "general"
            r2.LJIIZILJ(r1, r0)
            if (r8 == 0) goto La3
            int r0 = r8.LJIILL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L86:
            r2.LJJIJL(r0)
            X.09Gk r1 = new X.09Gk
            r1.<init>()
            java.lang.String r0 = "enter_group_id"
            r1.LJIIIIZZ(r0, r9)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.LIZ
            r2.LIZIZ(r0)
            if (r8 == 0) goto L9c
            java.lang.Integer r4 = r8.LJIILLIIL
        L9c:
            X.C643200PKs.LIZ(r2, r3, r4)
            r2.LJIILJJIL()
            return
        La3:
            r0 = r4
            goto L86
        La5:
            r1 = r4
            goto L72
        La7:
            r1 = r4
            goto L5b
        La9:
            r1 = r4
            goto L44
        Lab:
            r1 = r4
            goto L3b
        Lad:
            r1 = r4
            goto L32
        Laf:
            r3 = r4
            if (r7 == 0) goto Lb4
            goto Lf
        Lb4:
            r5 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645860PUy.LIZIZ(int, com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility, X.0PkS, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8 A[PHI: r3
      0x00e8: PHI (r3v1 X.0PWx) = (r3v0 X.0PWx), (r3v3 X.0PWx) binds: [B:50:0x00e4, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(com.ss.android.ugc.aweme.discover.model.suggest.Word r6, com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r7, X.C653660PkS r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645860PUy.LIZLLL(com.ss.android.ugc.aweme.discover.model.suggest.Word, com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility, X.0PkS, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v1 X.0PWx) = (r3v0 X.0PWx), (r3v3 X.0PWx) binds: [B:60:0x00dd, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord r6, com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r7, java.lang.Integer r8, int r9) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645860PUy.LJFF(com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord, com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility, java.lang.Integer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e A[PHI: r3
      0x009e: PHI (r3v1 X.0PWx) = (r3v0 X.0PWx), (r3v3 X.0PWx) binds: [B:41:0x009a, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(int r6, com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r7, java.lang.Integer r8, int r9) {
        /*
            r4 = 0
            if (r7 == 0) goto L99
            X.0PCY r0 = r7.wO2()
            if (r0 == 0) goto L99
            X.0sD9 r3 = r0.LIZJ()
            X.0PWx r3 = (X.C646370PWx) r3
        Lf:
            X.0PCY r0 = r7.Ph1()
            if (r0 == 0) goto L9e
            X.0sD9 r5 = r0.LIZJ()
            X.0PRC r5 = (X.C0PRC) r5
        L1b:
            X.0PJg r2 = new X.0PJg
            r2.<init>()
            java.lang.String r1 = "words_source"
            java.lang.String r0 = "related_search"
            r2.LJIIZILJ(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.LJJJJJL(r0)
            if (r5 == 0) goto L97
            java.lang.String r1 = r5.LLILLL
        L32:
            java.lang.String r0 = "search_id"
            r2.LJIIZILJ(r0, r1)
            if (r3 == 0) goto L95
            java.lang.String r1 = r3.LL
        L3b:
            java.lang.String r0 = "impr_id"
            r2.LJIIZILJ(r0, r1)
            if (r5 == 0) goto L93
            java.lang.String r1 = r5.LLIZLLLIL
        L44:
            java.lang.String r0 = "raw_query"
            r2.LJIIZILJ(r0, r1)
            if (r7 == 0) goto L91
            X.0PCY r0 = r7.uF()
            if (r0 == 0) goto L91
            X.0sD9 r0 = r0.LIZJ()
            X.0PM7 r0 = (X.C0PM7) r0
            if (r0 == 0) goto L91
            java.lang.String r1 = r0.LLILLL
        L5b:
            java.lang.String r0 = "last_feed_group_id"
            r2.LJIIZILJ(r0, r1)
            if (r7 == 0) goto L8f
            X.0PCY r0 = r7.P70()
            if (r0 == 0) goto L8f
            X.0sD9 r0 = r0.LIZJ()
            X.0Q39 r0 = (X.C0Q39) r0
            if (r0 == 0) goto L8f
            java.lang.String r1 = r0.LLILLJJLI
        L72:
            java.lang.String r0 = "last_from_group_id"
            r2.LJIIZILJ(r0, r1)
            java.lang.String r1 = "search_position"
            java.lang.String r0 = "general"
            r2.LJIIZILJ(r1, r0)
            r2.LJJIL(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r2.LJJIJL(r0)
            X.C643200PKs.LIZ(r2, r3, r4)
            r2.LJIILJJIL()
            return
        L8f:
            r1 = r4
            goto L72
        L91:
            r1 = r4
            goto L5b
        L93:
            r1 = r4
            goto L44
        L95:
            r1 = r4
            goto L3b
        L97:
            r1 = r4
            goto L32
        L99:
            r3 = r4
            if (r7 == 0) goto L9e
            goto Lf
        L9e:
            r5 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645860PUy.LJI(int, com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility, java.lang.Integer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4 A[PHI: r3
      0x00d4: PHI (r3v1 X.0PWx) = (r3v0 X.0PWx), (r3v3 X.0PWx) binds: [B:58:0x00d0, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(int r6, java.lang.String r7, com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r8, X.C653660PkS r9, X.C0PUB r10) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645860PUy.LIZ(int, java.lang.String, com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility, X.0PkS, X.0PUB):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121 A[PHI: r3
      0x0121: PHI (r3v1 X.0PWx) = (r3v0 X.0PWx), (r3v3 X.0PWx) binds: [B:60:0x011d, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(com.ss.android.ugc.aweme.discover.model.suggest.Word r6, com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r7, X.C653660PkS r8, java.lang.String r9, X.C0PUB r10) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645860PUy.LIZJ(com.ss.android.ugc.aweme.discover.model.suggest.Word, com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility, X.0PkS, java.lang.String, X.0PUB):void");
    }
}
