package X;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: X.0KbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520610KbL implements Cloneable, Serializable {
    public static final long serialVersionUID = -6437800749411518984L;
    public final String LL;
    public final String LLILLJJLI;

    public int hashCode() {
        return Objects.hash(this.LL, this.LLILLJJLI);
    }

    public String toString() {
        if (this.LLILLJJLI == null) {
            return this.LL;
        }
        StringBuilder sb = new StringBuilder(this.LL.length() + 1 + this.LLILLJJLI.length());
        sb.append(this.LL);
        sb.append("=");
        sb.append(this.LLILLJJLI);
        return sb.toString();
    }

    public Object clone() {
        return super.clone();
    }

    public String getName() {
        return this.LL;
    }

    public String getValue() {
        return this.LLILLJJLI;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C520610KbL)) {
            return false;
        }
        C520610KbL c520610KbL = (C520610KbL) obj;
        if (this.LL.equals(c520610KbL.LL) && Objects.equals(this.LLILLJJLI, c520610KbL.LLILLJJLI)) {
            return true;
        }
        return false;
    }

    public C520610KbL(String str, String str2) {
        if (str != null) {
            this.LL = str;
            this.LLILLJJLI = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
