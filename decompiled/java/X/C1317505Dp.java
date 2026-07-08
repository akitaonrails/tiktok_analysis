package X;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Dp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactManager$doUpdateClear$4", f = "IMContactManager.kt", l = {162}, m = "invokeSuspend")
public final class C1317505Dp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C259800zU<Map<String, CopyOnWriteArraySet<String>>> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1317505Dp(boolean z, C259800zU<Map<String, CopyOnWriteArraySet<String>>> c259800zU, boolean z2, InterfaceC1364105Vn<? super C1317505Dp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c259800zU;
        this.LLILZIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1317505Dp(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.String r6 = "IMContactManager@fb8a.doUpdateClear$4"
            X.C1C7U.LIZ(r6)
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r15.LLILLJJLI
            r10 = 1
            if (r0 == 0) goto L49
            if (r0 != r10) goto L61
            java.lang.Object r2 = r15.LL
            java.util.Iterator r2 = (java.util.Iterator) r2
            X.C155000ia.LIZIZ(r16)
        L17:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r9 = r0.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            X.1BG1 r7 = X.C1BG1.LIZ
            java.util.List r8 = X.C13LP.LLIIII(r0)
            r14 = 0
            r16 = 112(0x70, float:1.57E-43)
            r15.LL = r2
            r15.LLILLJJLI = r10
            r12 = 0
            r11 = r10
            r13 = r12
            java.lang.Object r0 = X.C1BG1.LJIIJ(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r0 != r1) goto L17
            X.C1C7U.LIZIZ(r6)
            return r1
        L49:
            X.C155000ia.LIZIZ(r16)
            boolean r0 = r15.LLILLL
            if (r0 == 0) goto L69
            X.00zU<java.util.Map<java.lang.String, java.util.concurrent.CopyOnWriteArraySet<java.lang.String>>> r0 = r15.LLILZ
            T r0 = r0.element
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L69
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
            goto L17
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L69:
            boolean r0 = r15.LLILZIL
            if (r0 == 0) goto L8d
            X.1BG1 r0 = X.C1BG1.LIZ
            long r0 = java.lang.System.currentTimeMillis()
            X.C1BG1.LJIILLIIL = r0
            X.1BG1 r0 = X.C1BG1.LIZ
            r0.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = X.C1BG1.LIZJ
            long r4 = r4 - r0
            X.054G r3 = X.C1BG1.LJFF
            X.06pR r2 = new X.06pR
            r1 = 0
            r2.<init>(r4, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
        L8d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1317505Dp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
