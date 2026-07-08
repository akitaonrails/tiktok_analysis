package X;

import com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0YNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873250YNn extends Message.Builder<ConversationAddParticipantsRequestBody, C873250YNn> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public List<Long> LJI = C1516540pZE.LJIIIIZZ();
    public Map<String, String> LJII = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationAddParticipantsRequestBody build() {
        return new ConversationAddParticipantsRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
