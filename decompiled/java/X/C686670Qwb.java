package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.SearchAdHybridCardStayDurationSettingModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.service.ICommerceAdProfileContainerService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qwb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686670Qwb implements C0PP8 {
    public Aweme LL;
    public C0Q18 LLILLJJLI;
    public Context LLILLL;
    public ViewGroup LLILZ;
    public C0PP9 LLILZIL;
    public SmartImageView LLILZLL;
    public boolean LLIZ;
    public C0Q4Z LLIZLLLIL = C0Q4Z.IDLE;
    public InterfaceC686700Qwe LLJ;
    public AbstractC655400PnG LLJI;
    public C686760Qwk LLJIJIL;
    public long LLJILJIL;
    public Integer LLJILJILJ;
    public boolean LLJILLL;
    public C686710Qwf LLJJ;

    @Override // X.C0PPF
    public final void onDestroy() {
        this.LLIZ = false;
        C0Q18 c0q18 = this.LLILLJJLI;
        if (c0q18 != null) {
            c0q18.onDestroy();
        }
        this.LLILLJJLI = null;
        this.LLJIJIL = null;
        InterfaceC686700Qwe interfaceC686700Qwe = this.LLJ;
        if (interfaceC686700Qwe != null) {
            interfaceC686700Qwe.LJIIJJI(this.LL);
        }
        this.LLIZLLLIL = C0Q4Z.IDLE;
    }

    public final InterfaceC686720Qwg LIZJ() {
        InterfaceC686700Qwe interfaceC686700Qwe = this.LLJ;
        if (interfaceC686700Qwe != null) {
            return interfaceC686700Qwe.LJI();
        }
        return null;
    }

    public final void LJFF() {
        Function0<Unit> function0;
        ViewGroup viewGroup;
        C0PP9 c0pp9 = this.LLILZIL;
        if (c0pp9 != null && (viewGroup = c0pp9.LIZJ) != null) {
            viewGroup.animate().alpha(0.0f).setDuration(500L).withEndAction(new RunnableC514501zT(viewGroup, null, 41)).start();
        }
        C0PP9 c0pp92 = this.LLILZIL;
        if (c0pp92 == null || (function0 = c0pp92.LJFF) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // X.C0PP8
    public final void LJIJ() {
        Aweme aweme;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        C686710Qwf c686710Qwf = this.LLJJ;
        if (c686710Qwf == null || (aweme = this.LL) == null || (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) == null) {
            return;
        }
        C0P9G c0p9g = C0P9G.LIZ;
        String str = c686710Qwf.LIZJ;
        String str2 = c686710Qwf.LIZLLL;
        String str3 = c686710Qwf.LJ;
        String str4 = c686710Qwf.LIZ;
        int i = c686710Qwf.LIZIZ;
        int i2 = c686710Qwf.LJFF;
        c0p9g.getClass();
        C0P9G.LIZLLL(awemeRawAdLJJIJLIJ, str, str2, str3, str4, str4, i, i2);
    }

    @Override // X.C0PPF
    public final void bind() {
        ViewGroup.LayoutParams layoutParams;
        Integer numLIZJ;
        ViewGroup.LayoutParams layoutParams2;
        if (this.LLIZLLLIL == C0Q4Z.SHOW_FAILED) {
            LJFF();
            return;
        }
        Integer numValueOf = null;
        if (this.LLILLJJLI == null) {
            InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
            if (interfaceC657510PqfLIZLLL != null) {
                this.LLILLJJLI = interfaceC657510PqfLIZLLL.LIZIZ(this.LL, null, false, false);
                interfaceC657510PqfLIZLLL.LJIIJ().LJII(this.LLILLJJLI);
            }
            C0Q18 c0q18 = this.LLILLJJLI;
            if (c0q18 != null) {
                Aweme aweme = this.LL;
                SAFHelper.LIZ.getClass();
                Activity activityLJIIIIZZ = SAFHelper.LJIIIIZZ(null);
                InterfaceC1009890cO3 interfaceC1009890cO3 = new InterfaceC1009890cO3() { // from class: X.0Qwj
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // X.InterfaceC1009890cO3
                    public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
                        String type;
                        String str;
                        String strOptString;
                        JSONObject jSONObjectOptJSONObject;
                        boolean z;
                        InterfaceC660150Puv interfaceC660150PuvLJJII;
                        InterfaceC1010250cOd interfaceC1010250cOdMh;
                        C1007860cKm c1007860cKmLJIILIIL;
                        String aid;
                        ViewGroup viewGroup;
                        View rootView;
                        View viewFindViewWithTag;
                        C0Q17 c0q17LJIIJ;
                        IAnoleManager iAnoleManagerRi;
                        C1007860cKm c1007860cKmLJIILIIL2;
                        String aid2;
                        ViewGroup.LayoutParams layoutParams3;
                        C0Q17 c0q17LJIIJ2;
                        Aweme aweme2 = null;
                        AwemeRawAd awemeRawAdLJJIJLIJ = null;
                        listLJIIJ = null;
                        List<InterfaceC1007930cKt> listLJIIJ = null;
                        AwemeRawAd awemeRawAdLJJIJLIJ2 = null;
                        aweme2 = null;
                        aweme2 = null;
                        if (interfaceC1007930cKt != null) {
                            type = interfaceC1007930cKt.getType();
                        } else {
                            type = null;
                        }
                        String str2 = "";
                        if (abstractC991850bux instanceof C991870buz) {
                            if (Intrinsics.LJFF(type, EnumC1008920cMU.SEARCH_EASTER_EGG.getType())) {
                                InterfaceC657510Pqf interfaceC657510PqfLIZLLL2 = C655610Pnb.LIZIZ.LIZLLL();
                                if (interfaceC657510PqfLIZLLL2 != null && (c0q17LJIIJ2 = interfaceC657510PqfLIZLLL2.LJIIJ()) != null) {
                                    c0q17LJIIJ2.LJIIIZ(true);
                                    return;
                                }
                                return;
                            }
                            C686670Qwb c686670Qwb = this.LIZ;
                            c686670Qwb.LIZIZ(false);
                            ViewGroup viewGroup2 = c686670Qwb.LLILZ;
                            if (viewGroup2 != null && (layoutParams3 = viewGroup2.getLayoutParams()) != null) {
                                layoutParams3.height = -2;
                            }
                            c686670Qwb.LLIZ = true;
                            c686670Qwb.LLJILLL = true;
                            c686670Qwb.LLIZLLLIL = C0Q4Z.SHOW_SUCCEEDED;
                            InterfaceC657510Pqf interfaceC657510PqfLIZLLL3 = C655610Pnb.LIZIZ.LIZLLL();
                            if (interfaceC657510PqfLIZLLL3 != null && (c1007860cKmLJIILIIL2 = interfaceC657510PqfLIZLLL3.LJIILIIL()) != null) {
                                Aweme aweme3 = c686670Qwb.LL;
                                if (aweme3 != null) {
                                    aid2 = aweme3.getAid();
                                } else {
                                    aid2 = null;
                                }
                                C0PPD c0ppdLIZIZ = c1007860cKmLJIILIIL2.LIZIZ(null, aid2);
                                if (c0ppdLIZIZ != null) {
                                    c0ppdLIZIZ.LIZIZ(true);
                                    c0ppdLIZIZ.LJ();
                                }
                            }
                            InterfaceC686720Qwg interfaceC686720QwgLIZJ = c686670Qwb.LIZJ();
                            if (interfaceC686720QwgLIZJ != null) {
                                interfaceC686720QwgLIZJ.LJFF(c686670Qwb.LL);
                            }
                            c686670Qwb.LLJILJIL = System.currentTimeMillis();
                            if (!c686670Qwb.LLJILLL) {
                                return;
                            }
                            Aweme aweme4 = c686670Qwb.LL;
                            if (aweme4 != null) {
                                awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme4);
                            }
                            c686670Qwb.LJII(awemeRawAdLJJIJLIJ, "", true);
                            return;
                        }
                        if (abstractC991850bux instanceof C991860buy) {
                            C0Q18 c0q182 = this.LIZ.LLILLJJLI;
                            if (c0q182 != null && (iAnoleManagerRi = c0q182.Ri()) != null) {
                                listLJIIJ = iAnoleManagerRi.LJIIJ(EnumC656000PoE.SEARCH_AD_HYBRID_ABOVE_LAYER.getValue());
                            }
                            if (Intrinsics.LJFF(type, EnumC1008920cMU.SEARCH_EASTER_EGG.getType())) {
                                InterfaceC657510Pqf interfaceC657510PqfLIZLLL4 = C655610Pnb.LIZIZ.LIZLLL();
                                if (interfaceC657510PqfLIZLLL4 != null && (c0q17LJIIJ = interfaceC657510PqfLIZLLL4.LJIIJ()) != null) {
                                    c0q17LJIIJ.LJIIIZ(false);
                                }
                            } else {
                                C686670Qwb c686670Qwb2 = this.LIZ;
                                c686670Qwb2.LLJILLL = false;
                                InterfaceC686720Qwg interfaceC686720QwgLIZJ2 = c686670Qwb2.LIZJ();
                                if (interfaceC686720QwgLIZJ2 != null) {
                                    interfaceC686720QwgLIZJ2.LJII();
                                }
                            }
                            if (listLJIIJ == null || listLJIIJ.isEmpty() || listLJIIJ.size() != 1 || !Intrinsics.LJFF(((InterfaceC1007930cKt) ListProtector.get(listLJIIJ, 0)).getType(), type) || (viewGroup = this.LIZ.LLILZ) == null || (rootView = viewGroup.getRootView()) == null || (viewFindViewWithTag = rootView.findViewWithTag("search_ad_above_anole_full_screen_view_container")) == null) {
                                return;
                            }
                            C786410Ut5.LJLLLLLL(8, viewFindViewWithTag);
                            return;
                        }
                        if (abstractC991850bux instanceof C991310bu5) {
                            if (Intrinsics.LJFF(type, EnumC1008920cMU.SEARCH_EASTER_EGG.getType())) {
                                return;
                            }
                            this.LIZ.getClass();
                            C686670Qwb c686670Qwb3 = this.LIZ;
                            String str3 = ((C991310bu5) abstractC991850bux).LIZ;
                            c686670Qwb3.LLJILLL = false;
                            c686670Qwb3.LLIZLLLIL = C0Q4Z.SHOW_FAILED;
                            c686670Qwb3.LJFF();
                            InterfaceC657510Pqf interfaceC657510PqfLIZLLL5 = C655610Pnb.LIZIZ.LIZLLL();
                            if (interfaceC657510PqfLIZLLL5 != null && (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL5.LJIILIIL()) != null) {
                                Aweme aweme5 = c686670Qwb3.LL;
                                if (aweme5 != null) {
                                    aid = aweme5.getAid();
                                } else {
                                    aid = null;
                                }
                                C0PPD c0ppdLIZIZ2 = c1007860cKmLJIILIIL.LIZIZ(null, aid);
                                if (c0ppdLIZIZ2 != null) {
                                    c0ppdLIZIZ2.LIZIZ(false);
                                    c0ppdLIZIZ2.LJ();
                                }
                            }
                            InterfaceC686720Qwg interfaceC686720QwgLIZJ3 = c686670Qwb3.LIZJ();
                            if (interfaceC686720QwgLIZJ3 != null) {
                                interfaceC686720QwgLIZJ3.LJ();
                            }
                            Aweme aweme6 = c686670Qwb3.LL;
                            if (aweme6 != null) {
                                awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme6);
                            }
                            if (str3 != null) {
                                str2 = str3;
                            }
                            c686670Qwb3.LJII(awemeRawAdLJJIJLIJ2, str2, false);
                            return;
                        }
                        if (!(abstractC991850bux instanceof C989580brI)) {
                            return;
                        }
                        T t = ((C989580brI) abstractC991850bux).LIZ;
                        if (t instanceof C1009000cMc) {
                            C686670Qwb c686670Qwb4 = this.LIZ;
                            C1009000cMc c1009000cMc = (C1009000cMc) t;
                            c686670Qwb4.getClass();
                            String str4 = c1009000cMc.LIZJ;
                            int iHashCode = str4.hashCode();
                            if (iHashCode != -2127922623) {
                                if (iHashCode != -891593647) {
                                    if (iHashCode == 2070443226 && str4.equals("sendAdLogWrapper")) {
                                        C686780Qwm c686780Qwm = new Object() { // from class: X.0Qwm
                                        };
                                        String str5 = c1009000cMc.LIZLLL;
                                        c686780Qwm.getClass();
                                        if (str5 == null || str5.length() == 0) {
                                            return;
                                        }
                                        JSONObject jSONObject = new JSONObject(str5);
                                        String strOptString2 = jSONObject.optString("tag");
                                        String strOptString3 = jSONObject.optString("label");
                                        String strOptString4 = jSONObject.optString("searchAdCacheKey");
                                        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("extParam");
                                        if (jSONObjectOptJSONObject2 != null) {
                                            strOptString = jSONObjectOptJSONObject2.optString("refer");
                                            jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("ad_extra_data");
                                        } else {
                                            strOptString = null;
                                            jSONObjectOptJSONObject = null;
                                        }
                                        if (strOptString2 == null || strOptString2.length() == 0 || strOptString3 == null || strOptString3.length() == 0 || strOptString4 == null || strOptString4.length() == 0) {
                                            return;
                                        }
                                        try {
                                            InterfaceC657510Pqf interfaceC657510PqfLIZLLL6 = C655610Pnb.LIZIZ.LIZLLL();
                                            if (interfaceC657510PqfLIZLLL6 != null && (interfaceC660150PuvLJJII = interfaceC657510PqfLIZLLL6.LJJII(strOptString4)) != null && (interfaceC1010250cOdMh = interfaceC660150PuvLJJII.Mh()) != null) {
                                                aweme2 = interfaceC1010250cOdMh.getAweme();
                                            }
                                            AwemeRawAd awemeRawAdLJJIJLIJ3 = C1017070cZd.LJJIJLIJ(aweme2);
                                            if (awemeRawAdLJJIJLIJ3 == null) {
                                                return;
                                            }
                                            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(strOptString2, strOptString3, awemeRawAdLJJIJLIJ3);
                                            if (strOptString != null && strOptString.length() > 0 && strOptString != null) {
                                                c1022820ciuLIZLLL.LIZJ(strOptString, "refer");
                                            }
                                            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                                                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                                while (itKeys.hasNext()) {
                                                    String next = itKeys.next();
                                                    c1022820ciuLIZLLL.LIZIZ(jSONObjectOptJSONObject.get(next), next);
                                                }
                                            }
                                            boolean zLLIZLLLIL = C1017070cZd.LLIZLLLIL(aweme2);
                                            boolean zLJIJI = C1010120cOQ.LJIJI(aweme2);
                                            if (awemeRawAdLJJIJLIJ3.getRollType() != 1) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (InterfaceC1019140ccy.LIZLLL.contains(strOptString3) && zLLIZLLLIL && zLJIJI && z) {
                                                AdSessionPositionHelper.LIZ.getClass();
                                                AdSessionPositionHelper.LJIILL(c1022820ciuLIZLLL, awemeRawAdLJJIJLIJ3);
                                            }
                                            if (Intrinsics.LJFF("realtime_click", strOptString3)) {
                                                c1022820ciuLIZLLL.LIZIZ(awemeRawAdLJJIJLIJ3.getIncentiveInfo(), "coupon_info");
                                            }
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            ICommerceAdProfileContainerService iCommerceAdProfileContainerService = (ICommerceAdProfileContainerService) PluggableExtentionKt.pluggableSpi$default(ICommerceAdProfileContainerService.class, false, false, false, 14, null);
                                            if (iCommerceAdProfileContainerService != null) {
                                                iCommerceAdProfileContainerService.LIZ(aweme2, linkedHashMap, strOptString, strOptString2);
                                            }
                                            c1022820ciuLIZLLL.LIZ(linkedHashMap);
                                            if (C13LQ.LJJIJIIJI(strOptString3, new String[]{"click", "realtime_click"}) >= 0) {
                                                c1022820ciuLIZLLL.LIZIZ("1", "is_from_jsb");
                                            }
                                            c1022820ciuLIZLLL.LJII();
                                            return;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            return;
                                        }
                                    }
                                } else if (str4.equals("openLandPageWithJumpModel")) {
                                    String str6 = c1009000cMc.LIZLLL;
                                    Aweme aweme7 = c686670Qwb4.LL;
                                    if (aweme7 == null || str6 == null || str6.length() == 0) {
                                        return;
                                    }
                                    try {
                                        JSONObject jSONObject2 = new JSONObject(str6);
                                        String strOptString5 = jSONObject2.optString("jump_model");
                                        if (strOptString5 == null || strOptString5.length() == 0) {
                                            return;
                                        }
                                        String strOptString6 = jSONObject2.optString("refer");
                                        String strOptString7 = jSONObject2.optString("tag");
                                        int iOptInt = jSONObject2.optInt("clickFrom", 0);
                                        String strOptString8 = jSONObject2.optString("routerScene");
                                        if (strOptString8 != null) {
                                            str2 = strOptString8;
                                        }
                                        C0R12.LIZIZ.LJ(c686670Qwb4.LLILLL, aweme7, strOptString6, strOptString7, iOptInt, str2, strOptString5);
                                        return;
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        C1AF0.LIZJ("openLandPageWithJumpModel");
                                        return;
                                    }
                                }
                            } else if (str4.equals("registerUserFollowStatusChange")) {
                                if (c686670Qwb4.LLJIJIL == null) {
                                    c686670Qwb4.LLJIJIL = new C686760Qwk(c686670Qwb4.LLILZ, c686670Qwb4.LLILLJJLI);
                                }
                                C686760Qwk c686760Qwk = c686670Qwb4.LLJIJIL;
                                if (c686760Qwk == null || (str = c1009000cMc.LIZLLL) == null || str.length() == 0) {
                                    return;
                                }
                                try {
                                    String strOptString9 = new JSONObject(str).optString("uid");
                                    if (strOptString9.length() <= 0) {
                                        return;
                                    }
                                    Iterator it2 = a0.LJJLIIIJILLIZJL(strOptString9, new String[]{","}, 0, 6).iterator();
                                    while (it2.hasNext()) {
                                        String string = a0.LJLIIIL((String) it2.next()).toString();
                                        if (string.length() > 0 && !c686760Qwk.LIZLLL.containsKey(string)) {
                                            c686760Qwk.LIZLLL.put(string, null);
                                            if (!c686760Qwk.LIZJ) {
                                                c686760Qwk.LIZJ = true;
                                                LifecycleOwner lifecycleOwner = (LifecycleOwner) c686760Qwk.LJ.getValue();
                                                if (lifecycleOwner != null) {
                                                    C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(lifecycleOwner, c686760Qwk.LJFF);
                                                }
                                            }
                                        }
                                    }
                                    return;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return;
                                }
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("unHandle Anole common JSB payload=");
                            sbLIZ.append(c1009000cMc);
                            C2188811AlT.LIZIZ(sbLIZ);
                            return;
                        }
                        if (!(t instanceof C686790Qwn)) {
                            return;
                        }
                        this.LIZ.LLJILJILJ = Integer.valueOf(((C686790Qwn) t).LIZ);
                    }
                };
                InterfaceC686700Qwe interfaceC686700Qwe = this.LLJ;
                c0q18.Jt2(new C1010460cOy(aweme, activityLJIIIIZZ, interfaceC1009890cO3, null, this.LLILZ, interfaceC686700Qwe != null ? interfaceC686700Qwe.LIZ(this.LLJI, this.LL) : null, 8));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[tryInitSearchItemModule] searchItemModule ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", currentAweme.aid = ");
            Aweme aweme2 = this.LL;
            sbLIZ.append(aweme2 != null ? aweme2.getAid() : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C0Q18 c0q182 = this.LLILLJJLI;
        if (c0q182 != null) {
            c0q182.bind();
        }
        int iLIZ = 0;
        if (this.LLIZ) {
            LIZIZ(false);
        } else {
            LIZIZ(true);
            InterfaceC686700Qwe interfaceC686700Qwe2 = this.LLJ;
            if (interfaceC686700Qwe2 != null && (numLIZJ = interfaceC686700Qwe2.LIZJ(this.LLJI)) != null) {
                int iIntValue = numLIZJ.intValue();
                C0PP9 c0pp9 = this.LLILZIL;
                if (c0pp9 != null && c0pp9.LJ) {
                    iLIZ = (int) C417050GWx.LIZ(8);
                }
                SmartImageView smartImageView = this.LLILZLL;
                if (smartImageView != null && (layoutParams2 = smartImageView.getLayoutParams()) != null) {
                    layoutParams2.height = ((int) C417050GWx.LIZ(iIntValue)) + iLIZ;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[adjustLayout]，height = ");
            SmartImageView smartImageView2 = this.LLILZLL;
            if (smartImageView2 != null && (layoutParams = smartImageView2.getLayoutParams()) != null) {
                numValueOf = Integer.valueOf(layoutParams.height);
            }
            sbLIZ2.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LLIZLLLIL = C0Q4Z.DATA_BINDED;
    }

    @Override // X.C0PPF
    public final void onViewAttachedToWindow() {
        C0Q18 c0q18 = this.LLILLJJLI;
        if (c0q18 != null) {
            c0q18.onViewAttachedToWindow();
        }
        InterfaceC686720Qwg interfaceC686720QwgLIZJ = LIZJ();
        if (interfaceC686720QwgLIZJ != null) {
            interfaceC686720QwgLIZJ.LIZIZ(this.LL);
        }
    }

    @Override // X.C0PPF
    public final void onViewDetachedFromWindow() {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        Collection<AnoleComponentModel> collectionValues;
        Object next;
        String str;
        SearchAdHybridCardStayDurationSettingModel searchAdHybridCardStayDurationSettingModel;
        List<String> list;
        C0Q18 c0q18 = this.LLILLJJLI;
        if (c0q18 != null) {
            c0q18.onViewDetachedFromWindow();
        }
        InterfaceC686720Qwg interfaceC686720QwgLIZJ = LIZJ();
        if (interfaceC686720QwgLIZJ != null) {
            interfaceC686720QwgLIZJ.LJIIIZ(this.LL);
        }
        if (!this.LLIZ || this.LLJILJIL <= 0) {
            return;
        }
        Aweme aweme = this.LL;
        String value = EnumC656000PoE.SEARCH_AD_HYBRID_CARD.getValue();
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (anoleModel = awemeRawAd.getAnoleModel()) == null || (map = anoleModel.components) == null || (collectionValues = map.values()) == null) {
            return;
        }
        Iterator<T> it2 = collectionValues.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (Intrinsics.LJFF(((AnoleComponentModel) next).slotID, value)) {
                    break;
                }
            }
        }
        AnoleComponentModel anoleComponentModel = (AnoleComponentModel) next;
        if (anoleComponentModel == null || (str = anoleComponentModel.type) == null || (searchAdHybridCardStayDurationSettingModel = (SearchAdHybridCardStayDurationSettingModel) C686740Qwi.LIZIZ.getValue()) == null || (list = searchAdHybridCardStayDurationSettingModel.cardList) == null || !list.contains(str)) {
            return;
        }
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(this.LL);
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LJJIJIL, new AwS595S0100000_16(this, 352));
    }

    @Override // X.C0PP8
    public final C0Q18 LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.C0PP8
    public final Aweme LJIIIIZZ() {
        return this.LL;
    }

    @Override // X.C0PP8
    public final C0Q4Z getCurrentState() {
        return this.LLIZLLLIL;
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            SmartImageView smartImageView = this.LLILZLL;
            if (smartImageView != null) {
                C786410Ut5.LLFF(0, smartImageView);
                return;
            }
            return;
        }
        SmartImageView smartImageView2 = this.LLILZLL;
        if (smartImageView2 == null) {
            return;
        }
        C786410Ut5.LLFF(8, smartImageView2);
    }

    @Override // X.C0PP8
    public final C0POT LIZLLL(C0PK8 c0pk8) {
        Map<C0PK8, C0POT> map = C0POU.LIZ;
        return (C0POT) ((LinkedHashMap) C0POU.LIZ).get(c0pk8);
    }

    @Override // X.C0PP8
    public final void LJIIJJI(C686710Qwf c686710Qwf) {
        this.LLJJ = c686710Qwf;
    }

    @Override // X.C0PP8
    public final void LJIILIIL(C0PP9 c0pp9) {
        SmartImageView smartImageView;
        this.LLILZIL = c0pp9;
        this.LLILLL = c0pp9.LIZ;
        this.LLILZ = c0pp9.LIZJ;
        View view = c0pp9.LIZIZ;
        if (view instanceof SmartImageView) {
            smartImageView = (SmartImageView) view;
        } else {
            smartImageView = null;
        }
        this.LLILZLL = smartImageView;
    }

    @Override // X.C0PPF
    public final void LJIIZILJ(boolean z) {
        InterfaceC686720Qwg interfaceC686720QwgLIZJ = LIZJ();
        if (interfaceC686720QwgLIZJ != null) {
            interfaceC686720QwgLIZJ.LJIIJ(this.LL, z);
        }
    }

    @Override // X.C0PP8
    public final void LJIILL(AbstractC655400PnG abstractC655400PnG, InterfaceC686700Qwe interfaceC686700Qwe) {
        String aid;
        String requestId;
        if (interfaceC686700Qwe == null || abstractC655400PnG == null) {
            return;
        }
        this.LLJ = interfaceC686700Qwe;
        this.LLJI = abstractC655400PnG;
        Aweme awemeLIZLLL = interfaceC686700Qwe.LIZLLL(abstractC655400PnG, this.LL);
        this.LL = awemeLIZLLL;
        interfaceC686700Qwe.LJIIIIZZ(abstractC655400PnG, awemeLIZLLL);
        this.LLIZLLLIL = C0Q4Z.DATA_PARSED;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[parseData], currentAweme, aid = ");
        Aweme aweme = this.LL;
        AwemeRawAd awemeRawAd = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", reqId = ");
        Aweme aweme2 = this.LL;
        if (aweme2 != null) {
            requestId = aweme2.getRequestId();
        } else {
            requestId = null;
        }
        sbLIZ.append(requestId);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!(interfaceC686700Qwe instanceof C655950Po9)) {
            C1010090cON c1010090cON = C1010090cON.LIZ;
            Aweme aweme3 = this.LL;
            if (aweme3 != null) {
                awemeRawAd = aweme3.getAwemeRawAd();
            }
            c1010090cON.LJIILJJIL(awemeRawAd, false, false, null);
        }
    }

    public final void LJII(AwemeRawAd awemeRawAd, String str, boolean z) {
        C686710Qwf c686710Qwf = this.LLJJ;
        if (c686710Qwf == null) {
            return;
        }
        if (z) {
            C0P9G c0p9g = C0P9G.LIZ;
            String str2 = c686710Qwf.LIZJ;
            String str3 = c686710Qwf.LIZLLL;
            String str4 = c686710Qwf.LJ;
            String str5 = c686710Qwf.LIZ;
            C0P9G.LJI(c0p9g, awemeRawAd, str2, str3, str4, str5, str5, c686710Qwf.LIZIZ, c686710Qwf.LJFF);
            return;
        }
        C0P9G c0p9g2 = C0P9G.LIZ;
        String str6 = c686710Qwf.LIZJ;
        String str7 = c686710Qwf.LIZLLL;
        String str8 = c686710Qwf.LJ;
        String str9 = c686710Qwf.LIZ;
        C0P9G.LJFF(c0p9g2, awemeRawAd, str6, str7, str8, str9, str9, c686710Qwf.LIZIZ, c686710Qwf.LJFF, str);
    }
}
