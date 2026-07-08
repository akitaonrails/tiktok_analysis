package X;

import android.content.MutableContextWrapper;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.network.SingletonWebView;
import com.ss.android.ugc.aweme.ad.preload.prewarm.LandPageWarmExperiment;
import com.ss.android.ugc.aweme.ad.preload.prewarm.LandPageWarmV2Experiment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import defpackage.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0dFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043080dFa extends AbstractC1037060d5s {
    public static C1064810dod LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static long LJ;
    public static boolean LJFF;
    public static final C1043080dFa LIZ = new C1043080dFa();
    public static final C1043070dFZ LJI = new InterfaceC1037120d5y() { // from class: X.0dFZ
        @Override // X.InterfaceC1037120d5y
        public final String getTag() {
            return "preCreateWebviewTask";
        }

        @Override // X.InterfaceC1037120d5y
        public final C0CFU getType() {
            return C0CFU.COMMON;
        }

        @Override // X.InterfaceC1037120d5y
        public final EnumC1002230cBh LIZ(C1037110d5x c1037110d5x) {
            C1043080dFa c1043080dFa = C1043080dFa.LIZ;
            List<C1024760cm2> list = c1037110d5x.LIZJ;
            LandPageWarmExperiment.IABExtraCreateWebviewConfig iABExtraCreateWebviewConfig = LandPageWarmExperiment.LIZIZ().extraCreateWebviewConfig;
            if (iABExtraCreateWebviewConfig != null && iABExtraCreateWebviewConfig.enable && iABExtraCreateWebviewConfig.interval > 0 && iABExtraCreateWebviewConfig.type == 0 && C1043080dFa.LIZLLL) {
                if (!C1043080dFa.LJFF(iABExtraCreateWebviewConfig, list)) {
                    Objects.toString(iABExtraCreateWebviewConfig.ea);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<C1024760cm2> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LIZLLL);
                    }
                } else if (System.currentTimeMillis() - C1043080dFa.LJ > iABExtraCreateWebviewConfig.interval * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                    C1043080dFa.LIZLLL = false;
                }
            }
            if (C1043080dFa.LIZLLL) {
                return EnumC1002230cBh.DONE;
            }
            return EnumC1002230cBh.READY;
        }

        @Override // X.InterfaceC1037120d5y
        public final String LIZIZ(C1037110d5x c1037110d5x) {
            C1043080dFa.LIZLLL = true;
            C1043080dFa.LJ = System.currentTimeMillis();
            try {
                C844470XAv.LIZ.getClass();
                C1043080dFa.LIZIZ = new C1064810dod(new MutableContextWrapper(C844470XAv.LIZ()));
                if (!C1043080dFa.LJFF) {
                    C1043080dFa.LJFF = true;
                    C1064810dod c1064810dod = C1043080dFa.LIZIZ;
                    if (c1064810dod != null) {
                        SingletonWebView.INSTANCE.setWebView(c1064810dod);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (!((Boolean) LandPageWarmV2Experiment.LIZLLL.getValue()).booleanValue()) {
                C1043080dFa.LIZIZ = null;
                return "preCreateWebviewTask";
            }
            return "preCreateWebviewTask";
        }
    };
    public static final C1043060dFY LJII = new InterfaceC1037120d5y() { // from class: X.0dFY
        public final String LIZ;
        public final C0CFU LIZIZ;

        public static boolean LIZJ() {
            LandPageWarmExperiment.IABExtraCreateWebviewConfig iABExtraCreateWebviewConfig;
            C1043080dFa c1043080dFa = C1043080dFa.LIZ;
            if (!C1043080dFa.LJ() || (iABExtraCreateWebviewConfig = LandPageWarmExperiment.LIZIZ().extraCreateWebviewConfig) == null) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1064810dod c1064810dod = C1043080dFa.LIZIZ;
            return jCurrentTimeMillis - (c1064810dod != null ? c1064810dod.getLastLoadUrlTimestamp() : 0L) < iABExtraCreateWebviewConfig.interval * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }

        {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C1043080dFa c1043080dFa = C1043080dFa.LIZ;
            sbLIZ.append("IABPreWarm_pure_webview");
            sbLIZ.append("_load_url");
            this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
            this.LIZIZ = C0CFU.COMMON;
        }

        @Override // X.InterfaceC1037120d5y
        public final String getTag() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1037120d5y
        public final C0CFU getType() {
            return this.LIZIZ;
        }

        @Override // X.InterfaceC1037120d5y
        public final EnumC1002230cBh LIZ(C1037110d5x c1037110d5x) {
            LandPageWarmExperiment.IABExtraCreateWebviewConfig iABExtraCreateWebviewConfig;
            List<C1024760cm2> list = c1037110d5x.LIZJ;
            C1043080dFa c1043080dFa = C1043080dFa.LIZ;
            if (C1043080dFa.LJ() && (iABExtraCreateWebviewConfig = LandPageWarmExperiment.LIZIZ().extraCreateWebviewConfig) != null && C1043080dFa.LIZIZ != null && C1043080dFa.LIZJ) {
                if (!C1043080dFa.LJFF(iABExtraCreateWebviewConfig, list)) {
                    Objects.toString(iABExtraCreateWebviewConfig.ea);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<C1024760cm2> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LIZLLL);
                    }
                } else {
                    System.currentTimeMillis();
                    C1064810dod c1064810dod = C1043080dFa.LIZIZ;
                    if (c1064810dod != null) {
                        c1064810dod.getLastLoadUrlTimestamp();
                    }
                    if (!LIZJ()) {
                        C1043080dFa.LIZJ = false;
                    }
                }
            }
            if (C1043080dFa.LIZJ) {
                return EnumC1002230cBh.DONE;
            }
            return EnumC1002230cBh.READY;
        }

        @Override // X.InterfaceC1037120d5y
        public final String LIZIZ(C1037110d5x c1037110d5x) {
            C1043080dFa.LIZJ = true;
            C1043080dFa c1043080dFa = C1043080dFa.LIZ;
            C1064810dod c1064810dod = C1043080dFa.LIZIZ;
            if (LIZJ()) {
                return this.LIZ;
            }
            if (c1064810dod == null) {
                C1AF0.LJ(new RuntimeException("preCreateWebview is null"));
            } else {
                String str = "about:blank";
                if (C794280VDu.LIZ(c1064810dod, "monitor")) {
                    c1064810dod.loadUrl("about:blank");
                } else {
                    String strOnLoadUrl = C822560WOo.LIZ.onLoadUrl(c1064810dod, "about:blank");
                    if (!TextUtils.isEmpty(strOnLoadUrl)) {
                        str = strOnLoadUrl;
                    }
                    c1064810dod.loadUrl(str);
                }
            }
            if (!C1043080dFa.LJ() && !C1043080dFa.LIZLLL()) {
                C1043080dFa.LIZIZ = null;
            }
            return this.LIZ;
        }
    };
    public static final C1043050dFX LJIIIIZZ = new InterfaceC1037120d5y() { // from class: X.0dFX
        public final String LIZ;
        public long LIZIZ;
        public boolean LIZJ;

        {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C1043080dFa c1043080dFa = C1043080dFa.LIZ;
            sbLIZ.append("IABPreWarm_pure_webview");
            sbLIZ.append("_eval_js");
            this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.InterfaceC1037120d5y
        public final String getTag() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1037120d5y
        public final C0CFU getType() {
            return C0CFU.COMMON;
        }

        @Override // X.InterfaceC1037120d5y
        public final EnumC1002230cBh LIZ(C1037110d5x c1037110d5x) {
            List<C1024760cm2> list = c1037110d5x.LIZJ;
            LandPageWarmExperiment.IABExtraCreateWebviewConfig iABExtraCreateWebviewConfig = LandPageWarmExperiment.LIZIZ().extraCreateWebviewConfig;
            if (iABExtraCreateWebviewConfig != null) {
                C1043080dFa c1043080dFa = C1043080dFa.LIZ;
                if (C1043080dFa.LIZIZ != null && this.LIZJ) {
                    if (!C1043080dFa.LJFF(iABExtraCreateWebviewConfig, list)) {
                        Objects.toString(iABExtraCreateWebviewConfig.ea);
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<C1024760cm2> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().LIZLLL);
                        }
                    } else if (System.currentTimeMillis() - this.LIZIZ >= iABExtraCreateWebviewConfig.interval * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                        this.LIZJ = false;
                    }
                }
            }
            if (this.LIZJ) {
                return EnumC1002230cBh.DONE;
            }
            return EnumC1002230cBh.READY;
        }

        @Override // X.InterfaceC1037120d5y
        public final String LIZIZ(C1037110d5x c1037110d5x) {
            this.LIZJ = true;
            this.LIZIZ = System.currentTimeMillis();
            C1043080dFa c1043080dFa = C1043080dFa.LIZ;
            C1064810dod c1064810dod = C1043080dFa.LIZIZ;
            if (c1064810dod == null) {
                C1AF0.LJ(new RuntimeException("eval js but webview is null!!"));
            } else {
                C1544770qIl.LIZ(c1064810dod, new k() { // from class: X.0dFb
                });
            }
            return this.LIZ;
        }
    };
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(100));

    @Override // X.InterfaceC1037120d5y
    public final String getTag() {
        return "IABPreWarm_pure_webview";
    }

    @Override // X.AbstractC1037060d5s
    public final List<InterfaceC1037120d5y> LIZJ() {
        return (List) LJIIIZ.getValue();
    }

    public static boolean LIZLLL() {
        LandPageWarmExperiment.IABExtraCreateWebviewConfig iABExtraCreateWebviewConfig = LandPageWarmExperiment.LIZIZ().extraCreateWebviewConfig;
        return iABExtraCreateWebviewConfig != null && iABExtraCreateWebviewConfig.enable && iABExtraCreateWebviewConfig.interval > 0 && iABExtraCreateWebviewConfig.type == 2;
    }

    public static boolean LJ() {
        LandPageWarmExperiment.IABExtraCreateWebviewConfig iABExtraCreateWebviewConfig = LandPageWarmExperiment.LIZIZ().extraCreateWebviewConfig;
        return iABExtraCreateWebviewConfig != null && iABExtraCreateWebviewConfig.enable && iABExtraCreateWebviewConfig.interval > 0 && iABExtraCreateWebviewConfig.type == 1;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IABPreWarmPureWebviewTask(hasPreCreateWebview=");
        sbLIZ.append(LIZLLL);
        sbLIZ.append(", hasLoadUrl=");
        sbLIZ.append(LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJFF(LandPageWarmExperiment.IABExtraCreateWebviewConfig iABExtraCreateWebviewConfig, List list) {
        List<Long> list2 = iABExtraCreateWebviewConfig.ea;
        if (list2 != null) {
            Iterator<Long> it2 = list2.iterator();
            while (it2.hasNext()) {
                long jLongValue = it2.next().longValue();
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Long l = ((C1024760cm2) it3.next()).LIZLLL;
                        if (l == null || l.longValue() != jLongValue) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
