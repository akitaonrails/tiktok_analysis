package X;

import com.bytedance.im.core.proto.MuteBadgeCountInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CBV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBV extends Message.Builder<MuteBadgeCountInfo, C1CBV> {
    public EnumC19361710ox LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MuteBadgeCountInfo build() {
        EnumC19361710ox enumC19361710ox = this.LIZLLL;
        if (enumC19361710ox != null && this.LJ != null) {
            return new MuteBadgeCountInfo(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC19361710ox, "message_type", this.LJ, "badge_count");
        throw null;
    }
}
