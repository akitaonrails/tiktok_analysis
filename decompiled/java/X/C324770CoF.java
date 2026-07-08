package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.config.CrowdUid;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import java.util.Set;

/* JADX INFO: renamed from: X.0CoF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C324770CoF {
    static {
        if (((Boolean) C264680AYw.LIZ.getValue()).booleanValue()) {
            C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
            C1860520yW2.LJJIJIL(c1860520yW2, 0L);
            C1860520yW2.LJJIJIIJIL(c1860520yW2, "");
        }
    }

    public static C324790CoH LIZ(TakoEnterParams takoEnterParams) {
        boolean z;
        Integer num;
        C324780CoG.LIZ.getClass();
        boolean zBooleanValue = ((Boolean) C324780CoG.LIZIZ.getValue()).booleanValue();
        C311300CIe.LIZ.getClass();
        CrowdUid crowdUid = (CrowdUid) C311300CIe.LJII.getValue();
        boolean z2 = true;
        if (crowdUid != null && (num = crowdUid.showTakoOnboarding) != null && num.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        C1893307bH.LIZ.getClass();
        boolean zContains = ((Set) C1893307bH.LIZJ.getValue()).contains(takoEnterParams.enterMethod);
        C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
        C07QM.LIZ.getClass();
        int iIntValue = ((Number) C07QM.LIZIZ.getValue()).intValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1860520yW2.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva kevaLJIIL = C1860520yW2.LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_onboarding_last_active_entry_send_time");
        sbLIZ.append(curUserId);
        long j = kevaLJIIL.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        if (j > 0 && jCurrentTimeMillis - j < ((long) (iIntValue * 24 * 60 * 60)) * 1000) {
            z2 = false;
        }
        return new C324790CoH(zBooleanValue, z, zContains, z2);
    }
}
