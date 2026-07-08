package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService;
import com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi;
import com.ss.android.ugc.aweme.network.INetwork;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Zlv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909370Zlv implements C06AS {
    public boolean LIZ;

    @Override // X.C06AS
    public final Unit LIZ() {
        this.LIZ = false;
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final void clear() {
        this.LIZ = false;
    }

    @Override // X.C06AS
    public final Unit init() {
        this.LIZ = false;
        return Unit.LIZ;
    }

    public static InterfaceC909580ZmG LJIIIZ() {
        IMUserPortraitApi.LIZ.getClass();
        return C1730606q8.LIZ().LJ();
    }

    public static IStrategyPlatformService LJIIIIZZ() {
        return (IStrategyPlatformService) ServiceManager.get().getService(IStrategyPlatformService.class);
    }

    @Override // X.C06AS
    public final Unit LIZIZ() {
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Unit LIZLLL() {
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Unit LIZJ(C885880Yp8 c885880Yp8) {
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Object LJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (this.LIZ) {
            return Unit.LIZ;
        }
        this.LIZ = true;
        LJIIIIZZ().LJFF().LJIIJ();
        if (C296660Bk0.LIZ()) {
            Object objLJII = LJII(interfaceC1364105Vn);
            if (objLJII == C099R.LJFF()) {
                return objLJII;
            }
            return Unit.LIZ;
        }
        Object objLJI = LJI(interfaceC1364105Vn);
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Unit LJFF(C1619080sEc c1619080sEc) {
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C909370Zlv.LJI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C909370Zlv.LJII(X.05Vn):java.lang.Object");
    }

    public static boolean LJIIJ(EnumC909380Zlw enumC909380Zlw, boolean z) {
        boolean z2;
        long jLIZ;
        if (((Number) C278870AwP.LIZ.getValue()).intValue() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = "";
        if (z2) {
            InterfaceC909580ZmG interfaceC909580ZmGLJIIIZ = LJIIIZ();
            String key = enumC909380Zlw.getKey();
            long jLIZIZ = ((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ();
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            if (!interfaceC909580ZmGLJIIIZ.LIZ(jLIZIZ, key, curUserId)) {
                return false;
            }
        }
        InterfaceC909580ZmG interfaceC909580ZmGLJIIIZ2 = LJIIIZ();
        String key2 = enumC909380Zlw.getKey();
        long jLIZIZ2 = ((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ();
        if (z) {
            jLIZ = C07K2.LIZIZ(enumC909380Zlw.getKey());
        } else {
            jLIZ = C07K2.LIZ(enumC909380Zlw.getKey());
        }
        String curUserId2 = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId2 != null) {
            str = curUserId2;
        }
        boolean zLIZLLL = interfaceC909580ZmGLJIIIZ2.LIZLLL(jLIZIZ2, jLIZ, key2, str);
        if (C2213981Bky.LIZIZ.isRegressionTest()) {
            return false;
        }
        return zLIZLLL;
    }
}
