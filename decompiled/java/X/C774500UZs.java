package X;

import Y.AfS181S0100000_12;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0UZs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774500UZs {
    public final int LIZ;
    public final DataChannel LIZIZ;
    public final Function0<Unit> LIZJ;
    public C11JF LIZLLL;
    public long LJ;

    public final void LIZ() {
        C20441214yg.LIZIZ("linkmic_anchor_resume", "cancelCountDown");
        C20441214yg.LIZIZ("linkmic_anchor_resume", "cancel");
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LIZLLL = null;
        LIZIZ(this, true, System.currentTimeMillis() - this.LJ, null, 4);
    }

    public final void LIZJ() {
        C20441214yg.LIZIZ("linkmic_anchor_resume", "startCountDown");
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJ = System.currentTimeMillis();
        this.LIZLLL = (C11JF) C11NZ.LJLJJLL(30000L, TimeUnit.MILLISECONDS).LJIILIIL(new C0UO0()).LJJLJLI(new AfS181S0100000_12(this, 198));
    }

    public C774500UZs(int i, DataChannel dataChannel, Function0<Unit> function0) {
        this.LIZ = i;
        this.LIZIZ = dataChannel;
        this.LIZJ = function0;
    }

    public static void LIZIZ(C774500UZs c774500UZs, boolean z, long j, String str, int i) {
        long jLongValue;
        String str2;
        Long l;
        if ((i & 2) != 0) {
            j = 30000;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        c774500UZs.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report success:");
        sbLIZ.append(z);
        sbLIZ.append(" delay:");
        sbLIZ.append(j);
        sbLIZ.append(" reason:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("linkmic_anchor_resume", C2188811AlT.LIZIZ(sbLIZ));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_linkmic_anchor_resume_state");
        c474500IjALIZ.LJIL();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DataChannel dataChannel = c774500UZs.LIZIZ;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(C751340Tdc.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        linkedHashMap.put("room_id", String.valueOf(jLongValue));
        int i2 = c774500UZs.LIZ;
        if (i2 != 2) {
            if (i2 != 4) {
                str2 = "unkown";
            } else {
                str2 = "multi_guest";
            }
        } else {
            str2 = "multi_host";
        }
        linkedHashMap.put(Scene.SCENE_SERVICE, str2);
        if (z) {
            str = "success";
        }
        linkedHashMap.put("state", str);
        linkedHashMap.put("delay", String.valueOf(j));
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }
}
