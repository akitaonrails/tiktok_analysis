package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AFH, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AFH {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public C1AFH(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("left_bottom");
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("left_top");
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("right_bottom");
                JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("right_top");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray4 != null) {
                    int i = JSONArrayProtectorUtils.getInt(jSONArrayOptJSONArray, 0);
                    int i2 = JSONArrayProtectorUtils.getInt(jSONArrayOptJSONArray, 1);
                    this.LIZ = i2;
                    int i3 = JSONArrayProtectorUtils.getInt(jSONArrayOptJSONArray2, 0);
                    this.LIZIZ = i3;
                    int i4 = JSONArrayProtectorUtils.getInt(jSONArrayOptJSONArray2, 1);
                    this.LIZJ = i4;
                    int i5 = JSONArrayProtectorUtils.getInt(jSONArrayOptJSONArray3, 0);
                    int i6 = JSONArrayProtectorUtils.getInt(jSONArrayOptJSONArray3, 1);
                    this.LIZLLL = i6;
                    int i7 = JSONArrayProtectorUtils.getInt(jSONArrayOptJSONArray4, 0);
                    this.LJ = i7;
                    int i8 = JSONArrayProtectorUtils.getInt(jSONArrayOptJSONArray4, 1);
                    this.LJFF = i8;
                    if (i3 > i5 && i4 < i6 && i < i7 && i2 < i8) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("card number is heading right, adjust it: \n[");
                        sbLIZ.append(i);
                        sbLIZ.append(" , ");
                        sbLIZ.append(i2);
                        sbLIZ.append(" ] [");
                        sbLIZ.append(i3);
                        sbLIZ.append(" , ");
                        sbLIZ.append(i4);
                        sbLIZ.append(" ]\n [");
                        sbLIZ.append(i5);
                        sbLIZ.append(" , ");
                        sbLIZ.append(i6);
                        sbLIZ.append(" ] [");
                        sbLIZ.append(i7);
                        sbLIZ.append(" , ");
                        sbLIZ.append(i8);
                        sbLIZ.append(" ]");
                        C2188811AlT.LIZIZ(sbLIZ);
                        this.LIZIZ = i;
                        this.LIZJ = i2;
                        this.LJ = i3;
                        this.LJFF = i4;
                        this.LIZ = i6;
                        this.LIZLLL = i8;
                        this.LJII = true;
                        this.LJI = true;
                        return;
                    }
                    if (i3 < i5 && i4 > i6 && i > i7 && i2 > i8) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("card number is heading left, adjust it: \n[");
                        sbLIZ2.append(i7);
                        sbLIZ2.append(" , ");
                        sbLIZ2.append(i8);
                        sbLIZ2.append(" ] [");
                        sbLIZ2.append(i5);
                        sbLIZ2.append(" , ");
                        sbLIZ2.append(i6);
                        sbLIZ2.append(" ]\n [");
                        sbLIZ2.append(i3);
                        sbLIZ2.append(" , ");
                        sbLIZ2.append(i4);
                        sbLIZ2.append(" ] [");
                        sbLIZ2.append(i);
                        sbLIZ2.append(" , ");
                        sbLIZ2.append(i2);
                        sbLIZ2.append(" ]");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        this.LIZIZ = i7;
                        this.LIZJ = i8;
                        this.LJ = i5;
                        this.LJFF = i6;
                        this.LIZ = i4;
                        this.LIZLLL = i2;
                        this.LJIIIIZZ = true;
                        this.LJI = true;
                        return;
                    }
                    if (i3 > i5 && i4 > i6) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("card number has be reverted , adjust it: \n[");
                        sbLIZ3.append(i5);
                        sbLIZ3.append(" , ");
                        sbLIZ3.append(i6);
                        sbLIZ3.append(" ] [");
                        sbLIZ3.append(i);
                        sbLIZ3.append(" , ");
                        sbLIZ3.append(i2);
                        sbLIZ3.append(" ]\n [");
                        sbLIZ3.append(i7);
                        sbLIZ3.append(" , ");
                        sbLIZ3.append(i8);
                        sbLIZ3.append(" ] [");
                        sbLIZ3.append(i3);
                        sbLIZ3.append(" , ");
                        sbLIZ3.append(i4);
                        sbLIZ3.append(" ]");
                        C2188811AlT.LIZIZ(sbLIZ3);
                        this.LIZIZ = i5;
                        this.LIZJ = i6;
                        this.LJ = i;
                        this.LJFF = i2;
                        this.LIZ = i8;
                        this.LIZLLL = i4;
                    }
                    if (this.LJ - this.LIZIZ < this.LIZ - this.LIZJ) {
                        this.LJII = true;
                    }
                    this.LJI = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
