package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01T0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService$getSavedCredentialsForLogin$1$credManJob$1$timeoutJob$1", f = "CredentialManagerService.kt", l = {718}, m = "invokeSuspend")
public final class C01T0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01T0(String str, InterfaceC1364105Vn<? super C01T0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01T0(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:6:0x0019). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r13 = "CredentialManagerService@16d5.getSavedCredentialsForLogin$1$credManJob$1$timeoutJob$1"
            X.C1C7U.LIZ(r13)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r14.LLILLJJLI
            r3 = 5000(0x1388, double:2.4703E-320)
            r11 = 1
            r7 = 1
            if (r0 == 0) goto L40
            if (r0 != r7) goto L53
            long r5 = r14.LL
            X.C155000ia.LIZIZ(r15)
        L19:
            long r0 = r5 * r3
            java.lang.String r10 = r14.LLILLL
            X.09Gk r9 = new X.09Gk
            r9.<init>()
            java.lang.String r2 = "duration"
            r9.LIZLLL(r0, r2)
            java.lang.String r0 = "platform"
            r9.LJIIIIZZ(r0, r10)
            java.util.Map<java.lang.String, java.lang.String> r1 = r9.LIZ
            java.lang.String r0 = "passkey_get_credential_timeout"
            X.C20684815ws.LJIILLIIL(r0, r1)
            long r5 = r5 + r11
            r1 = 13
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L45
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r13)
            return r0
        L40:
            X.C155000ia.LIZIZ(r15)
            r5 = 1
        L45:
            r14.LL = r5
            r14.LLILLJJLI = r7
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r3, r14)
            if (r0 != r8) goto L19
            X.C1C7U.LIZIZ(r13)
            return r8
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01T0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
