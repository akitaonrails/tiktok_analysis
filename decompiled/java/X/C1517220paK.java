package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTable;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTableColumn;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTableIndex;
import java.util.List;

/* JADX INFO: renamed from: X.0paK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517220paK extends Message.Builder<CaiFeatureTTMTable, C1517220paK> {
    public List<CaiFeatureTTMTableColumn> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<CaiFeatureTTMTableIndex> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiFeatureTTMTable build() {
        return new CaiFeatureTTMTable(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
