package X;

import com.bytedance.im.core.proto.status_message.PropertyItemList;
import com.bytedance.im.core.proto.status_message.UpdateMessagePropertyValue;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0YWA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YWA extends Message.Builder<UpdateMessagePropertyValue, C0YWA> {
    public Map<String, String> LIZLLL = new LinkedHashMap();
    public Map<String, PropertyItemList> LJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateMessagePropertyValue build() {
        return new UpdateMessagePropertyValue(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
