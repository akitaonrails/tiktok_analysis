package X;

import Y.ARunnableS102S0100000_2;
import Y.ARunnableS130S0100000_30;
import Y.ARunnableS99S0200000_30;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13WZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13WZ {
    public static final List<String> LJIJJ = Arrays.asList("com.ss.android.ugc.aweme.splash.SplashActivity", "com.ss.android.ugc.aweme.main.MainActivity", "com.ss.android.ugc.aweme.journey.NewUserJourneyActivity");
    public static final List<String> LJIJJLI = Arrays.asList("com.google.android.c2dm.intent.RECEIVE", "com.google.firebase.MESSAGING_EVENT");
    public static final List<String> LJIL = Arrays.asList("com.google.firebase.iid.FirebaseInstanceIdReceiver", "com.fcm.service.SSGcmListenerService");
    public static final List<String> LJJ = Arrays.asList("com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2", "com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "com.ss.android.ugc.aweme.main.MainActivity", "com.ss.android.ugc.aweme.splash.ApplinkHookActivity", "com.ss.android.ugc.aweme.splash.SplashActivity");
    public Application LJ;
    public boolean LJFF;
    public EnumC20023013Wa LJIIIIZZ;
    public C0X37 LJIIIZ;
    public EnumC586050Myh LJIIJ;
    public String LJIIL;
    public String LJIILIIL;
    public final Map<String, Boolean> LIZ = new ConcurrentHashMap();
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final long[] LIZLLL = {0, 0, 0, 0};
    public long LJI = 0;
    public long LJII = 0;
    public String LJIIJJI = "";
    public String LJIILJJIL = "";
    public String LJIILL = "";
    public String LJIILLIIL = "";
    public String LJIIZILJ = "";
    public String LJIJ = "";
    public String LJIJI = "";

    public static void LIZIZ() {
        Object obj;
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        try {
            Object objLIZ = C083F.LIZ();
            synchronized (C083F.class) {
                if (C083F.LIZLLL == null) {
                    try {
                        C083F.LIZLLL = C083F.LJ().get(C083F.LJFF());
                    } catch (IllegalAccessException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    obj = C083F.LIZLLL;
                } else {
                    obj = C083F.LIZLLL;
                }
            }
            if (obj == null) {
                return;
            }
            C2204961BRm.a0(C1958507ln.LIZIZ(Instrumentation.class, "basicInit", C083F.LIZIZ()), obj, new Object[]{objLIZ}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOanZJjLznyOM8GonQYuKCpqogcKOuz1asY=", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static Intent LIZJ() {
        IOptimizerHelperService iOptimizerHelperService = (IOptimizerHelperService) PluggableExtentionKt.pluggableSpi(IOptimizerHelperService.class);
        if (iOptimizerHelperService != null) {
            return iOptimizerHelperService.LJIJ();
        }
        return null;
    }

    public final boolean LJIIIIZZ() {
        C0X37 c0x37;
        EnumC20023013Wa enumC20023013Wa = this.LJIIIIZZ;
        if (enumC20023013Wa != null && (c0x37 = this.LJIIIZ) != null && (enumC20023013Wa == EnumC20023013Wa.Push || c0x37 != C0X37.ShowPush)) {
            return false;
        }
        if (enumC20023013Wa != null && this.LJIIIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Because bootType: ");
            sbLIZ.append(this.LJIIIIZZ.LL);
            sbLIZ.append(" landingType: ");
            sbLIZ.append(this.LJIIIZ.LL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return true;
    }

    public final boolean LJIIIZ() {
        Application application = this.LJ;
        return application != null && C2104408Mg.LIZJ(application);
    }

    public static boolean LJ() {
        Intent intentLIZJ = LIZJ();
        if (intentLIZJ != null && intentLIZJ.getAction() != null && intentLIZJ.getComponent() != null && intentLIZJ.getData() != null) {
            Bundle extras = null;
            try {
                if (intentLIZJ.getExtras() != null && LJFF() && intentLIZJ.getData().toString().contains("push_id")) {
                    try {
                        extras = intentLIZJ.getExtras();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (extras.getBoolean("from_notification", false)) {
                        return true;
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }

    public static boolean LJFF() {
        Intent intentLIZJ = LIZJ();
        return (intentLIZJ == null || intentLIZJ.getAction() == null || intentLIZJ.getComponent() == null || intentLIZJ.getData() == null || !intentLIZJ.getAction().equals("android.intent.action.VIEW") || !LJJ.contains(intentLIZJ.getComponent().getShortClassName())) ? false : true;
    }

    public static boolean LJI() {
        Intent intentLIZJ = LIZJ();
        return intentLIZJ != null && intentLIZJ.getAction() != null && intentLIZJ.getComponent() != null && intentLIZJ.getData() == null && intentLIZJ.hasCategory("android.intent.category.LAUNCHER") && intentLIZJ.getAction().equals("android.intent.action.MAIN") && LJIJJ.contains(intentLIZJ.getComponent().getShortClassName());
    }

    public static boolean LJII() {
        Intent intentLIZJ = LIZJ();
        return (intentLIZJ == null || intentLIZJ.getAction() == null || intentLIZJ.getComponent() == null || !LJIJJLI.contains(intentLIZJ.getAction()) || !LJIL.contains(intentLIZJ.getComponent().getShortClassName())) ? false : true;
    }

    public final void LIZ() {
        if (LJIIIIZZ() || this.LJII != 0 || this.LIZIZ.get()) {
            return;
        }
        this.LJII = SystemClock.uptimeMillis();
        if (LJIIIZ() && this.LJFF && this.LIZIZ.compareAndSet(false, true) && !LJIIIIZZ()) {
            C823050WQl.LJ().schedule(new ARunnableS130S0100000_30(this, 42), 5L, TimeUnit.SECONDS);
        }
    }

    public final boolean LIZLLL(String str) {
        if (((ConcurrentHashMap) this.LIZ).get(str) != null && !Boolean.FALSE.equals(((ConcurrentHashMap) this.LIZ).get(str))) {
            return false;
        }
        ((ConcurrentHashMap) this.LIZ).put(str, Boolean.TRUE);
        return true;
    }

    public final void LJIIJ(JSONObject jSONObject) {
        String str;
        try {
            String str2 = this.LJIIL;
            if (str2 != null) {
                jSONObject.put("landing_component", str2);
            }
            String str3 = this.LJIILIIL;
            if (str3 != null) {
                jSONObject.put("landing_fragment", str3);
            }
            Intent intentLIZJ = LIZJ();
            if (intentLIZJ != null) {
                if (intentLIZJ.getAction() != null) {
                    jSONObject.put("launch_intent_action", intentLIZJ.getAction());
                }
                if (intentLIZJ.getComponent() != null) {
                    jSONObject.put("launch_intent_component", intentLIZJ.getComponent().getShortClassName());
                }
                if (intentLIZJ.getAction() != null && intentLIZJ.getComponent() != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(intentLIZJ.getAction());
                    sbLIZ.append("_");
                    sbLIZ.append(intentLIZJ.getComponent().getShortClassName());
                    jSONObject.put("launch_intent_action_component_combo", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (intentLIZJ.getAction() != null && intentLIZJ.getComponent() != null && this.LJIIL != null && this.LJIILIIL != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(intentLIZJ.getAction());
                    sbLIZ2.append("_");
                    sbLIZ2.append(intentLIZJ.getComponent().getShortClassName());
                    sbLIZ2.append("_");
                    sbLIZ2.append(this.LJIIL);
                    sbLIZ2.append("_");
                    sbLIZ2.append(this.LJIILIIL);
                    jSONObject.put("launch_intent_action_component_landing_combo", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            long[] jArr = this.LIZLLL;
            jSONObject.put("application_duration", jArr[1] - jArr[0]);
            long[] jArr2 = this.LIZLLL;
            jSONObject.put("application_complete_to_component", jArr2[3] - jArr2[2]);
            long[] jArr3 = this.LIZLLL;
            if (jArr3[3] - jArr3[2] > 1000) {
                str = "yes";
            } else {
                str = "no";
            }
            jSONObject.put("background_startup", str);
            jSONObject.put("memory_pss", Debug.getPss() / 1024);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIJJI(int i) {
        if (i >= 0) {
            long[] jArr = this.LIZLLL;
            if (i < jArr.length) {
                jArr[i] = SystemClock.uptimeMillis();
            }
        }
    }

    public final void LJIIL(Map<String, String> map) {
        if (!this.LJFF || !LJIIIZ() || !LJII() || C2214201BlK.LJIILJJIL > 0) {
            return;
        }
        C823050WQl.LJ().schedule(new ARunnableS102S0100000_2((Map) map, 71), 1L, TimeUnit.SECONDS);
    }

    public final void LJIILIIL(Map<String, String> map) {
        if (!this.LJFF || !LJIIIZ()) {
            return;
        }
        C823050WQl.LJ().schedule(new ARunnableS99S0200000_30(this, map, 16), 1L, TimeUnit.SECONDS);
    }

    public final void LJIILJJIL(EnumC20023013Wa enumC20023013Wa) {
        switch (C20023113Wb.LIZ[enumC20023013Wa.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.LJIIIIZZ = enumC20023013Wa;
                break;
            case 6:
                if (this.LIZIZ.get() && this.LJIIIIZZ == EnumC20023013Wa.Push && this.LJIIIZ == C0X37.ShowPush) {
                    this.LJI = 0L;
                    this.LJII = 0L;
                    this.LJIIIIZZ = null;
                    this.LJIIIZ = null;
                    this.LJIIJ = null;
                    this.LIZIZ.set(false);
                    if (this.LJI == 0 && !this.LIZIZ.get()) {
                        this.LJI = SystemClock.uptimeMillis();
                    }
                    this.LJIIIIZZ = enumC20023013Wa;
                }
                break;
        }
        EnumC20023013Wa enumC20023013Wa2 = EnumC20023013Wa.Push;
        if (enumC20023013Wa == enumC20023013Wa2) {
            HashMap map = new HashMap();
            map.put("boot_type", enumC20023013Wa2.LL);
            LJIIL(map);
        }
    }

    public final void LJIILL(EnumC586050Myh enumC586050Myh) {
        this.LJIIJ = enumC586050Myh;
        Intent intentLIZJ = LIZJ();
        if (intentLIZJ != null && intentLIZJ.getAction() != null && intentLIZJ.getComponent() != null && !TextUtils.isEmpty(this.LJIIL) && !TextUtils.isEmpty(this.LJIILIIL) && LIZLLL("report_launch_fyp_type")) {
            HashMap map = new HashMap();
            map.put("instantiate_type", this.LJIILLIIL);
            map.put("instantiate_receiver", this.LJIJI);
            map.put("instantiate_service", this.LJIJ);
            map.put("instantiate_activity", this.LJIIZILJ);
            map.put("landing_component", this.LJIIL);
            map.put("landing_fragment", this.LJIILIIL);
            map.put("fyp_type", enumC586050Myh.LL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(intentLIZJ.getAction());
            sbLIZ.append("_");
            sbLIZ.append(intentLIZJ.getComponent().getShortClassName());
            sbLIZ.append("_");
            sbLIZ.append(enumC586050Myh.LL);
            map.put("launch_intent_action_component_fyp_combo", C2188811AlT.LIZIZ(sbLIZ));
            LJIILIIL(map);
        }
    }

    public final void LJIILLIIL(C0X37 c0x37) {
        C0X37 c0x372;
        this.LJIIIZ = c0x37;
        if (this.LJIIIIZZ == EnumC20023013Wa.Push && c0x37 == (c0x372 = C0X37.ShowPush) && LIZLLL("report_push_landing_type")) {
            HashMap map = new HashMap();
            map.put("landing_type", c0x372.LL);
            LJIIL(map);
        }
    }

    public final void LJIIZILJ(String str, String str2, String str3) {
        if (this.LJIIIIZZ == EnumC20023013Wa.Push && this.LJIIIZ == null && LIZLLL("report_push_failed_reason")) {
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                map.put("push_show_rule_id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                map.put("push_show_rule_id_64", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                map.put("push_show_failed_reason", str3);
            }
            LJIIL(map);
        }
    }
}
