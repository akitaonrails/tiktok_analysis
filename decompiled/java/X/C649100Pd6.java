package X;

import Y.ARunnableS3S0410000_10;
import Y.AfS178S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.search.common.config.SearchMiddleLynxFallbackOptConfig;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Pd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649100Pd6 {
    public static final C649100Pd6 LIZ = new C649100Pd6();
    public static final C01GW LIZIZ = C1935507i5.LIZ(AFwS196S0000000_10.get$arr$(705));

    public static String LIZIZ(String str) {
        boolean z;
        if (a0.LJJIIZI(str, "fe_tiktok_lynx_search_transfer", false) && a0.LJJIIZI(C0BRT.LIZ, "page_skeleton_screen", false)) {
            C01GW c01gw = C306340Bzc.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C2089008Gi c2089008Gi = new C2089008Gi(str);
                c2089008Gi.LIZIZ(1, "disable_auto_remove_loading");
                c2089008Gi.LIZLLL("skeleton_path", "page_skeleton_light.svg");
                return c2089008Gi.LJ();
            }
            if (((Number) c01gw.getValue()).intValue() == 3) {
                C2089008Gi c2089008Gi2 = new C2089008Gi(str);
                c2089008Gi2.LIZIZ(1, "disable_auto_remove_loading");
                c2089008Gi2.LIZLLL("skeleton_path", "page_skeleton_cartoon_light.svg");
                c2089008Gi2.LIZIZ(1, "skeleton_with_animation");
                c2089008Gi2.LIZ(0.03d, "skeleton_from_alpha");
                c2089008Gi2.LIZ(0.08d, "skeleton_to_alpha");
                c2089008Gi2.LIZIZ(800, "skeleton_duration");
                return c2089008Gi2.LJ();
            }
            return str;
        }
        return str;
    }

    public static boolean LJ(View view) throws Throwable {
        Lifecycle.State currentState;
        LifecycleOwner creativeLifecycleOwner;
        if (view == null) {
            return true;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(view);
        if (c19egLIZIZ != null) {
            ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
            if (iCreativeSAAService != null && (creativeLifecycleOwner = iCreativeSAAService.getCreativeLifecycleOwner(c19egLIZIZ)) != null) {
                if (creativeLifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    return true;
                }
                return false;
            }
            SAFHelper.LIZ.getClass();
            boolean zLJJJJI = SAFHelper.LJJJJI(fragmentLIZLLL, c19egLIZIZ);
            boolean zLJJJJJ = SAFHelper.LJJJJJ(fragmentLIZLLL, c19egLIZIZ);
            if (zLJJJJI || zLJJJJJ) {
                return true;
            }
        }
        if (c19egLIZIZ instanceof LifecycleOwner) {
            SAFHelper.LIZ.getClass();
            Lifecycle lifecycleLJIIZILJ = SAFHelper.LJIIZILJ(fragmentLIZLLL, c19egLIZIZ);
            if (lifecycleLJIIZILJ != null) {
                currentState = lifecycleLJIIZILJ.getCurrentState();
            } else {
                currentState = null;
            }
            if (currentState == Lifecycle.State.DESTROYED) {
                return true;
            }
        }
        return false;
    }

    public static void LIZ(C1537830q7Z c1537830q7Z, final InterfaceC1541990qEH interfaceC1541990qEH) {
        if (Intrinsics.LJFF(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchDebugSwitch(), Boolean.TRUE)) {
            c1537830q7Z.LJIIIIZZ(new LynxViewClient() { // from class: X.0PdA
                public final /* synthetic */ String LLILLJJLI = "normalLoad";

                @Override // com.lynx.tasm.LynxViewClient
                public final void LJIILJJIL() {
                    C649470Pdh c649470Pdh = C649470Pdh.LIZ;
                    InterfaceC1541990qEH interfaceC1541990qEH2 = interfaceC1541990qEH;
                    C1537720q7O c1537720q7O = interfaceC1541990qEH2 instanceof C1537720q7O ? (C1537720q7O) interfaceC1541990qEH2 : null;
                    String str = this.LLILLJJLI;
                    c649470Pdh.getClass();
                    C649470Pdh.LJJIIJZLJL(c1537720q7O, str);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Q8X] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0Q8X LIZJ(java.lang.String r1, final kotlin.jvm.functions.Function0 r2, final boolean r3) {
        /*
            com.ss.android.ugc.aweme.search.lynx.core.communicate.LynxExposeHelper r0 = com.ss.android.ugc.aweme.search.lynx.core.communicate.LynxExposeHelper.LIZ
            r0.getClass()
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)     // Catch: java.lang.NullPointerException -> L19
            java.lang.String r0 = "visibility_downgrade"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)     // Catch: java.lang.NullPointerException -> L19
            if (r0 == 0) goto L1d
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.NullPointerException -> L19
            r1 = 1
            if (r0 != r1) goto L1d
            goto L1e
        L19:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L1d:
            r1 = 0
        L1e:
            X.0Q8X r0 = new X.0Q8X
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C649100Pd6.LIZJ(java.lang.String, kotlin.jvm.functions.Function0, boolean):X.0Q8X");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1541990qEH LIZLLL(Context context, String str, InterfaceC1541990qEH interfaceC1541990qEH, C649300PdQ c649300PdQ, AbstractC1542100qES abstractC1542100qES) {
        C648850Pch c648840Pcg;
        InterfaceC1541990qEH interfaceC1541990qEH2 = interfaceC1541990qEH;
        if (((Boolean) C0BCF.LIZ.getValue()).booleanValue() || interfaceC1541990qEH == null) {
            C649180PdE.LIZ.getClass();
            interfaceC1541990qEH2 = interfaceC1541990qEH;
            if (((SearchMiddleLynxFallbackOptConfig) C649180PdE.LIZJ.getValue()).enableRecreateKitView == 1) {
                C649310PdR.LIZ.getClass();
                InterfaceC1541990qEH interfaceC1541990qEHLIZJ = C649310PdR.LIZJ(context, str, false, abstractC1542100qES);
                if (interfaceC1541990qEHLIZJ == 0) {
                    return null;
                }
                C1537720q7O c1537720q7O = (C1537720q7O) interfaceC1541990qEHLIZJ;
                c649300PdQ.LJIIL(c1537720q7O);
                c649300PdQ.LJIL = interfaceC1541990qEHLIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ready to create new messenger in real load, kitView:");
                sbLIZ.append(c1537720q7O.hashCode());
                C2188811AlT.LIZIZ(sbLIZ);
                if (c1537720q7O instanceof C1539250q9r) {
                    c648840Pcg = new C648860Pci(c1537720q7O);
                } else {
                    c648840Pcg = new C648840Pcg(c1537720q7O);
                }
                c649300PdQ.LIZLLL = c648840Pcg;
                interfaceC1541990qEH2 = interfaceC1541990qEHLIZJ;
                if (((Boolean) LIZIZ.getValue()).booleanValue()) {
                    C1440005kM.LIZ(new C649160PdC((View) interfaceC1541990qEHLIZJ));
                    interfaceC1541990qEH2 = interfaceC1541990qEHLIZJ;
                }
            }
        }
        return interfaceC1541990qEH2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[PHI: r4
      0x002c: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:12:0x002a, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(android.content.Context r5, X.InterfaceC1541990qEH r6, X.C1537480q70 r7, kotlin.jvm.functions.Function0 r8, com.lynx.tasm.LynxViewClient r9) {
        /*
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "SparkLoader.loadBySparkLite start, kitview hashcode:"
            r1.append(r0)
            r3 = 0
            if (r6 == 0) goto L72
            android.view.View r0 = r6.e1()
            if (r0 == 0) goto L72
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L1a:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            if (r7 == 0) goto L28
            java.lang.String r4 = r7.LJIJI()
            if (r4 != 0) goto L2c
        L28:
            java.lang.String r4 = ""
            if (r7 == 0) goto L2e
        L2c:
            X.0pxS r3 = r7.hybridParams
        L2e:
            boolean r0 = r3 instanceof X.C1537830q7Z
            if (r0 == 0) goto L60
            X.0q7Z r3 = (X.C1537830q7Z) r3
            if (r3 == 0) goto L60
            X.C649540Pdo.LJ(r3, r5)
            X.C649540Pdo.LIZLLL(r3, r4)
            java.lang.Object r0 = r8.invoke()
            com.lynx.tasm.TemplateData r0 = (com.lynx.tasm.TemplateData) r0
            r3.LJIJJ = r0
            if (r9 == 0) goto L49
            r3.LJIIIIZZ(r9)
        L49:
            X.0Pd6 r2 = X.C649100Pd6.LIZ
            kotlin.jvm.internal.AwS554S0100000_10 r1 = new kotlin.jvm.internal.AwS554S0100000_10
            r0 = 1292(0x50c, float:1.81E-42)
            r1.<init>(r6, r0)
            r2.getClass()
            r0 = 1
            X.0Q8X r0 = LIZJ(r4, r1, r0)
            r3.LJIIIIZZ(r0)
            LIZ(r3, r6)
        L60:
            boolean r0 = r6 instanceof X.C1537720q7O
            if (r0 == 0) goto L6c
            r0 = r6
            com.lynx.tasm.LynxView r0 = (com.lynx.tasm.LynxView) r0
            if (r0 == 0) goto L6c
            r0.startLynxRuntime()
        L6c:
            if (r6 == 0) goto L71
            r6.load()
        L71:
            return
        L72:
            r0 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C649100Pd6.LJI(android.content.Context, X.0qEH, X.0q70, kotlin.jvm.functions.Function0, com.lynx.tasm.LynxViewClient):void");
    }

    public static void LJIIL(C649290PdP c649290PdP, C649110Pd7 c649110Pd7, AbstractC1542100qES abstractC1542100qES, DynamicPatch dynamicPatch, TemplateData templateData) {
        String str;
        View childAt;
        TextView textView;
        String string;
        ISearchContextAbility iSearchContextAbility;
        SparkContext sparkContext;
        Object objLJFF;
        SparkContext originalSparkContext;
        c649290PdP.LJIILJJIL = true;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c649110Pd7.LIZIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c649290PdP.LJIILIIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getSparkContext()) != null && (objLJFF = sparkContext.LJFF(ISearchContextAbility.class)) != null && ((originalSparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getOriginalSparkContext()) != null || (originalSparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null)) {
            originalSparkContext.LJJ(ISearchContextAbility.class, objLJFF);
        }
        c649290PdP.LJIILIIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            C1440005kM.LIZ(new C649160PdC(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB));
        }
        SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        if (sparkContext2 != null && (iSearchContextAbility = (ISearchContextAbility) sparkContext2.LJFF(ISearchContextAbility.class)) != null) {
            iSearchContextAbility.fe(new C0PCM(0));
        }
        C647890Pb9 c647890Pb9 = new C647890Pb9();
        c647890Pb9.LJIIZILJ("type", "preload_hit");
        c647890Pb9.LJJIFFI(1);
        C1537710q7N c1537710q7N = null;
        if (dynamicPatch != null) {
            str = dynamicPatch.schema;
        } else {
            str = null;
        }
        c647890Pb9.LJIIZILJ("schema", str);
        c647890Pb9.LJIILJJIL();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = c649290PdP.LJIILIIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
            childAt = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getChildAt(0);
        } else {
            childAt = null;
        }
        if (childAt instanceof C1537710q7N) {
            c1537710q7N = (C1537710q7N) childAt;
        }
        if (templateData != null) {
            templateData.LJIILIIL("hitPreload", Boolean.TRUE);
            if (c1537710q7N != null) {
                c1537710q7N.updateData(templateData);
            }
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = c649290PdP.LJIILIIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null) {
            LIZ.getClass();
            if (Intrinsics.LJFF(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchDebugSwitch(), Boolean.TRUE) && (textView = (TextView) sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.findViewById(R.id.fgm)) != null) {
                CharSequence text = textView.getText();
                if (text == null || (string = text.toString()) == null) {
                    string = "";
                }
                if (!a0.LJJIIZI(string, "fromCache", false)) {
                    textView.setText(string.concat(" fromCache"));
                }
            }
        }
        if (c1537710q7N != null) {
            abstractC1542100qES.LJLIIIL(c1537710q7N);
        }
    }

    public static void LJIILIIL(C649300PdQ c649300PdQ, C649120Pd8 c649120Pd8, AbstractC1542100qES abstractC1542100qES, DynamicPatch dynamicPatch, TemplateData templateData) {
        boolean z;
        boolean z2 = true;
        c649300PdQ.LJIILJJIL = true;
        C1537720q7O c1537720q7O = c649120Pd8.LIZIZ;
        c1537720q7O.setEnableUIFlush(true);
        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fromCache by ");
        C0QGO.LIZ.getClass();
        sbLIZ.append(C0QGO.LIZLLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c649470Pdh.getClass();
        C649470Pdh.LJJIIJZLJL(c1537720q7O, strLIZIZ);
        c649300PdQ.LJIIL(c1537720q7O);
        c649300PdQ.LJIL = c1537720q7O;
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            C1440005kM.LIZ(new C649160PdC(c1537720q7O));
        }
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) c1537720q7O.getHybridContext().LJFF(ISearchContextAbility.class);
        if (iSearchContextAbility != null) {
            iSearchContextAbility.fe(new C0PCM(0));
        }
        C647890Pb9 c647890Pb9 = new C647890Pb9();
        c647890Pb9.LJIIZILJ("type", "preload_hit");
        c647890Pb9.LJJIFFI(1);
        c647890Pb9.LJIIZILJ("schema", dynamicPatch.schema);
        c647890Pb9.LJIILJJIL();
        C649490Pdj.LIZ.getClass();
        if (C649490Pdj.LIZIZ().onlyUpdateByCompletedData == 1 && !c649300PdQ.LJIILL) {
            z = false;
        } else {
            z = true;
        }
        if (C649490Pdj.LIZIZ().disableSwitchThread == 1 || (C649490Pdj.LIZIZ().onlySwitchThreadByCompletedData == 1 && !c649300PdQ.LJIILL)) {
            z2 = false;
        }
        ARunnableS3S0410000_10 aRunnableS3S0410000_10 = new ARunnableS3S0410000_10(c1537720q7O, templateData, c649300PdQ, z, abstractC1542100qES, 1);
        if (z2) {
            SearchMiddleMonitor.INSTANCE.recommendSwitchThreadStart();
            C421540Gfw.LIZ(new AwS411S0200000_10(c1537720q7O, aRunnableS3S0410000_10, 114));
        } else {
            aRunnableS3S0410000_10.run();
        }
    }

    public static void LJIIJ(C647810Pb1 c647810Pb1, C649110Pd7 c649110Pd7, C648330Pbr c648330Pbr, AbstractC1542100qES abstractC1542100qES, final DynamicPatch dynamicPatch, Map map) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        c647810Pb1.LLILLJJLI = true;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c649110Pd7.LIZIZ;
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getSparkContext();
        if (sparkContext != null) {
            sparkContext.LJJ(ISearchContextAbility.class, C0Q3E.LIZ(c648330Pbr));
            ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) sparkContext.LJFF(ISearchContextAbility.class);
            if (iSearchContextAbility != null) {
                iSearchContextAbility.fe(new C0PCM(0));
            }
        }
        try {
            View childAt = c648330Pbr.getChildAt(0);
            final LinkedHashMap linkedHashMap = null;
            if ((childAt instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) childAt) != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            }
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c648330Pbr, null);
            c648330Pbr.removeViewAt(0);
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getParent() != null) {
                C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, (ViewGroup) sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getParent());
            }
            c648330Pbr.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, 0);
            C647890Pb9 c647890Pb9 = new C647890Pb9();
            c647890Pb9.LJIIZILJ("type", "preload_hit");
            c647890Pb9.LJJIFFI(1);
            c647890Pb9.LJIIZILJ("schema", dynamicPatch.schema);
            c647890Pb9.LJIILJJIL();
            C1537710q7N c1537710q7N = (C1537710q7N) sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getChildAt(0);
            if (map != null) {
                linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("hitPreload", Boolean.TRUE);
            }
            if (c649110Pd7.LIZLLL) {
                c647810Pb1.LLILLL = true;
                final SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getSparkContext();
                C11NN.LJIIIIZZ(dynamicPatch.getRawData()).LJIIIZ(new InterfaceC1487280oo2() { // from class: X.0Pax
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        C649100Pd6 c649100Pd6 = C649100Pd6.LIZ;
                        DynamicPatch dynamicPatch2 = dynamicPatch;
                        Map<String, Object> map2 = linkedHashMap;
                        SparkContext sparkContext3 = sparkContext2;
                        c649100Pd6.getClass();
                        C647380PaK.LJIIIIZZ.getClass();
                        return C647380PaK.LIZIZ(dynamicPatch2, map2, sparkContext3);
                    }
                }).LJIIZILJ(C11S5.LIZIZ).LJIIJ(C1701940uOG.LIZIZ()).LJIIL(new AfS178S0100000_9(c1537710q7N, 77));
            } else {
                SparkContext sparkContext3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getSparkContext();
                C647380PaK.LJIIIIZZ.getClass();
                c1537710q7N.updateData(C647380PaK.LIZIZ(dynamicPatch, linkedHashMap, sparkContext3));
            }
            abstractC1542100qES.LJLIIIL(c1537710q7N);
            abstractC1542100qES.LJLJJLL(EnumC1067640dtC.LYNX);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C647890Pb9 c647890Pb92 = new C647890Pb9();
            c647890Pb92.LJIIZILJ("schema", dynamicPatch.schema);
            c647890Pb92.LJIIZILJ("type", "spark_replace_error");
            c647890Pb92.LJIIZILJ("error", e.getMessage());
            c647890Pb92.LJIILJJIL();
        }
    }

    public final void LJIIIZ(AbstractC1542100qES abstractC1542100qES, DynamicPatch dynamicPatch, C647810Pb1 c647810Pb1, C645770PUp c645770PUp, C648330Pbr c648330Pbr, Map map) {
        TemplateData templateDataLIZIZ;
        if (LJ(c648330Pbr)) {
            C647890Pb9 c647890Pb9 = new C647890Pb9();
            c647890Pb9.LJIIZILJ("type", "spark_container_destroyed");
            c647890Pb9.LJIIZILJ("schema", dynamicPatch.schema);
            c647890Pb9.LJIILJJIL();
            return;
        }
        if (c648330Pbr.getChildAt(0) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) c648330Pbr.getHybirdContainerView();
            c647810Pb1.LLILLJJLI = false;
            if (C703302op.LIZ(dynamicPatch.getRawData())) {
                SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
                C647380PaK.LJIIIIZZ.getClass();
                templateDataLIZIZ = C647380PaK.LIZIZ(dynamicPatch, map, sparkContext);
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C644710PQn(dynamicPatch, templateDataLIZIZ, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext(), null), 3);
            } else {
                templateDataLIZIZ = null;
            }
            LJFF(this, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, dynamicPatch.schema, templateDataLIZIZ, false, abstractC1542100qES, null, c645770PUp, dynamicPatch, 32);
            return;
        }
        C647890Pb9 c647890Pb92 = new C647890Pb9();
        c647890Pb92.LJIIZILJ("type", "spark_view_miss");
        c647890Pb92.LJIIZILJ("schema", dynamicPatch.schema);
        c647890Pb92.LJIILJJIL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fd, code lost:
    
        if (X.C649130Pd9.LIZ().enableTransferSwitchToMainBeforeRender != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0148, code lost:
    
        if (r1.contains(X.C649470Pdh.LJ(r10)) == false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a8  */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0PaX] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(final X.C647530PaZ r27, final X.C647810Pb1 r28, final X.C648330Pbr r29, final X.AbstractC1542100qES r30, final com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r31, final java.util.Map<java.lang.String, ? extends java.lang.Object> r32, final boolean r33) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C649100Pd6.LJIIJJI(X.0PaZ, X.0Pb1, X.0Pbr, X.0qES, com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch, java.util.Map, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0112, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r9, r0) == false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0Pav] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C648330Pbr r25, final com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r26, final java.util.Map<java.lang.String, ? extends java.lang.Object> r27, boolean r28, X.AbstractC1542100qES r29, final X.C647810Pb1 r30, final X.C645770PUp r31, final X.InterfaceC1541990qEH r32) {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C649100Pd6.LJII(X.0Pbr, com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch, java.util.Map, boolean, X.0qES, X.0Pb1, X.0PUp, X.0qEH):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C649100Pd6 r19, final X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB r20, final java.lang.String r21, final com.lynx.tasm.TemplateData r22, boolean r23, X.AbstractC1542100qES r24, com.lynx.tasm.LynxViewClient r25, X.C645770PUp r26, com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r27, int r28) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C649100Pd6.LJFF(X.0Pd6, X.0qEB, java.lang.String, com.lynx.tasm.TemplateData, boolean, X.0qES, com.lynx.tasm.LynxViewClient, X.0PUp, com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch, int):void");
    }
}
