package X;

import Y.ARunnableS120S0100000_20;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.text.Normalizer;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0jaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286540jaG {
    public static volatile long LJFF;
    public static final Pattern LJI = PatternProtector.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    public static final Pattern LJII = PatternProtector.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    public final ExecutorService LIZ;
    public final InterfaceC1286560jaI LIZIZ;
    public volatile boolean LIZJ;
    public String LIZLLL;
    public volatile String LJ;

    public final String LIZ() {
        LJI();
        return this.LJ;
    }

    public final void LJI() {
        ExecutorService executorService;
        if (SystemClock.elapsedRealtime() - LJFF < 300000 || (executorService = this.LIZ) == null || executorService.isShutdown()) {
            return;
        }
        this.LIZ.submit(new ARunnableS120S0100000_20(this, 204));
    }

    public static C1286550jaH LIZIZ(String str) {
        if (str != null && str.length() != 0) {
            int iIndexOf = str.indexOf("://") + 3;
            int length = str.length();
            int i = iIndexOf;
            int i2 = -1;
            while (iIndexOf < length) {
                char cCharAt = str.charAt(iIndexOf);
                if (cCharAt == '#' || cCharAt == '/') {
                    break;
                }
                if (cCharAt != ':') {
                    if (cCharAt == '?') {
                        break;
                    }
                    if (cCharAt == '@') {
                        i = iIndexOf + 1;
                    }
                } else {
                    i2 = iIndexOf;
                }
                iIndexOf++;
            }
            if (i2 == -1) {
                i2 = iIndexOf;
            }
            return new C1286550jaH(i, i2, iIndexOf);
        }
        return null;
    }

    public static String LIZJ(String str) {
        if (str != null && str.length() != 0) {
            C1286550jaH c1286550jaHLIZIZ = LIZIZ(str);
            return str.substring(c1286550jaHLIZIZ.LIZ, c1286550jaHLIZIZ.LIZIZ);
        }
        return null;
    }

    public static boolean LJFF(String str) {
        Pattern patternCompile = PatternProtector.compile("(([0-9])|([1-9]\\d)|(([1]\\d{2})|(([2][0-4]\\d)|([2][5][0-5]))))(.(([0-9])|([1-9]\\d)|(([1]\\d{2})|(([2][0-4]\\d)|([2][5][0-5]))))){3}");
        if (TextUtils.isEmpty(str)) {
            C1698940uJQ.LIZJ();
            return false;
        }
        return patternCompile.matcher(Normalizer.normalize(str, Normalizer.Form.NFKC)).matches();
    }

    public C1286540jaG(C822650WOx c822650WOx, InterfaceC1286560jaI interfaceC1286560jaI) {
        this.LIZ = c822650WOx;
        this.LIZIZ = interfaceC1286560jaI;
    }

    public static String LIZLLL(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            C1286550jaH c1286550jaHLIZIZ = LIZIZ(str);
            boolean zStartsWith = str.startsWith("http");
            if (TextUtils.isEmpty(str2)) {
                C1698940uJQ.LIZ();
            } else {
                String strNormalize = Normalizer.normalize(str2, Normalizer.Form.NFKC);
                if (LJI.matcher(strNormalize).matches() || LJII.matcher(strNormalize).matches()) {
                    str2 = C786410Ut5.j4("[%s]", new Object[]{str2});
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str.substring(0, c1286550jaHLIZIZ.LIZ));
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int i = c1286550jaHLIZIZ.LIZIZ;
            if (c1286550jaHLIZIZ.LIZJ != -1) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(str.substring(c1286550jaHLIZIZ.LIZIZ, c1286550jaHLIZIZ.LIZJ));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                i = c1286550jaHLIZIZ.LIZJ;
            }
            if (!zStartsWith) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append("/");
                sbLIZ3.append(LIZJ(str));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(str.substring(i));
            return C2188811AlT.LIZIZ(sbLIZ4);
        }
        return null;
    }

    public static String LJ(String str, String str2, boolean z) {
        C1286550jaH c1286550jaH = null;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        if (str != null && str.length() != 0) {
            int iIndexOf = str.indexOf("://") + 3;
            int length = str.length();
            int i = -1;
            int i2 = iIndexOf;
            while (iIndexOf < length) {
                char cCharAt = str.charAt(iIndexOf);
                if (cCharAt == '#' || cCharAt == '/') {
                    break;
                }
                if (cCharAt != ':') {
                    if (cCharAt != ']') {
                        if (cCharAt == '?') {
                            break;
                        }
                        if (cCharAt == '@') {
                            i2 = iIndexOf + 1;
                        }
                    } else if (z) {
                    }
                    iIndexOf++;
                } else if (!z) {
                }
                i = iIndexOf;
                iIndexOf++;
            }
            if (i == -1) {
                i = iIndexOf;
            }
            c1286550jaH = new C1286550jaH(i2, i, iIndexOf);
        }
        str.startsWith("http");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str.substring(0, c1286550jaH.LIZ));
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i3 = c1286550jaH.LIZIZ;
        if (c1286550jaH.LIZJ != -1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(str.substring(c1286550jaH.LIZIZ, c1286550jaH.LIZJ));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            i3 = c1286550jaH.LIZJ;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(str.substring(i3));
        return C2188811AlT.LIZIZ(sbLIZ3);
    }
}
