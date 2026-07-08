package X;

import com.bytedance.im.core.proto.GetMediaStatusRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Yay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877100Yay extends Message.Builder<GetMediaStatusRequestBody.MediaKey, C877100Yay> {
    public EnumC870720YDu LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMediaStatusRequestBody.MediaKey build() {
        return new GetMediaStatusRequestBody.MediaKey(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
