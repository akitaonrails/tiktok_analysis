package X;

import com.bytedance.otis.protos.SceneData;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225151C7d extends Message.Builder<SceneData, C2225151C7d> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SceneData build() {
        return new SceneData(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
