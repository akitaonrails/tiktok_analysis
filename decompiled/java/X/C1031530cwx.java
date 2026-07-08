package X;

import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0cwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031530cwx implements InterfaceC1032240cy6 {
    public EnumC1031650cx9 LIZ = EnumC1031650cx9.CLOSE;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public Fragment LJFF;
    public float LJI;
    public float LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    @Override // X.InterfaceC1032240cy6
    public final void LIZJ() {
        InterfaceC1034470d1h interfaceC1034470d1h;
        if (this.LJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("directOpenLandingPage onClose, landingPageFragment: ");
            sbLIZ.append(this.LJFF);
            C2188811AlT.LIZIZ(sbLIZ);
            C128Y c128y = this.LJFF;
            if (!(c128y instanceof InterfaceC1034470d1h) || (interfaceC1034470d1h = (InterfaceC1034470d1h) c128y) == null) {
                return;
            }
            interfaceC1034470d1h.LLLIL(null);
        }
    }

    public final C16BC<?> LJII() {
        Fragment fragment = this.LJFF;
        if (fragment == null) {
            return null;
        }
        String str = TuxSheet._pnsPageId;
        return C1391190mJ3.LJIIIZ(fragment);
    }

    @Override // X.InterfaceC1032240cy6
    public final void onDestroyView() {
        if (this.LJIIIZ) {
            IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
            if (iAdWebUtils != null) {
                iAdWebUtils.ev();
            }
            this.LJIIIZ = false;
        }
    }

    @Override // X.InterfaceC1032240cy6
    public final Fragment getFragment() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1032240cy6
    public final void LIZ(FragmentManager fragmentManager) {
        C128Y next;
        InterfaceC1034470d1h interfaceC1034470d1h;
        Iterator<Fragment> it2 = fragmentManager.LJJLIIIJL().iterator();
        while (true) {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            Fragment fragment = (Fragment) next;
            if ((fragment instanceof InterfaceC1034470d1h) && fragment.isVisible()) {
                break;
            }
        }
        C128Y c128y = (Fragment) next;
        if (c128y != null && (c128y instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h = (InterfaceC1034470d1h) c128y) != null) {
            interfaceC1034470d1h.SQ();
        }
    }

    @Override // X.InterfaceC1032240cy6
    public final void LIZIZ(int i) {
        C988850bq7.LIZJ(i);
    }

    public final boolean LJI(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        boolean z = false;
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                this.LJI = motionEvent.getX();
                this.LJII = motionEvent.getY();
                this.LJIIIIZZ = false;
            } else if (numValueOf != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 3)) {
                float fAbs = Math.abs(motionEvent.getX() - this.LJI);
                float fAbs2 = Math.abs(motionEvent.getY() - this.LJII);
                if (fAbs > 5.0f || fAbs2 > 5.0f) {
                    z = true;
                }
                this.LJIIIIZZ = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkIfOnlyScrolling, deltaX: ");
                sbLIZ.append(fAbs);
                sbLIZ.append(", deltaY: ");
                sbLIZ.append(fAbs2);
                C2188811AlT.LIZIZ(sbLIZ);
                return z;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1032240cy6
    public final void LJFF(int i, Object obj) {
        C988850bq7.LIZIZ(i, obj);
    }

    public final void LJIIIIZZ(boolean z, InterfaceC1031830cxR interfaceC1031830cxR) {
        if (!this.LJIIIIZZ) {
            return;
        }
        if (C1031970cxf.LIZ) {
            if (!z && interfaceC1031830cxR != null) {
                interfaceC1031830cxR.LIZIZ(false);
            }
        } else if (interfaceC1031830cxR != null) {
            interfaceC1031830cxR.LIZIZ(z);
        }
        this.LIZIZ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportRealtimeClick, isScrolling: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1032240cy6
    public final void LIZLLL(Object obj, C03GC c03gc, C19EG c19eg, final C1031690cxD c1031690cxD) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        boolean zLIZ;
        String strXu;
        String webUrl;
        if (c19eg == null) {
            return;
        }
        Fragment fragmentMv = null;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            IAdLynxLandPageUtils iAdLynxLandPageUtils = (IAdLynxLandPageUtils) PluggableExtentionKt.pluggableSpi$default(IAdLynxLandPageUtils.class, false, false, false, 14, null);
            if (iAdLynxLandPageUtils != null) {
                NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                if (nativeSiteConfig == null || (webUrl = nativeSiteConfig.lynxScheme) == null) {
                    webUrl = awemeRawAd.getWebUrl();
                }
                zLIZ = iAdLynxLandPageUtils.LIZ(webUrl);
            } else {
                zLIZ = false;
            }
            C1026310coX c1026310coX = new C1026310coX(null, awemeRawAd, new AdlpExtraModel(null, null, null, null, null, "direct_openpage_ad_page", 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null), false, new C1025720cna(-1.0f, null, null, -1, Boolean.FALSE, -1, -1, Boolean.FALSE), new C1028100crQ(Boolean.FALSE, null, Boolean.FALSE, false, false, Boolean.FALSE, Boolean.TRUE, null, null, null, false, true, false, false, null, Boolean.FALSE));
            IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
            if (iAdWebUtils != null && (strXu = iAdWebUtils.Xu(c1026310coX)) != null) {
                if (zLIZ && c03gc != null) {
                    c03gc.setInterceptListener(new AwS382S0200000_16(this, c1031690cxD, 4));
                }
                InterfaceC1036270d4b interfaceC1036270d4b = new InterfaceC1036270d4b() { // from class: X.0cx4
                    @Override // X.InterfaceC1036270d4b
                    public final void LLLFFI(TuxSheet tuxSheet, float f) {
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void Pu(InterfaceC1034470d1h interfaceC1034470d1h) {
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void Rg(InterfaceC1034470d1h interfaceC1034470d1h) {
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void Yc() {
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void ni(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h) {
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void V() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("directOpenLandingPage onPageLoadFinish, isReportedShow: ");
                        sbLIZ.append(this.LL.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (!C1031980cxg.LIZ) {
                            C1031530cwx c1031530cwx = this.LL;
                            InterfaceC1031830cxR interfaceC1031830cxR = c1031690cxD;
                            if (!c1031530cwx.LIZJ) {
                                if (interfaceC1031830cxR != null) {
                                    interfaceC1031830cxR.LIZ();
                                }
                                c1031530cwx.LIZJ = true;
                            }
                        }
                        this.LL.LJ = true;
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void Gn(MotionEvent motionEvent) {
                        C1031530cwx c1031530cwx = this.LL;
                        if (c1031530cwx.LIZJ && !c1031530cwx.LIZIZ) {
                            this.LL.LJIIIIZZ(c1031530cwx.LJI(motionEvent), c1031690cxD);
                        }
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void s8(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("directOpenLandingPage onShow, isReportedShow: ");
                        sbLIZ.append(this.LL.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ);
                        InterfaceC1031830cxR interfaceC1031830cxR = c1031690cxD;
                        if (interfaceC1031830cxR != null) {
                            interfaceC1031830cxR.onShow();
                        }
                        if (C1031980cxg.LIZ) {
                            C1031530cwx c1031530cwx = this.LL;
                            InterfaceC1031830cxR interfaceC1031830cxR2 = c1031690cxD;
                            if (!c1031530cwx.LIZJ) {
                                if (interfaceC1031830cxR2 != null) {
                                    interfaceC1031830cxR2.LIZ();
                                }
                                c1031530cwx.LIZJ = true;
                            }
                        }
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void ha(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str, String str2) {
                        if (!Intrinsics.LJFF(str, "system_back")) {
                            return;
                        }
                        InterfaceC1031830cxR interfaceC1031830cxR = c1031690cxD;
                        if (interfaceC1031830cxR != null) {
                            interfaceC1031830cxR.onHide();
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("directOpenLandingPage onHide, fragment: ");
                        sbLIZ.append(interfaceC1034470d1h);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                };
                if (zLIZ) {
                    IAdLynxLandPageUtils iAdLynxLandPageUtils2 = (IAdLynxLandPageUtils) PluggableExtentionKt.pluggableSpi$default(IAdLynxLandPageUtils.class, false, false, false, 14, null);
                    if (iAdLynxLandPageUtils2 != null) {
                        fragmentMv = iAdLynxLandPageUtils2.LIZIZ(c19eg, iAdLynxLandPageUtils2.LJFF(c1026310coX, c19eg, strXu), c1026310coX, true, EnumC1036160d4Q.DEFAULT, -1, null, false, interfaceC1036270d4b);
                    }
                } else {
                    IAdWebUtils iAdWebUtils2 = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
                    if (iAdWebUtils2 != null) {
                        fragmentMv = iAdWebUtils2.mv(c19eg, c1026310coX, true, EnumC1036160d4Q.DEFAULT, -1, interfaceC1036270d4b, false);
                    }
                }
                this.LJFF = fragmentMv;
                IAdWebUtils iAdWebUtils3 = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
                if (iAdWebUtils3 != null) {
                    iAdWebUtils3.pv(!zLIZ, c19eg, this.LJFF, Boolean.TRUE, c03gc, 0, true, true, true, null, AFwS231S0000000_3.get$arr$(6));
                }
                this.LJIIIZ = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("directOpenLandingPage, isLynx: ");
                sbLIZ.append(zLIZ);
                sbLIZ.append(", customContainer: ");
                sbLIZ.append(c03gc);
                sbLIZ.append(", landingPageFragment: ");
                sbLIZ.append(this.LJFF);
                sbLIZ.append(", url: ");
                sbLIZ.append(strXu);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    @Override // X.InterfaceC1032240cy6
    public final void LJ(Object obj, final InterfaceC1032870cz7 interfaceC1032870cz7, C19EG c19eg, final C1031680cxC c1031680cxC) {
        Aweme aweme;
        final AwemeRawAd awemeRawAd;
        String webUrl;
        boolean zLJJIIJZLJL;
        if (c19eg != null && (obj instanceof Aweme) && (aweme = (Aweme) obj) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
            if (nativeSiteConfig == null || (webUrl = nativeSiteConfig.lynxScheme) == null) {
                webUrl = awemeRawAd.getWebUrl();
            }
            if (webUrl != null) {
                zLJJIIJZLJL = u.LJJIIJZLJL(webUrl, "aweme://lynxview", false);
            } else {
                zLJJIIJZLJL = false;
            }
            this.LIZLLL = awemeRawAd.isOpenSystemBrowser();
            if (this.LIZ == EnumC1031650cx9.SHOWN) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("autoOpenLandingPage, openSystemBrowser: ");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(", isLynx: ");
            sbLIZ.append(zLJJIIJZLJL);
            C2188811AlT.LIZIZ(sbLIZ);
            Boolean bool = Boolean.FALSE;
            C1026310coX c1026310coX = new C1026310coX(null, awemeRawAd, new AdlpExtraModel(null, null, null, null, null, "auto_openpage_ad_page", 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null), false, new C1025720cna(0.6f, bool, Boolean.TRUE, 3, Boolean.FALSE, -1, -1, Boolean.FALSE), new C1028100crQ(Boolean.FALSE, null, Boolean.FALSE, false, false, bool, Boolean.TRUE, null, null, null, false, false, true, false, null, Boolean.FALSE));
            if (this.LIZLLL) {
                awemeRawAd.setOpenSystemBrowser(false);
            }
            IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) PluggableExtentionKt.pluggableSpi$default(IAdLandingPagePopUpService.class, false, false, false, 14, null);
            if (iAdLandingPagePopUpService != null) {
                iAdLandingPagePopUpService.LJIIJ(-1, c19eg, new InterfaceC1036270d4b() { // from class: X.0cx1
                    @Override // X.InterfaceC1036270d4b
                    public final void LLLFFI(TuxSheet tuxSheet, float f) {
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void Pu(InterfaceC1034470d1h interfaceC1034470d1h) {
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void Rg(InterfaceC1034470d1h interfaceC1034470d1h) {
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void Yc() {
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void V() {
                        this.LL.LJ = true;
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void Gn(MotionEvent motionEvent) {
                        C1031530cwx c1031530cwx = this.LL;
                        if (c1031530cwx.LIZIZ) {
                            return;
                        }
                        if (!c1031530cwx.LJI(motionEvent)) {
                            InterfaceC1031960cxe interfaceC1031960cxe = c1031680cxC;
                            if (interfaceC1031960cxe != null) {
                                interfaceC1031960cxe.LIZ();
                            }
                            this.LL.LIZIZ = true;
                        }
                        Fragment fragment = this.LL.LJFF;
                        if (fragment != null) {
                            String str = TuxSheet._pnsPageId;
                            C1391190mJ3.LJIIIIZZ(fragment, true);
                        }
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
                        BottomSheetBehavior bottomSheetBehavior;
                        TuxSheetBehavior tuxSheetBehavior;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("autoOpenLandingPage onStateChanged, newState: ");
                        sbLIZ2.append(i);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (this.LL.LJ && i == 3) {
                            if (C299110Bnx.LIZ()) {
                                C16BC<?> c16bcLJII = this.LL.LJII();
                                if ((c16bcLJII instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcLJII) != null) {
                                    tuxSheetBehavior.LJIJI = false;
                                    return;
                                }
                                return;
                            }
                            C16BC<?> c16bcLJII2 = this.LL.LJII();
                            if (!(c16bcLJII2 instanceof BottomSheetBehavior) || (bottomSheetBehavior = (BottomSheetBehavior) c16bcLJII2) == null) {
                                return;
                            }
                            bottomSheetBehavior.setDraggable(false);
                        }
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void ni(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("autoOpenLandingPage onClose, fragment: ");
                        sbLIZ2.append(interfaceC1034470d1h);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (tuxSheet != null) {
                            tuxSheet.dismiss();
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC1036270d4b
                    public final void s8(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str) {
                        Fragment fragment;
                        InterfaceC1032870cz7 interfaceC1032870cz72 = interfaceC1032870cz7;
                        if (interfaceC1032870cz72 != null) {
                            interfaceC1032870cz72.pause(EnumC1031630cx7.VIDEO_FINISH_AUTO_EXPAND.getValue());
                        }
                        C1031530cwx c1031530cwx = this.LL;
                        c1031530cwx.LIZ = EnumC1031650cx9.SHOWING;
                        if (interfaceC1034470d1h instanceof Fragment) {
                            fragment = (Fragment) interfaceC1034470d1h;
                        } else {
                            fragment = null;
                        }
                        c1031530cwx.LJFF = fragment;
                        awemeRawAd.setOpenSystemBrowser(c1031530cwx.LIZLLL);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("autoOpenLandingPage onShow, fragment: ");
                        sbLIZ2.append(interfaceC1034470d1h);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }

                    @Override // X.InterfaceC1036270d4b
                    public final void ha(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str, String str2) {
                        BottomSheetBehavior bottomSheetBehavior;
                        TuxSheetBehavior tuxSheetBehavior;
                        InterfaceC1032870cz7 interfaceC1032870cz72 = interfaceC1032870cz7;
                        if (interfaceC1032870cz72 != null) {
                            interfaceC1032870cz72.resume();
                        }
                        this.LL.LIZ = EnumC1031650cx9.SHOWN;
                        if (C299110Bnx.LIZ()) {
                            C16BC<?> c16bcLJII = this.LL.LJII();
                            if ((c16bcLJII instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcLJII) != null) {
                                tuxSheetBehavior.LJIJI = true;
                            }
                        } else {
                            C16BC<?> c16bcLJII2 = this.LL.LJII();
                            if ((c16bcLJII2 instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bcLJII2) != null) {
                                bottomSheetBehavior.setDraggable(true);
                            }
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("autoOpenLandingPage onHide, fragment: ");
                        sbLIZ2.append(interfaceC1034470d1h);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }, c1026310coX, null);
            }
        }
    }
}
