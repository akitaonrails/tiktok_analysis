package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1509310pNZ {
    public final int LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public Map<String, Object> LJ;
    public Map<String, Object> LJFF;
    public float[] LJI;
    public byte[] LJII;
    public Object LJIIIIZZ;
    public JSONObject LJIIIZ;

    public C1509310pNZ() {
        this(0);
    }

    public final Map<String, Object> LIZ() {
        Map<String, Object> map = this.LJFF;
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        this.LJFF = map2;
        return map2;
    }

    public final Map<String, Object> LIZIZ() {
        Map<String, Object> map = this.LJ;
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap(this.LIZ);
        this.LJ = map2;
        return map2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (this.LIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("runKey:");
            sbLIZ.append(this.LIZIZ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LIZJ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(", enterType:");
            sbLIZ2.append(this.LIZJ);
            sbLIZ2.append('}');
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (this.LJI != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(", inputFloatArray.size:");
            float[] fArr = this.LJI;
            sbLIZ3.append(fArr != null ? Integer.valueOf(fArr.length) : null);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (this.LJII != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(", inputByteArray.size:");
            byte[] bArr = this.LJII;
            sbLIZ4.append(bArr != null ? Integer.valueOf(bArr.length) : null);
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        }
        if (this.LJIIIIZZ != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(", inputExtObj:");
            Object obj = this.LJIIIIZZ;
            sbLIZ5.append(obj != null ? obj.getClass().getSimpleName() : null);
            sb.append(C2188811AlT.LIZIZ(sbLIZ5));
        }
        if (this.LJFF != null) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(", importantExtFeaturesMap:");
            Map<String, Object> map = this.LJFF;
            sbLIZ6.append(map != null ? map.size() : 0);
            sbLIZ6.append('-');
            sbLIZ6.append(this.LJFF);
            sb.append(C2188811AlT.LIZIZ(sbLIZ6));
        }
        if (this.LJ != null) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(", inputFeaturesMap:");
            Map<String, Object> map2 = this.LJ;
            sbLIZ7.append(map2 != null ? map2.size() : 0);
            sbLIZ7.append('-');
            sbLIZ7.append(this.LJ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ7));
        }
        sb.append("}");
        return sb.toString();
    }

    public C1509310pNZ(int i) {
        this.LIZ = 128;
    }
}
