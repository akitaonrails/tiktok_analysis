package X;

import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868980Y7c extends Message.Builder<MessagesInConversationRequestBody, C868980Y7c> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public EnumC873090YMx LJI;
    public Long LJII;
    public Integer LJIIIIZZ;
    public Map<String, String> LJIIIZ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesInConversationRequestBody build() {
        return new MessagesInConversationRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
