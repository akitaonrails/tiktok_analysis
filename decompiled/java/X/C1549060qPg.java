package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings;
import java.util.Map;
import kotlin.jvm.internal.AFwS308S0000000_23;
import kotlin.jvm.internal.AwS70S2100000_23;

/* JADX INFO: renamed from: X.0qPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549060qPg {
    public static volatile boolean LIZ;
    public static final C1547470qN7 LIZIZ = new C1547470qN7(null);
    public static final C1549080qPi LIZJ = new C1549080qPi();

    public static void LIZ(SchemaParserData schemaParserData) {
        LIZ = false;
        String str = MinisConfigSettings.LIZ().gameMainFrameUrl;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            int i = C2187451AjH.LIZ;
            return;
        }
        C1547430qN3 c1547430qN3 = C1547430qN3.LIZ;
        C1547470qN7 c1547470qN7 = LIZIZ;
        final C1549080qPi c1549080qPi = LIZJ;
        c1547430qN3.getClass();
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadMainFrame, schemaData:");
        sbLIZ.append(schemaParserData);
        sbLIZ.append(", url:");
        sbLIZ.append(str);
        sbLIZ.append(", runtime:");
        sbLIZ.append(c1547470qN7);
        C2188811AlT.LIZIZ(sbLIZ);
        String str2 = schemaParserData.clientKey;
        if (str2 != null && str2.length() != 0) {
            SparkContext sparkContextLIZLLL = C1547430qN3.LIZLLL(C1547430qN3.LJ(str, str2, ""), c1547470qN7);
            C1873320yqg.LLILZ = new InterfaceC1549100qPk() { // from class: X.0qPj
                @Override // X.InterfaceC1549100qPk
                public final void LIZ(EnumC1874010yrn enumC1874010yrn, Map map) {
                    if (enumC1874010yrn == EnumC1874010yrn.MAIN_FRAME_READY) {
                        InterfaceC1549110qPl interfaceC1549110qPl = c1549080qPi;
                        if (interfaceC1549110qPl != null) {
                            interfaceC1549110qPl.LIZ("H5Event", true);
                        }
                        C1873320yqg.LLILZ = null;
                    }
                }
            };
            C1543490qGh.LIZIZ(C1873320yqg.class, null, 6);
            C1537060q6K.LJIIJJI(C1529590puH.LIZ, str2, "minis", sparkContextLIZLLL, new C1537070q6L() { // from class: X.0qPh
                @Override // X.C1537070q6L
                public final void LIZ(String str3, C1537080q6M c1537080q6M) {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("preloadMainFrame, onFetchFailed, schema:");
                    sbLIZ2.append(str3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    InterfaceC1549110qPl interfaceC1549110qPl = c1549080qPi;
                    if (interfaceC1549110qPl != null) {
                        interfaceC1549110qPl.LIZ("onFetchFailed", false);
                    }
                }

                @Override // X.C1537070q6L
                public final void LIZIZ(String str3, String str4, InterfaceC1105930esx interfaceC1105930esx) {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("preloadMainFrame, onFetchSuccess, schema:");
                    sbLIZ2.append(str3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }

                @Override // X.C1537070q6L
                public final void LIZJ(String str3, String str4, C1537080q6M c1537080q6M) {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("preloadMainFrame, onPreloadFailed, schema:");
                    sbLIZ2.append(str3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    InterfaceC1549110qPl interfaceC1549110qPl = c1549080qPi;
                    if (interfaceC1549110qPl != null) {
                        interfaceC1549110qPl.LIZ("onPreloadFailed", false);
                    }
                }

                @Override // X.C1537070q6L
                public final void LIZLLL(String str3, String str4, InterfaceC1105930esx interfaceC1105930esx) {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("preloadMainFrame, onPreloadSuccess, schema:");
                    sbLIZ2.append(str3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }, false, null, 48);
            return;
        }
        if (c1549080qPi == null) {
            return;
        }
        c1549080qPi.LIZ("clientKey empty", false);
    }

    public static void LIZIZ(SchemaParserData schemaParserData) {
        String str;
        String str2 = MinisConfigSettings.LIZ().gameMainFrameUrl;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            int i = C2187451AjH.LIZ;
            return;
        }
        C1547430qN3 c1547430qN3 = C1547430qN3.LIZ;
        C1547470qN7 c1547470qN7 = LIZIZ;
        c1547430qN3.getClass();
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerMainFramePreload, url:");
        sbLIZ.append(str2);
        sbLIZ.append(", runtime:");
        sbLIZ.append(c1547470qN7);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str2.length() != 0 && c1547470qN7 != null && (str = schemaParserData.clientKey) != null && str.length() != 0) {
            C1097680efe c1097680efe = new C1097680efe();
            c1097680efe.LJIIZILJ = true;
            c1097680efe.LIZ = "minis";
            c1097680efe.LJIJ = 1;
            c1097680efe.LJIJI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            c1097680efe.LJIIIIZZ = AFwS308S0000000_23.get$arr$(26);
            c1097680efe.LJIJJ = new AwS70S2100000_23(str2, str, c1547470qN7, 0);
            c1097680efe.LJ = false;
            c1097680efe.LJJ = false;
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
        }
    }
}
