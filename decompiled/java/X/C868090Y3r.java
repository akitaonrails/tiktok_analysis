package X;

import com.bytedance.im.core.proto.BatchSetConversationSettingInfoRequestBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0Y3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868090Y3r extends Message.Builder<BatchSetConversationSettingInfoRequestBody, C868090Y3r> {
    public List<SetConversationSettingInfoRequestBody> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchSetConversationSettingInfoRequestBody build() {
        return new BatchSetConversationSettingInfoRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
