package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.128u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197078128u {
    public static final C197078128u LIZ = new C197078128u();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(45));
    public static volatile String LIZJ = "";

    /* JADX WARN: Type inference failed for: r1v10, types: [T, X.0CfT] */
    public static void LIZIZ() throws NoSuchMethodException {
        if (!((Boolean) C0ASA.LIZ.getValue()).booleanValue()) {
            LIZJ("ab closed");
            return;
        }
        if (LIZ().length() > 0 && C2286708xd.LIZJ(LIZ())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("has downloaded vq model: ");
            sbLIZ.append(LIZ());
            LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LIZJ = "";
        Map map = (Map) LIZIZ.getValue();
        if (map == null || map.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("invalid model params: ");
            sbLIZ2.append(map);
            LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        new Object() { // from class: X.128w
        }.getClass();
        if (!((IPluginService) ServiceManager.get().getService(IPluginService.class)).checkPluginInstalled("com.bytedance.tiktok.ship")) {
            LIZJ("no vqscore plugin");
            return;
        }
        LIZJ("start download vq model");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final C013C c013c = new C013C();
        C259800zU c259800zU = new C259800zU();
        try {
            Constructor<?> constructor = Class.forName("com.bytedance.bmf_mods_lite.VqscoreLive").getConstructor(new Class[0]);
            ?? r1 = (InterfaceC319330CfT) (constructor != null ? constructor.newInstance(new Object[0]) : null);
            r1.SetDownloadCallback(new InterfaceC319340CfU() { // from class: X.128v
                @Override // X.InterfaceC319340CfU
                public final void LIZ(int i, String str) {
                    boolean z;
                    C197078128u c197078128u = C197078128u.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("download vq model status: ");
                    sbLIZ3.append(i);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    c197078128u.getClass();
                    C197078128u.LIZJ(strLIZIZ);
                    C013C c013c2 = c013c;
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c013c2.element = z;
                    if (z) {
                        C197078128u.LIZJ = str;
                    }
                    countDownLatch.countDown();
                }
            });
            c259800zU.element = r1;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZJ("bmf_mods_lite.VqscoreLive is not found");
        }
        if (c259800zU.element == 0) {
            LIZJ("no VqscoreLiveApi impl");
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C576120Mig.LIZIZ.plus(new C639060P4u(CoroutineExceptionHandler.LJJLIL, 9))), null, null, new C319320CfS(c259800zU, countDownLatch, map, null), 3);
        }
    }

    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get vq model: ");
        sbLIZ.append(LIZJ);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return LIZJ;
    }

    public static void LIZJ(String str) {
        C201955140j.LIZLLL(C1424160nAE.LIZIZ, "vqscore", str);
    }
}
