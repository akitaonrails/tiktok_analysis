package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: X.13KW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.collection.Entries$iterator$1", f = "ScatterMap.kt", l = {1414}, m = "invokeSuspend")
public final class C13KW<K, V> extends C09AW implements Function2<AbstractC1421005hI<? super Map.Entry<? extends K, ? extends V>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C13KV LLILLJJLI;
    public long[] LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public long LLIZLLLIL;
    public int LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ C13KV<K, V> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13KW(C13KV<K, V> c13kv, InterfaceC1364105Vn<? super C13KW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJIJIL = c13kv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C13KW c13kw = new C13KW(this.LLJIJIL, interfaceC1364105Vn);
        c13kw.LLJI = obj;
        return c13kw;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005b -> B:6:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007f -> B:21:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0081 -> B:7:0x0027). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0030 -> B:6:0x0022). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            java.lang.Object r9 = X.C099R.LJFF()
            r10 = r17
            int r1 = r10.LLJ
            r0 = 1
            if (r1 == 0) goto L5e
            if (r1 != r0) goto L93
            int r12 = r10.LLIZ
            int r1 = r10.LLILZLL
            long r2 = r10.LLIZLLLIL
            int r8 = r10.LLILZIL
            int r4 = r10.LLILZ
            long[] r7 = r10.LLILLL
            X.13KV r6 = r10.LLILLJJLI
            java.lang.Object r5 = r10.LLJI
            X.05hI r5 = (X.AbstractC1421005hI) r5
            X.C155000ia.LIZIZ(r18)
        L22:
            r0 = 8
            long r2 = r2 >> r0
            int r12 = r12 + 1
        L27:
            if (r12 >= r1) goto L8a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r2
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L22
            int r15 = r8 << 3
            int r15 = r15 + r12
            X.11U3 r13 = new X.11U3
            X.13KZ<K, V> r14 = r6.LL
            java.lang.Object[] r0 = r14.LIZIZ
            r11 = r0[r15]
            java.lang.Object[] r0 = r14.LIZJ
            r0 = r0[r15]
            r13.<init>(r11, r0)
            r10.LLJI = r5
            r10.LLILLJJLI = r6
            r10.LLILLL = r7
            r10.LLILZ = r4
            r10.LLILZIL = r8
            r10.LLIZLLLIL = r2
            r10.LLILZLL = r1
            r10.LLIZ = r12
            r0 = 1
            r10.LLJ = r0
            java.lang.Object r0 = r5.LIZ(r13, r10)
            if (r0 != r9) goto L22
            return r9
        L5e:
            X.C155000ia.LIZIZ(r18)
            java.lang.Object r5 = r10.LLJI
            X.05hI r5 = (X.AbstractC1421005hI) r5
            X.13KV<K, V> r6 = r10.LLJIJIL
            X.13KZ<K, V> r0 = r6.LL
            long[] r7 = r0.LIZ
            int r0 = r7.length
            int r4 = r0 + (-2)
            if (r4 < 0) goto L9b
            r8 = 0
        L71:
            r2 = r7[r8]
            long r0 = ~r2
            r11 = 7
            long r0 = r0 << r11
            long r0 = r0 & r2
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r12
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 == 0) goto L8e
            int r0 = r8 - r4
            int r0 = ~r0
            int r0 = r0 >>> 31
            int r1 = 8 - r0
            r12 = 0
            goto L27
        L8a:
            r0 = 8
            if (r1 != r0) goto L9b
        L8e:
            if (r8 == r4) goto L9b
            int r8 = r8 + 1
            goto L71
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13KW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
