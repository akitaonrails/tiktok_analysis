package X;

import com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody;
import com.bytedance.im.core.proto.SecUidPair;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1DBG, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DBG extends Message.Builder<ConversationAddParticipantsResponseBody, C1DBG> {
    public Integer LJFF;
    public String LJI;
    public Long LJII;
    public String LJIIIIZZ;
    public List<Long> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<Long> LJ = C1516540pZE.LJIIIIZZ();
    public List<SecUidPair> LJIIIZ = C1516540pZE.LJIIIIZZ();
    public List<SecUidPair> LJIIJ = C1516540pZE.LJIIIIZZ();
    public Map<String, String> LJIIJJI = new LinkedHashMap();
    public Map<String, String> LJIIL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationAddParticipantsResponseBody build() {
        return new ConversationAddParticipantsResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
    }
}
