package X;

import com.bytedance.im.core.proto.ParticipantMinIndex;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CSc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230601CSc extends Message.Builder<ParticipantMinIndex, C2230601CSc> {
    public Long LIZLLL;
    public String LJ;
    public Long LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ParticipantMinIndex build() {
        return new ParticipantMinIndex(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
