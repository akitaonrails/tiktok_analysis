package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiProducer;

/* JADX INFO: renamed from: X.1Chu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237561Chu extends Message.Builder<CaiProducer, C2237561Chu> {
    public String LIZLLL;
    public CaiManager LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiProducer build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new CaiProducer(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "name");
        throw null;
    }
}
