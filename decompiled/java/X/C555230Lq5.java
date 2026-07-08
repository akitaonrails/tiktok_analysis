package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Lq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555230Lq5 {
    public static final C555230Lq5 LIZ = new C555230Lq5();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(612));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(613));

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.creative.model.mention.MentionResponse> r6) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C555300LqC
            if (r0 == 0) goto L20
            r4 = r6
            X.0LqC r4 = (X.C555300LqC) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            goto L26
        L20:
            X.0LqC r4 = new X.0LqC
            r4.<init>(r5, r6)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L48
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = X.C555230Lq5.LIZIZ     // Catch: java.lang.Exception -> L48
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L48
            com.ss.android.ugc.aweme.aigc.mention.MentionApi r1 = (com.ss.android.ugc.aweme.aigc.mention.MentionApi) r1     // Catch: java.lang.Exception -> L48
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L48
            r0 = 0
            java.lang.Object r1 = r1.getRecommendationCameoMention(r0, r4)     // Catch: java.lang.Exception -> L48
            if (r1 != r3) goto L47
            return r3
        L47:
            return r1
        L48:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L52
            r0 = 0
            return r0
        L52:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555230Lq5.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.creative.model.mention.MentionCheckRequest r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.creative.model.mention.MentionCheckResult> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C555290LqB
            if (r0 == 0) goto L20
            r4 = r7
            X.0LqB r4 = (X.C555290LqB) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L42
        L20:
            X.0LqB r4 = new X.0LqB
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = X.C555230Lq5.LIZIZ     // Catch: java.lang.Exception -> L48
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L48
            com.ss.android.ugc.aweme.aigc.mention.MentionApi r0 = (com.ss.android.ugc.aweme.aigc.mention.MentionApi) r0     // Catch: java.lang.Exception -> L48
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L48
            java.lang.Object r3 = r0.checkMentionCameoValid(r6, r4)     // Catch: java.lang.Exception -> L48
            if (r3 != r2) goto L45
            return r2
        L42:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L48
        L45:
            com.ss.android.ugc.aweme.creative.model.mention.MentionCheckResult r3 = (com.ss.android.ugc.aweme.creative.model.mention.MentionCheckResult) r3     // Catch: java.lang.Exception -> L48
            return r3
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.creative.model.mention.MentionCheckResult r3 = new com.ss.android.ugc.aweme.creative.model.mention.MentionCheckResult
            r0 = 0
            r3.<init>(r0, r0, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555230Lq5.LIZ(com.ss.android.ugc.aweme.creative.model.mention.MentionCheckRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem> r15, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem>> r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C555280LqA
            if (r0 == 0) goto L2b
            r7 = r3
            X.0LqA r7 = (X.C555280LqA) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L14:
            java.lang.Object r0 = r7.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r7.LLILZIL
            r5 = 0
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 != r3) goto L31
            java.lang.Object r4 = r7.LLILLJJLI
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r15 = r7.LL
            java.util.List r15 = (java.util.List) r15
            goto L6d
        L2b:
            X.0LqA r7 = new X.0LqA
            r7.<init>(r14, r3)
            goto L14
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L39:
            X.C155000ia.LIZIZ(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb5
            r2.<init>()     // Catch: java.lang.Exception -> Lb5
            java.util.Iterator r1 = r15.iterator()     // Catch: java.lang.Exception -> Lb5
        L4a:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> Lb5
            com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r0 = (com.ss.android.ugc.aweme.creative.model.common.MentionDataItem) r0     // Catch: java.lang.Exception -> Lb5
            java.lang.String r0 = r0.cameoId     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto L4a
            r2.add(r0)     // Catch: java.lang.Exception -> Lb5
            goto L4a
        L5e:
            r7.LL = r15     // Catch: java.lang.Exception -> Lb5
            r7.LLILLJJLI = r4     // Catch: java.lang.Exception -> Lb5
            r7.LLILZIL = r3     // Catch: java.lang.Exception -> Lb5
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> Lb5
            java.lang.Object r0 = r14.LJ(r2, r5, r0, r7)     // Catch: java.lang.Exception -> Lb5
            if (r0 != r6) goto L70
            return r6
        L6d:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> Lb7
        L70:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> Lb7
            if (r0 == 0) goto Lbb
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Exception -> Lb7
        L78:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> Lb7
            if (r0 == 0) goto Lbb
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Exception -> Lb7
            com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r7 = (com.ss.android.ugc.aweme.creative.model.common.MentionDataItem) r7     // Catch: java.lang.Exception -> Lb7
            java.util.Iterator r3 = r15.iterator()     // Catch: java.lang.Exception -> Lb7
        L88:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> Lb7
            if (r0 == 0) goto Lb3
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Exception -> Lb7
            r0 = r2
            com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r0 = (com.ss.android.ugc.aweme.creative.model.common.MentionDataItem) r0     // Catch: java.lang.Exception -> Lb7
            java.lang.String r1 = r0.uid     // Catch: java.lang.Exception -> Lb7
            java.lang.String r0 = r7.uid     // Catch: java.lang.Exception -> Lb7
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> Lb7
            if (r0 == 0) goto L88
        L9f:
            com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r2 = (com.ss.android.ugc.aweme.creative.model.common.MentionDataItem) r2     // Catch: java.lang.Exception -> Lb7
            if (r2 == 0) goto L78
            r8 = 0
            java.lang.String r9 = r2.relationType     // Catch: java.lang.Exception -> Lb7
            r13 = 8127(0x1fbf, float:1.1388E-41)
            r10 = r8
            r11 = r8
            r12 = r8
            com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r0 = com.ss.android.ugc.aweme.creative.model.common.MentionDataItem.LIZ(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> Lb7
            r4.add(r0)     // Catch: java.lang.Exception -> Lb7
            goto L78
        Lb3:
            r2 = r5
            goto L9f
        Lb5:
            r0 = move-exception
            goto Lb8
        Lb7:
            r0 = move-exception
        Lb8:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lbb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555230Lq5.LIZIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    public static void LJFF(int i, String str, long j, String str2) {
        boolean z;
        String str3;
        String strValueOf;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("cost_time", String.valueOf(j));
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("result", str3);
        pairArr[2] = new Pair(Scene.SCENE_SERVICE, str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (z) {
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(i);
        }
        mapLJIIJ.put("error_code", strValueOf);
        if (z) {
            str2 = "";
        }
        mapLJIIJ.put("error_msg", str2);
        C20684815ws.LJIILLIIL("ttcrt_mention_list_result", mapLJIIJ);
    }

    public static void LJI(int i, String str, long j, String str2) {
        boolean z;
        String str3;
        String strValueOf;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("cost_time", String.valueOf(j));
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("result", str3);
        pairArr[2] = new Pair(Scene.SCENE_SERVICE, str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (z) {
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(i);
        }
        mapLJIIJ.put("error_code", strValueOf);
        if (z) {
            str2 = "";
        }
        mapLJIIJ.put("error_msg", str2);
        C20684815ws.LJIILLIIL("ttcrt_mention_search_result", mapLJIIJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1 A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:13:0x0036, B:56:0x00eb, B:58:0x00f1, B:60:0x0103, B:61:0x0119, B:66:0x0123, B:68:0x0127, B:71:0x013f, B:70:0x012d, B:21:0x0061, B:22:0x0064, B:24:0x0075, B:26:0x0079, B:28:0x007d, B:30:0x0083, B:31:0x008a, B:33:0x008e, B:35:0x0092, B:36:0x009a, B:38:0x00a0, B:40:0x00ae, B:42:0x00b4, B:43:0x00b8, B:45:0x00bc, B:47:0x00c0, B:48:0x00c8, B:50:0x00ce, B:52:0x00dc, B:54:0x00e2, B:55:0x00e6, B:18:0x0049), top: B:76:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d A[Catch: Exception -> 0x0158, TryCatch #0 {Exception -> 0x0158, blocks: (B:13:0x0036, B:56:0x00eb, B:58:0x00f1, B:60:0x0103, B:61:0x0119, B:66:0x0123, B:68:0x0127, B:71:0x013f, B:70:0x012d, B:21:0x0061, B:22:0x0064, B:24:0x0075, B:26:0x0079, B:28:0x007d, B:30:0x0083, B:31:0x008a, B:33:0x008e, B:35:0x0092, B:36:0x009a, B:38:0x00a0, B:40:0x00ae, B:42:0x00b4, B:43:0x00b8, B:45:0x00bc, B:47:0x00c0, B:48:0x00c8, B:50:0x00ce, B:52:0x00dc, B:54:0x00e2, B:55:0x00e6, B:18:0x0049), top: B:76:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.List<java.lang.String> r13, java.util.List<java.lang.Long> r14, java.lang.Boolean r15, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem>> r16) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555230Lq5.LJ(java.util.List, java.util.List, java.lang.Boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2 A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:13:0x0039, B:49:0x00de, B:51:0x00e2, B:54:0x00ea, B:56:0x00fe, B:59:0x0109, B:60:0x010c, B:62:0x0110, B:63:0x011a, B:31:0x0099, B:32:0x009c, B:34:0x00a2, B:36:0x00a6, B:37:0x00af, B:39:0x00b5, B:41:0x00c1, B:44:0x00c9, B:42:0x00c5, B:24:0x0068, B:28:0x0077), top: B:69:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:13:0x0039, B:49:0x00de, B:51:0x00e2, B:54:0x00ea, B:56:0x00fe, B:59:0x0109, B:60:0x010c, B:62:0x0110, B:63:0x011a, B:31:0x0099, B:32:0x009c, B:34:0x00a2, B:36:0x00a6, B:37:0x00af, B:39:0x00b5, B:41:0x00c1, B:44:0x00c9, B:42:0x00c5, B:24:0x0068, B:28:0x0077), top: B:69:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:13:0x0039, B:49:0x00de, B:51:0x00e2, B:54:0x00ea, B:56:0x00fe, B:59:0x0109, B:60:0x010c, B:62:0x0110, B:63:0x011a, B:31:0x0099, B:32:0x009c, B:34:0x00a2, B:36:0x00a6, B:37:0x00af, B:39:0x00b5, B:41:0x00c1, B:44:0x00c9, B:42:0x00c5, B:24:0x0068, B:28:0x0077), top: B:69:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110 A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:13:0x0039, B:49:0x00de, B:51:0x00e2, B:54:0x00ea, B:56:0x00fe, B:59:0x0109, B:60:0x010c, B:62:0x0110, B:63:0x011a, B:31:0x0099, B:32:0x009c, B:34:0x00a2, B:36:0x00a6, B:37:0x00af, B:39:0x00b5, B:41:0x00c1, B:44:0x00c9, B:42:0x00c5, B:24:0x0068, B:28:0x0077), top: B:69:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r15, int r16, java.lang.String r17, java.util.List r18, X.InterfaceC1364105Vn r19) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555230Lq5.LIZJ(int, int, java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, X.InterfaceC1364105Vn r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555230Lq5.LJII(int, java.lang.String, java.lang.String, java.lang.String, X.05Vn, boolean):java.lang.Object");
    }
}
