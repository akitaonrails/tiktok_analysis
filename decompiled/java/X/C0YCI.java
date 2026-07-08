package X;

import com.bytedance.im.core.proto.MediaMeta;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YCI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YCI extends Message.Builder<MediaMeta, C0YCI> {
    public Integer LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public String LJII;
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MediaMeta build() {
        return new MediaMeta(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
