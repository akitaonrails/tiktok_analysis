package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs;
import java.util.LinkedList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j8C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269140j8C {
    public LiveSdkSetting LIZ;
    public boolean LIZIZ;
    public boolean LJ;
    public boolean LJI;
    public boolean LJII;
    public int LJIIIZ;
    public boolean LJIIJJI;
    public Object LJIIL;
    public int LJIILL;
    public int LJIILLIIL;
    public Context LJIIZILJ;
    public String LJIJ;
    public boolean LJIJI;
    public String LJIJJ;
    public Object LJIJJLI;
    public String LJIL;
    public boolean LJJ;
    public boolean LJJIFFI;
    public InterfaceC1266880j4Y LJJIIJ;
    public C1271010jBD LJJIIJZLJL;
    public boolean LJJIIZ;
    public C1273700jFY LJJIIZI;
    public Map<String, Integer> LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public C1272880jEE LJJIJL;
    public boolean LJJIZ;
    public String LJJJI;
    public int LJJJIL;
    public int LJJJJ;
    public int LJJJJI;
    public int LJJJJIZL;
    public int LJJJJJ;
    public int LJJJJJL;
    public int LJJJJLL;
    public C2185991Agv LJJJJZ;
    public UUID LJJJJZI;
    public boolean LJJJLIIL;
    public Handler LJJJZ;
    public volatile boolean LJJL;
    public boolean LIZJ = true;
    public boolean LIZLLL = true;
    public boolean LJFF = true;
    public boolean LJIIIIZZ = true;
    public boolean LJIIJ = true;
    public int LJIILIIL = 720;
    public int LJIILJJIL = 1280;
    public boolean LJJI = true;
    public boolean LJJII = true;
    public boolean LJJIII = true;
    public boolean LJJIJIL = true;
    public final C1269810j9H LJJIJLIJ = new C1269810j9H();
    public final C1268810j7f LJJIL = new C1268810j7f();
    public String LJJJ = "";
    public boolean LJJJJL = true;
    public boolean LJJJJLI = true;
    public final LinkedList<Runnable> LJJJLL = new LinkedList<>();
    public final AtomicBoolean LJJJLZIJ = new AtomicBoolean(false);
    public EnumC1267980j6K LJJLI = EnumC1267980j6K.NORMAL_LIVE;

    public final String LIZ() {
        String strJ3;
        LiveSdkSetting liveSdkSetting = this.LIZ;
        if (liveSdkSetting == null) {
            return null;
        }
        liveSdkSetting.ttlhABSettingsConfigs.getClass();
        if (!TTLHABSettingsConfigs.LJI.enableMemoryOpt) {
            if (!TextUtils.isEmpty(liveSdkSetting.mPushBase.LJFF)) {
                try {
                    PushBase pushBase = liveSdkSetting.mPushBase;
                    JSONObject jSONObject = pushBase.LJI;
                    if (jSONObject != null) {
                        jSONObject.put(pushBase.LJFF, true);
                    }
                    liveSdkSetting.mPushBase.LJFF = null;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return C786410Ut5.J3(liveSdkSetting.mPushBase.LJI);
        }
        if (this.LJJJI == null) {
            if (!TextUtils.isEmpty(liveSdkSetting.mPushBase.LJFF)) {
                try {
                    PushBase pushBase2 = liveSdkSetting.mPushBase;
                    JSONObject jSONObject2 = pushBase2.LJI;
                    if (jSONObject2 != null) {
                        jSONObject2.put(pushBase2.LJFF, true);
                    }
                    liveSdkSetting.mPushBase.LJFF = null;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            JSONObject jSONObject3 = liveSdkSetting.mPushBase.LJI;
            if (jSONObject3 == null || (strJ3 = C786410Ut5.J3(jSONObject3)) == null) {
                strJ3 = "";
            }
            this.LJJJI = strJ3;
            liveSdkSetting.mPushBase.LJI = null;
        }
        return this.LJJJI;
    }
}
