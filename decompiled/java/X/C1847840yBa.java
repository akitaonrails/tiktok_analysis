package X;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.IAppContextService;
import com.bytedance.ies.ugc.statisticlogger.experiment.NxETAllReferSettings;
import com.bytedance.ies.ugc.statisticlogger.experiment.NxETAutoTestExp;
import com.bytedance.ies.ugc.statisticlogger.experiment.NxETMapExperiment;
import com.bytedance.ies.ugc.statisticlogger.experiment.NxETMultiReferSettings;
import com.bytedance.ies.ugc.statisticlogger.experiment.NxETProPageForceListExp;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.router.RouteManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.eventtracing.INxetOfflineSwitch;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.nxet.ISSCNxETEventService;
import com.ss.android.ugc.aweme.nxet.event.EventDispatch;
import com.ss.android.ugc.aweme.nxet.info.NxETEventMap;
import com.ss.android.ugc.aweme.nxet.info.NxETUIAutomationManager;
import com.ss.android.ugc.aweme.nxet.vtree.v2.VTreeBuildManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847840yBa {
    public static boolean LIZIZ;
    public static final C1847840yBa LIZ = new C1847840yBa();
    public static final C1847480yB0 LIZJ = new C1847480yB0();
    public static int LIZLLL = 5;

    public static void LIZ(Application application) {
        boolean z;
        InterfaceC1845190y7J interfaceC1845190y7J;
        IAppContextService iAppContextService;
        boolean z2;
        boolean z3;
        Activity activity;
        C19EG c19eg;
        InterfaceC1847650yBH interfaceC1847650yBH;
        InterfaceC1847650yBH interfaceC1847650yBH2;
        ISSCNxETEventService iSSCNxETEventService;
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        C0DOS.LIZ.getClass();
        C1848410yCV.LIZJ = SystemClock.uptimeMillis();
        if (!C1848500yCe.LIZ) {
            C1848500yCe.LIZ = true;
            C1845140y7E c1845140y7E = C1845140y7E.LIZ;
            c1845140y7E.getClass();
            C1847950yBl c1847950yBl = C1847860yBc.LLILLJJLI;
            c1847950yBl.LIZJ.LIZ(c1845140y7E);
            VTreeBuildManager vTreeBuildManager = VTreeBuildManager.LIZ;
            C1847990yBp.LIZLLL.LIZ = vTreeBuildManager;
            c1847950yBl.LIZJ.LIZ(vTreeBuildManager);
            c1847950yBl.LIZJ.LIZ(new InterfaceC1848190yC9() { // from class: X.0yBk
                @Override // X.InterfaceC1848190yC9
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1848190yC9
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1848190yC9
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC1848190yC9
                public final void LLLZIL() {
                }

                @Override // X.InterfaceC1848190yC9
                public final void LLLZL() {
                }

                @Override // X.InterfaceC1848190yC9
                public final void LLLZLL() {
                }

                @Override // X.InterfaceC1848190yC9
                public final void LLLZZ(C1847620yBE c1847620yBE) {
                }

                @Override // X.InterfaceC1848190yC9
                public final void LLZ(Activity activity2, Dialog dialog) {
                }

                @Override // X.InterfaceC1848190yC9
                public final void LLZIL(C1847620yBE c1847620yBE) {
                }

                @Override // X.InterfaceC1848190yC9
                public final void LLZILL(Activity activity2, Dialog dialog) {
                }

                @Override // X.InterfaceC1848190yC9
                public final void LLZL(Activity activity2) {
                }

                @Override // X.InterfaceC1848190yC9
                public final void LLZLI(C1847620yBE c1847620yBE) {
                }

                @Override // X.InterfaceC1848190yC9
                public final void LLLZLZ(View view) {
                    C1847740yBQ c1847740yBQLIZIZ = C1846620y9c.LIZIZ(view);
                    if (c1847740yBQLIZIZ != null && c1847740yBQLIZIZ.LIZJ(EnumC1847910yBh.CLICK)) {
                        EventDispatch.ExposureHandler exposureHandler = EventDispatch.LIZ;
                        EventDispatch.LIZ(new C1847930yBj(view, EnumC1847910yBh.CLICK, null, C2097608Jq.LJ()));
                    }
                }

                @Override // X.InterfaceC1848190yC9
                public final void LLLZZIL(View view) {
                    C1847740yBQ c1847740yBQLIZIZ = C1846620y9c.LIZIZ(view);
                    if (c1847740yBQLIZIZ != null && c1847740yBQLIZIZ.LIZJ(EnumC1847910yBh.CLICK)) {
                        EventDispatch.ExposureHandler exposureHandler = EventDispatch.LIZ;
                        EventDispatch.LIZJ(view, EnumC1847910yBh.CLICK, null, true);
                    }
                }
            });
        }
        C1848080yBy c1848080yBy = new C1848080yBy();
        c1848080yBy.LIZIZ = new InterfaceC1848430yCX() { // from class: X.0C2p
            @Override // X.InterfaceC1848430yCX
            public final String LIZ() {
                return Keva.getRepo("nxet_repo").getString("session_id", "");
            }

            @Override // X.InterfaceC1848430yCX
            public final String LIZIZ() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append('#');
                sbLIZ.append(AbstractC19994813Le.Default.nextInt(100, LSPassThroughRecordSizeConfig.DEFAULT));
                sbLIZ.append('#');
                IAppContextService iAppContextService2 = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
                sbLIZ.append(iAppContextService2 != null ? Long.valueOf(iAppContextService2.getVersionCode()) : null);
                sbLIZ.append('#');
                sbLIZ.append(C307260C2q.LIZ.LIZIZ());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Keva.getRepo("nxet_repo").storeString("session_id", strLIZIZ);
                return strLIZIZ;
            }
        };
        c1848080yBy.LJFF = new InterfaceC1847650yBH() { // from class: X.0uNq
            @Override // X.InterfaceC1847650yBH
            public final void LIZ(Runnable runnable) {
                C823050WQl.LIZIZ().submit(runnable);
            }

            @Override // X.InterfaceC1847650yBH
            public final void LIZIZ(Runnable runnable) {
                C823050WQl.LIZLLL().submit(runnable);
            }
        };
        c1848080yBy.LJ = new InterfaceC1848440yCY() { // from class: X.0511
            public Keva LIZ;

            public final Keva LIZIZ() {
                if (this.LIZ == null) {
                    synchronized (this) {
                        try {
                            if (this.LIZ == null) {
                                this.LIZ = KevaImpl.getRepo("repo_nxet", 0);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                return this.LIZ;
            }

            @Override // X.InterfaceC1848440yCY
            public final String getStringValue(String str) {
                Keva kevaLIZIZ = LIZIZ();
                if (kevaLIZIZ != null) {
                    return kevaLIZIZ.getString(str, "");
                }
                return null;
            }

            @Override // X.InterfaceC1848440yCY
            public final void LIZ(Object obj, String str) {
                Keva kevaLIZIZ;
                if (obj instanceof Integer) {
                    Keva kevaLIZIZ2 = LIZIZ();
                    if (kevaLIZIZ2 != null) {
                        kevaLIZIZ2.storeInt(str, ((Number) obj).intValue());
                        return;
                    }
                    return;
                }
                if (obj instanceof Long) {
                    Keva kevaLIZIZ3 = LIZIZ();
                    if (kevaLIZIZ3 == null) {
                        return;
                    }
                    kevaLIZIZ3.storeLong(str, ((Number) obj).longValue());
                    return;
                }
                if (obj instanceof Float) {
                    Keva kevaLIZIZ4 = LIZIZ();
                    if (kevaLIZIZ4 == null) {
                        return;
                    }
                    kevaLIZIZ4.storeFloat(str, ((Number) obj).floatValue());
                    return;
                }
                if (obj instanceof Double) {
                    Keva kevaLIZIZ5 = LIZIZ();
                    if (kevaLIZIZ5 == null) {
                        return;
                    }
                    kevaLIZIZ5.storeDouble(str, ((Number) obj).doubleValue());
                    return;
                }
                if (obj instanceof Boolean) {
                    Keva kevaLIZIZ6 = LIZIZ();
                    if (kevaLIZIZ6 == null) {
                        return;
                    }
                    kevaLIZIZ6.storeBoolean(str, ((Boolean) obj).booleanValue());
                    return;
                }
                if (!(obj instanceof String) || (kevaLIZIZ = LIZIZ()) == null) {
                    return;
                }
                kevaLIZIZ.storeString(str, (String) obj);
            }
        };
        c1848080yBy.LIZLLL = new InterfaceC1845190y7J() { // from class: X.0yAz
            public static String LIZLLL(String str) {
                int iLJJJ = a0.LJJJ(str, ":", 0, false, 6);
                if (iLJJJ > 0 && iLJJJ < str.length()) {
                    str = str.substring(iLJJJ + 1);
                }
                String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(str, "//", "", false), "/", "_", false), "*", "", false);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("page_route_");
                sbLIZ.append(strLJJIFFI);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1845190y7J
            public final Pair<String, String> LIZ(Fragment fragment) {
                String first;
                String second;
                C19EG activity2;
                InterfaceC1740760vOs interfaceC1740760vOs;
                String btmPageCode;
                if ((fragment instanceof InterfaceC1740760vOs) && (btmPageCode = (interfaceC1740760vOs = (InterfaceC1740760vOs) fragment).getBtmPageCode()) != null && btmPageCode.length() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("page_btm_");
                    sbLIZ.append(interfaceC1740760vOs.getBtmPageCode());
                    first = C2188811AlT.LIZIZ(sbLIZ);
                    second = "native_btm";
                } else {
                    String strLIZ = C1847840yBa.LIZJ.LIZ(fragment);
                    if (strLIZ != null && strLIZ.length() != 0) {
                        first = LIZLLL(strLIZ);
                        second = "native_route";
                    } else if (C307150C2f.LIZ != 1 || ((Boolean) C307160C2g.LIZ.getValue()).booleanValue() || (activity2 = fragment.getActivity()) == null || fragment.getParentFragment() != null || LIZIZ(activity2).getFirst().length() != 0) {
                        first = "";
                        second = "";
                    } else {
                        Pair<String, String> pairLIZJ = LIZJ(fragment);
                        first = pairLIZJ.getFirst();
                        second = pairLIZJ.getSecond();
                    }
                }
                if (C307140C2e.LIZ(first)) {
                    return new Pair<>("", "");
                }
                return new Pair<>(first, second);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
            @Override // X.InterfaceC1845190y7J
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final kotlin.Pair<java.lang.String, java.lang.String> LIZIZ(android.app.Activity r6) {
                /*
                    r5 = this;
                    r0 = 1
                    java.lang.String r3 = X.C1504880pGQ.LIZ(r6, r0)
                    boolean r0 = r6 instanceof X.InterfaceC1740760vOs
                    java.lang.String r4 = "page_btm_"
                    if (r0 == 0) goto L44
                    r2 = r6
                    X.0vOs r2 = (X.InterfaceC1740760vOs) r2
                    java.lang.String r0 = r2.getBtmPageCode()
                    if (r0 == 0) goto L90
                    int r0 = r0.length()
                    if (r0 == 0) goto L90
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    r1.append(r4)
                    java.lang.String r0 = r2.getBtmPageCode()
                    r1.append(r0)
                    java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
                L2c:
                    if (r2 == 0) goto L90
                    int r0 = r2.length()
                    if (r0 == 0) goto L90
                    java.lang.String r1 = "native_btm"
                L36:
                    boolean r0 = X.C307140C2e.LIZ(r2)
                    if (r0 == 0) goto Lb9
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = ""
                    r1.<init>(r0, r0)
                    return r1
                L44:
                    X.01GW r2 = X.C0N6R.LIZ
                    java.lang.Object r0 = r2.getValue()
                    java.util.Map r0 = (java.util.Map) r0
                    boolean r0 = r0.containsKey(r3)
                    if (r0 == 0) goto L6d
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    r1.append(r4)
                    java.lang.Object r0 = r2.getValue()
                    java.util.Map r0 = (java.util.Map) r0
                    java.lang.Object r0 = r0.get(r3)
                    java.lang.String r0 = (java.lang.String) r0
                    r1.append(r0)
                    java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
                    goto L2c
                L6d:
                    java.util.Map r0 = X.C0N6R.LIZ()
                    boolean r0 = r0.containsKey(r3)
                    if (r0 == 0) goto L90
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    r1.append(r4)
                    java.util.Map r0 = X.C0N6R.LIZ()
                    java.lang.Object r0 = r0.get(r3)
                    java.lang.String r0 = (java.lang.String) r0
                    r1.append(r0)
                    java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
                    goto L2c
                L90:
                    X.0yB0 r0 = X.C1847840yBa.LIZJ
                    java.lang.String r1 = r0.LIZ(r6)
                    if (r1 == 0) goto La5
                    int r0 = r1.length()
                    if (r0 == 0) goto La5
                    java.lang.String r2 = LIZLLL(r1)
                    java.lang.String r1 = "native_route"
                    goto L36
                La5:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "page_auto_"
                    r1.append(r0)
                    r1.append(r3)
                    java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
                    java.lang.String r1 = "native_auto"
                    goto L36
                Lb9:
                    kotlin.Pair r0 = new kotlin.Pair
                    r0.<init>(r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1847470yAz.LIZIZ(android.app.Activity):kotlin.Pair");
            }

            @Override // X.InterfaceC1845190y7J
            public final Pair<String, String> LIZJ(Fragment fragment) {
                String strLIZIZ;
                String str;
                boolean z4 = true;
                String strLIZ = C1504880pGQ.LIZ(fragment, true);
                if (strLIZ.length() != 0) {
                    z4 = false;
                }
                if (z4) {
                    strLIZIZ = "";
                    str = "";
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("page_auto_");
                    sbLIZ.append(strLIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    str = "native_auto";
                }
                if (C307140C2e.LIZ(strLIZIZ)) {
                    return new Pair<>("", "");
                }
                return new Pair<>(strLIZIZ, str);
            }
        };
        c1848080yBy.LIZ = new InterfaceC1846560y9W() { // from class: X.0C2h
            public boolean LIZ = true;

            @Override // X.InterfaceC1846560y9W
            public final boolean LIZ() {
                return ((Boolean) C256630A3x.LIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1846560y9W
            public final boolean LIZIZ() {
                return ((Boolean) C256560A3q.LIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1846560y9W
            public final boolean LIZJ() {
                return ((Boolean) C307200C2k.LIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1846560y9W
            public final boolean LIZLLL() {
                return ((Boolean) C307190C2j.LIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1846560y9W
            public final int LJ() {
                IAppContextService iAppContextService2 = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
                if (iAppContextService2 == null || !iAppContextService2.LIZLLL()) {
                    return NxETAllReferSettings.INSTANCE.getSize();
                }
                INxetOfflineSwitch iNxetOfflineSwitch = (INxetOfflineSwitch) PluggableExtentionKt.pluggableSpi$default(INxetOfflineSwitch.class, false, false, false, 14, null);
                return iNxetOfflineSwitch != null ? iNxetOfflineSwitch.LIZ() : NxETAllReferSettings.INSTANCE.getSize();
            }

            @Override // X.InterfaceC1846560y9W
            public final boolean LJFF() {
                return ((Boolean) C307180C2i.LIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1846560y9W
            public final boolean LJI() {
                boolean z4 = this.LIZ;
                this.LIZ = false;
                return C307150C2f.LIZ == 1 || z4;
            }

            @Override // X.InterfaceC1846560y9W
            public final boolean LJII() {
                return ((Boolean) C307160C2g.LIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1846560y9W
            public final int LJIIIIZZ() {
                return C1847840yBa.LIZLLL;
            }
        };
        c1848080yBy.LIZJ = new InterfaceC1848350yCP() { // from class: X.0yCQ
            @Override // X.InterfaceC1848350yCP
            public final void LIZ(String str, JSONObject jSONObject, EnumC1847910yBh enumC1847910yBh) throws JSONException {
                String str2;
                boolean zBooleanValue = ((Boolean) C307230C2n.LIZ.getValue()).booleanValue();
                C1847840yBa.LIZ.getClass();
                NxETProPageForceListExp nxETProPageForceListExp = NxETProPageForceListExp.INSTANCE;
                boolean z4 = false;
                if (nxETProPageForceListExp.getValue().enable && enumC1847910yBh == EnumC1847910yBh.STAY) {
                    String strOptString = jSONObject.optString("nxet_page_name", "");
                    if (strOptString.length() > 0 && nxETProPageForceListExp.getReg().containsMatchIn(strOptString)) {
                        if (zBooleanValue) {
                            str2 = "normal";
                        } else {
                            str2 = "force";
                        }
                        jSONObject.put("_pro_page_upload_type", str2);
                        z4 = true;
                    }
                }
                if (zBooleanValue || z4) {
                    jSONObject.put("is_in_nuj_flow", C307150C2f.LIZ);
                    C20684815ws.LJIJ(str, jSONObject);
                }
            }
        };
        C1847960yBm c1847960yBm = new C1847960yBm();
        c1847960yBm.LIZ = c1848080yBy.LIZ;
        c1847960yBm.LIZIZ = c1848080yBy.LIZIZ;
        c1847960yBm.LIZJ = c1848080yBy.LIZJ;
        c1847960yBm.LIZLLL = c1848080yBy.LIZLLL;
        c1847960yBm.LJ = c1848080yBy.LJ;
        c1847960yBm.LJFF = c1848080yBy.LJFF;
        IAppContextService iAppContextService2 = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
        if (iAppContextService2 != null && iAppContextService2.LIZLLL()) {
            z = true;
        } else {
            z = false;
        }
        C1847960yBm.LJI = application;
        C1847960yBm.LJII = c1847960yBm;
        C1847960yBm.LJIIIIZZ = z;
        InterfaceC1845190y7J interfaceC1845190y7J2 = C1845200y7K.LIZ;
        C1847960yBm c1847960yBm2 = C1847960yBm.LJII;
        String simpleName = null;
        if (c1847960yBm2 != null) {
            interfaceC1845190y7J = c1847960yBm2.LIZLLL;
        } else {
            interfaceC1845190y7J = null;
        }
        C1845200y7K.LIZ = interfaceC1845190y7J;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_gecko_ssc_preload", false) && (iSSCNxETEventService = (ISSCNxETEventService) PluggableExtentionKt.pluggableSpi$default(ISSCNxETEventService.class, false, false, false, 14, null)) != null) {
            iSSCNxETEventService.LIZ();
        }
        LIZLLL = NxETMultiReferSettings.INSTANCE.getLength();
        RunnableC1847490yB1 runnableC1847490yB1 = new Runnable() { // from class: X.0yB1
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NxETInitializer@387c.delayRunTask$1");
                try {
                    C1847840yBa.LIZ.getClass();
                    Map<String, String> routeMap = RouteManager.getInstance().getRouteMap();
                    if (routeMap != null) {
                        routeMap.size();
                    }
                    C1847840yBa.LIZJ.LIZIZ = true;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NxETInitializer@387c.delayRunTask$1");
            }
        };
        C1847960yBm c1847960yBm3 = C1847960yBm.LJII;
        if (c1847960yBm3 != null && (interfaceC1847650yBH2 = c1847960yBm3.LJFF) != null) {
            interfaceC1847650yBH2.LIZ(runnableC1847490yB1);
        }
        RunnableC1847890yBf runnableC1847890yBf = new Runnable() { // from class: X.0yBf
            public static void LIZ() throws JSONException {
                InterfaceC1848350yCP interfaceC1848350yCP;
                C0DOS.LIZ.getClass();
                C1847960yBm c1847960yBm4 = C1847960yBm.LJII;
                if (c1847960yBm4 == null || (interfaceC1848350yCP = c1847960yBm4.LIZJ) == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("nxet_sessid", C1848140yC4.LIZJ.getValue());
                jSONObject.put("nxet_sidrefer", C1848140yC4.LIZIZ.getValue());
                interfaceC1848350yCP.LIZ("nxet_init", jSONObject, null);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NxETInitializer@387c.delayRunTask$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NxETInitializer@387c.delayRunTask$2");
            }
        };
        C1847960yBm c1847960yBm4 = C1847960yBm.LJII;
        if (c1847960yBm4 != null && (interfaceC1847650yBH = c1847960yBm4.LJFF) != null) {
            interfaceC1847650yBH.LIZIZ(runnableC1847890yBf);
        }
        C1906580ziK.LIZ();
        IAppContextService iAppContextService3 = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
        if ((iAppContextService3 != null && iAppContextService3.isOffline()) || ((iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null)) != null && iAppContextService.isRegressionTest())) {
            z2 = true;
        } else {
            z2 = false;
        }
        IAppContextService iAppContextService4 = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
        if (iAppContextService4 != null && iAppContextService4.isDebug()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2) {
            if (!z3) {
                NxETMapExperiment nxETMapExperiment = NxETMapExperiment.INSTANCE;
                if (nxETMapExperiment.getValue().enableMapRefer) {
                    int i = NxETEventMap.LIZ;
                    boolean z4 = nxETMapExperiment.getValue().enableSnapshot;
                    NxETEventMap.LJFF = z2;
                    NxETEventMap.LJII = z4;
                    NxETEventMap.LJ = true;
                }
            }
            if (NxETAutoTestExp.INSTANCE.getEnable()) {
                NxETUIAutomationManager.INSTANCE.init();
            }
        }
        WeakReference<Activity> weakReference = C1847990yBp.LJ;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (activity instanceof C19EG) {
            c19eg = (C19EG) activity;
        } else {
            c19eg = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doLazyFirstInit act: ");
        if (c19eg != null) {
            simpleName = c19eg.getClass().getSimpleName();
        }
        sbLIZ.append(simpleName);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c19eg != null) {
            VTreeBuildManager.LIZ.LJ();
            C1845140y7E.LIZ.LLZL(c19eg);
        }
        Application application2 = C1847960yBm.LJI;
        if (application2 != null) {
            application2.unregisterActivityLifecycleCallbacks(C1847920yBi.LL);
        }
        Application application3 = C1847960yBm.LJI;
        if (application3 != null) {
            application3.registerActivityLifecycleCallbacks(C1847860yBc.LL);
        }
        if (c19eg != null) {
            FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                supportFragmentManager.LJZL(C1847880yBe.LL, true);
            }
            C1845200y7K.LIZ(c19eg);
            ArrayList arrayList = (ArrayList) C2432009fy.LIZIZ(c19eg);
            if (true ^ arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C1845200y7K.LIZIZ((Fragment) it2.next());
                }
            }
        }
        VTreeBuildManager.LJIIL(false);
    }
}
