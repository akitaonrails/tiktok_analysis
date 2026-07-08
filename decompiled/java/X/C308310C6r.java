package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0C6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308310C6r {
    public int LIZ;
    public Object LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public C308310C6r() {
    }

    public final boolean LIZ(Object obj) {
        if (obj != null) {
            try {
                switch (this.LIZJ) {
                    case 1:
                        this.LIZIZ = Integer.valueOf(CastIntegerProtector.parseInt(obj.toString()));
                        break;
                    case 2:
                        this.LIZIZ = Long.valueOf(CastLongProtector.parseLong(obj.toString()));
                        break;
                    case 3:
                        this.LIZIZ = Float.valueOf(CastFloatProtector.parseFloat(obj.toString()));
                        break;
                    case 4:
                        this.LIZIZ = obj.toString();
                        break;
                    case 5:
                        this.LIZIZ = new JSONObject((String) obj);
                        break;
                    case 6:
                        this.LIZIZ = new JSONArray((String) obj);
                        break;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (this.LIZIZ != null) {
            return true;
        }
        return false;
    }

    public C308310C6r(int i, int i2, int i3, Object obj) {
        this.LIZ = i;
        this.LIZIZ = obj;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
