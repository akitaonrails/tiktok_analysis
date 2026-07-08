package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0DvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354570DvD {
    public final boolean LIZ;
    public final EnumC355970DxT LIZIZ;
    public final Map<String, String> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MagicResponse(isSuccess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", magicErrorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C354570DvD(boolean z, EnumC355970DxT enumC355970DxT, Map<String, String> map) {
        this.LIZ = z;
        this.LIZIZ = enumC355970DxT;
        this.LIZJ = map;
    }

    public /* synthetic */ C354570DvD(boolean z, EnumC355970DxT enumC355970DxT, Map map, int i) {
        this(z, (i & 2) != 0 ? null : enumC355970DxT, (i & 4) != 0 ? new LinkedHashMap() : map);
    }
}
