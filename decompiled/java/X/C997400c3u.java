package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0c3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997400c3u {
    public static final Map<String, Integer> LIZ;
    public static final int LIZIZ;
    public static final C997400c3u LIZJ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ = linkedHashMap;
        LIZIZ = -1;
        C997400c3u c997400c3u = new C997400c3u();
        Integer num = 1;
        if (num != null) {
            num.intValue();
            linkedHashMap.put("defaultStatusKey", num);
        }
        LIZJ = c997400c3u;
    }

    public final void LIZIZ() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    public static int LIZ(String str) {
        if (str == null) {
            return LIZIZ;
        }
        Integer num = (Integer) ((LinkedHashMap) LIZ).get(str);
        if (num != null) {
            return num.intValue();
        }
        return LIZIZ;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(C997410c3v c997410c3v) {
        C811103Ev.LIZ("AdHybridSparkJsbStatusModel");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c997410c3v.LIZJ);
        sbLIZ.append(c997410c3v.LIZLLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Integer numValueOf = Integer.valueOf(c997410c3v.LIZ);
        if (numValueOf != null) {
            numValueOf.intValue();
            if (strLIZIZ != null) {
                LIZ.put(strLIZIZ, numValueOf);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSuperLikeStatusEvent(C997420c3w c997420c3w) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSuperLikeStatusEvent: status = ");
        sbLIZ.append(c997420c3w.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C811103Ev.LIZ("AdHybridSparkJsbStatusModel");
        Integer numValueOf = Integer.valueOf(c997420c3w.LIZ);
        if (numValueOf != null) {
            numValueOf.intValue();
            LIZ.put("feed_fyp_super_like", numValueOf);
        }
    }
}
