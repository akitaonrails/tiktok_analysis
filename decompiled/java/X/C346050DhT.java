package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Calendar;

/* JADX INFO: renamed from: X.0DhT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C346050DhT implements InterfaceC304970BxP {
    public static C346050DhT LLIZ;
    public int LL = 22;
    public int LLILLJJLI = -1;
    public int LLILLL = -1;
    public int LLILZ = -1;
    public final Calendar LLILZIL = Calendar.getInstance();
    public String LLILZLL;

    public static C346050DhT LIZJ() {
        if (LLIZ == null) {
            synchronized (C346050DhT.class) {
                try {
                    if (LLIZ == null) {
                        LLIZ = new C346050DhT();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLIZ;
    }

    public C346050DhT() {
        LIZIZ();
        SettingsManager.LIZLLL().LJIIIZ(this);
    }

    public final void LIZIZ() {
        SettingsManager.LIZLLL().getClass();
        this.LL = SettingsManager.LJ("anti_addiction_separation", 22);
        SettingsManager.LIZLLL().getClass();
        this.LLILLJJLI = SettingsManager.LJ("anti_addiction_day_time", -1);
        SettingsManager.LIZLLL().getClass();
        this.LLILLL = SettingsManager.LJ("anti_addiction_night_time", -1);
        SettingsManager.LIZLLL().getClass();
        this.LLILZ = SettingsManager.LJ("anti_addiction_toast_time", -1);
    }

    @Override // X.InterfaceC304970BxP
    public final void LIZ() {
        LIZIZ();
    }
}
