package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05HY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.handlers.MessageChunkProxy$CoroutineTimer$start$1", f = "MessageChunkProxy.kt", l = {404, 405}, m = "invokeSuspend")
public final class C05HY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C05KQ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05HY(C05KQ c05kq, InterfaceC1364105Vn<? super C05HY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05kq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05HY c05hy = new C05HY(this.LLILLL, interfaceC1364105Vn);
        c05hy.LLILLJJLI = obj;
        return c05hy;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0045 -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "MessageChunkProxy$CoroutineTimer@704b.start$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L4b
            if (r0 == r3) goto L32
            if (r0 != r4) goto L59
            java.lang.Object r2 = r7.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.C155000ia.LIZIZ(r8)
        L1a:
            boolean r0 = X.C2296808zG.LJI(r2)
            if (r0 == 0) goto L53
            X.05KQ r0 = r7.LLILLL
            kotlin.jvm.functions.Function1<X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r0.LIZJ
            r7.LLILLJJLI = r2
            r7.LL = r3
            java.lang.Object r0 = r0.invoke(r7)
            if (r0 != r5) goto L39
            X.C1C7U.LIZIZ(r6)
            return r5
        L32:
            java.lang.Object r2 = r7.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.C155000ia.LIZIZ(r8)
        L39:
            X.05KQ r0 = r7.LLILLL
            long r0 = r0.LIZ
            r7.LLILLJJLI = r2
            r7.LL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r5) goto L1a
            X.C1C7U.LIZIZ(r6)
            return r5
        L4b:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r2 = r7.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            goto L1a
        L53:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05HY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
