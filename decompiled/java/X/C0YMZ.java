package X;

import com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0YMZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YMZ extends Message.Builder<ConversationRemoveParticipantsRequestBody, C0YMZ> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public List<Long> LJI = C1516540pZE.LJIIIIZZ();
    public Map<String, String> LJII = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationRemoveParticipantsRequestBody build() {
        return new ConversationRemoveParticipantsRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
