package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.tts.oecverify.BdTuring;
import com.tts.oecverify.BdTuringConfig;
import com.tts.oecverify.ttnet.TTNetUtil;
import kotlin.jvm.internal.AwS609S0100000_30;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.149X, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C149X {
    public final Context LIZ;
    public final C202200149u LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new C202195149p(this));

    public C149X(Context context, C202200149u c202200149u) {
        boolean z;
        boolean zLIZIZ;
        String string;
        this.LIZ = context;
        this.LIZIZ = c202200149u;
        TTNetUtil.LIZ();
        Object obj = c202200149u.LJIIJ.get("reqBlock");
        if (obj != null && (string = obj.toString()) != null) {
            z = Boolean.parseBoolean(string);
        } else {
            z = false;
        }
        if (Boolean.valueOf(z).booleanValue()) {
            zLIZIZ = C1494230ozF.LIZIZ("oec-verify", TTNetUtil.LIZIZ);
        } else {
            zLIZIZ = C1494230ozF.LIZIZ("oec-verify", TTNetUtil.LIZJ);
        }
        if (!zLIZIZ) {
            int code = C149Y.SDK_INIT_ADD_RETRY_FILTER_ERROR.getCode();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key", "init_error");
                jSONObject.put("error_code", code);
                C202191149l.LIZJ("oec_verify_sdk", jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C14A6.LIZIZ();
            }
        }
        ((BdTuringConfig) this.LIZJ.getValue()).setVerifyLoginHandler(new InterfaceC202182149c() { // from class: X.149a
            @Override // X.InterfaceC202182149c
            public final void LIZ(Activity activity, C202198149s c202198149s) {
                AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
                String name;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    boolean z2 = false;
                    anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                        z2 = true;
                    }
                    String name2 = IAccountDependencyService.class.getName();
                    if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                }
                ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).showLoginAndRegisterView(activity, null, new AwS609S0100000_30(c202198149s, 254), new AwS609S0100000_30(c202198149s, 255));
            }
        });
        BdTuring.getInstance().init((BdTuringConfig) this.LIZJ.getValue());
    }
}
