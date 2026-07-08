package X;

import com.bytedance.im.core.proto.GetMediaStatusResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CGU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CGU extends Message.Builder<GetMediaStatusResponseBody.MediaStatusInfo, C1CGU> {
    public EnumC870720YDu LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMediaStatusResponseBody.MediaStatusInfo build() {
        return new GetMediaStatusResponseBody.MediaStatusInfo(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
