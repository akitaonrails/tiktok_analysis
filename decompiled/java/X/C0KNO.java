package X;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KNO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KNO {
    public final Context LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final Exception LJFF;
    public final Map<String, String> LJI;
    public final C0KOK LJII;
    public final String LJIIIIZZ;
    public String LJIIIZ;
    public C0KFM LJIIJ;
    public int LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KNO)) {
            return false;
        }
        C0KNO c0kno = (C0KNO) obj;
        return Intrinsics.LJFF(this.LIZ, c0kno.LIZ) && this.LIZIZ == c0kno.LIZIZ && this.LIZJ == c0kno.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0kno.LIZLLL) && Intrinsics.LJFF(this.LJ, c0kno.LJ) && Intrinsics.LJFF(this.LJFF, c0kno.LJFF) && Intrinsics.LJFF(this.LJI, c0kno.LJI) && Intrinsics.LJFF(this.LJII, c0kno.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0kno.LJIIIIZZ);
    }

    public final int hashCode() {
        Context context = this.LIZ;
        int iHashCode = (((((context == null ? 0 : context.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        Integer num = this.LIZLLL;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LJ.hashCode()) * 31;
        Exception exc = this.LJFF;
        int iHashCode3 = (iHashCode2 + (exc == null ? 0 : exc.hashCode())) * 31;
        Map<String, String> map = this.LJI;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        C0KOK c0kok = this.LJII;
        return ((iHashCode4 + (c0kok != null ? c0kok.hashCode() : 0)) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscriptionExceptionConfig(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", iapStatusCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", failedReason=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", logMap=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", handlerCallback=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KNO(Context context, int i, int i2, Integer num, String str, Exception exc, Map<String, String> map, C0KOK c0kok, String str2) {
        this.LIZ = context;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = num;
        this.LJ = str;
        this.LJFF = exc;
        this.LJI = map;
        this.LJII = c0kok;
        this.LJIIIIZZ = str2;
    }
}
