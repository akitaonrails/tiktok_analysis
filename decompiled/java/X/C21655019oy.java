package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21655019oy {
    public static final List<EnumC21646419na> LJ = Arrays.asList(EnumC21646419na.COLLECTED, EnumC21646419na.PROCESS_END, EnumC21646419na.DB_SAVE_END, EnumC21646419na.PACK_INSERT_END, EnumC21646419na.POST_ISOLATE, EnumC21646419na.POST_FAILED, EnumC21646419na.POST_START, EnumC21646419na.REPORT_END);
    public final C21655119oz LIZ;
    public EnumC21646419na LIZIZ;
    public boolean LIZJ;
    public final JSONObject LIZLLL = new JSONObject();

    public final String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("v4|");
        sbLIZ.append(TextUtils.isEmpty(this.LIZ.LJ) ? "" : this.LIZ.LJ);
        sbLIZ.append("|");
        sbLIZ.append(this.LIZ.LJFF);
        sbLIZ.append("|");
        sbLIZ.append(this.LIZIZ.name());
        sbLIZ.append("|");
        sbLIZ.append(this.LIZ.LIZ);
        sbLIZ.append("|");
        sbLIZ.append(this.LIZ.LIZJ);
        sbLIZ.append("|");
        sbLIZ.append(this.LIZ.LIZLLL.name());
        sbLIZ.append("|");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                if (!this.LIZLLL.has(next)) {
                    this.LIZLLL.put(next, jSONObject.get(next));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public C21655019oy(EnumC21646419na enumC21646419na, C21655119oz c21655119oz) {
        this.LIZIZ = enumC21646419na;
        this.LIZ = c21655119oz;
    }
}
