package X;

import com.bytedance.im.core.proto.im_biz_ext.BizConvCorePersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.ExtField;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YWE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YWE extends Message.Builder<BizConvCorePersistentExt, C0YWE> {
    public List<ExtField> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BizConvCorePersistentExt build() {
        return new BizConvCorePersistentExt(this.LIZLLL, buildUnknownFields());
    }
}
