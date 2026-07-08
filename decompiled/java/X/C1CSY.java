package X;

import com.bytedance.im.core.proto.BroadcastUserInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CSY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CSY extends Message.Builder<BroadcastUserInfo, C1CSY> {
    public Long LIZLLL;
    public Integer LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BroadcastUserInfo build() {
        return new BroadcastUserInfo(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
