package X;

import com.bytedance.geckox.statistic.model.SyncEventModel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0qV5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552410qV5 {
    public C1551530qTf LIZ;
    public long LIZIZ;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public final boolean LIZ(int i, int i2, long j) {
        SyncEventModel syncEventModel = new SyncEventModel(this.LIZ);
        syncEventModel.setSyncTaskId(i);
        syncEventModel.setSyncTaskType(i2);
        if (j < this.LIZIZ) {
            syncEventModel.setSyncStatsType(2);
            C1551780qU4.LJIIJJI(syncEventModel);
            return true;
        }
        if (!C797990VSb.LIZ.LJIIIZ()) {
            syncEventModel.setSyncStatsType(2);
            C1551780qU4.LJIIJJI(syncEventModel);
            return true;
        }
        if (this.LIZJ.get() && this.LIZ != null) {
            syncEventModel.setSyncStatsType(1);
            C1551780qU4.LJIIJJI(syncEventModel);
            return false;
        }
        syncEventModel.setSyncStatsType(2);
        C1551780qU4.LJIIJJI(syncEventModel);
        return true;
    }
}
