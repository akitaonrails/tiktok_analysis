package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTTMCompileDiagnostic;

/* JADX INFO: renamed from: X.1Cki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239301Cki extends Message.Builder<CaiTTMCompileDiagnostic.Range, C2239301Cki> {
    public CaiTTMCompileDiagnostic.RangeDiscriptor LIZLLL;
    public CaiTTMCompileDiagnostic.RangeDiscriptor LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiTTMCompileDiagnostic.Range build() {
        CaiTTMCompileDiagnostic.RangeDiscriptor rangeDiscriptor = this.LIZLLL;
        if (rangeDiscriptor != null && this.LJ != null) {
            return new CaiTTMCompileDiagnostic.Range(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(rangeDiscriptor, "start", this.LJ, "end");
        throw null;
    }
}
