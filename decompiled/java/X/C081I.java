package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.081I, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C081I {
    public static C081I LIZJ;
    public final C07TK LIZ;
    public final C081K LIZIZ;

    public static synchronized C081I LIZJ() {
        return LIZJ;
    }

    public final void LIZ(String str) {
        C07TK c07tk = this.LIZ;
        if (c07tk != null) {
            c07tk.LIZ();
        }
    }

    public final void LIZIZ(String str) {
        C07TK c07tk = this.LIZ;
        if (c07tk != null) {
            c07tk.LIZ();
        }
    }

    public C081I(Context context, C07TK c07tk) {
        C081K c081b;
        this.LIZ = c07tk;
        String str = Build.HARDWARE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cpuboost hardware: ");
        sbLIZ.append(str);
        LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!str.startsWith("qcom") && !str.startsWith("msm") && !str.startsWith("qsc") && !str.startsWith("sdm")) {
            if (str.startsWith("mt")) {
                int i = Build.VERSION.SDK_INT;
                if (i <= 28) {
                    LIZ("cpuboost mtk boost");
                    c081b = new C081B();
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cpuboost unsupport for MTK Android9: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(i);
                    LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    c081b = new C081K() { // from class: X.081J
                        @Override // X.C081K
                        public final boolean LIZ(long j) {
                            return false;
                        }

                        @Override // X.C081K
                        public final boolean LIZIZ(long j) {
                            return false;
                        }

                        @Override // X.C081K
                        public final void LIZJ(C081I c081i, Context context2) {
                        }

                        @Override // X.C081K
                        public final void release() {
                        }
                    };
                }
            } else if (!str.startsWith("kirin") && !str.startsWith("hi")) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("cpuboost not found boost for: ");
                sbLIZ3.append(str);
                LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                c081b = new C081K() { // from class: X.081J
                    @Override // X.C081K
                    public final boolean LIZ(long j) {
                        return false;
                    }

                    @Override // X.C081K
                    public final boolean LIZIZ(long j) {
                        return false;
                    }

                    @Override // X.C081K
                    public final void LIZJ(C081I c081i, Context context2) {
                    }

                    @Override // X.C081K
                    public final void release() {
                    }
                };
            } else {
                LIZ("cpuboost hisilicon boost");
                c081b = new C081K() { // from class: X.0819
                    public Class LIZ;
                    public Method LIZIZ;
                    public Object LIZJ;
                    public C081I LIZLLL;

                    @Override // X.C081K
                    public final boolean LIZ(long j) {
                        return false;
                    }

                    @Override // X.C081K
                    public final void release() {
                    }

                    @Override // X.C081K
                    public final boolean LIZIZ(long j) {
                        boolean z;
                        boolean z2;
                        if (j <= 0) {
                            return false;
                        }
                        try {
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 == 29) {
                                C2204961BRm.a0(this.LIZIZ, this.LIZJ, new Object[]{Integer.valueOf((int) j)}, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdD2gYpcsLeObzfHvfHxmHbS2md/aDNThday0ek=", null));
                                return true;
                            }
                            if (i2 != 28) {
                                if (i2 == 27) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                boolean z3 = false | z;
                                if (i2 == 26) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!(z3 | z2)) {
                                    return true;
                                }
                            }
                            ((Integer) C2204961BRm.a0(this.LIZIZ, this.LIZJ, new Object[]{4099, "canBoost=true|screenOn=1", new int[0]}, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdD2gYpcsLeObzfHvfHxmHbS2md/aDNThday0ek=", null))).intValue();
                            return true;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            this.LIZLLL.LIZIZ("cpuboost boost fail:" + th);
                            return false;
                        }
                    }

                    @Override // X.C081K
                    public final void LIZJ(C081I c081i, Context context2) {
                        boolean z;
                        boolean z2;
                        this.LIZLLL = c081i;
                        try {
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 == 29) {
                                Class<?> clsLIZ = C1959307lv.LIZ("android.scrollerboostmanager.ScrollerBoostManager");
                                this.LIZJ = C2204961BRm.a0(C1959307lv.LIZLLL(clsLIZ, "getInstance", null), clsLIZ, null, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdD2gYpcsLeObzfHvfHxmHbS2md/aDNThday0ek=", null));
                                this.LIZIZ = C1959307lv.LIZLLL(clsLIZ, "listFling", Integer.TYPE);
                                clsLIZ.getDeclaredMethod("init", null).invoke(this.LIZJ, null);
                                return;
                            }
                            if (i2 != 28) {
                                if (i2 == 27) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                boolean z3 = false | z;
                                if (i2 == 26) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!(z2 | z3)) {
                                    return;
                                }
                            }
                            Class<?> clsLIZ2 = C1959307lv.LIZ("android.iawareperf.UniPerf");
                            this.LIZ = clsLIZ2;
                            this.LIZIZ = C1959307lv.LIZLLL(clsLIZ2, "uniPerfEvent", Integer.TYPE, String.class, int[].class);
                            this.LIZJ = C2204961BRm.a0(C1959307lv.LIZLLL(this.LIZ, "getInstance", new Class[0]), null, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdD2gYpcsLeObzfHvfHxmHbS2md/aDNThday0ek=", null));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            this.LIZLLL.LIZIZ("cpuboost init fail:" + th);
                        }
                    }
                };
            }
        } else {
            LIZ("cpuboost qcm boost");
            c081b = new C081K() { // from class: X.081F
                public static Object LJIIJ;
                public static Method LJIIJJI;
                public static Method LJIIL;
                public int[] LIZ = LJII;
                public C081I LIZIZ;
                public static final int[] LIZJ = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1082130944, 4095, 1098907648, 255, 1119944704, 1, 1124073472, 255, 1128267776, 65535, 1115799552, 2000, 1115734016, LSPassThroughRecordSizeConfig.DEFAULT};
                public static final int[] LIZLLL = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1, 1124073472, 255, 1128267776, 65535, 1115799552, 2000, 1115734016, LSPassThroughRecordSizeConfig.DEFAULT};
                public static final int[] LJ = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1, 1124073472, 255, 1128267776, 65535, 1115799552, 1, 1115734016, LSPassThroughRecordSizeConfig.DEFAULT};
                public static final int[] LJFF = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1};
                public static final int[] LJI = {1077936128, 1, 1086324736, 1, 1090519040, 4, 1090519296, 4, 1082130432, 4095, 1082130688, 4095, 1098907648, 255};
                public static final int[] LJII = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1};
                public static final int[] LJIIIIZZ = {1115701248, 1, 1115734016, 2000};
                public static final int[] LJIIIZ = {1077936128, 1};
                public static final CopyOnWriteArrayList<Integer> LJIILIIL = new CopyOnWriteArrayList<>();

                @Override // X.C081K
                public final void release() {
                    if (LJIIL == null || LJIIJ == null) {
                        return;
                    }
                    int i2 = 0;
                    while (true) {
                        try {
                            CopyOnWriteArrayList<Integer> copyOnWriteArrayList = LJIILIIL;
                            if (i2 >= copyOnWriteArrayList.size()) {
                                copyOnWriteArrayList.clear();
                                return;
                            } else {
                                C2204961BRm.a0(LJIIL, LJIIJ, new Object[]{copyOnWriteArrayList.get(i2)}, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdD2gYpcsLeObzfHvfHxmHbL0HlVWzZkAanzSA==", null));
                                i2++;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C081I c081i = this.LIZIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("cpuboost release fail");
                            sbLIZ4.append(th.getMessage());
                            c081i.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                            return;
                        }
                    }
                }

                @Override // X.C081K
                public final boolean LIZ(long j) {
                    return LIZLLL(j, LJIIIIZZ);
                }

                @Override // X.C081K
                public final boolean LIZIZ(long j) {
                    LIZLLL(j, LJIIIZ);
                    return LIZLLL(j, this.LIZ);
                }

                @Override // X.C081K
                public final void LIZJ(C081I c081i, Context context2) {
                    this.LIZIZ = c081i;
                    int length = 1;
                    try {
                        Class<?> clsLIZ = C1959307lv.LIZ("android.util.BoostFramework");
                        clsLIZ.getDeclaredMethods();
                        try {
                            LJIIJ = C1959307lv.LIZIZ(clsLIZ, Context.class).newInstance(context2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            LJIIJ = C1959307lv.LIZIZ(clsLIZ, new Class[0]).newInstance(new Object[0]);
                        }
                        Class cls = Integer.TYPE;
                        LJIIJJI = C1959307lv.LIZLLL(clsLIZ, "perfLockAcquire", cls, int[].class);
                        LJIIL = C1959307lv.LIZLLL(clsLIZ, "perfLockReleaseHandler", cls);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C081I c081i2 = this.LIZIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("cpuboost init fail: ");
                        sbLIZ4.append(th2.getMessage());
                        c081i2.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    File[] fileArrListFiles = new C0VSJ("/sys/devices/system/cpu/cpufreq").listFiles();
                    if (fileArrListFiles != null) {
                        length = fileArrListFiles.length;
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28) {
                        if (length == 3) {
                            this.LIZ = LIZJ;
                            return;
                        } else {
                            this.LIZ = LIZLLL;
                            return;
                        }
                    }
                    if (i2 >= 26) {
                        this.LIZ = LJ;
                    } else if (i2 >= 24) {
                        this.LIZ = LJFF;
                    } else {
                        this.LIZ = LJI;
                    }
                }

                public final boolean LIZLLL(long j, int[] iArr) {
                    int iIntValue;
                    if (j <= 0) {
                        return false;
                    }
                    try {
                        if (LJIIJ != null && LJIIJJI != null && (iIntValue = ((Integer) C2204961BRm.a0(LJIIJJI, LJIIJ, new Object[]{Integer.valueOf((int) j), iArr}, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdD2gYpcsLeObzfHvfHxmHbL0HlVWzZkAanzSA==", null))).intValue()) != 0) {
                            LJIILIIL.add(Integer.valueOf(iIntValue));
                            return true;
                        }
                        return true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZIZ.LIZIZ("cpuboost boost fail:" + th.getMessage());
                        return false;
                    }
                }
            };
        }
        this.LIZIZ = c081b;
        c081b.LIZJ(this, context);
    }

    public static synchronized void LIZLLL(Context context, C07TK c07tk) {
        if (LIZJ == null) {
            synchronized (C081I.class) {
                try {
                    LIZJ = new C081I(context, c07tk);
                } finally {
                }
            }
        }
    }
}
