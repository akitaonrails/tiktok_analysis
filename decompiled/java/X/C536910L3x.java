package X;

import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0L3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536910L3x {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, int i2, String str, String str2, boolean z) {
        int i3;
        String str3;
        String str4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keyname:");
        sbLIZ.append(str);
        sbLIZ.append(", code:");
        sbLIZ.append(i);
        sbLIZ.append(", cost time:");
        sbLIZ.append(i2);
        sbLIZ.append(", msg:");
        sbLIZ.append(str2);
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("error_code", Integer.valueOf(i));
        c543670LTx.LIZ.put("cost_time", String.valueOf(i2));
        CutsameDataItem cutsameDataItemLIZIZ = C536810L3n.LIZIZ();
        String str5 = null;
        if (cutsameDataItemLIZIZ != null) {
            str3 = cutsameDataItemLIZIZ.templateId;
        } else {
            str3 = null;
        }
        c543670LTx.LIZ.put("template_id", String.valueOf(str3));
        CutsameDataItem cutsameDataItemLIZIZ2 = C536810L3n.LIZIZ();
        if (cutsameDataItemLIZIZ2 == null || (str4 = cutsameDataItemLIZIZ2.templateUrl) == null) {
            str4 = "";
        }
        c543670LTx.LIZ.put("template_url", str4);
        CutsameDataItem cutsameDataItemLIZIZ3 = C536810L3n.LIZIZ();
        if (cutsameDataItemLIZIZ3 != null) {
            str5 = cutsameDataItemLIZIZ3.md5;
        }
        c543670LTx.LIZ.put("template_md5", str5);
        if (str2 == null) {
            str2 = "";
        }
        c543670LTx.LIZ.put("error_msg", str2);
        JSONObject jSONObjectLJ = c543670LTx.LJ();
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI(str, i3, jSONObjectLJ);
    }
}
