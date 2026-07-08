package X;

import Y.ARunnableS24S1200000_20;
import android.graphics.Rect;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kNY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317100kNY {
    public final AbstractC1317090kNX LIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJIIIZ;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public final Map<String, String> LIZIZ = new LinkedHashMap();
    public final long LIZJ = System.currentTimeMillis();
    public int LJII = -1;
    public JSONObject LJIIIIZZ = new JSONObject();
    public String LJIIJ = "";
    public String LJIIJJI = "";
    public int LJIILLIIL = -1;
    public int LJIIZILJ = -1;
    public int LJIJ = -1;
    public String LJIJI = "unknown";
    public final Map<Integer, C1317180kNg> LJIJJ = new LinkedHashMap();

    public C1317100kNY(AbstractC1317090kNX abstractC1317090kNX) {
        this.LIZ = abstractC1317090kNX;
    }

    public final void LIZ(int i, int i2) {
        AbstractC1313520kHm abstractC1313520kHm;
        int i3;
        SDUIBaseUI sDUIBaseUILIZ = this.LIZ.LIZ(i2);
        if (sDUIBaseUILIZ instanceof AbstractC1313520kHm) {
            abstractC1313520kHm = (AbstractC1313520kHm) sDUIBaseUILIZ;
        } else {
            abstractC1313520kHm = null;
        }
        if (abstractC1313520kHm == null) {
            i3 = 0;
        } else {
            T t = abstractC1313520kHm.LLLLLILLIL;
            if (t == 0) {
                i3 = -1;
            } else if (t.getVisibility() != 0) {
                i3 = -2;
            } else if (t.getWidth() != 0 && t.getHeight() != 0) {
                if (!t.getGlobalVisibleRect(new Rect())) {
                    i3 = -4;
                } else {
                    i3 = 1;
                }
            } else {
                i3 = -3;
            }
        }
        C1317180kNg c1317180kNg = (C1317180kNg) ((LinkedHashMap) this.LJIJJ).get(Integer.valueOf(i2));
        if (c1317180kNg != null) {
            c1317180kNg.LJFF = System.currentTimeMillis() - this.LIZJ;
            c1317180kNg.LIZ = i2;
            c1317180kNg.LJII = i3;
        }
        LIZIZ(i, i3, "show_item");
        if (this.LJII == -1) {
            LIZIZ(-1, -1, "show_first_item");
        }
        if (i > this.LJII) {
            this.LJII = i;
            this.LIZIZ.put("last_show_item", String.valueOf(i));
        }
    }

    public final void LIZIZ(int i, int i2, String str) {
        this.LJIJI = str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", str);
        jSONObject.put("cost", String.valueOf(System.currentTimeMillis() - this.LIZJ));
        jSONObject.put("logId", this.LJIIJ);
        jSONObject.put("reqUUID", this.LJIIJJI);
        jSONObject.put("index", i);
        jSONObject.put("from", "client");
        jSONObject.put("visibility", i2);
        C1317440kO6.LIZLLL.LIZ(new ARunnableS24S1200000_20(this, jSONObject, 6));
        this.LIZIZ.put(str, String.valueOf(System.currentTimeMillis() - this.LIZJ));
    }
}
