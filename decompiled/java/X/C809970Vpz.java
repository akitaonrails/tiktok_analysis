package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS82S0200000_13;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import java.text.SimpleDateFormat;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Vpz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809970Vpz {
    public static volatile C809970Vpz LJIIZILJ;
    public String LIZ;
    public volatile boolean LJFF;
    public volatile boolean LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public SharedPreferences LJIIJJI;
    public int LJIILLIIL;
    public int LIZIZ = -1;
    public boolean LIZJ = true;
    public boolean LIZLLL = true;
    public String LJ = "";
    public final C810310VqX LJIIJ = new C810310VqX();
    public int LJIIL = 1;
    public int LJIILIIL = 1;
    public int LJIILJJIL = -1;
    public boolean LJIILL = true;

    public final synchronized boolean LIZIZ() {
        try {
            if (this.LIZIZ == -1) {
                this.LIZIZ = 1;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
        return Boolean.valueOf(this.LIZIZ > 0).booleanValue();
    }

    static {
        new SimpleDateFormat("yyyy-MM-dd");
    }

    public static C809970Vpz LJFF() {
        if (LJIIZILJ == null) {
            synchronized (C809970Vpz.class) {
                try {
                    if (LJIIZILJ == null) {
                        LJIIZILJ = new C809970Vpz();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIZILJ;
    }

    public final SharedPreferences LIZLLL() {
        if (!this.LJI) {
            synchronized (this) {
                try {
                    if (!this.LJI) {
                        this.LJIIJJI = C810670Vr7.LIZJ(C460020I2e.LIZ, 0, "app_setting");
                        this.LJI = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJIIJJI;
    }

    public final String LJ() {
        if (this.LIZ == null) {
            C810000Vq2 c810000Vq2 = C810000Vq2.LIZIZ;
            if (c810000Vq2 == null) {
                throw new IllegalStateException("Please call holdService to initialize");
            }
            this.LIZ = c810000Vq2.LIZ.getDefaultUninstallQuestionUrl();
        }
        return this.LIZ;
    }

    public final boolean LJI() {
        if (!this.LJFF) {
            synchronized (this) {
                try {
                    if (!this.LJFF) {
                        C844470XAv.LIZ.getClass();
                        this.LIZLLL = C813020Vuu.LJIIL().LIZIZ(C844470XAv.LIZ(), "is_allow_oppo_push", true);
                        this.LJFF = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZLLL;
    }

    public C809970Vpz() {
        this.LJIILLIIL = !(this.LIZJ ^ true) ? 0 : 1;
    }

    public final void LJIIIIZZ() {
        if (LIZLLL() == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = LIZLLL().edit();
        editorEdit.putInt("keep_notify_count", this.LJIIIIZZ);
        editorEdit.putInt("max_notify_count", this.LJII);
        editorEdit.putInt("notify_fresh_period", this.LJIIIZ);
        editorEdit.putString("notify_message_ids", this.LJIIJ.LIZJ());
        C1499900p8O.LIZ(editorEdit);
    }

    public final synchronized boolean LIZ(Context context) {
        boolean z;
        int i;
        try {
            z = false;
            if (this.LJIILJJIL == -1) {
                SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "push_setting");
                if (this.LIZJ) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.LJIILJJIL = sharedPreferencesLIZJ.getInt("allow_settings_notify_enable", i);
            }
            if (this.LJIILJJIL > 0) {
                z = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C810890VrT.LIZIZ.LIZIZ("exception_getAllowSettingsNotifyEnable", e);
            return true;
        }
        return Boolean.valueOf(z).booleanValue();
    }

    public final boolean LIZJ(Context context) {
        if (!LIZ(context) || this.LJIILLIIL > 0) {
            return true;
        }
        return false;
    }

    public final void LJII(Context context) {
        C827070WcT c827070WcT = C827070WcT.LIZ;
        c827070WcT.getClass();
        if (!C2093608Ic.LJ(AppLog.getClientId()) && !C2093608Ic.LJ(C827070WcT.LIZJ())) {
            C808950VoL c808950VoLLIZ = C809050VoV.LIZ(context);
            boolean zLIZJ = LIZJ(context);
            c808950VoLLIZ.getClass();
            C808950VoL.LIZLLL().LJII(zLIZJ);
            C808950VoL c808950VoLLIZ2 = C809050VoV.LIZ(context);
            String strLJ = LJ();
            c808950VoLLIZ2.getClass();
            ((AliveOnlineSettings) C0WFE.LIZ(C809360Vp0.LIZ, AliveOnlineSettings.class)).LJIIZILJ(strLJ);
            c827070WcT.getClass();
            HashMap map = new HashMap();
            AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getSSIDs(map);
            if (map.size() != 0) {
                ARunnableS82S0200000_13 aRunnableS82S0200000_13 = new ARunnableS82S0200000_13(map, context, 50);
                if (C12ES.LJIIL()) {
                    RunnableC823120WQs.LIZIZ(aRunnableS82S0200000_13);
                } else {
                    aRunnableS82S0200000_13.run();
                }
            }
            C809270Vor c809270VorLIZJ = C809270Vor.LIZJ(context);
            c809270VorLIZJ.getClass();
            try {
                RunnableC823120WQs.LIZIZ(new ARunnableS113S0100000_13(c809270VorLIZJ, 197));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            C810890VrT.LIZIZ.LJIILLIIL("push_start");
        }
    }

    public final synchronized void LJIIIZ(Context context, boolean z) {
        try {
            if (this.LIZIZ != z) {
                this.LIZIZ = z ? 1 : 0;
                boolean z2 = false;
                SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, "push_setting").edit();
                editorEdit.putInt("confirm_push", this.LIZIZ);
                C1499900p8O.LIZ(editorEdit);
                C810010Vq3 c810010Vq3LIZ = C810010Vq3.LIZ();
                if (this.LIZIZ > 0) {
                    z2 = true;
                }
                c810010Vq3LIZ.getClass();
                C808950VoL.LIZIZ().getClass();
                C808950VoL.LIZJ().LJ(z2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
