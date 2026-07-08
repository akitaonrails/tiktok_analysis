package X;

import com.bytedance.im.core.proto.GetMessageByIdRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Y88, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y88 extends Message.Builder<GetMessageByIdRequestBody, C0Y88> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageByIdRequestBody build() {
        return new GetMessageByIdRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
