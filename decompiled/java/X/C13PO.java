package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS644S0100000_30;

/* JADX INFO: renamed from: X.13PO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13PO extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final ProviderEffect LIZIZ;
    public final String LIZJ;

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        C1662010tLr c1662010tLrLIZ;
        int i = this.LIZ.LJIILL;
        C13LD c13ld = C13LD.LIZ;
        ProviderEffect providerEffect = this.LIZIZ;
        c13ld.getClass();
        String strLJFF = C13LD.LJFF(providerEffect);
        if (strLJFF == null) {
            return;
        }
        String str = null;
        for (int i2 = 0; i2 < i && !this.isCanceled; i2++) {
            try {
                if (C504670Jqj.LIZIZ(this.LIZIZ.getPath())) {
                    C13LD c13ld2 = C13LD.LIZ;
                    String str2 = this.LIZ.LJII;
                    ProviderEffect providerEffect2 = this.LIZIZ;
                    c13ld2.getClass();
                    C13LD.LJIIIIZZ(providerEffect2, str2);
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                c1662010tLrLIZ = LIZ(strLJFF, this.LIZIZ.getPath());
            } catch (Exception e2) {
                e = e2;
                str = strLJFF;
                TryCatchGuardChecker.doCheck(e);
                if (i2 == i - 1) {
                    C1662010tLr c1662010tLr = new C1662010tLr(e);
                    c1662010tLr.LIZ(str, "", str != null ? "" : null);
                    runOnMainThread(new AwS431S0200000_30(this, c1662010tLr, 108));
                    return;
                }
            }
            if (c1662010tLrLIZ == null) {
                runOnMainThread(new AwS431S0200000_30(this, this.LIZIZ, 57));
                return;
            } else {
                if (i2 == i - 1) {
                    runOnMainThread(new AwS431S0200000_30(this, c1662010tLrLIZ, 108));
                    return;
                }
                str = strLJFF;
            }
        }
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        runOnMainThread(new AwS574S0100000_30(this, 431));
    }

    public final C1662010tLr LIZ(String str, String str2) {
        C13N8 c13n8FetchFromNetwork;
        if (str2 == null) {
            return new C1662010tLr(10014);
        }
        C0XSU c0xsu = new C0XSU(str, null, C0XSV.GET, null, null, false, null, null, 1018);
        C13SQ c13sq = this.LIZ.LJIJJ;
        if (c13sq != null && (c13n8FetchFromNetwork = c13sq.fetchFromNetwork(c0xsu)) != null && c13n8FetchFromNetwork.LIZ == 200) {
            C20012413Ry.LIZIZ(new C20008713Qn(c13n8FetchFromNetwork.LIZIZ), C13SB.LJIILJJIL(str2, false), c13n8FetchFromNetwork.LIZJ, new AwS644S0100000_30(this, 51));
            return null;
        }
        return new C1662010tLr(400);
    }

    public C13PO(C13RD c13rd, ProviderEffect providerEffect, String str) {
        super(str, null);
        this.LIZ = c13rd;
        this.LIZIZ = providerEffect;
        this.LIZJ = str;
    }
}
