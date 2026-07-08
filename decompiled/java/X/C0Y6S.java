package X;

import com.bytedance.im.core.proto.GetUserConversationListRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0Y6S, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y6S extends Message.Builder<GetUserConversationListRequestBody, C0Y6S> {
    public C0Y6U LIZLLL;
    public Long LJ;
    public EnumC869400Y8s LJFF;
    public Long LJI;
    public Integer LJII;
    public Integer LJIIIIZZ;
    public Boolean LJIIIZ;
    public Boolean LJIIJ;
    public Integer LJIIJJI;
    public List<Integer> LJIIL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetUserConversationListRequestBody build() {
        return new GetUserConversationListRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
    }
}
