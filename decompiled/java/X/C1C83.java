package X;

import com.bytedance.otis.protos.CPUInfo;
import com.bytedance.otis.protos.RunnableInfo;
import com.bytedance.otis.protos.ThreadInfo;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C83, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C83 extends Message.Builder<CPUInfo, C1C83> {
    public List<ThreadInfo> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<RunnableInfo> LJ = C1516540pZE.LJIIIIZZ();
    public Long LJFF;
    public Long LJI;
    public Integer LJII;
    public Long LJIIIIZZ;
    public Long LJIIIZ;
    public Integer LJIIJ;
    public Integer LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CPUInfo build() {
        return new CPUInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
    }
}
