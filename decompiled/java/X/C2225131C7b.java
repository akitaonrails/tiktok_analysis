package X;

import com.bytedance.otis.protos.RunnableInfo;
import com.bytedance.otis.protos.SceneData;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225131C7b extends Message.Builder<RunnableInfo, C2225131C7b> {
    public String LIZLLL;
    public String LJ;
    public Long LJFF;
    public SceneData LJI;
    public SceneData LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RunnableInfo build() {
        return new RunnableInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
