package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ag9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C944230ag9 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(String str, String str2) {
        HashMap map = new HashMap();
        map.put("event", str);
        map.put("extra", str2);
        C924810aAp c924810aApLJ = C924810aAp.LJ();
        C924250a9v.LIZ();
        map.put("opened", c924810aApLJ.LIZIZ);
        map.put("anchorLinkMicId", c924810aApLJ.LJIILJJIL);
        map.put("linkMicId", c924810aApLJ.LIZLLL());
        map.put("linkMicVendor", Integer.valueOf(EnumC1275250jI3.fromValue(0).getValue()));
        map.put("rtcExtInfo", c924810aApLJ.LJIILLIIL);
        map.put("is_game_link", Boolean.TRUE);
        C1143300frE.LJIIJJI().LJII("ttlive_interact", map);
    }

    public static final void LIZ(String str, String str2, boolean z) {
        if (z && Intrinsics.LJFF("local_test", ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getChannel())) {
            StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
            int i = 2;
            do {
                if (i < stackTrace.length) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("log trace");
                    sbLIZ.append(i);
                    sbLIZ.append(stackTrace[i].getClassName());
                    sbLIZ.append(' ');
                    sbLIZ.append(stackTrace[i].getMethodName());
                    C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                }
                i++;
            } while (i < 6);
        }
        C20441214yg.LIZIZ(str, str2);
    }
}
