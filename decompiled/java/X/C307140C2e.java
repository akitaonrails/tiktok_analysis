package X;

import com.bytedance.ies.ugc.statisticlogger.experiment.NxETOidFilterSettings;

/* JADX INFO: renamed from: X.0C2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307140C2e {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        if (!((Boolean) C307160C2g.LIZ.getValue()).booleanValue() && C307150C2f.LIZ != 1) {
            return false;
        }
        boolean zContains = NxETOidFilterSettings.INSTANCE.getFilterSet().contains(str);
        if (zContains) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" is filtered");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return zContains;
    }
}
