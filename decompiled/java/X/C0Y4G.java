package X;

import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y4G, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y4G extends Message.Builder<ConversationInfoV2, C0Y4G> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public String LJI;
    public ParticipantsPage LJII;
    public Integer LJIIIIZZ;
    public Boolean LJIIIZ;
    public Integer LJIIJ;
    public Integer LJIIJJI;
    public Integer LJIIL;
    public Long LJIILIIL;
    public Long LJIILJJIL;
    public Participant LJIILL;
    public ConversationCoreInfo LJIILLIIL;
    public ConversationSettingInfo LJIIZILJ;
    public ByteString LJIJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationInfoV2 build() {
        return new ConversationInfoV2(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, buildUnknownFields());
    }
}
