package X;

import Y.ARunnableS102S0100000_2;
import Y.ARunnableS92S0000000_13;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.boot.BootFinishHandler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.lego.common.trigger.BackgroundTriggerV2;
import com.ss.android.ugc.aweme.lego.common.trigger.BackgroundTriggerV3;
import com.ss.android.ugc.aweme.lego.common.trigger.BackgroundTriggerV4;
import com.ss.android.ugc.aweme.lego.common.trigger.BackgroundTriggerV5;
import com.ss.android.ugc.aweme.lego.common.trigger.BackgroundTriggerV6;
import com.ss.android.ugc.aweme.lego.common.trigger.BackgroundTriggerV66;
import com.ss.android.ugc.aweme.lego.common.trigger.BackgroundTriggerV8;
import com.ss.android.ugc.aweme.lego.wrapper.IBootFinishTaskConfig;
import com.ss.android.ugc.aweme.performanceopt.api.IPerformanceExperimentApi;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0VZV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZV {
    public static boolean LIZ;
    public static boolean LIZIZ;

    /* JADX WARN: Type inference failed for: r0v53, types: [X.0CCU, X.0VYp] */
    /* JADX WARN: Type inference failed for: r0v65, types: [X.1465] */
    public static void LIZ(final Application application) {
        InterfaceC800100Va4 backgroundTriggerV2;
        final HashMap map = new HashMap();
        String packageName = application.getPackageName();
        map.put(packageName, 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(packageName);
        sbLIZ.append(":push");
        map.put(C2188811AlT.LIZIZ(sbLIZ), 2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(packageName);
        sbLIZ2.append(":pushservice");
        map.put(C2188811AlT.LIZIZ(sbLIZ2), 32);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(packageName);
        sbLIZ3.append(":ttplayer");
        map.put(C2188811AlT.LIZIZ(sbLIZ3), 64);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(packageName);
        sbLIZ4.append(":miniapp0");
        map.put(C2188811AlT.LIZIZ(sbLIZ4), 16);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(packageName);
        sbLIZ5.append(":miniapp1");
        map.put(C2188811AlT.LIZIZ(sbLIZ5), 16);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(packageName);
        sbLIZ6.append(":miniapp2");
        map.put(C2188811AlT.LIZIZ(sbLIZ6), 16);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(packageName);
        sbLIZ7.append(":miniapp3");
        map.put(C2188811AlT.LIZIZ(sbLIZ7), 16);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append(packageName);
        sbLIZ8.append(":miniapp4");
        map.put(C2188811AlT.LIZIZ(sbLIZ8), 16);
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append(packageName);
        sbLIZ9.append(":miniapp100");
        map.put(C2188811AlT.LIZIZ(sbLIZ9), 16);
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append(packageName);
        sbLIZ10.append(":miniapp200");
        map.put(C2188811AlT.LIZIZ(sbLIZ10), 16);
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append(packageName);
        sbLIZ11.append(":error_activity");
        map.put(C2188811AlT.LIZIZ(sbLIZ11), 256);
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append(packageName);
        sbLIZ12.append(":safemode");
        map.put(C2188811AlT.LIZIZ(sbLIZ12), 128);
        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
        sbLIZ13.append(packageName);
        sbLIZ13.append(":wallpaper");
        map.put(C2188811AlT.LIZIZ(sbLIZ13), 1024);
        StringBuilder sbLIZ14 = C2188811AlT.LIZ();
        sbLIZ14.append(packageName);
        sbLIZ14.append(":bm");
        map.put(C2188811AlT.LIZIZ(sbLIZ14), 512);
        StringBuilder sbLIZ15 = C2188811AlT.LIZ();
        sbLIZ15.append(packageName);
        sbLIZ15.append(":boost_multidex");
        map.put(C2188811AlT.LIZIZ(sbLIZ15), Integer.valueOf(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE));
        StringBuilder sbLIZ16 = C2188811AlT.LIZ();
        sbLIZ16.append(packageName);
        sbLIZ16.append(":downloader");
        map.put(C2188811AlT.LIZIZ(sbLIZ16), 4);
        StringBuilder sbLIZ17 = C2188811AlT.LIZ();
        sbLIZ17.append(packageName);
        sbLIZ17.append(":playcore_missing_splits_activity");
        map.put(C2188811AlT.LIZIZ(sbLIZ17), 131072);
        StringBuilder sbLIZ18 = C2188811AlT.LIZ();
        sbLIZ18.append(packageName);
        sbLIZ18.append(":feedbacker");
        map.put(C2188811AlT.LIZIZ(sbLIZ18), 262144);
        StringBuilder sbLIZ19 = C2188811AlT.LIZ();
        sbLIZ19.append(packageName);
        sbLIZ19.append(":dfmock");
        map.put(C2188811AlT.LIZIZ(sbLIZ19), 524288);
        StringBuilder sbLIZ20 = C2188811AlT.LIZ();
        sbLIZ20.append(packageName);
        sbLIZ20.append(":memopt");
        map.put(C2188811AlT.LIZIZ(sbLIZ20), 1048576);
        C799900VZk c799900VZk = C799900VZk.LIZ;
        ?? r0 = new InterfaceC799690VYp() { // from class: X.0CCU
            public List<String> LIZ;

            /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
            @Override // X.InterfaceC799690VYp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List<java.lang.String> LIZ() {
                /*
                    r4 = this;
                    java.util.List<java.lang.String> r0 = r4.LIZ
                    if (r0 != 0) goto L34
                    java.lang.String r3 = "lego_skiptasklist"
                    r2 = 0
                    X.C0X35.LIZ(r3, r2)
                    android.app.Application r1 = r1
                    if (r1 == 0) goto L19
                    java.lang.String r0 = "fix_lego_init_crash"
                    boolean r0 = X.C08Q0.LJ(r1, r0, r2)     // Catch: java.lang.Throwable -> L15
                    goto L1a
                L15:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L19:
                    r0 = 0
                L1a:
                    if (r0 == 0) goto L37
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.List r0 = X.C1933607hm.LIZ()
                    r1.addAll(r0)
                    java.util.List r0 = X.C0CBQ.LIZ()
                    r1.addAll(r0)
                    r4.LIZ = r1
                L31:
                    X.C0X35.LJIIJJI(r3, r2)
                L34:
                    java.util.List<java.lang.String> r0 = r4.LIZ
                    return r0
                L37:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r4.LIZ = r0
                    java.util.List r1 = X.C19719512Dh.LIZIZ(r0)
                    java.util.List r0 = X.C1933607hm.LIZ()
                    r1.addAll(r0)
                    java.util.List<java.lang.String> r0 = r4.LIZ
                    java.util.List r1 = X.C19719512Dh.LIZIZ(r0)
                    java.util.List r0 = X.C0CBQ.LIZ()
                    r1.addAll(r0)
                    goto L31
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0CCU.LIZ():java.util.List");
            }

            @Override // X.InterfaceC799690VYp
            public final long LIZIZ() {
                return ((Number) C072Z.LIZIZ.getValue()).longValue();
            }

            @Override // X.InterfaceC799690VYp
            public final boolean LIZJ() {
                return ((Boolean) C0CCJ.LJI.getValue()).booleanValue();
            }

            @Override // X.InterfaceC799690VYp
            public final long LIZLLL() {
                return ((Number) C072Z.LIZ.getValue()).longValue();
            }

            @Override // X.InterfaceC799690VYp
            public final boolean LJ() {
                C304790Bx7.LIZ.getClass();
                return C304790Bx7.LIZ() != 0;
            }

            @Override // X.InterfaceC799690VYp
            public final long LJFF() {
                return ((Number) C072Z.LIZLLL.getValue()).longValue();
            }

            @Override // X.InterfaceC799690VYp
            public final long LJI() {
                return ((Number) C1789906zh.LIZLLL.getValue()).longValue();
            }

            @Override // X.InterfaceC799690VYp
            public final int LJIIIIZZ() {
                return ((Number) C0CD2.LJJLIIIJILLIZJL.getValue()).intValue();
            }

            @Override // X.InterfaceC799690VYp
            public final boolean LJIIIZ() {
                return ((Boolean) C0CD2.LJJLIIIJJIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC799690VYp
            public final IBootFinishTaskConfig LJIIJ() {
                IPerformanceExperimentApi iPerformanceExperimentApi = (IPerformanceExperimentApi) PluggableExtentionKt.pluggableSpi$default(IPerformanceExperimentApi.class, false, false, false, 14, null);
                if (iPerformanceExperimentApi == null || !iPerformanceExperimentApi.LIZIZ()) {
                    return null;
                }
                return (IBootFinishTaskConfig) PluggableExtentionKt.pluggableSpi$default(IBootFinishTaskConfig.class, false, false, false, 14, null);
            }

            @Override // X.InterfaceC799690VYp
            public final boolean LJIIJJI() {
                return ((Boolean) C0CCJ.LJIIIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC799690VYp
            public final boolean LJIIL() {
                return ((Boolean) C0CCJ.LJFF.getValue()).booleanValue();
            }

            @Override // X.InterfaceC799690VYp
            public final boolean LJIILIIL() {
                return ((Boolean) C0CD2.LJJZZI.getValue()).booleanValue();
            }

            @Override // X.InterfaceC799690VYp
            public final boolean LJIILL() {
                return ((Boolean) C0CD2.LJJLIIIIJ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC799690VYp
            public final long LJIILLIIL() {
                return ((Number) C1789906zh.LJ.getValue()).longValue();
            }

            @Override // X.InterfaceC799690VYp
            public final float LJIIZILJ() {
                return ((Number) C072Z.LJ.getValue()).floatValue();
            }

            @Override // X.InterfaceC799690VYp
            public final boolean LJIJ() {
                return ((Boolean) C0CCJ.LJ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC799690VYp
            public final int LJIJI() {
                int iIntValue = ((Number) C0CD2.LJJLIIIJ.getValue()).intValue();
                if (iIntValue != 0) {
                    return iIntValue;
                }
                return 0;
            }

            @Override // X.InterfaceC799690VYp
            public final long LJIJJ() {
                return ((Number) C0CCV.LIZ.getValue()).longValue();
            }

            @Override // X.InterfaceC799690VYp
            public final boolean LJIJJLI() {
                return ((Boolean) C1E21.LJII.getValue()).booleanValue();
            }

            @Override // X.InterfaceC799690VYp
            public final boolean LJIL() {
                return ((Boolean) C0CD2.LJJLIIIJL.getValue()).booleanValue();
            }

            @Override // X.InterfaceC799690VYp
            public final boolean LJJ() {
                return ((Boolean) C0CD2.LJJLIIIJJI.getValue()).booleanValue();
            }

            @Override // X.InterfaceC799690VYp
            public final boolean LJJI() {
                return ((Boolean) C0CCJ.LIZIZ.getValue()).booleanValue();
            }

            public final C0CCY LJJIFFI() {
                return new C0CCY(application, map);
            }

            @Override // X.InterfaceC799690VYp
            public final boolean LJIILJJIL() {
                return C104100aN.LIZ().isNewUser();
            }

            @Override // X.InterfaceC799690VYp
            public final Context context() {
                return application;
            }

            @Override // X.InterfaceC799690VYp
            public final EnumC799870VZh LJII(C0CCZ c0ccz) {
                EnumC799870VZh enumC799870VZhType = c0ccz.type();
                if (enumC799870VZhType.equals(EnumC799870VZh.BOOT_FINISH)) {
                    if (C0CBQ.LIZIZ(c0ccz.key())) {
                        return EnumC799870VZh.IDLE;
                    }
                    String strKey = c0ccz.key();
                    try {
                        if (C1940507it.LIZ() != null) {
                            if (C1940507it.LIZ().contains(strKey)) {
                                return EnumC799870VZh.APP_BACKGROUND;
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                return enumC799870VZhType;
            }
        };
        c799900VZk.getClass();
        C799900VZk.LJFF = r0;
        C799900VZk.LJ = application;
        C0VZX.LIZ = Integer.valueOf(r0.LJJIFFI().LIZ());
        for (EnumC799980VZs enumC799980VZs : EnumC799980VZs.values()) {
            HashMap<EnumC799980VZs, InterfaceC800100Va4> map2 = C799900VZk.LJIIIIZZ;
            switch (C799920VZm.LIZ[enumC799980VZs.ordinal()]) {
                case 1:
                    backgroundTriggerV2 = new AbstractC799790VYz() { // from class: X.0VZ1
                        @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
                        public final void LJFF() {
                        }

                        @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
                        public final void LJI() {
                        }

                        @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
                        public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
                            super.LIZ(interfaceC800080Va2);
                            C799900VZk c799900VZk2 = C799900VZk.LIZ;
                            c799900VZk2.getClass();
                            C799880VZi c799880VZi = C799900VZk.LIZIZ;
                            C0CCZ c0cczLIZJ = c799880VZi.LIZJ(EnumC799870VZh.MAIN);
                            if (c0cczLIZJ != null) {
                                c799900VZk2.getClass();
                                c799880VZi.LJ(c0cczLIZJ);
                            }
                        }
                    };
                    break;
                case 2:
                    C799900VZk.LIZ.getClass();
                    int iLJIIIIZZ = C799900VZk.LJFF().LJIIIIZZ();
                    if (iLJIIIIZZ != 2) {
                        if (iLJIIIIZZ != 3) {
                            if (iLJIIIIZZ != 4) {
                                if (iLJIIIIZZ != 5) {
                                    if (iLJIIIIZZ != 6) {
                                        if (iLJIIIIZZ != 8) {
                                            if (iLJIIIIZZ != 66) {
                                                backgroundTriggerV2 = new C799620VYi();
                                            } else {
                                                backgroundTriggerV2 = new BackgroundTriggerV66();
                                            }
                                        } else {
                                            backgroundTriggerV2 = new BackgroundTriggerV8();
                                        }
                                    } else {
                                        backgroundTriggerV2 = new BackgroundTriggerV6();
                                    }
                                } else {
                                    backgroundTriggerV2 = new BackgroundTriggerV5();
                                }
                            } else {
                                backgroundTriggerV2 = new BackgroundTriggerV4();
                            }
                        } else {
                            backgroundTriggerV2 = new BackgroundTriggerV3();
                        }
                    } else {
                        backgroundTriggerV2 = new BackgroundTriggerV2();
                    }
                    break;
                case 3:
                    C799900VZk.LIZ.getClass();
                    if (C799900VZk.LJFF().LJJ()) {
                        backgroundTriggerV2 = new C0VZB();
                    } else {
                        backgroundTriggerV2 = new C0VZ9();
                    }
                    break;
                case 4:
                    backgroundTriggerV2 = new C799700VYq();
                    break;
                case 5:
                    C799900VZk.LIZ.getClass();
                    if (C799900VZk.LJFF().LJIIIZ()) {
                        backgroundTriggerV2 = new C0VZ2();
                    } else {
                        backgroundTriggerV2 = new C799670VYn();
                    }
                    break;
                case 6:
                    backgroundTriggerV2 = new C0VZ8();
                    break;
                case 7:
                    C799900VZk.LIZ.getClass();
                    if (C799900VZk.LJFF().LJIL()) {
                        backgroundTriggerV2 = new C0VZF();
                    } else {
                        backgroundTriggerV2 = new C799730VYt();
                    }
                    break;
                case 8:
                    backgroundTriggerV2 = new AbstractC800120Va6() { // from class: X.0Va1
                        @Override // X.InterfaceC800100Va4
                        public final void LIZ(final InterfaceC800080Va2 interfaceC800080Va2) {
                            C799570VYd.LJ(C0CO3.P0).execute(new Runnable() { // from class: X.0VZy
                                public final void LIZ() {
                                    C0CO3 c0co3Type = ((InterfaceC800130Va7) interfaceC800080Va2).type();
                                    C799900VZk.LIZ.getClass();
                                    C799900VZk.LIZJ.LIZ(c0co3Type, (InterfaceC800130Va7) interfaceC800080Va2);
                                    ExecutorService executorServiceLJ = C799570VYd.LJ(C0CO3.P0);
                                    final InterfaceC800080Va2 interfaceC800080Va22 = interfaceC800080Va2;
                                    executorServiceLJ.execute(new Runnable() { // from class: X.0Va0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("ReqP0Trigger@724b.commit$1$1");
                                            try {
                                                C799900VZk.LIZ.getClass();
                                                C799900VZk.LIZJ.LIZLLL((InterfaceC800130Va7) interfaceC800080Va22, C0CP9.LIZIZ());
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("ReqP0Trigger@724b.commit$1$1");
                                        }
                                    });
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("ReqP0Trigger@724b.commit$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("ReqP0Trigger@724b.commit$1");
                                }
                            });
                        }
                    };
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    backgroundTriggerV2 = new AbstractC800120Va6() { // from class: X.0VZw
                        @Override // X.InterfaceC800100Va4
                        public final void LIZ(final InterfaceC800080Va2 interfaceC800080Va2) {
                            C799570VYd.LJ(C0CO3.P0).execute(new Runnable() { // from class: X.0VZx
                                public final void LIZ() {
                                    C0CO3 c0co3Type = ((InterfaceC800130Va7) interfaceC800080Va2).type();
                                    C799900VZk.LIZ.getClass();
                                    C799900VZk.LIZJ.LIZ(c0co3Type, (InterfaceC800130Va7) interfaceC800080Va2);
                                    ExecutorService executorServiceLJ = C799570VYd.LJ(C0CO3.NORMAL);
                                    final InterfaceC800080Va2 interfaceC800080Va22 = interfaceC800080Va2;
                                    executorServiceLJ.execute(new Runnable() { // from class: X.0VZz
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("ReqNormalTrigger@4bbe.commit$1$1");
                                            try {
                                                C799900VZk.LIZ.getClass();
                                                C799900VZk.LIZJ.LIZLLL((InterfaceC800130Va7) interfaceC800080Va22, C0CP9.LIZIZ());
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("ReqNormalTrigger@4bbe.commit$1$1");
                                        }
                                    });
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("ReqNormalTrigger@4bbe.commit$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("ReqNormalTrigger@4bbe.commit$1");
                                }
                            });
                        }
                    };
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    backgroundTriggerV2 = new C799950VZp();
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    backgroundTriggerV2 = new C799960VZq();
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    backgroundTriggerV2 = new InterfaceC800100Va4() { // from class: X.0VZb
                        public final C799800VZa LL = new ThreadLocal<List<String>>() { // from class: X.0VZa
                            @Override // java.lang.ThreadLocal
                            public final List<String> initialValue() {
                                return new ArrayList();
                            }
                        };

                        @Override // X.InterfaceC800100Va4
                        public final void LJFF() {
                        }

                        @Override // X.InterfaceC800100Va4
                        public final void LJI() {
                        }

                        @Override // X.InterfaceC800100Va4
                        public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
                            Handler handlerLIZIZ;
                            ArrayList<String> arrayList = new ArrayList(get());
                            List<String> list = get();
                            if (list != null) {
                                list.clear();
                            }
                            C799900VZk.LIZ.getClass();
                            if (C799900VZk.LJFF().LJIILIIL()) {
                                handlerLIZIZ = C799570VYd.LIZJ();
                            } else {
                                handlerLIZIZ = C799570VYd.LIZIZ();
                            }
                            for (final String str : arrayList) {
                                C786410Ut5.LJJZZIII(handlerLIZIZ, new Runnable() { // from class: X.0VZd
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("InflateTrigger@a2af.commit$1");
                                        try {
                                            C799900VZk.LIZ.getClass();
                                            C799900VZk.LIZLLL.LIZIZ(str);
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("InflateTrigger@a2af.commit$1");
                                    }
                                });
                            }
                        }

                        @Override // X.InterfaceC800100Va4
                        public final InterfaceC800080Va2 LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
                            Object objLIZIZ;
                            C799900VZk.LIZ.getClass();
                            C799820VZc c799820VZc = C799900VZk.LIZLLL;
                            String strKey = interfaceC800080Va2.key();
                            synchronized (c799820VZc.LIZIZ) {
                                try {
                                    objLIZIZ = ((ConcurrentHashMap) c799820VZc.LIZIZ).get(strKey);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            if (objLIZIZ == null) {
                                objLIZIZ = c799820VZc.LIZIZ(strKey);
                            }
                            return (InterfaceC800080Va2) objLIZIZ;
                        }

                        @Override // X.InterfaceC800100Va4
                        public final void LIZJ(InterfaceC800080Va2 interfaceC800080Va2) {
                            String strKey = interfaceC800080Va2.key();
                            C799900VZk c799900VZk2 = C799900VZk.LIZ;
                            c799900VZk2.getClass();
                            C799820VZc c799820VZc = C799900VZk.LIZLLL;
                            if (((ConcurrentHashMap) c799820VZc.LIZIZ).containsKey(strKey)) {
                                return;
                            }
                            c799900VZk2.getClass();
                            c799820VZc.LIZ(strKey, (InterfaceC799850VZf) interfaceC800080Va2);
                            List<String> list = get();
                            if (list != null) {
                                list.add(strKey);
                            }
                        }
                    };
                    break;
                default:
                    throw new IllegalArgumentException("uncorrect trigger type, please check");
            }
            map2.put(enumC799980VZs, backgroundTriggerV2);
        }
        Context context = C799900VZk.LJ;
        Context context2 = null;
        if (context == null) {
            context = null;
        }
        ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0VZu
            public int LL;
            public boolean LLILLJJLI;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                if (!this.LLILLJJLI) {
                    this.LLILLJJLI = true;
                    C20508081q.LIZ(C786410Ut5.v2(), new ARunnableS92S0000000_13(2));
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                int i = this.LL + 1;
                this.LL = i;
                if (i == 1) {
                    C799900VZk c799900VZk2 = C799900VZk.LIZ;
                    EnumC799980VZs enumC799980VZs2 = EnumC799980VZs.TASK_APP_BACKGROUND;
                    c799900VZk2.getClass();
                    InterfaceC800100Va4 interfaceC800100Va4 = C799900VZk.LJIIIIZZ.get(enumC799980VZs2);
                    if (interfaceC800100Va4 != null) {
                        interfaceC800100Va4.LJI();
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                int i = this.LL - 1;
                this.LL = i;
                if (i == 0) {
                    C799900VZk c799900VZk2 = C799900VZk.LIZ;
                    EnumC799980VZs enumC799980VZs2 = EnumC799980VZs.TASK_APP_BACKGROUND;
                    c799900VZk2.getClass();
                    InterfaceC800100Va4 interfaceC800100Va4 = C799900VZk.LJIIIIZZ.get(enumC799980VZs2);
                    if (interfaceC800100Va4 != null) {
                        interfaceC800100Va4.LJFF();
                    }
                }
            }
        });
        C799880VZi c799880VZi = C799900VZk.LIZIZ;
        Context context3 = C799900VZk.LJ;
        if (context3 == null) {
            context3 = null;
        }
        c799880VZi.LIZ = context3;
        for (EnumC799870VZh enumC799870VZh : EnumC799870VZh.values()) {
            ((ConcurrentHashMap) c799880VZi.LIZIZ).put(enumC799870VZh, new ArrayList());
            ((ConcurrentHashMap) c799880VZi.LIZJ).put(enumC799870VZh, new ArrayList());
        }
        C799910VZl c799910VZl = C799900VZk.LIZJ;
        Context context4 = C799900VZk.LJ;
        if (context4 == null) {
            context4 = null;
        }
        c799910VZl.LIZ = context4;
        for (C0CO3 c0co3 : C0CO3.values()) {
            ((HashMap) c799910VZl.LIZIZ).put(c0co3, new ArrayList());
        }
        final C799820VZc c799820VZc = C799900VZk.LIZLLL;
        Context context5 = C799900VZk.LJ;
        if (context5 != null) {
            context2 = context5;
        }
        c799820VZc.LIZ = context2;
        ((Application) context2).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0VZW
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                ((HashMap) c799820VZc.LIZLLL).remove(activity.getClass());
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                ((HashMap) c799820VZc.LIZLLL).put(activity.getClass(), new WeakReference(activity));
            }
        });
        long j = C256240A2k.LIZ;
        long j2 = C256240A2k.LIZIZ;
        C799650VYl.LIZJ = j;
        C799650VYl.LIZLLL = j2;
        C799840VZe c799840VZe = new C799840VZe();
        ((ArrayList) c799840VZe.LIZ).add(new C146H(new C146G<C146F>() { // from class: X.1465
            @Override // X.C146G
            public final void onCommit() {
            }

            @Override // X.C146G
            public final void LIZ(C146F c146f) {
                C1150504el.LIZ().LIZLLL(c146f.LIZIZ, false);
                if (a0.LJJIIZI(c146f.LIZIZ, "inflate_", false) && ((Boolean) C2187891Ajz.LJIILIIL.getValue()).booleanValue()) {
                    C799900VZk.LIZ.getClass();
                    if (!C0CP9.LIZ() && !Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                        C2187801Ajq.LJ();
                    }
                }
                EnumC799870VZh enumC799870VZh2 = c146f.LIZ;
                EnumC799870VZh enumC799870VZh3 = EnumC799870VZh.BOOT_FINISH;
                if (enumC799870VZh2 != enumC799870VZh3 && enumC799870VZh2 != EnumC799870VZh.IDLE) {
                    C08TN.LIZ().LJIIL();
                    C08TN.LIZ().LJJJJI(c146f.LIZIZ);
                    C08TN.LIZ().LJIILL(c146f.LIZIZ);
                    C08TN.LIZ().LJIIZILJ(c146f.LIZIZ);
                }
                if (c146f.LIZ == enumC799870VZh3) {
                    if (((Boolean) C1246604uG.LIZIZ.getValue()).booleanValue()) {
                        JatoXL.setPriority(((Number) C1246604uG.LIZJ.getValue()).intValue());
                    }
                    if (((Boolean) C1214404p4.LIZIZ.getValue()).booleanValue()) {
                        CpusetManager.bindLittleCore();
                    }
                    AnonymousClass1464 anonymousClass1464LIZ = AnonymousClass1464.LIZ();
                    String str = c146f.LIZIZ;
                    synchronized (anonymousClass1464LIZ) {
                        IPerformanceExperimentApi iPerformanceExperimentApi = AnonymousClass1464.LJI;
                        if (iPerformanceExperimentApi != null && iPerformanceExperimentApi.LIZIZ()) {
                            if (anonymousClass1464LIZ.LIZLLL || anonymousClass1464LIZ.LJ) {
                                ConcurrentHashMap<String, Long> concurrentHashMap = AnonymousClass1468.LIZ;
                                if (!concurrentHashMap.containsKey(str)) {
                                    concurrentHashMap.put(str, Long.valueOf(SystemClock.uptimeMillis()));
                                    AnonymousClass1468.LIZIZ.put(str, Long.valueOf(SystemClock.currentThreadTimeMillis()));
                                }
                            }
                            return;
                        }
                        if (anonymousClass1464LIZ.LIZLLL && !((ConcurrentHashMap) anonymousClass1464LIZ.LIZIZ).containsKey(str)) {
                            ((ConcurrentHashMap) anonymousClass1464LIZ.LIZIZ).put(str, Long.valueOf(SystemClock.uptimeMillis()));
                            Map<String, Long> map3 = anonymousClass1464LIZ.LIZIZ;
                            StringBuilder sbLIZ21 = C2188811AlT.LIZ();
                            sbLIZ21.append("coordinate:");
                            sbLIZ21.append(str);
                            ((ConcurrentHashMap) map3).put(C2188811AlT.LIZIZ(sbLIZ21), Long.valueOf(SystemClock.uptimeMillis() - C202094145s.LJIILL));
                        }
                        if (anonymousClass1464LIZ.LJ && !((ConcurrentHashMap) anonymousClass1464LIZ.LIZJ).containsKey(str)) {
                            ((ConcurrentHashMap) anonymousClass1464LIZ.LIZJ).put(str, new C202100145y(SystemClock.uptimeMillis(), -1L, C786410Ut5.u3().getName()));
                            Map<String, C202100145y> map4 = anonymousClass1464LIZ.LIZJ;
                            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                            sbLIZ22.append("(cpu)");
                            sbLIZ22.append(str);
                            ((ConcurrentHashMap) map4).put(C2188811AlT.LIZIZ(sbLIZ22), new C202100145y(SystemClock.currentThreadTimeMillis(), -1L, C786410Ut5.u3().getName()));
                        }
                    }
                }
            }

            @Override // X.C146G
            public final void LIZIZ(C146F c146f) {
                C202100145y c202100145y;
                C1150504el.LIZ().LJI(c146f.LIZIZ, false);
                if (a0.LJJIIZI(c146f.LIZIZ, "inflate_", false) && ((Boolean) C2187891Ajz.LJIILIIL.getValue()).booleanValue()) {
                    C799900VZk.LIZ.getClass();
                    if (!C0CP9.LIZ() && !Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                        C2187801Ajq.LJFF();
                    }
                }
                EnumC799870VZh enumC799870VZh2 = c146f.LIZ;
                EnumC799870VZh enumC799870VZh3 = EnumC799870VZh.BOOT_FINISH;
                if (enumC799870VZh2 != enumC799870VZh3 && enumC799870VZh2 != EnumC799870VZh.IDLE) {
                    C08TN.LIZ().LJJJJIZL(c146f.LIZIZ);
                }
                if (c146f.LIZ == enumC799870VZh3) {
                    AnonymousClass1464 anonymousClass1464LIZ = AnonymousClass1464.LIZ();
                    String str = c146f.LIZIZ;
                    synchronized (anonymousClass1464LIZ) {
                        IPerformanceExperimentApi iPerformanceExperimentApi = AnonymousClass1464.LJI;
                        if (iPerformanceExperimentApi != null && iPerformanceExperimentApi.LIZIZ()) {
                            if (anonymousClass1464LIZ.LIZLLL || anonymousClass1464LIZ.LJ) {
                                AnonymousClass1468.LIZ(str);
                            }
                            return;
                        }
                        if (!anonymousClass1464LIZ.LIZLLL || ((ConcurrentHashMap) anonymousClass1464LIZ.LIZIZ).containsKey(str)) {
                            Long l = (Long) ((ConcurrentHashMap) anonymousClass1464LIZ.LIZIZ).get(str);
                            if (l != null) {
                                ((ConcurrentHashMap) anonymousClass1464LIZ.LIZIZ).put(str, Long.valueOf(SystemClock.uptimeMillis() - l.longValue()));
                            }
                            if (((ConcurrentHashMap) anonymousClass1464LIZ.LIZIZ).size() >= 10 && ((iPerformanceExperimentApi == null || !iPerformanceExperimentApi.LIZIZ()) && anonymousClass1464LIZ.LIZLLL)) {
                                anonymousClass1464LIZ.LIZ.execute(new ARunnableS102S0100000_2(anonymousClass1464LIZ, 70));
                            }
                        }
                        if (anonymousClass1464LIZ.LJ && (c202100145y = (C202100145y) ((ConcurrentHashMap) anonymousClass1464LIZ.LIZJ).get(str)) != null && c202100145y.LIZIZ == -1) {
                            long j3 = c202100145y.LIZ;
                            c202100145y.LIZIZ = SystemClock.uptimeMillis() - j3;
                            long j4 = j3 - C202094145s.LJII;
                            c202100145y.LIZ = j4;
                            Map<String, C202100145y> map3 = anonymousClass1464LIZ.LIZJ;
                            StringBuilder sbLIZ21 = C2188811AlT.LIZ();
                            sbLIZ21.append("(cpu)");
                            sbLIZ21.append(str);
                            C202100145y c202100145y2 = (C202100145y) ((ConcurrentHashMap) map3).get(C2188811AlT.LIZIZ(sbLIZ21));
                            if (c202100145y2 != null) {
                                c202100145y2.LIZIZ = SystemClock.currentThreadTimeMillis() - c202100145y2.LIZ;
                                c202100145y2.LIZ = j4;
                            }
                        }
                    }
                }
            }
        }));
        if (C0BEC.LJI(C1BWL.LIZ()) && C08Q0.LJ(C1BWL.LIZ(), "bootfinish_migrate_phase_one", false)) {
            ((ArrayList) c799840VZe.LIZ).add(new InterfaceC799860VZg() { // from class: X.0Wha
                @Override // X.InterfaceC799860VZg
                public final void LIZJ(InterfaceC800080Va2 interfaceC800080Va2) {
                }

                @Override // X.InterfaceC799860VZg
                public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
                    if (interfaceC800080Va2.key().equals("BootFinishTaskProvider")) {
                        C0VY3.LIZIZ("LegoInitializer", AFwS225S0000000_34.get$arr$(268));
                    }
                }

                @Override // X.InterfaceC799860VZg
                public final void LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
                    if (interfaceC800080Va2.key().equals("BootFinishTaskProvider")) {
                        C0VY3.LIZIZ("LegoInitializer", AFwS225S0000000_34.get$arr$(267));
                    }
                }
            });
        }
        C799900VZk.LIZ.getClass();
        C799900VZk.LJI = c799840VZe;
        if (((Boolean) C0CD2.LJJIIZ.getValue()).booleanValue()) {
            if (C2456309jt.LIZ()) {
                BootFinishHandler.LL.init();
            }
        } else if (!C104100aN.LIZ().isNewUser()) {
            BootFinishHandler.LL.init();
        }
    }
}
