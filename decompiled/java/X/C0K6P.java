package X;

import android.content.Context;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K6P, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K6P {
    public static final /* synthetic */ int LJI = 0;
    public final Context LIZ;
    public final String LIZIZ;
    public final Uri LIZJ;
    public final Map<String, String> LIZLLL;
    public final Map<String, String> LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K6P)) {
            return false;
        }
        C0K6P c0k6p = (C0K6P) obj;
        return Intrinsics.LJFF(this.LIZ, c0k6p.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0k6p.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0k6p.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0k6p.LIZLLL) && Intrinsics.LJFF(this.LJ, c0k6p.LJ) && Intrinsics.LJFF(this.LJFF, c0k6p.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcSchemaInterceptRequest(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", originalUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", queryParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", normalizedEnterFrom=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K6P(Context context, String str, Uri uri, Map<String, String> map, Map<String, String> map2, String str2) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = uri;
        this.LIZLLL = map;
        this.LJ = map2;
        this.LJFF = str2;
    }
}
