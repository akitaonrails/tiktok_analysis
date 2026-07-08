package X;

import com.bytedance.im.core.proto.im_biz_ext.BizConvCoreTransientExt;
import com.bytedance.im.core.proto.im_biz_ext.ExtField;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YWG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YWG extends Message.Builder<BizConvCoreTransientExt, C0YWG> {
    public List<ExtField> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BizConvCoreTransientExt build() {
        return new BizConvCoreTransientExt(this.LIZLLL, buildUnknownFields());
    }
}
