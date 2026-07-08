package X;

import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Cid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238011Cid extends Message.Builder<GetMessageInfoByIndexV2RequestBody, C2238011Cid> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public List<Long> LJI = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageInfoByIndexV2RequestBody build() {
        return new GetMessageInfoByIndexV2RequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
