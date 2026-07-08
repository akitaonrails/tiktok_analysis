package X;

import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230621CSe extends Message.Builder<ParticipantReadIndex, C2230621CSe> {
    public Long LIZLLL;
    public String LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ParticipantReadIndex build() {
        return new ParticipantReadIndex(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
