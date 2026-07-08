package X;

import com.ss.android.ugc.aweme.analytics.IMediaUploadPerformanceMonitor;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nSX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435510nSX {
    public final String LIZ;
    public final EnumC1435490nSV LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(35));
    public long LIZLLL = System.currentTimeMillis();

    public final void LIZ() {
        int i = C1435500nSW.LIZ[this.LIZIZ.ordinal()];
        if (i == 1) {
            ((IMediaUploadPerformanceMonitor) this.LIZJ.getValue()).LIZ(this.LIZ).LJIIZILJ(System.currentTimeMillis() - this.LIZLLL);
            return;
        }
        if (i == 2) {
            ((IMediaUploadPerformanceMonitor) this.LIZJ.getValue()).LIZ(this.LIZ).LJIILL(System.currentTimeMillis() - this.LIZLLL);
        } else if (i == 3) {
            ((IMediaUploadPerformanceMonitor) this.LIZJ.getValue()).LIZ(this.LIZ).LJIJ(System.currentTimeMillis() - this.LIZLLL);
        } else if (i == 4) {
            ((IMediaUploadPerformanceMonitor) this.LIZJ.getValue()).LIZ(this.LIZ).LJFF(System.currentTimeMillis() - this.LIZLLL);
        }
    }

    public final void LIZIZ() {
        this.LIZLLL = System.currentTimeMillis();
    }

    public C1435510nSX(String str, EnumC1435490nSV enumC1435490nSV) {
        this.LIZ = str;
        this.LIZIZ = enumC1435490nSV;
    }
}
