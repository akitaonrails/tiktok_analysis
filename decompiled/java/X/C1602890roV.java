package X;

import com.ss.android.ugc.aweme.feed.experiment.ProductLoadmoreConfigModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0roV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602890roV {
    public final C092O<String> LIZ;
    public final C054G LIZIZ;
    public int LIZJ;
    public final ProductLoadmoreConfigModel LIZLLL;
    public volatile C1603050rol LJ;
    public AnonymousClass0956 LJFF;

    public C1602890roV(C1603110ror c1603110ror) {
        this.LIZ = c1603110ror;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()).plus(new C1770006wU(CoroutineExceptionHandler.LJJLIL, 15)));
        this.LIZLLL = C1603060rom.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1602890roV.LIZIZ(X.05Vn):java.lang.Object");
    }

    public final void LIZ(int i, int i2) {
        int iLIZ;
        if (!((Boolean) C284080BBm.LIZ.getValue()).booleanValue()) {
            return;
        }
        if (C1512970pTT.LIZ(((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getEffectiveConnectionType())) {
            iLIZ = ((EnumC1512990pTV) C1512970pTT.LIZIZ.getValue()).getCountWhenPreload();
        } else if (((Boolean) C1610160s0E.LIZIZ.getValue()).booleanValue()) {
            iLIZ = C1610160s0E.LIZ();
        } else {
            iLIZ = C301820BsK.LIZ;
        }
        if (iLIZ < 1) {
            iLIZ = 3;
        }
        if (i >= i2 - iLIZ || (i == i2 - 1 && i2 <= 3)) {
            this.LIZ.accept("v2_failed_prefetch");
        }
    }
}
