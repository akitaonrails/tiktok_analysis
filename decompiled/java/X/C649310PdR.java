package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import com.ss.android.ugc.aweme.search.service.ecom.ab.SearchRecomPreLoadRetryConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS32S2200000_10;
import kotlin.jvm.internal.AwS95S1000000_10;
import kotlin.jvm.internal.AwS98S0110000_10;

/* JADX INFO: renamed from: X.0PdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649310PdR {
    public static final C649310PdR LIZ = new C649310PdR();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(703));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(704));
    public static String LIZLLL = "";
    public static int LJ;
    public static final ConcurrentHashMap<C1537720q7O, AbstractC1542100qES> LJFF;

    static {
        C305130Bxf.LIZ.getClass();
        LJ = ((SearchRecomPreLoadRetryConfig) C305130Bxf.LIZJ.getValue()).maxRetryTimes;
        LJFF = new ConcurrentHashMap<>();
    }

    public static ConcurrentHashMap LIZLLL() {
        return (ConcurrentHashMap) LIZIZ.getValue();
    }

    public static ConcurrentHashMap LJ() {
        return (ConcurrentHashMap) LIZJ.getValue();
    }

    public static void LIZIZ(CharSequence charSequence) {
        if ((TextUtils.equals(charSequence, "TikTok Theme Dark") || TextUtils.equals(LIZLLL, "TikTok Theme Dark")) && !TextUtils.equals(charSequence, LIZLLL)) {
            if (C0BYC.LIZ()) {
                Iterator it2 = LIZLLL().entrySet().iterator();
                while (it2.hasNext()) {
                    ((C649120Pd8) ((Map.Entry) it2.next()).getValue()).LIZIZ.LLD(true);
                }
            } else {
                Iterator it3 = LIZLLL().entrySet().iterator();
                while (it3.hasNext()) {
                    ((C649120Pd8) ((Map.Entry) it3.next()).getValue()).LIZIZ.LLD(true);
                }
            }
            LIZLLL().clear();
            if (C0BYC.LIZ()) {
                Iterator it4 = LJ().entrySet().iterator();
                while (it4.hasNext()) {
                    ((C649120Pd8) ((Map.Entry) it4.next()).getValue()).LIZIZ.LLD(true);
                }
            } else {
                Iterator it5 = LJ().entrySet().iterator();
                while (it5.hasNext()) {
                    ((C649120Pd8) ((Map.Entry) it5.next()).getValue()).LIZIZ.LLD(true);
                }
            }
            LJ().clear();
            LIZLLL = charSequence.toString();
        }
    }

    public static void LIZ(boolean z, String str, C649120Pd8 c649120Pd8) {
        CharSequence charSequenceLJIIIIZZ;
        try {
            SAFHelper.LIZ.getClass();
            Activity activityLJIIIIZZ = SAFHelper.LJIIIIZZ(null);
            if (activityLJIIIIZZ == null || (charSequenceLJIIIIZZ = C1308910kAL.LJIIIIZZ(activityLJIIIIZZ)) == null) {
                charSequenceLJIIIIZZ = "";
            }
            LIZIZ(charSequenceLJIIIIZZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (z) {
            LJ().put(str, c649120Pd8);
        } else {
            LIZLLL().put(str, c649120Pd8);
        }
    }

    public static InterfaceC1541990qEH LIZJ(Context context, String str, boolean z, AbstractC1542100qES abstractC1542100qES) {
        InterfaceC1541990qEH interfaceC1541990qEHLIZIZ;
        HybridSchemaParam hybridSchemaParamLIZJ;
        Integer numValueOf;
        C1537830q7Z c1537830q7Z;
        try {
            C01GW c01gwLIZ = C1935507i5.LIZ(new AwS95S1000000_10(str, 10));
            InterfaceC1531560pxS interfaceC1531560pxS = ((C1537480q70) c01gwLIZ.getValue()).hybridParams;
            if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null) {
                InterfaceC1531560pxS interfaceC1531560pxS2 = ((C1537480q70) c01gwLIZ.getValue()).hybridParams;
                if ((interfaceC1531560pxS2 instanceof C1537830q7Z) && (c1537830q7Z = (C1537830q7Z) interfaceC1531560pxS2) != null) {
                    hybridSchemaParamLIZJ.setThreadStrategy(EnumC665490Q8l.MOST_ON_TASM.id());
                    c1537830q7Z.LJJII = new AwS98S0110000_10(z, (boolean) c01gwLIZ, (C01GW<? extends C1537480q70>) 2);
                }
                C1AGP c1agp = C1AGP.LIZ;
                C1537480q70 c1537480q70 = (C1537480q70) c01gwLIZ.getValue();
                c1agp.getClass();
                C1AGP.LIZJ(c1537480q70, "middle_page");
                if (C301140BrE.LIZ()) {
                    C690340R6a.LIZ();
                }
                C649470Pdh c649470Pdh = C649470Pdh.LIZ;
                C1537480q70 c1537480q702 = (C1537480q70) c01gwLIZ.getValue();
                c649470Pdh.getClass();
                C649470Pdh.LIZ(c1537480q702);
                interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParamLIZJ, (C1537480q70) c01gwLIZ.getValue(), context, abstractC1542100qES);
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("in preload, LynxViewBuilder setEnableUIFlush false, hashcode:");
                    if (interfaceC1541990qEHLIZIZ == null) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(((C1537720q7O) interfaceC1541990qEHLIZIZ).hashCode());
                    }
                    sbLIZ.append(numValueOf);
                    C2188811AlT.LIZIZ(sbLIZ);
                    ((C1537720q7O) interfaceC1541990qEHLIZIZ).setEnableUIFlush(false);
                }
                SearchMiddleMonitor.INSTANCE.addLynxTimingListener((C1537720q7O) interfaceC1541990qEHLIZIZ);
            } else {
                C1AF0.LIZJ("hybridSchemaParam is null");
                interfaceC1541990qEHLIZIZ = null;
            }
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            C649430Pdd c649430Pdd = new C649430Pdd();
            c1537900q7g.getClass();
            C1537900q7g.LJIIIIZZ(c649430Pdd);
            C1537900q7g.LJIIIIZZ(new C649720Pe6());
            return interfaceC1541990qEHLIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, X.0Pd8] */
    public static void LJFF(final Context context, final String str, final String str2, final boolean z, final boolean z2, final InterfaceC649280PdO interfaceC649280PdO, final TemplateData templateData) {
        SearchMiddleMonitor.INSTANCE.resetPreloadFailedStatus();
        long jCurrentTimeMillis = System.currentTimeMillis();
        final C013C c013c = new C013C();
        final C013C c013c2 = new C013C();
        final C259800zU c259800zU = new C259800zU();
        final C259800zU c259800zU2 = new C259800zU();
        InterfaceC1541990qEH interfaceC1541990qEHLIZJ = LIZJ(context, str, true, new AbstractC1542100qES() { // from class: X.0PdS
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
            @Override // X.AbstractC1537870q7d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJLIIIL(X.InterfaceC1541990qEH r6) {
                /*
                    r5 = this;
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "[onLoadFinish] In preloadAndCache kitView hashcode:"
                    r1.append(r0)
                    android.view.View r0 = r6.e1()
                    r4 = 0
                    if (r0 == 0) goto L7f
                    int r0 = r0.hashCode()
                L14:
                    r1.append(r0)
                    java.lang.String r0 = ", onLoadFinish:"
                    r1.append(r0)
                    java.lang.String r0 = r1
                    r1.append(r0)
                    X.C2188811AlT.LIZIZ(r1)
                    X.013C r0 = r2
                    r3 = 1
                    r0.element = r3
                    X.00zU<X.0qEH> r0 = r3
                    r0.element = r6
                    X.0Bxf r2 = X.C305130Bxf.LIZ
                    r2.getClass()
                    X.01GW r1 = X.C305130Bxf.LIZJ
                    java.lang.Object r0 = r1.getValue()
                    com.ss.android.ugc.aweme.search.service.ecom.ab.SearchRecomPreLoadRetryConfig r0 = (com.ss.android.ugc.aweme.search.service.ecom.ab.SearchRecomPreLoadRetryConfig) r0
                    int r0 = r0.enableFixLoadFailedCondition
                    if (r0 != r3) goto L51
                    r2.getClass()
                    java.lang.Object r0 = r1.getValue()
                    com.ss.android.ugc.aweme.search.service.ecom.ab.SearchRecomPreLoadRetryConfig r0 = (com.ss.android.ugc.aweme.search.service.ecom.ab.SearchRecomPreLoadRetryConfig) r0
                    int r0 = r0.enableFixLoadFailedCondition
                    if (r0 != r3) goto L52
                    X.013C r0 = r4
                    boolean r0 = r0.element
                    if (r0 != 0) goto L52
                L51:
                    r4 = 1
                L52:
                    X.00zU<X.0Pd8> r0 = r5
                    T r3 = r0.element
                    if (r3 == 0) goto L7e
                    if (r4 == 0) goto L7e
                    X.0Pd8 r3 = (X.C649120Pd8) r3
                    java.lang.String r2 = r1
                    boolean r1 = r6
                    X.0Pb7 r0 = X.EnumC647870Pb7.SUCCEED
                    r3.LIZJ = r0
                    boolean r0 = X.C0QCS.LIZ(r2)
                    if (r0 == 0) goto L81
                    X.0PdR r0 = X.C649310PdR.LIZ
                    r0.getClass()
                    java.util.concurrent.ConcurrentHashMap<X.0q7O, X.0qES> r1 = X.C649310PdR.LJFF
                    X.0q7O r0 = r3.LIZIZ
                    java.lang.Object r0 = r1.remove(r0)
                    X.0q7d r0 = (X.AbstractC1537870q7d) r0
                    if (r0 == 0) goto L7e
                    r0.LJLIIIL(r6)
                L7e:
                    return
                L7f:
                    r0 = 0
                    goto L14
                L81:
                    X.0PdR r0 = X.C649310PdR.LIZ
                    r0.getClass()
                    X.C649310PdR.LIZ(r1, r2, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C649320PdS.LJLIIIL(X.0qEH):void");
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str3, String str4) {
                int i;
                c013c.element = true;
                C649120Pd8 c649120Pd8 = c259800zU2.element;
                if (c649120Pd8 != null) {
                    String str5 = str;
                    Context context2 = context;
                    String str6 = str2;
                    boolean z3 = z;
                    boolean z4 = z2;
                    InterfaceC649280PdO interfaceC649280PdO2 = interfaceC649280PdO;
                    TemplateData templateData2 = templateData;
                    if (C0QCS.LIZ(str5)) {
                        c649120Pd8.LIZJ = EnumC647870Pb7.FAILED;
                        SearchMiddleMonitor searchMiddleMonitor = SearchMiddleMonitor.INSTANCE;
                        searchMiddleMonitor.recordPreloadFailed(str4);
                        if (!searchMiddleMonitor.isDynamicContainerInit() && (i = C649310PdR.LJ) > 0) {
                            C649310PdR.LJ = i - 1;
                            searchMiddleMonitor.recordRetryPreLoad();
                            C649310PdR.LIZ.getClass();
                            C649310PdR.LJFF(context2, str5, str6, z3, z4, interfaceC649280PdO2, templateData2);
                        }
                        C649310PdR.LIZ.getClass();
                        AbstractC1542100qES abstractC1542100qESRemove = C649310PdR.LJFF.remove(c649120Pd8.LIZIZ);
                        if (abstractC1542100qESRemove != null) {
                            abstractC1542100qESRemove.LJLI(interfaceC1541990qEH, str3, str4);
                        }
                    }
                }
            }
        });
        if (interfaceC1541990qEHLIZJ == null) {
            return;
        }
        C1538200q8A c1538200q8A = (C1538200q8A) interfaceC1541990qEHLIZJ.getHybridContext().LJFF(C1538200q8A.class);
        if (c1538200q8A != null) {
            c1538200q8A.LJIILLIIL.put("containerContextStart", Long.valueOf(jCurrentTimeMillis));
        }
        AwS32S2200000_10 awS32S2200000_10 = new AwS32S2200000_10(templateData, str, str2, interfaceC1541990qEHLIZJ, 2);
        if (!(interfaceC1541990qEHLIZJ instanceof C1537720q7O)) {
            return;
        }
        C1537720q7O c1537720q7O = (C1537720q7O) interfaceC1541990qEHLIZJ;
        c259800zU2.element = new C649120Pd8(str, c1537720q7O, EnumC647870Pb7.LOADING);
        if (C0QCS.LIZ(str)) {
            LIZ(z2, str, (C649120Pd8) c259800zU2.element);
        }
        C649100Pd6 c649100Pd6 = C649100Pd6.LIZ;
        C1537480q70 hybridContext = c1537720q7O.getHybridContext();
        C689770R3v c689770R3v = new C689770R3v(interfaceC649280PdO, interfaceC1541990qEHLIZJ, 2);
        c649100Pd6.getClass();
        C649100Pd6.LJI(context, interfaceC1541990qEHLIZJ, hybridContext, awS32S2200000_10, c689770R3v);
    }
}
