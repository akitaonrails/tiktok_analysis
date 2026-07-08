package X;

import com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868010Y3j extends Message.Builder<UpsertConversationCoreExtInfoRequestBody, C868010Y3j> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Map<String, String> LJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpsertConversationCoreExtInfoRequestBody build() {
        return new UpsertConversationCoreExtInfoRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
