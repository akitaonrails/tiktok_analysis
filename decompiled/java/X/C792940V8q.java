package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS18S1100000_13;
import Y.ARunnableS92S0000000_13;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792940V8q extends AbstractC792000V5a implements InterfaceC792050V5f, InterfaceC792950V8r {
    public Context LLILLJJLI;
    public C2435709gZ LLILLL;
    public boolean LLILZ;
    public final List<String> LLILZIL = Arrays.asList("timer", "count", "disk", "memory", "cpu", "fps", "traffic", "start", "page_load", "image_monitor", "api_all", "api_error", "common_log", "service_monitor", "performance_monitor", "ui_action");

    @Override // X.C0V58
    public final void start() {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09gZ] */
    @Override // X.InterfaceC792030V5d
    public final void LIZ() throws Exception {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        if ((this.LL == null || TextUtils.isEmpty("close_cloud_request") || this.LL.optInt("close_cloud_request") != 1) && C792400V6o.LJIIIZ()) {
            this.LLILLL = new BroadcastReceiver() { // from class: X.09gZ
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    if (!C2214201BlK.LJIIJJI && intent != null) {
                        if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                            C2188191AkT.LIZIZ();
                        }
                    }
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        C787900UvU.LIZ.LIZJ(new ARunnableS103S0100000_3(context, 70));
                    } else {
                        C2408409cA.LIZ();
                        C787900UvU.LIZ.LIZJ(new ARunnableS103S0100000_3(context, 70));
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            C786410Ut5.LJIJJ(this.LLILLJJLI, this.LLILLL, intentFilter);
            C787900UvU.LIZ.LIZJ(new ARunnableS92S0000000_13(27));
        }
    }

    @Override // X.InterfaceC792050V5f
    public final void LIZJ(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cloud_commands");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                C0VDB c0vdbLIZIZ = C0VDB.LIZIZ();
                c0vdbLIZIZ.LIZJ.execute(new ARunnableS18S1100000_13(c0vdbLIZIZ, strOptString, 9));
            }
        }
    }

    @Override // X.C0V58
    public final void LJI(C0V5F c0v5f) {
        if (!C086I.LIZIZ(c0v5f.LIZ)) {
            try {
                URL url = new URL((String) ListProtector.get(c0v5f.LIZ, 0));
                C2403709bP.LIZ = C786410Ut5.j4("%s://%s/%s", new Object[]{url.getProtocol(), url.getHost(), "monitor/collect/c/cloudcontrol/file"});
            } catch (MalformedURLException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC792700V7s
    public final void LJII(Activity activity) {
        if ((this.LL != null && !TextUtils.isEmpty("close_cloud_request") && this.LL.optInt("close_cloud_request") == 1) || !C792400V6o.LJIIIZ()) {
            return;
        }
        C787900UvU.LIZ.LIZLLL(2000L, new ARunnableS92S0000000_13(28));
    }

    @Override // X.C0V58
    public final void init(Context context) {
        this.LLILLJJLI = context;
        C0VDB.LJIIIZ = true;
        C0VDB.LJFF = C786410Ut5.N3(context);
        C0VDB.LIZIZ();
        C792400V6o.LJIIIIZZ();
        ((IConfigManager) C792600V7i.LIZ(IConfigManager.class)).registerResponseConfigListener(this);
        if (C0VDB.LJIIIZ) {
            C0VDB.LIZIZ().LIZLLL(this);
        } else {
            C0VDB.LJIIIIZZ = this;
        }
        ActivityLifeObserver.getInstance().register(this);
        IConfigManager iConfigManager = (IConfigManager) C792600V7i.LIZ(IConfigManager.class);
        if (iConfigManager != null) {
            iConfigManager.registerConfigListener(this);
        }
    }
}
