package X;

import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867430Y1d extends Message.Builder<GetConversationInfoV2RequestBody, C867430Y1d> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Map<String, String> LJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationInfoV2RequestBody build() {
        return new GetConversationInfoV2RequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
