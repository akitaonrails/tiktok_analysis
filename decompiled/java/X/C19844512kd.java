package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.12kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19844512kd extends AbstractC19844412kc {
    public final String LL;

    public C19844512kd(String str) {
        this.LL = str;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{3, this.LL});
    }

    @Override // X.AbstractC19844412kc
    public final int zza() {
        return 3;
    }

    public final String toString() {
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\"");
        sbLIZ.append(str);
        sbLIZ.append("\"");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC19844412kc abstractC19844412kc = (AbstractC19844412kc) obj;
        if (3 != abstractC19844412kc.zza()) {
            return 3 - abstractC19844412kc.zza();
        }
        String str = this.LL;
        int length = str.length();
        String str2 = ((C19844512kd) abstractC19844412kc).LL;
        if (length != str2.length()) {
            return str.length() - str2.length();
        }
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19844512kd.class != obj.getClass()) {
            return false;
        }
        return this.LL.equals(((C19844512kd) obj).LL);
    }
}
