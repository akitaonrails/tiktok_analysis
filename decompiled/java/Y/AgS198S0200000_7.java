package Y;

import X.C0KVL;
import X.C0KVN;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import com.bytedance.android.livesdk.model.CommentReply;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public class AgS198S0200000_7 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS198S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(AgS198S0200000_7 agS198S0200000_7, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Pair pair = (Pair) obj;
        long jLongValue = ((Number) pair.getFirst()).longValue();
        CommentReply commentReply = ((C0KVL) agS198S0200000_7.l0).LIZ;
        if (jLongValue == commentReply.replyId) {
            commentReply.anchorFeedbackStatus = ((Number) pair.getSecond()).intValue();
            ((C0KVN) agS198S0200000_7.l1).I5(((C0KVL) agS198S0200000_7.l0).LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS198S0200000_7 r25, java.lang.Object r26, X.InterfaceC1364105Vn r27) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS198S0200000_7.emit$1(Y.AgS198S0200000_7, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.AgS198S0200000_7 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C0KVF
            if (r0 == 0) goto L4c
            r6 = r9
            X.0KVF r6 = (X.C0KVF) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L52
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            r2 = r8
            X.0K5u r2 = (X.AbstractC511920K5u) r2
            java.lang.Object r0 = r7.l1
            X.0KVE r0 = (X.C0KVE) r0
            X.0K5u r0 = r0.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            r1 = r0 ^ 1
            java.lang.Object r0 = r7.l1
            X.0KVE r0 = (X.C0KVE) r0
            r0.LIZIZ = r2
            if (r1 == 0) goto L22
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r8, r6)
            if (r0 != r5) goto L22
            return r5
        L4c:
            X.0KVF r6 = new X.0KVF
            r6.<init>(r7, r9)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS198S0200000_7.emit$2(Y.AgS198S0200000_7, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$3(Y.AgS198S0200000_7 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C0KVG
            if (r0 == 0) goto L45
            r4 = r7
            X.0KVG r4 = (X.C0KVG) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L4b
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.lang.Object r0 = r5.l1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r0 = r0.invoke(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L45:
            X.0KVG r4 = new X.0KVG
            r4.<init>(r5, r7)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS198S0200000_7.emit$3(Y.AgS198S0200000_7, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
