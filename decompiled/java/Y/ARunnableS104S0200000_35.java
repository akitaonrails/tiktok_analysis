package Y;

import X.C07Y3;
import X.C0PRC;
import X.C0Q3E;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C1914007ec;
import X.C1C7U;
import X.C1CC2;
import X.C1DEC;
import X.C1DEF;
import X.C1DML;
import X.C1DO7;
import X.C20441214yg;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2252181DDc;
import X.C2254341DLk;
import X.C2260891DeR;
import X.C2260901DeS;
import X.C2263141Di4;
import X.C2263181Di8;
import X.C418040GaI;
import X.C644560PPy;
import X.C780620Ujk;
import X.C780630Ujl;
import X.C786410Ut5;
import X.EnumC1782600wUM;
import X.EnumC780830Uk5;
import X.InterfaceC469360Ias;
import android.os.SystemClock;
import com.bytedance.android.livesdk.broadcast.interaction.config.AnchorWidgetLoadController;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.medialib.qr.PicScanner;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.b0;
import com.ss.android.ugc.aweme.search.ecom.data.ShopTabInfo;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public class ARunnableS104S0200000_35 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void run$1(ARunnableS104S0200000_35 aRunnableS104S0200000_35) {
        ((WidgetManager) aRunnableS104S0200000_35.l0).lambda$unloadFramePaced$14((Widget) aRunnableS104S0200000_35.l1);
    }

    public static final void run$2(ARunnableS104S0200000_35 aRunnableS104S0200000_35) {
        ((WidgetManager) aRunnableS104S0200000_35.l0).lambda$unload$13((Widget) aRunnableS104S0200000_35.l1);
    }

    public static final void run$3(ARunnableS104S0200000_35 aRunnableS104S0200000_35) {
        ((WidgetManager) aRunnableS104S0200000_35.l0).lambda$load$11((Widget) aRunnableS104S0200000_35.l1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        List<C780630Ujl> listLLIIII;
        String simpleName;
        C2252181DDc c2252181DDc;
        AnchorWidgetLoadController anchorWidgetLoadController = (AnchorWidgetLoadController) this.l0;
        EnumC780830Uk5 enumC780830Uk5 = (EnumC780830Uk5) this.l1;
        C2252181DDc c2252181DDc2 = anchorWidgetLoadController.LLIZ.get(enumC780830Uk5);
        if (c2252181DDc2 == null || c2252181DDc2.LJIIJ || c2252181DDc2.LJIIJJI) {
            return;
        }
        int iIndexOf = anchorWidgetLoadController.LLILZLL.indexOf(enumC780830Uk5);
        Object obj = iIndexOf <= 0 ? null : ListProtector.get(anchorWidgetLoadController.LLILZLL, iIndexOf - 1);
        if (obj == null || ((c2252181DDc = anchorWidgetLoadController.LLIZ.get(obj)) != null && c2252181DDc.LJIIJJI)) {
            c2252181DDc2.LJIIJ = true;
            c2252181DDc2.LJIIL = SystemClock.uptimeMillis();
            anchorWidgetLoadController.LLJ = enumC780830Uk5;
            c2252181DDc2.LJFF.clear();
            C780620Ujk c780620Ujk = anchorWidgetLoadController.LL;
            if (enumC780830Uk5 == null) {
                c780620Ujk.getClass();
                listLLIIII = C13BV.INSTANCE;
            } else {
                List<C780630Ujl> list = c780620Ujk.LIZ.get(enumC780830Uk5);
                if (list == null || (listLLIIII = C13LP.LLIIII(list)) == null) {
                    listLLIIII = C13BV.INSTANCE;
                }
            }
            for (C780630Ujl c780630Ujl : listLLIIII) {
                Class<? extends LiveRecyclableWidget> cls = c780630Ujl.LIZIZ;
                if (cls != null) {
                    simpleName = cls.getSimpleName();
                } else {
                    Widget widget = c780630Ujl.LIZ;
                    if (widget != null) {
                        simpleName = widget.getClass().getSimpleName();
                    }
                }
                if (simpleName != null && simpleName.length() != 0) {
                    Map<String, Integer> map = c2252181DDc2.LJFF;
                    Integer num = map.get(simpleName);
                    map.put(simpleName, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
            c2252181DDc2.LJI = c2252181DDc2.LJFF.size();
            c2252181DDc2.LJII = C13LP.LJZI(c2252181DDc2.LJFF.values());
            c2252181DDc2.LIZJ.clear();
            c2252181DDc2.LIZLLL.clear();
            c2252181DDc2.LIZIZ.clear();
            c2252181DDc2.LJ.clear();
            c2252181DDc2.LJIIIIZZ = 0;
            c2252181DDc2.LJIIIZ = 0;
            anchorWidgetLoadController.LLIZLLLIL = enumC780830Uk5;
            anchorWidgetLoadController.LLJIJIL = true;
            try {
                anchorWidgetLoadController.LL.LJ(enumC780830Uk5, null);
                anchorWidgetLoadController.LLJIJIL = false;
                anchorWidgetLoadController.LLIZLLLIL = null;
                int iLJZI = C13LP.LJZI(c2252181DDc2.LIZJ.values());
                int size = c2252181DDc2.LIZJ.size();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("phase_start priority=");
                sbLIZ.append(enumC780830Uk5);
                sbLIZ.append(" planned=");
                sbLIZ.append(c2252181DDc2.LJFF.keySet());
                sbLIZ.append(" preRequest=");
                sbLIZ.append(c2252181DDc2.LIZJ.keySet());
                C20441214yg.LJIIIZ("AnchorWidgetLoad", C2188811AlT.LIZIZ(sbLIZ));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("phase_priority", c2252181DDc2.LIZ.name());
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("delay_ms", anchorWidgetLoadController.LIZJ(c2252181DDc2.LIZ));
                    jSONObject3.put("planned_widget_count", c2252181DDc2.LJII);
                    jSONObject3.put("planned_widget_type_count", c2252181DDc2.LJI);
                    jSONObject3.put("pre_request_widget_count", iLJZI);
                    jSONObject3.put("pre_request_widget_type_count", size);
                    C1CC2.LJFF("ttlive_anchor_widget_load_phase_start", jSONObject, jSONObject2, jSONObject3);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (c2252181DDc2.LIZJ.isEmpty() && c2252181DDc2.LIZIZ.isEmpty()) {
                    anchorWidgetLoadController.LIZIZ(enumC780830Uk5, c2252181DDc2.LJIIIZ == 0 ? "no_widgets" : "all_loaded");
                    return;
                }
                ARunnableS104S0200000_35 aRunnableS104S0200000_35 = new ARunnableS104S0200000_35(anchorWidgetLoadController, enumC780830Uk5, 10);
                c2252181DDc2.LJIILLIIL = aRunnableS104S0200000_35;
                C786410Ut5.LJLIIL(anchorWidgetLoadController.LLILLL.getRequestSettleMs(), anchorWidgetLoadController.LLILZ, aRunnableS104S0200000_35);
                long timeoutAfterDelayMs = anchorWidgetLoadController.LLILLL.getTimeoutAfterDelayMs();
                ARunnableS68S0300000_35 aRunnableS68S0300000_35 = new ARunnableS68S0300000_35(c2252181DDc2, enumC780830Uk5, anchorWidgetLoadController, 0);
                c2252181DDc2.LJIILL = aRunnableS68S0300000_35;
                C786410Ut5.LJLIIL(timeoutAfterDelayMs, anchorWidgetLoadController.LLILZ, aRunnableS68S0300000_35);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                anchorWidgetLoadController.LLJIJIL = false;
                anchorWidgetLoadController.LLIZLLLIL = null;
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.0Ias, X.1DeS] */
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
    public final void LIZ$1() {
        CharSequence charSequenceLIZIZ;
        Integer numValueOf;
        ((SearchContainerFragment) this.l1).LLLFZ.LJ = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL;
        SearchContainerFragment searchContainerFragment = (SearchContainerFragment) this.l1;
        SearchResultParam searchResultParam = searchContainerFragment.LL;
        if (searchResultParam != null) {
            searchContainerFragment.LLLFZ.LJFF = searchResultParam.getEnterMethod();
        }
        SearchContainerFragment searchContainerFragment2 = (SearchContainerFragment) this.l1;
        C2260891DeR c2260891DeR = searchContainerFragment2.LLLFZ;
        ShopTabInfo shopTabInfo = (ShopTabInfo) this.l0;
        C1846060y8i c1846060y8i = searchContainerFragment2.LLIZ;
        int i = searchContainerFragment2.LLLF;
        c2260891DeR.getClass();
        C644560PPy.LIZ.getClass();
        boolean z = true;
        if (i == C644560PPy.LJIIZILJ()) {
            c2260891DeR.LIZJ = true;
            c2260891DeR.LIZLLL = true;
        }
        c2260891DeR.LIZ = shopTabInfo;
        int iLJIIZILJ = C644560PPy.LJIIZILJ();
        int i2 = shopTabInfo.shopTabType;
        c2260891DeR.LIZ(c1846060y8i.LJII(iLJIIZILJ));
        EnumC1782600wUM enumC1782600wUM = EnumC1782600wUM.RED_DOT;
        if (i2 == enumC1782600wUM.getType()) {
            if (!c2260891DeR.LIZJ) {
                C1846060y8i.LJIJJ(c1846060y8i, iLJIIZILJ, new C1914007ec((Object) null), C418040GaI.LIZ(1), C418040GaI.LIZ(4), 12);
            }
        } else if (i2 == EnumC1782600wUM.TEXT_RED_DOT.getType()) {
            if (!c2260891DeR.LIZJ) {
                String str = shopTabInfo.text;
                if (C123100dR.LIZ(str)) {
                    C1846060y8i.LJIJJ(c1846060y8i, iLJIIZILJ, new C07Y3(str), C418040GaI.LIZ(-12), 0.0f, 44);
                }
            }
        } else if (i2 == EnumC1782600wUM.ALIENATION.getType()) {
            if (c2260891DeR.LIZJ) {
                c2260891DeR.LIZLLL = true;
            }
            C1845940y8W c1845940y8WLJII = c1846060y8i.LJII(C644560PPy.LJIIZILJ());
            if (c1845940y8WLJII != null && (charSequenceLIZIZ = c2260891DeR.LIZIZ()) != null) {
                c1845940y8WLJII.LIZIZ(charSequenceLIZIZ);
            }
        }
        if (((SearchContainerFragment) this.l1).LLLF != C644560PPy.LJIIZILJ() || ((ShopTabInfo) this.l0).shopTabType == EnumC1782600wUM.ALIENATION.getType()) {
            SearchContainerFragment searchContainerFragment3 = (SearchContainerFragment) this.l1;
            searchContainerFragment3.LLLFZ.LIZLLL(searchContainerFragment3.LL);
        }
        C2260891DeR c2260891DeR2 = ((SearchContainerFragment) this.l1).LLLFZ;
        ShopTabInfo shopTabInfo2 = c2260891DeR2.LIZ;
        if (shopTabInfo2 == null || (numValueOf = Integer.valueOf(shopTabInfo2.shopTabType)) == null) {
            return;
        }
        int iIntValue = numValueOf.intValue();
        if (iIntValue == enumC1782600wUM.getType() || iIntValue == EnumC1782600wUM.TEXT_RED_DOT.getType() ? c2260891DeR2.LIZJ : iIntValue != EnumC1782600wUM.ALIENATION.getType()) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (boolValueOf == null || !boolValueOf.booleanValue()) {
            return;
        }
        SearchContainerFragment searchContainerFragment4 = (SearchContainerFragment) this.l1;
        C2260901DeS c2260901DeS = searchContainerFragment4.LLLILZ;
        if (c2260901DeS != null) {
            searchContainerFragment4.LLILZIL.removeOnPageChangeListener(c2260901DeS);
        }
        final SearchContainerFragment searchContainerFragment5 = (SearchContainerFragment) this.l1;
        searchContainerFragment5.getClass();
        ?? r1 = new InterfaceC469360Ias() { // from class: X.1DeS
            public boolean LL;

            @Override // X.InterfaceC469360Ias
            public final void onPageScrolled(int i3, float f, int i4) {
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i3) {
                if (i3 == 0) {
                    C1846060y8i c1846060y8i2 = searchContainerFragment5.LLIZ;
                    C644560PPy.LIZ.getClass();
                    C1845940y8W c1845940y8WLJII2 = c1846060y8i2.LJII(C644560PPy.LJIIZILJ());
                    if (c1845940y8WLJII2 == null) {
                        return;
                    }
                    searchContainerFragment5.LLLFZ.LIZ(c1845940y8WLJII2);
                    return;
                }
                if (i3 == 1) {
                    this.LL = true;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
            @Override // X.InterfaceC469360Ias
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onPageSelected(int r11) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 253
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2260901DeS.onPageSelected(int):void");
            }
        };
        searchContainerFragment5.LLILZIL.addOnPageChangeListener(r1);
        searchContainerFragment5.LLLILZ = r1;
    }

    public final void LIZ$2() {
        C1DML c1dml;
        PicScanner picScanner = (PicScanner) this.l0;
        C2254341DLk c2254341DLk = (C2254341DLk) this.l1;
        synchronized (c2254341DLk) {
            if (picScanner != null) {
                try {
                    if (Intrinsics.LJFF(picScanner, c2254341DLk.LLILZIL) && picScanner.isValid()) {
                        if (!picScanner.isSuccess() && (c1dml = c2254341DLk.LLILZ) != null) {
                            c1dml.onFail(-2002);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LIZ$3() {
        AnchorWidgetLoadController anchorWidgetLoadController = (AnchorWidgetLoadController) this.l0;
        EnumC780830Uk5 enumC780830Uk5 = (EnumC780830Uk5) this.l1;
        C2252181DDc c2252181DDc = anchorWidgetLoadController.LLIZ.get(enumC780830Uk5);
        if (c2252181DDc == null || c2252181DDc.LJIIJJI) {
            return;
        }
        if (!c2252181DDc.LIZJ.isEmpty()) {
            c2252181DDc.LIZLLL.clear();
            c2252181DDc.LIZLLL.putAll(c2252181DDc.LIZJ);
            c2252181DDc.LIZJ.clear();
            Set<String> setKeySet = c2252181DDc.LIZLLL.keySet();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("phase_request_settle priority=");
            sbLIZ.append(enumC780830Uk5);
            sbLIZ.append(" notRequested=");
            sbLIZ.append(setKeySet);
            C20441214yg.LJIIIZ("AnchorWidgetLoad", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (c2252181DDc.LIZIZ.isEmpty()) {
            anchorWidgetLoadController.LIZIZ(enumC780830Uk5, "no_request");
        }
    }

    public static final void run$0(ARunnableS104S0200000_35 aRunnableS104S0200000_35) {
        boolean zLIZ;
        C1C7U.LIZ("AnchorWidgetLoadController@a77a.scheduleNextPhase$runnable$1");
        try {
            aRunnableS104S0200000_35.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnchorWidgetLoadController@a77a.scheduleNextPhase$runnable$1");
    }

    public static final void run$10(ARunnableS104S0200000_35 aRunnableS104S0200000_35) {
        boolean zLIZ;
        C1C7U.LIZ("AnchorWidgetLoadController@a77a.startPhase$settle$1");
        try {
            aRunnableS104S0200000_35.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnchorWidgetLoadController@a77a.startPhase$settle$1");
    }

    public static final void run$11(ARunnableS104S0200000_35 aRunnableS104S0200000_35) {
        try {
            ((C1DEF) aRunnableS104S0200000_35.l0).LJ((C1DEC) aRunnableS104S0200000_35.l1, Unit.LIZ);
        } catch (Throwable th) {
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$4(ARunnableS104S0200000_35 aRunnableS104S0200000_35) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.start$1");
        try {
            ((b0) aRunnableS104S0200000_35.l1).start((TECameraCapture) aRunnableS104S0200000_35.l0);
            b0 b0Var = (b0) aRunnableS104S0200000_35.l1;
            if (b0Var.mCameraSettings.LLJIJIL) {
                b0Var.mCameraClientCondition.open();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.start$1");
    }

    public static final void run$5(ARunnableS104S0200000_35 aRunnableS104S0200000_35) {
        b0 b0Var = (b0) aRunnableS104S0200000_35.l0;
        Runnable runnable = (Runnable) aRunnableS104S0200000_35.l1;
        b0 b0Var2 = b0.INSTANCE;
        b0Var.getClass();
        C1C7U.LIZ("TECameraServer@d252.collectCameraCapabilities$1L");
        b0Var.collectCameraCapabilities(runnable);
        C1C7U.LIZIZ("TECameraServer@d252.collectCameraCapabilities$1L");
    }

    public static final void run$6(ARunnableS104S0200000_35 aRunnableS104S0200000_35) {
        boolean zLIZ;
        C1C7U.LIZ("SearchContainerFragment@41cd.lambda$initShopTabConfig$20$1");
        try {
            aRunnableS104S0200000_35.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchContainerFragment@41cd.lambda$initShopTabConfig$20$1");
    }

    public static final void run$7(ARunnableS104S0200000_35 aRunnableS104S0200000_35) {
        C1DO7 c1do7 = (C1DO7) aRunnableS104S0200000_35.l0;
        UIAnnotationErrorCode uIAnnotationErrorCode = (UIAnnotationErrorCode) aRunnableS104S0200000_35.l1;
        C1C7U.LIZ("EEBlockUtils@e8b6.callBlock$2L");
        c1do7.LIZ(uIAnnotationErrorCode);
        C1C7U.LIZIZ("EEBlockUtils@e8b6.callBlock$2L");
    }

    public static final void run$8(ARunnableS104S0200000_35 aRunnableS104S0200000_35) {
        boolean zLIZ;
        C1C7U.LIZ("VEScanController@abd4.timeoutRunnable$1");
        try {
            aRunnableS104S0200000_35.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VEScanController@abd4.timeoutRunnable$1");
    }

    public static final void run$9(ARunnableS104S0200000_35 aRunnableS104S0200000_35) {
        boolean zLIZ;
        C1C7U.LIZ("PcsNleVideoPlayManager@774.seekToPercentageProgressAndPlay$1$code$1$1");
        try {
            C2263181Di8 c2263181Di8 = ((C2263141Di4) aRunnableS104S0200000_35.l0).LIZIZ;
            if (c2263181Di8.LJ) {
                c2263181Di8.LJ = false;
                ((Function0) aRunnableS104S0200000_35.l1).invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PcsNleVideoPlayManager@774.seekToPercentageProgressAndPlay$1$code$1$1");
    }

    public ARunnableS104S0200000_35(C2254341DLk c2254341DLk, int i) {
        this.$t = i;
        this.l1 = c2254341DLk;
    }

    public ARunnableS104S0200000_35(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public ARunnableS104S0200000_35(SearchContainerFragment searchContainerFragment, ShopTabInfo shopTabInfo, C1845940y8W c1845940y8W, int i) {
        this.$t = i;
        this.l1 = searchContainerFragment;
        this.l0 = shopTabInfo;
    }
}
