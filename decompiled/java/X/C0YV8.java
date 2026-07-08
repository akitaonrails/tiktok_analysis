package X;

import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YV8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YV8 extends Message.Builder<UpsertConversationCoreExtInfoResponseBody, C0YV8> {
    public ConversationCoreInfo LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public String LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpsertConversationCoreExtInfoResponseBody build() {
        return new UpsertConversationCoreExtInfoResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
