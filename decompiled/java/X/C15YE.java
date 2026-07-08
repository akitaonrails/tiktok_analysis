package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManagerV2;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15YE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15YE {
    public static final C15YE LIZ = new C15YE();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(465));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(467));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(464));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(466));
    public static boolean LJFF;

    public static boolean LIZ() {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static InterfaceC20537915Yb LIZLLL() {
        return C297270Bkz.LIZ() ? (InterfaceC20537915Yb) LJ.getValue() : (InterfaceC20537915Yb) LIZLLL.getValue();
    }

    public static C15YD LJ() {
        return C297270Bkz.LIZ() ? FamilyPairingManagerV2.LIZ : FamilyPairingManager.LIZ;
    }

    public static int LJFF() {
        EnumC20537615Xy enumC20537615XyLIZIZ = LJ().LIZIZ();
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        return (enumC20537615XyLIZIZ == EnumC20537615Xy.CHILD && zIsLogin) ? LJ().LJ() : (enumC20537615XyLIZIZ == EnumC20537615Xy.UNLINK_LOCKED && zIsLogin && LJ().LJ() > 0) ? LJ().LJ() : LIZLLL().LJIILLIIL();
    }

    public static C15YN LJI() {
        return C297270Bkz.LIZ() ? (C15YN) LIZJ.getValue() : (C15YN) LIZIZ.getValue();
    }

    public static int LJII() {
        EnumC20537615Xy enumC20537615XyLIZIZ = LJ().LIZIZ();
        return (LJ().LJFF() && (enumC20537615XyLIZIZ == EnumC20537615Xy.UNLINK_LOCKED || enumC20537615XyLIZIZ == EnumC20537615Xy.CHILD) && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && LJ().LJII() > 0) ? LJ().LJII() : LIZLLL().LJIIIZ();
    }

    public static int LJIIIIZZ() {
        EnumC20537615Xy enumC20537615XyLIZIZ = LJ().LIZIZ();
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        return (enumC20537615XyLIZIZ == EnumC20537615Xy.CHILD && zIsLogin) ? LJ().LJIJ() : (enumC20537615XyLIZIZ == EnumC20537615Xy.UNLINK_LOCKED && zIsLogin && LJ().LJIIIIZZ()) ? LJ().LJIJ() : LIZLLL().getSelfTimelockType();
    }

    public static boolean LJIIJ() {
        EnumC20537615Xy enumC20537615XyLIZIZ = LJ().LIZIZ();
        boolean zLJIL = LJ().LJIL();
        if (enumC20537615XyLIZIZ == EnumC20537615Xy.CHILD) {
            return zLJIL;
        }
        if (enumC20537615XyLIZIZ == EnumC20537615Xy.UNLINK_LOCKED && zLJIL) {
            return true;
        }
        return LIZLLL().LJIIL();
    }

    public static boolean LJIIJJI() {
        EnumC20537615Xy enumC20537615XyLIZIZ = LJ().LIZIZ();
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        if (enumC20537615XyLIZIZ == EnumC20537615Xy.CHILD && zIsLogin) {
            return LJ().LJIIIIZZ();
        }
        if (enumC20537615XyLIZIZ == EnumC20537615Xy.UNLINK_LOCKED && zIsLogin && LJ().LJIIIIZZ()) {
            return true;
        }
        return LIZLLL().LJIJJLI();
    }

    public static void LJIILJJIL() {
        Context contextLJFF = C2214201BlK.LJFF();
        if (contextLJFF == null) {
            C844470XAv.LIZ.getClass();
            contextLJFF = C844470XAv.LIZ();
        }
        if (contextLJFF instanceof InterfaceC1603190roz) {
            C1388190mED.LIZ(contextLJFF).finish();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(contextLJFF, "//main");
        smartRouteBuildRoute.addFlags(268468224);
        smartRouteBuildRoute.open();
    }

    public static void LJIILIIL(List list) {
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setLazyUpdate(true);
        String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
        C1537050q6J.LIZ.getClass();
        C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (!C1552050qUV.LIZIZ(accessKey, str)) {
                CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
                targetChannel.channelName = str;
                arrayList.add(targetChannel);
            }
        }
        if (!arrayList.isEmpty()) {
            map.put(accessKey, arrayList);
            if (c1551950qULLIZ != null) {
                c1551950qULLIZ.LIZ(null, map, optionCheckUpdateParams);
            }
        }
    }

    public static void LIZIZ(Runnable runnable, String str) {
        int i;
        if (!LJ().LJIIIIZZ() && !LJ().LJIL()) {
            if (LIZLLL().LJIIL() && LJ().LIZIZ() == EnumC20537615Xy.UNLINK_LOCKED) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                C20684815ws.LJIILLIIL("time_lock_block_show", c2344009Gk.LIZ);
                C15XM.LIZJ(new C204684157i(runnable), str);
                return;
            }
            if (runnable == null) {
                return;
            }
            runnable.run();
            return;
        }
        if (TextUtils.equals("logout", str)) {
            if (LJ().LJIIIIZZ() && LJ().LJIL()) {
                i = 2131834388;
            } else if (LJ().LJIIIIZZ()) {
                i = 2131834387;
            } else {
                i = 2131834386;
            }
        } else if (LJ().LJIIIIZZ() && LJ().LJIL()) {
            i = 2131834391;
        } else if (LJ().LJIIIIZZ()) {
            i = 2131834390;
        } else {
            i = 2131834389;
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIIZ(i);
        c1389890mGx.LJIIJJI();
    }

    public static final void LIZJ(final Activity activity, final String str) {
        if (activity == null) {
            return;
        }
        if (!LIZ()) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(activity.getString(R.string.jb4));
            c1389890mGx.LJIIJJI();
        } else {
            final DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(activity);
            C786410Ut5.J4(dialogC1389620mGW);
            LJIILL(new C15YK() { // from class: X.144Z
                @Override // X.C15YK
                public final void onSuccess() {
                    C786410Ut5.LJIIJ(dialogC1389620mGW);
                    Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=pns_dwb_hub_home").buildUpon();
                    String str2 = str;
                    builderBuildUpon.appendQueryParameter("enter_from", str2);
                    builderBuildUpon.appendQueryParameter("ui_arrangement", "3");
                    if (Intrinsics.LJFF(str2, "sleep_hour_reminder")) {
                        builderBuildUpon.appendQueryParameter("upsell_query", "1");
                    }
                    Uri uriBuild = builderBuildUpon.build();
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(uriBuild.toString());
                    sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0pl5
                        public C1523910pl7 LL;

                        @Override // X.InterfaceC2217701Bqy
                        public final Context LIZJ(Context context) {
                            return context;
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJIILLIIL(boolean z) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJIL(Activity activity2, Context context) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJI(SparkActivity sparkActivity) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIII(SparkActivity sparkActivity, boolean z) {
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
                        public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                            SensorManager sensorManager;
                            Sensor sensorLJJL;
                            Object objM2 = C786410Ut5.M2(sparkActivity, "sensor");
                            Unit unit = null;
                            if ((objM2 instanceof SensorManager) && (sensorManager = (SensorManager) objM2) != null && (sensorLJJL = C2204961BRm.LJJL(sensorManager, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga8SA8Wi7oLVc4I7jSMj51XuWZIYm2D09/jFA4uM3cXzIrzmoyx0+zks3aOhMO", null))) != null) {
                                try {
                                    C1523910pl7 c1523910pl7 = this.LL;
                                    if (c1523910pl7 != null) {
                                        C1300690jx5.LIZLLL(sensorManager, c1523910pl7, sensorLJJL, CertProviderManagerKt.findCert("bpea-digital_wellbeing_hub_shake_time", 1476415512));
                                        this.LL = null;
                                        unit = Unit.LIZ;
                                    }
                                    C189200o6.m2constructorimpl(unit);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                            }
                        }

                        /* JADX WARN: Type inference failed for: r3v0, types: [X.0pl7, android.hardware.SensorEventListener] */
                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                            SensorManager sensorManager;
                            Sensor sensorLJJL;
                            Object objM2 = C786410Ut5.M2(sparkActivity, "sensor");
                            if ((objM2 instanceof SensorManager) && (sensorManager = (SensorManager) objM2) != null && (sensorLJJL = C2204961BRm.LJJL(sensorManager, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga8SA8Wi7oLVc4I7jSMj51XuWZIYm2D09/jFA4uM3cXzIrzmoyx0+zks3aOhMO", null))) != null && this.LL == null) {
                                final AwS567S0100000_23 awS567S0100000_23 = new AwS567S0100000_23(this, 42);
                                ?? r3 = new SensorEventListener(awS567S0100000_23) { // from class: X.0pl7
                                    public final Function0<Unit> LLILLJJLI;
                                    public final long LLILZ;
                                    public final long LLILZIL;
                                    public final long LLILZLL;
                                    public final Float[] LLIZ;
                                    public long LLIZLLLIL;
                                    public long LLJ;
                                    public long LLJI;
                                    public final float LL = 0.8f;
                                    public final float LLILLL = 100.0f;

                                    {
                                        this.LLILLJJLI = awS567S0100000_23;
                                        long j = 1000000;
                                        this.LLILZ = 1000 * j;
                                        this.LLILZIL = 500 * j;
                                        this.LLILZLL = 100 * j;
                                        Float fValueOf = Float.valueOf(0.0f);
                                        this.LLIZ = new Float[]{fValueOf, fValueOf, fValueOf};
                                        this.LLIZLLLIL = -1L;
                                        this.LLJ = -1L;
                                        this.LLJI = -1L;
                                    }

                                    @Override // android.hardware.SensorEventListener
                                    public final void onSensorChanged(SensorEvent sensorEvent) {
                                        boolean z;
                                        if (sensorEvent == null) {
                                            return;
                                        }
                                        Float[] fArr = this.LLIZ;
                                        boolean z2 = false;
                                        float f = 1;
                                        fArr[0] = Float.valueOf((this.LL * fArr[0].floatValue()) + ((f - this.LL) * sensorEvent.values[0]));
                                        Float[] fArr2 = this.LLIZ;
                                        fArr2[1] = Float.valueOf((this.LL * fArr2[1].floatValue()) + ((f - this.LL) * sensorEvent.values[1]));
                                        Float[] fArr3 = this.LLIZ;
                                        fArr3[2] = Float.valueOf((this.LL * fArr3[2].floatValue()) + ((f - this.LL) * sensorEvent.values[2]));
                                        float fFloatValue = sensorEvent.values[0] - this.LLIZ[0].floatValue();
                                        float fFloatValue2 = sensorEvent.values[1] - this.LLIZ[1].floatValue();
                                        float fFloatValue3 = sensorEvent.values[2] - this.LLIZ[2].floatValue();
                                        if ((fFloatValue * fFloatValue) + (fFloatValue2 * fFloatValue2) + (fFloatValue3 * fFloatValue3) >= this.LLILLL) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        long j = this.LLIZLLLIL;
                                        if (j != -1) {
                                            z2 = true;
                                        }
                                        long j2 = this.LLJI;
                                        if (j2 == -1) {
                                            this.LLJI = sensorEvent.timestamp + this.LLILZLL;
                                        } else if (sensorEvent.timestamp < j2) {
                                            return;
                                        }
                                        if (!z2) {
                                            if (z) {
                                                long j3 = sensorEvent.timestamp;
                                                this.LLJ = this.LLILZIL + j3;
                                                this.LLIZLLLIL = j3 + this.LLILZ;
                                                return;
                                            }
                                            return;
                                        }
                                        long j4 = sensorEvent.timestamp;
                                        if (j4 >= j) {
                                            this.LLILLJJLI.invoke();
                                            this.LLJ = -1L;
                                            this.LLIZLLLIL = -1L;
                                            this.LLJI = sensorEvent.timestamp + this.LLILZLL;
                                            return;
                                        }
                                        if (j4 > this.LLJ) {
                                            this.LLJ = -1L;
                                            this.LLIZLLLIL = -1L;
                                        } else if (z) {
                                            this.LLJ = j4 + this.LLILZIL;
                                        }
                                    }

                                    @Override // android.hardware.SensorEventListener
                                    public final void onAccuracyChanged(Sensor sensor, int i) {
                                        Float[] fArr = this.LLIZ;
                                        Float fValueOf = Float.valueOf(0.0f);
                                        fArr[0] = fValueOf;
                                        this.LLIZ[0] = fValueOf;
                                        this.LLIZ[0] = fValueOf;
                                        this.LLJ = -1L;
                                        this.LLIZLLLIL = -1L;
                                    }
                                };
                                this.LL = r3;
                                try {
                                    C189200o6.m2constructorimpl(Boolean.valueOf(C1300690jx5.LIZJ(sensorManager, r3, sensorLJJL, C814420VxA.LIZIZ(20000.0f), CertProviderManagerKt.findCert("bpea-digital_wellbeing_hub_shake_time", 1476415512))));
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                            }
                        }
                    });
                    C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                    Activity activity2 = activity;
                    c1537900q7g.getClass();
                    new C1541950qED(activity2, sparkContext).LIZIZ();
                }

                @Override // X.C15YK
                public final void onFailed(Exception exc) {
                    C786410Ut5.LJIIJ(dialogC1389620mGW);
                }
            }, "");
        }
    }

    public static long LJIIIZ(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 0);
        calendar.set(12, i2);
        calendar.set(11, i);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static boolean LJIIL(DoNotDisturbSettings doNotDisturbSettings, long j) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        if (Intrinsics.LJFF(doNotDisturbSettings.pauseNotificationEnabled, Boolean.TRUE)) {
            Integer num = doNotDisturbSettings.pauseNotificationStartHour;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Integer num2 = doNotDisturbSettings.pauseNotificationStartMinute;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            long jLJIIIZ = LJIIIZ(iIntValue, iIntValue2);
            Integer num3 = doNotDisturbSettings.pauseNotificationEndHour;
            if (num3 != null) {
                iIntValue3 = num3.intValue();
            } else {
                iIntValue3 = 0;
            }
            Integer num4 = doNotDisturbSettings.pauseNotificationEndMinute;
            if (num4 != null) {
                iIntValue4 = num4.intValue();
            } else {
                iIntValue4 = 0;
            }
            long jLJIIIZ2 = LJIIIZ(iIntValue3, iIntValue4);
            if (jLJIIIZ > jLJIIIZ2) {
                jLJIIIZ2 += 86400000;
            }
            if (jLJIIIZ <= j && j <= jLJIIIZ2) {
                return true;
            }
        }
        return false;
    }

    public static void LJIILL(C15YK c15yk, String str) {
        if (C297270Bkz.LIZ()) {
            LJI().LIZ(c15yk, str);
        } else {
            if (LJFF) {
                return;
            }
            LJI().LIZ(c15yk, str);
        }
    }
}
