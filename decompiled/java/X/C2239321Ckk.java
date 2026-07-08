package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTTMCompileDiagnostic;

/* JADX INFO: renamed from: X.1Ckk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239321Ckk extends Message.Builder<CaiTTMCompileDiagnostic, C2239321Ckk> {
    public Integer LIZLLL;
    public CaiTTMCompileDiagnostic.Range LJ;
    public String LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiTTMCompileDiagnostic build() {
        return new CaiTTMCompileDiagnostic(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
