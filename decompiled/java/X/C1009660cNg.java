package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0cNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009660cNg extends AbstractC2361009My {
    public final /* synthetic */ C1009460cNM LL;

    public C1009660cNg(C1009460cNM c1009460cNM) {
        this.LL = c1009460cNM;
    }

    @Override // X.AbstractC2361009My
    public final boolean onShot(String str) {
        super.onShot(str);
        C1009680cNi c1009680cNi = this.LL.LJIILJJIL;
        if (c1009680cNi != null && c1009680cNi.LIZ.isAd()) {
            try {
                c1009680cNi.logAd(C1009690cNj.LIZ, c1009680cNi.LIZ.getAwemeRawAd());
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }
}
