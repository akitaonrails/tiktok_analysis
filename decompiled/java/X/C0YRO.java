package X;

import com.bytedance.im.core.proto.ConversationCheckInfoV2;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YRO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YRO extends Message.Builder<ConversationCheckInfoV2, C0YRO> {
    public Long LIZLLL;
    public String LJ;
    public EnumC869400Y8s LJFF;
    public Boolean LJI;
    public Long LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationCheckInfoV2 build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJFF != null) {
            return new ConversationCheckInfoV2(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "conv_short_id", this.LJFF, "conv_type");
        throw null;
    }
}
