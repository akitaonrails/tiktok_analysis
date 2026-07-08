package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEvent;

/* JADX INFO: renamed from: X.0paE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517160paE extends Message.Builder<CaiFeatureTTMEvent.relativeField, C1517160paE> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiFeatureTTMEvent.relativeField build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new CaiFeatureTTMEvent.relativeField(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "field", this.LJ, "type");
        throw null;
    }
}
