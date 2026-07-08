package X;

import com.bytedance.im.core.proto.MediaMeta;
import com.bytedance.im.core.proto.SendMediaRequest;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YCM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YCM extends Message.Builder<SendMediaRequest, C0YCM> {
    public EnumC870720YDu LIZLLL;
    public String LJ;
    public String LJFF;
    public MediaMeta LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SendMediaRequest build() {
        return new SendMediaRequest(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
