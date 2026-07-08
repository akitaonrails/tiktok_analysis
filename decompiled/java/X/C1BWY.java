package X;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.os.Bundle;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BWY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BWY {
    public static final C1BWY LIZ = new C1BWY();

    public static void LIZ(final Application application, AppBuildConfig appBuildConfig) {
        C0X35.LIZ("application_injectapplication_appmonitor", false);
        appBuildConfig.LIZ();
        C1BWZ.LIZ.getClass();
        C2206151BWb c2206151BWb = C1BWZ.LIZIZ;
        C0JHB.LIZ = application;
        C0JHB.LIZIZ = false;
        C2214291BlT.LIZ.getClass();
        C2214291BlT.LIZIZ = application;
        C2180271AUn.LIZIZ.getClass();
        final C2214241BlO c2214241BlO = (C2214241BlO) C1807670x8n.LJJIJ();
        SAFExtensionKt.LJIJI(new InterfaceC2214261BlQ(c2214241BlO, application) { // from class: X.1BlN
            public final C2214241BlO LIZ;
            public final Application LIZIZ;
            public final LinkedList<AbstractC1387200mCc> LIZJ;
            public int LIZLLL;

            @Override // X.InterfaceC2214261BlQ
            public final void LIZIZ(AbstractC1387200mCc abstractC1387200mCc) {
                C2180271AUn.LIZIZ.getClass();
                ((C2214241BlO) C1807670x8n.LJJIJ()).LIZ = null;
                this.LIZ.LJIILIIL.LLILLL.onNext(abstractC1387200mCc);
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LIZJ(AbstractC1387200mCc abstractC1387200mCc) {
                C2180271AUn.LIZIZ.getClass();
                ((C2214241BlO) C1807670x8n.LJJIJ()).LIZ = new WeakReference<>(abstractC1387200mCc);
                this.LIZ.LJIIJ.LLILLL.onNext(abstractC1387200mCc);
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LIZLLL(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZ.LJIILLIIL.LLILLL.onNext(abstractC1387200mCc);
                int i = this.LIZLLL - 1;
                this.LIZLLL = i;
                if (i != 0) {
                    return;
                }
                this.LIZ.LJJII.LLILLL.onNext(new C606810Nr5(abstractC1387200mCc, true));
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJ(AbstractC1387200mCc abstractC1387200mCc) {
                int size;
                LinkedList<AbstractC1387200mCc> linkedList = this.LIZJ;
                synchronized (linkedList) {
                    try {
                        linkedList.remove(abstractC1387200mCc);
                        size = linkedList.size();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                this.LIZ.LJJ.LLILLL.onNext(abstractC1387200mCc);
                if (((Boolean) C07AD.LIZIZ.getValue()).booleanValue()) {
                    if (size == 0) {
                        C2214221BlM<Application> c2214221BlM = this.LIZ.LJJIII;
                        Application application2 = this.LIZIZ;
                        C11PR<Application> c11pr = c2214221BlM.LLILLL;
                        if (application2 != null) {
                            c11pr.onNext(application2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (this.LIZLLL != 0) {
                    return;
                }
                C2214221BlM<Application> c2214221BlM2 = this.LIZ.LJJIII;
                Application application3 = this.LIZIZ;
                C11PR<Application> c11pr2 = c2214221BlM2.LLILLL;
                if (application3 == null) {
                    return;
                }
                c11pr2.onNext(application3);
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJFF(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZ.LJIL.LLILLL.onNext(abstractC1387200mCc);
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJII(AbstractC1387200mCc abstractC1387200mCc) {
                LinkedList<AbstractC1387200mCc> linkedList = this.LIZJ;
                synchronized (linkedList) {
                    try {
                        if (Intrinsics.LJFF(linkedList.getLast(), abstractC1387200mCc)) {
                            linkedList.removeLast();
                        } else {
                            linkedList.remove(abstractC1387200mCc);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                this.LIZ.LJIJ.LLILLL.onNext(abstractC1387200mCc);
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIIIIZZ(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZ.LJIILJJIL.LLILLL.onNext(abstractC1387200mCc);
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIIIZ(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZ.LJIIIIZZ.LLILLL.onNext(abstractC1387200mCc);
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIIJJI(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZ.LJIIL.LLILLL.onNext(abstractC1387200mCc);
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIILJJIL(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZ.LJII.LLILLL.onNext(abstractC1387200mCc);
                int i = this.LIZLLL + 1;
                this.LIZLLL = i;
                if (i != 1) {
                    return;
                }
                C2214221BlM<C606810Nr5> c2214221BlM = this.LIZ.LJJII;
                c2214221BlM.LLILLL.onNext(new C606810Nr5(abstractC1387200mCc, false));
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIILL(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZ.LJIIJJI.LLILLL.onNext(abstractC1387200mCc);
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIJI(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZ.LJJI.LLILLL.onNext(abstractC1387200mCc);
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIJJ(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZ.LJI.LLILLL.onNext(abstractC1387200mCc);
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIJJLI(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZ.LJIIZILJ.LLILLL.onNext(abstractC1387200mCc);
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIL(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZ.LJIILL.LLILLL.onNext(abstractC1387200mCc);
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJJ(AbstractC1387200mCc abstractC1387200mCc) {
                this.LIZ.LJIIIZ.LLILLL.onNext(abstractC1387200mCc);
            }

            {
                this.LIZ = c2214241BlO;
                this.LIZIZ = application;
                this.LIZJ = c2214241BlO.LIZIZ;
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJI(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                C2214221BlM<C813430VvZ> c2214221BlM = this.LIZ.LJIJJ;
                c2214221BlM.LLILLL.onNext(new C813430VvZ(abstractC1387200mCc, bundle));
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIIJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                C2214221BlM<C813430VvZ> c2214221BlM = this.LIZ.LIZJ;
                c2214221BlM.LLILLL.onNext(new C813430VvZ(abstractC1387200mCc, bundle));
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                LinkedList<AbstractC1387200mCc> linkedList = this.LIZJ;
                synchronized (linkedList) {
                    try {
                        linkedList.addLast(abstractC1387200mCc);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                C2214221BlM<C813430VvZ> c2214221BlM = this.LIZ.LJFF;
                c2214221BlM.LLILLL.onNext(new C813430VvZ(abstractC1387200mCc, bundle));
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIILIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                C2214221BlM<C813430VvZ> c2214221BlM = this.LIZ.LJ;
                c2214221BlM.LLILLL.onNext(new C813430VvZ(abstractC1387200mCc, bundle));
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIILLIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                C2214221BlM<C813430VvZ> c2214221BlM = this.LIZ.LJIJI;
                c2214221BlM.LLILLL.onNext(new C813430VvZ(abstractC1387200mCc, bundle));
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIIZILJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                LinkedList<AbstractC1387200mCc> linkedList = this.LIZJ;
                synchronized (linkedList) {
                    try {
                        linkedList.addLast(abstractC1387200mCc);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                C2214221BlM<C813430VvZ> c2214221BlM = this.LIZ.LIZLLL;
                c2214221BlM.LLILLL.onNext(new C813430VvZ(abstractC1387200mCc, bundle));
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                C2214221BlM<C813430VvZ> c2214221BlM = this.LIZ.LJIJJLI;
                c2214221BlM.LLILLL.onNext(new C813430VvZ(abstractC1387200mCc, bundle));
            }
        });
        AbstractC1906590ziL abstractC1906590ziL = C1523190pjx.LIZ;
        abstractC1906590ziL.LJIIIZ().LJLLLLLL(new C09JN() { // from class: X.0ziN
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$1");
                AbstractC1387200mCc abstractC1387200mCc = ((C813430VvZ) obj).LIZ;
                C1523190pjx.LIZ(abstractC1387200mCc, "created");
                if (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) {
                    C1906580ziK.LIZ = true;
                }
                C1C7U.LIZIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$1");
            }
        });
        abstractC1906590ziL.LJIILJJIL().LJLLLLLL(new C09JN() { // from class: X.0pk1
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$2");
                C1523190pjx.LIZ((AbstractC1387200mCc) obj, "started");
                C1C7U.LIZIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$2");
            }
        });
        abstractC1906590ziL.LJIIJ().LJLLLLLL(new C09JN() { // from class: X.0pk2
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$3");
                C1523190pjx.LIZ((AbstractC1387200mCc) obj, "resumed");
                C1C7U.LIZIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$3");
            }
        });
        abstractC1906590ziL.LIZIZ().LJLLLLLL(new C09JN() { // from class: X.0pjz
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$4");
                C1523190pjx.LIZ((AbstractC1387200mCc) obj, "paused");
                C1C7U.LIZIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$4");
            }
        });
        abstractC1906590ziL.LJI().LJLLLLLL(new C09JN() { // from class: X.0pjy
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$5");
                C1523190pjx.LIZ((AbstractC1387200mCc) obj, "stopped");
                C1C7U.LIZIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$5");
            }
        });
        abstractC1906590ziL.LIZ().LJLLLLLL(new C09JN() { // from class: X.0pjw
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$6");
                boolean z = ((C606810Nr5) obj).LIZIZ;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (z) {
                    C1523190pjx.LIZIZ.add(new C1523170pjv(jCurrentTimeMillis, "enterBackground"));
                } else {
                    if (C1906580ziK.LIZIZ <= 0) {
                        C1906580ziK.LIZIZ = jCurrentTimeMillis;
                    }
                    C1523190pjx.LIZIZ.add(new C1523170pjv(jCurrentTimeMillis, "enterForeground"));
                }
                C1C7U.LIZIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$6");
            }
        });
        abstractC1906590ziL.LJII().LJLLLLLL(new C09JN() { // from class: X.0ziM
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$7");
                AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) obj;
                C1523190pjx.LIZ(abstractC1387200mCc, "destroyed");
                if (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) {
                    C1906580ziK.LIZ = false;
                }
                C1C7U.LIZIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$7");
            }
        });
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0pjt
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$8");
                try {
                    Npth.addAttachUserData(new AttachUserData() { // from class: X.0pju
                        @Override // com.bytedance.crash.AttachUserData
                        public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                            return C2097908Jt.LIZJ(new Pair("RootPageMonitor", C13LP.LJJLIIIJ(C1523190pjx.LIZIZ, "\n", null, null, 0, null, null, 62)));
                        }
                    }, CrashType.ALL);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("EmbeddedMonitorKt@917d.attachEmbeddedEvents$8");
            }
        });
        C1878330yyl c1878330yyl = c2214241BlO.LJJIIJ;
        if (c1878330yyl == null) {
            synchronized (c2214241BlO) {
                c1878330yyl = c2214241BlO.LJJIIJ;
                if (c1878330yyl == null) {
                    c1878330yyl = new C1878330yyl();
                    c2214241BlO.LJJIIJ = c1878330yyl;
                }
            }
        }
        Object obj = c1878330yyl.LL;
        if (Intrinsics.LJFF(obj, C1610310s0T.LIZ)) {
            obj = null;
        }
        InterfaceC2206161BWc interfaceC2206161BWc = (InterfaceC2206161BWc) obj;
        if (interfaceC2206161BWc != null) {
            interfaceC2206161BWc.LIZ();
        }
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.1BlJ
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) throws Throwable {
                String strLJJIJIIJIL;
                StringBuilder sb = new StringBuilder();
                ComponentName componentName = activity.getComponentName();
                if (componentName != null) {
                    strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrgbPfwGvwTDvIyWIqDQ7BYcxxWuw==", null));
                } else {
                    strLJJIJIIJIL = null;
                }
                sb.append(strLJJIJIIJIL);
                sb.append(" destroyed.");
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("@ActivityMonitor", sb.toString());
                ComponentName componentName2 = activity.getComponentName();
                if (componentName2 != null) {
                    C2204961BRm.LJJIJIIJIL(componentName2, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrgbPfwGvwTDvIyWIqDQ7BYcxxWuw==", null));
                }
                if (activity instanceof C08B7) {
                    C2214201BlK.LJIIL = false;
                }
                C2214201BlK.LJI.onNext(activity);
                if (C2214201BlK.LJIILIIL == 0) {
                    C2214201BlK.LJIIIZ.onNext(application);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) throws Throwable {
                String strLJJIJIIJIL;
                StringBuilder sb = new StringBuilder();
                ComponentName componentName = activity.getComponentName();
                if (componentName != null) {
                    strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrgbPfwGvwTDvIyWIqDQ7BYcxxWuw==", null));
                } else {
                    strLJJIJIIJIL = null;
                }
                sb.append(strLJJIJIIJIL);
                sb.append(" paused.");
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("@ActivityMonitor", sb.toString());
                ComponentName componentName2 = activity.getComponentName();
                if (componentName2 != null) {
                    C2204961BRm.LJJIJIIJIL(componentName2, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrgbPfwGvwTDvIyWIqDQ7BYcxxWuw==", null));
                }
                InterfaceC2206171BWd interfaceC2206171BWd = C2214201BlK.LJIJ;
                if (interfaceC2206171BWd != null && interfaceC2206171BWd.LIZ(activity)) {
                    C2214201BlK.LJI(null);
                }
                C2214201BlK.LJ.onNext(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) throws Throwable {
                String strLJJIJIIJIL;
                if (C2345409Gy.LIZ()) {
                    C2345409Gy.LIZIZ(new RunnableC2345109Gv(0, activity, this));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                ComponentName componentName = activity.getComponentName();
                if (componentName != null) {
                    strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrgbPfwGvwTDvIyWIqDQ7BYcxxWuw==", null));
                } else {
                    strLJJIJIIJIL = null;
                }
                sb.append(strLJJIJIIJIL);
                sb.append(" resumed.");
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("@ActivityMonitor", sb.toString());
                ComponentName componentName2 = activity.getComponentName();
                if (componentName2 != null) {
                    C2204961BRm.LJJIJIIJIL(componentName2, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrgbPfwGvwTDvIyWIqDQ7BYcxxWuw==", null));
                }
                InterfaceC2206171BWd interfaceC2206171BWd = C2214201BlK.LJIJ;
                if (interfaceC2206171BWd != null && interfaceC2206171BWd.LIZ(activity)) {
                    C2214201BlK.LJI(activity);
                }
                C2214201BlK.LIZLLL.onNext(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) throws Throwable {
                StringBuilder sb = new StringBuilder();
                ComponentName componentName = activity.getComponentName();
                String strLJJIJIIJIL = null;
                if (componentName != null) {
                    strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrgbPfwGvwTDvIyWIqDQ7BYcxxWuw==", null));
                }
                sb.append(strLJJIJIIJIL);
                sb.append(" started.");
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("@ActivityMonitor", sb.toString());
                int i = C2214201BlK.LJIILIIL + 1;
                C2214201BlK.LJIILIIL = i;
                if (i == 1) {
                    C2214201BlK.LJIILLIIL = System.currentTimeMillis();
                    if (C2214201BlK.LJIILJJIL <= 0) {
                        C2214201BlK.LJIILJJIL = C2214201BlK.LJIILLIIL;
                    }
                    if (C2213981Bky.LIZIZ.LJ() <= 0 || C2214201BlK.LJIIZILJ <= 2 || C2214201BlK.LJIIJJI) {
                        C2214201BlK.LJIIJJI = false;
                        C2180271AUn.LIZIZ.getClass();
                        ((C2214241BlO) C1807670x8n.LJJIJ()).LJJIFFI.LLILLL.onNext(Boolean.valueOf(C2214201BlK.LJIIJJI));
                        C2214201BlK.LJIIIIZZ.onNext(Boolean.valueOf(C2214201BlK.LJIIJJI));
                        C2214201BlK.LJIIJ.onNext(new C1567000qsc(activity, C2214201BlK.LJIIJJI));
                    }
                }
                C2214201BlK.LIZJ.onNext(activity);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onActivityStopped(android.app.Activity r6) throws java.lang.Throwable {
                /*
                    r5 = this;
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    android.content.ComponentName r1 = r6.getComponentName()
                    java.lang.String r3 = "dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrgbPfwGvwTDvIyWIqDQ7BYcxxWuw=="
                    r2 = 0
                    if (r1 == 0) goto La7
                    X.0WZX r0 = new X.0WZX
                    r0.<init>(r3, r2)
                    java.lang.String r0 = X.C2204961BRm.LJJIJIIJIL(r1, r0)
                L17:
                    r4.append(r0)
                    java.lang.String r0 = " stopped."
                    r4.append(r0)
                    java.lang.String r1 = r4.toString()
                    java.lang.String r0 = "@ActivityMonitor"
                    com.ss.android.agilelogger.ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(r0, r1)
                    android.content.ComponentName r1 = r6.getComponentName()
                    if (r1 == 0) goto L36
                    X.0WZX r0 = new X.0WZX
                    r0.<init>(r3, r2)
                    X.C2204961BRm.LJJIJIIJIL(r1, r0)
                L36:
                    int r0 = X.C2214201BlK.LJIILIIL
                    int r0 = r0 + (-1)
                    X.C2214201BlK.LJIILIIL = r0
                    if (r0 != 0) goto L6e
                    long r0 = java.lang.System.currentTimeMillis()
                    X.C2214201BlK.LJIILL = r0
                    X.1Bky r4 = X.C2213981Bky.LIZIZ
                    int r0 = r4.LJ()
                    r2 = 1
                    if (r0 <= 0) goto L74
                    int r0 = X.C2214201BlK.LJIIZILJ
                    int r1 = r0 + 1
                    X.C2214201BlK.LJIIZILJ = r1
                    r0 = 2
                    if (r1 <= r0) goto L74
                    com.bytedance.bpea.transmit.delegate.BPEAHandler r3 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
                    android.os.Looper r0 = android.os.Looper.getMainLooper()
                    r3.<init>(r0)
                    Y.ARunnableS134S0100000_34 r2 = new Y.ARunnableS134S0100000_34
                    r0 = 80
                    r2.<init>(r6, r0)
                    int r0 = r4.LJ()
                    long r0 = (long) r0
                    X.C786410Ut5.LJLIIL(r0, r3, r2)
                L6e:
                    X.11RK<android.app.Activity> r0 = X.C2214201BlK.LJFF
                    r0.onNext(r6)
                    return
                L74:
                    X.C2214201BlK.LJIIJJI = r2
                    X.1AUn r0 = X.C2180271AUn.LIZIZ
                    r0.getClass()
                    java.lang.Object r0 = X.C1807670x8n.LJJIJ()
                    X.1BlO r0 = (X.C2214241BlO) r0
                    X.1BlM<java.lang.Boolean> r0 = r0.LJJIFFI
                    X.11PR<T> r1 = r0.LLILLL
                    boolean r0 = X.C2214201BlK.LJIIJJI
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    r1.onNext(r0)
                    X.11RK<java.lang.Boolean> r1 = X.C2214201BlK.LJIIIIZZ
                    boolean r0 = X.C2214201BlK.LJIIJJI
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    r1.onNext(r0)
                    X.11RK<X.0qsc> r2 = X.C2214201BlK.LJIIJ
                    X.0qsc r1 = new X.0qsc
                    boolean r0 = X.C2214201BlK.LJIIJJI
                    r1.<init>(r6, r0)
                    r2.onNext(r1)
                    goto L6e
                La7:
                    r0 = r2
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2214191BlJ.onActivityStopped(android.app.Activity):void");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
                String strLJJIJIIJIL;
                StringBuilder sb = new StringBuilder();
                ComponentName componentName = activity.getComponentName();
                if (componentName != null) {
                    strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrgbPfwGvwTDvIyWIqDQ7BYcxxWuw==", null));
                } else {
                    strLJJIJIIJIL = null;
                }
                sb.append(strLJJIJIIJIL);
                sb.append(" created.");
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("@ActivityMonitor", sb.toString());
                ComponentName componentName2 = activity.getComponentName();
                if (componentName2 != null) {
                    C2204961BRm.LJJIJIIJIL(componentName2, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrgbPfwGvwTDvIyWIqDQ7BYcxxWuw==", null));
                }
                if (activity instanceof C08B7) {
                    C2214201BlK.LJIIL = true;
                }
                C2214201BlK.LIZIZ.onNext(new C0X4A(activity, bundle));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPreCreated(Activity activity, Bundle bundle) {
                C2214201BlK.LIZ.onNext(new C0X4A(activity, bundle));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                C2214201BlK.LJII.onNext(new C0X4A(activity, bundle));
            }
        });
        C2214201BlK.LJIJ = c2206151BWb;
        C0X35.LJIIJJI("application_injectapplication_appmonitor", false);
    }
}
