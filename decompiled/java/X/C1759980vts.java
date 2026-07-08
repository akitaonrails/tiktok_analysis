package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: renamed from: X.0vts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759980vts {
    public final C1757400vpi LIZ;
    public final FrameLayout LIZIZ;
    public C1760050vtz LIZJ;

    public C1759980vts(C1757400vpi c1757400vpi) {
        FrameLayout frameLayout;
        this.LIZ = c1757400vpi;
        View view = c1757400vpi.LIZIZ.get();
        if (view != null) {
            frameLayout = (FrameLayout) view.findViewById(R.id.w0f);
        } else {
            frameLayout = null;
        }
        this.LIZIZ = frameLayout;
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceLIZ = c1757400vpi.LIZ();
        if (iSeaPdpCommunicationServiceLIZ != null) {
            C1502500pCa.LIZ(iSeaPdpCommunicationServiceLIZ, this, "pdpSeaSubmitPendant", new AwS640S0100000_26(this, 124));
        }
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceLIZ2 = c1757400vpi.LIZ();
        if (iSeaPdpCommunicationServiceLIZ2 != null) {
            C1502500pCa.LIZ(iSeaPdpCommunicationServiceLIZ2, this, "pdpSeaHidePendant", new AwS640S0100000_26(this, 125));
        }
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceLIZ3 = c1757400vpi.LIZ();
        if (iSeaPdpCommunicationServiceLIZ3 != null) {
            C1502500pCa.LIZ(iSeaPdpCommunicationServiceLIZ3, this, "pdpSeaDestroyPendant", new AwS640S0100000_26(this, 126));
        }
        C03DZ.LIZJ(frameLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0187 A[PHI: r1 r5 r9
      0x0187: PHI (r1v9 java.util.LinkedHashMap) = (r1v8 java.util.LinkedHashMap), (r1v15 java.util.LinkedHashMap) binds: [B:73:0x0184, B:53:0x012a] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r5v7 java.lang.String) = (r5v6 java.lang.String), (r5v9 java.lang.String) binds: [B:73:0x0184, B:53:0x012a] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r9v13 X.0vtw) = (r9v12 X.0vtw), (r9v15 X.0vtw) binds: [B:73:0x0184, B:53:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1502460pCW LIZ(org.json.JSONObject r25) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1759980vts.LIZ(org.json.JSONObject):X.0pCW");
    }
}
