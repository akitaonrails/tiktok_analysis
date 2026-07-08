package X;

import com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBY, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DBY extends Message.Builder<PreviewerMessagesInConversationRequestBody, C1DBY> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public EnumC873090YMx LJI;
    public Long LJII;
    public Integer LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PreviewerMessagesInConversationRequestBody build() {
        return new PreviewerMessagesInConversationRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
