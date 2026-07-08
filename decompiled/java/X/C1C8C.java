package X;

import com.bytedance.otis.protos.DropFrameInfo;
import com.bytedance.otis.protos.SceneData;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C8C, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C8C extends Message.Builder<DropFrameInfo, C1C8C> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Integer LJI;
    public Integer LJII;
    public Integer LJIIIIZZ;
    public Integer LJIIIZ;
    public Integer LJIIJ;
    public SceneData LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DropFrameInfo build() {
        return new DropFrameInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
    }
}
