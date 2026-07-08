package X;

import android.text.TextUtils;
import com.facebook.network.connectionclass.DeviceBandwidthSampler;

/* JADX INFO: renamed from: X.0X2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842430X2z implements C0X30 {
    public boolean LIZ;
    public String LIZIZ;

    public final void LIZ(String str) {
        if (this.LIZ && TextUtils.equals(this.LIZIZ, str)) {
            DeviceBandwidthSampler deviceBandwidthSampler = C842420X2y.LIZ;
            if (deviceBandwidthSampler.LIZIZ.decrementAndGet() == 0) {
                C786410Ut5.LJLILLLLZI(deviceBandwidthSampler.LIZJ, 2);
            }
            this.LIZ = false;
        }
    }
}
