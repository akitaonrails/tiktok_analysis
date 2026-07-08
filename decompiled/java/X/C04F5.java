package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetPreloadCartInfoData;
import defpackage.EcPdpPreloadCartInfoSettingModel;
import defpackage.o1;

/* JADX INFO: renamed from: X.04F5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04F5 {
    public final GetPreloadCartInfoData LIZ;
    public final long LIZIZ;

    public final boolean LIZ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LIZIZ;
        Integer num = ((EcPdpPreloadCartInfoSettingModel) o1.LIZIZ.getValue()).cacheExpiredMin;
        return jElapsedRealtime > ((long) ((num != null ? num.intValue() : 10) * 60)) * 1000;
    }

    public C04F5(GetPreloadCartInfoData getPreloadCartInfoData) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LIZ = getPreloadCartInfoData;
        this.LIZIZ = jElapsedRealtime;
    }
}
