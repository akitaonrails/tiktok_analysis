package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiModelRawContent;

/* JADX INFO: renamed from: X.1CDL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDL extends Message.Builder<CaiModelRawContent, C1CDL> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiModelRawContent build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new CaiModelRawContent(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "biz_id");
        throw null;
    }
}
