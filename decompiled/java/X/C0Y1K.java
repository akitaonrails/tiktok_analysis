package X;

import com.bytedance.im.core.proto.ConversationParticipantsListRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y1K, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y1K extends Message.Builder<ConversationParticipantsListRequestBody, C0Y1K> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;
    public Integer LJII;
    public Map<String, String> LJIIIIZZ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationParticipantsListRequestBody build() {
        return new ConversationParticipantsListRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
