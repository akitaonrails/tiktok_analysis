package X;

import com.bytedance.im.core.proto.im_biz_ext.ExtField;
import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889740YvM extends Message.Builder<ExtField, C889740YvM> {
    public Integer LIZLLL;
    public ByteString LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ExtField build() {
        return new ExtField(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
