package X;

import com.bytedance.im.core.proto.GetMessagesCheckInfoV2RequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872970YMl extends Message.Builder<GetMessagesCheckInfoV2RequestBody, C872970YMl> {
    public Long LIZLLL;
    public String LJ;
    public EnumC869400Y8s LJFF;
    public Long LJI;
    public Integer LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessagesCheckInfoV2RequestBody build() {
        return new GetMessagesCheckInfoV2RequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
