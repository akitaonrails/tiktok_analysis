package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS14S1000000_23;
import Y.ARunnableS92S0200000_23;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.base.TraceEvent;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pgf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521150pgf extends AbstractC1521100pga implements InterfaceC1522060pi8 {
    public final ViewOnAttachStateChangeListenerC1521210pgl LLJJI;
    public JSONObject LLJJIII;
    public final C1521490phD LLJJIJI;
    public final C1521220pgm LLJJIJIIJIL;
    public final C1520220pfA LLJJIJIL;
    public String LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public Double LLJL;
    public final String[] LLJLIL;
    public final String[] LLJLILLLLZIIL;

    @Override // X.AbstractC1521100pga
    public final void LJIILIIL(int i, String str, JSONObject jSONObject) {
    }

    @Override // X.AbstractC1521100pga
    public final InterfaceC1522240piQ LIZ() {
        return new InterfaceC1522240piQ<C1520560pfi>(this) { // from class: X.0pgK
            public final C1521150pgf LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC1522240piQ
            public final void LIZIZ(C1520560pfi c1520560pfi) {
                boolean z;
                C1520560pfi c1520560pfi2 = c1520560pfi;
                C1521150pgf c1521150pgf = this.LIZ;
                c1521150pgf.getClass();
                if (EnumC1521240pgo.monitor.isEnabled() && c1521150pgf.LLJJI.LLJILLL.LIZIZ) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = !z;
                c1520560pfi2.LJI(z2, EnumC1520250pfD.SWITCH_OFF);
                if (!z2) {
                    C1521530phH c1521530phH = this.LIZ.LLJJI.LLJILLL;
                    LIZ(c1520560pfi2);
                    if (c1520560pfi2 instanceof C1520220pfA) {
                        C1520730pfz.LIZJ(c1520560pfi2, c1521530phH.LIZJ);
                        return;
                    }
                    if (!(c1520560pfi2 instanceof C1520340pfM)) {
                        return;
                    }
                    C1520730pfz.LIZJ(c1520560pfi2, null);
                    EnumC1514740pWK enumC1514740pWK = EnumC1514740pWK.ReceivedCustom;
                    String str = c1520560pfi2.LIZJ;
                    if (str == null) {
                        str = "";
                    }
                    C1514690pWF.LIZJ(enumC1514740pWK, str, ((C1520340pfM) c1520560pfi2).LJIIIIZZ());
                }
            }

            @Override // X.InterfaceC1522240piQ
            /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
            public final void LIZ(C1520560pfi c1520560pfi) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                String strOptString;
                C1520350pfN c1520350pfN;
                boolean z;
                C1521410ph5 c1521410ph5;
                String str;
                Object c098200Yq;
                Uri uri;
                ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.LIZ.LLJJI;
                C1521530phH c1521530phH = viewOnAttachStateChangeListenerC1521210pgl.LLJILLL;
                C1521410ph5 c1521410ph5LJII = viewOnAttachStateChangeListenerC1521210pgl.LJII();
                T t = viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL;
                if (t == 0 || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = t.LLILZ) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                boolean z2 = false;
                if (!(!a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter))) {
                    Object obj = ((LinkedHashMap) viewOnAttachStateChangeListenerC1521210pgl.LLILLL).get("schema");
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    try {
                        uri = UriProtector.parse(str);
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "surl");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")) == null) || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel");
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bundle");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() == 0 || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3.length() == 0) {
                            c098200Yq = "";
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("lynxview://");
                            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                            sbLIZ.append('/');
                            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                            c098200Yq = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null) {
                            C1520960pgM.LIZIZ(thM5exceptionOrNullimpl);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = (String) c098200Yq;
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                        }
                    }
                    if (!(!a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter))) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                    }
                }
                String str2 = c1520560pfi.LIZJ;
                if (str2 == null || str2.length() == 0) {
                    c1520560pfi.LIZJ = viewOnAttachStateChangeListenerC1521210pgl.LLILZIL;
                }
                if (c1520560pfi.LJI.length() == 0) {
                    c1520560pfi.LJI = this.LIZ.LLJJIII;
                } else {
                    C12868051u.LJFF(c1520560pfi.LJI, this.LIZ.LLJJIII);
                }
                c1520560pfi.LJ.put("config_bid", c1521530phH.LIZ);
                Map<String, String> map = c1520560pfi.LJ;
                if (C1520370pfP.LIZ(this.LIZ.LLJI)) {
                    strOptString = this.LIZ.LLJI;
                } else {
                    strOptString = c1520560pfi.LJI.optString("bid");
                    if (strOptString == null) {
                        strOptString = "__hybrid_default";
                    }
                }
                map.put("jsb_bid", strOptString);
                C1491800ovK c1491800ovKLIZ = viewOnAttachStateChangeListenerC1521210pgl.LIZ();
                C1491810ovL c1491810ovL = new C1491810ovL(viewOnAttachStateChangeListenerC1521210pgl.LLILZ);
                C1491800ovK c1491800ovK = c1520560pfi.LJII;
                if (c1491800ovK == null) {
                    c1520560pfi.LJII = c1491800ovKLIZ;
                } else {
                    List<Map<String, Object>> list = c1491800ovK.LIZ;
                    if (list != null) {
                        list.addAll(c1491800ovKLIZ.LIZ);
                    }
                }
                c1520560pfi.LJFF(this.LIZ.LLJIJIL, "oid");
                String str3 = c1521410ph5LJII.LJFF;
                if (str3 == null || str3.length() == 0) {
                    c1521410ph5LJII.LJFF = c1521530phH.LIZLLL;
                }
                c1520560pfi.LJFF = c1521410ph5LJII;
                JSONObject jSONObjectLIZIZ = c1491810ovL.LIZIZ();
                try {
                    C1521090pgZ c1521090pgZ = c1520560pfi.LJFF;
                    if (!(c1521090pgZ instanceof C1521090pgZ) || c1521090pgZ == null) {
                        c1521090pgZ = null;
                    } else {
                        String str4 = c1521090pgZ.LJFF;
                        if (str4 == null || str4.length() == 0) {
                            c1521090pgZ.LJFF = c1521530phH.LIZLLL;
                        }
                        String str5 = c1521090pgZ.LIZ;
                        if (str5 == null || str5.length() == 0) {
                            c1521090pgZ.LIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                        }
                        String str6 = c1521090pgZ.LIZLLL;
                        if (str6 == null || str6.length() == 0) {
                            c1521090pgZ.LIZLLL = jSONObjectLIZIZ.optString(EnumC1521110pgb.NATIVE_PAGE.getSlardarKey(), "");
                        }
                        String str7 = c1521090pgZ.LIZJ;
                        if (str7 == null || str7.length() == 0 || Intrinsics.LJFF(c1521090pgZ.LIZJ, "unknown")) {
                            c1521090pgZ.LIZJ = EnumC1520910pgH.LYNX.getType();
                        }
                    }
                    C189200o6.m2constructorimpl(c1521090pgZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                try {
                    C1521090pgZ c1521090pgZ2 = c1520560pfi.LJFF;
                    if ((c1521090pgZ2 instanceof C1521410ph5) && (c1521410ph5 = (C1521410ph5) c1521090pgZ2) != null) {
                        if (c1521410ph5.LJIILIIL.length() == 0) {
                            c1521410ph5.LJIILIIL = jSONObjectLIZIZ.optString(EnumC1521110pgb.PAGE_VERSION.getSlardarKey(), "");
                        }
                    } else {
                        c1521410ph5 = null;
                    }
                    C189200o6.m2constructorimpl(c1521410ph5);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
                if ((c1520560pfi instanceof C1520340pfM) && (c1520350pfN = ((C1520340pfM) c1520560pfi).LJIILIIL) != null) {
                    String str8 = c1520350pfN.LJIIIIZZ;
                    if (str8 != null && str8.length() != 0) {
                        C1491800ovK c1491800ovK2 = c1520560pfi.LJII;
                        if (c1491800ovK2 == null) {
                            c1520560pfi.LJII = c1491800ovKLIZ;
                        } else {
                            List<Map<String, Object>> list2 = c1491800ovK2.LIZ;
                            if (list2 != null) {
                                list2.addAll(c1491800ovKLIZ.LIZ);
                            }
                        }
                    }
                    String str9 = c1520350pfN.LJIIJ;
                    if (str9 != null && str9.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!Boolean.valueOf(!z).booleanValue() || str9 == null) {
                        str9 = c1521410ph5LJII.LJFF;
                    }
                    c1520350pfN.LJIIJ = str9;
                    String str10 = c1520350pfN.LIZ;
                    if (str10 == null || str10.length() == 0) {
                        z2 = true;
                    }
                    if (Boolean.valueOf(!z2).booleanValue() && str10 != null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = str10;
                    }
                    c1520350pfN.LIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    C12868051u.LJI(c1520350pfN.LJII, "platform", 3);
                }
            }
        };
    }

    @Override // X.AbstractC1521100pga
    public final void LJI() {
        EnumC1520990pgP enumC1520990pgP = EnumC1520990pgP.ENABLE_LYNX_BLANK_DOM_SCORE_DETECT;
        if (!enumC1520990pgP.isEnabled()) {
            super.LJI();
            return;
        }
        C824310WVh.LIZJ(new ARunnableS123S0100000_23(this, 0));
        LIZLLL().LIZIZ(EnumC1521120pgc.PAGE_EXIT, null);
        String str = LIZLLL().LIZ;
        C786410Ut5.LJLIIL(enumC1520990pgP.getOptions().optLong("page_props_exit_delay", Mp4ScreenVideoLoadTimeout.CONTROL), (Handler) C824310WVh.LIZIZ.getValue(), new C0W89(new ARunnableS14S1000000_23(str, 4)));
    }

    public final LynxView LJIILJJIL() {
        View view = this.LLJJI.LL.get();
        if (view == null || !(view instanceof LynxView)) {
            int i = C2187451AjH.LIZ;
            C1521730phb.LIZIZ("MonitorViewSession", "view is null or not lynxview");
            view = null;
        }
        return (LynxView) view;
    }

    public final String LJIILL() {
        return this.LLJJI.LJII().LIZIZ;
    }

    public final void LJIIZILJ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy: ");
        sbLIZ.append(this.LLJJJ);
        sbLIZ.append(", view: ");
        sbLIZ.append(LJIILJJIL());
        C1521730phb.LJFF("LynxViewMonitor", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIJI.LIZLLL = LIZLLL().LIZIZ(EnumC1521260pgq.LYNX_PAGE_SHOW_END, null);
        if (!this.LLJJJJLIIL) {
            if (!this.LLJJL) {
                ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.LLJJI;
                if (viewOnAttachStateChangeListenerC1521210pgl.LLJ && viewOnAttachStateChangeListenerC1521210pgl.LLJI) {
                    this.LLJJIJIIJIL.LIZJ(2);
                } else {
                    this.LLJJIJIIJIL.LIZJ(3);
                }
            }
            this.LLJJIJIIJIL.LJI = this.LLJJIJI;
            LJIL();
            LJIJJ();
            LIZJ().LIZIZ();
        }
        LJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    public final void LJIJI() {
        String str;
        Object obj;
        final C1520220pfA c1520220pfALIZ;
        final LynxView lynxViewLJIILJJIL;
        EnumC1520990pgP enumC1520990pgP = EnumC1520990pgP.LynxBlank;
        String strLJ = LJ();
        String str2 = this.LLIZ;
        if (str2 == null || a0.LJJJIL(str2)) {
            String str3 = this.LLILZLL;
            str = (str3 == null || a0.LJJJIL(str3)) ? "" : this.LLILZLL;
        } else {
            str = this.LLIZ;
        }
        if (enumC1520990pgP.isEnabled(strLJ, str)) {
            obj = null;
            c1520220pfALIZ = C1520510pfd.LIZ("blank", null);
            boolean zNot = EnumC1521240pgo.lynxBlank.not();
            c1520220pfALIZ.LJI(zNot, EnumC1520250pfD.SWITCH_OFF);
            if (zNot) {
                return;
            }
            lynxViewLJIILJJIL = LJIILJJIL();
            if (lynxViewLJIILJJIL == null) {
                c1520220pfALIZ.onEventTerminated(EnumC1520250pfD.CATCH_EXCEPTION);
                return;
            }
            if (lynxViewLJIILJJIL.getWidth() == 0 || lynxViewLJIILJJIL.getHeight() == 0) {
                c1520220pfALIZ.onEventTerminated(EnumC1520250pfD.PARAM_EXCEPTION);
                return;
            }
            if (EnumC1520990pgP.BLANK_SCREEN_OPTIMIZE.isEnabled() && !lynxViewLJIILJJIL.isAttachedToWindow()) {
                c1520220pfALIZ.onEventTerminated(EnumC1520250pfD.NOT_ATTACHED);
                return;
            }
            C1520140pf2 c1520140pf2 = this.LLJILJILJ;
            String str4 = LIZLLL().LIZ;
            c1520140pf2.getClass();
            C1514490pVv c1514490pVv = C1514580pW4.LIZLLL;
            if (c1514490pVv != null && c1514490pVv.LIZ) {
                C1491570oux c1491570oux = C1491570oux.LIZ;
                C1514510pVx c1514510pVx = new C1514510pVx(c1520140pf2, "lynx");
                c1491570oux.getClass();
                C1491570oux.LJIIIZ(str4, c1514510pVx);
            }
            Class declaredField = LynxView.class;
            while (true) {
                try {
                    try {
                        declaredField = declaredField.getDeclaredField("mLynxTemplateRender");
                        if (declaredField != 0) {
                            declaredField.setAccessible(true);
                            if (((LynxTemplateRender) declaredField.get(LJIILJJIL())) == null) {
                                c1520220pfALIZ.onEventTerminated(EnumC1520250pfD.PARAM_EXCEPTION);
                                return;
                            }
                        }
                    } catch (NoSuchFieldException e) {
                        TryCatchGuardChecker.doCheck(e);
                        Class superclass = declaredField.getSuperclass();
                        if (superclass == null) {
                            break;
                        } else {
                            declaredField = superclass;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1520220pfALIZ.onEventTerminated(EnumC1520250pfD.CATCH_EXCEPTION);
                    C1520960pgM.LIZIZ(th);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Field ");
            sbLIZ.append("mLynxTemplateRender");
            sbLIZ.append(" not found in class hierarchy.");
            throw new NoSuchFieldException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return;
        final long jLIZIZ = LIZLLL().LIZIZ(EnumC1521260pgq.LYNX_PAGE_BLANK_DETECT_START, null);
        final C1521230pgn c1521230pgn = new C1521230pgn();
        c1521230pgn.LJIILJJIL = 2;
        c1521230pgn.LJIIIZ = C814420VxA.LIZIZ(lynxViewLJIILJJIL.getHeight() / lynxViewLJIILJJIL.getResources().getDisplayMetrics().density);
        c1521230pgn.LJIIJ = C814420VxA.LIZIZ(lynxViewLJIILJJIL.getWidth() / lynxViewLJIILJJIL.getResources().getDisplayMetrics().density);
        c1521230pgn.LJIJJ = C814420VxA.LIZIZ(lynxViewLJIILJJIL.getAlpha() * 100);
        final WeakReference weakReference = new WeakReference(LJIILJJIL());
        Object obj2 = ((ConcurrentHashMap) C1322300kVw.LIZ).get(InterfaceC1521770phf.class);
        if (obj2 == null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Cannot find service implementation of ");
            sbLIZ2.append(InterfaceC1521770phf.class);
            C1521730phb.LIZJ("MonitorService", C2188811AlT.LIZIZ(sbLIZ2), new Throwable());
        } else if (obj2 instanceof InterfaceC1521770phf) {
            obj = obj2;
        } else {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Internal error, service is not instance of ");
            sbLIZ3.append(InterfaceC1521770phf.class);
            sbLIZ3.append(", is that call register and get in different classloader?");
            C1521730phb.LIZJ("MonitorService", C2188811AlT.LIZIZ(sbLIZ3), new Throwable());
        }
        InterfaceC1521770phf interfaceC1521770phf = (InterfaceC1521770phf) obj;
        if (interfaceC1521770phf != null) {
            interfaceC1521770phf.detect(LJIILJJIL(), new InterfaceC1317630kOP() { // from class: X.0pgh
                @Override // X.InterfaceC1317630kOP
                public final void LIZ(C1317650kOR c1317650kOR) throws InterruptedException {
                    T t;
                    this.LIZ.LIZLLL().LIZIZ(EnumC1521260pgq.LYNX_PAGE_BLANK_DETECT_END, null);
                    C1521230pgn c1521230pgn2 = c1521230pgn;
                    C1521660phU c1521660phU = c1317650kOR.LIZJ;
                    c1521230pgn2.LJII = c1521660phU.LIZ;
                    c1521230pgn2.LJIJJLI = c1521660phU.LJFF;
                    try {
                        c1521230pgn2.LJIIZILJ = TTNetInit.getNetworkQuality().LIZIZ;
                        c1521230pgn2.LJIJ = TTNetInit.getNetworkQuality().LIZ;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C1520960pgM.LIZIZ(th2);
                    }
                    C1521230pgn c1521230pgn3 = c1521230pgn;
                    c1521230pgn3.LJIIIIZZ = c1317650kOR.LIZJ.LIZIZ;
                    c1521230pgn3.LJIJI = this.LIZ.LLJJIJI.LJI;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("effective_percentage", Integer.valueOf((int) (c1317650kOR.LIZJ.LIZ * 10000)));
                    C2119208Ry.LIZIZ(this.LIZ.LJIILL(), "blank_result", null, linkedHashMap);
                    C1521230pgn c1521230pgn4 = c1521230pgn;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = jLIZIZ;
                    c1521230pgn4.LJIIJJI = jCurrentTimeMillis - j;
                    C1521230pgn c1521230pgn5 = c1521230pgn;
                    c1521230pgn5.LJIIL = c1317650kOR.LIZ;
                    c1521230pgn5.LJIILIIL = c1317650kOR.LIZIZ;
                    c1521230pgn5.LJIILL = this.LIZ.LLJJIJI.LIZ;
                    c1521230pgn5.LJIILLIIL = j;
                    c1520220pfALIZ.LJIILIIL = c1521230pgn5;
                    if (EnumC1521240pgo.blankBitmap.isEnabled()) {
                        C1521230pgn c1521230pgn6 = c1521230pgn;
                        C1521660phU c1521660phU2 = c1317650kOR.LIZJ;
                        c1521230pgn6.LJIL = c1521660phU2.LIZJ;
                        c1521230pgn6.LJJ = c1521660phU2.LIZLLL;
                        c1521230pgn6.LJJI = c1521660phU2.LJ;
                    }
                    LynxView lynxView = weakReference.get();
                    if (lynxView != null) {
                        C824310WVh.LIZJ(new ARunnableS123S0100000_23(this.LIZ, lynxView, c1317650kOR, c1521230pgn, 226));
                    }
                    EnumC1520990pgP enumC1520990pgP2 = EnumC1520990pgP.ENABLE_LYNX_BLANK_DOM_SCORE_DETECT;
                    C1521150pgf c1521150pgf = this.LIZ;
                    if (enumC1520990pgP2.isEnabled()) {
                        double d = c1317650kOR.LIZJ.LJI;
                        c1521150pgf.LLJJI.LJII().LIZJ(Double.valueOf(d), "_dom_score");
                        if (c1521150pgf.LLJL != null) {
                            c1521150pgf.LLJJI.LJII().LIZJ(c1521150pgf.LLJL, "_dom_score_on_fcp");
                        }
                        C1491570oux.LJIILLIIL(C1491570oux.LIZ, c1521150pgf.LLJJI.LLILZIL, C2097608Jq.LJIIIIZZ(new Pair("lynx_view_dom_score", Double.valueOf(d)), new Pair("lynx_view_effective_area_ratio", Float.valueOf(c1317650kOR.LIZJ.LIZ)), new Pair("lynx_view_max_blank_rect_ratio", Float.valueOf(c1317650kOR.LIZJ.LIZIZ))));
                        C1491570oux.LJIIZILJ(c1521150pgf.LIZLLL().LIZ);
                    }
                    C1521150pgf c1521150pgf2 = this.LIZ;
                    C1520220pfA c1520220pfA = c1520220pfALIZ;
                    c1521150pgf2.getClass();
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("reportBlank: ");
                    sbLIZ4.append(c1521150pgf2.LLJJJ);
                    sbLIZ4.append(", view: ");
                    sbLIZ4.append(c1521150pgf2.LJIILJJIL());
                    C1521730phb.LJFF("LynxViewMonitor", C2188811AlT.LIZIZ(sbLIZ4));
                    ((C1521230pgn) c1520220pfA.LJIILIIL).LJIILL = c1521150pgf2.LLJJIJI.LIZ;
                    c1521150pgf2.LLJILJILJ.LJI(c1520220pfA, c1521150pgf2.LIZLLL().LIZ);
                    C1521130pgd.LIZ(c1521150pgf2, c1521150pgf2.LLJJI.LLJJIJIIJIL);
                    c1521150pgf2.LIZJ().LIZ(c1520220pfA);
                    LynxViewMonitor.Companion.getClass();
                    ViewOnAttachStateChangeListenerC1521210pgl viewSession = LynxViewMonitor.INSTANCE.getViewSession((View) lynxViewLJIILJJIL);
                    if (viewSession != null && (t = viewSession.LLJIJIL) != 0) {
                        t.LIZIZ("blank", c1521230pgn.LIZIZ());
                    }
                    C1491570oux c1491570oux2 = C1491570oux.LIZ;
                    String str5 = this.LIZ.LLJJI.LLILZIL;
                    c1491570oux2.getClass();
                    C1491570oux.LJIIZILJ(str5);
                }
            });
        }
    }

    public final void LJIJJ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportPerf: ");
        sbLIZ.append(this.LLJJJ);
        sbLIZ.append(", view: ");
        sbLIZ.append(LJIILJJIL());
        C1521730phb.LJFF("LynxViewMonitor", C2188811AlT.LIZIZ(sbLIZ));
        if (EnumC1521240pgo.lynxPerf.not()) {
            this.LLJJIJIL.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
            return;
        }
        if (this.LLJJJJLIIL) {
            this.LLJJIJIL.onEventTerminated(EnumC1520250pfD.EVENT_REPEATED);
        } else {
            this.LLJJJJLIIL = true;
            LIZLLL().LIZLLL(EnumC1521260pgq.LYNX_PERF_EVENT_UPLOADED.getKey(), Boolean.TRUE);
            LIZJ().LIZ(this.LLJJIJIL);
        }
        LynxView lynxViewLJIILJJIL = LJIILJJIL();
        if (lynxViewLJIILJJIL != null) {
            C1491570oux c1491570oux = C1491570oux.LIZ;
            String strLIZLLL = C1955407lI.LIZLLL(lynxViewLJIILJJIL);
            InterfaceC1491630ov3 interfaceC1491630ov3 = new InterfaceC1491630ov3() { // from class: X.0pgw
                @Override // X.InterfaceC1491630ov3
                public final void onReceiveValue(Object obj) {
                    Map map = (Map) obj;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (entry.getValue() instanceof Long) {
                                String str = (String) entry.getKey();
                                long jLongValue = ((Long) entry.getValue()).longValue();
                                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                                LynxViewMonitor.Companion.getClass();
                                TraceEvent.LJIIJJI(((jLongValue * j) * j) - LynxViewMonitor.JVM_DIFF, TraceEvent.LIZ[(int) 0], str, TraceEvent.LJIIIZ());
                            }
                        }
                    }
                }
            };
            c1491570oux.getClass();
            C1491570oux.LJIIIZ(strLIZLLL, interfaceC1491630ov3);
        }
    }

    public final void LJIJJLI() {
        boolean z = this.LLJJJIL && this.LLJJJJ;
        if (((C2029107xB) C1315600kL8.LIZJ.getValue()).LIZ() && z && this.LLJJJJJIL) {
            LIZJ().LIZIZ();
        }
    }

    public final void LJIL() {
        C824310WVh.LIZJ(new ARunnableS123S0100000_23(this, 0));
        C1521220pgm c1521220pgm = this.LLJJIJIIJIL;
        c1521220pgm.LJI = this.LLJJIJI;
        C1520220pfA c1520220pfA = this.LLJJIJIL;
        c1520220pfA.LJIILIIL = c1521220pgm;
        c1520220pfA.LJFF = this.LLJJI.LJII();
        C1520220pfA c1520220pfA2 = this.LLJJIJIL;
        ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.LLJJI;
        viewOnAttachStateChangeListenerC1521210pgl.getClass();
        c1520220pfA2.LJIILJJIL = new C1491810ovL(viewOnAttachStateChangeListenerC1521210pgl.LLILZ);
        this.LLJJIJIL.LJII = this.LLJJI.LIZ();
        this.LLJJIJIL.LIZLLL();
    }

    public C1521150pgf(ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl) {
        String templateUrl;
        super(viewOnAttachStateChangeListenerC1521210pgl);
        this.LLJJI = viewOnAttachStateChangeListenerC1521210pgl;
        this.LLJJIII = new JSONObject();
        this.LLJJIJI = new C1521490phD();
        C1521220pgm c1521220pgm = new C1521220pgm();
        this.LLJJIJIIJIL = c1521220pgm;
        this.LLJJIJIL = C1520510pfd.LIZ("performance", c1521220pgm);
        LynxView lynxViewLJIILJJIL = LJIILJJIL();
        if (lynxViewLJIILJJIL != null) {
            templateUrl = lynxViewLJIILJJIL.getTemplateUrl();
        } else {
            templateUrl = null;
        }
        this.LLJJJ = templateUrl;
        this.LLJLIL = new String[]{"jsb_module_name", "jsb_method_name", "jsb_name", "jsb_bridgesdk", "jsb_protocol_verison", "jsb_status_code"};
        this.LLJLILLLLZIIL = new String[]{"jsb_call", "jsb_func_call", "jsb_func_convert_params", "jsb_func_platform_method", "jsb_func_thread_switch", "jsb_callback_thread_switch", "jsb_callback_call", "jsb_callback_convert_params", "jsb_callback_invoke", "jsb_func_call_start", "jsb_func_call_end", "jsb_callback_thread_switch_start", "jsb_callback_thread_switch_end", "jsb_callback_call_start", "jsb_callback_call_end"};
    }

    @Override // X.AbstractC1521100pga
    public final void LJFF(String str) {
        LynxView lynxViewLJIILJJIL = LJIILJJIL();
        if (lynxViewLJIILJJIL != null) {
            LynxViewMonitor.Companion.getClass();
            lynxViewLJIILJJIL.putParamsForReportingEvents(C2097908Jt.LIZJ(new Pair(LynxViewMonitor.LYNX_MONITOR_OID_KEY, str)));
        }
    }

    public final void LJIILLIIL(Map<String, ? extends Object> map) throws JSONException {
        C1520160pf4 c1520160pf4;
        C824310WVh.LIZ(new ARunnableS92S0200000_23(this, map, 154));
        C1520220pfA c1520220pfALIZ = C1520510pfd.LIZ("jsbPerfV2", null);
        if (map == null) {
            c1520220pfALIZ.onEventTerminated(EnumC1520250pfD.PARAM_EXCEPTION);
            return;
        }
        if (EnumC1520990pgP.LynxEventReporter.isEnabled()) {
            JSONObject jSONObject = new JSONObject();
            String[] strArr = this.LLJLIL;
            jSONObject.putOpt("info", new JSONObject(C08HX.LJFF(map, Arrays.copyOf(strArr, strArr.length))));
            String[] strArr2 = this.LLJLILLLLZIIL;
            jSONObject.putOpt("perf", new JSONObject(C08HX.LJFF(map, Arrays.copyOf(strArr2, strArr2.length))));
            c1520160pf4 = new C1520160pf4("jsbPerfV2", jSONObject);
        } else {
            c1520160pf4 = new C1520160pf4("jsbPerfV2", new JSONObject(map));
        }
        c1520220pfALIZ.LJIILIIL = c1520160pf4;
        boolean zNot = EnumC1521240pgo.lynxJsb.not();
        c1520220pfALIZ.LJI(zNot, EnumC1520250pfD.SWITCH_OFF);
        if (zNot) {
            return;
        }
        onEventPost(c1520220pfALIZ);
    }

    public final void LJIJ(Map<String, ? extends Object> map) {
        C1520160pf4 c1520160pf4;
        C1520220pfA c1520220pfALIZ = C1520510pfd.LIZ("jsbPv", null);
        if (map == null) {
            c1520220pfALIZ.onEventTerminated(EnumC1520250pfD.PARAM_EXCEPTION);
            return;
        }
        if (EnumC1520990pgP.LynxEventReporter.isEnabled()) {
            String[] strArr = this.LLJLIL;
            c1520160pf4 = new C1520160pf4("jsbPv", new JSONObject(C08HX.LJFF(map, Arrays.copyOf(strArr, strArr.length))));
        } else {
            c1520160pf4 = new C1520160pf4("jsbPv", new JSONObject(map));
        }
        c1520220pfALIZ.LJIILIIL = c1520160pf4;
        boolean zNot = EnumC1521240pgo.lynxJsb.not();
        c1520220pfALIZ.LJI(zNot, EnumC1520250pfD.SWITCH_OFF);
        if (zNot) {
            return;
        }
        onEventPost(c1520220pfALIZ);
    }

    @Override // X.InterfaceC1522060pi8
    public void onEventPost(C1520560pfi c1520560pfi) {
        String str;
        C1520350pfN c1520350pfN;
        final JSONObject jSONObject;
        this.LLJILJILJ.LJI(c1520560pfi, LIZLLL().LIZ);
        LIZJ().LIZ(c1520560pfi);
        String str2 = this.LLJJI.LLILZIL;
        if (c1520560pfi instanceof C1520340pfM) {
            C1520340pfM c1520340pfM = (C1520340pfM) c1520560pfi;
            C1520350pfN c1520350pfN2 = c1520340pfM.LJIILIIL;
            if (c1520350pfN2 != null) {
                str = c1520350pfN2.LIZJ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "hybrid_monitor_resource_load") && (c1520350pfN = c1520340pfM.LJIILIIL) != null && (jSONObject = c1520350pfN.LJ) != null) {
                C1491570oux.LJI(C1491570oux.LIZ, str2, new InterfaceC1491630ov3() { // from class: X.0pE2
                    @Override // X.InterfaceC1491630ov3
                    public final void onReceiveValue(Object obj) {
                        C1491690ov9 c1491690ov9 = (C1491690ov9) obj;
                        if (c1491690ov9 != null) {
                            c1491690ov9.LJ(C2097608Jq.LJIIIIZZ(new Pair("res_load_start", Long.valueOf(jSONObject.optLong("res_load_start", -1L))), new Pair("res_load_end", Long.valueOf(jSONObject.optLong("res_load_finish", -1L)))));
                        }
                    }
                });
            }
        }
    }
}
