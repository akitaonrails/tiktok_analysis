package X;

import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YV4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YV4 extends Message.Builder<SetConversationCoreInfoResponseBody, C0YV4> {
    public ConversationCoreInfo LIZLLL;
    public Integer LJ;
    public String LJFF;
    public Long LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SetConversationCoreInfoResponseBody build() {
        return new SetConversationCoreInfoResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
