package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.ecommerce.pad.IEcMallPadService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18no, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21393018no implements InterfaceC1769890w9r {
    public final List<String> LIZ;

    public C21393018no() {
        List<String> listLIZIZ;
        IEcMallPadService iEcMallPadService = (IEcMallPadService) PluggableExtentionKt.pluggableSpi$default(IEcMallPadService.class, false, false, false, 14, null);
        this.LIZ = (iEcMallPadService == null || (listLIZIZ = iEcMallPadService.LIZIZ()) == null) ? C13BV.INSTANCE : listLIZIZ;
    }

    public static void LIZJ(SparkContext sparkContext) {
        Object objValueOf;
        Context applicationContext = C1948707kD.LIZ().getApplicationContext();
        if (sparkContext != null) {
            C1537510q73 c1537510q73 = sparkContext.runtimeInfo;
            if (c1537510q73 != null) {
                c1537510q73.put("pad_screen_width", (Object) Integer.valueOf(C12ES.LJIILJJIL(C12ES.LJIIJ(applicationContext), applicationContext)));
            }
            C1537510q73 c1537510q732 = sparkContext.runtimeInfo;
            if (c1537510q732 != null) {
                c1537510q732.put("pad_screen_height", (Object) Integer.valueOf(C12ES.LJIILJJIL(C12ES.LJIIIIZZ(applicationContext), applicationContext)));
            }
            C1537510q73 c1537510q733 = sparkContext.runtimeInfo;
            if (c1537510q733 != null) {
                IEcMallPadService iEcMallPadService = (IEcMallPadService) PluggableExtentionKt.pluggableSpi$default(IEcMallPadService.class, false, false, false, 14, null);
                if (iEcMallPadService != null) {
                    objValueOf = Integer.valueOf(iEcMallPadService.isPad());
                } else {
                    objValueOf = sparkContext.runtimeInfo.get((Object) "isPad");
                    if (objValueOf == null) {
                        objValueOf = 0;
                    }
                }
                c1537510q733.put("isPad", objValueOf);
            }
        }
    }

    @Override // X.InterfaceC1769890w9r
    public final boolean LIZIZ(String str) {
        return this.LIZ.contains(str);
    }

    public static void LIZLLL(Configuration configuration, SparkContext sparkContext) throws JSONException {
        boolean z;
        String str;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        if (configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "landscape";
        } else {
            str = "portrait";
        }
        jSONObject.put("direction", str);
        if (sparkContext != null && (interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ()) != null) {
            interfaceC1541990qEHLJIJJ.LIZ("userInterfaceDidRotate", jSONObject);
        }
    }

    @Override // X.InterfaceC1769890w9r
    public final void LIZ(SparkContext sparkContext, String str, String str2) {
        sparkContext.LJJLIIIJJIZ(new C21524319Ll(this, 1));
        sparkContext.LJJLIIIJL(new InterfaceC2217711Bqz() { // from class: X.18nq
            @Override // X.InterfaceC2217711Bqz
            public final Context LIZJ(Context context) {
                return context;
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJ() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJI() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJII() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIIJJI() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIIL() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIILLIIL(boolean z) {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIIZILJ() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIJI() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIJJLI() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJ() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJIJIIJIL(InterfaceC1546650qLn interfaceC1546650qLn) {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJIJIL() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJJIL(InterfaceC1546650qLn interfaceC1546650qLn) {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJLIIIIJ() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJLIIIJLJLI(InterfaceC1546650qLn interfaceC1546650qLn) {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void finish() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJJJZ(InterfaceC1546650qLn interfaceC1546650qLn) {
                C21393018no c21393018no = this.LL;
                SparkContext sparkContextLLIILZL = interfaceC1546650qLn.LLIILZL();
                c21393018no.getClass();
                C21393018no.LIZJ(sparkContextLLIILZL);
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJIIZ(InterfaceC1546650qLn interfaceC1546650qLn, Configuration configuration) throws JSONException {
                C21393018no c21393018no = this.LL;
                SparkContext sparkContextLLIILZL = interfaceC1546650qLn.LLIILZL();
                c21393018no.getClass();
                C21393018no.LIZLLL(configuration, sparkContextLLIILZL);
                C21393018no c21393018no2 = this.LL;
                SparkContext sparkContextLLIILZL2 = interfaceC1546650qLn.LLIILZL();
                c21393018no2.getClass();
                C21393018no.LIZJ(sparkContextLLIILZL2);
            }
        });
        sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.18np
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
            public final void LJJJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJZI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
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
            public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) throws JSONException {
                C21393018no c21393018no = this.LL;
                SparkContext sparkContext2 = sparkActivity.LL;
                c21393018no.getClass();
                C21393018no.LIZLLL(configuration, sparkContext2);
                C21393018no c21393018no2 = this.LL;
                SparkContext sparkContext3 = sparkActivity.LL;
                c21393018no2.getClass();
                C21393018no.LIZJ(sparkContext3);
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
                C21393018no c21393018no = this.LL;
                SparkContext sparkContext2 = sparkActivity.LL;
                c21393018no.getClass();
                C21393018no.LIZJ(sparkContext2);
            }
        });
    }
}
