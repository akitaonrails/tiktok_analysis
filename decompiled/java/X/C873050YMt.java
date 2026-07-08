package X;

import com.bytedance.im.core.proto.MessageRange;
import com.bytedance.im.core.proto.MessagesInConversationWithRangeRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873050YMt extends Message.Builder<MessagesInConversationWithRangeRequestBody, C873050YMt> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public MessageRange LJI;
    public Integer LJII;
    public EnumC873090YMx LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesInConversationWithRangeRequestBody build() {
        return new MessagesInConversationWithRangeRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
