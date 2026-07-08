package X;

import com.bytedance.im.core.proto.im_biz_ext.SettingExtField;
import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889650YvD extends Message.Builder<SettingExtField, C889650YvD> {
    public Integer LIZLLL;
    public ByteString LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SettingExtField build() {
        return new SettingExtField(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
