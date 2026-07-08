package X;

import com.bytedance.im.core.proto.status_message.MarkConversationReadValue;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876220YYy extends Message.Builder<MarkConversationReadValue, C876220YYy> {
    public Long LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public EnumC868460Y5c LJI;
    public String LJII;
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkConversationReadValue build() {
        return new MarkConversationReadValue(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
