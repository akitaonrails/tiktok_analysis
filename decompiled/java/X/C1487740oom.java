package X;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0oom, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487740oom {
    public C822650WOx LIZ;

    public C1487740oom(C1487790oor c1487790oor) {
        int i = c1487790oor.LIZJ;
        int i2 = c1487790oor.LIZLLL;
        if (C1487750oon.LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TaskThreadPool initThreadPool coreTaskPoolSize ");
            sbLIZ.append(i);
            sbLIZ.append(", maxTaskPoolSize ");
            sbLIZ.append(i2);
            C1487750oon.LIZ("MediaLogger", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ = new C822650WOx(i, i2, 60L, TimeUnit.SECONDS, new PriorityBlockingQueue());
    }
}
