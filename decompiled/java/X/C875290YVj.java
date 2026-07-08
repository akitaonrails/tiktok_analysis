package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.StrangerConversation;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0YVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875290YVj extends Message.Builder<StrangerConversation, C875290YVj> {
    public Long LIZLLL;
    public Integer LJ;
    public MessageBody LJFF;
    public String LJI;
    public Integer LJIIIIZZ;
    public List<Participant> LJII = C1516540pZE.LJIIIIZZ();
    public Map<String, String> LJIIIZ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final StrangerConversation build() {
        return new StrangerConversation(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
