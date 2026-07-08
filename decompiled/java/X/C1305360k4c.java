package X;

import android.content.Context;
import android.os.Build;
import com.benchmark.device.BXDeviceInfo;
import com.ss.android.ugc.aweme.ml.feature.expriment.OverAllScoreConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305360k4c extends FeatureProducer {
    public static final C1305360k4c LIZIZ = new C1305360k4c();
    public static String LIZJ = "f_bytebench";

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZJ;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZJ = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        String strValueOf;
        if (returnCode != null) {
            returnCode.code = 200;
        }
        if (Intrinsics.LJFF(str, "overall_score")) {
            C0CF8.LIZ.getClass();
            strValueOf = Float.valueOf(C0CF8.LIZ());
        } else {
            int i = -1;
            if (Intrinsics.LJFF(str, "overall_score_level")) {
                C0CF8.LIZ.getClass();
                float fLIZ = C0CF8.LIZ();
                C01GW c01gw = C07UN.LIZIZ;
                if (fLIZ >= ((OverAllScoreConfig) c01gw.getValue()).highScore) {
                    i = 2;
                } else if (C0CF8.LIZ() >= ((OverAllScoreConfig) c01gw.getValue()).middleScore) {
                    i = 1;
                } else if (C0CF8.LIZ() > 0.0f) {
                    i = 0;
                }
                strValueOf = Integer.valueOf(i);
            } else {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                str.getClass();
                switch (str.hashCode()) {
                    case -1587037619:
                        if (!str.equals("core_nums")) {
                            strValueOf = "";
                        } else {
                            if (BXDeviceInfo.LIZIZ == null) {
                                BXDeviceInfo.LIZIZ = BXDeviceInfo.LIZLLL();
                            }
                            strValueOf = Integer.valueOf(BXDeviceInfo.LIZIZ.LIZJ);
                        }
                        break;
                    case -1332654029:
                        if (!str.equals("screen_width")) {
                            strValueOf = "";
                        } else {
                            if (BXDeviceInfo.LIZ == null) {
                                BXDeviceInfo.LIZ = BXDeviceInfo.LJII(contextLIZ);
                            }
                            strValueOf = Integer.valueOf(BXDeviceInfo.LIZ.LIZ);
                        }
                        break;
                    case -1254252915:
                        if (!str.equals("glVendor")) {
                            strValueOf = "";
                        } else {
                            if (BXDeviceInfo.LIZJ == null) {
                                BXDeviceInfo.LIZJ = BXDeviceInfo.LJ();
                            }
                            C1305390k4f c1305390k4f = BXDeviceInfo.LIZJ;
                            strValueOf = c1305390k4f == null ? "" : c1305390k4f.LIZIZ;
                        }
                        break;
                    case -1127809848:
                        if (!str.equals("glRenderer")) {
                            strValueOf = "";
                        } else {
                            if (BXDeviceInfo.LIZJ == null) {
                                BXDeviceInfo.LIZJ = BXDeviceInfo.LJ();
                            }
                            C1305390k4f c1305390k4f2 = BXDeviceInfo.LIZJ;
                            strValueOf = c1305390k4f2 == null ? "" : c1305390k4f2.LIZ;
                        }
                        break;
                    case -222999501:
                        if (!str.equals("glVersion")) {
                            strValueOf = "";
                        } else {
                            if (BXDeviceInfo.LIZJ == null) {
                                BXDeviceInfo.LIZJ = BXDeviceInfo.LJ();
                            }
                            C1305390k4f c1305390k4f3 = BXDeviceInfo.LIZJ;
                            strValueOf = c1305390k4f3 == null ? "" : c1305390k4f3.LIZJ;
                        }
                        break;
                    case -202556711:
                        if (!str.equals("glExtensions")) {
                            strValueOf = "";
                        } else {
                            if (BXDeviceInfo.LIZJ == null) {
                                BXDeviceInfo.LIZJ = BXDeviceInfo.LJ();
                            }
                            C1305390k4f c1305390k4f4 = BXDeviceInfo.LIZJ;
                            strValueOf = c1305390k4f4 == null ? "" : c1305390k4f4.LIZLLL;
                        }
                        break;
                    case -51212444:
                        if (!str.equals("width_dpi")) {
                            strValueOf = "";
                        } else {
                            if (BXDeviceInfo.LIZ == null) {
                                BXDeviceInfo.LIZ = BXDeviceInfo.LJII(contextLIZ);
                            }
                            strValueOf = Float.valueOf(BXDeviceInfo.LIZ.LIZJ);
                        }
                        break;
                    case -43401155:
                        if (!str.equals("screen_inch")) {
                            strValueOf = "";
                        } else {
                            if (BXDeviceInfo.LIZ == null) {
                                BXDeviceInfo.LIZ = BXDeviceInfo.LJII(contextLIZ);
                            }
                            strValueOf = Double.valueOf(BXDeviceInfo.LIZ.LJI);
                        }
                        break;
                    case 407693427:
                        if (!str.equals("max_freq")) {
                            strValueOf = "";
                        } else {
                            if (BXDeviceInfo.LIZIZ == null) {
                                BXDeviceInfo.LIZIZ = BXDeviceInfo.LIZLLL();
                            }
                            strValueOf = Integer.valueOf(BXDeviceInfo.LIZIZ.LIZIZ);
                        }
                        break;
                    case 499515084:
                        strValueOf = !str.equals("cpu_abi_list") ? "" : BXDeviceInfo.LJIIIIZZ();
                        break;
                    case 1204403290:
                        if (!str.equals("screen_height")) {
                            strValueOf = "";
                        } else {
                            if (BXDeviceInfo.LIZ == null) {
                                BXDeviceInfo.LIZ = BXDeviceInfo.LJII(contextLIZ);
                            }
                            strValueOf = Integer.valueOf(BXDeviceInfo.LIZ.LIZIZ);
                        }
                        break;
                    case 1374225475:
                        strValueOf = !str.equals("brand_name") ? "" : Build.BRAND;
                        break;
                    case 1490704965:
                        if (!str.equals("height_dpi")) {
                            strValueOf = "";
                        } else {
                            if (BXDeviceInfo.LIZ == null) {
                                BXDeviceInfo.LIZ = BXDeviceInfo.LJII(contextLIZ);
                            }
                            strValueOf = Float.valueOf(BXDeviceInfo.LIZ.LIZLLL);
                        }
                        break;
                    case 1552717032:
                        if (!str.equals("density")) {
                            strValueOf = "";
                        } else {
                            if (BXDeviceInfo.LIZ == null) {
                                BXDeviceInfo.LIZ = BXDeviceInfo.LJII(contextLIZ);
                            }
                            strValueOf = Float.valueOf(BXDeviceInfo.LIZ.LJ);
                        }
                        break;
                    case 1762956678:
                        if (!str.equals("density_dpi")) {
                            strValueOf = "";
                        } else {
                            if (BXDeviceInfo.LIZ == null) {
                                BXDeviceInfo.LIZ = BXDeviceInfo.LJII(contextLIZ);
                            }
                            strValueOf = Float.valueOf(BXDeviceInfo.LIZ.LJFF);
                        }
                        break;
                    case 2104871393:
                        if (!str.equals("model_name")) {
                            strValueOf = "";
                        } else {
                            if (BXDeviceInfo.LIZIZ == null) {
                                BXDeviceInfo.LIZIZ = BXDeviceInfo.LIZLLL();
                            }
                            strValueOf = BXDeviceInfo.LIZIZ.LIZ;
                        }
                        break;
                    default:
                        strValueOf = "";
                        break;
                }
            }
        }
        if (Intrinsics.LJFF(strValueOf, "") && returnCode != null) {
            returnCode.code = 1;
        }
        return strValueOf;
    }
}
