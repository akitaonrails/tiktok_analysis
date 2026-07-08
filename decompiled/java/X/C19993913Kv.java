package X;

import e0.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: renamed from: X.13Kv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1188}, m = "invokeSuspend")
public final class C19993913Kv<E> extends C09AW implements Function2<AbstractC1421005hI<? super E>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C19994013Kw LLILLJJLI;
    public s0 LLILLL;
    public long[] LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public long LLJ;
    public int LLJI;
    public /* synthetic */ Object LLJIJIL;
    public final /* synthetic */ s0<E> LLJILJIL;
    public final /* synthetic */ C19994013Kw LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19993913Kv(s0<E> s0Var, C19994013Kw c19994013Kw, InterfaceC1364105Vn<? super C19993913Kv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJIL = s0Var;
        this.LLJILJILJ = c19994013Kw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19993913Kv c19993913Kv = new C19993913Kv(this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c19993913Kv.LLJIJIL = obj;
        return c19993913Kv;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:7:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005a -> B:6:0x0026). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0080 -> B:21:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0082 -> B:8:0x002b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            java.lang.Object r12 = X.C099R.LJFF()
            r13 = r19
            int r0 = r13.LLJI
            r11 = 8
            r10 = 1
            if (r0 == 0) goto L5d
            if (r0 != r10) goto L92
            int r14 = r13.LLIZLLLIL
            int r0 = r13.LLIZ
            long r2 = r13.LLJ
            int r4 = r13.LLILZLL
            int r5 = r13.LLILZIL
            long[] r6 = r13.LLILZ
            e0.s0 r9 = r13.LLILLL
            X.13Kw r8 = r13.LLILLJJLI
            java.lang.Object r7 = r13.LLJIJIL
            X.05hI r7 = (X.AbstractC1421005hI) r7
            X.C155000ia.LIZIZ(r20)
        L26:
            r11 = 8
        L28:
            long r2 = r2 >> r11
            int r14 = r14 + 1
        L2b:
            if (r14 >= r0) goto L8b
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r2 & r15
            r15 = 128(0x80, double:6.3E-322)
            int r1 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r1 >= 0) goto L28
            int r11 = r4 << 3
            int r11 = r11 + r14
            r8.LL = r11
            X.13Kx<E> r1 = r9.LLILLJJLI
            java.lang.Object[] r1 = r1.LIZIZ
            r1 = r1[r11]
            r13.LLJIJIL = r7
            r13.LLILLJJLI = r8
            r13.LLILLL = r9
            r13.LLILZ = r6
            r13.LLILZIL = r5
            r13.LLILZLL = r4
            r13.LLJ = r2
            r13.LLIZ = r0
            r13.LLIZLLLIL = r14
            r13.LLJI = r10
            java.lang.Object r1 = r7.LIZ(r1, r13)
            if (r1 != r12) goto L26
            return r12
        L5d:
            X.C155000ia.LIZIZ(r20)
            java.lang.Object r7 = r13.LLJIJIL
            X.05hI r7 = (X.AbstractC1421005hI) r7
            e0.s0<E> r9 = r13.LLJILJIL
            X.13Kx<E> r0 = r9.LLILLJJLI
            X.13Kw r8 = r13.LLJILJILJ
            long[] r6 = r0.LIZ
            int r0 = r6.length
            int r5 = r0 + (-2)
            if (r5 < 0) goto L9a
            r4 = 0
        L72:
            r2 = r6[r4]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            long r0 = r0 & r2
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r15
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 == 0) goto L8d
            int r0 = r4 - r5
            int r0 = ~r0
            int r0 = r0 >>> 31
            int r0 = 8 - r0
            r14 = 0
            goto L2b
        L8b:
            if (r0 != r11) goto L9a
        L8d:
            if (r4 == r5) goto L9a
            int r4 = r4 + 1
            goto L72
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19993913Kv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
