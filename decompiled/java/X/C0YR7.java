package X;

import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YR7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YR7 extends Message.Builder<GetMessageInfoByIndexV2RangeResponseBody, C0YR7> {
    public List<MessageInfo> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Long LJ;
    public Boolean LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageInfoByIndexV2RangeResponseBody build() {
        return new GetMessageInfoByIndexV2RangeResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
