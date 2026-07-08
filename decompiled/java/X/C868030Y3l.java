package X;

import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868030Y3l extends Message.Builder<UpsertConversationSettingExtInfoRequestBody, C868030Y3l> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Map<String, String> LJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpsertConversationSettingExtInfoRequestBody build() {
        return new UpsertConversationSettingExtInfoRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
