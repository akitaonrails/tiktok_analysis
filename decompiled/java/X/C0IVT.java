package X;

import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IVT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IVT {
    public static final /* synthetic */ int LIZ = 0;

    public static SlimRoom LIZIZ(String str) {
        try {
            return (SlimRoom) C08JS.LIZ(str, SlimRoom.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.bytedance.android.livesdkapi.depend.model.live.SlimRoom r21, com.bytedance.android.livesdkapi.session.EnterRoomConfig r22) {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IVT.LIZJ(com.bytedance.android.livesdkapi.depend.model.live.SlimRoom, com.bytedance.android.livesdkapi.session.EnterRoomConfig):void");
    }

    public static Map LIZ(String str, String str2, SlimRoom slimRoom) {
        String multiStreamData;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from_merge", str);
        pairArr[1] = new Pair("enter_method", str2);
        String options = null;
        if (slimRoom != null) {
            multiStreamData = slimRoom.getMultiStreamData();
        } else {
            multiStreamData = null;
        }
        pairArr[2] = new Pair("stream_info", multiStreamData);
        if (slimRoom != null) {
            options = slimRoom.getOptions();
        }
        pairArr[3] = new Pair("options", options);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }
}
