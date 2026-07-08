package X;

import com.bytedance.otis.protos.SceneData;
import com.bytedance.otis.protos.ThreadInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C84, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C84 extends Message.Builder<ThreadInfo, C1C84> {
    public Integer LIZLLL;
    public String LJ;
    public Long LJFF;
    public SceneData LJI;
    public SceneData LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ThreadInfo build() {
        return new ThreadInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
