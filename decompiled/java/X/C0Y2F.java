package X;

import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Y2F, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y2F extends Message.Builder<DeleteConversationRequestBody, C0Y2F> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;
    public Long LJII;
    public Integer LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DeleteConversationRequestBody build() {
        return new DeleteConversationRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
