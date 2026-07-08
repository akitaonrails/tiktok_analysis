package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.core.ab.LynxCardModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.LynxOptModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpIntegrateLynxAirModel;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0qLN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546390qLN {
    public static int LJII;
    public static boolean LJIIIIZZ;
    public static final C1546390qLN LIZ = new C1546390qLN();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final Set<String> LIZLLL = new LinkedHashSet();
    public static final List<LynxCardModel> LJ = new ArrayList();
    public static final List<PdpIntegrateLynxAirModel> LJFF = new ArrayList();
    public static final Set<String> LJI = new LinkedHashSet();
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(235));
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(236));
    public static final C1554480qYQ LJIIJJI = new C1554480qYQ(CoroutineExceptionHandler.LJJLIL, 0);

    static {
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel;
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel2;
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel3;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel4 = C04IW.LIZ;
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel5 = (PdpIntegrateLynxAirModel) c0c64LJIILLIIL.LJJII(PdpIntegrateLynxAirModel.class, pdpIntegrateLynxAirModel4, "ec_anchor_pdp_integrate_lynx_air_review", true);
        if (pdpIntegrateLynxAirModel5 == null) {
            pdpIntegrateLynxAirModel5 = pdpIntegrateLynxAirModel4;
        }
        if (pdpIntegrateLynxAirModel5.totalSwitch == 1 && (pdpIntegrateLynxAirModel3 = (PdpIntegrateLynxAirModel) C0C64.LJIILLIIL().LJJII(PdpIntegrateLynxAirModel.class, pdpIntegrateLynxAirModel4, "ec_anchor_pdp_integrate_lynx_air_review", true)) != null) {
            pdpIntegrateLynxAirModel4 = pdpIntegrateLynxAirModel3;
        }
        LIZIZ(pdpIntegrateLynxAirModel4);
        C0C64 c0c64LJIILLIIL2 = C0C64.LJIILLIIL();
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel6 = C1546440qLS.LIZ;
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel7 = (PdpIntegrateLynxAirModel) c0c64LJIILLIIL2.LJJII(PdpIntegrateLynxAirModel.class, pdpIntegrateLynxAirModel6, "ec_anchor_pdp_integrate_lynx_air_detail", true);
        if (pdpIntegrateLynxAirModel7 == null) {
            pdpIntegrateLynxAirModel7 = pdpIntegrateLynxAirModel6;
        }
        if (pdpIntegrateLynxAirModel7.totalSwitch == 1 && (pdpIntegrateLynxAirModel2 = (PdpIntegrateLynxAirModel) C0C64.LJIILLIIL().LJJII(PdpIntegrateLynxAirModel.class, pdpIntegrateLynxAirModel6, "ec_anchor_pdp_integrate_lynx_air_detail", true)) != null) {
            pdpIntegrateLynxAirModel6 = pdpIntegrateLynxAirModel2;
        }
        LIZIZ(pdpIntegrateLynxAirModel6);
        LIZIZ(C04IL.LIZIZ());
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel8 = C1546450qLT.LIZ;
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel9 = (PdpIntegrateLynxAirModel) settingsManagerLIZLLL.LJIIIIZZ("ec_anchor_pdp_integrate_lynx_air_spotlight_recommend", PdpIntegrateLynxAirModel.class, pdpIntegrateLynxAirModel8);
        if (pdpIntegrateLynxAirModel9 == null) {
            pdpIntegrateLynxAirModel9 = pdpIntegrateLynxAirModel8;
        }
        if (pdpIntegrateLynxAirModel9.totalSwitch == 1 && (pdpIntegrateLynxAirModel = (PdpIntegrateLynxAirModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_anchor_pdp_integrate_lynx_air_spotlight_recommend", PdpIntegrateLynxAirModel.class, pdpIntegrateLynxAirModel8)) != null) {
            pdpIntegrateLynxAirModel8 = pdpIntegrateLynxAirModel;
        }
        LIZIZ(pdpIntegrateLynxAirModel8);
    }

    public static ExecutorService LIZJ() {
        return (ExecutorService) LJIIJ.getValue();
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static void LIZIZ(PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel) {
        Integer num;
        if (pdpIntegrateLynxAirModel.totalSwitch == 1) {
            LJIIIIZZ = true;
            List<String> list = pdpIntegrateLynxAirModel.geckoChannels;
            if (list != null) {
                LIZLLL.addAll(list);
            }
            List<LynxCardModel> list2 = pdpIntegrateLynxAirModel.renderCardList;
            if (list2 != null) {
                LynxOptModel lynxOptModel = pdpIntegrateLynxAirModel.opt;
                if (lynxOptModel != null && (num = lynxOptModel.enablePreDecode) != null && num.intValue() == 1) {
                    ((ArrayList) LJ).addAll(list2);
                }
                for (LynxCardModel lynxCardModel : list2) {
                    if (C770702zh.LIZIZ(lynxCardModel.cardName)) {
                        LJI.add(lynxCardModel.cardName);
                    }
                }
            }
            ((ArrayList) LJFF).add(pdpIntegrateLynxAirModel);
        }
    }

    public static void LIZLLL(C1546390qLN c1546390qLN, int i, int i2, String str, Integer num, String str2, int i3) {
        if ((i3 & 8) != 0) {
            str = null;
        }
        if ((i3 & 128) != 0) {
            num = null;
        }
        if ((i3 & 256) != 0) {
            str2 = null;
        }
        c1546390qLN.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("type", "gecko_update"), new Pair("result", Integer.valueOf(i)), new Pair("preload_scene", Integer.valueOf(i2)));
        if (str != null) {
            mapLJIIJ.put("channel", str);
        }
        if (num != null) {
            mapLJIIJ.put("error_code", Integer.valueOf(num.intValue()));
        }
        if (str2 != null) {
            mapLJIIJ.put("error_msg", str2);
        }
        C1018703yb.LJ("rd_tiktokec_pdp_preload_resource", mapLJIIJ);
    }
}
