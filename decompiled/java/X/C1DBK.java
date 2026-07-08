package X;

import com.bytedance.im.core.proto.BlockConversationRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBK, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DBK extends Message.Builder<BlockConversationRequestBody, C1DBK> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public EnumC868560Y5m LJI;
    public Boolean LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BlockConversationRequestBody build() {
        return new BlockConversationRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
