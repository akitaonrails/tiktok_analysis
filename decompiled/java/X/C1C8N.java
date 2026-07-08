package X;

import com.bytedance.otis.protos.BackgroundTaskInfo;
import com.bytedance.otis.protos.MethodStack;
import com.bytedance.otis.protos.TimeInfo;
import com.bytedance.otis.protos.TimeStampRange;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C8N, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C8N extends Message.Builder<BackgroundTaskInfo, C1C8N> {
    public List<MethodStack> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Long LJ;
    public String LJFF;
    public TimeInfo LJI;
    public String LJII;
    public TimeStampRange LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BackgroundTaskInfo build() {
        return new BackgroundTaskInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
