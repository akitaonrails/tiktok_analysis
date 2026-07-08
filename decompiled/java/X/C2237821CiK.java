package X;

import com.bytedance.im.core.proto.ClientACKRequestBody;
import com.bytedance.im.core.proto.ClientBatchACKRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237821CiK extends Message.Builder<ClientBatchACKRequestBody, C2237821CiK> {
    public List<ClientACKRequestBody> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ClientBatchACKRequestBody build() {
        return new ClientBatchACKRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
