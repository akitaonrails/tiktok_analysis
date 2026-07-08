package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207450hWh implements InterfaceC1207490hWl {
    public static final C1207450hWh LIZ = new C1207450hWh();

    @Override // X.InterfaceC1207490hWl
    public final boolean LJI(String str, String str2) {
        return ((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJI(str, str2);
    }

    @Override // X.InterfaceC1207490hWl
    public final boolean LJII(int i, Context context) {
        return ((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJII(i, context);
    }

    @Override // X.InterfaceC1207490hWl
    public final LocationData LJIIIIZZ(TokenCert tokenCert, TokenCert tokenCert2) {
        return ((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJIIIIZZ(tokenCert, tokenCert2);
    }

    public static void LJJ(int i, String str, Cert cert) {
        String str2 = "";
        switch (i) {
            case 100:
            case 101:
            case 102:
            case 103:
                C1207400hWc c1207400hWc = C1207400hWc.LIZ;
                if (str == null) {
                    str = "";
                }
                String strCertToken = cert.certToken();
                String strValueOf = String.valueOf(i);
                c1207400hWc.getClass();
                C1207400hWc.LJII(0, str, strCertToken, "location_sdk_reject", strValueOf);
                break;
            default:
                C1207400hWc c1207400hWc2 = C1207400hWc.LIZ;
                if (str != null) {
                    str2 = str;
                }
                String strCertToken2 = cert.certToken();
                c1207400hWc2.getClass();
                C1207400hWc.LJII(1, str2, strCertToken2, null, null);
                break;
        }
    }

    @Override // X.InterfaceC1207490hWl
    public final void LJIIL(String str, String str2, Cert cert, Cert cert2, InterfaceC687820QyS interfaceC687820QyS, Long l) {
        ((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJIIL(str, str2, cert, cert2, interfaceC687820QyS, l);
    }

    public static void LJJIFFI(final String str, final String str2, final Cert cert, final Activity activity, Fragment fragment, final C1207520hWo c1207520hWo, final InterfaceC1207030hW1 interfaceC1207030hW1) {
        String str3;
        String str4;
        String str5;
        if (PopupManager.LJI()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestLocationPermission: elementLabel: ");
            AbstractC20656215sG abstractC20656215sGLJ = PopupManager.LJ();
            String str6 = null;
            if (abstractC20656215sGLJ != null) {
                str3 = abstractC20656215sGLJ.elementLabel;
            } else {
                str3 = null;
            }
            sbLIZ.append(str3);
            sbLIZ.append(" triggerId: ");
            AbstractC20656215sG abstractC20656215sGLJ2 = PopupManager.LJ();
            if (abstractC20656215sGLJ2 != null) {
                str4 = abstractC20656215sGLJ2.triggerId;
            } else {
                str4 = null;
            }
            sbLIZ.append(str4);
            C2188811AlT.LIZIZ(sbLIZ);
            C1208440hYI.LIZ.getClass();
            C1208130hXn c1208130hXn = C1208440hYI.LIZIZ;
            AbstractC20656215sG abstractC20656215sGLJ3 = PopupManager.LJ();
            if (abstractC20656215sGLJ3 != null) {
                str5 = abstractC20656215sGLJ3.elementLabel;
            } else {
                str5 = null;
            }
            AbstractC20656215sG abstractC20656215sGLJ4 = PopupManager.LJ();
            if (abstractC20656215sGLJ4 != null) {
                str6 = abstractC20656215sGLJ4.triggerId;
            }
            c1208130hXn.LJJIFFI(null, str5, true, str6, null);
        }
        final C1208010hXb c1208010hXb = new C1208010hXb(cert, activity, fragment);
        PopupManager.LJIJ(new AbstractC20660815t0(c1208010hXb) { // from class: X.0hWk
            public final /* synthetic */ InterfaceC1207440hWg LLIZ = null;
            public final C01GW LL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(793));

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return 210;
            }

            @Override // X.InterfaceC20659015si
            public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
                InterfaceC1207490hWl interfaceC1207490hWl = (InterfaceC1207490hWl) this.LL.getValue();
                if (interfaceC1207490hWl != null) {
                    String str7 = str;
                    String str8 = str2;
                    final Cert cert2 = cert;
                    Activity activity2 = activity;
                    final C1207520hWo c1207520hWo2 = c1207520hWo;
                    final InterfaceC1207030hW1 interfaceC1207030hW12 = interfaceC1207030hW1;
                    interfaceC1207490hWl.LJIJJ(str7, str8, cert2, activity2, c1207520hWo2, new InterfaceC1207030hW1() { // from class: X.0hWn
                        @Override // X.InterfaceC1207030hW1
                        public final void LIZ() {
                            C1207450hWh c1207450hWh = C1207450hWh.LIZ;
                            Cert cert3 = cert2;
                            C1207520hWo c1207520hWo3 = c1207520hWo2;
                            String str9 = c1207520hWo3 != null ? c1207520hWo3.LIZ : null;
                            c1207450hWh.getClass();
                            C1207450hWh.LJJ(0, str9, cert3);
                            c20656615sK.LIZ();
                            InterfaceC1207030hW1 interfaceC1207030hW13 = interfaceC1207030hW12;
                            if (interfaceC1207030hW13 != null) {
                                interfaceC1207030hW13.LIZ();
                            }
                        }

                        @Override // X.InterfaceC1207030hW1
                        public final void LIZJ(int i) {
                            String str9;
                            C1207450hWh c1207450hWh = C1207450hWh.LIZ;
                            Cert cert3 = cert2;
                            C1207520hWo c1207520hWo3 = c1207520hWo2;
                            if (c1207520hWo3 != null) {
                                str9 = c1207520hWo3.LIZ;
                            } else {
                                str9 = null;
                            }
                            c1207450hWh.getClass();
                            C1207450hWh.LJJ(i, str9, cert3);
                            c20656615sK.LIZ();
                            InterfaceC1207030hW1 interfaceC1207030hW13 = interfaceC1207030hW12;
                            if (interfaceC1207030hW13 != null) {
                                interfaceC1207030hW13.LIZJ(i);
                            }
                        }

                        @Override // X.InterfaceC1207030hW1
                        public final void LIZIZ(int i, String str9) {
                            String str10;
                            C1207450hWh c1207450hWh = C1207450hWh.LIZ;
                            Cert cert3 = cert2;
                            C1207520hWo c1207520hWo3 = c1207520hWo2;
                            if (c1207520hWo3 != null) {
                                str10 = c1207520hWo3.LIZ;
                            } else {
                                str10 = null;
                            }
                            c1207450hWh.getClass();
                            C1207450hWh.LJJ(i, str10, cert3);
                            c20656615sK.LIZ();
                            InterfaceC1207030hW1 interfaceC1207030hW13 = interfaceC1207030hW12;
                            if (interfaceC1207030hW13 != null) {
                                interfaceC1207030hW13.LIZIZ(i, str9);
                            }
                        }
                    }, this.LLIZ);
                }
            }

            @Override // X.AbstractC20656215sG
            public final void showPopupFailed(int i, String str7) {
                String str8;
                super.showPopupFailed(i, str7);
                C1208440hYI.LIZ.getClass();
                C1208440hYI.LIZIZ.LJJIFFI(str7, null, PopupManager.LJI(), null, Integer.valueOf(i));
                C1207400hWc c1207400hWc = C1207400hWc.LIZ;
                C1207520hWo c1207520hWo2 = c1207520hWo;
                if (c1207520hWo2 == null || (str8 = c1207520hWo2.LIZ) == null) {
                    str8 = "";
                }
                String strCertToken = cert.certToken();
                String strValueOf = String.valueOf(i);
                c1207400hWc.getClass();
                C1207400hWc.LJII(0, str8, strCertToken, "main_framework_reject", strValueOf);
            }
        }, "location", new C1668306g5("local_permission_gps_general"));
    }

    @Override // X.InterfaceC1207490hWl
    public final void LIZLLL(TokenCert tokenCert, Activity activity, Fragment fragment, C1207520hWo c1207520hWo, InterfaceC1207030hW1 interfaceC1207030hW1, C687980Qyi c687980Qyi, InterfaceC19359210oY interfaceC19359210oY) {
        InterfaceC1207490hWl interfaceC1207490hWl = (InterfaceC1207490hWl) PluggableExtentionKt.pluggableSpi$default(ILocationService.class, false, false, false, 14, null);
        if (interfaceC1207490hWl != null) {
            interfaceC1207490hWl.LIZLLL(tokenCert, activity, fragment, c1207520hWo, interfaceC1207030hW1, c687980Qyi, interfaceC19359210oY);
        }
    }

    @Override // X.InterfaceC1207490hWl
    public final void LJIJJ(final String str, final String str2, final Cert cert, final Activity activity, final C1207520hWo c1207520hWo, final InterfaceC1207030hW1 interfaceC1207030hW1, InterfaceC1207440hWg interfaceC1207440hWg) {
        String str3;
        String str4;
        String str5;
        String str6;
        if (C849850XVn.LIZIZ.LIZJ().LJJ("location")) {
            if (PopupManager.LJI()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("requestLocationPermission: elementLabel: ");
                AbstractC20656215sG abstractC20656215sGLJ = PopupManager.LJ();
                if (abstractC20656215sGLJ != null) {
                    str3 = abstractC20656215sGLJ.elementLabel;
                } else {
                    str3 = null;
                }
                sbLIZ.append(str3);
                sbLIZ.append(" triggerId: ");
                AbstractC20656215sG abstractC20656215sGLJ2 = PopupManager.LJ();
                if (abstractC20656215sGLJ2 != null) {
                    str4 = abstractC20656215sGLJ2.triggerId;
                } else {
                    str4 = null;
                }
                sbLIZ.append(str4);
                C2188811AlT.LIZIZ(sbLIZ);
                C1208440hYI.LIZ.getClass();
                C1208130hXn c1208130hXn = C1208440hYI.LIZIZ;
                AbstractC20656215sG abstractC20656215sGLJ3 = PopupManager.LJ();
                if (abstractC20656215sGLJ3 != null) {
                    str5 = abstractC20656215sGLJ3.elementLabel;
                } else {
                    str5 = null;
                }
                AbstractC20656215sG abstractC20656215sGLJ4 = PopupManager.LJ();
                if (abstractC20656215sGLJ4 != null) {
                    str6 = abstractC20656215sGLJ4.triggerId;
                } else {
                    str6 = null;
                }
                c1208130hXn.LJJIFFI(null, str5, true, str6, null);
            }
            final C1208010hXb c1208010hXb = new C1208010hXb(cert, activity, null);
            final C1AUF c1auf = (C1AUF) interfaceC1207440hWg;
            PopupManager.LJIJ(new AbstractC20660815t0(c1208010hXb) { // from class: X.0hWj
                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 210;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
                    InterfaceC1207490hWl interfaceC1207490hWl = (InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class);
                    String str7 = str;
                    String str8 = str2;
                    final Cert cert2 = cert;
                    Activity activity2 = activity;
                    final C1207520hWo c1207520hWo2 = c1207520hWo;
                    final InterfaceC1207030hW1 interfaceC1207030hW12 = interfaceC1207030hW1;
                    interfaceC1207490hWl.LJIJJ(str7, str8, cert2, activity2, c1207520hWo2, new InterfaceC1207030hW1() { // from class: X.0hWm
                        @Override // X.InterfaceC1207030hW1
                        public final void LIZ() {
                            C1207450hWh c1207450hWh = C1207450hWh.LIZ;
                            Cert cert3 = cert2;
                            C1207520hWo c1207520hWo3 = c1207520hWo2;
                            String str9 = c1207520hWo3 != null ? c1207520hWo3.LIZ : null;
                            c1207450hWh.getClass();
                            C1207450hWh.LJJ(0, str9, cert3);
                            c20656615sK.LIZ();
                            InterfaceC1207030hW1 interfaceC1207030hW13 = interfaceC1207030hW12;
                            if (interfaceC1207030hW13 != null) {
                                interfaceC1207030hW13.LIZ();
                            }
                        }

                        @Override // X.InterfaceC1207030hW1
                        public final void LIZJ(int i) {
                            String str9;
                            C1207450hWh c1207450hWh = C1207450hWh.LIZ;
                            Cert cert3 = cert2;
                            C1207520hWo c1207520hWo3 = c1207520hWo2;
                            if (c1207520hWo3 != null) {
                                str9 = c1207520hWo3.LIZ;
                            } else {
                                str9 = null;
                            }
                            c1207450hWh.getClass();
                            C1207450hWh.LJJ(i, str9, cert3);
                            c20656615sK.LIZ();
                            InterfaceC1207030hW1 interfaceC1207030hW13 = interfaceC1207030hW12;
                            if (interfaceC1207030hW13 != null) {
                                interfaceC1207030hW13.LIZJ(i);
                            }
                        }

                        @Override // X.InterfaceC1207030hW1
                        public final void LIZIZ(int i, String str9) {
                            String str10;
                            C1207450hWh c1207450hWh = C1207450hWh.LIZ;
                            Cert cert3 = cert2;
                            C1207520hWo c1207520hWo3 = c1207520hWo2;
                            if (c1207520hWo3 != null) {
                                str10 = c1207520hWo3.LIZ;
                            } else {
                                str10 = null;
                            }
                            c1207450hWh.getClass();
                            C1207450hWh.LJJ(i, str10, cert3);
                            c20656615sK.LIZ();
                            InterfaceC1207030hW1 interfaceC1207030hW13 = interfaceC1207030hW12;
                            if (interfaceC1207030hW13 != null) {
                                interfaceC1207030hW13.LIZIZ(i, str9);
                            }
                        }
                    }, c1auf);
                }

                @Override // X.AbstractC20656215sG
                public final void showPopupFailed(int i, String str7) {
                    String str8;
                    super.showPopupFailed(i, str7);
                    C1208440hYI.LIZ.getClass();
                    C1208440hYI.LIZIZ.LJJIFFI(str7, null, PopupManager.LJI(), null, Integer.valueOf(i));
                    C1207400hWc c1207400hWc = C1207400hWc.LIZ;
                    C1207520hWo c1207520hWo2 = c1207520hWo;
                    if (c1207520hWo2 == null || (str8 = c1207520hWo2.LIZ) == null) {
                        str8 = "";
                    }
                    String strCertToken = cert.certToken();
                    String strValueOf = String.valueOf(i);
                    c1207400hWc.getClass();
                    C1207400hWc.LJII(0, str8, strCertToken, "main_framework_reject", strValueOf);
                }
            }, "location", new C1668306g5("local_permission_gps_general"));
            return;
        }
        ((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJIJJ(str, str2, cert, activity, c1207520hWo, interfaceC1207030hW1, interfaceC1207440hWg);
    }

    public final void LJJI(String str, String str2, TokenCert tokenCert, final C19EG c19eg, C1207520hWo c1207520hWo, final Function2 function2, final Function1 function1, final Function2 function22) {
        C19741112Lp.LIZ.getClass();
        boolean zLIZLLL = C19741112Lp.LIZLLL(c19eg, "android.permission.ACCESS_COARSE_LOCATION");
        final ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        if (!zLIZLLL) {
            LJIJJ(str, str2, tokenCert, c19eg, c1207520hWo, new InterfaceC1207030hW1() { // from class: X.0Qyl
                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    boolean zLJ = iLocationBaseServiceForMT.LJ(c19eg);
                    boolean zLJJIJ = iLocationBaseServiceForMT.LJJIJ();
                    Function2<Boolean, Boolean, Unit> function23 = function2;
                    if (function23 != null) {
                        function23.invoke(Boolean.valueOf(zLJ), Boolean.valueOf(zLJJIJ));
                    }
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                    Function1<Integer, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(Integer.valueOf(i));
                    }
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str3) {
                    Function2<Integer, String, Unit> function23 = function22;
                    if (function23 != null) {
                        function23.invoke(Integer.valueOf(i), str3);
                    }
                }
            }, null);
            return;
        }
        if (iLocationBaseServiceForMT.LJIILJJIL()) {
            boolean zBooleanValue = false;
            if (c1207520hWo != null && Intrinsics.LJFF(c1207520hWo.LJI, Boolean.TRUE)) {
                if (!iLocationBaseServiceForMT.LJ(c19eg)) {
                    InterfaceC1207030hW1 interfaceC1207030hW1 = new InterfaceC1207030hW1() { // from class: X.0Qym
                        @Override // X.InterfaceC1207030hW1
                        public final void LIZ() {
                            boolean zLJJIJ = iLocationBaseServiceForMT.LJJIJ();
                            Function2<Boolean, Boolean, Unit> function23 = function2;
                            if (function23 != null) {
                                function23.invoke(Boolean.TRUE, Boolean.valueOf(zLJJIJ));
                            }
                        }

                        @Override // X.InterfaceC1207030hW1
                        public final void LIZJ(int i) {
                            boolean zLJJIJ = iLocationBaseServiceForMT.LJJIJ();
                            Function2<Boolean, Boolean, Unit> function23 = function2;
                            if (function23 != null) {
                                function23.invoke(Boolean.FALSE, Boolean.valueOf(zLJJIJ));
                            }
                        }

                        @Override // X.InterfaceC1207030hW1
                        public final void LIZIZ(int i, String str3) {
                            boolean zLJJIJ = iLocationBaseServiceForMT.LJJIJ();
                            Function2<Boolean, Boolean, Unit> function23 = function2;
                            if (function23 != null) {
                                function23.invoke(Boolean.FALSE, Boolean.valueOf(zLJJIJ));
                            }
                        }
                    };
                    Boolean bool = c1207520hWo.LJII;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    iLocationBaseServiceForMT.LJIJJLI(str, str2, tokenCert, c19eg, c1207520hWo, interfaceC1207030hW1, zBooleanValue, true);
                    return;
                }
                ILocationBaseServiceForMT iLocationBaseServiceForMT2 = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                if (iLocationBaseServiceForMT2 == null) {
                    Boolean bool2 = Boolean.FALSE;
                    function2.invoke(bool2, bool2);
                    return;
                }
                C1197760hH4.LIZ.getClass();
                if (C1197760hH4.LIZ() && c1207520hWo != null && Intrinsics.LJFF(c1207520hWo.LJIIIIZZ, Boolean.TRUE)) {
                    if (!iLocationBaseServiceForMT2.LJII(c19eg)) {
                        return;
                    }
                    iLocationBaseServiceForMT2.LIZLLL(c19eg, null, c1207520hWo, new InterfaceC1207170hWF() { // from class: X.0hMf
                        @Override // X.InterfaceC1207170hWF
                        public final void LIZ(C1208240hXy c1208240hXy) {
                        }

                        @Override // X.InterfaceC1207170hWF
                        public final void LIZIZ(C1208000hXa c1208000hXa) {
                            boolean z;
                            if (c1208000hXa.LIZ == EnumC1207930hXT.Granted) {
                                z = true;
                            } else {
                                z = false;
                            }
                            Function2<Boolean, Boolean, Unit> function23 = function2;
                            if (function23 != null) {
                                function23.invoke(Boolean.TRUE, Boolean.valueOf(z));
                            }
                        }
                    }, "biz");
                    return;
                } else {
                    if (!iLocationBaseServiceForMT2.LJJIJ() && c1207520hWo != null && Intrinsics.LJFF(c1207520hWo.LJIIIIZZ, Boolean.TRUE)) {
                        String str3 = c1207520hWo.LIZ;
                        String str4 = "";
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str5 = c1207520hWo.LIZIZ;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        iLocationBaseServiceForMT2.LIZJ(str3, null, c19eg, null, tokenCert, new C5182020e(function2, (Function2<? super Boolean, ? super String, Unit>) 607), new C5182020e(function2, (Function2<? super Boolean, ? super String, Unit>) 608), new C5182020e(function2, (Function2<? super Boolean, ? super String, Unit>) 609), str4);
                        return;
                    }
                    function2.invoke(Boolean.TRUE, Boolean.valueOf(iLocationBaseServiceForMT2.LJJIJ()));
                    return;
                }
            }
        }
        function2.invoke(Boolean.valueOf(iLocationBaseServiceForMT.LJ(c19eg)), Boolean.valueOf(iLocationBaseServiceForMT.LJJIJ()));
    }
}
