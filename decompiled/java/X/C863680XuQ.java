package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XuQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$checkAndRepairConversations$1", f = "DefaultIMUseCaseCenter.kt", l = {592}, m = "invokeSuspend")
public final class C863680XuQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int[] LL;
    public int[] LLILLJJLI;
    public C863650XuN LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C863650XuN LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863680XuQ(C863650XuN c863650XuN, InterfaceC1364105Vn<? super C863680XuQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c863650XuN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863680XuQ(this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005f -> B:6:0x001d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0027 -> B:6:0x001d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r11 = "DefaultIMUseCaseCenter@568c.checkAndRepairConversations$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r12.LLILZLL
            r6 = 1
            if (r0 == 0) goto L67
            if (r0 != r6) goto L83
            int r0 = r12.LLILZIL
            int r9 = r12.LLILZ
            X.0XuN r2 = r12.LLILLL
            int[] r1 = r12.LLILLJJLI
            int[] r3 = r12.LL
            X.C155000ia.LIZIZ(r13)
        L1d:
            int r9 = r9 + 1
        L1f:
            if (r9 >= r0) goto L7d
            r10 = r1[r9]
            int r4 = X.C13LQ.LJJIJ(r10, r3)
            if (r4 < 0) goto L1d
            X.0XuL r4 = r2.LLILZIL
            X.0XuU r8 = r4.LJI()
            X.0YEM r4 = r2.LL
            X.0XwD r4 = r4.LJIIZILJ()
            X.0Y52 r4 = r4.getDomain()
            X.0Y3w r4 = r4.LIZIZ
            java.util.Map<java.lang.Integer, java.lang.Boolean> r5 = r4.LJIIIZ
            java.lang.Integer r4 = X.C2286608xc.LJ(r10)
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.lang.Object r4 = r5.get(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L65
            boolean r4 = r4.booleanValue()
        L4f:
            r12.LL = r3
            r12.LLILLJJLI = r1
            r12.LLILLL = r2
            r12.LLILZ = r9
            r12.LLILZIL = r0
            r12.LLILZLL = r6
            java.lang.Object r4 = r8.LIZ(r10, r4, r12)
            if (r4 != r7) goto L1d
            X.C1C7U.LIZIZ(r11)
            return r7
        L65:
            r4 = 0
            goto L4f
        L67:
            X.C155000ia.LIZIZ(r13)
            X.0XuN r0 = r12.LLIZ
            X.0YEM r0 = r0.LL
            X.0YEf r0 = r0.LJIIIZ()
            int[] r3 = X.C870740YDw.LJ(r0)
            X.0XuN r2 = r12.LLIZ
            int[] r1 = r2.LLIZLLLIL
            int r0 = r1.length
            r9 = 0
            goto L1f
        L7d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C863680XuQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
