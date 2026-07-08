package X;

import android.os.Looper;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0agA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C944240agA {
    public static final /* synthetic */ int LIZ = 0;

    public static final C945340ahw LIZ(C474500IjA c474500IjA) {
        C945340ahw c945340ahw = new C945340ahw(c474500IjA);
        c945340ahw.LIZ((Pair[]) Arrays.copyOf(new Pair[0], 0));
        return c945340ahw;
    }

    public static final void LJ(String str) {
        LJFF(str, "");
    }

    public static final void LIZJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractALog_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C786410Ut5.u3().getId());
        sbLIZ2.append("_[");
        sbLIZ2.append(Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()));
        sbLIZ2.append("] ");
        sbLIZ2.append(str2);
        C20441214yg.LIZIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void LIZLLL(String str, String str2) {
        if (Intrinsics.LJFF("local_test", ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getChannel())) {
            StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
            int i = 2;
            do {
                if (i < stackTrace.length) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("InteractALog_");
                    sbLIZ.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("log trace");
                    sbLIZ2.append(i);
                    sbLIZ2.append(stackTrace[i].getClassName());
                    sbLIZ2.append(' ');
                    sbLIZ2.append(stackTrace[i].getMethodName());
                    C20441214yg.LIZIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
                }
                i++;
            } while (i < 6);
        }
        LIZJ(str, str2);
    }

    public static final void LJFF(String str, String str2) {
        HashMap map = new HashMap();
        map.put("event", str);
        map.put("extra", str2);
        C1143300frE.LJIIJJI().LJII("ttlive_interact", map);
    }

    public static final void LJI(String str, String str2) {
        HashMap map = new HashMap();
        map.put("event", str);
        map.put("extra", str2);
        C924810aAp c924810aApLJ = C924810aAp.LJ();
        C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
        map.put("opened", c924810aApLJ.LIZIZ);
        map.put("anchorLinkMicId", c924810aApLJ.LJIILJJIL);
        map.put("linkMicId", c924810aApLJ.LIZLLL());
        map.put("linkMicVendor", Integer.valueOf(EnumC1275250jI3.fromValue(0).getValue()));
        map.put("rtcExtInfo", c924810aApLJ.LJIILLIIL);
        C1143300frE.LJIIJJI().LJII("ttlive_interact", map);
    }

    public static final C945340ahw LIZIZ(C474500IjA c474500IjA, String str, String str2) {
        Pair[] pairArr = {new Pair(str, str2)};
        C945340ahw c945340ahw = new C945340ahw(c474500IjA);
        c945340ahw.LIZ((Pair[]) Arrays.copyOf(pairArr, 1));
        return c945340ahw;
    }
}
