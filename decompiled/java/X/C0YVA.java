package X;

import com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0YVA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YVA extends Message.Builder<GetMessageInfoByIndexV2ResponseBody, C0YVA> {
    public Map<Long, MessageInfo> LIZLLL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageInfoByIndexV2ResponseBody build() {
        return new GetMessageInfoByIndexV2ResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
