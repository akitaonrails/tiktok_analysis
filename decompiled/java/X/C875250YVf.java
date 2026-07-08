package X;

import com.bytedance.im.core.proto.status_message.MultiPushModeChangeValue;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875250YVf extends Message.Builder<MultiPushModeChangeValue, C875250YVf> {
    public List<String> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MultiPushModeChangeValue build() {
        return new MultiPushModeChangeValue(this.LIZLLL, buildUnknownFields());
    }
}
