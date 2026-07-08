package X;

import com.bytedance.im.core.proto.PrefetchConversationIdResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YS3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YS3 extends Message.Builder<PrefetchConversationIdResponseBody, C0YS3> {
    public List<Long> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Integer LJ;
    public Integer LJFF;
    public EnumC868900Y6u LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PrefetchConversationIdResponseBody build() {
        return new PrefetchConversationIdResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
