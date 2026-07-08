package X;

import com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0Y7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869010Y7f extends Message.Builder<MessagesPerUserInitV2RequestBody, C869010Y7f> {
    public Long LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public Boolean LJI;
    public List<String> LJII = C1516540pZE.LJIIIIZZ();
    public Long LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerUserInitV2RequestBody build() {
        return new MessagesPerUserInitV2RequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
