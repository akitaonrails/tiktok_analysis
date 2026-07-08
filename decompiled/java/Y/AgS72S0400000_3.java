package Y;

import X.C05XL;
import X.C095E;
import X.C096H;
import X.C09AE;
import X.C2296808zG;
import X.C23123094f;
import X.C23144095a;
import X.C259800zU;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public class AgS72S0400000_3 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(X.InterfaceC346201Wa<? extends T> r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C094Z
            if (r0 == 0) goto L66
            r4 = r7
            X.094Z r4 = (X.C094Z) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r1 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r2 = 1
            if (r0 == 0) goto L3f
            if (r0 != r2) goto L6c
            X.01Wa r6 = r4.LLILLJJLI
            Y.AgS72S0400000_3 r0 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L26:
            java.lang.Object r4 = r0.l2
            X.094D r4 = (X.C094D) r4
            X.094Y r3 = new X.094Y
            java.lang.Object r2 = r0.l3
            X.094X r2 = (X.C094X) r2
            java.lang.Object r0 = r0.l1
            X.05Lk r0 = (X.InterfaceC1337805Lk) r0
            r1 = 0
            r3.<init>(r6, r2, r0, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r4, r1, r1, r3, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3f:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.09AE r1 = (X.C09AE) r1
            if (r1 == 0) goto L53
            boolean r0 = r1.isActive()
            if (r0 != 0) goto L53
            java.util.concurrent.CancellationException r0 = r1.LJJJLL()
            throw r0
        L53:
            java.lang.Object r0 = r5.l1
            X.05Lk r0 = (X.InterfaceC1337805Lk) r0
            r4.LL = r5
            r4.LLILLJJLI = r6
            r4.LLILZIL = r2
            java.lang.Object r0 = r0.LIZ(r4)
            if (r0 != r3) goto L64
            return r3
        L64:
            r0 = r5
            goto L26
        L66:
            X.094Z r4 = new X.094Z
            r4.<init>(r5, r7)
            goto L12
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS72S0400000_3.LIZ$0(X.01Wa, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, com.bytedance.ies.nle.editor_jni.NLEModel] */
    public static final Object emit$0(AgS72S0400000_3 agS72S0400000_3, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C096H c096h = (C096H) obj;
        if (!C2296808zG.LJI((InterfaceC497601wk) agS72S0400000_3.l0)) {
            return Unit.LIZ;
        }
        if (c096h instanceof C23144095a) {
            ((C259800zU) agS72S0400000_3.l1).element = ((C23144095a) c096h).LIZ;
            ((C05XL) agS72S0400000_3.l2).LJIIZILJ(true);
        }
        ((C095E) agS72S0400000_3.l3).LJIIIIZZ(c096h);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object emit$1(AgS72S0400000_3 agS72S0400000_3, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS72S0400000_3.LIZ$0((InterfaceC346201Wa) obj, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.0956] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.AgS72S0400000_3 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C23124094g
            if (r0 == 0) goto L6b
            r3 = r10
            X.094g r3 = (X.C23124094g) r3
            int r2 = r3.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r3.LLILZLL = r2
        L12:
            java.lang.Object r1 = r3.LLILZ
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZLL
            r7 = 1
            if (r0 == 0) goto L47
            if (r0 != r7) goto L71
            java.lang.Object r9 = r3.LLILLJJLI
            Y.AgS72S0400000_3 r8 = r3.LL
            X.C155000ia.LIZIZ(r1)
        L26:
            java.lang.Object r6 = r8.l0
            X.00zU r6 = (X.C259800zU) r6
            java.lang.Object r5 = r8.l1
            X.01wk r5 = (X.InterfaceC497601wk) r5
            X.099V r4 = X.C099V.UNDISPATCHED
            X.094d r3 = new X.094d
            java.lang.Object r2 = r8.l2
            X.094f r2 = (X.C23123094f) r2
            java.lang.Object r1 = r8.l3
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            r0 = 0
            r3.<init>(r2, r1, r9, r0)
            X.0956 r0 = X.C23250099c.LIZLLL(r5, r0, r4, r3, r7)
            r6.element = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L47:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r0 = r8.l0
            X.00zU r0 = (X.C259800zU) r0
            T r1 = r0.element
            X.09AE r1 = (X.C09AE) r1
            if (r1 == 0) goto L26
            X.090y r0 = new X.090y
            r0.<init>()
            r1.LIZIZ(r0)
            r3.LL = r8
            r3.LLILLJJLI = r9
            r3.LLILLL = r1
            r3.LLILZLL = r7
            java.lang.Object r0 = r1.LJJZ(r3)
            if (r0 != r2) goto L26
            return r2
        L6b:
            X.094g r3 = new X.094g
            r3.<init>(r8, r10)
            goto L12
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS72S0400000_3.emit$2(Y.AgS72S0400000_3, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS72S0400000_3(Object obj, C259800zU<C09AE> c259800zU, InterfaceC497601wk interfaceC497601wk, C23123094f<T, R> c23123094f, InterfaceC346701Wf<? super R> interfaceC346701Wf) {
        this.$t = interfaceC346701Wf;
        this.l0 = obj;
        this.l1 = c259800zU;
        this.l2 = interfaceC497601wk;
        this.l3 = c23123094f;
    }
}
