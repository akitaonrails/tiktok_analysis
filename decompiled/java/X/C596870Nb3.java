package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sync.IByteSyncApi;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0Nb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596870Nb3 implements InterfaceC596800Naw, InterfaceC596980NbE {
    public final EnumC596890Nb5 LL = EnumC596890Nb5.BYTE_SYNC;
    public InterfaceC497601wk LLILLJJLI;
    public InterfaceC1631630sYr<? super AgentCommandRequest, ? super InterfaceC596800Naw, ? super C596790Nav, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> LLILLL;

    @Override // X.InterfaceC596800Naw
    public final EnumC596890Nb5 Kf() {
        return this.LL;
    }

    @Override // X.InterfaceC596980NbE
    public final void LJ(C1525630pnt c1525630pnt) {
        InterfaceC1631630sYr<? super AgentCommandRequest, ? super InterfaceC596800Naw, ? super C596790Nav, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631630sYr;
        byte[] bArr = c1525630pnt.LIZ;
        if (bArr != null) {
            String str = new String(bArr, Charsets.UTF_8);
            InterfaceC497601wk interfaceC497601wk = this.LLILLJJLI;
            if (interfaceC497601wk == null || (interfaceC1631630sYr = this.LLILLL) == null) {
                return;
            }
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C596840Nb0(str, interfaceC1631630sYr, this, null), 3);
        }
    }

    @Override // X.InterfaceC596800Naw
    public final void Lf(C054G c054g, C596780Nau c596780Nau) {
        this.LLILLJJLI = c054g;
        this.LLILLL = c596780Nau;
        IByteSyncApi iByteSyncApi = (IByteSyncApi) PluggableExtentionKt.pluggableSpi$default(IByteSyncApi.class, false, false, false, 14, null);
        if (iByteSyncApi != null) {
            iByteSyncApi.LIZ(EnumC1733330vCt.TAKO_AGENT_SYNC_BIZ, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // X.InterfaceC596800Naw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Mf(com.ss.android.ugc.aweme.tako.ccl.net.AgentCommandSyncData r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C596850Nb1
            if (r0 == 0) goto L37
            r4 = r7
            X.0Nb1 r4 = (X.C596850Nb1) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r1) goto L3d
            X.C155000ia.LIZIZ(r3)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = X.C1503800pEg.LIZ
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r0 = X.C1503800pEg.LIZLLL
            if (r0 == 0) goto L22
            r4.LLILLL = r1
            java.lang.Object r0 = r0.sendSyncData(r6, r4)
            if (r0 != r2) goto L22
            return r2
        L37:
            X.0Nb1 r4 = new X.0Nb1
            r4.<init>(r5, r7)
            goto L12
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C596870Nb3.Mf(com.ss.android.ugc.aweme.tako.ccl.net.AgentCommandSyncData, X.05Vn):java.lang.Object");
    }
}
