package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0HaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443450HaB {
    public final Integer LIZ;
    public final Integer LIZIZ;

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Colors(lightColor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", darkColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer LIZ(Context context) {
        if (context != null && C467860IWi.LIZ(context)) {
            return this.LIZIZ;
        }
        return this.LIZ;
    }

    public C443450HaB(Integer num, Integer num2) {
        this.LIZ = num;
        this.LIZIZ = num2;
    }
}
