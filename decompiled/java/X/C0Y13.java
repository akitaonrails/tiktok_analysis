package X;

import com.bytedance.im.core.proto.MarkConversationReadRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Y13, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y13 extends Message.Builder<MarkConversationReadRequestBody, C0Y13> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public Long LJIIIZ;
    public Integer LJIIJ;
    public String LJIIJJI;
    public Long LJIIL;
    public Integer LJIILIIL;
    public EnumC868460Y5c LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public Integer LJIIZILJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkConversationReadRequestBody build() {
        return new MarkConversationReadRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, buildUnknownFields());
    }
}
