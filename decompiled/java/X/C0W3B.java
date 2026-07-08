package X;

import com.squareup.wire.Message;
import tiktok.image.proto.ImageHeader;

/* JADX INFO: renamed from: X.0W3B, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W3B extends Message.Builder<ImageHeader, C0W3B> {
    public Integer LIZLLL;
    public String LJ;
    public Integer LJFF;
    public Long LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public Boolean LJIIJ;
    public Boolean LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ImageHeader build() {
        return new ImageHeader(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
    }
}
