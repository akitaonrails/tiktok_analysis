package X;

import com.bytedance.im.core.proto.GetCmdMessageRespBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Cje, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238641Cje extends Message.Builder<GetCmdMessageRespBody, C2238641Cje> {
    public List<MessageBody> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetCmdMessageRespBody build() {
        Boolean bool = this.LJ;
        if (bool != null) {
            return new GetCmdMessageRespBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "has_more");
        throw null;
    }
}
