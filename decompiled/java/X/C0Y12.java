package X;

import com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y12, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y12 extends Message.Builder<UpdateConversationParticipantRequestBody, C0Y12> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;
    public Integer LJII;
    public String LJIIIIZZ;
    public Boolean LJIIIZ;
    public String LJIIJ;
    public Map<String, String> LJIIJJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateConversationParticipantRequestBody build() {
        return new UpdateConversationParticipantRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
    }
}
