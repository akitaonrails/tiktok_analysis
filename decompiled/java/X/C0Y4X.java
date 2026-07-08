package X;

import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0Y4X, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y4X extends Message.Builder<ParticipantsPage, C0Y4X> {
    public List<Participant> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ParticipantsPage build() {
        return new ParticipantsPage(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
