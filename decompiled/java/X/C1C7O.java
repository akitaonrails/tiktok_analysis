package X;

import com.bytedance.scalpel.protos.AttributionCustomInfo;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C7O, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C7O extends Message.Builder<AttributionCustomInfo, C1C7O> {
    public String LIZLLL;
    public List<AttributionCustomInfo.CustomItemInfo> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AttributionCustomInfo build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new AttributionCustomInfo(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "eventType");
        throw null;
    }
}
