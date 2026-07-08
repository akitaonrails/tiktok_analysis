package X;

import android.text.TextUtils;
import java.lang.reflect.Type;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jcV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287930jcV {
    public final Type LIZ;
    public final String LIZIZ;
    public int LIZJ = Integer.MIN_VALUE;

    public final String LIZ() {
        if (TextUtils.isEmpty(this.LIZIZ)) {
            return this.LIZ.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.toString());
        sbLIZ.append(e3.h);
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        if (this.LIZJ == Integer.MIN_VALUE) {
            int iHashCode = this.LIZ.hashCode();
            String str = this.LIZIZ;
            this.LIZJ = iHashCode ^ (str == null ? 0 : str.hashCode());
        }
        return this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServiceKey{");
        sbLIZ.append(String.valueOf(this.LIZ));
        sbLIZ.append(" ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1287930jcV)) {
            return false;
        }
        C1287930jcV c1287930jcV = (C1287930jcV) obj;
        Type type = c1287930jcV.LIZ;
        Type type2 = this.LIZ;
        if (type != type2 && (type == null || !type.equals(type2))) {
            return false;
        }
        String str = c1287930jcV.LIZIZ;
        String str2 = this.LIZIZ;
        if (str != str2 && (str == null || !str.equals(str2))) {
            return false;
        }
        return true;
    }

    public C1287930jcV(String str, Type type) {
        this.LIZ = type;
        this.LIZIZ = str;
    }
}
