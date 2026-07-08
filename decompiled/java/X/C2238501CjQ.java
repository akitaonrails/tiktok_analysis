package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.StrangerNewMessageNotify;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238501CjQ extends Message.Builder<StrangerNewMessageNotify, C2238501CjQ> {
    public MessageBody LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final StrangerNewMessageNotify build() {
        return new StrangerNewMessageNotify(this.LIZLLL, buildUnknownFields());
    }
}
