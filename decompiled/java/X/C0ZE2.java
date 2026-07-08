package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.SendMessageResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0ZE2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZE2 extends Message.Builder<SendMessageResponseBody, C0ZE2> {
    public Long LIZLLL;
    public String LJ;
    public Integer LJFF;
    public String LJI;
    public Long LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public Boolean LJIIJ;
    public String LJIIJJI;
    public ConversationInfoV2 LJIIL;
    public EnumC895750ZCb LJIILIIL;
    public C0ZCX LJIILJJIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SendMessageResponseBody build() {
        return new SendMessageResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, buildUnknownFields());
    }
}
