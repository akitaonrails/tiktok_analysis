package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.creator_studio_feed_inspiration_v1.proto.creator_studio_feed_inspiration_v1_request;

/* JADX INFO: renamed from: X.1C6O, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C6O extends Message.Builder<creator_studio_feed_inspiration_v1_request, C1C6O> {
    public Integer LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final creator_studio_feed_inspiration_v1_request build() {
        return new creator_studio_feed_inspiration_v1_request(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
