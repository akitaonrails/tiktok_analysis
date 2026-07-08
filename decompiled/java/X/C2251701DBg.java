package X;

import com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251701DBg extends Message.Builder<GetMessagesCheckInfoInConversationRequestBody, C2251701DBg> {
    public Long LIZLLL;
    public String LJ;
    public Integer LJFF;
    public Long LJI;
    public Long LJII;
    public Integer LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessagesCheckInfoInConversationRequestBody build() {
        return new GetMessagesCheckInfoInConversationRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
