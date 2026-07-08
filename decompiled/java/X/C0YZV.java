package X;

import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingTransientExt;
import com.bytedance.im.core.proto.im_biz_ext.SettingExtField;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YZV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YZV extends Message.Builder<BizConvSettingTransientExt, C0YZV> {
    public List<SettingExtField> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BizConvSettingTransientExt build() {
        return new BizConvSettingTransientExt(this.LIZLLL, buildUnknownFields());
    }
}
