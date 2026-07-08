package X;

import X.C09JG;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC543030LRl<IN extends C09JG, OUT extends AbsTaskOutput> extends C0LTN<C09JG, AbsTaskOutput> {
    public static final C1DEV LJIJI = C2191201ApK.LIZ();
    public PublicTaskInput LJIILIIL;
    public boolean LJIILJJIL;
    public AnonymousClass0956 LJIIZILJ;
    public AnonymousClass0956 LJIJ;
    public final List<AbstractC542960LRe<C09JG, AbsTaskOutput>> LJIIIIZZ = new ArrayList();
    public final List<AbstractC542960LRe<C09JG, AbsTaskOutput>> LJIIIZ = new ArrayList();
    public final List<AbstractC542960LRe<C09JG, AbsTaskOutput>> LJIIJ = new ArrayList();
    public final List<AbstractC542960LRe<C09JG, AbsTaskOutput>> LJIIJJI = new ArrayList();
    public final Class<PublicTaskInput> LJIIL = PublicTaskInput.class;
    public final String LJIILL = C0LQP.EDITOR_PRO_AIGC_T2I.getTypeName();
    public final C054G LJIILLIIL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    @Override // X.C0LTN, X.InterfaceC542770LQl
    public final Object LIZIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJLIIIJLJLI(this, interfaceC1364105Vn);
    }

    @Override // X.C0LTN, X.InterfaceC542770LQl
    public Object LJFF(C09JG c09jg, InterfaceC1364105Vn<? super C1974607oO> interfaceC1364105Vn) {
        return LJJLIIIJ(this, c09jg, interfaceC1364105Vn);
    }

    @Override // X.C0LTN, X.InterfaceC542770LQl
    public final Object LJIIJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJJLL(this, interfaceC1364105Vn);
    }

    public void LJJJJJL() {
    }

    public abstract void LJJJJL();

    public abstract void LJJJJLL();

    public abstract void LJJJJZ();

    public final void LJJLI() {
        if (this.LJIILJJIL) {
            return;
        }
        this.LJIILJJIL = true;
        LJJJJZ();
        LJJJJL();
        LJJJJLL();
        LJJJJJL();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LJIIIIZZ);
        arrayList.addAll(this.LJIIIZ);
        arrayList.addAll(this.LJIIJ);
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            AbstractC542960LRe abstractC542960LRe = (AbstractC542960LRe) obj;
            if (i == 0) {
                abstractC542960LRe.LIZJ = C0LM6.STEP_DEFAULT;
            } else {
                abstractC542960LRe.LIZJ = ((AbstractC542960LRe) ListProtector.get(arrayList, i - 1)).LIZIZ();
            }
            i = i2;
        }
    }

    @Override // X.C0LTN
    public String LJJ() {
        return this.LJIILL;
    }

    public final void LJJJJLI(AbstractC542960LRe<?, ?> abstractC542960LRe) {
        ((ArrayList) this.LJIIJ).add(abstractC542960LRe);
    }

    public final void LJJJJZI(AbstractC542960LRe<?, ?> abstractC542960LRe) {
        ((ArrayList) this.LJIIIIZZ).add(abstractC542960LRe);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLIIL(X.InterfaceC1364105Vn<? super kotlin.Unit> r38) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC543030LRl.LJJJLIIL(X.05Vn):java.lang.Object");
    }

    public final long LJJJLZIJ(int i) {
        long j;
        C0LSZ c0lszLJIIIIZZ;
        InterfaceC542770LQl<? super C09JG, ? extends AbsTaskOutput> interfaceC542770LQl = this.LJ;
        if (interfaceC542770LQl != null && (c0lszLJIIIIZZ = interfaceC542770LQl.LJIIIIZZ()) != null) {
            j = c0lszLJIIIIZZ.LJIL;
        } else {
            j = -1;
        }
        if (!Intrinsics.LJFF(this.LIZLLL.LJI, LivePreviewCTASmartDisplayManager.DEFAULT) && !Intrinsics.LJFF(this.LIZLLL.LJI, "IMAGE_UPLOAD")) {
            if (Intrinsics.LJFF(this.LIZLLL.LJI, "SERVER")) {
                if (j >= 0) {
                    return 1000 + j;
                }
                if (this.LIZLLL.LJIL >= 1000) {
                    return this.LIZLLL.LJIL;
                }
                return 121000L;
            }
            if (Intrinsics.LJFF(this.LIZLLL.LJI, "DOWNLOAD") || i > 95) {
                return 1000L;
            }
            return 120000L;
        }
        return 123000L;
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
    public final java.lang.Object LJJJZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r40) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC543030LRl.LJJJZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C543140LRw
            if (r0 == 0) goto L20
            r5 = r7
            X.0LRw r5 = (X.C543140LRw) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            goto L26
        L20:
            X.0LRw r5 = new X.0LRw
            r5.<init>(r6, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L84
            goto L9f
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = "waitForBackgroundTasks: Starting to wait for background tasks"
            r6.LJJJJIZL(r0)
            X.0956 r2 = r6.LJIJ
            if (r2 != 0) goto L46
            java.lang.String r0 = "waitForBackgroundTasks: backgroundTasksJob is null"
            r6.LJJJJIZL(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L46:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = "waitForBackgroundTasks: Job status - isActive="
            r1.append(r0)     // Catch: java.lang.Exception -> L84
            boolean r0 = r2.isActive()     // Catch: java.lang.Exception -> L84
            r1.append(r0)     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = ", isCompleted="
            r1.append(r0)     // Catch: java.lang.Exception -> L84
            boolean r0 = r2.isCompleted()     // Catch: java.lang.Exception -> L84
            r1.append(r0)     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = ", isCancelled="
            r1.append(r0)     // Catch: java.lang.Exception -> L84
            boolean r0 = r2.isCancelled()     // Catch: java.lang.Exception -> L84
            r1.append(r0)     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L84
            r6.LJJJJIZL(r0)     // Catch: java.lang.Exception -> L84
            boolean r0 = r2.isActive()     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L9f
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L84
            java.lang.Object r0 = r2.LJJZ(r5)     // Catch: java.lang.Exception -> L84
            if (r0 != r4) goto L9f
            return r4
        L84:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "waitForBackgroundTasks: Error waiting for background tasks: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r6.LJJJJIZL(r0)
        L9f:
            java.lang.String r0 = "waitForBackgroundTasks completed"
            r6.LJJJJIZL(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC543030LRl.LJJLIIJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJJLL(X.AbstractC543030LRl<? super IN, ? extends OUT> r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof X.C543080LRq
            if (r0 == 0) goto L53
            r5 = r7
            X.0LRq r5 = (X.C543080LRq) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r5.LLILZ
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 == r0) goto L39
            if (r1 != r2) goto L59
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            r5.LL = r6
            r5.LLILZ = r0
            r6.getClass()
            java.lang.Object r0 = X.C0LTN.LJIILJJIL(r6, r5)
            if (r0 != r3) goto L3e
            return r3
        L39:
            X.0LRl r6 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L3e:
            X.0956 r1 = r6.LJIJ
            r0 = 0
            if (r1 == 0) goto L46
            r1.LIZIZ(r0)
        L46:
            r6.LJIJ = r0
            r5.LL = r0
            r5.LLILZ = r2
            java.lang.Object r0 = r6.LJJIIJ(r5)
            if (r0 != r3) goto L25
            return r3
        L53:
            X.0LRq r5 = new X.0LRq
            r5.<init>(r6, r7)
            goto L12
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC543030LRl.LJJJLL(X.0LRl, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJLIIIJLJLI(X.AbstractC543030LRl<? super IN, ? extends OUT> r5, X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof X.C543090LRr
            if (r0 == 0) goto L40
            r4 = r6
            X.0LRr r4 = (X.C543090LRr) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L2f
            if (r1 != r0) goto L46
            X.0LRl r5 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            X.0956 r1 = r5.LJIIZILJ
            if (r1 == 0) goto L2c
            r0 = 0
            r1.LIZIZ(r0)
        L2c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2f:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r5
            r4.LLILZ = r0
            r5.getClass()
            java.lang.Object r0 = X.C0LTN.LJJJIL(r5, r4)
            if (r0 != r2) goto L24
            return r2
        L40:
            X.0LRr r4 = new X.0LRr
            r4.<init>(r5, r6)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC543030LRl.LJJLIIIJLJLI(X.0LRl, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJL(X.C09JG r47, X.InterfaceC1364105Vn<? super kotlin.Unit> r48) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC543030LRl.LJJL(X.09JG, X.05Vn):java.lang.Object");
    }

    public C0LSZ LJJLIIIIJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput) {
        return C0LSZ.LIZ(c0lsz, null, null, null, null, LivePreviewCTASmartDisplayManager.DEFAULT, null, null, 0, null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268435439);
    }

    public final Object LJJLIIIJLLLLLLLZ(PublicTaskInput publicTaskInput, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        Object objLJJJI = C0LTN.LJJJI(this, C0LSZ.LIZ(this.LIZLLL, null, null, null, null, null, null, null, 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427263), interfaceC1364105Vn);
        if (objLJJJI == C099R.LJFF()) {
            return objLJJJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0180 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJLIIIJ(X.AbstractC543030LRl<? super IN, ? extends OUT> r10, X.C09JG r11, X.InterfaceC1364105Vn<? super X.C1974607oO> r12) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC543030LRl.LJJLIIIJ(X.0LRl, X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7 A[Catch: Exception -> 0x0143, TryCatch #0 {Exception -> 0x0143, blocks: (B:14:0x002d, B:43:0x00c1, B:44:0x00c4, B:46:0x00e7, B:48:0x00ef, B:50:0x00f7, B:53:0x0123, B:31:0x0096, B:32:0x0099, B:34:0x009d, B:36:0x00a0, B:38:0x00a6, B:40:0x00ae, B:20:0x004a, B:22:0x0052, B:24:0x0055, B:26:0x007c, B:28:0x007f), top: B:58:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef A[Catch: Exception -> 0x0143, TryCatch #0 {Exception -> 0x0143, blocks: (B:14:0x002d, B:43:0x00c1, B:44:0x00c4, B:46:0x00e7, B:48:0x00ef, B:50:0x00f7, B:53:0x0123, B:31:0x0096, B:32:0x0099, B:34:0x009d, B:36:0x00a0, B:38:0x00a6, B:40:0x00ae, B:20:0x004a, B:22:0x0052, B:24:0x0055, B:26:0x007c, B:28:0x007f), top: B:58:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJILLIZJL(X.AbstractC542960LRe<X.C09JG, com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r11, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC543030LRl.LJJLIIIJILLIZJL(X.0LRe, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJJI(X.AbstractC542960LRe<X.C09JG, com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r42, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r43, X.InterfaceC1364105Vn<? super kotlin.Unit> r44) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC543030LRl.LJJLIIIJJI(X.0LRe, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJJIZ(X.AbstractC542960LRe<X.C09JG, com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r43, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r44, X.InterfaceC1364105Vn<? super kotlin.Unit> r45) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC543030LRl.LJJLIIIJJIZ(X.0LRe, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJL(X.AbstractC542960LRe r43, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r44, X.InterfaceC1364105Vn r45) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC543030LRl.LJJLIIIJL(X.0LRe, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput, X.05Vn):java.lang.Object");
    }
}
