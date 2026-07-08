package X;

import com.bytedance.im.core.proto.RecallMessageRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Y3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867920Y3a extends Message.Builder<RecallMessageRequestBody, C867920Y3a> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;
    public Integer LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RecallMessageRequestBody build() {
        return new RecallMessageRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
