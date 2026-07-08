package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.creator_studio_feed_inspiration_v1.proto.InspirationLogPbStructV1;

/* JADX INFO: renamed from: X.1CET, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CET extends Message.Builder<InspirationLogPbStructV1, C1CET> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final InspirationLogPbStructV1 build() {
        return new InspirationLogPbStructV1(this.LIZLLL, buildUnknownFields());
    }
}
