package X;

import com.bytedance.im.core.proto.CheckStatusMessagesRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YO7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YO7 extends Message.Builder<CheckStatusMessagesRequestBody, C0YO7> {
    public Integer LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Integer LJI;
    public List<Long> LJII = C1516540pZE.LJIIIIZZ();
    public C0YFV LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CheckStatusMessagesRequestBody build() {
        return new CheckStatusMessagesRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
