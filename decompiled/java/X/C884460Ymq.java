package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ymq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.core.chatlist.impl.plugin.VOSnapshotPlugin$initScheduleSaveTask$job$1", f = "VOSnapshotPlugin.kt", l = {80}, m = "invokeSuspend")
public final class C884460Ymq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C884470Ymr LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884460Ymq(C884470Ymr c884470Ymr, InterfaceC1364105Vn<? super C884460Ymq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c884470Ymr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884460Ymq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Path cross not found for [B:15:0x0050, B:8:0x001c], limit reached: 19 */
    /* JADX WARN: Path cross not found for [B:8:0x001c, B:15:0x0050], limit reached: 19 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004a -> B:6:0x0013). Please report as a decompilation issue!!! */
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
            java.lang.String r6 = "VOSnapshotPlugin@bc0c.initScheduleSaveTask$job$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 1
            if (r0 == 0) goto L56
            if (r0 != r4) goto L5a
            X.C155000ia.LIZIZ(r8)
        L13:
            X.C309160C9y.LIZ()
            boolean r0 = X.C880900Yh6.LIZJ()
            if (r0 == 0) goto L50
            boolean r0 = X.C880900Yh6.LIZ()
            if (r0 != 0) goto L50
            X.0Ymp r3 = new X.0Ymp
            X.0Ymr r0 = r7.LLILLJJLI
            r2 = 0
            r3.<init>(r0, r2)
            X.01GW r0 = X.C1729806q0.LIZLLL
            java.lang.Object r1 = r0.getValue()
            X.01wk r1 = (X.InterfaceC497601wk) r1
            r0 = 3
            X.C23250099c.LIZLLL(r1, r2, r2, r3, r0)
        L36:
            com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine r0 = X.C884500Ymu.LIZ()
            X.0NJD<X.0Yng> r0 = r0.LJIIL
            java.lang.Object r0 = r0.LIZ()
            X.0Yng r0 = (X.C884980Yng) r0
            long r0 = r0.LIZIZ
            r7.LL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r5) goto L13
            X.C1C7U.LIZIZ(r6)
            return r5
        L50:
            X.0Ymr r0 = r7.LLILLJJLI
            r0.LJIIIZ()
            goto L36
        L56:
            X.C155000ia.LIZIZ(r8)
            goto L36
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C884460Ymq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
