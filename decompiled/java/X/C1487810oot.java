package X;

import com.ss.android.ugc.aweme.player.sdk.v3.MultimediaThreadPoolConfig;
import com.ss.android.ugc.aweme.player.sdk.v3.MultimediaThreadPoolConfigV2;

/* JADX INFO: renamed from: X.0oot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1487810oot implements InterfaceC1487870ooz {
    public static final C1487790oor LIZ() {
        MultimediaThreadPoolConfig multimediaThreadPoolConfig = (MultimediaThreadPoolConfig) C1474810oTv.L4.getValue();
        C1487800oos c1487800oos = new C1487800oos();
        c1487800oos.LIZ = multimediaThreadPoolConfig.corePoolSize;
        c1487800oos.LIZIZ = multimediaThreadPoolConfig.maxPoolSize;
        c1487800oos.LIZJ = multimediaThreadPoolConfig.vodThreadPriority;
        c1487800oos.LIZLLL = multimediaThreadPoolConfig.liveThreadPriority;
        c1487800oos.LJ = multimediaThreadPoolConfig.coreTaskPoolSize;
        c1487800oos.LJFF = multimediaThreadPoolConfig.maxTaskPoolSize;
        c1487800oos.LJI = multimediaThreadPoolConfig.forceCreateThread;
        c1487800oos.LJII = ((Boolean) C1474810oTv.O4.getValue()).booleanValue();
        return new C1487790oor(c1487800oos);
    }

    public static final C1487840oow LIZIZ() {
        MultimediaThreadPoolConfigV2 multimediaThreadPoolConfigV2 = (MultimediaThreadPoolConfigV2) C1474810oTv.N4.getValue();
        C1487860ooy c1487860ooy = new C1487860ooy();
        c1487860ooy.LIZ = multimediaThreadPoolConfigV2.idleInitCnt;
        c1487860ooy.LIZIZ = multimediaThreadPoolConfigV2.maxIdleSize;
        c1487860ooy.LJ = multimediaThreadPoolConfigV2.vodThreadPriority;
        c1487860ooy.LJFF = multimediaThreadPoolConfigV2.liveThreadPriority;
        c1487860ooy.LJI = multimediaThreadPoolConfigV2.controllerThreadPriority;
        c1487860ooy.LIZJ = multimediaThreadPoolConfigV2.coreTaskPoolSize;
        c1487860ooy.LIZLLL = multimediaThreadPoolConfigV2.maxTaskPoolSize;
        c1487860ooy.LJII = multimediaThreadPoolConfigV2.replenishCount;
        return new C1487840oow(c1487860ooy);
    }
}
