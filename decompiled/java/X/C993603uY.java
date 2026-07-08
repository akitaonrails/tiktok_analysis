package X;

import Y.AObjectS345S0100000_1;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03uY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C993603uY {
    public static final String LJ(Function1<? super LaneParams, Unit> function1) {
        AObjectS345S0100000_1 aObjectS345S0100000_1 = new AObjectS345S0100000_1(function1, 0);
        String strLIZJ = TrackNodeStore.LIZJ("params_pass_node");
        C993703uZ c993703uZ = new C993703uZ();
        aObjectS345S0100000_1.invoke(c993703uZ);
        C993503uX c993503uX = new C993503uX(strLIZJ, c993703uZ, null, false);
        c993703uZ.LIZJ(c993703uZ);
        TrackNodeStore.LIZ.put(strLIZJ, c993503uX);
        return strLIZJ;
    }

    public static final <T> T LIZ(String str, String str2) {
        C993503uX c993503uX = TrackNodeStore.LIZ.get(str);
        if (c993503uX != null) {
            return (T) LIZIZ(c993503uX, str2);
        }
        return null;
    }

    public static final <T> T LIZIZ(InterfaceC1748810vbr interfaceC1748810vbr, String str) {
        T t = (T) C1748730vbj.LIZIZ(interfaceC1748810vbr, "lib_track_builtin_lane_param_pass").get((Object) str);
        if (t == null) {
            return null;
        }
        return t;
    }

    public static final void LIZJ(String str, Function1<? super LaneParams, Unit> function1) {
        ConcurrentHashMap<String, C993503uX> concurrentHashMap = TrackNodeStore.LIZ;
        C993503uX c993503uX = TrackNodeStore.LIZ.get(str);
        if (c993503uX != null) {
            C993703uZ c993703uZ = new C993703uZ();
            C1748780vbo.LIZIZ(c993703uZ, "lib_track_builtin_lane_param_pass", new AwS580S0100000_1(function1, (Function1<? super String, Unit>) 347));
            c993503uX.LLILLJJLI.LIZJ(c993703uZ);
        }
    }

    public static final String LIZLLL(String str, Function1<? super LaneParams, Unit> function1) {
        AObjectS345S0100000_1 aObjectS345S0100000_1 = new AObjectS345S0100000_1(function1, 1);
        String strLIZJ = TrackNodeStore.LIZJ("param_pass_node");
        C993703uZ c993703uZ = new C993703uZ();
        aObjectS345S0100000_1.invoke(c993703uZ);
        ConcurrentHashMap<String, C993503uX> concurrentHashMap = TrackNodeStore.LIZ;
        concurrentHashMap.put(strLIZJ, new C993503uX(strLIZJ, c993703uZ, concurrentHashMap.get(str), true));
        return strLIZJ;
    }
}
