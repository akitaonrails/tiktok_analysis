package X;

import android.graphics.Rect;
import org.json.JSONException;

/* JADX INFO: renamed from: X.1AF5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AF5 implements InterfaceC1514950pWf {
    public boolean LIZ = true;
    public final /* synthetic */ C1AF3 LIZIZ;

    public C1AF5(C1AF3 c1af3) {
        this.LIZIZ = c1af3;
    }

    @Override // X.InterfaceC1514950pWf
    public final void LIZ(Rect rect) throws JSONException {
        if (this.LIZ) {
            this.LIZ = false;
            if (this.LIZIZ.LJJIFFI()) {
                C1AF3 c1af3 = this.LIZIZ;
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1af3.LJIIL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                    c1af3.LJJIJIIJI(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                }
                this.LIZIZ.LJJIJ();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChange ");
        sbLIZ.append(this.LIZIZ.LIZIZ);
        sbLIZ.append(' ');
        sbLIZ.append(rect);
        C20441214yg.LIZIZ("LinkMicFeedCoverViewManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.LJIILLIIL = rect;
    }
}
