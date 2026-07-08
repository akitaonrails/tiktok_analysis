package X;

import J.N;
import android.util.Printer;
import com.ttnet.org.chromium.base.EarlyTraceEvent;
import com.ttnet.org.chromium.base.TraceEvent;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0p7N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1499270p7N implements Printer {
    public String LL;

    public void LIZ(String str) {
        int iIndexOf;
        String strSubstring;
        int length;
        String strLIZIZ;
        boolean zLIZIZ = EarlyTraceEvent.LIZIZ();
        if (TraceEvent.LLILLJJLI || zLIZIZ) {
            if (TraceEvent.LLILZ) {
                strLIZIZ = "Looper.dispatch: EVENT_NAME_FILTERED";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Looper.dispatch: ");
                int iIndexOf2 = str.indexOf(40, 18);
                if (iIndexOf2 == -1) {
                    iIndexOf = -1;
                } else {
                    iIndexOf = str.indexOf(41, iIndexOf2);
                }
                String strSubstring2 = "";
                if (iIndexOf == -1) {
                    strSubstring = "";
                } else {
                    strSubstring = str.substring(iIndexOf2 + 1, iIndexOf);
                }
                sbLIZ.append(strSubstring);
                sbLIZ.append(e3.h);
                int iIndexOf3 = str.indexOf(125, 18);
                if (iIndexOf3 == -1 || (length = str.indexOf(58, iIndexOf3)) == -1) {
                    length = str.length();
                }
                if (iIndexOf3 != -1) {
                    strSubstring2 = str.substring(iIndexOf3 + 2, length);
                }
                sbLIZ.append(strSubstring2);
                sbLIZ.append(")");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            this.LL = strLIZIZ;
            if (TraceEvent.LLILLJJLI) {
                N.MljCyOuh(this.LL);
            } else {
                EarlyTraceEvent.LIZ(this.LL, true);
            }
        }
    }

    public void LIZIZ(String str) {
        boolean zLIZIZ = EarlyTraceEvent.LIZIZ();
        if ((TraceEvent.LLILLJJLI || zLIZIZ) && this.LL != null) {
            if (TraceEvent.LLILLJJLI) {
                N.M6R6NWXS(this.LL);
            } else {
                EarlyTraceEvent.LIZJ(this.LL, true);
            }
        }
        this.LL = null;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">")) {
            LIZ(str);
        } else {
            LIZIZ(str);
        }
    }
}
