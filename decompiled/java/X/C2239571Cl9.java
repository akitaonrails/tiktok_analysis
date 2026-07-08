package X;

import com.bytedance.im.core.proto.ConversationMessage;
import com.bytedance.im.core.proto.MessageByInitResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Cl9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239571Cl9 extends Message.Builder<MessageByInitResponseBody, C2239571Cl9> {
    public List<ConversationMessage> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessageByInitResponseBody build() {
        Boolean bool = this.LJ;
        if (bool != null && this.LJFF != null) {
            return new MessageByInitResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "has_more", this.LJFF, "next_init_version");
        throw null;
    }
}
