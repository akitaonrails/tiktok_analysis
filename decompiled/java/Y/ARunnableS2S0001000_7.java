package Y;

import X.C0J3X;
import X.C0J3Y;
import X.C1C7U;
import X.C2188811AlT;
import X.C519110KXl;
import X.InterfaceC519130KXn;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule.LiveTaskScheduleTuneScene;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS2S0001000_7 implements Runnable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f282i0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ConcurrentHashMap<Integer, C0J3X> concurrentHashMap = C0J3Y.LJ;
        C0J3X c0j3x = concurrentHashMap.get(Integer.valueOf(this.f282i0));
        if (c0j3x == null || c0j3x.LJII) {
            concurrentHashMap.remove(Integer.valueOf(this.f282i0));
            return;
        }
        c0j3x.LJIIIIZZ = true;
        C0J3Y.LIZ.getClass();
        c0j3x.LJI = C0J3Y.LJIIIZ(c0j3x);
        C0J3Y.LIZLLL(this.f282i0, c0j3x);
    }

    public static final void run$0(ARunnableS2S0001000_7 aRunnableS2S0001000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveTaskScheduleTuneScene@7d16.removeBlockSceneTag$1");
        try {
            LiveTaskScheduleTuneScene liveTaskScheduleTuneScene = LiveTaskScheduleTuneScene.LIZ;
            LiveTaskScheduleTuneScene.LIZJ(aRunnableS2S0001000_7.f282i0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeBlockSceneTag: remove postBlockIdleScene ");
            C519110KXl c519110KXl = InterfaceC519130KXn.LJFF;
            int i = aRunnableS2S0001000_7.f282i0;
            c519110KXl.getClass();
            sbLIZ.append(C519110KXl.LIZ(i));
            C2188811AlT.LIZIZ(sbLIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveTaskScheduleTuneScene@7d16.removeBlockSceneTag$1");
    }

    public static final void run$1(ARunnableS2S0001000_7 aRunnableS2S0001000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LayoutPreloadManager@a384.doPreload$2");
        try {
            aRunnableS2S0001000_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LayoutPreloadManager@a384.doPreload$2");
    }

    public ARunnableS2S0001000_7(int i, int i2) {
        this.$t = i2;
        this.f282i0 = i;
    }
}
