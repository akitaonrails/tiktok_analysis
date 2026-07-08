package X;

import com.bytedance.lynx.hybrid.settings.SettingsConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uMh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700970uMh {
    public static final C1700730uMJ LJIILIIL = new C1700730uMJ();
    public static final ConcurrentHashMap<String, WeakReference<C1700970uMh>> LJIILJJIL = new ConcurrentHashMap<>();
    public AbstractC1701050uMp LIZIZ;
    public InterfaceC1700960uMg LIZJ;
    public SettingsConfig LIZLLL;
    public volatile boolean LJII;
    public volatile long LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public volatile boolean LJIIJ;
    public final String LIZ = "SparkContainerSpace";
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue<InterfaceC1701080uMs> LJI = new ConcurrentLinkedQueue<>();
    public final C1701030uMn LJIIJJI = new C1701030uMn(this);
    public final C1701040uMo LJIIL = new InterfaceC1701110uMv() { // from class: X.0uMo
        @Override // X.InterfaceC1701110uMv
        public final void LIZ(C1701090uMt c1701090uMt) {
            JSONObject jSONObject;
            for (InterfaceC1701080uMs interfaceC1701080uMs : this.LIZ.LJI) {
                String str = null;
                if (c1701090uMt == null) {
                    jSONObject = null;
                } else {
                    try {
                        jSONObject = c1701090uMt.LIZ;
                        str = c1701090uMt.LIZIZ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onInit callback failed ");
                        sbLIZ.append(th);
                        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "HybridSettings");
                    }
                }
                interfaceC1701080uMs.LIZJ(str, jSONObject);
            }
        }

        @Override // X.InterfaceC1701110uMv
        public final void LIZIZ(C1701090uMt c1701090uMt) {
            for (InterfaceC1701080uMs interfaceC1701080uMs : this.LIZ.LJI) {
                try {
                    interfaceC1701080uMs.LIZ(c1701090uMt.LIZIZ, c1701090uMt.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1490740otc c1490740otc = C1490740otc.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onConfigUpdate callback failed ");
                    sbLIZ.append(th);
                    c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "HybridSettings");
                }
            }
            this.LIZ.LJ.set(false);
            this.LIZ.LIZLLL(true);
        }
    };

    public final JSONObject LIZJ() {
        Object c098200Yq;
        AbstractC1701050uMp abstractC1701050uMp = this.LIZIZ;
        if (abstractC1701050uMp == null) {
            return null;
        }
        try {
            c098200Yq = abstractC1701050uMp.LIZ();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (JSONObject) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final void LIZ(long j) {
        Long absoluteInterval;
        long jLongValue;
        long jLongValue2;
        long jMin;
        C1700730uMJ c1700730uMJ = LJIILIIL;
        if (j != 0) {
            c1700730uMJ.LIZIZ(j, new Runnable() { // from class: X.0uMi
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("Settings@4dc5.doStartFetch$1");
                    try {
                        C1701020uMm.LIZ(this.LL.LIZ);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("Settings@4dc5.doStartFetch$1");
                }
            });
            return;
        }
        SettingsConfig settingsConfig = this.LIZLLL;
        if (settingsConfig == null) {
            c1700730uMJ.LIZIZ(60000L, new Runnable() { // from class: X.0uMj
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("Settings@4dc5.doStartFetch$2");
                    try {
                        C1701020uMm.LIZ(this.LL.LIZ);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("Settings@4dc5.doStartFetch$2");
                }
            });
            return;
        }
        Long relativeInterval = settingsConfig.getRelativeInterval();
        SettingsConfig settingsConfig2 = this.LIZLLL;
        AbstractC1701050uMp abstractC1701050uMp = null;
        if (settingsConfig2 != null) {
            absoluteInterval = settingsConfig2.getAbsoluteInterval();
        } else {
            absoluteInterval = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (absoluteInterval != null) {
            if (!this.LJFF.compareAndSet(false, true)) {
                return;
            }
            AbstractC1701050uMp abstractC1701050uMp2 = this.LIZIZ;
            if (abstractC1701050uMp2 != null) {
                abstractC1701050uMp = abstractC1701050uMp2;
            }
            Long l = (Long) abstractC1701050uMp.LIZIZ(Long.TYPE, 0L);
            if (l != null) {
                jLongValue2 = l.longValue();
            } else {
                jLongValue2 = 0;
            }
            if (relativeInterval == null) {
                jMin = (jCurrentTimeMillis - absoluteInterval.longValue()) - jLongValue2;
            } else {
                jMin = Math.min((jCurrentTimeMillis - jLongValue2) - absoluteInterval.longValue(), (jCurrentTimeMillis - this.LJIIIIZZ) - relativeInterval.longValue());
            }
            if (jMin >= 0) {
                LIZIZ(this, true, 2);
                return;
            } else {
                if (!this.LJFF.compareAndSet(true, false)) {
                    return;
                }
                c1700730uMJ.LIZIZ(-jMin, new Runnable() { // from class: X.0uMk
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("Settings@4dc5.doStartFetch$3$1");
                        try {
                            C1701020uMm.LIZ(this.LL.LIZ);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("Settings@4dc5.doStartFetch$3$1");
                    }
                });
                return;
            }
        }
        long j2 = jCurrentTimeMillis - this.LJIIIIZZ;
        if (relativeInterval != null) {
            jLongValue = relativeInterval.longValue();
        } else {
            jLongValue = 3600000;
        }
        if (j2 >= jLongValue && this.LJFF.compareAndSet(false, true)) {
            LIZIZ(this, true, 2);
        }
    }

    public final void LIZLLL(boolean z) {
        Long relativeInterval;
        Long absoluteInterval;
        SettingsConfig settingsConfig;
        long jLongValue;
        Long absoluteInterval2;
        Long relativeInterval2;
        if (this.LIZLLL != null && this.LJFF.compareAndSet(true, false)) {
            this.LJIIIIZZ = System.currentTimeMillis();
            Long relativeInterval3 = null;
            if (z) {
                AbstractC1701050uMp abstractC1701050uMp = this.LIZIZ;
                if (abstractC1701050uMp == null) {
                    abstractC1701050uMp = null;
                }
                abstractC1701050uMp.LJ(Long.valueOf(this.LJIIIIZZ));
            }
            SettingsConfig settingsConfig2 = this.LIZLLL;
            if (settingsConfig2 != null) {
                relativeInterval3 = settingsConfig2.getRelativeInterval();
            }
            long jLongValue2 = 3600000;
            if (relativeInterval3 != null && (settingsConfig = this.LIZLLL) != null && settingsConfig.getAbsoluteInterval() != null) {
                SettingsConfig settingsConfig3 = this.LIZLLL;
                if (settingsConfig3 != null && (relativeInterval2 = settingsConfig3.getRelativeInterval()) != null) {
                    jLongValue2 = relativeInterval2.longValue();
                }
                SettingsConfig settingsConfig4 = this.LIZLLL;
                if (settingsConfig4 != null && (absoluteInterval2 = settingsConfig4.getAbsoluteInterval()) != null) {
                    jLongValue = absoluteInterval2.longValue();
                } else {
                    jLongValue = 0;
                }
                jLongValue2 = Math.max(jLongValue2, jLongValue);
            } else {
                SettingsConfig settingsConfig5 = this.LIZLLL;
                if (settingsConfig5 != null && (absoluteInterval = settingsConfig5.getAbsoluteInterval()) != null) {
                    jLongValue2 = absoluteInterval.longValue();
                } else {
                    SettingsConfig settingsConfig6 = this.LIZLLL;
                    if (settingsConfig6 != null && (relativeInterval = settingsConfig6.getRelativeInterval()) != null) {
                        jLongValue2 = relativeInterval.longValue();
                    }
                }
            }
            LJIILIIL.LIZIZ(jLongValue2, new Runnable() { // from class: X.0uMl
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("Settings@4dc5.scheduleNextFetch$1");
                    try {
                        C1701020uMm.LIZ(this.LL.LIZ);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("Settings@4dc5.scheduleNextFetch$1");
                }
            });
        }
    }

    public static void LIZIZ(final C1700970uMh c1700970uMh, final boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        C1700730uMJ c1700730uMJ = LJIILIIL;
        if (!c1700970uMh.LJ.get()) {
            c1700730uMJ.LIZ(new Runnable() { // from class: X.0uMf
                public final void LIZ() {
                    String strBuildUrl;
                    SettingsConfig settingsConfig = this.LL.LIZLLL;
                    if (settingsConfig == null || (strBuildUrl = settingsConfig.buildUrl()) == null || !this.LL.LJIIJ) {
                        if (z) {
                            C1700730uMJ c1700730uMJ2 = C1700970uMh.LJIILIIL;
                            final C1700970uMh c1700970uMh2 = this.LL;
                            c1700730uMJ2.LIZIZ(60000L, new Runnable() { // from class: X.0uMe
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("Settings@4dc5.fetchOnce$2$1");
                                    try {
                                        C1700970uMh.LIZIZ(c1700970uMh2, true, 2);
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("Settings@4dc5.fetchOnce$2$1");
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (this.LL.LJ.compareAndSet(false, true)) {
                        C1700970uMh c1700970uMh3 = this.LL;
                        InterfaceC1700960uMg interfaceC1700960uMg = c1700970uMh3.LIZJ;
                        (interfaceC1700960uMg != null ? interfaceC1700960uMg : null).LIZ(strBuildUrl, c1700970uMh3.LJIIJJI);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("Settings@4dc5.fetchOnce$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("Settings@4dc5.fetchOnce$2");
                }
            });
        }
    }
}
