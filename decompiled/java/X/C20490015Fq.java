package X;

import Y.AObjectS319S0200000_31;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.15Fq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20490015Fq<V extends View> {
    public final DataChannel LIZ;
    public final V LIZIZ;
    public final Map<Class<? extends NextLiveData>, C15G2> LIZJ;

    public C20490015Fq() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20490015Fq(DataChannel dataChannel, View view, C20489915Fp c20489915Fp) {
        this.LIZJ = new HashMap();
        this.LIZ = dataChannel;
        this.LIZIZ = view;
        C15G3<V> c15g3 = c20489915Fp.LJFF;
        if (c15g3 != null) {
            c15g3.LIZ(view);
        }
        do {
            C20490215Fs c20490215Fs = c20489915Fp.LJI;
            if (c20490215Fs != null) {
                ((HashMap) this.LIZJ).put(c20490215Fs.LIZ, c20490215Fs.LIZIZ);
                this.LIZ.CQ2(c20490215Fs.LIZ, this, new AObjectS319S0200000_31(this, c20490215Fs, 0));
            }
            c20489915Fp = c20489915Fp.LIZ;
        } while (c20489915Fp != null);
    }
}
