package X;

import com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CKF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CKF extends Message.Builder<MarkMsgGetUnreadCountRequestBody, C1CKF> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Boolean LJI;
    public List<Long> LJII = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkMsgGetUnreadCountRequestBody build() {
        return new MarkMsgGetUnreadCountRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
