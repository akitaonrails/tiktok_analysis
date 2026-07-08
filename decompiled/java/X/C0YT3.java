package X;

import com.bytedance.im.core.proto.MediaUploadConfig;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YT3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YT3 extends Message.Builder<MediaUploadConfig, C0YT3> {
    public EnumC870720YDu LIZLLL;
    public String LJ;
    public String LJFF;
    public Long LJI;
    public Long LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MediaUploadConfig build() {
        return new MediaUploadConfig(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
    }
}
