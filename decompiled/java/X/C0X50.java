package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.ProtocolException;

/* JADX INFO: renamed from: X.0X50, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X50 {
    public final EnumC847200XLi LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZ == EnumC847200XLi.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.LIZIZ);
        if (this.LIZJ != null) {
            sb.append(' ');
            sb.append(this.LIZJ);
        }
        return sb.toString();
    }

    public static C0X50 LIZ(String str) throws ProtocolException {
        EnumC847200XLi enumC847200XLi;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    enumC847200XLi = EnumC847200XLi.HTTP_1_0;
                } else if (iCharAt == 1) {
                    enumC847200XLi = EnumC847200XLi.HTTP_1_1;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unexpected status line: ");
                    sbLIZ.append(str);
                    throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Unexpected status line: ");
                sbLIZ2.append(str);
                throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else if (str.startsWith("ICY ")) {
            enumC847200XLi = EnumC847200XLi.HTTP_1_0;
            i = 4;
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Unexpected status line: ");
            sbLIZ3.append(str);
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ3));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int i3 = CastIntegerProtector.parseInt(str.substring(i, i2));
                if (str.length() > i2) {
                    if (str.charAt(i2) == ' ') {
                        strSubstring = str.substring(i + 4);
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Unexpected status line: ");
                        sbLIZ4.append(str);
                        throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                } else {
                    strSubstring = "";
                }
                return new C0X50(enumC847200XLi, i3, strSubstring);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Unexpected status line: ");
                sbLIZ5.append(str);
                throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ5));
            }
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("Unexpected status line: ");
        sbLIZ6.append(str);
        throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ6));
    }

    public C0X50(EnumC847200XLi enumC847200XLi, int i, String str) {
        this.LIZ = enumC847200XLi;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
