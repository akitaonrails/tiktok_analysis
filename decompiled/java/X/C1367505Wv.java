package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Wv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService$getNonceBeforeGettingCredentials$1", f = "CredentialManagerService.kt", l = {588, 589}, m = "invokeSuspend")
public final class C1367505Wv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CredentialManagerService LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ C05X2 LLILZ;
    public final /* synthetic */ InterfaceC852200Xbu LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1367505Wv(CredentialManagerService credentialManagerService, Activity activity, C05X2 c05x2, InterfaceC852200Xbu interfaceC852200Xbu, InterfaceC1364105Vn<? super C1367505Wv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = credentialManagerService;
        this.LLILLL = activity;
        this.LLILZ = c05x2;
        this.LLILZIL = interfaceC852200Xbu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1367505Wv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if (X.C23250099c.LJI(r10, r0, r4) == r2) goto L16;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r0 = "CredentialManagerService@16d5.getNonceBeforeGettingCredentials$1"
            X.C1C7U.LIZ(r0)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LL
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L1e
            if (r0 == r1) goto L58
            if (r0 != r3) goto L90
            X.C155000ia.LIZIZ(r11)
        L16:
            kotlin.Unit r1 = kotlin.Unit.LIZ
            java.lang.String r0 = "CredentialManagerService@16d5.getNonceBeforeGettingCredentials$1"
            X.C1C7U.LIZIZ(r0)
            return r1
        L1e:
            X.C155000ia.LIZIZ(r11)
            java.lang.String r0 = com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LIZ
            r10.LL = r1
            X.099m r5 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r10)
            r5.<init>(r0)
            java.lang.Class<com.bytedance.lobby.ILobbyNonceGenerator> r1 = com.bytedance.lobby.ILobbyNonceGenerator.class
            r0 = 0
            java.lang.Object r4 = X.C04TD.LIZ(r1, r0)
            if (r4 == 0) goto L7a
            com.bytedance.lobby.ILobbyNonceGenerator r4 = (com.bytedance.lobby.ILobbyNonceGenerator) r4
        L39:
            kotlin.jvm.internal.AwS581S0100000_2 r1 = new kotlin.jvm.internal.AwS581S0100000_2
            r0 = 518(0x206, float:7.26E-43)
            r1.<init>(r5, r0)
            r4.LIZ(r1)
            java.lang.Object r11 = r5.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r11 != r0) goto L50
            X.C099Q.LIZJ(r10)
        L50:
            if (r11 != r2) goto L5b
        L52:
            java.lang.String r0 = "CredentialManagerService@16d5.getNonceBeforeGettingCredentials$1"
            X.C1C7U.LIZIZ(r0)
            return r2
        L58:
            X.C155000ia.LIZIZ(r11)
        L5b:
            java.lang.String r11 = (java.lang.String) r11
            com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService.LIZ = r11
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.05Ww r4 = new X.05Ww
            com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService r5 = r10.LLILLJJLI
            android.app.Activity r6 = r10.LLILLL
            X.05X2 r7 = r10.LLILZ
            X.0Xbu r8 = r10.LLILZIL
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r10.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r10, r0, r4)
            if (r0 != r2) goto L16
            goto L52
        L7a:
            com.bytedance.awemelobby.LobbyNonceGenerator r0 = X.C04TD.LJIIIIZZ
            if (r0 != 0) goto L8d
            java.lang.Class<com.bytedance.lobby.ILobbyNonceGenerator> r1 = com.bytedance.lobby.ILobbyNonceGenerator.class
            monitor-enter(r1)
            com.bytedance.awemelobby.LobbyNonceGenerator r0 = X.C04TD.LJIIIIZZ     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L8c
            com.bytedance.awemelobby.LobbyNonceGenerator r0 = new com.bytedance.awemelobby.LobbyNonceGenerator     // Catch: java.lang.Throwable -> L98
            r0.<init>()     // Catch: java.lang.Throwable -> L98
            X.C04TD.LJIIIIZZ = r0     // Catch: java.lang.Throwable -> L98
        L8c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L98
        L8d:
            com.bytedance.awemelobby.LobbyNonceGenerator r4 = X.C04TD.LJIIIIZZ
            goto L39
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L98:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L98
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1367505Wv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
