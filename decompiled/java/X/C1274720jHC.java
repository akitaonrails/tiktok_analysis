package X;

import Y.ARunnableS53S0300000_20;
import android.os.Handler;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;

/* JADX INFO: renamed from: X.0jHC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1274720jHC implements InterfaceC1274710jHB {
    public final /* synthetic */ C1274840jHO LIZ;

    public C1274720jHC(C1274840jHO c1274840jHO) {
        this.LIZ = c1274840jHO;
    }

    @Override // X.InterfaceC1274710jHB
    public final void LIZJ(InterfaceC1276380jJs interfaceC1276380jJs, LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
        Handler handlerLIZJ = C1274690jH9.LIZJ();
        if (handlerLIZJ != null && handlerLIZJ.getLooper().getThread() != C786410Ut5.u3()) {
            C786410Ut5.LJJZZIII(handlerLIZJ, new ARunnableS53S0300000_20(interfaceC1276380jJs, lyraxTranscoderFeatureEvent, this, 54));
            return;
        }
        InterfaceC1274710jHB interfaceC1274710jHB = this.LIZ.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZJ(interfaceC1276380jJs, lyraxTranscoderFeatureEvent);
        }
    }

    @Override // X.InterfaceC1274710jHB
    public final void LIZ(InterfaceC1276380jJs interfaceC1276380jJs, int i, long j, long j2, Object... objArr) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(interfaceC1276380jJs, "client");
        C1274840jHO.LJLJI(Integer.valueOf(i), "code1");
        C1274840jHO.LJLJI(Long.valueOf(j), "code2");
        C1274840jHO.LJLJI(Long.valueOf(j2), "code3");
        C1274840jHO.LJLJI(objArr, "obj");
        c1274840jHO.getClass();
        InterfaceC1274710jHB interfaceC1274710jHB = this.LIZ.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(interfaceC1276380jJs, i, j, j2, objArr);
        }
    }

    @Override // X.InterfaceC1274710jHB
    public final void LIZIZ(InterfaceC1276380jJs interfaceC1276380jJs, int i, long j, long j2, Exception exc) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(interfaceC1276380jJs, "client");
        C1274840jHO.LJLJI(Integer.valueOf(i), "code1");
        C1274840jHO.LJLJI(Long.valueOf(j), "code2");
        C1274840jHO.LJLJI(Long.valueOf(j2), "code3");
        C1274840jHO.LJLJI(exc, "msg");
        c1274840jHO.getClass();
        InterfaceC1274710jHB interfaceC1274710jHB = this.LIZ.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZIZ(interfaceC1276380jJs, i, j, j2, exc);
        }
    }
}
