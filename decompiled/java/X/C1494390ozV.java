package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Locale;

/* JADX INFO: renamed from: X.0ozV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494390ozV implements Externalizable {
    public String LL;
    public String LLILLJJLI;
    public C1494400ozW LLILLL;

    public C1494390ozV() {
        this.LL = "application";
        this.LLILLJJLI = "*";
        this.LLILLL = new C1494400ozW();
    }

    public String getBaseType() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("/");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getBaseType());
        sbLIZ.append(this.LLILLL.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1494400ozW getParameters() {
        return this.LLILLL;
    }

    public String getPrimaryType() {
        return this.LL;
    }

    public String getSubType() {
        return this.LLILLJJLI;
    }

    public C1494390ozV(String str) throws C1494410ozX {
        LIZIZ(str);
    }

    public static boolean LIZ(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127 || "()<>@,;:/[]?=\\\"".indexOf(cCharAt) >= 0) {
                return false;
            }
        }
        return true;
    }

    public final void LIZIZ(String str) throws C1494410ozX {
        int iIndexOf = str.indexOf(47);
        int iIndexOf2 = str.indexOf(59);
        if (iIndexOf < 0) {
            if (iIndexOf2 >= 0) {
                throw new C1494410ozX("Unable to find a sub type.");
            }
            throw new C1494410ozX("Unable to find a sub type.");
        }
        if (iIndexOf >= 0 && iIndexOf2 < 0) {
            String strTrim = str.substring(0, iIndexOf).trim();
            Locale locale = Locale.ENGLISH;
            this.LL = strTrim.toLowerCase(locale);
            this.LLILLJJLI = str.substring(iIndexOf + 1).trim().toLowerCase(locale);
            this.LLILLL = new C1494400ozW();
        } else if (iIndexOf < iIndexOf2) {
            String strTrim2 = str.substring(0, iIndexOf).trim();
            Locale locale2 = Locale.ENGLISH;
            this.LL = strTrim2.toLowerCase(locale2);
            this.LLILLJJLI = str.substring(iIndexOf + 1, iIndexOf2).trim().toLowerCase(locale2);
            this.LLILLL = new C1494400ozW(str.substring(iIndexOf2));
        } else {
            throw new C1494410ozX("Unable to find a sub type.");
        }
        if (LIZ(this.LL)) {
            if (LIZ(this.LLILLJJLI)) {
                return;
            } else {
                throw new C1494410ozX("Sub type is invalid.");
            }
        }
        throw new C1494410ozX("Primary type is invalid.");
    }

    public String getParameter(String str) {
        return (String) this.LLILLL.LIZ.get(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public boolean match(C1494390ozV c1494390ozV) {
        if (this.LL.equals(c1494390ozV.getPrimaryType())) {
            if (this.LLILLJJLI.equals("*") || c1494390ozV.getSubType().equals("*") || this.LLILLJJLI.equals(c1494390ozV.getSubType())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        try {
            LIZIZ(objectInput.readUTF());
        } catch (C1494410ozX e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IOException(e.toString());
        }
    }

    public void removeParameter(String str) {
        this.LLILLL.LIZ.remove(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public void setPrimaryType(String str) throws C1494410ozX {
        if (LIZ(this.LL)) {
            this.LL = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new C1494410ozX("Primary type is invalid.");
    }

    public void setSubType(String str) throws C1494410ozX {
        if (LIZ(this.LLILLJJLI)) {
            this.LLILLJJLI = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new C1494410ozX("Sub type is invalid.");
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(toString());
        objectOutput.flush();
    }

    public boolean match(String str) {
        return match(new C1494390ozV(str));
    }

    public C1494390ozV(String str, String str2) throws C1494410ozX {
        if (LIZ(str)) {
            Locale locale = Locale.ENGLISH;
            this.LL = str.toLowerCase(locale);
            if (LIZ(str2)) {
                this.LLILLJJLI = str2.toLowerCase(locale);
                this.LLILLL = new C1494400ozW();
                return;
            }
            throw new C1494410ozX("Sub type is invalid.");
        }
        throw new C1494410ozX("Primary type is invalid.");
    }

    public void setParameter(String str, String str2) {
        this.LLILLL.LIZ.put(str.trim().toLowerCase(Locale.ENGLISH), str2);
    }
}
