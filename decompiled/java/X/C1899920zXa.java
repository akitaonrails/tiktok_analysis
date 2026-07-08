package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.touchpoint.api.service.IIncentiveSparkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS177S1100000_28;

/* JADX INFO: renamed from: X.0zXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899920zXa {
    public static final C1899920zXa LIZ = new C1899920zXa();
    public static final ConcurrentHashMap<String, C1899950zXd> LIZIZ = new ConcurrentHashMap<>();
    public static final C054G LIZJ;

    static {
        C1DFH c1dfh = C0PEM.LIZ;
        LIZJ = C2296808zG.LIZ(C2107308Nj.LIZ);
    }

    public static C991900bv2 LIZ(C1899950zXd c1899950zXd) {
        EnumC1899960zXe enumC1899960zXe = c1899950zXd.LJI;
        if (enumC1899960zXe != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("open failure popupIdentifier=");
            sbLIZ.append(c1899950zXd.LIZIZ);
            sbLIZ.append(" pageIdentifier=");
            sbLIZ.append(c1899950zXd.LIZJ);
            sbLIZ.append(" reason=");
            sbLIZ.append(enumC1899960zXe.getValue());
            C2188811AlT.LIZIZ(sbLIZ);
            C1899940zXc.LIZ.getClass();
            C1899940zXc.LIZIZ(c1899950zXd);
            return new C991900bv2(0, enumC1899960zXe.getValue());
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static void LIZIZ(String str) {
        SparkPopup sparkPopup;
        C1899950zXd c1899950zXd = LIZIZ.get(str);
        if (c1899950zXd != null && (sparkPopup = c1899950zXd.LJII) != null) {
            sparkPopup.gS(true);
        }
    }

    public static FragmentManager LIZLLL(C19EG c19eg) {
        FragmentManager fragmentManagerLJ;
        IIncentiveSparkService iIncentiveSparkService = (IIncentiveSparkService) PluggableExtentionKt.pluggableSpi$default(IIncentiveSparkService.class, false, false, false, 14, null);
        if (iIncentiveSparkService == null || (fragmentManagerLJ = iIncentiveSparkService.LJ(c19eg)) == null) {
            return c19eg.getSupportFragmentManager();
        }
        return fragmentManagerLJ;
    }

    public static boolean LJ(String str) {
        SparkPopup sparkPopup;
        C1899950zXd c1899950zXd = LIZIZ.get(str);
        if (c1899950zXd == null || (sparkPopup = c1899950zXd.LJII) == null || !sparkPopup.isVisible()) {
            return false;
        }
        return true;
    }

    public static void LIZJ(String str, EnumC1899960zXe enumC1899960zXe) {
        C01U6.LIZIZ(new AwS177S1100000_28(str, enumC1899960zXe, 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C1899920zXa r22, X.EnumC1899970zXf r23, java.lang.String r24, com.bytedance.touchpoint.api.model.DynamicDialog r25, X.InterfaceC1899900zXY r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1899920zXa.LJFF(X.0zXa, X.0zXf, java.lang.String, com.bytedance.touchpoint.api.model.DynamicDialog, X.0zXY):void");
    }
}
