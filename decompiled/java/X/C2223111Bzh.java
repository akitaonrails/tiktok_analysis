package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionEmitEventToGlobalStream;

/* JADX INFO: renamed from: X.1Bzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223111Bzh extends Message.Builder<CaiActionEmitEventToGlobalStream, C2223111Bzh> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiActionEmitEventToGlobalStream build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new CaiActionEmitEventToGlobalStream(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "event_type_name");
        throw null;
    }
}
