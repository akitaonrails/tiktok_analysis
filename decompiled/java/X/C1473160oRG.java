package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0oRG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473160oRG {
    public static final void LIZ(SmartImageView smartImageView, String str, String str2) {
        boolean z;
        String str3;
        String strSubstring;
        C1473190oRJ c1473190oRJ;
        if (smartImageView.getVisibility() == 0) {
            z = true;
            str3 = "showCover";
        } else {
            z = false;
            str3 = "hideCover:";
        }
        InterfaceC1472180oPg interfaceC1472180oPgTraceGroup = SimRadar.traceGroup("Cover");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cover:");
        sbLIZ.append(str3);
        interfaceC1472180oPgTraceGroup.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        SimRadar.analyzer().getClass();
        C1473150oRF c1473150oRFLIZ = C1472910oQr.LIZ(str2);
        if (c1473150oRFLIZ != null && (c1473190oRJ = c1473150oRFLIZ.LJI) != null) {
            WeakReference<View> weakReference = c1473190oRJ.LIZ;
            if (weakReference == null || weakReference.get() == null) {
                c1473190oRJ.LIZ = new WeakReference<>(smartImageView);
            }
            c1473190oRJ.LIZIZ = false;
        }
        if (TextUtils.isEmpty(str)) {
            strSubstring = "";
        } else {
            strSubstring = str.substring(0, Math.min(6, str.length()));
        }
        if (TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ISimRadar(");
            sbLIZ2.append("VideoViewCell");
            sbLIZ2.append(")");
            SimRadar.keyScan(C2188811AlT.LIZIZ(sbLIZ2), str3, strSubstring);
            return;
        }
        SimRadar.analyzer().getClass();
        C1473150oRF c1473150oRFLIZ2 = C1472910oQr.LIZ(str2);
        if (c1473150oRFLIZ2 != null) {
            if (z) {
                c1473150oRFLIZ2.LJIIIIZZ();
            } else {
                c1473150oRFLIZ2.Ur();
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("ISimRadar(");
        sbLIZ3.append("VideoViewCell");
        sbLIZ3.append(")");
        SimRadar.keyScan(C2188811AlT.LIZIZ(sbLIZ3), str3, strSubstring, str2);
    }
}
