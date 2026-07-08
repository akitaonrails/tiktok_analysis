package X;

import android.os.SystemClock;
import com.bytedance.im.core.client.configs.IMSDKReceiveMsgPerfConfig;
import com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker;
import com.bytedance.keva.Keva;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WY6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WY6 implements ReceiveMsgPerfTracker {
    public final Keva LIZ;
    public final IMSDKReceiveMsgPerfConfig LIZIZ;
    public final Function0<Boolean> LIZJ;
    public final Map<String, C0WY7> LIZLLL;
    public final Map<String, C09AE> LJ;
    public final C01GW LJFF;
    public final C01GW LJI;

    @Override // com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker
    public final void LIZIZ() {
        for (C0WY7 c0wy7 : ((LinkedHashMap) this.LIZLLL).values()) {
            c0wy7.LJFF = true;
            c0wy7.LIZ.LJI();
        }
        ((LinkedHashMap) this.LIZLLL).clear();
        Iterator it2 = ((LinkedHashMap) this.LJ).values().iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(null);
        }
        ((LinkedHashMap) this.LJ).clear();
    }

    public C0WY6(int i) {
        Keva repo = Keva.getRepo("im_receive_msg_perf_tracker");
        IMSDKReceiveMsgPerfConfig iMSDKReceiveMsgPerfConfig = C0WYB.LIZ;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        IMSDKReceiveMsgPerfConfig iMSDKReceiveMsgPerfConfig2 = C0WYB.LIZ;
        IMSDKReceiveMsgPerfConfig iMSDKReceiveMsgPerfConfig3 = (IMSDKReceiveMsgPerfConfig) c0c64LJIILLIIL.LJJII(IMSDKReceiveMsgPerfConfig.class, iMSDKReceiveMsgPerfConfig2, "imsdk_receive_msg_perf_config", true);
        iMSDKReceiveMsgPerfConfig2 = iMSDKReceiveMsgPerfConfig3 != null ? iMSDKReceiveMsgPerfConfig3 : iMSDKReceiveMsgPerfConfig2;
        C0N32 c0n32 = new C0N32();
        this.LIZ = repo;
        this.LIZIZ = iMSDKReceiveMsgPerfConfig2;
        this.LIZJ = c0n32;
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new LinkedHashMap();
        this.LJFF = C452501pT.LIZIZ(new C353901Yz());
        this.LJI = C452501pT.LIZIZ(new C01Z0());
    }

    public static String LJ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker
    public final void LIZJ(int i, String str) {
        if (!LIZLLL(i, str) || this.LIZJ.invoke().booleanValue()) {
            return;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LJFF.getValue(), null, null, new C0WY3(this, str, i, null), 3);
    }

    public final boolean LIZLLL(int i, String str) {
        if (!this.LIZIZ.isEnabled()) {
            return false;
        }
        if ((!this.LIZIZ.supportedReceiveTypes.isEmpty()) && !this.LIZIZ.supportedReceiveTypes.contains(str)) {
            return false;
        }
        if ((!this.LIZIZ.supportedInboxTypes.isEmpty()) && !this.LIZIZ.supportedInboxTypes.contains(Integer.valueOf(i))) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_fps_tracking_time_");
        sbLIZ.append(LJ(i, str));
        if (jUptimeMillis - keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L) < this.LIZIZ.generalCheckIntervalMs) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker
    public final void LIZ(int i, int i2, String str) {
        if (!LIZLLL(i, str)) {
            return;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LJFF.getValue(), null, null, new C0WY5(this, str, i, i2, -1, -1, -1, -1, null), 3);
    }
}
