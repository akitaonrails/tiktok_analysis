package X;

import Y.ARunnableS0S0301200_20;
import Y.ARunnableS53S0300000_20;
import android.os.Handler;
import android.util.Log;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jHA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1274700jHA implements InterfaceC1274710jHB {
    public final /* synthetic */ C1274810jHL LIZ;

    public C1274700jHA(C1274810jHL c1274810jHL) {
        this.LIZ = c1274810jHL;
    }

    @Override // X.InterfaceC1274710jHB
    public final void LIZJ(InterfaceC1276380jJs interfaceC1276380jJs, LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
        Handler handlerLIZJ = C1274690jH9.LIZJ();
        if (handlerLIZJ != null && handlerLIZJ.getLooper().getThread() != C786410Ut5.u3()) {
            C786410Ut5.LJJZZIII(handlerLIZJ, new ARunnableS53S0300000_20(interfaceC1276380jJs, lyraxTranscoderFeatureEvent, this, 53));
            return;
        }
        InterfaceC1274710jHB interfaceC1274710jHB = this.LIZ.LJJLI;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZJ(interfaceC1276380jJs, lyraxTranscoderFeatureEvent);
        }
    }

    @Override // X.InterfaceC1274710jHB
    public final void LIZ(InterfaceC1276380jJs interfaceC1276380jJs, int i, long j, long j2, Object... objArr) {
        Handler handlerLIZJ = C1274690jH9.LIZJ();
        if (handlerLIZJ != null && handlerLIZJ.getLooper().getThread() != C786410Ut5.u3()) {
            C786410Ut5.LJJZZIII(handlerLIZJ, new ARunnableS0S0301200_20(this, interfaceC1276380jJs, i, j, j2, objArr, 0));
            return;
        }
        InterfaceC1274710jHB interfaceC1274710jHB = this.LIZ.LJJLI;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(interfaceC1276380jJs, i, j, j2, objArr);
        }
    }

    @Override // X.InterfaceC1274710jHB
    public final void LIZIZ(InterfaceC1276380jJs interfaceC1276380jJs, int i, long j, long j2, Exception exc) {
        Handler handlerLIZJ = C1274690jH9.LIZJ();
        if (handlerLIZJ != null && handlerLIZJ.getLooper().getThread() != C786410Ut5.u3()) {
            C786410Ut5.LJJZZIII(handlerLIZJ, new ARunnableS0S0301200_20(this, interfaceC1276380jJs, i, j, j2, exc, 1));
            return;
        }
        AVLog.debugTrace(Integer.valueOf(i), Long.valueOf(j), exc.toString());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("code2: ");
        sbLIZ.append(j);
        sbLIZ.append(", code3: ");
        sbLIZ.append(j2);
        sbLIZ.append(". Message: ");
        sbLIZ.append(exc.getMessage());
        sbLIZ.append(". Stack: ");
        sbLIZ.append(Log.getStackTraceString(exc));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1274830jHN c1274830jHN = this.LIZ.LJIIIIZZ;
        if (c1274830jHN != null) {
            c1274830jHN.LJIIIZ((int) j, strLIZIZ);
        }
        InterfaceC1274710jHB interfaceC1274710jHB = this.LIZ.LJJLI;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZIZ(interfaceC1276380jJs, i, j, j2, exc);
        }
    }
}
