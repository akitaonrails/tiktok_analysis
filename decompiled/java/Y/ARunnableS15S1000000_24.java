package Y;

import X.C105700ad;
import X.C1576780r8O;
import X.C1576980r8i;
import X.C1604250rqh;
import X.C1C7U;
import X.C913020Zro;
import X.C913060Zrs;
import com.google.gson.reflect.TypeToken;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS15S1000000_24 implements Runnable {
    public final int $t;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1576980r8i c1576980r8i = C1576780r8O.LIZIZ;
        C1576780r8O.LIZ.getClass();
        String strLIZ = C1576980r8i.LIZ(c1576980r8i, C1576780r8O.LIZ());
        if (strLIZ != null) {
            String str = this.s0;
            List arrayList = (List) C105700ad.LIZ(strLIZ, new TypeToken<List<String>>() { // from class: X.0r8Q
            }.getType());
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(str);
            ((ArrayList) C1576780r8O.LIZLLL).add(str);
            String strLIZ2 = C1576780r8O.LIZ();
            String strLIZIZ = C105700ad.LIZIZ(arrayList);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            c1576980r8i.LIZIZ(strLIZ2, strLIZIZ);
        }
    }

    public final void LIZ$1() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", this.s0);
        jSONObject.put("outreach_key", "popup_cleandrafts");
        jSONObject.put("outreach_intention", "guide_cleandrafts");
        jSONObject.put("outreach_click_type", "click_managedrafts_button");
        jSONObject.put("outreach_type", "popup");
        AppLogNewUtils.onEventV3("guide_user_m2_click", jSONObject);
    }

    public final void LIZ$2() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", this.s0);
        jSONObject.put("outreach_key", "popup_cleandrafts");
        jSONObject.put("outreach_intention", "guide_cleandrafts");
        jSONObject.put("outreach_click_type", "click_skip_button");
        jSONObject.put("outreach_type", "popup");
        AppLogNewUtils.onEventV3("guide_user_m2_click", jSONObject);
    }

    public static final void run$0(ARunnableS15S1000000_24 aRunnableS15S1000000_24) {
        boolean zLIZ;
        C1C7U.LIZ("MiniDramaTabUnConsumeCache@a8c8.saveConsumeVid$1");
        try {
            aRunnableS15S1000000_24.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniDramaTabUnConsumeCache@a8c8.saveConsumeVid$1");
    }

    public static final void run$1(ARunnableS15S1000000_24 aRunnableS15S1000000_24) {
        boolean zLIZ;
        C1C7U.LIZ("PluginMock$MockHelper@c19.doWork$1$1");
        try {
            C1604250rqh c1604250rqh = C1604250rqh.LIZ;
            String str = aRunnableS15S1000000_24.s0;
            c1604250rqh.getClass();
            C1604250rqh.LIZ(str, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PluginMock$MockHelper@c19.doWork$1$1");
    }

    public static final void run$2(ARunnableS15S1000000_24 aRunnableS15S1000000_24) {
        boolean zLIZ;
        C1C7U.LIZ("M2StorageCleanImpl@70f0.downloadM2WithStorageClean$1$1$1");
        try {
            aRunnableS15S1000000_24.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("M2StorageCleanImpl@70f0.downloadM2WithStorageClean$1$1$1");
    }

    public static final void run$3(ARunnableS15S1000000_24 aRunnableS15S1000000_24) {
        boolean zLIZ;
        C1C7U.LIZ("M2StorageCleanImpl@70f0.downloadM2WithStorageClean$1$2$1");
        try {
            aRunnableS15S1000000_24.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("M2StorageCleanImpl@70f0.downloadM2WithStorageClean$1$2$1");
    }

    public static final void run$4(ARunnableS15S1000000_24 aRunnableS15S1000000_24) {
        C913020Zro c913020Zro;
        String str = aRunnableS15S1000000_24.s0;
        String str2 = DetailActivity._pnsPageId;
        C1C7U.LIZ("DetailActivity@87eb.monitorDetailFirstFrameCost$1L");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str != null && (c913020Zro = C913060Zrs.LIZ) != null && Intrinsics.LJFF(c913020Zro.LIZ, str) && c913020Zro.LJIJ <= 0) {
            c913020Zro.LJIJ = jCurrentTimeMillis;
        }
        C1C7U.LIZIZ("DetailActivity@87eb.monitorDetailFirstFrameCost$1L");
    }

    public ARunnableS15S1000000_24(String str, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                this.s0 = str;
                break;
            default:
                this.s0 = str;
                break;
        }
    }
}
