package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0cws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031480cws {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, Object> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GmtRewardADTrackEventModel(tag=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", label=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", refer=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extraData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1031480cws(String str, Map map, int i) {
        this("draw_ad", str, null, (i & 8) != 0 ? null : map);
    }

    public C1031480cws(String str, String str2, String str3, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = map;
    }
}
