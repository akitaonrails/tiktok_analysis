package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YQV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YQV extends Message.Builder<MessagesPerUserInitV2ResponseBody, C0YQV> {
    public Long LJFF;
    public Long LJI;
    public Boolean LJII;
    public C0YQW LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;
    public Long LJIILIIL;
    public List<MessageBody> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<ConversationInfoV2> LJ = C1516540pZE.LJIIIIZZ();
    public List<ByteString> LJIIJJI = C1516540pZE.LJIIIIZZ();
    public Map<Long, Boolean> LJIIL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerUserInitV2ResponseBody build() {
        return new MessagesPerUserInitV2ResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, buildUnknownFields());
    }
}
