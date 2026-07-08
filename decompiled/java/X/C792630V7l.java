package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.thor.Thor;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792630V7l extends C0V1P {
    public boolean LLIZLLLIL;
    public int LLJ;
    public long LLJI;
    public String LLJIJIL;
    public boolean LLJJIJI;
    public final ConcurrentHashMap<String, C792650V7n> LLJILJIL = new ConcurrentHashMap<>();
    public final Object LLJILJILJ = new Object();
    public long LLJILLL = 0;
    public float LLJJ = 0.0f;
    public long LLJJI = 0;
    public long LLJJIII = 0;
    public final C0V85 LLJJIJIIJIL = C792660V7o.LIZ;
    public final CopyOnWriteArrayList<Long> LLJJIJIL = new CopyOnWriteArrayList<>();
    public final C792640V7m LLJJJ = new C792640V7m(this);

    @Override // X.C0V1P
    public final boolean LJIIIZ() {
        return !this.LLILLJJLI;
    }

    @Override // X.C0V1P
    public final void LJIIL() {
        for (Map.Entry<String, C792650V7n> entry : this.LLJILJIL.entrySet()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(Scene.SCENE_SERVICE, entry.getKey());
                jSONObject.put("current", entry.getValue().LIZ);
                jSONObject.put("capacity", entry.getValue().LIZLLL);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("cpu_time", entry.getValue().LIZIZ);
                jSONObject3.put("traffic", entry.getValue().LIZJ);
                jSONObject3.put("loc", entry.getValue().LJ.toString());
                C792310V6f.LJIIIZ().LIZJ(new C791160V1u("battery", "", jSONObject, jSONObject2, jSONObject3));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LLJILJIL.clear();
    }

    public final void LJIILL() {
        if (TextUtils.isEmpty(this.LLJIJIL)) {
            return;
        }
        this.LLJIJIL = null;
        C787900UvU.LIZ.LJI(this);
        HandlerThread handlerThread = Thor.LIZ;
        if (handlerThread != null) {
            handlerThread.quit();
            ((C792640V7m) Thor.LIZJ).LIZ.LJIILLIIL();
            Thor.LIZ = null;
            Thor.LIZIZ = null;
            Thor.LIZJ = null;
        }
        LJIILLIIL();
    }

    public final void LJIILLIIL() {
        this.LLJILLL = 0L;
        this.LLJJ = 0.0f;
    }

    public C792630V7l() {
        this.LLILZIL = "battery";
        try {
            Intent intentLJIJJ = C786410Ut5.LJIJJ(C792400V6o.LIZ, new BroadcastReceiver() { // from class: X.0Uux
                public final void LIZ(Intent intent) {
                    boolean z;
                    int intExtra = intent.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1);
                    C792630V7l c792630V7l = this.LIZ;
                    if (intExtra != 2 && intExtra != 5) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c792630V7l.LLJJIJI = z;
                    if (z) {
                        synchronized (c792630V7l.LLJILJILJ) {
                            try {
                                this.LIZ.LJIILL();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    if (!C2214201BlK.LJIIJJI && intent != null) {
                        if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                            C2188191AkT.LIZIZ();
                        }
                    }
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        LIZ(intent);
                    } else {
                        C2408409cA.LIZ();
                        LIZ(intent);
                    }
                }
            }, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentLJIJJ != null) {
                int intExtra = intentLJIJJ.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1);
                this.LLJJIJI = intExtra == 2 || intExtra == 5;
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LLJJIJI = true;
    }

    @Override // X.C0V1P
    public final long LJIILJJIL() {
        return this.LLJI;
    }

    @Override // X.C0V1P
    public final void LIZJ(JSONObject jSONObject) {
        boolean z = false;
        if (jSONObject.optInt("energy_enable", 0) == 1) {
            z = true;
        }
        this.LLIZLLLIL = z;
        if (z) {
            this.LLJ = jSONObject.optInt("battery_energy_sample_interval", LivePreCreateNextRoomPlayer.ENABLE);
            this.LLJI = jSONObject.optLong("battery_energy_upload_interval", 120000L);
        } else {
            ActivityLifeObserver.getInstance().unregister(this);
            C787900UvU.LIZ.LJI(this);
        }
    }

    @Override // X.C0V1P, X.InterfaceC792700V7s
    public final void LIZLLL(Activity activity) {
        super.LIZLLL(activity);
    }

    @Override // X.C0V1P, X.InterfaceC792700V7s
    public final void LJII(Activity activity) {
        super.LJII(activity);
        C787900UvU.LIZ.LJI(this);
        synchronized (this.LLJILJILJ) {
            try {
                LJIILL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
