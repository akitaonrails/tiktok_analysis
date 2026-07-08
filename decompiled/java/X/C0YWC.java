package X;

import com.bytedance.im.core.proto.status_message.PropertyItem;
import com.bytedance.im.core.proto.status_message.PropertyItemList;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YWC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YWC extends Message.Builder<PropertyItemList, C0YWC> {
    public List<PropertyItem> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PropertyItemList build() {
        return new PropertyItemList(this.LIZLLL, buildUnknownFields());
    }
}
