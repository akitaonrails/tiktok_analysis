package X;

import com.bytedance.scalpel.protos.AttributionCustomInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C7Q, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C7Q extends Message.Builder<AttributionCustomInfo.CustomItemInfo, C1C7Q> {
    public String LIZLLL;
    public Double LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AttributionCustomInfo.CustomItemInfo build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new AttributionCustomInfo.CustomItemInfo(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "name", this.LJ, "value");
        throw null;
    }
}
