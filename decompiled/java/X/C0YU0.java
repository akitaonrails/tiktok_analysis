package X;

import com.bytedance.im.core.proto.MarkConversationReadNotify;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YU0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YU0 extends Message.Builder<MarkConversationReadNotify, C0YU0> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkConversationReadNotify build() {
        return new MarkConversationReadNotify(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
