package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.CreateConversationV2ResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875450YVz extends Message.Builder<CreateConversationV2ResponseBody, C875450YVz> {
    public ConversationInfoV2 LIZLLL;
    public Long LJ;
    public String LJFF;
    public String LJI;
    public Integer LJII;
    public Boolean LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CreateConversationV2ResponseBody build() {
        return new CreateConversationV2ResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
