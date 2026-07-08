package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTableIndex;
import java.util.List;

/* JADX INFO: renamed from: X.0paM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517240paM extends Message.Builder<CaiFeatureTTMTableIndex, C1517240paM> {
    public String LIZLLL;
    public List<String> LJ = C1516540pZE.LJIIIIZZ();
    public Boolean LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiFeatureTTMTableIndex build() {
        String str = this.LIZLLL;
        if (str != null && this.LJFF != null) {
            return new CaiFeatureTTMTableIndex(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "name", this.LJFF, "unique");
        throw null;
    }
}
