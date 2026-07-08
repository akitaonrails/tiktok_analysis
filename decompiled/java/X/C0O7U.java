package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O7U, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.mota.queue.PQSupervisor$PendingQueue$1", f = "PQSupervisor.kt", l = {94, 96}, m = "invokeSuspend")
public final class C0O7U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0O7T LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O7U(C0O7T c0o7t, InterfaceC1364105Vn<? super C0O7U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0o7t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O7U(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006d -> B:9:0x001e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "PQSupervisor$PendingQueue@9082.1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LL
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L5e
            if (r0 == r3) goto L1b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            X.C155000ia.LIZIZ(r8)
        L1e:
            X.0O7T r5 = r7.LLILLJJLI
            r7.LL = r2
            r5.getClass()
            X.1DEt r1 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r7)
            r1.<init>(r2, r0)
            r1.LJIJJ()
            java.util.concurrent.LinkedBlockingQueue<X.0O7X> r0 = r5.LIZJ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L73
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C189200o6.m2constructorimpl(r0)
            r1.resumeWith(r0)
        L43:
            java.lang.Object r1 = r1.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L50
            X.C099Q.LIZJ(r7)
        L50:
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L58
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L58:
            if (r1 != r4) goto L61
            X.C1C7U.LIZIZ(r6)
            return r4
        L5e:
            X.C155000ia.LIZIZ(r8)
        L61:
            X.0O7T r0 = r7.LLILLJJLI
            r0.LIZIZ = r2
            X.0O7T r0 = r7.LLILLJJLI
            r7.LL = r3
            java.lang.Object r0 = r0.LIZIZ(r7)
            if (r0 != r4) goto L1e
            X.C1C7U.LIZIZ(r6)
            return r4
        L73:
            r5.LIZLLL = r1
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O7U.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
