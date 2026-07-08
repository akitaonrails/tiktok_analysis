package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Content;
import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskDetail;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C544000LVe extends C0LTN<C09JG, I2VServerTaskOutput> {
    public static final C558070Luf LJIIJJI = new C558070Luf();
    public final String LJIIIIZZ = C0LM5.I2V_SERVER.getTypeName();
    public final String LJIIIZ = C0LMI.SERVER.getType();
    public String LJIIJ = "";

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIIZ;
    }

    @Override // X.C0LTN
    public final String LJJ() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C544190LVx
            if (r0 == 0) goto L4a
            r5 = r7
            X.0LVx r5 = (X.C544190LVx) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 == r0) goto L34
            if (r1 != r2) goto L50
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
            X.0Luf r1 = X.C544000LVe.LJIIJJI
            X.0LSZ r0 = r6.LIZLLL
            java.lang.String r0 = r0.LJIJJLI
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r5.LLILLL = r2
            java.lang.Object r0 = r1.LIZ(r0, r5)
            if (r0 != r3) goto L25
            return r3
        L4a:
            X.0LVx r5 = new X.0LVx
            r5.<init>(r6, r7)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544000LVe.LJIIJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            r15 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C0LWM
            r8 = r15
            if (r0 == 0) goto La4
            r13 = r3
            X.0LWM r13 = (X.C0LWM) r13
            int r2 = r13.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La4
            int r2 = r2 - r1
            r13.LLILZ = r2
        L15:
            java.lang.Object r7 = r13.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r13.LLILZ
            r5 = 3
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L2e
            if (r0 == r6) goto L59
            if (r0 == r2) goto Lb3
            if (r0 != r5) goto Lab
            X.C155000ia.LIZIZ(r7)
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            X.C155000ia.LIZIZ(r7)
            X.0LSZ r0 = r8.LIZLLL
            java.lang.String r3 = r0.LJIJJLI
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "requestProgress request: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r8.LJJJJIZL(r0)
            X.0Luf r1 = X.C544000LVe.LJIIJJI
            java.util.List r0 = java.util.Collections.singletonList(r3)
            r13.LL = r3
            r13.LLILZ = r6
            java.lang.Object r7 = r1.LIZLLL(r0, r13)
            if (r7 != r4) goto L60
            return r4
        L59:
            java.lang.Object r3 = r13.LL
            java.lang.String r3 = (java.lang.String) r3
            X.C155000ia.LIZIZ(r7)
        L60:
            com.ss.android.ugc.aweme.aigc.asynctask.net.UpdateAIGCTaskStatusResponse r7 = (com.ss.android.ugc.aweme.aigc.asynctask.net.UpdateAIGCTaskStatusResponse) r7
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "requestProgress response: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r8.LJJJJIZL(r0)
            r10 = 0
            if (r7 != 0) goto L8a
            r9 = -47365(0xffffffffffff46fb, float:NaN)
            r13.LL = r10
            r13.LLILZ = r2
            r14 = 14
            r11 = r10
            r12 = r10
            java.lang.Object r0 = X.C539400LDm.LIZ(r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r4) goto Lb6
            return r4
        L8a:
            int r2 = r7.statusCode
            java.lang.String r1 = r7.message
            X.05C9 r0 = new X.05C9
            r0.<init>(r7, r8, r3, r10)
            r13.LL = r10
            r13.LLILZ = r5
            r5 = r8
            r6 = r2
            r7 = r1
            r8 = r10
            r9 = r0
            r10 = r13
            java.lang.Object r0 = r5.LJJJJLI(r6, r7, r8, r9, r10)
            if (r0 != r4) goto L2b
            return r4
        La4:
            X.0LWM r13 = new X.0LWM
            r13.<init>(r8, r3)
            goto L15
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb3:
            X.C155000ia.LIZIZ(r7)
        Lb6:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544000LVe.LJJJJZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005a -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZI(X.InterfaceC1364105Vn<? super kotlin.Unit> r40) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544000LVe.LJJJJZI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C09JG r38, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput> r39) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544000LVe.LJFF(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput r45, X.InterfaceC1364105Vn<? super kotlin.Unit> r46) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544000LVe.LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJL(X.C09JG r40, X.InterfaceC1364105Vn<? super kotlin.Unit> r41) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544000LVe.LJJJJL(X.09JG, X.05Vn):java.lang.Object");
    }

    public final Object LJJJJLL(TaskDetail taskDetail, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String str;
        List<String> list;
        int i = taskDetail.statusCode;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    Object objLIZ = C539400LDm.LIZ(this, i, taskDetail.message, null, null, interfaceC1364105Vn, 12);
                    if (objLIZ == C099R.LJFF()) {
                        return objLIZ;
                    }
                    return Unit.LIZ;
                }
                Content content = (Content) C13LP.LJJJLZIJ(0, taskDetail.content);
                if (content == null || (list = content.urlList) == null || (str = (String) C13LP.LJJJLZIJ(0, list)) == null) {
                    str = "";
                }
                this.LJIIJ = str;
                LJJIJIIJIL(true);
                Object objLJJJ = C0LTN.LJJJ(this, C0LSZ.LIZ(this.LIZLLL, null, null, null, null, null, null, null, 100, null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 264241023), interfaceC1364105Vn);
                if (objLJJJ == C099R.LJFF()) {
                    return objLJJJ;
                }
                return Unit.LIZ;
            }
            Object objLJJJ2 = C0LTN.LJJJ(this, C0LSZ.LIZ(this.LIZLLL, null, null, null, null, null, null, null, (int) (((double) 10) + (((double) taskDetail.completePercentage) * 0.9d)), null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, taskDetail.waitingTime, null, null, null, 0, null, 264241023), interfaceC1364105Vn);
            if (objLJJJ2 == C099R.LJFF()) {
                return objLJJJ2;
            }
            return Unit.LIZ;
        }
        Object objLJJJ3 = C0LTN.LJJJ(this, C0LSZ.LIZ(this.LIZLLL, null, null, null, null, null, null, null, 10, null, null, null, 0, null, null, null, 0, null, null, null, 0L, taskDetail.taskId, 0L, null, null, null, 0, null, 266338175), interfaceC1364105Vn);
        if (objLJJJ3 == C099R.LJFF()) {
            return objLJJJ3;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c4  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r41v0, types: [X.0LQl, X.0LTN, X.0LVe] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLIIL(X.C09JG r42, X.InterfaceC1364105Vn<? super kotlin.Unit> r43) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544000LVe.LJJJLIIL(X.09JG, X.05Vn):java.lang.Object");
    }

    public final Object LJJJJLI(int i, String str, TaskDetail taskDetail, Function1 function1, AbstractC23140094w abstractC23140094w) {
        String str2;
        String str3 = str;
        int i2 = i;
        if (i2 == 0) {
            return function1.invoke(abstractC23140094w);
        }
        if (taskDetail != null) {
            i2 = taskDetail.statusCode;
        }
        if (taskDetail != null && (str2 = taskDetail.message) != null) {
            str3 = str2;
        }
        Object objLIZ = C539400LDm.LIZ(this, i2, str3, null, null, abstractC23140094w, 12);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}
