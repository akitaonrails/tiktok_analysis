package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AFwS326S0000000_1;
import kotlin.jvm.internal.AFwS344S0000000_23;

/* JADX INFO: renamed from: X.0qQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549750qQn {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static EnumC642080PGk LIZJ;

    public static void LIZ(EnumC642080PGk enumC642080PGk) {
        if (LIZJ != enumC642080PGk) {
            return;
        }
        if (C1549760qQo.LIZIZ()) {
            LIZ = false;
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LJIILL("poi_third_party_iab");
        }
        if (C1549760qQo.LIZ() == 3) {
            LIZ = false;
            C1546560qLe.LIZ.getClass();
            C1546500qLY.LJIIIIZZ("poi_third_party_iab");
        }
        LIZJ = null;
    }

    public static void LIZIZ(Context context, EnumC642080PGk enumC642080PGk) {
        String str;
        boolean z;
        if (LIZJ != null) {
            return;
        }
        if (C1549760qQo.LIZIZ()) {
            if ((C1549760qQo.LIZ() != 1 || !LIZIZ) && !LIZ) {
                LIZ = true;
                C1537060q6K c1537060q6K = C1529590puH.LIZ;
                C1097680efe c1097680efe = new C1097680efe();
                c1097680efe.LJIIZILJ = true;
                c1097680efe.LIZ = "poi_third_party_iab";
                c1097680efe.LJIJI = -1;
                c1097680efe.LJIJ = 3;
                c1097680efe.LJIIIZ = AFwS344S0000000_23.get$arr$(0);
                c1097680efe.LJIJJ = AFwS326S0000000_1.get$arr$(0);
                c1097680efe.LJJ = false;
                c1097680efe.LJ = true;
                C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
            }
            if (C1549760qQo.LIZ() != 1 || !LIZIZ) {
                C1537060q6K c1537060q6K2 = C1529590puH.LIZ;
                ThirdPartyBizCert thirdPartyBizCert = new ThirdPartyBizCert(402685959);
                SparkContext sparkContext = new SparkContext();
                sparkContext.bid = "poi_third_party";
                sparkContext.LJJLIIJ("aweme://webview");
                sparkContext.LJJJZ("show_web_url", "1");
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
                if (numLIZJ != null) {
                    sparkContext.LJJJLZIJ(numLIZJ.intValue(), "status_bar_bg_color");
                }
                if (C960203pA.LIZIZ(context)) {
                    str = "light";
                } else {
                    str = "dark";
                }
                sparkContext.LJJJZ("status_font_mode", str);
                sparkContext.bizCert = thirdPartyBizCert;
                sparkContext.LJJJZ("nav_btn_type", "more");
                C1043030dFV c1043030dFV = new C1043030dFV(context);
                C1893220zMm c1893220zMm = new C1893220zMm();
                sparkContext.LJJLIIIIJ(c1043030dFV);
                sparkContext.LJJJJZ(c1893220zMm);
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ttls_disable_seclink_check", true) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                sparkContext.disableSeclinkExplicit = z;
                sparkContext.LJJJLZIJ(0, "use_webview_title");
                sparkContext.LJJ(InterfaceC1541510qDV.class, new C1068970dvL());
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("Spark_Cookie_Manager_Enable", true)) {
                    sparkContext.LJJJLZIJ(1, "clean_cookie_when_account_change");
                }
                sparkContext.LJJJJZI(new C1892890zMF());
                C1537060q6K.LJIIIZ("aweme://webview", "poi_third_party_iab", sparkContext, 8);
                LIZIZ = true;
            }
            LIZJ = enumC642080PGk;
        }
        if (C1549760qQo.LIZ() == 3) {
            C1546510qLZ c1546510qLZ = new C1546510qLZ();
            c1546510qLZ.LIZ = true;
            c1546510qLZ.LJFF = "poi_third_party_iab";
            c1546510qLZ.LIZLLL = 1;
            c1546510qLZ.LJIIIZ = AFwS285S0000000_2.get$arr$(5);
            c1546510qLZ.LJIIJ = AFwS263S0000000_23.get$arr$(5);
            C1546500qLY c1546500qLY = C1546560qLe.LIZ;
            Boolean bool = Boolean.FALSE;
            c1546500qLY.getClass();
            C1546500qLY.LJI(c1546510qLZ, bool);
        }
    }
}
