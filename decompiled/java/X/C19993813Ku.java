package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.13Ku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", f = "ScatterSetWrapper.kt", l = {31}, m = "invokeSuspend")
public final class C19993813Ku<T> extends C09AW implements Function2<AbstractC1421005hI<? super T>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LLILLJJLI;
    public long[] LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public long LLIZLLLIL;
    public int LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ C19993713Kt<T> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19993813Ku(C19993713Kt<T> c19993713Kt, InterfaceC1364105Vn<? super C19993813Ku> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJIJIL = c19993713Kt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19993813Ku c19993813Ku = new C19993813Ku(this.LLJIJIL, interfaceC1364105Vn);
        c19993813Ku.LLJI = obj;
        return c19993813Ku;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.05hI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0050 -> B:6:0x0026). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:20:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0078 -> B:7:0x0029). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0033 -> B:6:0x0026). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            java.lang.Object r11 = X.C099R.LJFF()
            r12 = r18
            int r0 = r12.LLJ
            r10 = 8
            r9 = 1
            if (r0 == 0) goto L53
            if (r0 != r9) goto L88
            int r13 = r12.LLIZ
            int r0 = r12.LLILZLL
            long r2 = r12.LLIZLLLIL
            int r8 = r12.LLILZIL
            int r4 = r12.LLILZ
            long[] r7 = r12.LLILLL
            java.lang.Object r6 = r12.LLILLJJLI
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.lang.Object r5 = r12.LLJI
            X.05hI r5 = (X.AbstractC1421005hI) r5
            X.C155000ia.LIZIZ(r19)
        L26:
            long r2 = r2 >> r10
            int r13 = r13 + 1
        L29:
            if (r13 >= r0) goto L81
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r2
            r14 = 128(0x80, double:6.3E-322)
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 >= 0) goto L26
            int r1 = r8 << 3
            int r1 = r1 + r13
            r1 = r6[r1]
            r12.LLJI = r5
            r12.LLILLJJLI = r6
            r12.LLILLL = r7
            r12.LLILZ = r4
            r12.LLILZIL = r8
            r12.LLIZLLLIL = r2
            r12.LLILZLL = r0
            r12.LLIZ = r13
            r12.LLJ = r9
            java.lang.Object r1 = r5.LIZ(r1, r12)
            if (r1 != r11) goto L26
            return r11
        L53:
            X.C155000ia.LIZIZ(r19)
            java.lang.Object r5 = r12.LLJI
            X.05hI r5 = (X.AbstractC1421005hI) r5
            X.13Kt<T> r0 = r12.LLJIJIL
            X.13Ks<T> r0 = r0.LL
            java.lang.Object[] r6 = r0.LIZIZ
            long[] r7 = r0.LIZ
            int r0 = r7.length
            int r4 = r0 + (-2)
            if (r4 < 0) goto L90
            r8 = 0
        L68:
            r2 = r7[r8]
            long r0 = ~r2
            r13 = 7
            long r0 = r0 << r13
            long r0 = r0 & r2
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r14
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 == 0) goto L83
            int r0 = r8 - r4
            int r0 = ~r0
            int r0 = r0 >>> 31
            int r0 = 8 - r0
            r13 = 0
            goto L29
        L81:
            if (r0 != r10) goto L90
        L83:
            if (r8 == r4) goto L90
            int r8 = r8 + 1
            goto L68
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L90:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19993813Ku.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
