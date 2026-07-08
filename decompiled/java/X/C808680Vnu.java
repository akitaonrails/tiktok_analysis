package X;

import Y.ARunnableS19S0201000_13;
import Y.ARunnableS1S0211000_13;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.push.PushBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vnu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808680Vnu implements InterfaceC808560Vni {
    public final C810570Vqx LIZ;
    public final InterfaceC808700Vnw LIZIZ;
    public final InterfaceC808710Vnx LIZJ;
    public final C809220Vom LJFF;
    public final List<Long> LJ = new ArrayList();
    public final C808690Vnv LIZLLL = new C808690Vnv();

    public static String LIZLLL() {
        InterfaceC809060VoW interfaceC809060VoW = C809030VoT.LJIIJ.LIZIZ.LJIJJ;
        if (interfaceC809060VoW == null) {
            return "";
        }
        String secUid = interfaceC809060VoW.getSecUid();
        return !TextUtils.isEmpty(secUid) ? secUid : "";
    }

    public final void LIZJ() {
        try {
            C0VS0 c0vs0LIZLLL = C0VS0.LIZLLL(this.LJFF.LIZ);
            C808950VoL.LIZIZ().getClass();
            c0vs0LIZLLL.LIZJ(C808950VoL.LIZLLL().LJIILJJIL().LIZJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C808680Vnu(C809220Vom c809220Vom) {
        this.LIZ = c809220Vom.LJIIL;
        this.LIZIZ = c809220Vom.LJIIJJI;
        this.LIZJ = c809220Vom.LJIILLIIL;
        this.LJFF = c809220Vom;
    }

    public static boolean LJFF(String str) {
        InterfaceC809060VoW interfaceC809060VoW = C809030VoT.LJIIJ.LIZIZ.LJIJJ;
        if (interfaceC809060VoW == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, LIZLLL())) {
            return true;
        }
        List<String> listLIZJ = interfaceC809060VoW.LIZJ();
        if (listLIZJ == null || !listLIZJ.contains(str)) {
            return false;
        }
        return true;
    }

    public static void LJIIIIZZ(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            RunnableC823120WQs.LIZIZ(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean LJIIIZ(PushBody pushBody) {
        InterfaceC809060VoW interfaceC809060VoW;
        if (TextUtils.isEmpty(pushBody.targetSecUid) || (interfaceC809060VoW = C809030VoT.LJIIJ.LIZIZ.LJIJJ) == null || !pushBody.needFilterMsgByUid || TextUtils.equals(interfaceC809060VoW.getSecUid(), pushBody.targetSecUid)) {
            return false;
        }
        return true;
    }

    public final boolean LIZ(PushBody pushBody) {
        C808950VoL.LIZIZ().getClass();
        if (!C808950VoL.LIZLLL().LJIILJJIL().LIZ) {
            return false;
        }
        return C0VS0.LIZLLL(this.LJFF.LIZ).LIZIZ(pushBody.rid64);
    }

    public final boolean LIZIZ(int i, PushBody pushBody) {
        C808950VoL.LIZIZ().getClass();
        if (!C808950VoL.LIZLLL().LJIILJJIL().LIZ || pushBody.expire_time <= 0 || System.currentTimeMillis() / 1000 <= pushBody.expire_time) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cur body ");
        sbLIZ.append(pushBody);
        sbLIZ.append(" is expire time, from ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            LJIIIIZZ(new ARunnableS19S0201000_13(i, pushBody, this, 1));
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(final int r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C808680Vnu.LJ(int, java.lang.String, java.lang.String):void");
    }

    public final void LJII(int i, PushBody pushBody, boolean z) {
        boolean zLJI = MethodIDManager.LJI(71715);
        LJIIIIZZ(new ARunnableS1S0211000_13(i, this, pushBody, z, 0));
        RunnableC823120WQs.LIZIZ(new C808780Vo4(i, pushBody));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJI(final int i, final String str, final String str2, final String str3) {
        try {
            LJIIIIZZ(new Runnable() { // from class: X.0Vo0
                @Override // java.lang.Runnable
                public final void run() {
                    C808680Vnu c808680Vnu = this.LL;
                    String str4 = str3;
                    String str5 = str;
                    String str6 = str2;
                    int i2 = i;
                    c808680Vnu.getClass();
                    C1C7U.LIZ("PushMsgHandler@69d4.onHandleError$1L");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_msg", str4);
                        if (!TextUtils.isEmpty(str5)) {
                            jSONObject.put("push_msg_string", str5);
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            jSONObject.put("push_msg_extra", str6);
                        }
                        jSONObject.put("sender", i2);
                        jSONObject.put("push_sdk_version", String.valueOf(30204));
                        jSONObject.put("push_sdk_version_name", "3.2.4-alpha.56.4-bugfix");
                        jSONObject.put("client_time", System.currentTimeMillis());
                        ((C808750Vo1) c808680Vnu.LIZIZ).LIZ("push_handle_msg_error", jSONObject);
                        C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("push_handle_msg_error:");
                        sbLIZ.append(jSONObject);
                        C2188811AlT.LIZIZ(sbLIZ);
                        c809150Vof.getClass();
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C1C7U.LIZIZ("PushMsgHandler@69d4.onHandleError$1L");
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
