package X;

import com.bytedance.im.core.proto.MarkMessageRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251831DBt extends Message.Builder<MarkMessageRequestBody, C2251831DBt> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public Boolean LJII;
    public EnumC2244831Ctd LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkMessageRequestBody build() {
        return new MarkMessageRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
    }
}
