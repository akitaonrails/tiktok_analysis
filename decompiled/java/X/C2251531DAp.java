package X;

import com.bytedance.im.core.proto.MessagesCheckInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251531DAp extends Message.Builder<MessagesCheckInfo, C2251531DAp> {
    public Long LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Integer LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesCheckInfo build() {
        return new MessagesCheckInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
