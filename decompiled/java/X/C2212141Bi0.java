package X;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bi0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212141Bi0 {
    public static volatile C2212141Bi0 LIZLLL;
    public static String LJ;
    public static final Calendar LJFF = Calendar.getInstance();
    public long LIZ;
    public long LIZIZ;
    public volatile C2212121Bhy LIZJ;

    public static int LIZLLL() {
        if (C2212231Bi9.LJJJJ && (C2212231Bi9.LJJJJI / 10000) % 10 == 1) {
            LJFF.setTimeInMillis(C2212161Bi2.LJII());
        } else {
            LJFF.setTimeInMillis(System.currentTimeMillis());
        }
        Calendar calendar = LJFF;
        return calendar.get(5) + calendar.get(2) + calendar.get(1);
    }

    public static C2212141Bi0 LJIIIIZZ() {
        if (LIZLLL == null) {
            synchronized (C2212141Bi0.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C2212141Bi0();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public final void LIZJ() {
        this.LIZJ.LIZ();
    }

    public final String LJFF() {
        return this.LIZJ.LIZLLL("key_empty_log_extra_substitute");
    }

    public final long LJI() {
        return this.LIZJ.LIZJ("key_splash_ad_showed_time", -1L);
    }

    public final long LJIIIZ() {
        if (this.LIZ == 0) {
            this.LIZ = this.LIZJ.LIZJ("key_pre_launch_time", 0L);
        }
        return this.LIZ;
    }

    public final long LJIIJ() {
        if (this.LIZIZ == 0) {
            this.LIZIZ = this.LIZJ.LIZJ("key_pre_remote_time", 0L);
        }
        return this.LIZIZ;
    }

    public final String LJIIL() {
        if (!C2212231Bi9.LJJJ) {
            return this.LIZJ.LIZLLL("splash_ad_data");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ);
        sbLIZ.append("splash_ad_ordered_data");
        return C1293980jmG.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIILL() {
        int iLIZIZ = this.LIZJ.LIZIZ("show_splash_ad_day");
        int iLIZLLL = LIZLLL();
        final int iLIZIZ2 = this.LIZJ.LIZIZ("splash_ad_show_count");
        C2212051Bhr c2212051BhrLIZJ = C2212051Bhr.LIZJ();
        final long j = iLIZIZ;
        final long j2 = iLIZLLL;
        c2212051BhrLIZJ.getClass();
        final InterfaceC20685715x1 interfaceC20685715x1 = C2212231Bi9.LIZIZ;
        if (interfaceC20685715x1 != null) {
            c2212051BhrLIZJ.LJIIJ(new Runnable() { // from class: X.1Bhq
                @Override // java.lang.Runnable
                public final void run() {
                    int i = iLIZIZ2;
                    long j3 = j;
                    long j4 = j2;
                    InterfaceC20685715x1 interfaceC20685715x12 = interfaceC20685715x1;
                    C1C7U.LIZ("SplashAdEventLogManager@2beb.sendSplashShowCountReset$1L");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iLIZIZ3 = C2212141Bi0.LJIIIIZZ().LIZJ.LIZIZ("splash_ad_show_limit");
                        jSONObject.put("clientTime", System.currentTimeMillis());
                        jSONObject.put("showLimit", iLIZIZ3);
                        jSONObject.put("oldShowCount", i);
                        jSONObject.put("lastShowSplashAdDay", j3);
                        jSONObject.put("currentShowSplashAdDay", j4);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    ((C20685515wz) interfaceC20685715x12).LIZ("splash_ad", "splash_show_count_reset", 0L, jSONObject);
                    C1C7U.LIZIZ("SplashAdEventLogManager@2beb.sendSplashShowCountReset$1L");
                }
            });
        }
        int iLIZLLL2 = LIZLLL();
        C2212121Bhy c2212121Bhy = this.LIZJ;
        c2212121Bhy.LJ(iLIZLLL2, "show_splash_ad_day");
        c2212121Bhy.LIZ();
        this.LIZJ.LJ(0, "splash_ad_show_count");
        this.LIZJ.LIZ.LIZIZ.putBoolean("splash_ad_has_first_refresh", false);
        LIZJ();
    }

    public C2212141Bi0() throws Throwable {
        Object obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Context context = C2212231Bi9.LJIILL;
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = context.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Context applicationContext = null;
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Error: ");
                    sbLIZ2.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (!(obj instanceof Application)) {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
                applicationContext = ((Application) obj).getApplicationContext();
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Application context obtained through ActivityThread: ");
                sbLIZ4.append(applicationContext);
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ4));
                if (applicationContext != null) {
                    C786450Ut9.LIZJ = applicationContext.getFilesDir();
                    C08RN.LIZ(applicationContext);
                }
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append(th.getMessage());
                sbLIZ32.append(":");
                sbLIZ32.append(C08RN.LIZJ());
                sbLIZ32.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
            }
            file = C786450Ut9.LIZJ;
        }
        sbLIZ.append(file);
        sbLIZ.append("/SplashData/");
        LJ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZJ == null) {
            this.LIZJ = new C2212121Bhy(C2212231Bi9.LJIILL);
        }
    }

    public static String LJ() {
        LIZLLL();
        StringBuilder sb = new StringBuilder();
        Calendar calendar = LJFF;
        sb.append(calendar.get(1));
        sb.append("/");
        sb.append(calendar.get(2));
        sb.append("/");
        sb.append(calendar.get(5));
        return sb.toString();
    }

    public final boolean LJII() {
        if (LIZLLL() == this.LIZJ.LIZIZ("show_splash_ad_day")) {
            return this.LIZJ.LIZ.LIZ.getBoolean("splash_ad_has_first_refresh", false);
        }
        LJIILL();
        return false;
    }

    public final int LJIIJJI() {
        if (LJ().equals(this.LIZJ.LIZLLL("key_last_show_sequence_day"))) {
            return this.LIZJ.LIZIZ("key_splash_ad_show_sequence");
        }
        C2212121Bhy c2212121Bhy = this.LIZJ;
        c2212121Bhy.LJ(0, "key_splash_ad_show_sequence");
        c2212121Bhy.LIZ();
        String strLJ = LJ();
        C2212121Bhy c2212121Bhy2 = this.LIZJ;
        c2212121Bhy2.LJI("key_last_show_sequence_day", strLJ);
        c2212121Bhy2.LIZ();
        return 0;
    }

    public final int LJIILIIL() {
        if (LIZLLL() == this.LIZJ.LIZIZ("show_splash_ad_day")) {
            return this.LIZJ.LIZIZ("splash_ad_show_count");
        }
        LJIILL();
        return 0;
    }

    public final void LIZ(final C2212201Bi6 c2212201Bi6) {
        final int iLJIILIIL = LJIILIIL();
        int i = iLJIILIIL + 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show count: ");
        sbLIZ.append(i);
        C2212381BiO.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ.LJ(i, "splash_ad_show_count");
        final int iLIZIZ = this.LIZJ.LIZIZ("splash_ad_show_count");
        final C2212051Bhr c2212051BhrLIZJ = C2212051Bhr.LIZJ();
        c2212051BhrLIZJ.getClass();
        final InterfaceC20685715x1 interfaceC20685715x1 = C2212231Bi9.LIZIZ;
        if (interfaceC20685715x1 != null) {
            c2212051BhrLIZJ.LJIIJ(new Runnable() { // from class: X.1Bhp
                @Override // java.lang.Runnable
                public final void run() {
                    C2212051Bhr c2212051Bhr = c2212051BhrLIZJ;
                    C2212201Bi6 c2212201Bi62 = c2212201Bi6;
                    int i2 = iLJIILIIL;
                    int i3 = iLIZIZ;
                    InterfaceC20685715x1 interfaceC20685715x12 = interfaceC20685715x1;
                    c2212051Bhr.getClass();
                    C1C7U.LIZ("SplashAdEventLogManager@2beb.sendSplashShowCountAdd$1L");
                    long jLIZLLL = C2212051Bhr.LIZLLL(c2212201Bi62);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iLIZIZ2 = C2212141Bi0.LJIIIIZZ().LIZJ.LIZIZ("splash_ad_show_limit");
                        jSONObject.put("adId", jLIZLLL);
                        jSONObject.put("clientTime", System.currentTimeMillis());
                        jSONObject.put("showLimit", iLIZIZ2);
                        jSONObject.put("oldShowCount", i2);
                        jSONObject.put("newShowCount", i3);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    ((C20685515wz) interfaceC20685715x12).LIZ("splash_ad", "splash_show_count_add", jLIZLLL, jSONObject);
                    C1C7U.LIZIZ("SplashAdEventLogManager@2beb.sendSplashShowCountAdd$1L");
                }
            });
        }
    }

    public final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bda_splash");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2212121Bhy c2212121Bhy = this.LIZJ;
        c2212121Bhy.LJ(this.LIZJ.LIZIZ(strLIZIZ) + 1, strLIZIZ);
        c2212121Bhy.LIZ();
    }

    public final synchronized boolean LJIILJJIL(String str) {
        boolean z = false;
        if (C2211541Bh2.LIZ(str)) {
            return false;
        }
        C2212121Bhy c2212121Bhy = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("splash_ad_url_has_download_");
        sbLIZ.append(C08HH.LIZ(str));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2212111Bhx c2212111Bhx = c2212121Bhy.LIZ;
        if (strLIZIZ == null) {
            c2212111Bhx.getClass();
        } else {
            z = c2212111Bhx.LIZ.getBoolean(strLIZIZ, false);
        }
        return z;
    }

    public final void LJIILLIIL(long j) {
        if (j == 0) {
            return;
        }
        this.LIZ = SystemClock.elapsedRealtime();
        this.LIZIZ = j;
        C2212121Bhy c2212121Bhy = this.LIZJ;
        c2212121Bhy.LJFF(j, "key_pre_remote_time");
        c2212121Bhy.LJFF(this.LIZ, "key_pre_launch_time");
        c2212121Bhy.LIZ();
    }

    public final void LJIIZILJ(String str) throws Throwable {
        C0VSV c0vsv;
        if (C2212231Bi9.LJJJ) {
            String str2 = LJ;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty("splash_ad_ordered_data")) {
                C0VSJ c0vsj = new C0VSJ(str2);
                if (!c0vsj.exists() && !c0vsj.mkdir()) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append("splash_ad_ordered_data");
                C0VSV c0vsv2 = null;
                try {
                    try {
                        c0vsv = new C0VSV(C2188811AlT.LIZIZ(sbLIZ), false);
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    c0vsv.write(str.getBytes());
                    c0vsv.flush();
                    C1293980jmG.LIZ(c0vsv);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    c0vsv2 = c0vsv;
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Exception:");
                    sbLIZ2.append(e);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1293980jmG.LIZ(c0vsv2);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    c0vsv2 = c0vsv;
                    TryCatchGuardChecker.doCheck(th);
                    C1293980jmG.LIZ(c0vsv2);
                    throw th;
                }
            }
            return;
        }
        this.LIZJ.LJI("splash_ad_data", str);
    }

    public final synchronized void LJIJ(String str) {
        if (C2211541Bh2.LIZ(str)) {
            return;
        }
        C2212121Bhy c2212121Bhy = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("splash_ad_url_has_download_");
        sbLIZ.append(C08HH.LIZ(str));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2212111Bhx c2212111Bhx = c2212121Bhy.LIZ;
        if (strLIZIZ == null) {
            c2212111Bhx.getClass();
        } else {
            c2212111Bhx.LIZIZ.putBoolean(strLIZIZ, true);
        }
        c2212121Bhy.LIZ();
    }

    public final void LJIJI(C2212151Bi1 c2212151Bi1) {
        String strLIZIZ;
        if (c2212151Bi1 != null && !C2211541Bh2.LIZ(c2212151Bi1.LIZLLL)) {
            if (!TextUtils.isEmpty(c2212151Bi1.LJI)) {
                strLIZIZ = c2212151Bi1.LIZIZ();
            } else {
                strLIZIZ = c2212151Bi1.LIZLLL;
            }
            LJIJ(strLIZIZ);
        }
    }
}
