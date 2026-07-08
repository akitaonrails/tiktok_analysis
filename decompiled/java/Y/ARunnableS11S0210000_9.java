package Y;

import X.C098200Yq;
import X.C0N5E;
import X.C0ND9;
import X.C1150504el;
import X.C12ES;
import X.C1483410ohn;
import X.C15O7;
import X.C163E;
import X.C189200o6;
import X.C1913420ztM;
import X.C19719612Di;
import X.C1C7U;
import X.C1E9C;
import X.C5183020f;
import X.C590200NCw;
import X.InterfaceC1209780haS;
import X.InterfaceC585880MyQ;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS11S0210000_9 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String aid = ((Aweme) this.l0).getAid();
        if (aid == null) {
            return;
        }
        C0ND9 c0nd9 = ((C163E) this.l1).LJIILIIL.get(aid);
        if (c0nd9 != null) {
            boolean z = this.z2;
            c0nd9.LIZIZ = Long.valueOf(System.currentTimeMillis());
            c0nd9.LIZJ = Boolean.valueOf(z);
        }
        ((C163E) this.l1).LJIIIZ.remove(aid);
        ((C163E) this.l1).LJIIJ.add(aid);
        if (this.z2) {
            ((C163E) this.l1).LJIIJJI.remove(aid);
        } else {
            ((C163E) this.l1).LJIIJJI.add(aid);
        }
        List<WeakReference<InterfaceC585880MyQ>> list = ((C163E) this.l1).LJI.get(aid);
        if (list != null) {
            Iterator<WeakReference<InterfaceC585880MyQ>> it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC585880MyQ interfaceC585880MyQ = it2.next().get();
                if (interfaceC585880MyQ != null) {
                    interfaceC585880MyQ.LIZ(aid);
                }
            }
        }
        ((C163E) this.l1).LJI.remove(aid);
        if (C1E9C.LIZ()) {
            C0N5E c0n5eLJIIJJI = ((C163E) this.l1).LJIIJJI();
            Aweme aweme = (Aweme) this.l0;
            if (c0n5eLJIIJJI.LIZIZ()) {
                C19719612Di.LJJIIJ(c0n5eLJIIJJI.LIZIZ, new C5183020f(aweme, 4), true);
            } else {
                c0n5eLJIIJJI.LIZ.remove(aweme);
            }
        }
        ((C163E) this.l1).LJIILLIIL(false);
    }

    public final void LIZ$1() {
        try {
            ((Function0) this.l0).invoke();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if ((this.z2 || jElapsedRealtime - ((C590200NCw) this.l1).LJFF >= ((C590200NCw) this.l1).LIZ) && ((C590200NCw) this.l1).LIZIZ.invoke().booleanValue()) {
                ((C590200NCw) this.l1).LJFF = jElapsedRealtime;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$3() {
        /*
            Method dump skipped, instruction units count: 1349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS11S0210000_9.LIZ$3():void");
    }

    public final void LIZ$2() {
        if (!C1150504el.LIZ().LJIIIZ("feed_video_preload_method_end_to_prepare")) {
            C1150504el.LIZ().LJI("feed_video_preload_method_end_to_prepare", false);
        }
        boolean z = this.z2;
        Aweme aweme = (Aweme) this.l0;
        C1913420ztM c1913420ztM = (C1913420ztM) this.l1;
        try {
            if (z) {
                C1483410ohn.LJLJJI().LJJLIIIJILLIZJL(aweme, c1913420ztM);
            } else {
                C1483410ohn.LJLJJI().LJJLIIIJLJLI(aweme, c1913420ztM);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void run$0(ARunnableS11S0210000_9 aRunnableS11S0210000_9) {
        boolean zLIZ;
        C1C7U.LIZ("TranslationPrefetchTaskManagerImpl@2e5a.finishOngoingTranslation$1");
        try {
            aRunnableS11S0210000_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TranslationPrefetchTaskManagerImpl@2e5a.finishOngoingTranslation$1");
    }

    public static final void run$1(ARunnableS11S0210000_9 aRunnableS11S0210000_9) {
        boolean zLIZ;
        C1C7U.LIZ("BaseDetailShareVM@b9a6.bindView$loadMoreOnSuccess$1$1$1");
        try {
            ((InterfaceC1209780haS) aRunnableS11S0210000_9.l0).Pj((List) aRunnableS11S0210000_9.l1, aRunnableS11S0210000_9.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseDetailShareVM@b9a6.bindView$loadMoreOnSuccess$1$1$1");
    }

    public static final void run$2(ARunnableS11S0210000_9 aRunnableS11S0210000_9) {
        boolean zLIZ;
        C1C7U.LIZ("PersistentQueueFlushManager@4a27.enqueue$1");
        try {
            aRunnableS11S0210000_9.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PersistentQueueFlushManager@4a27.enqueue$1");
    }

    public static final void run$3(ARunnableS11S0210000_9 aRunnableS11S0210000_9) {
        boolean zLIZ;
        C1C7U.LIZ("PreloadHelper@3004.preloadVideoImpl$2$runnable$1");
        try {
            aRunnableS11S0210000_9.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadHelper@3004.preloadVideoImpl$2$runnable$1");
    }

    public static final void run$4(ARunnableS11S0210000_9 aRunnableS11S0210000_9) {
        boolean zLIZ;
        C1C7U.LIZ("PreloadHelper@3004.preloadVideoImpl$2");
        try {
            ARunnableS11S0210000_9 aRunnableS11S0210000_92 = new ARunnableS11S0210000_9((Aweme) aRunnableS11S0210000_9.l0, (C1913420ztM) aRunnableS11S0210000_9.l1, aRunnableS11S0210000_9.z2, 3);
            if (C12ES.LJIIL()) {
                aRunnableS11S0210000_92.run();
            } else {
                C15O7.LJIIIIZZ.execute(aRunnableS11S0210000_92);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadHelper@3004.preloadVideoImpl$2");
    }

    public static final void run$5(ARunnableS11S0210000_9 aRunnableS11S0210000_9) {
        boolean zLIZ;
        C1C7U.LIZ("HighRecScoreCacheHelper@347b.pickVideoLogic$1$1$2$1");
        try {
            aRunnableS11S0210000_9.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HighRecScoreCacheHelper@347b.pickVideoLogic$1$1$2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS11S0210000_9(Object obj, InterfaceC1209780haS interfaceC1209780haS, List<? extends Aweme> list, boolean z) {
        this.$t = z ? 1 : 0;
        this.l0 = obj;
        this.l1 = interfaceC1209780haS;
        this.z2 = list;
    }
}
