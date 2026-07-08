package X;

import com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867990Y3h extends Message.Builder<BatchUpdateConversationParticipantRequestBody, C867990Y3h> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Integer LJII;
    public List<Long> LJI = C1516540pZE.LJIIIIZZ();
    public Map<String, String> LJIIIIZZ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchUpdateConversationParticipantRequestBody build() {
        return new BatchUpdateConversationParticipantRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
