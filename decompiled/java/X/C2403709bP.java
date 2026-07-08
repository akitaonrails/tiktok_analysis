package X;

import android.text.TextUtils;
import com.bytedance.apm.net.DefaultTTNetImpl;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: X.09bP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2403709bP {
    public static String LIZ = "https://mon.zijieapi.com/monitor/collect/c/cloudcontrol/file";
    public static final Map<String, String> LIZIZ = new HashMap();

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cloudMessage");
        sbLIZ.append(UUID.randomUUID().toString());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static InterfaceC2403509bN LIZ(String str) {
        HashMap map;
        IHttpService defaultTTNetImpl = (IHttpService) C792600V7i.LIZ(IHttpService.class);
        if (defaultTTNetImpl == null) {
            defaultTTNetImpl = new DefaultTTNetImpl();
        }
        Map<String, String> map2 = LIZIZ;
        if (map2 != null && !((HashMap) map2).isEmpty()) {
            map = new HashMap();
            if (!((HashMap) map2).isEmpty()) {
                map.putAll(map2);
            }
        } else {
            map = null;
        }
        return defaultTTNetImpl.buildMultipartUpload(str, "UTF-8", false, map);
    }

    public static void LIZJ(InterfaceC2403509bN interfaceC2403509bN, HashMap<String, String> map) {
        if (C0VDB.LIZIZ().LIZLLL != null && C0VDB.LIZIZ().LIZLLL.size() != 0) {
            String strLIZIZ = C118000cc.LIZIZ(C0VDB.LIZIZ().LIZLLL);
            HashMap map2 = new HashMap();
            map2.put("filetype", "command_commonparams");
            interfaceC2403509bN.LIZIZ("fileCommon", strLIZIZ, map2);
        }
        if (map != null && map.size() != 0) {
            String strLIZIZ2 = C118000cc.LIZIZ(map);
            HashMap map3 = new HashMap();
            map3.put("filetype", "command_specificparams");
            interfaceC2403509bN.LIZIZ("fileSpecific", strLIZIZ2, map3);
        }
    }

    public static boolean LIZIZ(String str, File file, int i, String str2, String str3, String str4, long j, HashMap map) {
        if (!TextUtils.isEmpty(str) && file.exists()) {
            try {
                InterfaceC2403509bN interfaceC2403509bNLIZ = LIZ(str);
                interfaceC2403509bNLIZ.LIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
                if (str3 == null) {
                    str3 = "";
                }
                interfaceC2403509bNLIZ.LIZ("cid", str3);
                if (str4 == null) {
                    str4 = "";
                }
                interfaceC2403509bNLIZ.LIZ("err_msg", str4);
                interfaceC2403509bNLIZ.LIZ("operate_time", String.valueOf(j));
                C0VDB.LIZIZ();
                interfaceC2403509bNLIZ.LIZ("aid", "");
                C0VDB.LIZIZ();
                interfaceC2403509bNLIZ.LIZ("update_version_code", "");
                C0VDB.LIZIZ();
                interfaceC2403509bNLIZ.LIZ("uid", "");
                if (i == 2 || i == 3 || (i == 0 && map != null && !map.isEmpty())) {
                    LIZJ(interfaceC2403509bNLIZ, map);
                }
                HashMap map2 = new HashMap();
                if (!TextUtils.isEmpty(str2)) {
                    map2.put("filetype", str2);
                }
                interfaceC2403509bNLIZ.LIZJ(file, "file", map2);
                C2403609bO c2403609bOFinish = interfaceC2403509bNLIZ.finish();
                if (c2403609bOFinish == null) {
                    return false;
                }
                if (c2403609bOFinish.LIZ != 200) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        throw new IllegalArgumentException("url and file not be null ");
    }
}
