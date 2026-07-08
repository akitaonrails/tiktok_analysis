package X;

import com.bytedance.im.core.proto.PullMarkMessageRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251851DBv extends Message.Builder<PullMarkMessageRequestBody, C2251851DBv> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public Boolean LJIIIIZZ;
    public EnumC2244831Ctd LJIIIZ;
    public Long LJIIJ;
    public Boolean LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PullMarkMessageRequestBody build() {
        return new PullMarkMessageRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
    }
}
