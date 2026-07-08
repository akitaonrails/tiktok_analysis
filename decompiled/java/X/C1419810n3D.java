package X;

import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.ugc.android.davinciresource.DavinciResource;
import com.ss.ugc.android.davinciresource.database.DBManagerFactory;
import com.ss.ugc.android.davinciresource.jni.DavinciResourceJniJNI;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.0n3D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419810n3D {
    public static final C1419810n3D LIZ = new C1419810n3D();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(330));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(331));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(332));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(329));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(824));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(325));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(326));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(405));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(370));
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(324));
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(369));
    public static final C01GW LJIIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(825));
    public static boolean LJIILIIL;

    public static TemplateSourceConfig LIZ() {
        return (TemplateSourceConfig) LJIIIIZZ.getValue();
    }

    public static void LIZLLL() {
        Object c098200Yq;
        try {
            C1419820n3E.LIZ.LIZ();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static NLEModelDownloader LIZIZ(int i) {
        if (i != EnumC1412640mre.PUGC_TEMPLATE.getValue() && i != EnumC1412640mre.UGC_TEMPLATE.getValue() && i != EnumC1412640mre.SGT.getValue() && i != EnumC1412640mre.AI_ALIVE_TEMPLATE.getValue() && i != EnumC1412640mre.AUTO_PICK_TEMPLATE.getValue()) {
            return (NLEModelDownloader) LJIIJ.getValue();
        }
        return (NLEModelDownloader) LJIIIZ.getValue();
    }

    public static final synchronized void LIZJ(InterfaceC1419480n2g interfaceC1419480n2g) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(C0CHQ.LIZ)) {
            if (C295320Bhq.LIZ()) {
                C23157095n.LIZ.LIZ(AFwS210S0000000_22.get$arr$(327));
                if (interfaceC1419480n2g != null) {
                    LIZ.getClass();
                    ((C23155095l) LJFF.getValue()).LIZ = interfaceC1419480n2g;
                }
            } else {
                C1418540n1A c1418540n1A = C1418540n1A.LIZ;
                AFwS210S0000000_22 aFwS210S0000000_22 = AFwS210S0000000_22.get$arr$(328);
                c1418540n1A.getClass();
                C1418540n1A.LIZIZ(aFwS210S0000000_22);
                if (interfaceC1419480n2g != null) {
                    LIZ.getClass();
                    ((C1419310n2P) LIZIZ.getValue()).LIZIZ = interfaceC1419480n2g;
                    ((C1419380n2W) LIZJ.getValue()).LIZLLL = interfaceC1419480n2g;
                    ((C1419510n2j) LIZLLL.getValue()).LIZJ = interfaceC1419480n2g;
                }
            }
            C2268941DrQ c2268941DrQ = C2268941DrQ.LIZ;
            LIZ.getClass();
            C2268941DrQ.LIZIZ = LIZ().templateCacheDir;
            C2268941DrQ.LIZJ = LIZ().mediaCacheDir;
            DavinciResourceJniJNI.DAVGcmCrypt_enable(true);
            DavinciResource.INSTANCE.setDbManagerFactory(new DBManagerFactory(C0CHQ.LIZ));
        }
    }

    public static void LJ(String str) {
        if (!new C0VSJ(str).exists()) {
            new C0VSJ(str).mkdirs();
        }
    }

    public static final void LJFF(String str) {
        if (LJIILIIL) {
            LIZ.getClass();
            C1419930n3P c1419930n3P = (C1419930n3P) LJ.getValue();
            c1419930n3P.getClass();
            if (str != null && str.length() != 0) {
                C369601c6 c369601c6LIZIZ = c1419930n3P.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("_isMix=0");
                if (C123100dR.LIZ(c369601c6LIZIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ)))) {
                    C369601c6 c369601c6LIZIZ2 = c1419930n3P.LIZIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append("_isMix=0");
                    c369601c6LIZIZ2.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                C369601c6 c369601c6LIZIZ3 = c1419930n3P.LIZIZ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append("_isMix=1");
                if (!C123100dR.LIZ(c369601c6LIZIZ3.LIZ(C2188811AlT.LIZIZ(sbLIZ3)))) {
                    return;
                }
                C369601c6 c369601c6LIZIZ4 = c1419930n3P.LIZIZ();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append("_isMix=1");
                c369601c6LIZIZ4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
    }
}
