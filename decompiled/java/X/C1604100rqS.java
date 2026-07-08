package X;

import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Printer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604100rqS {
    public byte LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public long LJIILL;
    public String LIZ = "null";
    public String LIZIZ = "null";
    public String LIZJ = "null";
    public final long[] LJI = new long[EnumC1604090rqR.values().length];
    public final HashMap<String, Long> LJII = new HashMap<>();
    public final long[] LJIIIIZZ = new long[EnumC1604090rqR.values().length];
    public Printer LJIIIZ = null;
    public C1604120rqU LJIIJ = null;
    public boolean LJIIJJI = false;
    public boolean LJIIL = false;
    public boolean LJIILIIL = false;
    public byte LJIILJJIL = -1;
    public int LJIILLIIL = 0;
    public int LJIIZILJ = 0;
    public int LJIJ = 0;
    public int LJIJI = 0;
    public int LJIJJ = 0;
    public int LJIJJLI = 0;

    public final void LJ() {
        int i = 0;
        this.LJIILIIL = false;
        C786410Ut5.LJLIIL(300L, C799570VYd.LIZIZ(), new Runnable() { // from class: X.0rqT
            /* JADX WARN: Type inference failed for: r0v16, types: [X.0rqU] */
            public final void LIZ() {
                int i2;
                Looper looper;
                C1604100rqS c1604100rqS = this.LL;
                if (c1604100rqS.LJIILIIL) {
                    return;
                }
                c1604100rqS.LIZLLL = (byte) -1;
                if (c1604100rqS.LIZJ()) {
                    final C1604100rqS c1604100rqS2 = this.LL;
                    if (c1604100rqS2.LJIILJJIL == -1) {
                        try {
                            looper = C799570VYd.LIZIZ().getLooper();
                            C786410Ut5.LJIIZILJ(looper, new Printer() { // from class: X.0rqU
                                @Override // android.util.Printer
                                public final void println(String str) {
                                    if (c1604100rqS2.LJFF) {
                                        if (str.charAt(0) == '>') {
                                            if (!str.startsWith(">>>>> Dispatching to Handler (com.bytedance.io.prefetcher.doframe.DoFrameController$ProxyFrameHandler)") && !str.startsWith(">>>>> Dispatching to Handler (android.view.Choreographer$FrameHandler)")) {
                                                if (C2187451AjH.LJIIJ()) {
                                                    if (str.length() > 100) {
                                                        str = str.substring(str.length() - 100);
                                                    }
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append("MyPrinter start ");
                                                    sbLIZ.append(str);
                                                    Trace.beginSection(C2188811AlT.LIZIZ(sbLIZ));
                                                }
                                                c1604100rqS2.LJIILL = System.currentTimeMillis();
                                            } else {
                                                c1604100rqS2.LJIILL = 0L;
                                            }
                                        } else {
                                            C1604100rqS c1604100rqS3 = c1604100rqS2;
                                            if (c1604100rqS3.LJIILL > 0) {
                                                c1604100rqS3.LJIILLIIL++;
                                                long jCurrentTimeMillis = System.currentTimeMillis();
                                                C1604100rqS c1604100rqS4 = c1604100rqS2;
                                                long j = jCurrentTimeMillis - c1604100rqS4.LJIILL;
                                                if (j > 14) {
                                                    c1604100rqS4.LJIIZILJ++;
                                                } else if (j > 7) {
                                                    c1604100rqS4.LJIJ++;
                                                } else if (j > 2) {
                                                    c1604100rqS4.LJIJI++;
                                                }
                                                if (C2187451AjH.LJIIJ()) {
                                                    Trace.endSection();
                                                }
                                            }
                                        }
                                    }
                                    Printer printer = c1604100rqS2.LJIIIZ;
                                    if (printer != null) {
                                        printer.println(str);
                                    }
                                }
                            });
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        if (((Printer) C1604100rqS.LIZLLL(looper)) != null) {
                            C786410Ut5.LJIIZILJ(looper, null);
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        c1604100rqS2.LJIILJJIL = (byte) i2;
                    }
                    if (c1604100rqS2.LJIILJJIL == 1) {
                        try {
                            Printer printer = (Printer) C1604100rqS.LIZLLL(Looper.getMainLooper());
                            if (printer != null && !(printer instanceof C1604120rqU)) {
                                c1604100rqS2.LJIIIZ = printer;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (c1604100rqS2.LJIIJ == null) {
                            c1604100rqS2.LJIIJ = new Printer() { // from class: X.0rqU
                                @Override // android.util.Printer
                                public final void println(String str) {
                                    if (c1604100rqS2.LJFF) {
                                        if (str.charAt(0) == '>') {
                                            if (!str.startsWith(">>>>> Dispatching to Handler (com.bytedance.io.prefetcher.doframe.DoFrameController$ProxyFrameHandler)") && !str.startsWith(">>>>> Dispatching to Handler (android.view.Choreographer$FrameHandler)")) {
                                                if (C2187451AjH.LJIIJ()) {
                                                    if (str.length() > 100) {
                                                        str = str.substring(str.length() - 100);
                                                    }
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append("MyPrinter start ");
                                                    sbLIZ.append(str);
                                                    Trace.beginSection(C2188811AlT.LIZIZ(sbLIZ));
                                                }
                                                c1604100rqS2.LJIILL = System.currentTimeMillis();
                                            } else {
                                                c1604100rqS2.LJIILL = 0L;
                                            }
                                        } else {
                                            C1604100rqS c1604100rqS3 = c1604100rqS2;
                                            if (c1604100rqS3.LJIILL > 0) {
                                                c1604100rqS3.LJIILLIIL++;
                                                long jCurrentTimeMillis = System.currentTimeMillis();
                                                C1604100rqS c1604100rqS4 = c1604100rqS2;
                                                long j = jCurrentTimeMillis - c1604100rqS4.LJIILL;
                                                if (j > 14) {
                                                    c1604100rqS4.LJIIZILJ++;
                                                } else if (j > 7) {
                                                    c1604100rqS4.LJIJ++;
                                                } else if (j > 2) {
                                                    c1604100rqS4.LJIJI++;
                                                }
                                                if (C2187451AjH.LJIIJ()) {
                                                    Trace.endSection();
                                                }
                                            }
                                        }
                                    }
                                    Printer printer2 = c1604100rqS2.LJIIIZ;
                                    if (printer2 != null) {
                                        printer2.println(str);
                                    }
                                }
                            };
                        }
                        c1604100rqS2.LJIIJJI = true;
                    }
                    this.LL.LJIIL = true;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedScrollLogger@3630.report$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedScrollLogger@3630.report$1");
            }
        });
        if (!LIZJ() || !this.LJIIL || !this.LJ) {
            return;
        }
        if (this.LJIIJJI) {
            C786410Ut5.LJIIZILJ(Looper.getMainLooper(), this.LJIIIZ);
        }
        C2187451AjH.LJIIJ();
        this.LJFF = false;
        this.LJIIJJI = false;
        this.LJIIL = false;
        final long[] jArr = new long[EnumC1604090rqR.values().length];
        final String str = this.LIZ;
        final String str2 = this.LIZIZ;
        final String str3 = this.LIZJ;
        final int i2 = this.LJIILLIIL;
        final int i3 = this.LJIJI;
        final int i4 = this.LJIJ;
        final int i5 = this.LJIIZILJ;
        while (true) {
            long[] jArr2 = this.LJIIIIZZ;
            if (i >= jArr2.length) {
                C20684815ws.LJFF().execute(new Runnable() { // from class: X.0rqQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1604100rqS c1604100rqS = this.LL;
                        long[] jArr3 = jArr;
                        String str4 = str;
                        String str5 = str3;
                        String str6 = str2;
                        int i6 = i2;
                        int i7 = i3;
                        int i8 = i4;
                        int i9 = i5;
                        c1604100rqS.getClass();
                        C1C7U.LIZ("FeedScrollLogger@3630.report$1L");
                        JSONObject jSONObject = new JSONObject();
                        for (int i10 = 0; i10 < jArr3.length; i10++) {
                            try {
                            } catch (Exception e) {
                                e = e;
                            }
                            try {
                                jSONObject.put(EnumC1604090rqR.values()[i10].getType(), jArr3[i10]);
                            } catch (Exception e2) {
                                e = e2;
                                TryCatchGuardChecker.doCheck(e);
                                AppLogNewUtils.onEventV3("prf_feed_scroll_time", jSONObject);
                                C1C7U.LIZIZ("FeedScrollLogger@3630.report$1L");
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        for (String str7 : c1604100rqS.LJII.keySet()) {
                            sb.setLength(0);
                            sb.append(str7);
                            sb.append("_CPU");
                            jSONObject.put(sb.toString(), c1604100rqS.LJII.get(str7));
                        }
                        jSONObject.put("ui_scene", str4);
                        jSONObject.put("current_video", str5);
                        jSONObject.put("next_video", str6);
                        jSONObject.put("count", i6);
                        jSONObject.put("count3", i7);
                        jSONObject.put("count7", i8);
                        jSONObject.put("count14", i9);
                        jSONObject.put("component_listener_size", c1604100rqS.LJIJJ);
                        jSONObject.put("viewpager_listener_size", c1604100rqS.LJIJJLI);
                        C1602860roS.LIZ.getClass();
                        jSONObject.put("is_new_user", C1602860roS.LJ);
                        AppLogNewUtils.onEventV3("prf_feed_scroll_time", jSONObject);
                        C1C7U.LIZIZ("FeedScrollLogger@3630.report$1L");
                    }
                });
                return;
            } else {
                jArr[i] = jArr2[i];
                i++;
            }
        }
    }

    public final boolean LIZJ() {
        if (this.LIZLLL == -1) {
            this.LIZLLL = (byte) ((!C259520AFa.LIZ || new Random().nextFloat() >= 0.005f) ? 0 : 1);
        }
        return this.LIZLLL == 1;
    }

    public final void LJFF() {
        if (LIZJ() && this.LJIIL) {
            this.LJII.clear();
            this.LJIIIIZZ[EnumC1604090rqR.PAGE_SELECT_VIEWPAGER_TOTAL.ordinal()] = 0;
            this.LJIIIIZZ[EnumC1604090rqR.PAGE_SELECT_COMPONENT_TOTAL.ordinal()] = 0;
            this.LJIIIIZZ[EnumC1604090rqR.PAGE_SELECT_INTERNAL_TOTAL.ordinal()] = 0;
            this.LJIIIIZZ[EnumC1604090rqR.PAGE_SELECT_BEFORE.ordinal()] = 0;
            this.LJIIIIZZ[EnumC1604090rqR.PAGE_SELECT_INVOKE_SELECT.ordinal()] = 0;
            this.LJIIIIZZ[EnumC1604090rqR.PAGE_SELECT_PLAYER.ordinal()] = 0;
            this.LJIIIIZZ[EnumC1604090rqR.PAGE_SELECT_AFTER.ordinal()] = 0;
            this.LJIIIIZZ[EnumC1604090rqR.PAGE_SELECT_UN_SELECT.ordinal()] = 0;
            this.LJIIIIZZ[EnumC1604090rqR.PLAYER_PAUSE.ordinal()] = 0;
            this.LJIIIIZZ[EnumC1604090rqR.PLAYER_PREPARE.ordinal()] = 0;
            this.LJIIIIZZ[EnumC1604090rqR.PLAYER_STOP.ordinal()] = 0;
            this.LJIIIIZZ[EnumC1604090rqR.PLAYER_RENDER_READY.ordinal()] = 0;
            this.LJIIIIZZ[EnumC1604090rqR.PLAYER_RENDER_FIRST.ordinal()] = 0;
            this.LJIIIIZZ[EnumC1604090rqR.PLAYER_RENDER_FIRST_DELAY.ordinal()] = 0;
            this.LJIJJ = -1;
            this.LJIJJLI = -1;
            this.LJ = false;
            this.LJIILLIIL = -1;
            this.LJIJI = -1;
            this.LJIJ = -1;
            this.LJIIZILJ = -1;
            if (this.LJIIJJI) {
                if (this.LJIIJ != null) {
                    C786410Ut5.LJIIZILJ(Looper.getMainLooper(), this.LJIIJ);
                }
                this.LJIILLIIL = 0;
                this.LJIIZILJ = 0;
                this.LJIJ = 0;
                this.LJIJI = 0;
                this.LJIILL = 0L;
                this.LJIJJLI = 0;
                this.LJIJJ = 0;
                this.LJFF = true;
            }
            this.LJIILIIL = true;
        }
    }

    public static Object LIZLLL(Object obj) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(obj.getClass(), "mLogging");
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LIZ(EnumC1604090rqR enumC1604090rqR) {
        if (LIZJ() && this.LJIIL) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (LIZJ() && this.LJIIL) {
                this.LJI[enumC1604090rqR.ordinal()] = jUptimeMillis;
            }
            this.LJII.put(enumC1604090rqR.name(), Long.valueOf(SystemClock.currentThreadTimeMillis()));
        }
    }

    public final void LIZIZ(EnumC1604090rqR enumC1604090rqR) {
        if (LIZJ() && this.LJIIL) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (LIZJ() && this.LJIIL) {
                Long lValueOf = Long.valueOf(this.LJI[enumC1604090rqR.ordinal()]);
                if (lValueOf == null) {
                    this.LJI[enumC1604090rqR.ordinal()] = 0;
                    this.LJIIIIZZ[enumC1604090rqR.ordinal()] = 0;
                } else {
                    long jLongValue = jUptimeMillis - lValueOf.longValue();
                    this.LJI[enumC1604090rqR.ordinal()] = jLongValue;
                    this.LJIIIIZZ[enumC1604090rqR.ordinal()] = jLongValue;
                }
                try {
                    try {
                        try {
                            if (this.LJII.containsKey(enumC1604090rqR.name())) {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    long jLongValue2 = this.LJII.get(enumC1604090rqR.name()).longValue();
                                                    if (jLongValue2 > 0) {
                                                        this.LJII.put(enumC1604090rqR.name(), Long.valueOf(SystemClock.currentThreadTimeMillis() - jLongValue2));
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    TryCatchGuardChecker.doCheck(th);
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            }
        }
    }
}
