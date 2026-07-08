package X;

import com.bytedance.im.core.proto.BlockMembersResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224801C5u extends Message.Builder<BlockMembersResponseBody, C2224801C5u> {
    public List<Long> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BlockMembersResponseBody build() {
        return new BlockMembersResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
