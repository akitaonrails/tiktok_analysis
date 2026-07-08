package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05LP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.recallmessage.ReEditViewModel$reportWithGroupOwner$1", f = "ReEditViewModel.kt", l = {189}, m = "invokeSuspend")
public final class C05LP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<Map<String, String>, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05LP(String str, Function1<? super Map<String, String>, Unit> function1, InterfaceC1364105Vn<? super C05LP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LP(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r6 = "ReEditViewModel@fcd5.reportWithGroupOwner$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 1
            if (r0 == 0) goto L36
            if (r0 != r4) goto L5c
            X.C155000ia.LIZIZ(r8)
        L13:
            java.lang.String r8 = (java.lang.String) r8
        L15:
            int r0 = r8.length()
            if (r0 <= 0) goto L31
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "group_owner_account_type"
            r1.<init>(r0, r8)
            java.util.Map r1 = X.C2097908Jt.LIZJ(r1)
        L26:
            kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.String>, kotlin.Unit> r0 = r7.LLILLL
            r0.invoke(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L31:
            java.util.Map r1 = X.C2097608Jq.LJ()
            goto L26
        L36:
            X.C155000ia.LIZIZ(r8)
            java.lang.String r0 = r7.LLILLJJLI
            if (r0 == 0) goto L59
            int r0 = r0.length()
            if (r0 == 0) goto L59
            X.1DFB r3 = X.C0PEM.LIZJ
            X.05LO r2 = new X.05LO
            java.lang.String r1 = r7.LLILLJJLI
            r0 = 0
            r2.<init>(r1, r0)
            r7.LL = r4
            java.lang.Object r8 = X.C23250099c.LJI(r7, r3, r2)
            if (r8 != r5) goto L13
            X.C1C7U.LIZIZ(r6)
            return r5
        L59:
            java.lang.String r8 = ""
            goto L15
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05LP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
