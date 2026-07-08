package X;

import com.bytedance.im.core.proto.PropertyItem;
import com.bytedance.im.core.proto.PropertyItemList;
import com.bytedance.im.core.proto.UrlStruct;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YVV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YVV extends Message.Builder<PropertyItemList, C0YVV> {
    public List<PropertyItem> LIZLLL = C1516540pZE.LJIIIIZZ();
    public UrlStruct LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PropertyItemList build() {
        return new PropertyItemList(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
