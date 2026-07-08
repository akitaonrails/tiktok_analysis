package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureReq;

/* JADX INFO: renamed from: X.1CG1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CG1 extends Message.Builder<CaiFeatureReq, C1CG1> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiFeatureReq build() {
        return new CaiFeatureReq(this.LIZLLL, buildUnknownFields());
    }
}
