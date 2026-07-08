package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.performance.EcPerfSceneConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NWU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NWU implements InterfaceC1769890w9r {
    @Override // X.InterfaceC1769890w9r
    public final boolean LIZIZ(String str) {
        if (C0NWT.LIZ()) {
            List<EcPerfSceneConfig> list = C0NWT.LIZIZ().allowSceneList;
            ArrayList arrayList = new ArrayList();
            Iterator<EcPerfSceneConfig> it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().channelName;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.contains(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final Map<String, Object> LIZJ(EcPerfSceneConfig ecPerfSceneConfig, String str, int i) {
        return C2097608Jq.LJIIIIZZ(new Pair("page_name", ecPerfSceneConfig.sceneName), new Pair(Scene.SCENE_SERVICE, str), new Pair("stay_time", Integer.valueOf(i)));
    }

    @Override // X.InterfaceC1769890w9r
    public final void LIZ(SparkContext sparkContext, String str, String str2) {
        EcPerfSceneConfig next;
        Iterator<EcPerfSceneConfig> it2 = C0NWT.LIZIZ().allowSceneList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.channelName, str2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        final EcPerfSceneConfig ecPerfSceneConfig = next;
        if (ecPerfSceneConfig == null) {
            return;
        }
        sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0NWV
            public long LL = -1;

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
            public final void LJJJJLL(SparkActivity sparkActivity) {
                C054G c054g = C0NTE.LIZ;
                EcPerfSceneConfig ecPerfSceneConfig2 = ecPerfSceneConfig;
                String str3 = ecPerfSceneConfig2.sceneName;
                C0NWX c0nwx = C0NWX.EXIT;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("out_");
                sbLIZ.append(ecPerfSceneConfig.sceneName);
                C0NTE.LIZ(str3, c0nwx, C0NWU.LIZJ(ecPerfSceneConfig2, C2188811AlT.LIZIZ(sbLIZ), (int) (SystemClock.elapsedRealtime() - this.LL)));
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
                this.LL = SystemClock.elapsedRealtime();
                C054G c054g = C0NTE.LIZ;
                EcPerfSceneConfig ecPerfSceneConfig2 = ecPerfSceneConfig;
                String str3 = ecPerfSceneConfig2.sceneName;
                C0NWX c0nwx = C0NWX.ENTER;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enter_");
                sbLIZ.append(ecPerfSceneConfig.sceneName);
                C0NTE.LIZ(str3, c0nwx, C0NWU.LIZJ(ecPerfSceneConfig2, C2188811AlT.LIZIZ(sbLIZ), 0));
            }
        });
        sparkContext.LJJLIIIJL(new InterfaceC2217711Bqz() { // from class: X.0NWW
            public long LL = -1;

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
            public final void LJIJI() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIJJLI() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJ() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJIIZ(InterfaceC1546650qLn interfaceC1546650qLn, Configuration configuration) {
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
            public final void LJIIZILJ() {
                C054G c054g = C0NTE.LIZ;
                EcPerfSceneConfig ecPerfSceneConfig2 = ecPerfSceneConfig;
                String str3 = ecPerfSceneConfig2.sceneName;
                C0NWX c0nwx = C0NWX.EXIT;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("out_");
                sbLIZ.append(ecPerfSceneConfig.sceneName);
                C0NTE.LIZ(str3, c0nwx, C0NWU.LIZJ(ecPerfSceneConfig2, C2188811AlT.LIZIZ(sbLIZ), (int) (SystemClock.elapsedRealtime() - this.LL)));
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJJJZ(InterfaceC1546650qLn interfaceC1546650qLn) {
                this.LL = SystemClock.elapsedRealtime();
                C054G c054g = C0NTE.LIZ;
                EcPerfSceneConfig ecPerfSceneConfig2 = ecPerfSceneConfig;
                String str3 = ecPerfSceneConfig2.sceneName;
                C0NWX c0nwx = C0NWX.ENTER;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enter_");
                sbLIZ.append(ecPerfSceneConfig.sceneName);
                C0NTE.LIZ(str3, c0nwx, C0NWU.LIZJ(ecPerfSceneConfig2, C2188811AlT.LIZIZ(sbLIZ), 0));
            }
        });
    }
}
