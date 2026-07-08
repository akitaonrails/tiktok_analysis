package X;

import android.graphics.Rect;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jW3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283930jW3 {
    public static final String LJI(int i) {
        return i != 0 ? i != 4 ? "Cross" : " Multi" : "Union";
    }

    public static final C1283980jW8 LIZ(C1283980jW8 c1283980jW8) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        if (!Double.isNaN(c1283980jW8.LIZ) && !Double.isNaN(c1283980jW8.LIZIZ) && !Double.isNaN(c1283980jW8.LIZJ) && !Double.isNaN(c1283980jW8.LIZLLL) && !Double.isNaN(c1283980jW8.LJ)) {
            return c1283980jW8;
        }
        if (Double.isNaN(c1283980jW8.LIZ)) {
            d = 0.0d;
        } else {
            d = c1283980jW8.LIZ;
        }
        if (Double.isNaN(c1283980jW8.LIZIZ)) {
            d2 = 0.0d;
        } else {
            d2 = c1283980jW8.LIZIZ;
        }
        if (Double.isNaN(c1283980jW8.LIZJ)) {
            d3 = 0.0d;
        } else {
            d3 = c1283980jW8.LIZJ;
        }
        if (Double.isNaN(c1283980jW8.LIZLLL)) {
            d4 = 0.0d;
        } else {
            d4 = c1283980jW8.LIZLLL;
        }
        if (Double.isNaN(c1283980jW8.LJ)) {
            d5 = 0.0d;
        } else {
            d5 = c1283980jW8.LJ;
        }
        return new C1283980jW8(d, d2, d3, d4, d5);
    }

    public static final long LIZIZ(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0L;
    }

    public static final boolean LIZJ(Rect rect) {
        if (rect != null && rect.width() > 0 && rect.height() > 0) {
            return true;
        }
        return false;
    }

    public static final int LIZLLL(double d) {
        return new BigDecimal(d).setScale(0, RoundingMode.HALF_EVEN).intValue();
    }

    public static final JSONArray LJFF(List<? extends C1276580jKC> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1276580jKC c1276580jKC : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("interact_id", c1276580jKC.LIZIZ);
            jSONObject.put("stream_id", c1276580jKC.LJIIZILJ);
            LJ(c1276580jKC.LJ, "x", jSONObject);
            LJ(c1276580jKC.LJFF, "y", jSONObject);
            LJ(c1276580jKC.LJI, "w", jSONObject);
            LJ(c1276580jKC.LJII, "h", jSONObject);
            jSONObject.put("z", c1276580jKC.LJIILIIL);
            jSONObject.put("audio_muted", c1276580jKC.LJIIJJI);
            jSONObject.put("video_muted", c1276580jKC.LJIIL);
            jSONObject.put("win_id", c1276580jKC.LIZLLL);
            arrayList.add(jSONObject);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next());
        }
        return jSONArray;
    }

    public static final void LJ(double d, String str, JSONObject jSONObject) throws JSONException {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            jSONObject.put(str, d);
        } else {
            jSONObject.put(str, "NaN");
        }
    }
}
