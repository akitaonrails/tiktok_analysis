package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C543160LRy extends C0LTN<C09JG, C1974607oO> {
    public static final C1DEV LJIIL = C2191201ApK.LIZ();
    public final String LJIIIIZZ = C0LQP.AI_LIVE_I2V.getTypeName();
    public final C054G LJIIIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public AnonymousClass0956 LJIIJ;
    public int LJIIJJI;

    @Override // X.C0LTN
    public final String LJJ() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C0LS4
            if (r0 == 0) goto L39
            r4 = r6
            X.0LS4 r4 = (X.C0LS4) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 != r0) goto L3f
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0956 r1 = r5.LJIIJ
            if (r1 == 0) goto L2a
            r0 = 0
            r1.LIZIZ(r0)
        L2a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r0 = X.C0LTN.LJJJIL(r5, r4)
            if (r0 != r2) goto L22
            return r2
        L39:
            X.0LS4 r4 = new X.0LS4
            r4.<init>(r5, r6)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543160LRy.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C0LS3
            if (r0 == 0) goto L40
            r5 = r7
            X.0LS3 r5 = (X.C0LS3) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r5.LLILLL
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L28
            if (r2 == r0) goto L34
            if (r2 != r1) goto L46
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            r5.LLILLL = r0
            java.lang.Object r0 = X.C0LTN.LJIILJJIL(r6, r5)
            if (r0 != r3) goto L37
            return r3
        L34:
            X.C155000ia.LIZIZ(r4)
        L37:
            r5.LLILLL = r1
            java.lang.Object r0 = r6.LJJIIJ(r5)
            if (r0 != r3) goto L25
            return r3
        L40:
            X.0LS3 r5 = new X.0LS3
            r5.<init>(r6, r7)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543160LRy.LJIIJ(X.05Vn):java.lang.Object");
    }

    @Override // X.C0LTN
    public final void LJIIJJI(C543670LTx c543670LTx) {
        c543670LTx.LIZJ(Long.valueOf(this.LIZLLL.LJJ.inputFileSize), "input_file_size_mb");
        c543670LTx.LIZLLL("input_file_type", this.LIZLLL.LJJ.inputFileType);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(X.InterfaceC1364105Vn<? super kotlin.Unit> r39) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543160LRy.LJJJJJL(X.05Vn):java.lang.Object");
    }

    public final Pair<Long, Integer> LJJJJL(int i) {
        long j;
        long jLIZ;
        C0LSZ c0lszLJIIIIZZ;
        InterfaceC542770LQl<? super C09JG, ? extends AbsTaskOutput> interfaceC542770LQl = this.LJ;
        if (interfaceC542770LQl != null && (c0lszLJIIIIZZ = interfaceC542770LQl.LJIIIIZZ()) != null) {
            j = c0lszLJIIIIZZ.LJIL;
        } else {
            j = -1;
        }
        if (!Intrinsics.LJFF(this.LIZLLL.LJI, LivePreviewCTASmartDisplayManager.DEFAULT) && !Intrinsics.LJFF(this.LIZLLL.LJI, "IMAGE_UPLOAD")) {
            jLIZ = 1000;
            int i2 = 2;
            if (Intrinsics.LJFF(this.LIZLLL.LJI, "SERVER")) {
                if (j >= 0) {
                    if (this.LJIIJJI == 0) {
                        i2 = 1;
                    }
                    this.LJIIJJI = i2;
                    jLIZ = 1000 + j;
                } else {
                    this.LJIIJJI = 0;
                    jLIZ = 121000;
                }
            } else if (!Intrinsics.LJFF(this.LIZLLL.LJI, "DOWNLOAD") && i <= 95) {
                jLIZ = 120000;
            } else {
                this.LJIIJJI = 2;
            }
        } else {
            this.LJIIJJI = 0;
            if (C545810Lat.LIZ()) {
                jLIZ = C0A1A.LIZ();
            } else {
                jLIZ = 123000;
            }
        }
        return new Pair<>(Long.valueOf(jLIZ), Integer.valueOf(this.LJIIJJI));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    public final java.lang.Object LJJJJLI(X.InterfaceC1364105Vn<? super kotlin.Unit> r40) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543160LRy.LJJJJLI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r39) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543160LRy.LJJJJZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0276 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0277  */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult, com.ss.android.ugc.aweme.aigc.asynctask.Source, com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra, java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZI(X.InterfaceC1364105Vn<? super kotlin.Unit> r68) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543160LRy.LJJJJZI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a A[RETURN] */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C09JG r23, X.InterfaceC1364105Vn<? super X.C1974607oO> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543160LRy.LJFF(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x035d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLL(X.C09JG r39, X.InterfaceC1364105Vn<? super kotlin.Unit> r40) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543160LRy.LJJJJLL(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLIIL(X.C09JG r40, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.aicreation.models.ImagePreprocessTaskOutput> r41) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543160LRy.LJJJLIIL(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022f A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.ss.android.ugc.aweme.aigc.aicreation.models.ImagePreprocessTaskOutput, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult, com.ss.android.ugc.aweme.aigc.asynctask.Source, com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v2, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r35v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r36v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r37v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r40v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r44v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r46v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r48v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r50v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r51v0, types: [X.0LRy, X.0LTN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLL(X.C09JG r52, com.ss.android.ugc.aweme.aigc.aicreation.models.ImagePreprocessTaskOutput r53, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput> r54) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543160LRy.LJJJLL(X.09JG, com.ss.android.ugc.aweme.aigc.aicreation.models.ImagePreprocessTaskOutput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0215 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0229 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0292  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult, com.ss.android.ugc.aweme.aigc.asynctask.Source, com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r36v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r37v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r38v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r41v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r42v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r43v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r43v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r44v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r45v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r51v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r56v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r58v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.ss.android.ugc.aweme.aigc.asynctask.I2VTaskInput] */
    /* JADX WARN: Type inference failed for: r60v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r61v0, types: [X.0LRy, X.0LTN] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLZIJ(X.C09JG r62, com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput r63, X.InterfaceC1364105Vn<? super kotlin.Unit> r64) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543160LRy.LJJJLZIJ(X.09JG, com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput, X.05Vn):java.lang.Object");
    }
}
