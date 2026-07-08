package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01d2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.buffer.MessageSearchContentUpdateBufferKt$chunkedWithDebounce$1$1", f = "MessageSearchContentUpdateBuffer.kt", l = {138, 113}, m = "invokeSuspend")
public final class C375401d2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AnonymousClass0954 LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILZ;
    public final /* synthetic */ List<Object> LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ InterfaceC346701Wf<List<Object>> LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C375401d2(InterfaceC346201Wa<Object> interfaceC346201Wa, List<Object> list, int i, InterfaceC346701Wf<? super List<Object>> interfaceC346701Wf, long j, InterfaceC1364105Vn<? super C375401d2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = interfaceC346201Wa;
        this.LLILZIL = list;
        this.LLILZLL = i;
        this.LLIZ = interfaceC346701Wf;
        this.LLIZLLLIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C375401d2 c375401d2 = new C375401d2(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c375401d2.LLILLL = obj;
        return c375401d2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0071 -> B:8:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007b -> B:8:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0090 -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r11 = "MessageSearchContentUpdateBufferKt@6a78.chunkedWithDebounce$1$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r12.LLILLJJLI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L96
            if (r0 == r4) goto L57
            if (r0 != r5) goto Lab
            X.0954 r7 = r12.LL
            java.lang.Object r3 = r12.LLILLL
            X.01wk r3 = (X.InterfaceC497601wk) r3
            X.C155000ia.LIZIZ(r13)
        L1c:
            java.util.List<java.lang.Object> r0 = r12.LLILZIL
            r0.clear()
        L21:
            boolean r0 = X.C2296808zG.LJI(r3)
            if (r0 == 0) goto La5
            long r0 = r12.LLIZLLLIL
            X.1DE8 r10 = new X.1DE8
            kotlin.coroutines.CoroutineContext r2 = r12.getContext()
            r10.<init>(r2)
            X.1ArU r9 = r7.LJIILJJIL()
            X.01d0 r2 = new X.01d0
            r8 = 0
            r2.<init>(r8)
            r10.LIZJ(r9, r2)
            X.01d1 r2 = new X.01d1
            r2.<init>(r8)
            X.C1DEB.LIZ(r10, r0, r2)
            r12.LLILLL = r3
            r12.LL = r7
            r12.LLILLJJLI = r4
            java.lang.Object r13 = r10.LJII(r12)
            if (r13 != r6) goto L60
            X.C1C7U.LIZIZ(r11)
            return r6
        L57:
            X.0954 r7 = r12.LL
            java.lang.Object r3 = r12.LLILLL
            X.01wk r3 = (X.InterfaceC497601wk) r3
            X.C155000ia.LIZIZ(r13)
        L60:
            if (r13 == 0) goto L67
            java.util.List<java.lang.Object> r0 = r12.LLILZIL
            r0.add(r13)
        L67:
            java.util.List<java.lang.Object> r0 = r12.LLILZIL
            int r1 = r0.size()
            int r0 = r12.LLILZLL
            if (r1 >= r0) goto L7d
            if (r13 != 0) goto L21
            java.util.List<java.lang.Object> r0 = r12.LLILZIL
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L21
        L7d:
            X.01Wf<java.util.List<java.lang.Object>> r2 = r12.LLIZ
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<java.lang.Object> r0 = r12.LLILZIL
            r1.<init>(r0)
            r12.LLILLL = r3
            r12.LL = r7
            r12.LLILLJJLI = r5
            java.lang.Object r0 = r2.emit(r1, r12)
            if (r0 != r6) goto L1c
            X.C1C7U.LIZIZ(r11)
            return r6
        L96:
            X.C155000ia.LIZIZ(r13)
            java.lang.Object r3 = r12.LLILLL
            X.01wk r3 = (X.InterfaceC497601wk) r3
            X.01Wa<java.lang.Object> r0 = r12.LLILZ
            X.0954 r7 = X.C09IC.LJJIII(r3, r0)
            goto L21
        La5:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C375401d2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
