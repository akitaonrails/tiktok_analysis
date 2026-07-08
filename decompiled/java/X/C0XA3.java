package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;
import ttpobfuscated.fe;

/* JADX INFO: renamed from: X.0XA3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XA3 {
    public static final C01GW<C0XA3> LIZIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS200S0000000_13.get$arr$(148));
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.retrofit2.client.Request r6) {
        /*
            if (r6 == 0) goto L3
            goto L5
        L3:
            r5 = 0
            goto L20
        L5:
            java.util.List r0 = r6.getHeaders()     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L3
            X.07ik r1 = new X.07ik     // Catch: java.lang.Exception -> L60
            r1.<init>(r0)     // Catch: java.lang.Exception -> L60
            r0 = 28
            kotlin.jvm.internal.AFwS247S0000000_13 r0 = kotlin.jvm.internal.AFwS247S0000000_13.get$arr$(r0)     // Catch: java.lang.Exception -> L60
            X.08QU r0 = X.C09RB.LJIIIZ(r1, r0)     // Catch: java.lang.Exception -> L60
            java.lang.Object r5 = X.C09RB.LJIIIIZZ(r0)     // Catch: java.lang.Exception -> L60
            X.080U r5 = (X.C080U) r5     // Catch: java.lang.Exception -> L60
        L20:
            X.08qG r4 = new X.08qG     // Catch: java.lang.Exception -> L60
            r4.<init>()     // Catch: java.lang.Exception -> L60
            java.lang.String r2 = "URL"
            java.lang.String r3 = ""
            if (r6 == 0) goto L31
            java.lang.String r1 = r6.getPath()     // Catch: java.lang.Exception -> L60
            if (r1 != 0) goto L32
        L31:
            r1 = r3
        L32:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r4.LIZ     // Catch: java.lang.Exception -> L60
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L60
            java.lang.String r2 = "errorCode"
            r0 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L60
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r4.LIZ     // Catch: java.lang.Exception -> L60
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = "x-tt-logid"
            if (r5 == 0) goto L4e
            java.lang.String r0 = r5.LIZIZ     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L4e
            r3 = r0
        L4e:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r4.LIZ     // Catch: java.lang.Exception -> L60
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L60
            org.json.JSONObject r2 = r4.LJ()     // Catch: java.lang.Exception -> L60
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Runnable> r0 = X.C794240VDq.LIZ     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = "request_force_logout_log"
            r0 = 0
            X.C793770VBv.LJIIJJI(r1, r0, r2)     // Catch: java.lang.Exception -> L60
            return
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XA3.LIZ(com.bytedance.retrofit2.client.Request):void");
    }

    public static void LIZIZ(C0XA4 c0xa4) {
        try {
            C2241008qG c2241008qG = new C2241008qG();
            String str = c0xa4.LIZJ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            c2241008qG.LIZ.put("URL", str);
            c2241008qG.LIZ.put("errorCode", 8);
            String str3 = c0xa4.LIZIZ;
            if (str3 != null) {
                str2 = str3;
            }
            c2241008qG.LIZ.put("x-tt-logid", str2);
            JSONObject jSONObjectLJ = c2241008qG.LJ();
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("request_force_logout_log", 0, jSONObjectLJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(Request request) throws Throwable {
        String url;
        String url2;
        boolean z;
        String path;
        int i;
        Integer numValueOf = null;
        if (request == null) {
            url = null;
        } else {
            try {
                url = request.getUrl();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (!TextUtils.isEmpty(url)) {
            if (request == null) {
                url2 = null;
            } else {
                url2 = request.getUrl();
            }
            Map mapLIZJ = C847400XMc.LIZJ(url2);
            boolean z2 = false;
            if (mapLIZJ != null) {
                Iterator it2 = mapLIZJ.entrySet().iterator();
                while (it2.hasNext()) {
                    if (u.LJIJI("X-Tt-Token", (String) ((Map.Entry) it2.next()).getKey(), true)) {
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            String strLLIZ = C2204961BRm.LLIZ(C786410Ut5.A2(), "https://tiktokv.com", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOanZJbAkiciO1JSZe7wk//CbeAllJiyXiY6", null));
            if (TextUtils.isEmpty(strLLIZ) || !a0.LJJIIZI(strLLIZ, fe.e, false)) {
                z2 = true;
            }
            C2241008qG c2241008qG = new C2241008qG();
            if (request != null) {
                path = request.getPath();
            } else {
                path = null;
            }
            c2241008qG.LIZ.put("path", path);
            c2241008qG.LIZ.put("has_token", Boolean.valueOf(z));
            if (z2) {
                i = 3;
            } else {
                i = -1;
            }
            c2241008qG.LIZ.put("empty", Integer.valueOf(i));
            if (mapLIZJ != null) {
                numValueOf = Integer.valueOf(mapLIZJ.size());
            }
            c2241008qG.LIZ.put("size", numValueOf);
            JSONObject jSONObjectLJ = c2241008qG.LJ();
            C20684815ws.LJIJ("session_expired_dialog_show", jSONObjectLJ);
            C786410Ut5.J3(jSONObjectLJ);
        }
    }

    public static void LIZLLL(C0XA4 c0xa4) {
        boolean z;
        int i;
        try {
            if (!TextUtils.isEmpty(c0xa4.LIZLLL)) {
                Map mapLIZJ = C847400XMc.LIZJ(c0xa4.LIZLLL);
                boolean z2 = false;
                if (mapLIZJ != null) {
                    Iterator it2 = mapLIZJ.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (u.LJIJI("X-Tt-Token", (String) ((Map.Entry) it2.next()).getKey(), true)) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                Integer numValueOf = null;
                String strLLIZ = C2204961BRm.LLIZ(C786410Ut5.A2(), "https://tiktokv.com", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOanZJbAkiciO1JSZe7wk//CbeAllJiyXiY6", null));
                if (TextUtils.isEmpty(strLLIZ) || !a0.LJJIIZI(strLLIZ, fe.e, false)) {
                    z2 = true;
                }
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("path", c0xa4.LIZJ);
                c2241008qG.LIZ.put("has_token", Boolean.valueOf(z));
                if (z2) {
                    i = 3;
                } else {
                    i = -1;
                }
                c2241008qG.LIZ.put("empty", Integer.valueOf(i));
                if (mapLIZJ != null) {
                    numValueOf = Integer.valueOf(mapLIZJ.size());
                }
                c2241008qG.LIZ.put("size", numValueOf);
                JSONObject jSONObjectLJ = c2241008qG.LJ();
                C20684815ws.LJIJ("session_expired_dialog_show", jSONObjectLJ);
                C786410Ut5.J3(jSONObjectLJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJ(Request request) {
        Activity activityLIZIZ;
        try {
            if (this.LIZ.compareAndSet(false, true)) {
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                String path = null;
                if (abstractC1387200mCcLIZIZ != null) {
                    activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
                } else {
                    activityLIZIZ = null;
                }
                IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
                if (activityLIZIZ != null && iUserService != null && iUserService.isLogin()) {
                    LIZJ(request);
                    LIZ(request);
                    if (request != null) {
                        path = request.getPath();
                    }
                    String str = LogoutDialogActivity._pnsPageId;
                    Bundle bundle = new Bundle();
                    if (path != null) {
                        C786410Ut5.LJJJI("from_path", path, bundle);
                    }
                    C0D97.LIZ(activityLIZIZ, bundle);
                    return;
                }
                this.LIZ.set(false);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJFF(String str) {
        Activity activityLIZIZ;
        IUserService iUserService;
        try {
            if (this.LIZ.compareAndSet(false, true)) {
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (iUserService = (IUserService) ServiceManager.get().getService(IUserService.class)) != null && iUserService.isLogin()) {
                    String str2 = LogoutDialogActivity._pnsPageId;
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("message", str, bundle);
                    C0D97.LIZ(activityLIZIZ, bundle);
                    return;
                }
                this.LIZ.set(false);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
