package X;

import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YV2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YV2 extends Message.Builder<SetConversationSettingInfoResponseBody, C0YV2> {
    public ConversationSettingInfo LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public String LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SetConversationSettingInfoResponseBody build() {
        return new SetConversationSettingInfoResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
