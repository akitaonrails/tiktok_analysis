package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.touchpoint.api.service.IIncentiveSparkService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.0zMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893280zMs implements InterfaceC1893530zNH, InterfaceC1141530foN {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0qEc, X.0zMx] */
    @Override // X.InterfaceC1893530zNH
    public final void LIZ(final SparkContext sparkContext) {
        final ?? r1 = new AbstractC1542200qEc() { // from class: X.0zMx
            public boolean LLILLJJLI;
            public long LLILLL;

            @Override // X.AbstractC1537870q7d
            public final void onDestroy() {
                C1548820qPI.LJIIIIZZ("referral_all_rewards_claimed", this);
                C1893790zNh c1893790zNh = C1893790zNh.LIZ;
                String strLJJIL = sparkContext.LJJIL();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                c1893790zNh.getClass();
                C1893790zNh.LJIIJ("inc_activity_exit", strLJJIL, linkedHashMap);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                if (!this.LLILLJJLI) {
                    C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                    String strLJJIL = sparkContext.LJJIL();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
                    c1893680zNW.getClass();
                    C1893680zNW.LJI(jCurrentTimeMillis, strLJJIL, 1, null, null);
                    C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                    SparkContext sparkContext2 = sparkContext;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLILLL;
                    c1894320zOY.getClass();
                    C01U6.LIZJ(new C1850120yFG(sparkContext2, 1, jCurrentTimeMillis2, 0, null));
                }
                InterfaceC1893690zNX interfaceC1893690zNX = (InterfaceC1893690zNX) PluggableExtentionKt.pluggableSpi$default(InterfaceC1893690zNX.class, false, false, false, 14, null);
                if (interfaceC1893690zNX != null) {
                    interfaceC1541990qEH.e1();
                    interfaceC1893690zNX.LIZLLL();
                }
                C1548820qPI.LIZLLL("referral_all_rewards_claimed", this);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                this.LLILLL = System.currentTimeMillis();
                this.LLILLJJLI = false;
            }

            @Override // X.AbstractC1542100qES
            public final void LJLLJ(SparkContext sparkContext2, C1548490qOl c1548490qOl) {
                Boolean boolValueOf;
                boolean z;
                Object obj;
                Object obj2;
                C1893410zN5 c1893410zN5 = C1893410zN5.LIZ;
                Integer numValueOf = Integer.valueOf(c1548490qOl.LIZIZ);
                c1893410zN5.getClass();
                String strLIZIZ = C1893410zN5.LIZIZ(numValueOf);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("opt mode: ");
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(", sparkContext: ");
                sbLIZ.append(sparkContext2);
                sbLIZ.append(", is preload call: ");
                if (sparkContext2 != null) {
                    boolValueOf = Boolean.valueOf(sparkContext2.usePreload);
                } else {
                    boolValueOf = null;
                }
                sbLIZ.append(boolValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                if (sparkContext2 != null) {
                    if (sparkContext2.usePreload) {
                        obj2 = "1";
                    } else {
                        obj2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    sparkContext2.LJJLIIIJ(obj2, "preloadOnly");
                }
                if (sparkContext2 != null && !sparkContext2.usePreload) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    sparkContext2.LJJLIIIJ(strLIZIZ, "_pa_inc_opt_mode");
                    int i = c1548490qOl.LIZIZ;
                    if (i == 2 || i == 1) {
                        sparkContext2.LJJLIIIJ(strLIZIZ, "_pa_inc_preload_type");
                    }
                } else {
                    if (C1868970yjf.LIZ().enablePreRenderWebView) {
                        obj = "pre_render";
                    } else {
                        obj = "pre_create";
                    }
                    if (sparkContext2 == null) {
                        return;
                    } else {
                        sparkContext2.LJJLIIIJ(obj, "_pa_inc_preload_type");
                    }
                }
                if (((Boolean) AnonymousClass0510.LIZLLL.getValue()).booleanValue() && ((Boolean) AnonymousClass0510.LJ.getValue()).booleanValue()) {
                    C01U6.LIZIZ(new AwS429S0200000_28(sparkContext2, c1548490qOl, 153));
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
                int iIntValue;
                this.LLILLJJLI = true;
                C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
                Integer num = c1542120qEU.LIZ;
                String str2 = c1542120qEU.LIZIZ;
                c1893680zNW.getClass();
                C1893680zNW.LJI(jCurrentTimeMillis, str, 0, str2, num);
                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                SparkContext sparkContext2 = sparkContext;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLILLL;
                Integer num2 = c1542120qEU.LIZ;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = -999;
                }
                String str3 = c1542120qEU.LIZIZ;
                c1894320zOY.getClass();
                C01U6.LIZJ(new C1850120yFG(sparkContext2, 0, jCurrentTimeMillis2, iIntValue, str3));
            }
        };
        sparkContext.LJJJJZI(r1);
        sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0zND
            @Override // X.InterfaceC1554220qY0
            public final void LIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJII() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILIIL(SparkPopup sparkPopup, View view) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILJJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILL(SparkPopup sparkPopup, int i) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIZILJ(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJIJI(SparkPopup sparkPopup) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJIJJ(SparkPopup sparkPopup) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJJLI(SparkPopup sparkPopup, float f) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIFFI(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJII() {
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIJ(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIZI() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void onViewAttachedToWindow() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void onViewDetachedFromWindow() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIIIZZ() {
                C01U6.LIZIZ(new AwS429S0200000_28(sparkContext, r1, 156));
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJI(SparkPopup sparkPopup) {
                C1893540zNI c1893540zNI = C1893540zNI.LIZ;
                SparkContext sparkContext2 = sparkContext;
                c1893540zNI.getClass();
                C1893540zNI.LIZ(sparkContext2, false);
                if (((Boolean) C0B9C.LIZ.getValue()).booleanValue()) {
                    sparkContext.LJJIFFI();
                }
            }
        });
        C1878650yzH.LIZ.getClass();
        if (C1878650yzH.LIZ() && C1878660yzI.LIZ(sparkContext)) {
            IIncentiveSparkService iIncentiveSparkService = (IIncentiveSparkService) PluggableExtentionKt.pluggableSpi$default(IIncentiveSparkService.class, false, false, false, 14, null);
            if (iIncentiveSparkService != 0) {
                iIncentiveSparkService.LJFF(sparkContext, r1);
                return;
            }
            return;
        }
        sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0zNC
            @Override // X.InterfaceC2217701Bqy
            public final Context LIZJ(Context context) {
                return context;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIILLIIL(boolean z) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIL(Activity activity, Context context) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIII(SparkActivity sparkActivity, boolean z) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIJZLJL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIJIIJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                return false;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLJLI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void finish() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJLL(SparkActivity sparkActivity) {
                C1893540zNI c1893540zNI = C1893540zNI.LIZ;
                SparkContext sparkContext2 = sparkContext;
                c1893540zNI.getClass();
                C1893540zNI.LIZ(sparkContext2, false);
                if (((Boolean) C0B9C.LIZ.getValue()).booleanValue()) {
                    sparkContext.LJJIFFI();
                }
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJZI(SparkActivity sparkActivity) {
                C01U6.LIZIZ(new AwS429S0200000_28(sparkContext, r1, 155));
            }
        });
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C1893780zNg.LIZIZ.LJII(c262100zr);
    }
}
