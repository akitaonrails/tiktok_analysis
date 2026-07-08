package X;

import com.bytedance.android.livesdk.dataChannel.LiveCastStateChannel;
import com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWidget;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0THC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0THC {
    public static C1519760peQ<GameCastWidget> LIZIZ;
    public static final C0THC LIZ = new C0THC();
    public static final Map<Class<? extends GameCastWidget>, Boolean> LIZJ = new ConcurrentHashMap();

    public static final boolean LIZIZ() {
        Iterator it2 = ((ConcurrentHashMap) LIZJ).entrySet().iterator();
        while (it2.hasNext()) {
            if (((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static void LIZJ() {
        boolean zLIZIZ = LIZIZ();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (Intrinsics.LJFF(Boolean.valueOf(zLIZIZ), dataChannelGlobal.gg0(LiveCastStateChannel.class))) {
            return;
        }
        dataChannelGlobal.HQ2(LiveCastStateChannel.class, Boolean.valueOf(zLIZIZ));
    }

    public static final boolean LIZ(Class<? extends GameCastWidget> cls) {
        Boolean bool = (Boolean) ((ConcurrentHashMap) LIZJ).get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void LIZLLL(Class<? extends GameCastWidget> cls, boolean z) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("s: ");
        sbLIZ.append(z);
        sbLIZ.append(", wsize:");
        C1519760peQ<GameCastWidget> c1519760peQ = LIZIZ;
        if (c1519760peQ != null) {
            numValueOf = Integer.valueOf(c1519760peQ.LL.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", mSize:");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZJ;
        sbLIZ.append(concurrentHashMap.size());
        sbLIZ.append(" class: ");
        sbLIZ.append(cls.getName());
        C20441214yg.LIZIZ("GameCastStateManager", C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("state: ");
            sbLIZ2.append(((Boolean) entry.getValue()).booleanValue());
            C20441214yg.LIZIZ("GameCastStateManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1519760peQ<GameCastWidget> c1519760peQ2 = LIZIZ;
        if (c1519760peQ2 != null && c1519760peQ2.LL.size() == 0) {
            for (Map.Entry entry2 : ((ConcurrentHashMap) LIZJ).entrySet()) {
                if (Intrinsics.LJFF(entry2.getKey(), cls) && ((Boolean) entry2.getValue()).booleanValue() != z) {
                    ((ConcurrentHashMap) LIZJ).put(cls, Boolean.valueOf(z));
                    LIZ.getClass();
                    LIZJ();
                    return;
                }
            }
            return;
        }
        C1519760peQ<GameCastWidget> c1519760peQ3 = LIZIZ;
        if (c1519760peQ3 != null) {
            for (GameCastWidget gameCastWidget : c1519760peQ3) {
                if (Intrinsics.LJFF(cls, gameCastWidget.getClass())) {
                    ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) LIZJ;
                    if (!Intrinsics.LJFF(concurrentHashMap2.get(cls), Boolean.valueOf(z))) {
                        concurrentHashMap2.put(cls, Boolean.valueOf(z));
                        C500260Jjc.LJJLIIIJJIZ(new AwS130S0110000_12(gameCastWidget, z, 28));
                        LIZ.getClass();
                        LIZJ();
                        return;
                    }
                }
            }
        }
    }
}
