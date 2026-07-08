package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiModelRawInput;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiRawContent;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiRawInput;

/* JADX INFO: renamed from: X.1CDR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDR extends Message.Builder<CaiRawInput, C1CDR> {
    public String LIZLLL;
    public CaiModelRawInput LJ;
    public CaiRawContent LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiRawInput build() {
        return new CaiRawInput(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
