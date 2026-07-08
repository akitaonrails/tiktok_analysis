package X;

import com.bytedance.im.core.proto.ConversationCheckInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230661CSi extends Message.Builder<ConversationCheckInfo, C2230661CSi> {
    public Long LIZLLL;
    public String LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationCheckInfo build() {
        return new ConversationCheckInfo(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
