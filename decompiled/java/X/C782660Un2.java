package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LopDobPreloadABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LopDobPreloadSetting;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AFwS296S0000000_12;
import kotlin.jvm.internal.AFwS326S0000000_1;

/* JADX INFO: renamed from: X.0Un2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782660Un2 {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static String LIZJ = "";
    public static final String LIZLLL;
    public static WeakReference<InterfaceC1105930esx> LJ;
    public static final List<String> LJFF;

    static {
        LopDobPreloadSetting lopDobPreloadSetting = LopDobPreloadSetting.INSTANCE;
        LIZLLL = lopDobPreloadSetting.getPreloadSchema();
        LJFF = lopDobPreloadSetting.getReuseAllowList();
    }

    public static void LIZ(String str) {
        LIZJ = str;
        if (LIZ) {
            return;
        }
        String str2 = LIZLLL;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        LopDobPreloadABSetting lopDobPreloadABSetting = LopDobPreloadABSetting.INSTANCE;
        if (lopDobPreloadABSetting.isLibTwo() || lopDobPreloadABSetting.isLibOne()) {
            LIZ = true;
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            if (C1537060q6K.LJI("live_lop_pns_fe_age") == null) {
                C1097680efe c1097680efe = new C1097680efe();
                c1097680efe.LJIIZILJ = true;
                c1097680efe.LIZ = "live_lop_pns_fe_age";
                LopDobPreloadSetting lopDobPreloadSetting = LopDobPreloadSetting.INSTANCE;
                c1097680efe.LJIJJLI = lopDobPreloadSetting.getPreloadAllowList();
                c1097680efe.LJIJI = lopDobPreloadSetting.getExpiredTimeInSeconds();
                c1097680efe.LJJ = true;
                c1097680efe.LJIJJ = AFwS326S0000000_1.get$arr$(16);
                c1097680efe.LJIIIIZZ = AFwS296S0000000_12.get$arr$(14);
                C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
            }
            C1546500qLY c1546500qLY = C1546560qLe.LIZ;
            C1546510qLZ c1546510qLZ = new C1546510qLZ();
            c1546510qLZ.LIZ = true;
            c1546510qLZ.LJFF = "live_lop_pns_fe_age";
            c1546510qLZ.LJI = LopDobPreloadSetting.INSTANCE.getExpiredTimeInSeconds();
            c1546510qLZ.LJIIIZ = AFwS296S0000000_12.get$arr$(15);
            c1546510qLZ.LJIIL = LJFF;
            c1546510qLZ.LJIIJ = AFwS245S0000000_12.get$arr$(232);
            Boolean bool = Boolean.FALSE;
            c1546500qLY.getClass();
            C1546500qLY.LJI(c1546510qLZ, bool);
            if (!C1537060q6K.LIZ("live_lop_pns_fe_age", str2)) {
                C1537060q6K.LJIIJJI(c1537060q6K, str2, "live_lop_pns_fe_age", null, new C1537070q6L() { // from class: X.0Un1
                    @Override // X.C1537070q6L
                    public final void LIZJ(String str3, String str4, C1537080q6M c1537080q6M) {
                    }

                    @Override // X.C1537070q6L
                    public final void LIZLLL(String str3, String str4, InterfaceC1105930esx interfaceC1105930esx) {
                        boolean z = C782660Un2.LIZ;
                        C782660Un2.LJ = new WeakReference<>(interfaceC1105930esx);
                    }
                }, true, null, 32);
            }
        }
    }
}
