package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiModelRawInput;

/* JADX INFO: renamed from: X.1CDP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDP extends Message.Builder<CaiModelRawInput, C1CDP> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiModelRawInput build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new CaiModelRawInput(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "biz_id");
        throw null;
    }
}
