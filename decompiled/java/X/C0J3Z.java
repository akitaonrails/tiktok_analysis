package X;

import android.os.Looper;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0J3Z, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J3Z {
    public static final C0J3Z LIZ = new C0J3Z();
    public static final List<C485730J3b> LIZIZ = new ArrayList();

    public final void LIZIZ() {
        LIZ(this);
        for (C485730J3b c485730J3b : (ArrayList) LIZIZ) {
            if (AbstractC19994813Le.Default.nextInt(0, 100) < 5) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", c485730J3b.LIZ);
                    jSONObject.put("create_type", c485730J3b.LIZJ.getType());
                    jSONObject.put("biz_type", c485730J3b.LIZIZ.getType());
                    jSONObject.put("role_type", c485730J3b.LJIIIZ ? 1 : 2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("create_duration", c485730J3b.LIZLLL);
                    jSONObject2.put("get_duration", c485730J3b.LJFF);
                    jSONObject2.put("remain_duration", c485730J3b.LJII);
                    jSONObject2.put("widget_ready_duration", c485730J3b.LJI);
                    jSONObject2.put("room_switch_count", c485730J3b.LJIIIIZZ);
                    jSONObject2.put("opt_group", c485730J3b.LJIIJ ? c485730J3b.LJIIJJI ? "3" : "2" : c485730J3b.LJIIJJI ? "1" : CardStruct.IStatusCode.DEFAULT);
                    C1CC2.LJ("ttlive_watch_layout_preload", jSONObject, jSONObject2, new JSONObject());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        ((ArrayList) LIZIZ).clear();
    }

    public static void LIZ(C0J3Z c0j3z) {
        c0j3z.getClass();
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() && !Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            throw new RuntimeException("This could only be called on main thread");
        }
    }

    public final void LIZJ(C485730J3b c485730J3b) {
        if (c485730J3b == null) {
            return;
        }
        LIZ(this);
        ((ArrayList) LIZIZ).add(c485730J3b);
    }
}
