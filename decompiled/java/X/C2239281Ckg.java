package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTTMCompileDiagnostic;

/* JADX INFO: renamed from: X.1Ckg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239281Ckg extends Message.Builder<CaiTTMCompileDiagnostic.RangeDiscriptor, C2239281Ckg> {
    public Integer LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiTTMCompileDiagnostic.RangeDiscriptor build() {
        Integer num = this.LIZLLL;
        if (num != null && this.LJ != null) {
            return new CaiTTMCompileDiagnostic.RangeDiscriptor(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "line", this.LJ, "character");
        throw null;
    }
}
