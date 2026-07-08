package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396050mQt {
    public static final C1396050mQt LIZ = new C1396050mQt();
    public static final ConcurrentHashMap<String, InterfaceC383701eN> LIZIZ = new ConcurrentHashMap<>();

    public static C05M0 LIZLLL() {
        return (C05M0) C05KA.LIZ.getValue();
    }

    public static InterfaceC383701eN LJIIJ(String str) {
        ConcurrentHashMap<String, InterfaceC383701eN> concurrentHashMap = LIZIZ;
        InterfaceC383701eN interfaceC383701eN = concurrentHashMap.get(str);
        if (interfaceC383701eN != null) {
            return interfaceC383701eN;
        }
        C1DEV c1devLIZ = C2191201ApK.LIZ();
        InterfaceC383701eN interfaceC383701eNPutIfAbsent = concurrentHashMap.putIfAbsent(str, c1devLIZ);
        if (interfaceC383701eNPutIfAbsent != null) {
            return interfaceC383701eNPutIfAbsent;
        }
        return c1devLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025b A[Catch: all -> 0x0272, TRY_ENTER, TryCatch #2 {all -> 0x0272, blocks: (B:118:0x025b, B:122:0x026c, B:121:0x0269), top: B:132:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0086 -> B:26:0x0087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0173 -> B:74:0x0181). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1396050mQt.LJIIIZ(X.05Vn):java.lang.Object");
    }

    public static void LJ(Comment comment, int i) {
        boolean z;
        if (comment.getUserDigged() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        comment.setUserBuried(0);
                        return;
                    }
                    return;
                }
                if (z) {
                    int diggCount = comment.getDiggCount() - 1;
                    if (diggCount < 0) {
                        diggCount = 0;
                    }
                    comment.setDiggCount(diggCount);
                    comment.setUserDigged(0);
                }
                comment.setUserBuried(1);
                return;
            }
            if (z) {
                int diggCount2 = comment.getDiggCount() - 1;
                if (diggCount2 < 0) {
                    diggCount2 = 0;
                }
                comment.setDiggCount(diggCount2);
            }
            comment.setUserDigged(0);
            return;
        }
        if (!z) {
            comment.setDiggCount(comment.getDiggCount() + 1);
        }
        comment.setUserDigged(1);
        comment.setUserBuried(0);
    }

    public static void LJI(Comment comment, Map map) {
        Integer num;
        String cid = comment.getCid();
        if (cid != null && (num = (Integer) map.get(cid)) != null) {
            int iIntValue = num.intValue();
            LIZ.getClass();
            LJ(comment, iIntValue);
        }
        List<Comment> replyComments = comment.getReplyComments();
        if (replyComments != null) {
            for (Comment comment2 : replyComments) {
                LIZ.getClass();
                LJI(comment2, map);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List<java.lang.String> r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1396110mQz
            if (r0 == 0) goto L4c
            r4 = r7
            X.0mQz r4 = (X.C1396110mQz) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 != r1) goto L55
            java.lang.Object r6 = r4.LL
            java.util.List r6 = (java.util.List) r6
            X.C155000ia.LIZIZ(r3)
        L26:
            java.util.Iterator r2 = r6.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r1 = r2.next()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.01eN> r0 = X.C1396050mQt.LIZIZ
            r0.remove(r1)
            goto L2a
        L3a:
            X.C155000ia.LIZIZ(r3)
            X.05M0 r0 = LIZLLL()
            r4.LL = r6
            r4.LLILZ = r1
            java.lang.Object r0 = r0.LIZLLL(r6, r4)
            if (r0 != r2) goto L26
            return r2
        L4c:
            X.0mQz r4 = new X.0mQz
            r4.<init>(r5, r7)
            goto L12
        L52:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1396050mQt.LIZJ(java.util.List, X.05Vn):java.lang.Object");
    }

    public static boolean LJFF(Comment comment, String str, int i) {
        boolean z;
        if (Intrinsics.LJFF(comment.getCid(), str)) {
            LJ(comment, i);
            z = true;
        } else {
            z = false;
        }
        List<Comment> replyComments = comment.getReplyComments();
        if (replyComments != null) {
            for (Comment comment2 : replyComments) {
                LIZ.getClass();
                if (LJFF(comment2, str, i)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(com.ss.android.ugc.aweme.feed.model.Aweme r28, java.lang.String r29, X.InterfaceC1364105Vn r30) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1396050mQt.LJII(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(com.ss.android.ugc.aweme.comment.model.CommentItemList r14, java.lang.String r15, X.InterfaceC1364105Vn r16) {
        /*
            r13 = this;
            r3 = r16
            r7 = r15
            r8 = r14
            boolean r0 = r3 instanceof X.C1396070mQv
            if (r0 == 0) goto L2c
            r5 = r3
            X.0mQv r5 = (X.C1396070mQv) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L16:
            java.lang.Object r6 = r5.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILZLL
            r2 = 0
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L46
            if (r1 == r0) goto L3a
            if (r1 != r3) goto L32
            java.lang.Object r1 = r5.LL
            X.01eN r1 = (X.InterfaceC383701eN) r1
            goto L81
        L2c:
            X.0mQv r5 = new X.0mQv
            r5.<init>(r13, r3)
            goto L16
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            X.01eN r1 = r5.LLILLL
            com.ss.android.ugc.aweme.comment.model.CommentItemList r8 = r5.LLILLJJLI
            java.lang.Object r7 = r5.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r6)
            goto L5c
        L46:
            X.C155000ia.LIZIZ(r6)
            X.01eN r1 = LJIIJ(r7)
            r5.LL = r7
            r5.LLILLJJLI = r8
            r5.LLILLL = r1
            r5.LLILZLL = r0
            java.lang.Object r0 = r1.LIZLLL(r2, r5)
            if (r0 != r4) goto L5c
            return r4
        L5c:
            X.0mQt r0 = X.C1396050mQt.LIZ     // Catch: java.lang.Throwable -> L8a
            r0.getClass()     // Catch: java.lang.Throwable -> L8a
            X.05M0 r0 = LIZLLL()     // Catch: java.lang.Throwable -> L8a
            X.05M6 r6 = new X.05M6     // Catch: java.lang.Throwable -> L8a
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L8a
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L8a
            r6.<init>(r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L8a
            r5.LL = r1     // Catch: java.lang.Throwable -> L8a
            r5.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L8a
            r5.LLILLL = r2     // Catch: java.lang.Throwable -> L8a
            r5.LLILZLL = r3     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = r0.LIZIZ(r7, r6, r5)     // Catch: java.lang.Throwable -> L8a
            if (r0 != r4) goto L84
            return r4
        L81:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Throwable -> L8a
        L84:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L8a
            r1.LIZIZ(r2)
            return r0
        L8a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8a
            r1.LIZIZ(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1396050mQt.LJIIJJI(com.ss.android.ugc.aweme.comment.model.CommentItemList, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static Object LJIIIIZZ(int i, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objLJI;
        if (!C1210404oQ.LIZ()) {
            return Unit.LIZ;
        }
        if (str.length() != 0 && str2.length() != 0) {
            C05M0 c05m0LIZLLL = LIZLLL();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (str.length() != 0 && str2.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(':');
                sbLIZ.append(str2);
                objLJI = c05m0LIZLLL.LJI(new C05M1(C2188811AlT.LIZIZ(sbLIZ), str, str2, i, jCurrentTimeMillis), interfaceC1364105Vn);
                if (objLJI != C099R.LJFF()) {
                    objLJI = Unit.LIZ;
                }
            } else {
                objLJI = Unit.LIZ;
            }
            if (objLJI == C099R.LJFF()) {
                return objLJI;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:43:0x00d7, B:44:0x00da, B:27:0x008f, B:29:0x0093, B:31:0x0099, B:33:0x009f, B:34:0x00a4, B:36:0x00aa, B:40:0x00bf, B:24:0x0075), top: B:53:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:43:0x00d7, B:44:0x00da, B:27:0x008f, B:29:0x0093, B:31:0x0099, B:33:0x009f, B:34:0x00a4, B:36:0x00aa, B:40:0x00bf, B:24:0x0075), top: B:53:0x001e }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.01eN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r11, java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1396050mQt.LIZ(int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<? extends com.ss.android.ugc.aweme.comment.model.Comment> r7, java.lang.String r8, com.ss.android.ugc.aweme.feed.model.Aweme r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C1396090mQx
            if (r0 == 0) goto L24
            r4 = r10
            X.0mQx r4 = (X.C1396090mQx) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r5 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            java.lang.Object r7 = r4.LL
            java.util.List r7 = (java.util.List) r7
            goto L75
        L24:
            X.0mQx r4 = new X.0mQx
            r4.<init>(r6, r10)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r5)
            boolean r0 = X.C1210404oQ.LIZ()
            if (r0 != 0) goto L3e
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            r1 = 0
            if (r9 == 0) goto L4d
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isOfflineVideo(r9)
            if (r0 != r2) goto L4d
            r0 = 1
        L48:
            if (r0 != 0) goto L4f
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4d:
            r0 = 0
            goto L48
        L4f:
            int r0 = r8.length()
            if (r0 != 0) goto L64
            r0 = 1
        L56:
            if (r0 != 0) goto Lbc
            if (r7 == 0) goto L60
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L61
        L60:
            r1 = 1
        L61:
            if (r1 != 0) goto Lbc
            goto L66
        L64:
            r0 = 0
            goto L56
        L66:
            X.05M0 r0 = LIZLLL()     // Catch: java.lang.Throwable -> L7e
            r4.LL = r7     // Catch: java.lang.Throwable -> L7e
            r4.LLILZ = r2     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r5 = r0.LJII(r8, r4)     // Catch: java.lang.Throwable -> L7e
            if (r5 != r3) goto L78
            return r3
        L75:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L7e
        L78:
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L7e
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L7e
            goto L8a
        L7e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r5 = new X.00Yq
            r5.<init>(r0)
            X.C189200o6.m2constructorimpl(r5)
        L8a:
            java.util.Map r1 = X.C2097608Jq.LJ()
            boolean r0 = X.C189200o6.m7isFailureimpl(r5)
            if (r0 == 0) goto L95
            r5 = r1
        L95:
            java.util.Map r5 = (java.util.Map) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto La0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La0:
            java.util.Iterator r2 = r7.iterator()
        La4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb9
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.comment.model.Comment r1 = (com.ss.android.ugc.aweme.comment.model.Comment) r1
            X.0mQt r0 = X.C1396050mQt.LIZ
            r0.getClass()
            LJI(r1, r5)
            goto La4
        Lb9:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lbc:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1396050mQt.LIZIZ(java.util.List, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, X.05Vn):java.lang.Object");
    }
}
