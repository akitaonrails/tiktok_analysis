package X;

import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0YGE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YGE implements C0VS9 {
    public static final /* synthetic */ int LJFF = 0;
    public final C0YEM LIZ;
    public final C872940YMi LIZIZ;
    public final C0YGD LIZJ;
    public final C0Y77 LIZLLL;
    public final C0YGI LJ;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r9, java.util.List<com.bytedance.im.core.proto.MessageCheckInfoV2> r10, X.InterfaceC1364105Vn<? super X.C189200o6<? extends kotlin.Pair<? extends java.util.List<com.bytedance.im.core.proto.MessageBody>, java.lang.String>>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C0YGG
            if (r0 == 0) goto L20
            r4 = r11
            X.0YGG r4 = (X.C0YGG) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r2 = r4.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r7 = 1
            if (r0 == 0) goto L2e
            if (r0 != r7) goto L26
            goto L97
        L20:
            X.0YGG r4 = new X.0YGG
            r4.<init>(r8, r11)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L44
            kotlin.Pair r2 = new kotlin.Pair
            X.13BV r1 = X.C13BV.INSTANCE
            java.lang.String r0 = ""
            r2.<init>(r1, r0)
            X.C189200o6.m2constructorimpl(r2)
            return r2
        L44:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: X.C872730YLn -> L9e
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r10, r0)     // Catch: X.C872730YLn -> L9e
            r6.<init>(r0)     // Catch: X.C872730YLn -> L9e
            java.util.Iterator r3 = r10.iterator()     // Catch: X.C872730YLn -> L9e
        L53:
            boolean r0 = r3.hasNext()     // Catch: X.C872730YLn -> L9e
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r3.next()     // Catch: X.C872730YLn -> L9e
            com.bytedance.im.core.proto.MessageCheckInfoV2 r0 = (com.bytedance.im.core.proto.MessageCheckInfoV2) r0     // Catch: X.C872730YLn -> L9e
            com.bytedance.im.core.proto.MessageIDIndexEntry r2 = new com.bytedance.im.core.proto.MessageIDIndexEntry     // Catch: X.C872730YLn -> L9e
            java.lang.Long r1 = r0.msg_id     // Catch: X.C872730YLn -> L9e
            java.lang.Long r0 = r0.index_in_conv     // Catch: X.C872730YLn -> L9e
            r2.<init>(r1, r0)     // Catch: X.C872730YLn -> L9e
            r6.add(r2)     // Catch: X.C872730YLn -> L9e
            goto L53
        L6c:
            r4.LL = r9     // Catch: X.C872730YLn -> L9e
            r4.LLILLJJLI = r6     // Catch: X.C872730YLn -> L9e
            r4.LLILZIL = r7     // Catch: X.C872730YLn -> L9e
            X.099m r3 = new X.099m     // Catch: X.C872730YLn -> L9e
            X.05Vn r0 = X.C099M.LIZLLL(r4)     // Catch: X.C872730YLn -> L9e
            r3.<init>(r0)     // Catch: X.C872730YLn -> L9e
            X.0YGI r2 = r8.LJ     // Catch: X.C872730YLn -> L9e
            X.0Ztd r1 = new X.0Ztd     // Catch: X.C872730YLn -> L9e
            r0 = 22
            r1.<init>(r3, r0)     // Catch: X.C872730YLn -> L9e
            r2.LJII(r1, r9, r6)     // Catch: X.C872730YLn -> L9e
            java.lang.Object r2 = r3.LIZ()     // Catch: X.C872730YLn -> L9e
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: X.C872730YLn -> L9e
            if (r2 != r0) goto L94
            X.C099Q.LIZJ(r4)     // Catch: X.C872730YLn -> L9e
        L94:
            if (r2 != r5) goto L9a
            return r5
        L97:
            X.C155000ia.LIZIZ(r2)     // Catch: X.C872730YLn -> L9e
        L9a:
            X.C189200o6.m2constructorimpl(r2)     // Catch: X.C872730YLn -> L9e
            return r2
        L9e:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0YEM r0 = r8.LIZ
            X.0Y6i r2 = r0.LIZLLL()
            java.lang.String r1 = "MessageCompletenessCheckAndRepairUseCase"
            java.lang.String r0 = "getMessagesWithContinuation"
            r2.LJIIIIZZ(r1, r0, r3)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r3)
            X.C189200o6.m2constructorimpl(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YGE.LIZJ(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    public C0YGE(final C0YEM c0yem, C872940YMi c872940YMi, C0YFX c0yfx, C0Y77 c0y77) {
        C0YGI c0ygi = new C0YGI(c0yem) { // from class: X.0Y9P
            public final C0YEM LIZ;

            @Override // X.C0YGI
            public final InterfaceC866720XzK LIZ() {
                return this.LIZ.LJIIZILJ().LIZLLL().LIZ();
            }

            @Override // X.C0YGI
            public final String getUid() {
                return String.valueOf(this.LIZ.getUid());
            }

            {
                this.LIZ = c0yem;
            }

            @Override // X.C0YGI
            public final void LIZIZ(Map map) {
                C0YJ9 c0yj9 = new C0YJ9(this.LIZ);
                c0yj9.LIZJ("im_messages_missing_check");
                c0yj9.LIZIZ(map);
                c0yj9.LIZLLL();
            }

            @Override // X.C0YGI
            public final Long LIZJ(String str) {
                return Long.valueOf(this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJII(str));
            }

            @Override // X.C0YGI
            public final long LIZLLL(String str) {
                return C870740YDw.LJFF(this.LIZ.LIZLLL(), C870740YDw.LIZLLL(this.LIZ).LJFF(str, "conv_init_old_cursor"));
            }

            @Override // X.C0YGI
            public final long LJ(String str) {
                return C870740YDw.LJFF(this.LIZ.LIZLLL(), C870740YDw.LIZLLL(this.LIZ).LJFF(str, "conv_history_cursor"));
            }

            @Override // X.C0YGI
            public final C0Y8T LJFF(String str) {
                return this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true);
            }

            @Override // X.C0YGI
            public final boolean LJI(long j) {
                return this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJL(j);
            }

            @Override // X.C0YGI
            public final List<Long> LJIIIIZZ(List<Long> list) {
                return this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJJJI(list);
            }

            @Override // X.C0YGI
            public final Boolean LJIIIZ(String str) {
                return this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJJJZ(str);
            }

            @Override // X.C0YGI
            public final void LJII(C914150Ztd c914150Ztd, String str, List list) {
                C870180YBs c870180YBsLIZ = this.LIZ.LJIIZILJ().getDomain().LIZ();
                c870180YBsLIZ.LIZLLL().LIZLLL().LIZ().LJJLIL(str, new C914130Ztb(c914150Ztd, list, c870180YBsLIZ, 6));
            }
        };
        this.LIZ = c0yem;
        this.LIZIZ = c872940YMi;
        this.LIZJ = c0yfx;
        this.LIZLLL = c0y77;
        this.LJ = c0ygi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x034f, code lost:
    
        r9.add(r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02dc  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v1, types: [X.13BV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r22v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v130 */
    /* JADX WARN: Type inference failed for: r3v131 */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v34, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r48v0, types: [X.0YGE] */
    @Override // X.C0VS9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r49, java.util.List<? extends X.C869590Y9l> r50, java.lang.Boolean r51, X.InterfaceC1364105Vn<? super kotlin.Unit> r52) {
        /*
            Method dump skipped, instruction units count: 2550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YGE.LIZ(java.lang.String, java.util.List, java.lang.Boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r13, long r14, java.lang.String r16, X.InterfaceC1364105Vn r17) {
        /*
            r12 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C0YGJ
            if (r0 == 0) goto L24
            r11 = r3
            X.0YGJ r11 = (X.C0YGJ) r11
            int r2 = r11.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r11.LLILLL = r2
        L14:
            java.lang.Object r1 = r11.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r11.LLILLL
            java.lang.String r3 = "MessageCompletenessCheckAndRepairUseCase"
            r4 = 1
            if (r0 == 0) goto L32
            if (r0 != r4) goto L2a
            goto L61
        L24:
            X.0YGJ r11 = new X.0YGJ
            r11.<init>(r12, r3)
            goto L14
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.0YEM r0 = r12.LIZ     // Catch: java.lang.Exception -> L67
            X.0Y6i r2 = r0.LIZLLL()     // Catch: java.lang.Exception -> L67
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L67
            r10 = r16
            r1.append(r10)     // Catch: java.lang.Exception -> L67
            java.lang.String r0 = " fetchMessageCompletenessInfo, with request index "
            r1.append(r0)     // Catch: java.lang.Exception -> L67
            r8 = r14
            r1.append(r8)     // Catch: java.lang.Exception -> L67
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L67
            r0 = 4
            X.C868780Y6i.LJIILJJIL(r2, r3, r1, r0)     // Catch: java.lang.Exception -> L67
            X.0YMi r6 = r12.LIZIZ     // Catch: java.lang.Exception -> L67
            r11.LLILLL = r4     // Catch: java.lang.Exception -> L67
            r7 = r13
            java.lang.Object r1 = r6.LIZJ(r7, r8, r10, r11)     // Catch: java.lang.Exception -> L67
            if (r1 != r5) goto L64
            return r5
        L61:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L67
        L64:
            X.0YGB r1 = (X.C0YGB) r1     // Catch: java.lang.Exception -> L67
            return r1
        L67:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0YEM r0 = r12.LIZ
            X.0Y6i r1 = r0.LIZLLL()
            java.lang.String r0 = "fetchCheckInfoWithContinuation"
            r1.LJIIIIZZ(r3, r0, r2)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YGE.LIZIZ(int, long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r21, java.lang.String r22, java.util.List<com.bytedance.im.core.proto.MessageBody> r23, long r24, int r26, X.InterfaceC1364105Vn<? super java.util.List<? extends X.C869590Y9l>> r27) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YGE.LIZLLL(java.lang.String, java.lang.String, java.util.List, long, int, X.05Vn):java.lang.Object");
    }

    public static void LJ(C0YGE c0yge, String str, String str2, List list, int i, int i2, boolean z, int i3) {
        long j;
        if ((i3 & 8) != 0) {
            i = -1;
        }
        if ((i3 & 16) != 0) {
            i2 = -1;
        }
        if ((i3 & 32) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        if ((i3 & 64) != 0) {
            z = false;
        }
        c0yge.getClass();
        c0yge.LJ.LIZIZ(C2097608Jq.LJIIIIZZ(new Pair("inbox", String.valueOf(i)), new Pair("missing_count", "-1"), new Pair("conversation_type", String.valueOf(i2)), new Pair("total_check_count", "-1"), new Pair("total_memory_count", String.valueOf(list.size())), new Pair("request_msg_index", String.valueOf(j)), new Pair("missing_message_id_list", ""), new Pair("message_type_list", ""), new Pair("conversation_id", str2), new Pair("conversation_short_id", "-1"), new Pair("repaired_msg_count", "-1"), new Pair("new_missing_count", "-1"), new Pair("old_missing_count", "-1"), new Pair("continuity_check_result", "-1"), new Pair("has_db_failure", "-1"), new Pair("conv_history_cursor", "-1"), new Pair("conv_has_more", String.valueOf(z)), new Pair("inbox_init_state", "-1"), new Pair("skipped_reason", str)));
    }
}
