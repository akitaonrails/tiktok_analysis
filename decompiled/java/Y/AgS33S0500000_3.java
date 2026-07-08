package Y;

import X.AnonymousClass0954;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC346701Wf;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public class AgS33S0500000_3 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS33S0500000_3 r14, java.lang.Object r15, X.InterfaceC1364105Vn r16) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS33S0500000_3.emit$0(Y.AgS33S0500000_3, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS33S0500000_3 r9, java.lang.Object r10, X.InterfaceC1364105Vn r11) {
        /*
            boolean r0 = r11 instanceof X.C094F
            if (r0 == 0) goto L4b
            r5 = r11
            X.094F r5 = (X.C094F) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L51
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r9.l0
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            kotlin.Unit r1 = kotlin.Unit.LIZ
            java.lang.Object r0 = r9.l1
            X.094E r6 = new X.094E
            java.lang.Object r7 = r9.l2
            X.0954 r7 = (X.AnonymousClass0954) r7
            java.lang.Object r8 = r9.l3
            X.01Wf r8 = (X.InterfaceC346701Wf) r8
            java.lang.Object r9 = r9.l4
            X.0sYq r9 = (X.InterfaceC1631620sYq) r9
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r5.LLILLL = r3
            java.lang.Object r0 = X.C099W.LIZ(r2, r1, r0, r6, r5)
            if (r0 != r4) goto L22
            return r4
        L4b:
            X.094F r5 = new X.094F
            r5.<init>(r9, r11)
            goto L12
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS33S0500000_3.emit$1(Y.AgS33S0500000_3, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS33S0500000_3(Object obj, CoroutineContext coroutineContext, Object obj2, AnonymousClass0954<? extends Object> anonymousClass0954, InterfaceC346701Wf<Object> interfaceC346701Wf, InterfaceC1631620sYq<Object, Object, ? super InterfaceC1364105Vn<Object>, ? extends Object> interfaceC1631620sYq) {
        this.$t = interfaceC1631620sYq;
        this.l0 = obj;
        this.l1 = coroutineContext;
        this.l2 = obj2;
        this.l3 = anonymousClass0954;
        this.l4 = interfaceC346701Wf;
    }
}
