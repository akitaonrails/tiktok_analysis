package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0E4S, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E4S {
    public final String LIZ;
    public final NLEResType LIZIZ;
    public long LIZJ;
    public final float LIZLLL;
    public long LJ;
    public long LJFF;
    public String LJI;
    public final Map<String, Object> LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateSegment(path=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", speed=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", start=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", end=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", slotId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0E4S(String str, NLEResType nLEResType, long j, float f, long j2, long j3, String str2, Map<String, Object> map) {
        this.LIZ = str;
        this.LIZIZ = nLEResType;
        this.LIZJ = j;
        this.LIZLLL = f;
        this.LJ = j2;
        this.LJFF = j3;
        this.LJI = str2;
        this.LJII = map;
    }

    public /* synthetic */ C0E4S(String str, NLEResType nLEResType, long j, float f, long j2, long j3, String str2, Map map, int i) {
        this(str, nLEResType, j, f, j2, j3, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? new LinkedHashMap() : map);
    }
}
