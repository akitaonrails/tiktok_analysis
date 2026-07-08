package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.radar.SimRadar;

/* JADX INFO: renamed from: X.0ohc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483300ohc extends AbstractC1483700oiG {
    public InterfaceC1479620obg LIZLLL;
    public InterfaceC1483670oiD LJ;
    public final C1483290ohb LJFF = new C0S3K() { // from class: X.0ohb
        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
            InterfaceC1479620obg interfaceC1479620obg;
            C1479530obX c1479530obXLJ;
            C1483300ohc c1483300ohc = this.LL;
            c1483300ohc.getClass();
            if (TextUtils.isEmpty(str) || (interfaceC1479620obg = c1483300ohc.LIZLLL) == null || !TextUtils.equals(interfaceC1479620obg.getKey(), str) || 1 != c1481290oeN.LIZJ || (c1479530obXLJ = C1479540obY.LJ(C1479540obY.LIZ(this.LL.LIZLLL, null))) == null) {
                return;
            }
            SimRadar.keyScan("ByteVC1RetryPlayHook", "onPlayFailed-retry-with-264", new Object[0]);
            this.LL.LJ.LJJJJJL(c1479530obXLJ);
        }
    };

    @Override // X.AbstractC1483700oiG
    public final boolean LJIIL() {
        return C582130MsN.LIZ().getConfig().getPlayerGlobalConfig().isEnableByteVC1AutoRetry();
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void release() {
        super.release();
        this.LIZLLL = null;
        this.LJ = null;
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final InterfaceC1482530ogN LIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        this.LIZLLL = interfaceC1479620obg;
    }

    @Override // X.AbstractC1483700oiG
    public final void LJFF(InterfaceC1483670oiD interfaceC1483670oiD) {
        this.LJ = interfaceC1483670oiD;
    }
}
