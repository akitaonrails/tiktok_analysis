package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.ui.actions.PinActionNew$doAction$1", f = "ActionSheetItemsNew.kt", l = {297}, m = "invokeSuspend")
public final class C877740Yc0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C877750Yc1 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C877740Yc0(C877750Yc1 c877750Yc1, InterfaceC1364105Vn<? super C877740Yc0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c877750Yc1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C877740Yc0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r6 = "PinActionNew@57db.doAction$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LL
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L22
            if (r0 != r3) goto L60
            X.C155000ia.LIZIZ(r8)
        L14:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            if (r0 == 0) goto L3e
        L1c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L22:
            X.C155000ia.LIZIZ(r8)
            X.0Yc1 r2 = r7.LLILLJJLI
            boolean r0 = r2.LLJ
            if (r0 != 0) goto L3e
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0Ybz r0 = new X.0Ybz
            r0.<init>(r2, r5)
            r7.LL = r3
            java.lang.Object r8 = X.C23250099c.LJI(r7, r1, r0)
            if (r8 != r4) goto L14
            X.C1C7U.LIZIZ(r6)
            return r4
        L3e:
            X.0Yc1 r4 = r7.LLILLJJLI
            X.0Xz1 r3 = r4.LLILZLL
            boolean r0 = r4.LLJ
            r2 = r0 ^ 1
            X.0Ztd r1 = new X.0Ztd
            r0 = 6
            r1.<init>(r4, r0)
            r3.LJIILJJIL(r2, r1)
            boolean r0 = r4.LLJ
            r1 = 6
            if (r0 == 0) goto L5a
            java.lang.String r0 = "unpin"
            X.AbstractC880120Yfq.LJFF(r4, r0, r5, r5, r1)
            goto L1c
        L5a:
            java.lang.String r0 = "pin"
            X.AbstractC880120Yfq.LJFF(r4, r0, r5, r5, r1)
            goto L1c
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C877740Yc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
