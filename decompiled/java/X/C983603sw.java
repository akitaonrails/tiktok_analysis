package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OptPreloadSparkConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS471S0200000_1;

/* JADX INFO: renamed from: X.03sw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C983603sw {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public boolean LIZIZ;
    public Boolean LIZJ;
    public C03OX LIZ = C03OX.DEFAULT;
    public SparkContext LIZLLL = new SparkContext();
    public String LJ = "";
    public String LJFF = "";
    public String LJI = "ec_common_popup";
    public Boolean LJII = Boolean.FALSE;

    public final void LIZ(Function1<? super Boolean, Unit> function1) {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = this.LIZLLL.LJJIJLIJ();
        if (interfaceC1059280dfiLJJIJLIJ != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
            function1.invoke(Boolean.TRUE);
        } else {
            function1.invoke(Boolean.FALSE);
        }
    }

    public final void LJ(Context context) {
        int iIntValue;
        C903103fx c903103fx = C903103fx.LIZ;
        C03OX c03ox = this.LIZ;
        c903103fx.getClass();
        Map<Integer, Integer> map = C903103fx.LIZIZ;
        if (map != null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(c03ox.getScene()));
            int iIntValue2 = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            C03OX c03ox2 = C03OX.TOTAL;
            Integer num2 = (Integer) linkedHashMap.get(Integer.valueOf(c03ox2.getScene()));
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            map.put(Integer.valueOf(c03ox.getScene()), Integer.valueOf(iIntValue - 1));
            map.put(Integer.valueOf(c03ox2.getScene()), Integer.valueOf(iIntValue2 - 1));
        }
        try {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = this.LIZLLL;
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJFF(Map<String, Object> map) {
        this.LIZIZ = false;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LJIIZILJ = true;
        c1097680efe.LJIJ = 100;
        c1097680efe.LIZ = this.LJI;
        c1097680efe.LJIJI = 6000;
        c1097680efe.LJIJJ = new AwS471S0200000_1(this, (C983603sw) map, (Map<String, Object>) 2);
        c1097680efe.LJIIIIZZ = AFwS284S0000000_1.get$arr$(1);
        c1097680efe.LJJ = false;
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
        C1537060q6K.LJIIIZ(this.LJ, this.LJI, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(X.InterfaceC1748810vbr r8, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r9) {
        /*
            r7 = this;
            X.013C r4 = new X.013C
            r4.<init>()
            X.03fx r1 = X.C903103fx.LIZ
            X.03OX r0 = r7.LIZ
            r1.getClass()
            boolean r0 = X.C903103fx.LJ(r0)
            r4.element = r0
            r3 = 1
            if (r0 == 0) goto L70
            java.lang.Boolean r1 = r7.LJII
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L70
            if (r9 == 0) goto La6
            int r0 = r9.LL
            if (r0 != r3) goto La6
            X.03sy r1 = X.C983803sy.LIZ
            java.util.List<java.lang.String> r0 = r9.LLLIIL
            r1.getClass()
            r6 = 0
            if (r0 == 0) goto L67
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r5 = r0.iterator()
        L35:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r2 = r5.next()
            X.03sy r0 = X.C983803sy.LIZ
            r0.getClass()
            X.01GW r1 = X.C983803sy.LIZJ
            java.lang.Object r0 = r1.getValue()
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L35
            java.lang.Object r0 = r1.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r0.get(r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L35
            r6 = r2
        L65:
            java.lang.String r6 = (java.lang.String) r6
        L67:
            boolean r0 = X.C770702zh.LIZIZ(r6)
            if (r0 == 0) goto La6
            r0 = 1
        L6e:
            r4.element = r0
        L70:
            if (r8 == 0) goto L81
            X.048R r2 = new X.048R
            r2.<init>()
            kotlin.jvm.internal.AwS367S0200000_1 r1 = new kotlin.jvm.internal.AwS367S0200000_1
            r0 = 10
            r1.<init>(r4, r7, r0)
            X.C1748720vbi.LIZIZ(r8, r2, r1)
        L81:
            boolean r0 = r4.element
            if (r0 == 0) goto La8
            java.lang.String r0 = r7.LJ
            boolean r0 = X.C703302op.LIZ(r0)
            if (r0 == 0) goto La8
            java.lang.String r0 = r7.LJFF
            boolean r0 = X.C703302op.LIZ(r0)
            if (r0 == 0) goto La8
            boolean r0 = X.C03VH.LIZ()
            if (r0 == 0) goto L9f
            boolean r0 = r7.LIZIZ
            if (r0 != 0) goto La5
        L9f:
            boolean r0 = X.C03VH.LIZ()
            if (r0 != 0) goto La8
        La5:
            return r3
        La6:
            r0 = 0
            goto L6e
        La8:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C983603sw.LIZLLL(X.0vbr, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel):boolean");
    }

    public final void LIZIZ(C03OX c03ox, String str, String str2, HashMap<String, Object> map, Map<String, Object> map2, Boolean bool, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        final boolean zLIZ = C03VH.LIZ();
        this.LIZ = c03ox;
        this.LJFF = str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ec_common_popup_");
        sbLIZ.append(c03ox.getScene());
        this.LJI = C2188811AlT.LIZIZ(sbLIZ);
        this.LJ = str;
        this.LJII = bool;
        if (map2 == null) {
            map2 = new LinkedHashMap<>();
        }
        map2.put("is_preload", Integer.valueOf(zLIZ ? 1 : 0));
        if (map != null) {
            map2.put("trackParams", map);
        }
        if (zLIZ) {
            OptPreloadSparkConfig optPreloadSparkConfig = (OptPreloadSparkConfig) C0C64.LJIILLIIL().LJJII(OptPreloadSparkConfig.class, C03RB.LIZ, "opt_osp_spark_preload", true);
            if (optPreloadSparkConfig != null && optPreloadSparkConfig.useLastChunk) {
                if (orderSubmitAssemViewModel != null) {
                    orderSubmitAssemViewModel.withState(new AwS210S0300000_1(this, (C983603sw) map2, (Map<String, Object>) orderSubmitAssemViewModel, (OrderSubmitAssemViewModel) 2));
                }
            } else {
                LJFF(map2);
            }
        }
        SparkContext sparkContext = new SparkContext();
        sparkContext.usePreload = zLIZ;
        sparkContext.LJJLIIJ(this.LJ);
        sparkContext.LJJJZ("spark_perf_biz", this.LJI);
        if (!zLIZ) {
            C1547280qMo.LJFF(sparkContext, new Pair("dialog_data", this.LJFF), new Pair("client_data", map2));
        }
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.03sx
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                if (zLIZ) {
                    interfaceC1541990qEH.LIZ("ecCommonPopUpSendFrequencyRequest", null);
                }
            }
        });
        this.LIZLLL = sparkContext;
    }
}
