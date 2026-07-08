package X;

import com.bytedance.im.core.proto.ConversationMessageSearchRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251891DBz extends Message.Builder<ConversationMessageSearchRequestBody, C2251891DBz> {
    public String LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public Integer LJII;
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationMessageSearchRequestBody build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new ConversationMessageSearchRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "search_query", this.LJ, "conv_short_id");
        throw null;
    }
}
