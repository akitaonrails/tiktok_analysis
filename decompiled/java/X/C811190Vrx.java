package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0Vrx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C811190Vrx {
    public final C811330VsB LIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0VsB] */
    public C811190Vrx(C811300Vs8 c811300Vs8) {
        final C811310Vs9 c811310Vs9 = c811300Vs8.LIZ;
        c811310Vs9.getClass();
        this.LIZ = new C811360VsE(c811310Vs9) { // from class: X.0VsB
            public final C811340VsC LIZIZ;

            @Override // X.C811360VsE
            public final Bundle LIZ() {
                Bundle bundleLIZ = super.LIZ();
                C786410Ut5.LJJIIZI(bundleLIZ, this.LIZIZ.LIZ(), "A");
                return bundleLIZ;
            }

            {
                super(8);
                this.LIZIZ = new C811340VsC(c811310Vs9.LIZ);
            }
        };
    }
}
