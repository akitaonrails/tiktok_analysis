package X;

import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBW, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DBW extends Message.Builder<GetMessageInfoByIndexV2RangeRequestBody, C1DBW> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public EnumC873090YMx LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageInfoByIndexV2RangeRequestBody build() {
        Long l = this.LJI;
        if (l != null && this.LJII != null) {
            return new GetMessageInfoByIndexV2RangeRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "min_index_in_conversation_v2", this.LJII, "max_index_in_conversation_v2");
        throw null;
    }
}
