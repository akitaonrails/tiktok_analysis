package X;

import com.bytedance.otis.protos.BackgroundTask;
import com.bytedance.otis.protos.BackgroundTaskInfo;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C3V, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3V extends Message.Builder<BackgroundTask, C1C3V> {
    public String LIZLLL;
    public List<BackgroundTaskInfo> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BackgroundTask build() {
        return new BackgroundTask(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
