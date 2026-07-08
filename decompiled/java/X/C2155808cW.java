package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.app.crash.emergencychannel.EmergencyConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.08cW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2155808cW {
    public static String LIZ;
    public static final Gson LIZIZ = new Gson();
    public static EmergencyConfig LIZJ;

    public static EmergencyConfig LIZ(Context context) {
        C0VSP c0vsp;
        EmergencyConfig emergencyConfig = LIZJ;
        if (emergencyConfig != null) {
            return emergencyConfig;
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                if (LIZ == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(context.getExternalFilesDir("emergency_channel"));
                    sbLIZ.append("/");
                    sbLIZ.append("emergency_config");
                    LIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                C0VSJ c0vsj = new C0VSJ(LIZ);
                if (c0vsj.exists()) {
                    c0vsp = new C0VSP(c0vsj);
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(c0vsp));
                        try {
                            LIZJ = (EmergencyConfig) LIZIZ.LJFF(bufferedReader2, EmergencyConfig.class);
                            bufferedReader2.close();
                            if (c0vsp != null) {
                                c0vsp.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (c0vsp != null) {
                                    c0vsp.close();
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        throw th2;
                                    }
                                }
                                if (c0vsp != null) {
                                    c0vsp.close();
                                    throw th2;
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        } catch (Throwable th4) {
            th = th4;
            c0vsp = null;
        }
        return LIZJ;
    }
}
