package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStreamOperation;
import java.util.List;

/* JADX INFO: renamed from: X.0pbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518010pbb extends Message.Builder<CaiEventStream, C1518010pbb> {
    public String LIZLLL;
    public List<CaiStreamOperation> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiEventStream build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new CaiEventStream(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "key");
        throw null;
    }
}
