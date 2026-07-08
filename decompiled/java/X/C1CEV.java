package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.creator_studio_feed_inspiration_v1.proto.InspirationLogPbStructV1;
import com.ss.ugc.tiktok.creator_studio_feed_inspiration_v1.proto.creator_studio_feed_inspiration_v1_response;
import java.util.List;

/* JADX INFO: renamed from: X.1CEV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CEV extends Message.Builder<creator_studio_feed_inspiration_v1_response, C1CEV> {
    public Integer LIZLLL;
    public String LJ;
    public List<C5186020i> LJFF = C1516540pZE.LJIIIIZZ();
    public Integer LJI;
    public InspirationLogPbStructV1 LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final creator_studio_feed_inspiration_v1_response build() {
        return new creator_studio_feed_inspiration_v1_response(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
