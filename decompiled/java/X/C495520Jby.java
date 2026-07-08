package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Jby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C495520Jby {
    public final List<C495540Jc0> LIZ;
    public String LIZIZ;
    public final String LIZJ;

    public final String LIZLLL() {
        if (((ArrayList) this.LIZ).isEmpty()) {
            return this.LIZIZ;
        }
        List<C495540Jc0> list = this.LIZ;
        String str = this.LIZJ;
        StringBuilder sb = new StringBuilder();
        for (InterfaceC495530Jbz interfaceC495530Jbz : (ArrayList) list) {
            String strLIZ = C08NW.LIZ(interfaceC495530Jbz.getName(), str);
            String value = interfaceC495530Jbz.getValue();
            String strLIZ2 = value != null ? C08NW.LIZ(value, str) : "";
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(strLIZ);
            sb.append("=");
            sb.append(strLIZ2);
        }
        String string = sb.toString();
        String str2 = this.LIZIZ;
        if (str2 == null || str2.length() == 0) {
            return string;
        }
        int iIndexOf = this.LIZIZ.indexOf(63);
        if (iIndexOf < 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append("?");
            sbLIZ.append(string);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LIZIZ.indexOf(61, iIndexOf) <= 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LIZIZ);
            sbLIZ2.append("&");
            sbLIZ2.append(string);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        int i = iIndexOf + 1;
        String strSubstring = this.LIZIZ.substring(0, i);
        String strSubstring2 = this.LIZIZ.substring(i);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strSubstring);
        sbLIZ3.append(string);
        sbLIZ3.append("&");
        sbLIZ3.append(strSubstring2);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public C495520Jby() {
        this.LIZ = new ArrayList();
        this.LIZJ = "UTF-8";
        this.LIZIZ = null;
    }

    public final String toString() {
        return LIZLLL();
    }

    public C495520Jby(String str) {
        this.LIZ = new ArrayList();
        this.LIZJ = "UTF-8";
        this.LIZIZ = str;
    }

    public final void LIZ(int i, String str) {
        ((ArrayList) this.LIZ).add(new C495540Jc0(str, String.valueOf(i)));
    }

    public final void LIZIZ(long j, String str) {
        ((ArrayList) this.LIZ).add(new C495540Jc0(str, String.valueOf(j)));
    }

    public final void LIZJ(String str, String str2) {
        ((ArrayList) this.LIZ).add(new C495540Jc0(str, str2));
    }
}
