package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStreamOperation;

/* JADX INFO: renamed from: X.0pbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518040pbe extends Message.Builder<CaiStreamOperation, C1518040pbe> {
    public Integer LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiStreamOperation build() {
        Integer num = this.LIZLLL;
        if (num != null && this.LJ != null) {
            return new CaiStreamOperation(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "op", this.LJ, "param");
        throw null;
    }
}
