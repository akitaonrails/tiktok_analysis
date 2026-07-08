package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTableColumn;

/* JADX INFO: renamed from: X.0paO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517260paO extends Message.Builder<CaiFeatureTTMTableColumn, C1517260paO> {
    public String LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiFeatureTTMTableColumn build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new CaiFeatureTTMTableColumn(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "name", this.LJ, "column_type");
        throw null;
    }
}
