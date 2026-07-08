package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import fyo.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VOU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VOU extends C0VOV {
    public ArrayList<String> LJIJJ;
    public String LJIJJLI;

    @Override // X.C0VOV
    public final boolean LIZ(e eVar) {
        return false;
    }

    public static C0VOU LJIIJ() {
        C0VOU c0vou = new C0VOU();
        super.LJIIIZ();
        c0vou.LJIJJ = null;
        c0vou.LJIJJLI = null;
        c0vou.LIZJ = "url_task";
        return c0vou;
    }

    @Override // X.C0VOV
    public final JSONObject LIZJ() {
        HashMap map = new HashMap();
        C0VOV.LJFF("base_json", map, LIZLLL());
        C0VOV.LJ("key", this.LJIJJLI, map);
        ArrayList<String> arrayList = this.LJIJJ;
        if (arrayList != null && !arrayList.isEmpty()) {
            map.put("urls", arrayList);
        }
        return new JSONObject(map);
    }

    @Override // X.C0VOV
    public final void LJII() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[downloader] did call resume, key = ");
        sbLIZ.append(this.LJIIIIZZ.toString());
        TTVideoEngineLog.d("TTVideoEngine.DownloadURLTask", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIJJI) {
            TTVideoEngineLog.d("TTVideoEngine.DownloadURLTask", "[downloader] task did canceled");
            return;
        }
        if (this.LJFF == 2) {
            TTVideoEngineLog.d("TTVideoEngine.DownloadURLTask", "[downloader] state is running");
            return;
        }
        super.LJII();
        C0VOT c0vot = this.LJIILJJIL;
        if (c0vot != null && !c0vot.LIZLLL(this)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[downloader] not should resume task = ");
            sbLIZ2.append(toString());
            C1471660oOq.LIZJ("TTVideoEngine.DownloadURLTask", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        HashMap<String, List<String>> map = new HashMap<>();
        this.LJIIIZ = map;
        map.put(this.LJIJJLI, this.LJIJJ);
        LJIIIIZZ(2);
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        String str = this.LJIJJLI;
        String str2 = this.LJIIL;
        ArrayList<String> arrayList = this.LJIJJ;
        String strLJJIFFI = dataLoaderHelper.LJJIFFI(str, str2, (String[]) arrayList.toArray(new String[arrayList.size()]), this.LJIJ.version, this.LJIJI);
        C1476290oWJ.LIZ((String) ListProtector.get(this.LJIJJ, 0));
        if (!dataLoaderHelper.LJJJJZI(strLJJIFFI)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("resume download fail. url = ");
            sbLIZ3.append(strLJJIFFI);
            sbLIZ3.append(" dataload state is ");
            sbLIZ3.append(dataLoaderHelper.LJJJ());
            LJI(new e("kTTVideoErrorDomainDownload", -9996, 0, C2188811AlT.LIZIZ(sbLIZ3)));
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("[downloader] resume a task. key = ");
        sbLIZ4.append(this.LJIJJLI);
        sbLIZ4.append(" downloader url is ");
        sbLIZ4.append(strLJJIFFI);
        C1471660oOq.LIZJ("TTVideoEngine.DownloadURLTask", C2188811AlT.LIZIZ(sbLIZ4));
        C0VOT c0vot2 = this.LJIILJJIL;
        if (c0vot2 != null) {
            c0vot2.LIZJ(this);
        }
    }

    @Override // X.C0VOV
    public final void LIZIZ(JSONObject jSONObject) {
        super.LIZIZ(jSONObject.optJSONObject("base_json"));
        this.LJIJJLI = jSONObject.optString("key");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("urls");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(strOptString);
                }
            }
            this.LJIJJ = arrayList;
            if (!arrayList.isEmpty()) {
                C1476290oWJ.LIZ((String) ListProtector.get(arrayList, 0));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (super.equals(obj)) {
            return true;
        }
        if (!obj.getClass().equals(C0VOU.class)) {
            return false;
        }
        return ((C0VOU) obj).LJIJJLI.equals(this.LJIJJLI);
    }
}
