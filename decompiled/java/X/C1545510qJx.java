package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.settings.SparkIABOptimizeConfig;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.screenshot.ISparkScreenshotHostApi;
import defpackage.v8;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545510qJx extends AbstractC1538600q8o {
    public static final C1545510qJx LIZ = new C1545510qJx();
    public static final C1390510mHx LIZIZ = new AbstractC1538890q9H() { // from class: X.0mHx
        @Override // X.AbstractC1538680q8w
        public final boolean LIZJ(Uri uri) {
            return true;
        }

        @Override // X.AbstractC1538680q8w
        public final void LIZ(SparkContext sparkContext) {
            sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0mHv
                public boolean LL;

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
                public final void LJJIII(SparkActivity sparkActivity, boolean z) {
                    if (this.LL != z) {
                        if (z) {
                            C1378370lyN.LIZ.getClass();
                            C1378370lyN.LIZIZ(sparkActivity);
                        } else {
                            C1378370lyN.LIZ.getClass();
                            C1378370lyN.LIZ();
                        }
                        this.LL = z;
                    }
                }
            });
            sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0mHw
                public boolean LIZ;

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
                public final void LJIIIIZZ() {
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
                public final void LJJI(SparkPopup sparkPopup) {
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
                    this.LIZ = false;
                    C1378370lyN.LIZ.getClass();
                    C1378370lyN.LIZ();
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
                    if (this.LIZ != z) {
                        if (z) {
                            Dialog dialog = sparkPopup.getDialog();
                            if (dialog != null) {
                                C1378370lyN.LIZ.getClass();
                                C1378370lyN.LIZIZ(dialog);
                            }
                        } else {
                            C1378370lyN.LIZ.getClass();
                            C1378370lyN.LIZ();
                        }
                        this.LIZ = z;
                    }
                }
            });
        }
    };
    public static final C21394818o6 LIZJ = new AbstractC1538890q9H() { // from class: X.18o6
        @Override // X.AbstractC1538680q8w
        public final void LIZ(final SparkContext sparkContext) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            String strLJIJI = sparkContext.LJIJI();
            try {
                Uri uri = UriProtector.parse(strLJIJI);
                if (uri != null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_enable_stay_time_report");
                } else {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                }
                if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1")) {
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TikTokStayTimePlugin parse failed, url: ");
                sbLIZ.append(strLJIJI);
                C805380Via.LJFF("LaunchProtectException", "TikTokStayTimePlugin", new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), th));
            }
            sparkContext.LJJJJZI(new C21525119Lt(sparkContext, 2));
            sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.18o7
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
                public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
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
                public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                    C21395018o8.LIZ().LIZ(2, sparkContext.LJIJJ(), sparkContext.LJIJI());
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJJ(SparkActivity sparkActivity) {
                    C21395018o8.LIZ().LIZ(1, sparkContext.LJIJJ(), sparkContext.LJIJI());
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                    EnumC1067640dtC type;
                    C21394618o4 c21394618o4LIZ = C21395018o8.LIZ();
                    InterfaceC1541990qEH interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ();
                    String strLJIJI2 = sparkContext.LJIJI();
                    InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
                    if (interfaceC1531560pxS != null) {
                        type = interfaceC1531560pxS.getType();
                    } else {
                        type = null;
                    }
                    c21394618o4LIZ.LIZJ(interfaceC1541990qEHLJIJJ, strLJIJI2, type, 1);
                }
            });
            sparkContext.LJJLIIIJJIZ(new C21524319Ll(sparkContext, 0));
        }
    };
    public static final C1065880dqM LIZLLL = new AbstractC1538890q9H() { // from class: X.0dqM
        @Override // X.AbstractC1538680q8w
        public final void LIZ(SparkContext sparkContext) {
            ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi != null && iSparkHostApi.LJJJJLI()) {
                sparkContext.LJJJZ("screen_orientation", "auto");
            }
        }

        @Override // X.AbstractC1538680q8w
        public final boolean LIZJ(Uri uri) {
            ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi != null) {
                return iSparkHostApi.LJJJJLI();
            }
            return false;
        }
    };
    public static final C1540800qCM LJ = new AbstractC1538890q9H() { // from class: X.0qCM
        public static volatile boolean LIZ;

        @Override // X.AbstractC1538680q8w
        public final boolean LIZJ(Uri uri) {
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:6:0x000d, B:8:0x0011, B:10:0x002e, B:15:0x0041, B:17:0x0049, B:18:0x004f, B:20:0x0057, B:24:0x006f, B:23:0x006c, B:21:0x005c), top: B:31:0x000d, inners: #1 }] */
        @Override // X.AbstractC1538680q8w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZ(com.bytedance.hybrid.spark.SparkContext r6) {
            /*
                r5 = this;
                X.0BLO r0 = X.C0BLO.LIZ
                r0.getClass()
                boolean r0 = X.C0BLO.LIZ()
                if (r0 != 0) goto Lc
                return
            Lc:
                monitor-enter(r5)
                boolean r0 = X.C1540800qCM.LIZ     // Catch: java.lang.Throwable -> L73
                if (r0 != 0) goto L71
                java.lang.String r0 = r6.LJIJI()     // Catch: java.lang.Throwable -> L73
                java.util.Map r4 = r6.LJJJ()     // Catch: java.lang.Throwable -> L73
                android.os.Bundle r3 = r6.bundle     // Catch: java.lang.Throwable -> L73
                android.net.Uri r1 = X.C1946007jm.LJ(r0)     // Catch: java.lang.Throwable -> L73
                java.lang.String r0 = "enable_dynamic_v8"
                java.lang.String r1 = X.C1946007jm.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L73
                java.lang.String r0 = "1"
                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L73
                r2 = 1
                if (r0 != 0) goto L57
                java.lang.String r0 = "enable_dynamic_v8"
                java.lang.Object r1 = r4.get(r0)     // Catch: java.lang.Throwable -> L73
                java.lang.String r0 = "1"
                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L73
                if (r0 != 0) goto L57
                if (r3 == 0) goto L3f
                goto L41
            L3f:
                r1 = 0
                goto L4f
            L41:
                java.lang.String r0 = "enable_dynamic_v8"
                boolean r0 = r3.getBoolean(r0)     // Catch: java.lang.Throwable -> L73
                if (r0 == r2) goto L57
                java.lang.String r0 = "enable_dynamic_v8"
                java.lang.String r1 = r3.getString(r0)     // Catch: java.lang.Throwable -> L73
            L4f:
                java.lang.String r0 = "1"
                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L73
                if (r0 == 0) goto L71
            L57:
                X.0q5g r0 = X.C1536660q5g.LIZ     // Catch: java.lang.Throwable -> L73
                r0.LIZ()     // Catch: java.lang.Throwable -> L73
                X.0qKM r1 = X.C1545760qKM.LIZ     // Catch: java.lang.Throwable -> L6b
                X.1Bky r0 = X.C2213981Bky.LIZIZ     // Catch: java.lang.Throwable -> L6b
                android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L6b
                r1.getClass()     // Catch: java.lang.Throwable -> L6b
                X.C1545760qKM.LIZIZ(r0)     // Catch: java.lang.Throwable -> L6b
                goto L6f
            L6b:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L73
            L6f:
                X.C1540800qCM.LIZ = r2     // Catch: java.lang.Throwable -> L73
            L71:
                monitor-exit(r5)
                return
            L73:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L73
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1540800qCM.LIZ(com.bytedance.hybrid.spark.SparkContext):void");
        }
    };
    public static final C1547690qNT LJFF = new AbstractC1538890q9H() { // from class: X.0qNT
        @Override // X.AbstractC1538680q8w
        public final void LIZ(SparkContext sparkContext) {
            InterfaceC2217701Bqy interfaceC2217701Bqy;
            if (((Boolean) C0AJ6.LIZ.getValue()).booleanValue()) {
                interfaceC2217701Bqy = new InterfaceC2217701Bqy() { // from class: X.0qNS
                    public WeakReference<SparkActivity> LL;

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
                    public final void onActivityResult(int i, int i2, Intent intent) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void onRestoreInstanceState(Bundle bundle) {
                    }

                    @Override // X.InterfaceC1163130gND
                    public final void release() {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void finish() {
                        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                        if (iSparkHostApi != null) {
                            WeakReference<SparkActivity> weakReference = this.LL;
                            iSparkHostApi.LJLJLLL(weakReference != null ? weakReference.get() : null);
                        }
                        this.LL = null;
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                        this.LL = new WeakReference<>(sparkActivity);
                    }
                };
            } else {
                interfaceC2217701Bqy = new InterfaceC2217701Bqy() { // from class: X.0qNR
                    public SparkActivity LL;

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
                    public final void onActivityResult(int i, int i2, Intent intent) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void onRestoreInstanceState(Bundle bundle) {
                    }

                    @Override // X.InterfaceC1163130gND
                    public final void release() {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void finish() {
                        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                        if (iSparkHostApi != null) {
                            iSparkHostApi.LJLJLLL(this.LL);
                        }
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                        this.LL = sparkActivity;
                    }
                };
            }
            sparkContext.LJJLIIIJJI(interfaceC2217701Bqy);
        }
    };
    public static final C1538830q9B LJI = new AbstractC1538890q9H() { // from class: X.0q9B
        @Override // X.AbstractC1538680q8w
        public final void LIZ(SparkContext sparkContext) {
            sparkContext.LJJJJZI(new C1554500qYS(3));
        }
    };
    public static final C1545730qKJ LJII = new AbstractC1538890q9H() { // from class: X.0qKJ
        @Override // X.AbstractC1538680q8w
        public final void LIZ(SparkContext sparkContext) {
            Boolean boolValueOf;
            boolean zBooleanValue;
            String strLIZJ = C1946007jm.LIZJ(C1537540q76.LJ(sparkContext.LJIJI()), "enable_screen_shot_event");
            if (strLIZJ == null && (strLIZJ = sparkContext.LJJJ().get("enable_screen_shot_event")) == null) {
                Bundle bundle = sparkContext.bundle;
                if (bundle != null) {
                    strLIZJ = bundle.getString("enable_screen_shot_event");
                } else {
                    strLIZJ = null;
                }
            }
            if (C123100dR.LIZ(strLIZJ)) {
                zBooleanValue = Intrinsics.LJFF(strLIZJ, "1");
            } else {
                Bundle bundle2 = sparkContext.bundle;
                if (bundle2 != null && (boolValueOf = Boolean.valueOf(bundle2.getBoolean("enable_screen_shot_event"))) != null) {
                    zBooleanValue = boolValueOf.booleanValue();
                } else {
                    return;
                }
            }
            if (zBooleanValue) {
                sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.1BM8
                    public C1BMA LL;
                    public C1BM9 LLILLJJLI;

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
                    public final void LJJIJIIJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIL(SparkActivity sparkActivity, Bundle bundle3) {
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
                    public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle3) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                        return false;
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle3) {
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
                    public final void onRestoreInstanceState(Bundle bundle3) {
                    }

                    @Override // X.InterfaceC1163130gND
                    public final void release() {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJLL(SparkActivity sparkActivity) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            C1BM9 c1bm9 = this.LLILLJJLI;
                            if (c1bm9 != null) {
                                try {
                                    sparkActivity.unregisterScreenCaptureCallback(c1bm9);
                                } catch (IllegalStateException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            this.LLILLJJLI = null;
                        }
                        C1BMA c1bma = this.LL;
                        if (c1bma != null) {
                            C1BHF.LIZ.getClass();
                            ISparkScreenshotHostApi iSparkScreenshotHostApi = (ISparkScreenshotHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkScreenshotHostApi.class, false, false, false, 14, null);
                            if (iSparkScreenshotHostApi != null) {
                                iSparkScreenshotHostApi.LLJJIJIL(c1bma);
                            }
                        }
                        this.LL = null;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v1, types: [X.1BMA, X.1BMF] */
                    /* JADX WARN: Type inference failed for: r1v2, types: [X.1BM9, android.app.Activity$ScreenCaptureCallback] */
                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIIZI(final SparkActivity sparkActivity, Bundle bundle3) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            ?? r1 = new Activity.ScreenCaptureCallback() { // from class: X.1BM9
                                @Override // android.app.Activity.ScreenCaptureCallback
                                public final void onScreenCaptured() {
                                    C1BHF c1bhf = C1BHF.LIZ;
                                    SparkContext sparkContext2 = sparkActivity.LL;
                                    c1bhf.getClass();
                                    C1BHF.LIZ(sparkContext2);
                                }
                            };
                            sparkActivity.registerScreenCaptureCallback(sparkActivity.getMainExecutor(), r1);
                            this.LLILLJJLI = r1;
                        } else {
                            ?? r12 = new C1BMF() { // from class: X.1BMA
                                @Override // X.C1BMF
                                public final void LIZ() {
                                }

                                @Override // X.C1BMF
                                public final void LIZIZ() {
                                }

                                @Override // X.C1BMF
                                public final void LIZJ(String str) {
                                    C1BHF c1bhf = C1BHF.LIZ;
                                    SparkContext sparkContext2 = sparkActivity.LL;
                                    c1bhf.getClass();
                                    C1BHF.LIZ(sparkContext2);
                                }
                            };
                            C1BHF.LIZ.getClass();
                            ISparkScreenshotHostApi iSparkScreenshotHostApi = (ISparkScreenshotHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkScreenshotHostApi.class, false, false, false, 14, null);
                            if (iSparkScreenshotHostApi != 0) {
                                iSparkScreenshotHostApi.LLIIIZ(r12);
                            }
                            this.LL = r12;
                        }
                    }
                });
                sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.1BM7
                    public C1BM1 LIZ;
                    public C1BM6 LIZIZ;
                    public Activity LIZJ;

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
                    public final void LJIIIIZZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIJ() {
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
                    public final void LJJI(SparkPopup sparkPopup) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            C1BM6 c1bm6 = this.LIZIZ;
                            if (c1bm6 != null) {
                                try {
                                    Activity activity = this.LIZJ;
                                    if (activity != null) {
                                        activity.unregisterScreenCaptureCallback(c1bm6);
                                    }
                                } catch (IllegalStateException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            this.LIZIZ = null;
                            this.LIZJ = null;
                        }
                        C1BM1 c1bm1 = this.LIZ;
                        if (c1bm1 != null) {
                            C1BHF.LIZ.getClass();
                            ISparkScreenshotHostApi iSparkScreenshotHostApi = (ISparkScreenshotHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkScreenshotHostApi.class, false, false, false, 14, null);
                            if (iSparkScreenshotHostApi != null) {
                                iSparkScreenshotHostApi.LLJJIJIL(c1bm1);
                            }
                        }
                        this.LIZ = null;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v1, types: [X.1BM1, X.1BMF] */
                    /* JADX WARN: Type inference failed for: r1v2, types: [X.1BM6, android.app.Activity$ScreenCaptureCallback] */
                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIJJI(final SparkPopup sparkPopup, LayoutInflater layoutInflater) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            C19EG activity = sparkPopup.getActivity();
                            Activity activity2 = activity;
                            if (activity == null) {
                                Activity activityLIZ = C1388190mED.LIZ(layoutInflater.getContext());
                                activity2 = activityLIZ;
                                if (activityLIZ == null) {
                                    return;
                                }
                            }
                            this.LIZJ = activity2;
                            ?? r1 = new Activity.ScreenCaptureCallback() { // from class: X.1BM6
                                @Override // android.app.Activity.ScreenCaptureCallback
                                public final void onScreenCaptured() {
                                    C1BHF c1bhf = C1BHF.LIZ;
                                    SparkContext sparkContext2 = sparkPopup.LLJIJIL;
                                    c1bhf.getClass();
                                    C1BHF.LIZ(sparkContext2);
                                }
                            };
                            activity2.registerScreenCaptureCallback(activity2.getMainExecutor(), r1);
                            this.LIZIZ = r1;
                            return;
                        }
                        ?? r12 = new C1BMF() { // from class: X.1BM1
                            @Override // X.C1BMF
                            public final void LIZ() {
                            }

                            @Override // X.C1BMF
                            public final void LIZIZ() {
                            }

                            @Override // X.C1BMF
                            public final void LIZJ(String str) {
                                C1BHF c1bhf = C1BHF.LIZ;
                                SparkContext sparkContext2 = sparkPopup.LLJIJIL;
                                c1bhf.getClass();
                                C1BHF.LIZ(sparkContext2);
                            }
                        };
                        this.LIZ = r12;
                        C1BHF.LIZ.getClass();
                        ISparkScreenshotHostApi iSparkScreenshotHostApi = (ISparkScreenshotHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkScreenshotHostApi.class, false, false, false, 14, null);
                        if (iSparkScreenshotHostApi != 0) {
                            iSparkScreenshotHostApi.LLIIIZ(r12);
                        }
                    }
                });
            }
        }
    };
    public static final C1054670dYH LJIIIIZZ = new C1054670dYH();
    public static final v8 LJIIIZ = new v8();
    public static final C1545670qKD LJIIJ = new AbstractC1538890q9H() { // from class: X.0qKD
        @Override // X.AbstractC1538680q8w
        public final void LIZ(SparkContext sparkContext) {
            sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0qKE
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
                public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
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
                public final void LJJJJJ(SparkActivity sparkActivity) {
                    ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                    if (iSparkHostApi != null) {
                        iSparkHostApi.LJLLI(sparkActivity);
                    }
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                    ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                    if (iSparkHostApi != null) {
                        iSparkHostApi.LLIIII(sparkActivity);
                    }
                }
            });
        }
    };

    public static void LJ(SparkContext sparkContext) {
        String strLJJJJ;
        if (!Intrinsics.LJFF(sparkContext.extraRuntimeInfo.get((Object) "priority_btm_route_data_has_set"), 1)) {
            ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi == null || (strLJJJJ = iSparkHostApi.LJJJJ(sparkContext.LJIJI())) == null) {
                strLJJJJ = "";
            }
            sparkContext.LJJLIIIJ(strLJJJJ, "btm_route_data");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017b  */
    @Override // X.AbstractC1538600q8o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(final com.bytedance.hybrid.spark.SparkContext r12) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1545510qJx.LIZJ(com.bytedance.hybrid.spark.SparkContext):boolean");
    }

    @Override // X.AbstractC1538600q8o
    public final void LIZIZ(SparkContext sparkContext, String str) throws JSONException {
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        C1540320qBa.LIZ = true;
        sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0dN3
            @Override // X.InterfaceC2217701Bqy
            public final Context LIZJ(Context context) {
                return context;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIILLIIL(boolean z4) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIL(Activity activity, Context context) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIII(SparkActivity sparkActivity, boolean z4) {
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
        });
        C1059860dge.LIZIZ = C1540320qBa.LIZ;
        if (C0AJ8.LIZ() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            sparkContext.LJJJZ("opt_title", CardStruct.IStatusCode.DEFAULT);
            C1521730phb.LIZLLL = new C1960107m3();
        }
        if (C0AJ8.LIZ() != 1 && C0AJ8.LIZ() != 5) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            sparkContext.LJJJZ("opt_title", "1");
        }
        if (C0AJ8.LIZ() == 2 || C0AJ8.LIZ() == 5) {
            C1521730phb.LIZLLL = new C1549240qPy(new C1960107m3());
        }
        LIZIZ.LIZ(sparkContext);
        LIZJ.LIZ(sparkContext);
        LIZLLL.LIZ(sparkContext);
        LJ.LIZ(sparkContext);
        LJFF.LIZ(sparkContext);
        LJII.LIZ(sparkContext);
        v8 v8Var = LJIIIZ;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        v8Var.LJ(sparkContext, str2);
        LJIIIIZZ.LIZ(sparkContext);
        LJI.LIZ(sparkContext);
        LJIIJ.LIZ(sparkContext);
        if (!((Boolean) SparkIABOptimizeConfig.LIZJ.getValue()).booleanValue()) {
            String host = C1537540q76.LJ(sparkContext.LJIJI()).getHost();
            if (host != null && a0.LJJIIZI(host, "lynxview", false)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!Intrinsics.LJFF(sparkContext.LJJJ().get("__jump_from_override"), "1") && !z3) {
                String strLJIJI = sparkContext.LJIJI();
                C1059200dfa.LIZ.getClass();
                boolean zLIZ = C1059200dfa.LIZ(sparkContext, strLJIJI);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("originalUrl", "");
                jSONObject.put("newUrl", strLJIJI);
                jSONObject.put("finalNewUrl", strLJIJI);
                if (zLIZ) {
                    str3 = "1";
                }
                jSONObject.put("jumpToPure", str3);
                jSONObject.put("jumpType", "firstJump");
                ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                if (iSparkHostApi != null) {
                    iSparkHostApi.onEventV3("spark_webview_mutual_jump", jSONObject);
                }
            }
        }
        ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi2 != null && iSparkHostApi2.LJJLIIJ()) {
            final ISparkHostApi iSparkHostApi3 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi3 == null) {
                return;
            }
            LJ(sparkContext);
            sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0qKK
                public WeakReference<InterfaceC2211711BhJ> LIZ;

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
                public final void LJIIIIZZ() {
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
                public final void LJJI(SparkPopup sparkPopup) {
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
                public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z4) {
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
                public final void LJIIZILJ(SparkPopup sparkPopup) {
                    InterfaceC2211711BhJ interfaceC2211711BhJ;
                    WeakReference<InterfaceC2211711BhJ> weakReference = this.LIZ;
                    if (weakReference != null && (interfaceC2211711BhJ = weakReference.get()) != null && interfaceC2211711BhJ.w3() != null) {
                        C2211631BhB.LJIILIIL(interfaceC2211711BhJ);
                    }
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIFFI(SparkPopup sparkPopup) {
                    String strLJJJI = iSparkHostApi3.LJJJI(sparkPopup);
                    if (strLJJJI != null && C123100dR.LIZ(strLJJJI)) {
                        if (iSparkHostApi3.LJJIJIIJI().LIZ && iSparkHostApi3.LJLJJI(strLJJJI)) {
                            InterfaceC2211711BhJ interfaceC2211711BhJLJJJLIIL = iSparkHostApi3.LJJJLIIL(sparkPopup, strLJJJI);
                            if (!(interfaceC2211711BhJLJJJLIIL instanceof InterfaceC2211711BhJ)) {
                                interfaceC2211711BhJLJJJLIIL = null;
                            }
                            this.LIZ = new WeakReference<>(interfaceC2211711BhJLJJJLIIL);
                            return;
                        }
                        iSparkHostApi3.LJIIIZ(sparkPopup, strLJJJI);
                    }
                }
            });
            sparkContext.LJJJJZI(new C1554500qYS(2));
            sparkContext.LJJJJZ(new C1554490qYR(0));
        }
        ISparkHostApi iSparkHostApi4 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi4 != null) {
            iSparkHostApi4.LJJJJZI(sparkContext);
        }
        sparkContext.LJJJJZI(new C1545850qKV());
        sparkContext.LJJIJIIJIL(new AbstractC1538740q92() { // from class: X.0qKU
            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str4) {
                C1549030qPd.LIZ(interfaceC1541990qEH, str4);
            }
        });
        super.LIZIZ(sparkContext, str);
        sparkContext.LJJJJZ(new C1077510e97(0));
        ISparkHostApi iSparkHostApi5 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi5 != null) {
            iSparkHostApi5.LLILZIL(sparkContext);
        }
    }
}
