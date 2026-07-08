package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoImageUploadAuthConfig;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: renamed from: X.0ycI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1864400ycI {
    public static final C1864400ycI LIZ = new C1864400ycI();
    public static TakoImageUploadAuthConfig LIZIZ;

    public static String LIZIZ(String str) {
        C0VSJ c0vsjLJIILIIL = C2354709Kn.LJIILIIL();
        if (c0vsjLJIILIIL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0vsjLJIILIIL.getPath());
            sbLIZ.append(File.separator);
            sbLIZ.append("Tako");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            if ((c0vsj.exists() || c0vsj.mkdirs()) && strLIZIZ != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(File.separator);
                sbLIZ2.append(System.currentTimeMillis());
                sbLIZ2.append(str);
                sbLIZ2.append(".jpg");
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            return "";
        }
        return "";
    }

    public static void LIZ(C1864400ycI c1864400ycI, boolean z, Integer num, Function1 function1, int i) {
        TakoImageUploadAuthConfig takoImageUploadAuthConfig;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            function1 = AFwS274S0000000_30.get$arr$(268);
        }
        c1864400ycI.getClass();
        if (z) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1864390ycH(num, null, function1), 3);
            return;
        }
        if (!C20188913z5.LIZJ(LIZIZ, num)) {
            C1860520yW2.LIZ.getClass();
            String string = C1860520yW2.LJIIL().getString("image_upload_auth_config", "");
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (string.length() != 0) {
                C1227904rF.LIZ.getClass();
                takoImageUploadAuthConfig = (TakoImageUploadAuthConfig) C1227904rF.LIZIZ(string, TakoImageUploadAuthConfig.class);
            } else {
                takoImageUploadAuthConfig = null;
            }
            if (C20188913z5.LIZJ(takoImageUploadAuthConfig, num)) {
                LIZIZ = takoImageUploadAuthConfig;
                function1.invoke(takoImageUploadAuthConfig);
                return;
            } else {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1864390ycH(num, null, function1), 3);
                return;
            }
        }
        TakoImageUploadAuthConfig takoImageUploadAuthConfig2 = LIZIZ;
        LIZIZ = takoImageUploadAuthConfig2;
        function1.invoke(takoImageUploadAuthConfig2);
    }
}
