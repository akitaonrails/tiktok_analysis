package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostNetwork;

/* JADX INFO: renamed from: X.0W0R, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W0R {
    public static C784170UpT LIZ;
    public static volatile String LIZIZ = "";

    public static void LIZJ() {
        if (LIZ != null) {
            return;
        }
        LIZ = new InterfaceC784190UpV() { // from class: X.0UpT
            /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
            @Override // X.InterfaceC784190UpV
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.EnumC784160UpS r3) {
                /*
                    r2 = this;
                    if (r3 == 0) goto L1e
                    int[] r1 = X.C784150UpR.LIZ
                    int r0 = r3.ordinal()
                    r1 = r1[r0]
                    r0 = 1
                    if (r1 == r0) goto L1b
                    r0 = 2
                    if (r1 == r0) goto L18
                    r0 = 3
                    if (r1 != r0) goto L1e
                    java.lang.String r0 = "good"
                L15:
                    X.C0W0R.LIZIZ = r0
                    return
                L18:
                    java.lang.String r0 = "bad"
                    goto L15
                L1b:
                    java.lang.String r0 = "stuck"
                    goto L15
                L1e:
                    java.lang.String r0 = "unknown"
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C784170UpT.LIZ(X.0UpS):void");
            }
        };
        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).observerNetworkChange(LIZ);
    }

    public static C0KM7 LIZ(Context context) {
        return new C0KM7(LIZIZ, LIZIZ(context));
    }

    public static String LIZIZ(Context context) {
        EnumC804620VhM enumC804620VhMLJ;
        if (context != null && (enumC804620VhMLJ = C804420Vh2.LJ(context)) != null) {
            switch (C804580VhI.LIZ[enumC804620VhMLJ.ordinal()]) {
            }
            return "unknown";
        }
        return "unknown";
    }
}
