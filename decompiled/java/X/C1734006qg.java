package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1734006qg {
    public final C01GW LIZ;
    public final C1733806qe LIZIZ;

    public C1734006qg(Context context) {
        boolean zBooleanValue;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1143));
        this.LIZ = c01gwLIZIZ;
        Boolean boolLJIJI = ((PrivacySettingsFeature) c01gwLIZIZ.getValue()).LJIJI();
        boolean zBooleanValue2 = true;
        if (boolLJIJI != null) {
            zBooleanValue = boolLJIJI.booleanValue();
        } else {
            zBooleanValue = true;
        }
        Boolean boolLJIIL = ((PrivacySettingsFeature) c01gwLIZIZ.getValue()).LJIIL();
        if (boolLJIIL != null) {
            zBooleanValue2 = boolLJIIL.booleanValue();
        } else {
            C342440Dbe.LIZ.getClass();
            String strLIZIZ = C2222691Bz1.LIZIZ();
            strLIZIZ = a0.LJJJIL(strLIZIZ) ? C2222691Bz1.LJFF() : strLIZIZ;
            SettingsManager.LIZLLL().getClass();
            String strLJI = SettingsManager.LJI("activity_status_guide_region_set_string", "AL,AD,AT,BE,BG,HR,CZ,DK,BG,HR,CZ,DK,BG,HR,CZ,DK,BG,HR,CZ,DK,EE,FO,FI,FR,DE,GI,GR,GG,VA,HU,IS,IE,IM,IT,JE,LV,LI,LT,LU,MT,MC,NL,MK,NO,PL,PT,RO,SM,RS,SK,SI,ES,SJ,SE,CH,GB,AX");
            if (strLIZIZ.length() > 0 && a0.LJJIIZI(strLJI, strLIZIZ, false)) {
                zBooleanValue2 = false;
            }
        }
        this.LIZIZ = new C1733806qe(zBooleanValue, zBooleanValue2);
    }
}
