package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import jv6.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838680WvC {
    public static boolean LIZJ;
    public static final C790210UzD LIZLLL = new HashMap<String, String>() { // from class: X.0UzD
        {
            put(FollowStatusChangeMethod.PARAM_UID, "in");
            put("he", "iw");
            put("yi", "ji");
        }
    };
    public static volatile C838680WvC LJ;
    public final ConcurrentHashMap<String, C19375410rA> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();

    public static C838680WvC LIZ() {
        if (LJ == null) {
            synchronized (C838680WvC.class) {
                try {
                    if (LJ == null) {
                        LJ = new C838680WvC();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public final void LIZIZ(Context context, String str) {
        String strLIZIZ;
        C19375410rA c19375410rALIZJ;
        if (str.equals("en")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bddigit_default");
            String str2 = File.separator;
            sbLIZ.append(str2);
            sbLIZ.append("bddigit");
            sbLIZ.append(str2);
            sbLIZ.append("en.json");
            JSONObject jSONObjectLIZ = C08EK.LIZ(context, C2188811AlT.LIZIZ(sbLIZ));
            if (jSONObjectLIZ == null) {
                c19375410rALIZJ = C19375410rA.LIZ();
            } else {
                c19375410rALIZJ = C19375510rB.LIZJ(jSONObjectLIZ);
            }
            this.LIZ.put(str, c19375410rALIZJ);
            return;
        }
        if (str.equals("en")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("bddigit_default");
            String str3 = File.separator;
            sbLIZ2.append(str3);
            sbLIZ2.append("bddigit");
            sbLIZ2.append(str3);
            sbLIZ2.append(str);
            sbLIZ2.append(".json");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            String str4 = str.split("-")[0];
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("strings#lang_");
            sbLIZ3.append(str4);
            String str5 = File.separator;
            sbLIZ3.append(str5);
            sbLIZ3.append("bddigit");
            sbLIZ3.append(str5);
            sbLIZ3.append(str);
            sbLIZ3.append(".json");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (C08EK.LIZ(context, strLIZIZ) == null) {
            String str6 = LIZLLL.get(str.split("-")[0]);
            if (str6 != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("strings#lang_");
                sbLIZ4.append(str6);
                String str7 = File.separator;
                sbLIZ4.append(str7);
                sbLIZ4.append("bddigit");
                sbLIZ4.append(str7);
                sbLIZ4.append(str);
                sbLIZ4.append(".json");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                if (C08EK.LIZ(context, strLIZIZ2) != null) {
                    strLIZIZ = strLIZIZ2;
                }
            }
        }
        JSONObject jSONObjectLIZ2 = C08EK.LIZ(context, strLIZIZ);
        if (jSONObjectLIZ2 != null) {
            this.LIZ.put(str, C19375510rB.LIZJ(jSONObjectLIZ2));
        }
    }

    public final void LIZJ(Context context, String str) {
        a.LIZLLL(context);
        String str2 = str.split("-")[0];
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("strings#lang_");
        sbLIZ.append(str2);
        sbLIZ.append(File.separator);
        sbLIZ.append("bddigit");
        String[] list = null;
        try {
            list = context.getAssets().list(C2188811AlT.LIZIZ(sbLIZ));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (list != null) {
            for (String str3 : list) {
                String strSubstring = str3.substring(0, str3.lastIndexOf(46));
                this.LIZIZ.put(strSubstring, str3);
                if (str.startsWith(strSubstring)) {
                    LIZIZ(context, strSubstring);
                }
            }
        }
        String str4 = LIZLLL.get(str2);
        if (str4 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("strings#lang_");
            sbLIZ2.append(str4);
            sbLIZ2.append(File.separator);
            sbLIZ2.append("bddigit");
            try {
                String[] list2 = context.getAssets().list(C2188811AlT.LIZIZ(sbLIZ2));
                if (list2 != null) {
                    for (String str5 : list2) {
                        String strSubstring2 = str5.substring(0, str5.lastIndexOf(46));
                        this.LIZIZ.put(strSubstring2, str5);
                        if (str.startsWith(strSubstring2) && !this.LIZ.containsKey(strSubstring2)) {
                            LIZIZ(context, strSubstring2);
                        }
                    }
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
