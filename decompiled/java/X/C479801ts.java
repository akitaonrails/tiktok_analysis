package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.redpoint.UserProfileBlockVM$blockUser$1$2", f = "UserProfileBlockVM.kt", l = {}, m = "invokeSuspend")
public final class C479801ts extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Exception LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C479801ts(Exception exc, Context context, InterfaceC1364105Vn<? super C479801ts> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = exc;
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C479801ts(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r3 = "UserProfileBlockVM@fd10.blockUser$1$2"
            X.C1C7U.LIZ(r3)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r5)
            java.lang.Exception r1 = r4.LL
            boolean r0 = r1 instanceof X.C0XIR
            if (r0 == 0) goto L42
            X.093u r1 = (X.C23112093u) r1
            int r1 = r1.getErrorCode()
            r0 = 3002038(0x2dceb6, float:4.206751E-39)
            if (r1 != r0) goto L22
            kotlin.Unit r0 = kotlin.Unit.LIZ
        L1e:
            X.C1C7U.LIZIZ(r3)
            return r0
        L22:
            android.content.Context r0 = r4.LLILLJJLI
            if (r0 == 0) goto L5d
            android.app.Activity r2 = X.C1388190mED.LIZ(r0)
            if (r2 == 0) goto L5d
            java.lang.Exception r0 = r4.LL
            X.0mGx r1 = new X.0mGx
            r1.<init>(r2)
            X.0XIR r0 = (X.C0XIR) r0
            java.lang.String r0 = r0.getMessage()
            r1.LJIIJ(r0)
            r1.LJIIJJI()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            goto L1e
        L42:
            android.content.Context r0 = r4.LLILLJJLI
            if (r0 == 0) goto L5d
            android.app.Activity r0 = X.C1388190mED.LIZ(r0)
            if (r0 == 0) goto L5d
            X.0mGx r1 = new X.0mGx
            r1.<init>(r0)
            r0 = 2131822154(0x7f11064a, float:1.9277071E38)
            r1.LJIIIZ(r0)
            r1.LJIIJJI()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            goto L1e
        L5d:
            r0 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C479801ts.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
