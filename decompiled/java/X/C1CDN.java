package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiModelRawContent;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiRawContent;

/* JADX INFO: renamed from: X.1CDN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDN extends Message.Builder<CaiRawContent, C1CDN> {
    public CaiModelRawContent LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiRawContent build() {
        return new CaiRawContent(this.LIZLLL, buildUnknownFields());
    }
}
