package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionEmitEventToAppLog;

/* JADX INFO: renamed from: X.1Bzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223091Bzf extends Message.Builder<CaiActionEmitEventToAppLog, C2223091Bzf> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiActionEmitEventToAppLog build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new CaiActionEmitEventToAppLog(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "event_type_name");
        throw null;
    }
}
