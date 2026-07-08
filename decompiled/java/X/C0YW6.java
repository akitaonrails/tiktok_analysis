package X;

import com.bytedance.im.core.proto.GetMessagesCheckInfoV2ResponseBody;
import com.bytedance.im.core.proto.MessageCheckInfoV2;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YW6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YW6 extends Message.Builder<GetMessagesCheckInfoV2ResponseBody, C0YW6> {
    public List<MessageCheckInfoV2> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;
    public Boolean LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessagesCheckInfoV2ResponseBody build() {
        return new GetMessagesCheckInfoV2ResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
