package X;

import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YV6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YV6 extends Message.Builder<UpsertConversationSettingExtInfoResponseBody, C0YV6> {
    public ConversationSettingInfo LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public String LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpsertConversationSettingExtInfoResponseBody build() {
        return new UpsertConversationSettingExtInfoResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
