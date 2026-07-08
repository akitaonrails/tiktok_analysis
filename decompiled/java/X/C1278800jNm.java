package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.params.NodeOptParams;
import com.ss.pusher.core.params.PushStreamData;
import com.ss.pusher.core.params.SwitchParams;
import com.ss.pusher.core.utils.AVLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278800jNm {
    public int LIZ;
    public final NodeOptParams LIZIZ;
    public final C1278910jNx LIZJ;
    public final SwitchParams LIZLLL;
    public final boolean LJ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final HashMap<String, String> LJFF = new HashMap<>();
    public final HashMap<String, List<String>> LJI = new HashMap<>();
    public boolean LJII = false;
    public JSONObject LJIIIIZZ = null;
    public int LJIIIZ = 0;
    public String LJIIL = "";

    public final synchronized void LIZ() {
        this.LJFF.clear();
        this.LJI.clear();
        this.LJII = true;
        this.LJIIIZ = 0;
        this.LJIIJJI = false;
        this.LJIIL = "";
    }

    public final String[] LIZIZ(String str) {
        NodeOptParams nodeOptParams = this.LIZIZ;
        String[] strArr = new String[2];
        String strLIZIZ = C1278890jNv.LIZIZ(str);
        String strLIZJ = null;
        if (nodeOptParams != null && nodeOptParams.preparedIp) {
            AVLog.ioi("VeLiveNodeOptimize", "execute alternative node optimization");
            List<String> list = this.LJI.get(str);
            if (list != null && this.LJIIIZ < list.size()) {
                int i = this.LJIIIZ;
                this.LJIIIZ = i + 1;
                strLIZJ = (String) ListProtector.get(list, i);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("get backup ip: ");
                sbLIZ.append(strLIZJ);
                sbLIZ.append(" ipList:");
                sbLIZ.append(this.LJI.get(str));
                sbLIZ.append(" NodeIndex:");
                sbLIZ.append(this.LJIIIZ);
                AVLog.ioi("VeLiveNodeOptimize", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                this.LJIIIZ = 0;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("original List already done, new ipList is: ");
                sbLIZ2.append(this.LJI.get(str));
                sbLIZ2.append(" NodeIndex:");
                sbLIZ2.append(this.LJIIIZ);
                AVLog.logKibana(5, "VeLiveNodeOptimize", C2188811AlT.LIZIZ(sbLIZ2), null);
            }
        }
        if (!TextUtils.isEmpty(strLIZJ)) {
            if (C1278890jNv.LIZLLL(strLIZJ)) {
                strLIZJ = C1278890jNv.LIZJ(strLIZJ);
            }
            try {
                strArr[0] = str.replaceFirst(strLIZIZ, strLIZJ);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("bindNodeUrl: ");
                sbLIZ3.append(strArr[0]);
                AVLog.ioi("VeLiveNodeOptimize", C2188811AlT.LIZIZ(sbLIZ3));
                if (this.LJ) {
                    strArr[1] = this.LJIIL;
                    return strArr;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return strArr;
    }

    public final String LIZJ(String str) {
        List<PushStreamData.NodeInfo> value;
        this.LIZ = 0;
        PushStreamData pushStreamData = this.LIZJ.LIZJ.LJII;
        if (!pushStreamData.nodeInfoMap.isEmpty()) {
            this.LIZ |= 1;
        }
        if (!TextUtils.isEmpty(str) && this.LJIIJ && this.LJIIJJI && this.LJFF.containsKey(str)) {
            String str2 = this.LJFF.get(str);
            if (!TextUtils.isEmpty(str2) && !"INVALID_OPT_URL".equals(str2)) {
                this.LIZ |= 4;
                return str2;
            }
        }
        this.LIZLLL.getClass();
        Iterator<Map.Entry<String, List<PushStreamData.NodeInfo>>> it2 = pushStreamData.nodeInfoMap.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, List<PushStreamData.NodeInfo>> next = it2.next();
            if (str.contains(next.getKey()) && (value = next.getValue()) != null && !value.isEmpty()) {
                String str3 = ((PushStreamData.NodeInfo) ListProtector.get(value, 0)).ip;
                this.LIZ |= 2;
                String strLIZIZ = C1278890jNv.LIZIZ(str);
                if (strLIZIZ != null && !strLIZIZ.isEmpty()) {
                    try {
                        String strReplaceFirst = str.replaceFirst(strLIZIZ, str3);
                        this.LJIIL = "http-dns";
                        return strReplaceFirst;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return str;
                    }
                }
            }
        }
    }

    public C1278800jNm(LiveSdkSetting liveSdkSetting, C1278910jNx c1278910jNx) {
        this.LIZJ = c1278910jNx;
        c1278910jNx.getClass();
        c1278910jNx.LJIILIIL = new WeakReference<>(this);
        this.LIZLLL = liveSdkSetting.switchParams;
        NodeOptParams nodeOptParams = liveSdkSetting.nodeOpt;
        this.LIZIZ = nodeOptParams;
        boolean z = nodeOptParams.strategyNodeOpt;
        this.LJ = z;
        this.LJIIJ = z;
    }
}
