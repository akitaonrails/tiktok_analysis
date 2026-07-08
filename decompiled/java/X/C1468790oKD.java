package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0oKD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468790oKD {
    public static C1468790oKD LIZIZ = null;
    public static int LIZJ = -1;
    public static int LIZLLL = 100;
    public final ConcurrentHashMap<String, C1468800oKE> LIZ = new ConcurrentHashMap<>();

    public static C1468790oKD LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C1468790oKD.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1468790oKD();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static void LJI(int i) {
        LIZLLL = i;
    }

    public static void LJII(int i) {
        LIZJ = i;
    }

    public static String LIZJ(String str, String str2) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        String strSubstring6;
        String strSubstring7;
        char c;
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String strSubstring8 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = str2.split("[?]");
        if (strArrSplit.length >= 2) {
            String[] strArrSplit2 = strArrSplit[1].split("&");
            strSubstring = null;
            strSubstring2 = null;
            strSubstring3 = null;
            strSubstring4 = null;
            strSubstring5 = null;
            strSubstring6 = null;
            strSubstring7 = null;
            for (String str3 : strArrSplit2) {
                if (str3.indexOf("codec_type") == 0) {
                    strSubstring8 = str3.substring(11);
                } else if (str3.indexOf("CodecType") == 0) {
                    strSubstring8 = str3.substring(10);
                } else if (str3.indexOf("Codec") == 0) {
                    strSubstring8 = str3.substring(6);
                } else if (str3.indexOf("format_type") == 0) {
                    strSubstring = str3.substring(12);
                } else if (str3.indexOf("FormatType") == 0) {
                    strSubstring = str3.substring(11);
                } else if (str3.indexOf("Format") == 0) {
                    strSubstring = str3.substring(7);
                } else if (str3.indexOf("ptoken") == 0) {
                    strSubstring2 = str3.substring(7);
                } else if (str3.indexOf("PToken") == 0) {
                    strSubstring2 = str3.substring(7);
                } else if (str3.indexOf("ssl") == 0) {
                    strSubstring3 = str3.substring(4);
                } else if (str3.indexOf("Ssl") == 0) {
                    strSubstring3 = str3.substring(4);
                } else if (str3.indexOf("HDRDefinition") == 0) {
                    strSubstring4 = str3.substring(14);
                } else if (str3.indexOf("FileType") == 0) {
                    strSubstring5 = str3.substring(9);
                } else if (str3.indexOf("UnionInfo") == 0) {
                    strSubstring6 = str3.substring(10);
                } else if (str3.indexOf("DrmExpireTimestamp") == 0) {
                    strSubstring7 = str3.substring(19);
                }
            }
        } else {
            strSubstring = null;
            strSubstring2 = null;
            strSubstring3 = null;
            strSubstring4 = null;
            strSubstring5 = null;
            strSubstring6 = null;
            strSubstring7 = null;
        }
        sb.append(str);
        if (!TextUtils.isEmpty(strSubstring8)) {
            c = 0;
            sb.append(C786410Ut5.j4("/%s", new Object[]{strSubstring8}));
        } else {
            c = 0;
        }
        if (!TextUtils.isEmpty(strSubstring)) {
            Object[] objArr = new Object[1];
            objArr[c] = strSubstring;
            sb.append(C786410Ut5.j4("/%s", objArr));
        }
        if (!TextUtils.isEmpty(strSubstring2)) {
            Object[] objArr2 = new Object[1];
            objArr2[c] = strSubstring2;
            sb.append(C786410Ut5.j4("/%s", objArr2));
        }
        if (!TextUtils.isEmpty(strSubstring3)) {
            Object[] objArr3 = new Object[1];
            objArr3[c] = strSubstring3;
            sb.append(C786410Ut5.j4("/%s", objArr3));
        }
        if (!TextUtils.isEmpty(strSubstring4)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hdr_");
            sbLIZ.append(strSubstring4);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c = 0;
            sb.append(C786410Ut5.j4("/%s", new Object[]{strLIZIZ}));
        }
        if (!TextUtils.isEmpty(strSubstring5)) {
            Object[] objArr4 = new Object[1];
            objArr4[c] = strSubstring5;
            sb.append(C786410Ut5.j4("/%s", objArr4));
        }
        if (!TextUtils.isEmpty(strSubstring6)) {
            Object[] objArr5 = new Object[1];
            objArr5[c] = strSubstring6;
            sb.append(C786410Ut5.j4("/%s", objArr5));
        }
        if (!TextUtils.isEmpty(strSubstring7)) {
            Object[] objArr6 = new Object[1];
            objArr6[c] = strSubstring7;
            sb.append(C786410Ut5.j4("/%s", objArr6));
        }
        return sb.toString();
    }

    public final synchronized C1468800oKE LIZ(String str, String str2) {
        if (this.LIZ != null) {
            String strLIZJ = LIZJ(str, str2);
            if (TextUtils.isEmpty(strLIZJ)) {
                return null;
            }
            C1468800oKE c1468800oKE = this.LIZ.get(strLIZJ);
            if (c1468800oKE != null) {
                int iLJIIZILJ = LIZJ;
                if (iLJIIZILJ <= 0) {
                    C1470240oMY c1470240oMY = c1468800oKE.LIZ;
                    if (c1470240oMY != null) {
                        iLJIIZILJ = (c1470240oMY.LJIIZILJ(3) + 3600) - 300;
                    } else {
                        iLJIIZILJ = 3600;
                    }
                }
                if (SystemClock.elapsedRealtime() - c1468800oKE.LIZIZ > iLJIIZILJ * LSPassThroughRecordSizeConfig.DEFAULT) {
                    c1468800oKE.LIZJ = true;
                } else {
                    c1468800oKE.LIZJ = false;
                }
                return c1468800oKE;
            }
        }
        return null;
    }

    public final synchronized void LJFF(String str, String str2) {
        if (this.LIZ != null) {
            String strLIZJ = LIZJ(str, str2);
            if (TextUtils.isEmpty(strLIZJ)) {
            } else {
                this.LIZ.remove(strLIZJ);
            }
        }
    }

    public final synchronized void LIZLLL(String str, String str2, C1468800oKE c1468800oKE) {
        String strLIZJ = LIZJ(str, str2);
        if (TextUtils.isEmpty(strLIZJ)) {
            return;
        }
        this.LIZ.put(strLIZJ, c1468800oKE);
        if (this.LIZ.size() > LIZLLL) {
            long j = Long.MAX_VALUE;
            String key = null;
            for (Map.Entry<String, C1468800oKE> entry : this.LIZ.entrySet()) {
                long j2 = entry.getValue().LIZIZ;
                if (j2 < j) {
                    key = entry.getKey();
                    j = j2;
                }
            }
            if (key != null) {
                this.LIZ.remove(key);
            }
        }
    }

    public final synchronized void LJ(String str, String str2, C1470240oMY c1470240oMY) {
        if (this.LIZ != null && str != null && str2 != null) {
            C1468800oKE c1468800oKE = new C1468800oKE();
            c1468800oKE.LIZ = c1470240oMY;
            c1468800oKE.LIZIZ = SystemClock.elapsedRealtime();
            LIZLLL(str, str2, c1468800oKE);
        }
    }
}
