package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.bridge.magpie.MagpieBridge;
import com.bytedance.forest.chain.fetchers.CDNFetcher;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.hybrid.spark.roma.RomaGeckoService;
import com.bytedance.hybrid.spark.roma.deploy.IGeckoService;
import com.bytedance.hybrid.spark.schema.SparkSchemaModifier;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkCardSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.navigator.NavigationModule;
import java.lang.reflect.Method;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537900q7g {
    public final synchronized void LJIILJJIL() {
        LJIILIIL();
    }

    public static void LJII() {
        if (C1541950qED.LIZLLL) {
            return;
        }
        C1543490qGh.LIZIZ(C1529950pur.class, null, 6);
        C1543490qGh.LIZIZ(C1024630clp.class, null, 6);
        C1543490qGh.LIZIZ(C1547880qNm.class, null, 6);
        C1543490qGh.LIZIZ(C1874910ytF.class, null, 6);
        C1543490qGh.LIZIZ(C1546610qLj.class, null, 6);
        C1543490qGh.LIZIZ(C1873270yqb.class, null, 6);
        C1543490qGh.LIZIZ(C1064730doV.class, null, 6);
        C1543490qGh.LIZIZ(C1540740qCG.class, null, 6);
        C1543490qGh.LIZIZ(C602040NjO.class, null, 6);
        C1543490qGh.LIZIZ(C1541980qEG.class, null, 6);
        C1541950qED.LIZLLL = true;
    }

    public static void LJIILIIL() throws JSONException {
        RomaGeckoService romaGeckoService;
        AtomicBoolean atomicBoolean = C1541950qED.LJIIIIZZ;
        if (atomicBoolean.get()) {
            return;
        }
        Function0<Unit> function0 = C1541950qED.LJII;
        if (function0 != null) {
            function0.invoke();
        }
        C1520360pfO c1520360pfO = new C1520360pfO("tryPrepareBlock");
        c1520360pfO.LIZIZ = "sparkTrace";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("prepareBlockFlag", atomicBoolean);
        jSONObject.put("prepareBlockExist", C1541950qED.LJII != null);
        c1520360pfO.LIZLLL = jSONObject;
        C1520080pew.LIZ("", c1520360pfO.LIZ());
        IGeckoService iGeckoServiceLIZ = C2283408x6.LIZ();
        if ((iGeckoServiceLIZ instanceof RomaGeckoService) && (romaGeckoService = (RomaGeckoService) iGeckoServiceLIZ) != null) {
            romaGeckoService.LJJIFFI();
        }
        atomicBoolean.set(true);
    }

    public static void LJIILL() {
        RomaGeckoService romaGeckoService;
        synchronized (C1537410q6t.LJIIJJI) {
            try {
                C1541950qED.LIZJ.getClass();
                LJIILIIL();
                IGeckoService iGeckoServiceLIZ = C2283408x6.LIZ();
                if ((iGeckoServiceLIZ instanceof RomaGeckoService) && (romaGeckoService = (RomaGeckoService) iGeckoServiceLIZ) != null) {
                    romaGeckoService.LJJIFFI();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIILLIIL() {
        if (C1541950qED.LJIIJ.get()) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Class.forName(SparkActivity.class.getName());
            Class.forName(SparkPopup.class.getName());
            Class.forName(SparkFragment.class.getName());
            Class.forName(SparkPopup.class.getName());
            Class.forName(DialogC197047127p.class.getName());
            Class.forName(BottomSheetBehavior.class.getName());
            Class.forName(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.class.getName());
            Class.forName(SparkSchemaParam.class.getName());
            Class.forName(SparkPopupSchemaParam.class.getName());
            Class.forName(SparkCardSchemaParam.class.getName());
            Class.forName(C905703gN.class.getName());
            Class.forName(SparkContext.class.getName());
            Class.forName(C1546010qKl.class.getName());
            Class.forName(C1041990dDp.class.getName());
            Class.forName(SparkSchemaModifier.class.getName());
            Class.forName(C1540240qBS.class.getName());
            Class.forName(C1529870puj.class.getName());
            Class.forName(C1520560pfi.class.getName());
            Class.forName(HybridSchemaParam.class.getName());
            Class.forName(C1529400pty.class.getName());
            Class.forName(C1537790q7V.class.getName());
            Class.forName(C1537510q73.class.getName());
            Class.forName(C1538200q8A.class.getName());
            Class.forName(C1537480q70.class.getName());
            Class.forName(C1537440q6w.class.getName());
            Class.forName(C1537410q6t.class.getName());
            Class.forName(C1538140q84.class.getName());
            C1545460qJs.LIZ("hybrid://lynxview");
            Class.forName(C1537910q7h.class.getName());
            Class.forName(C1537830q7Z.class.getName());
            Class.forName(C1536750q5p.class.getName());
            Class.forName(C1536760q5q.class.getName());
            Class.forName(C1537550q77.class.getName());
            Class.forName(C1387850mDf.class.getName());
            Class.forName(C1299370jux.class.getName());
            Class.forName(C1533850q19.class.getName());
            Class.forName(C1533560q0g.class.getName());
            Class.forName(C1533590q0j.class.getName());
            Class.forName(GeckoXAdapter.class.getName());
            Class.forName(CDNFetcher.class.getName());
            Class.forName(C1534430q25.class.getName());
            Class.forName(C1534010q1P.class.getName());
            Class.forName(C1533370q0N.class.getName());
            Class.forName(NavigationModule.class.getName());
            Class.forName(C1536540q5U.class.getName());
            Class.forName(C1543190qGD.class.getName());
            Class.forName(C1543180qGC.class.getName());
            Class.forName(C1543830qHF.class.getName());
            Class.forName(C1543420qGa.class.getName());
            Class.forName(C1543450qGd.class.getName());
            Class.forName(C1543930qHP.class.getName());
            Class.forName(C1543200qGE.class.getName());
            Class.forName(C1542940qFo.class.getName());
            Class.forName(C1536530q5T.class.getName());
            Class.forName(C1537720q7O.class.getName());
            Class.forName(LynxTemplateRender.class.getName());
            Class.forName(C1309670kBZ.class.getName());
            Class.forName(C1536590q5Z.class.getName());
            Class.forName(C1543460qGe.class.getName());
            Class.forName(C1059860dge.class.getName());
            Class.forName(C1059870dgf.class.getName());
            Class.forName(C1542990qFt.class.getName());
            Class.forName(C1491570oux.class.getName());
            Class.forName(C1521530phH.class.getName());
            Class.forName(LynxViewMonitor.class.getName());
            Class.forName(C1546210qL5.class.getName());
            Class.forName(C1537890q7f.class.getName());
            Class.forName(C086F.class.getName());
            Class.forName(MagpieBridge.class.getName());
            Class.forName(C1544610qIV.class.getName());
            Class.forName(C1543320qGQ.class.getName());
            Class.forName(AbstractC1534170q1f.class.getName());
            Class.forName(C1520970pgN.class.getName());
            Class.forName(C1540620qC4.class.getName());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("warm up classes cost: ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C1530030puz.LIZIZ("Spark", C2188811AlT.LIZIZ(sbLIZ), null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1541950qED.LJIIJ.set(true);
    }

    public static void LJIIZILJ() {
        synchronized (C1537410q6t.LJIIJJI) {
            try {
                C1541950qED.LIZJ.getClass();
                LJIILLIIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIJI() {
        synchronized (C1537410q6t.LJIIJJI) {
            try {
                C1541950qED.LIZJ.getClass();
                AtomicBoolean atomicBoolean = C1541950qED.LJIIIZ;
                if (!atomicBoolean.get()) {
                    ExecutorService executorService = C2281108wj.LIZ;
                    C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, RunnableC1537980q7o.LL);
                    atomicBoolean.set(true);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIL() {
        if (!Intrinsics.LJFF(C1535630q41.LIZIZ("enable_delegate_spark_prepare_block"), Boolean.TRUE)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HybridKit init deadlock optimize: ");
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            sbLIZ.append(C1161970gLL.LIZ());
            C1530030puz.LIZIZ("Spark", C2188811AlT.LIZIZ(sbLIZ), null);
            if (C1161970gLL.LIZ()) {
                LJIILL();
                return;
            } else {
                LJIILJJIL();
                return;
            }
        }
        synchronized (C1529360ptu.LIZ) {
            if (C1529360ptu.LJI.compareAndSet(false, true)) {
                try {
                    Function0<Unit> function0 = C1529360ptu.LJII;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("schema", (Object) null);
                    jSONObject.put("bid", (Object) null);
                    C1520360pfO c1520360pfO = new C1520360pfO("hybrid_call_spark_prepare_block");
                    c1520360pfO.LIZIZ = "hybridkit_default_bid";
                    c1520360pfO.LJIIJJI = EnumC993170bx5.Both;
                    c1520360pfO.LIZLLL = jSONObject;
                    C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                    C1520380pfQ.LIZ.getClass();
                    C1520380pfQ.LIZ(c1520350pfNLIZ);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1490740otc.LIZ.LIZ("Call SparkPrepareBlock failed, please check your code.", EnumC1490770otf.E, "HybridCommon");
                    C1529360ptu.LIZIZ();
                }
            }
        }
    }

    public final void LJIJ() {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZ()) {
            LJIJI();
            return;
        }
        synchronized (this) {
            AtomicBoolean atomicBoolean = C1541950qED.LJIIIZ;
            if (!atomicBoolean.get()) {
                ExecutorService executorService = C2281108wj.LIZ;
                C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, RunnableC1537980q7o.LL);
                atomicBoolean.set(true);
            }
        }
    }

    public static String LIZ(String str) {
        String string = UUID.randomUUID().toString();
        C1491570oux c1491570oux = C1491570oux.LIZ;
        c1491570oux.getClass();
        C1491570oux.LIZ(20000L, string, false, true);
        C1491570oux.LJIJI(c1491570oux, string, EnumC1521120pgc.SPARK_SCHEMA.getKey(), str);
        return string;
    }

    public static void LIZIZ(SparkSchemaParam sparkSchemaParam) {
        C1533510q0b c1533510q0bLIZLLL;
        if (sparkSchemaParam != null && sparkSchemaParam.getEnableGeckoPreDecompress() == 1 && 1 != 0) {
            C1533720q0w.LIZ.getClass();
            String accessKey = sparkSchemaParam.getAccessKey();
            if (accessKey == null) {
                accessKey = "";
            }
            String channel = sparkSchemaParam.getChannel();
            String bundle = sparkSchemaParam.getBundle();
            if ((!a0.LJJJIL(channel)) && (!a0.LJJJIL(bundle))) {
                c1533510q0bLIZLLL = new C1533510q0b(accessKey, channel, bundle);
            } else {
                String url = sparkSchemaParam.getUrl();
                if (!(!a0.LJJJIL(url)) || url == null) {
                    url = sparkSchemaParam.getSurl();
                    if (!(!a0.LJJJIL(url)) || url == null) {
                        return;
                    }
                }
                c1533510q0bLIZLLL = C1533720q0w.LIZLLL(url, null, true);
                if (c1533510q0bLIZLLL == null) {
                    return;
                }
            }
            String str = c1533510q0bLIZLLL.LIZ;
            String str2 = c1533510q0bLIZLLL.LIZIZ;
            C1550730qSN.LIZ.getClass();
            C1550720qSM c1550720qSMLIZIZ = C1550730qSN.LIZIZ(str, str2);
            if (c1550720qSMLIZIZ != null && c1550720qSMLIZIZ.LIZIZ) {
                C1551980qUO c1551980qUO = C1551980qUO.LIZ;
                UpdatePackage updatePackage = new UpdatePackage(c1550720qSMLIZIZ, CastLongProtector.parseLong(c1550720qSMLIZIZ.LIZLLL), str, str2);
                updatePackage.setDecompressFrom(2);
                AFwS263S0000000_23 aFwS263S0000000_23 = AFwS263S0000000_23.get$arr$(23);
                c1551980qUO.getClass();
                C1551980qUO.LIZ(updatePackage, aFwS263S0000000_23);
            }
        }
    }

    public static void LJI(String str) {
        Object obj;
        Method method;
        try {
            if ((!a0.LJJJIL(str)) && C1541950qED.LJIIJJI != null && (obj = C1541950qED.LJIIL) != null && (method = C1541950qED.LJIILIIL) != null) {
                C2204961BRm.a0(method, obj, new Object[]{str}, new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHFVSiC1k=", null));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJIIIIZZ(AbstractC1538690q8x abstractC1538690q8x) {
        if (Intrinsics.LJFF(abstractC1538690q8x.LJI(), "default")) {
            C1541950qED.LJ.add(abstractC1538690q8x);
        } else {
            C1541950qED.LJFF.put(abstractC1538690q8x.LJI(), abstractC1538690q8x);
        }
    }

    public static void LJIIJJI(SparkContext sparkContext) {
        String strLIZIZ;
        sparkContext.hasTraversePlugin = true;
        C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_PLUGIN_START, EnumC1537220q6a.SPARK_PREPARE_BUSINESS_HANDLE_START}, null);
        String string = null;
        try {
            Uri uri = UriProtector.parse(sparkContext.LJIJI());
            if (uri != null && (strLIZIZ = C1942307jB.LIZIZ(uri, "business_from")) != null) {
                string = a0.LJLIIIL(strLIZIZ).toString();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1541950qED.LJI.LIZIZ(sparkContext, string);
        InterfaceC1541510qDV interfaceC1541510qDV = (InterfaceC1541510qDV) sparkContext.LJFF(InterfaceC1541510qDV.class);
        if (interfaceC1541510qDV == null || interfaceC1541510qDV.LIZJ()) {
            C1541950qED.LJI.getClass();
        } else {
            C1541950qED.LJI.getClass();
        }
        C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_PLUGIN_END, EnumC1537220q6a.SPARK_PREPARE_BUSINESS_HANDLE_END}, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.bytedance.hybrid.spark.SparkContext r17, com.bytedance.lynx.spark.schema.model.SparkSchemaParam r18) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537900q7g.LIZJ(com.bytedance.hybrid.spark.SparkContext, com.bytedance.lynx.spark.schema.model.SparkSchemaParam):void");
    }

    public static void LJIIIZ(final C19EG c19eg, SparkContext sparkContext) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkPopup#");
        sbLIZ.append(sparkContext.containerId.hashCode());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Fragment fragmentLJJJJZI = c19eg.getSupportFragmentManager().LJJJJZI(strLIZIZ);
        if (fragmentLJJJJZI instanceof SparkPopup) {
            C1530030puz.LIZIZ("SparkPopupLoadingProcess", "Spark showPopup, oldSparkPopup is SparkPopup", sparkContext);
            SparkPopup sparkPopup = (SparkPopup) fragmentLJJJJZI;
            Bundle arguments = sparkPopup.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C1041990dDp.LIZ.getClass();
            C1041990dDp.LIZJ(sparkContext);
            C786410Ut5.LJJJI("SparkContextContainerId", sparkContext.containerId, arguments);
            sparkPopup.setArguments(arguments);
            sparkPopup.refresh();
            return;
        }
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "Spark showPopup, oldSparkPopup is not SparkPopup", sparkContext);
        final SparkPopup sparkPopup2 = new SparkPopup();
        Bundle bundle = new Bundle();
        C1041990dDp.LIZ.getClass();
        C1041990dDp.LIZJ(sparkContext);
        C786410Ut5.LJJJI("SparkContextContainerId", sparkContext.containerId, bundle);
        sparkPopup2.setArguments(bundle);
        sparkPopup2.bS(sparkContext);
        SparkSchemaParam sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
        if (sparkSchemaParamLJJJI instanceof SparkPopupSchemaParam) {
            if (((AbsSparkPopupSchemaParam) sparkSchemaParamLJJJI).getSilentLoadType() == 2) {
                sparkPopup2.hS(c19eg, sparkContext, new InterfaceC1538950q9N() { // from class: X.0q8y
                    @Override // X.InterfaceC1538950q9N
                    public final void LJJIZ() {
                    }

                    @Override // X.InterfaceC1538950q9N
                    public final void LJJJ(C1542120qEU c1542120qEU) {
                    }
                });
                sparkContext.LJJ(SparkPopup.class, sparkPopup2);
                return;
            } else if (((AbsSparkPopupSchemaParam) sparkSchemaParamLJJJI).getSilentLoadType() == 1) {
                sparkPopup2.hS(c19eg, sparkContext, new InterfaceC1538950q9N() { // from class: X.0q8d
                    public boolean LIZ;

                    @Override // X.InterfaceC1538950q9N
                    public final void LJJIZ() {
                        if (this.LIZ) {
                            return;
                        }
                        if (!sparkPopup2.nS()) {
                            sparkPopup2.show(c19eg.getSupportFragmentManager(), strLIZIZ);
                        }
                        this.LIZ = true;
                    }

                    @Override // X.InterfaceC1538950q9N
                    public final void LJJJ(C1542120qEU c1542120qEU) {
                        if (!this.LIZ) {
                            if (!sparkPopup2.nS()) {
                                sparkPopup2.show(c19eg.getSupportFragmentManager(), strLIZIZ);
                            }
                            this.LIZ = true;
                        }
                    }
                });
                return;
            }
        }
        sparkPopup2.show(c19eg.getSupportFragmentManager(), strLIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0554 A[PHI: r8
      0x0554: PHI (r8v38 java.util.Map<java.lang.Object, java.lang.Object>) = (r8v33 java.util.Map<java.lang.Object, java.lang.Object>), (r8v39 java.util.Map<java.lang.Object, java.lang.Object>) binds: [B:236:0x0552, B:234:0x054c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117 A[Catch: all -> 0x0148, TryCatch #0 {all -> 0x0148, blocks: (B:52:0x010f, B:54:0x0117, B:55:0x0142, B:49:0x00ff, B:51:0x0105), top: B:296:0x00ff }] */
    /* JADX WARN: Type inference failed for: r1v66, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(final com.bytedance.hybrid.spark.SparkContext r19, android.content.Context r20, int r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537900q7g.LJ(com.bytedance.hybrid.spark.SparkContext, android.content.Context, int):void");
    }

    public static void LJFF(SparkContext sparkContext, Context context, int i) {
        synchronized (C1537410q6t.LJIIJJI) {
            try {
                C1541950qED.LIZJ.getClass();
                LJ(sparkContext, context, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIIJ(Context context, final FragmentManager fragmentManager, SparkContext sparkContext) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkPopup#");
        sbLIZ.append(sparkContext.containerId.hashCode());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI(strLIZIZ);
        if (fragmentLJJJJZI instanceof SparkPopup) {
            C1530030puz.LIZIZ("SparkPopupLoadingProcess", "Spark showPopup, oldSparkPopup is SparkPopup", sparkContext);
            SparkPopup sparkPopup = (SparkPopup) fragmentLJJJJZI;
            Bundle arguments = sparkPopup.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C1041990dDp.LIZ.getClass();
            C1041990dDp.LIZJ(sparkContext);
            C786410Ut5.LJJJI("SparkContextContainerId", sparkContext.containerId, arguments);
            sparkPopup.setArguments(arguments);
            sparkPopup.refresh();
            return;
        }
        C1530030puz.LIZIZ("SparkPopupLoadingProcess", "Spark showPopup, oldSparkPopup is not SparkPopup", sparkContext);
        final SparkPopup sparkPopup2 = new SparkPopup();
        Bundle bundle = new Bundle();
        C1041990dDp.LIZ.getClass();
        C1041990dDp.LIZJ(sparkContext);
        C786410Ut5.LJJJI("SparkContextContainerId", sparkContext.containerId, bundle);
        sparkPopup2.setArguments(bundle);
        sparkPopup2.bS(sparkContext);
        SparkSchemaParam sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
        if (sparkSchemaParamLJJJI instanceof SparkPopupSchemaParam) {
            if (((AbsSparkPopupSchemaParam) sparkSchemaParamLJJJI).getSilentLoadType() == 2) {
                sparkPopup2.hS(context, sparkContext, new InterfaceC1538950q9N() { // from class: X.0q8s
                    @Override // X.InterfaceC1538950q9N
                    public final void LJJIZ() {
                    }

                    @Override // X.InterfaceC1538950q9N
                    public final void LJJJ(C1542120qEU c1542120qEU) {
                    }
                });
                sparkContext.LJJ(SparkPopup.class, sparkPopup2);
                return;
            } else if (((AbsSparkPopupSchemaParam) sparkSchemaParamLJJJI).getSilentLoadType() == 1) {
                sparkPopup2.hS(context, sparkContext, new InterfaceC1538950q9N() { // from class: X.0q8e
                    public boolean LIZ;

                    @Override // X.InterfaceC1538950q9N
                    public final void LJJIZ() {
                        if (this.LIZ) {
                            return;
                        }
                        if (!sparkPopup2.nS()) {
                            sparkPopup2.show(fragmentManager, strLIZIZ);
                        }
                        this.LIZ = true;
                    }

                    @Override // X.InterfaceC1538950q9N
                    public final void LJJJ(C1542120qEU c1542120qEU) {
                        if (!this.LIZ) {
                            if (!sparkPopup2.nS()) {
                                sparkPopup2.show(fragmentManager, strLIZIZ);
                            }
                            this.LIZ = true;
                        }
                    }
                });
                return;
            }
        }
        sparkPopup2.show(fragmentManager, strLIZIZ);
    }

    public final void LIZLLL(SparkContext sparkContext, Context context, int i) {
        C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_PREPARE_BUSINESS_HANDLE_START}, null);
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZ()) {
            LJFF(sparkContext, context, i);
        } else {
            synchronized (this) {
                LJ(sparkContext, context, i);
            }
        }
        C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_PREPARE_BUSINESS_HANDLE_END}, null);
    }
}
