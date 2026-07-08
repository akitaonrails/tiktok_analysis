package X;

import com.bytedance.im.core.proto.status_message.RecallMessageValue;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CCF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CCF extends Message.Builder<RecallMessageValue, C1CCF> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RecallMessageValue build() {
        return new RecallMessageValue(this.LIZLLL, buildUnknownFields());
    }
}
