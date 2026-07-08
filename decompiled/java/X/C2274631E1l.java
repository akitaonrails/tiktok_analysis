package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MsgTrace;
import com.bytedance.im.core.proto.MuteBadgeCountInfo;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1E1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274631E1l extends Message.Builder<NewMessageNotify, C2274631E1l> {
    public String LIZLLL;
    public Integer LJ;
    public EnumC19361910oz LJFF;
    public MessageBody LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;
    public Long LJIIJJI;
    public Long LJIIL;
    public Long LJIILIIL;
    public Integer LJIILJJIL;
    public MsgTrace LJIILL;
    public ReferenceInfo LJIILLIIL;
    public Long LJIIZILJ;
    public Long LJIJ;
    public Long LJIJI;
    public MuteBadgeCountInfo LJIJJ;
    public String LJIJJLI;
    public Integer LJIL;
    public Long LJJ;
    public C0YFV LJJI;
    public Boolean LJJIFFI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final NewMessageNotify build() {
        return new NewMessageNotify(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, this.LJJ, this.LJJI, this.LJJIFFI, buildUnknownFields());
    }
}
